package com.example.user.firebsetest;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by WennLAB on 2017/5/11.
 */
public class UserInformation extends AppCompatActivity {
    public String name;
    public String position;
    public UserInformation(){}
    public UserInformation(String name, String position) {
        this.name=name;
        this.position=position;
    }
}
