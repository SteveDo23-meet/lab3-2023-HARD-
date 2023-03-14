package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<User> userlist;
    UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.my_list_view);


        User user1 = new User("Steve" , "steveddonetz1@gmail.com", 123);
        User user2 = new User("Dani" , "steve@gmail.com", 1554);
        User user3 = new User("Moshe" , "stz1@gmail.com", 1234324);

        userlist = new ArrayList<User>();
        userlist.add(user1);userlist.add(user2);userlist.add(user3);

        userAdapter = new UserAdapter(this,0,0,userlist);

        lv.setAdapter(userAdapter);


    }
}