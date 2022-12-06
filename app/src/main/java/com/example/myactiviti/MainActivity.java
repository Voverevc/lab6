package com.example.myactiviti;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCloseButtonClicke(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        AlertDialog.Builder builder1 = builder.setTitle("Выход из приложение")
                .setIcon(R.drawable.ic_baseline_close_24)
                .setMessage("Вы уверены,что хотите закрыть приложение?")
                .setCancelable(false)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        })
                .setNegativeButton("Отмена",
                new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        dialog.cancel();
                    }
                    });
        AlertDialog alert =builder.create();
        alert.show();
    }
}