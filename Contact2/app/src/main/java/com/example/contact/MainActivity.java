package com.example.contact;
//1rv18mca14
/*Contacts App with Phone and Mobile Number

        - contacts list without repetition

        - add extra fields like email, DoB and Fax

        - arrange the list of contacts in alphabetical order

        - do necessary validations

 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import java.util.LinkedHashSet;


public class MainActivity extends AppCompatActivity {


    ArrayList<String> alist=new ArrayList<>();
    ListView lv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContentResolver cr=getContentResolver();
        Cursor cur=getContentResolver().query(ContactsContract.Contacts.CONTENT_URI,
                null,"",
                null,"UPPER("+ContactsContract.Contacts.DISPLAY_NAME+")ASC");

        if(cur.getCount() > 0){
            while(cur.moveToNext()){
                String id = cur.getString(cur.getColumnIndex(ContactsContract.Contacts._ID));
                String name=cur.getString(cur.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                if (Integer.parseInt(cur.getString(
                        cur.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER))) > 0) {
                    Cursor pCur = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,
                            ContactsContract.CommonDataKinds.Phone.CONTACT_ID+" = ?",
                            new String[]{id},null);
                    while(pCur.moveToNext()){
                        String phoneNo = pCur.getString(pCur.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                        String email=pCur.getString(pCur.getColumnIndex(ContactsContract.CommonDataKinds.Email.DATA));

                        alist.add("Name: "+name+"\n Phone no.: "+phoneNo+"\n Email no:"+email);
                    }
                    pCur.close();
                }
            }
        }
        lv=(ListView)findViewById(R.id.list1);
        ArrayAdapter<String> adt=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alist);
        lv.setAdapter(adt);
    }
}
