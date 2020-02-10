package com.example.googlequery;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnq=findViewById(R.id.btn1);
        final EditText edm=findViewById(R.id.qwe);


        btnq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String q = edm.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
                intent.putExtra(SearchManager.QUERY, q);
                startActivity(intent);
            }
        });


    }
}
