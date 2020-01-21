package com.noori.bbbp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void level(View view){
        ImageView level = (ImageView) view;
        int  ilevel = Integer.parseInt(level.getTag().toString());
        switch (ilevel){
            case 0:
                Intent intent = new Intent(this,);
                startActivity(intent);
             break;




        }



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



}