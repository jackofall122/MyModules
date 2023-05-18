package sg.edu.rp.c346.id21017005.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {

    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvDisplay = findViewById(R.id.tvDisplayInfo);

        // Receive the serialized intent
        Intent receivedIntent = getIntent();
        Module receivedModule = (Module) receivedIntent.getSerializableExtra("module");

        // Retrieve all the values from the module object that was sent
        String code = receivedModule.getCode();
        String name = receivedModule.getName();
        int year = receivedModule.getYear();
        int semester = receivedModule.getSemester();
        int credit = receivedModule.getCredit();
        String venue = receivedModule.getVenue();

        // print the values:
        String output = "Module Code: "+code+
                "\nModule Name: "+name+
                "\nModule Year: "+year+
                "\nSemester Taken: "+semester+
                "\nModule Credit: "+credit+
                "\nLecture Venue: "+venue;
        tvDisplay.setText(output);
    }
}