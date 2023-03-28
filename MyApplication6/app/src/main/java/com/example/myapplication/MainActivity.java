package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.content.ClipData;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private Button button;
    private TextView textView;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
    }

    public void onButtonClick(View view) {
        //увеличиваем переменную счетчик
        count++;
        textView.setText(Integer.toString(count));
    }

    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT);
        toast.show();
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT);
        toast.show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT);
        toast.show();
        super.onResume();


    }
    private String getRotateOrientation() {
        int rotate = getWindowManager().getDefaultDisplay().getRotation();
        switch (rotate) {
            case Surface.ROTATION_0:
                return"Не поворачивали" ;
            case Surface.ROTATION_90:
                return "Повернули на 90 градусов по часовой стрелке";
            case Surface.ROTATION_180:
                return "Повернули на 180 градусов";
            case Surface.ROTATION_270:
                return "Повернули на 90 градусов против часовой стрелки";
            default:
                return "Не понятно";
        }
 }
}


