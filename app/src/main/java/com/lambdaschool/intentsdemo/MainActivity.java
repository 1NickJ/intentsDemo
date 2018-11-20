package com.lambdaschool.intentsdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private EditText textEntry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        textEntry = findViewById(R.id.editText);
        //code associated with the textEntry

        findViewById(R.id.button_start_intent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredText = textEntry.getText().toString();

                Intent intent = new Intent(context, FullscreenActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT,enteredText);
                intent.setAction(Intent.ACTION_SEND);
                intent.setType(context.getResources().getString(R.string.plain_text_type));
                startActivity(intent);
            }
        });
    }
}
