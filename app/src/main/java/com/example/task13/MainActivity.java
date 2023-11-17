package com.example.task13;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button comment;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = (EditText) findViewById(R.id.article);
        comment = (Button) findViewById(R.id.button);
        edittext.setEnabled(false);
        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(comment.getText().equals("ADD COMMENT")){
                    edittext.setEnabled(true);
                    comment.setText("Save Changes");
                } else if (comment.getText().equals("Save Changes")) {
                    edittext.setEnabled(false);
                    comment.setText("ADD COMMENT");

                }
            }
        });

    }

}