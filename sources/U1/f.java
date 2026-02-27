package U1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dOYHB6.yFtIp6.ht2aO8;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f5900b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5901a;

    public f(Context context) {
        this.f5901a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f5902k) {
            try {
                Iterator it = g.f5903l.values().iterator();
                while (it.hasNext()) {
                    ((g) it.next()).h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ht2aO8.unregisterReceiver(this.f5901a, this);
    }
}
