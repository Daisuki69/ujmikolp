package E1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import dOYHB6.yFtIp6.ht2aO8;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F1.k f1226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f1227b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f1228d;
    public E5.b e;

    public d(Context context) {
        F1.k kVar = new F1.k("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f1228d = new HashSet();
        this.e = null;
        this.f1226a = kVar;
        this.f1227b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(Sb.a aVar) {
        this.f1226a.c("registerListener", new Object[0]);
        if (aVar == null) {
            throw new NullPointerException("Registered Play Core listener should not be null.");
        }
        this.f1228d.add(aVar);
        b();
    }

    public final void b() {
        E5.b bVar;
        HashSet hashSet = this.f1228d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!zIsEmpty && this.e == null) {
            E5.b bVar2 = new E5.b(1, this, false);
            this.e = bVar2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f1227b;
            if (i >= 33) {
                ht2aO8.registerReceiver(context, bVar2, intentFilter, 2);
            } else {
                ht2aO8.registerReceiver(context, bVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (bVar = this.e) == null) {
            return;
        }
        ht2aO8.unregisterReceiver(context, bVar);
        this.e = null;
    }
}
