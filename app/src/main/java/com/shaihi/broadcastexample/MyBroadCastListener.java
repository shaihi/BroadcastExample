package com.shaihi.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCastListener extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int level = intent.getIntExtra("level", -1);
        int scale = intent.getIntExtra("scale", -1);
        int batteryPct = (int) ((level / (float) scale) * 100);

        Toast.makeText(context, "Battery level: " + batteryPct + "%", Toast.LENGTH_LONG).show();
    }
}
