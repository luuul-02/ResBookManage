package com.example.resbookmanage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class ResSeatRegist extends AppCompatActivity {

    Button btn_seatAdd,btn_seatEdit;
    ImageView imgview_seatRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_seat_regist);
    }
}