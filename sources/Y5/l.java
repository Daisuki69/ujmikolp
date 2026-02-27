package y5;

import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends q {
    public E5.b m;

    public final void V1(E5.a smsBroadcastReceiverListener) {
        kotlin.jvm.internal.j.g(smsBroadcastReceiverListener, "smsBroadcastReceiverListener");
        if (of.p.v(this)) {
            W1();
            E5.b bVar = new E5.b(smsBroadcastReceiverListener, 0);
            this.m = bVar;
            ContextCompat.registerReceiver(this, bVar, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), SmsRetriever.SEND_PERMISSION, null, 2);
        }
    }

    public void W1() {
        E5.b bVar = this.m;
        if (bVar != null) {
            try {
                ht2aO8.unregisterReceiver(this, bVar);
            } catch (IllegalArgumentException unused) {
                yk.a.b();
            }
        }
    }
}
