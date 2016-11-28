package com.example.java2.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.widget.Toast;

/**
 * Created by java2 on 11/28/2016.
 */

public class Receiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        int status=intent.getIntExtra(BatteryManager.EXTRA_STATUS,-1);
        int level=intent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1);
        int scale=intent.getIntExtra(BatteryManager.EXTRA_SCALE,-1);

        float batteryPCT=level/(float)scale;


        Toast.makeText(context, "status="+status+" level"+level+"scale "+scale, Toast.LENGTH_LONG).show();



    }


}
