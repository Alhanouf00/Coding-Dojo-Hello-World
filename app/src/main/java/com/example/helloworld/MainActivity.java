package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare String message

        String message = "Welcome to my first Java program";
        //Print parts of message
        System.out.println(message.substring(0, 7) + " " + message.substring(11, 13) + " " + message.substring(20, 24));


        //Bonuse : Remove Vowel letter
        for (int i = 0; i < message.length(); i++)
        {


            message= message.replace('a',' ');
            message=message.replace('e',' ');
            message=message.replace('o',' ');
            message=message.replace('u',' ');
            message=message.replace('i',' ');



        }
        System.out.println(message);





    }
}