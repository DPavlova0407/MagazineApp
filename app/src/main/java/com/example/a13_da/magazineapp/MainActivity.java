package com.example.a13_da.magazineapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private User user = User.getInstance();
    private EditText login;
    private EditText password;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUser();

        login = findViewById(R.id.login_login);
        password = findViewById(R.id.login_password);

        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
                //проверить логин пароль
                if (login.getText().toString().equals(user.getLogin()) && password.getText().toString().equals(user.getPassword())) {
                    Intent intent = new Intent(MainActivity.this, MagazineListActivity.class);
                    startActivity(intent);
                } else {
                    error = findViewById(R.id.login_error);
                    error.setText("Неверный логин или пароль");
                }
            }
        });
    }
    private void initUser(){
        user.setUser("Log", "000", "Имя текущего пользователя");
    }
}
