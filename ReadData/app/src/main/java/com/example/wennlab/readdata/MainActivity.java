package com.example.wennlab.readdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private TextView ValueView;
    private Firebase myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRef=new Firebase("https://maindata-de580.firebaseio.com/Name");
        ValueView = (TextView) findViewById(R.id.Velueview);

       myRef.addValueEventListener(new com.firebase.client.ValueEventListener() {
           @Override
           public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
               String value = dataSnapshot.getValue(String.class);
               ValueView.setText(value);
           }

           @Override
           public void onCancelled(FirebaseError firebaseError) {

           }
       });
    }
}
