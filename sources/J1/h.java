package J1;

import F1.m;
import F1.p;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f2384n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2386b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2388g;
    public final Intent h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f2390l;
    public d m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2387d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final m j = new m(this, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f2389k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public h(Context context, e eVar, Intent intent) {
        this.f2385a = context;
        this.f2386b = eVar;
        this.h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f2384n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
                }
                this.e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
