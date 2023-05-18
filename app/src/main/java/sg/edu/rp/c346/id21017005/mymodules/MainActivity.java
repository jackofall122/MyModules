package sg.edu.rp.c346.id21017005.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnAndroid;
    Button btnUi;
    Button btnOOP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAndroid=findViewById(R.id.btnAndroid);
        btnUi = findViewById(R.id.btnUI);
        btnOOP = findViewById(R.id.btnOOP);

        // create the arraylist and module objects
        ArrayList<Module> moduleList = new ArrayList<>();
        Module c346 = new Module("C346","Android Programming", 2023, 1, 4, "E63A" );
        Module c218 = new Module("C218", "UI/UX Design", 2023,1,4,"W64D");
        Module c208 = new Module("C208", "Object-Oriented Programming", 2022, 1, 4, "W65A");
        // store values into arraylist
        moduleList.add(c346);
        moduleList.add(c218);
        moduleList.add(c208);
        // create intent for C346
        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                Module moduleToSend = moduleList.get(0);
                intent.putExtra("module",moduleToSend);
                startActivity(intent);
            }
        });
        // create intent for C218
        btnUi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                Module moduleToSend = moduleList.get(1);
                intent.putExtra("module",moduleToSend);
                startActivity(intent);
            }
        });
        // create intent for C208
        btnOOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                Module moduleToSend = moduleList.get(2);
                intent.putExtra("module",moduleToSend);
                startActivity(intent);
            }
        });
    }

}