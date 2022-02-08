package com.abhishekchoksi.checkboxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chechButtonClick(View view){
        boolean isChecked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.chkPlaying:
                if(isChecked) {
                    Toast.makeText(this, "Playing is Checked.", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(this, "Playing is Uncheckd.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chkSinging:
                if(isChecked){
                    Toast.makeText(this, "Singing is Checked.", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(this, "Singing is Unchecked.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chkLearning:
                if(isChecked){
                    Toast.makeText(this, "Learning is Checked.", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(this, "Learning is Unchecked.", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}