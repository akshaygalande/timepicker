package admin.comlab.com.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    Integer hour,min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker=findViewById(R.id.timePicker);
    }
    public void showtime(int hour,int min){
        Toast.makeText(getApplicationContext(),"Hour-"+hour+" Minutes-"+min,Toast.LENGTH_SHORT).show();

    }
    public void show(View view) {
        int hour=timePicker.getCurrentHour();
        int min=timePicker.getCurrentMinute();

        showtime(hour,min);
    }
}
