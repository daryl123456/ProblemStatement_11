package sg.edu.rp.c346.id19042545.problemstatement11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    Button btnAdd, btnCancel;
    EditText etName, etDesc, etSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        btnAdd = findViewById(R.id.btnAdd2);
        btnCancel = findViewById(R.id.btnCancel);
        etName = findViewById(R.id.etName);
        etDesc = findViewById(R.id.etDesc);
        etSec = findViewById(R.id.etSec);

        DBHelper db = new DBHelper(AddActivity.this);

        String name = String.valueOf(etName.getText());
        String desc = String.valueOf(etDesc.getText());
        String sec = String.valueOf(etSec.getText());



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.insertTask(name, desc, sec);
                db.close();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(AddActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}