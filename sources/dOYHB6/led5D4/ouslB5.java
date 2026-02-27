package dOYHB6.led5D4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes6.dex */
public class ouslB5 extends BroadcastReceiver {
    public static void dbVPJ7(Context context) {
        int i = Build.VERSION.SDK_INT;
        String strTnTj78 = numX49.tnTj78("bHnP");
        if (i >= 33) {
            context.getApplicationContext().registerReceiver(new ouslB5(), new IntentFilter(fChUQ4.bWRSE4(strTnTj78)), ht2aO8.szBXG1(), null, 4);
        } else {
            context.getApplicationContext().registerReceiver(new ouslB5(), new IntentFilter(fChUQ4.bWRSE4(strTnTj78)), ht2aO8.szBXG1(), null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals(fChUQ4.bWRSE4(numX49.tnTj78("bHnb")))) {
            return;
        }
        String strTnTj78 = numX49.tnTj78("bHn2");
        if (intent.hasExtra(strTnTj78)) {
            fChUQ4.d6UIW5(intent.getStringExtra(strTnTj78));
        } else {
            fChUQ4.d6UIW5(numX49.tnTj78("bHnL"));
        }
    }
}
