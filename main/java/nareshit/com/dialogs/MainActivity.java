package nareshit.com.dialogs;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alert(View v) {
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle("Alert");
        adb.setMessage("This is Message");
        adb.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Positive is clicked", Toast.LENGTH_LONG).show();
            }
        });

        adb.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Negative is clicked", Toast.LENGTH_LONG).show();
            }
        });

        adb.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Neutral is clicked", Toast.LENGTH_LONG).show();
            }
        });

        adb.show();
    }

    public void datePicker(View v) {
        DatePickerDialog dp = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String selectedDate = year + "-" + (month + 1) + "-" + dayOfMonth;
                Toast.makeText(MainActivity.this, selectedDate, Toast.LENGTH_LONG).show();
            }
        }, 2015, 11, 24);
        dp.show();
    }

    public void timePicker(View v) {
        TimePickerDialog tp = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, hourOfDay + ":" + minute, Toast.LENGTH_SHORT).show();
            }
        }, 12, 24, false);

        tp.show();
    }

    public void progress(View v) {
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Progress Title");
        pd.setMessage("Please wait");
        pd.show();
    }
}
