package y1;

import O1.U;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.z;
import dOYHB6.yFtIp6.ht2aO8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: y1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2496a extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C2496a f21035d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21037b;
    public final Object c;

    public C2496a(z zVar, z zVar2) {
        this.f21036a = 1;
        this.c = zVar;
        this.f21037b = zVar2;
    }

    private final synchronized void a(Context context, Intent intent) {
        try {
            z zVar = (z) this.f21037b;
            if (zVar == null) {
                return;
            }
            if (zVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                z zVar2 = (z) this.f21037b;
                zVar2.f9827d.f.schedule(zVar2, 0L, TimeUnit.SECONDS);
                ht2aO8.unregisterReceiver(context, this);
                this.f21037b = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void b(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        e();
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            C2497b c2497b = (C2497b) ((WeakReference) ((ArrayList) this.c).get(i)).get();
            if (c2497b != null) {
                f(c2497b);
            }
        }
    }

    public static void f(C2497b c2497b) {
        U u3 = C2497b.i;
        synchronized (c2497b) {
            Context context = c2497b.f21041a;
            int iC = context == null ? 0 : AbstractC2550e.c(context);
            if (c2497b.f == iC) {
                return;
            }
            c2497b.f = iC;
            if (iC != 1 && iC != 0 && iC != 8) {
                c2497b.f21044g = c2497b.a(iC);
                c2497b.e.getClass();
                SystemClock.elapsedRealtime();
                long j = c2497b.f21044g;
                if (j != c2497b.h) {
                    c2497b.h = j;
                    Iterator it = ((CopyOnWriteArrayList) c2497b.c.f19074b).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                c2497b.f21043d.f18173a.clear();
            }
        }
    }

    public synchronized void c(C2497b c2497b) {
        e();
        ((ArrayList) this.c).add(new WeakReference(c2497b));
        ((Handler) this.f21037b).post(new io.flutter.plugins.firebase.core.a(19, this, c2497b));
    }

    public void d() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        z zVar = (z) this.c;
        ht2aO8.registerReceiver(zVar.f9825a, this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C2497b) ((WeakReference) arrayList.get(size)).get()) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        switch (this.f21036a) {
            case 0:
                b(context, intent);
                break;
            default:
                a(context, intent);
                break;
        }
    }

    public C2496a() {
        this.f21036a = 0;
        this.f21037b = new Handler(Looper.getMainLooper());
        this.c = new ArrayList();
    }
}
