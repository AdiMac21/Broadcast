package com.example.java2.broadcast;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
    private EditText editText;
    private int REQUEST_CODE=043;
    private String milis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button);
        editText= (EditText) findViewById(R.id.editText2);
        IntentFilter intentFilter=new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(null,intentFilter);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
//                milis=editText.getText().toString();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,Receiver.class);
//                PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this.getApplicationContext(),REQUEST_CODE,intent,0);
//                AlarmManager alarmManager= (AlarmManager) getSystemService(ALARM_SERVICE);
//                alarmManager.set(AlarmManager.RTC_WAKEUP,(System.currentTimeMillis()+Integer.parseInt(editText.getText().toString())),pendingIntent);
//                Toast.makeText(MainActivity.this,"Alarm set in "+editText.getText().toString()+" milisecs",Toast.LENGTH_LONG).show();
                Intent i =new Intent(AlarmClock.ACTION_SET_ALARM);
                i.putExtra(AlarmClock.EXTRA_MESSAGE,"super alarm");
                i.putExtra(AlarmClock.EXTRA_HOUR,10);
                i.putExtra(AlarmClock.EXTRA_MINUTES,30);
                startActivity(i);
            }
        });
    }
}
