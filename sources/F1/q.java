package F1;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f1534n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1536b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1538g;
    public final Intent h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f1540l;
    public h m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1537d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final m j = new m(this, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f1539k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public q(Context context, k kVar, Intent intent) {
        this.f1535a = context;
        this.f1536b = kVar;
        this.h = intent;
    }

    public static void b(q qVar, l lVar) {
        h hVar = qVar.m;
        ArrayList<l> arrayList = qVar.f1537d;
        k kVar = qVar.f1536b;
        if (hVar != null || qVar.f1538g) {
            if (!qVar.f1538g) {
                lVar.run();
                return;
            } else {
                kVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(lVar);
                return;
            }
        }
        kVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(lVar);
        p pVar = new p(qVar, 0);
        qVar.f1540l = pVar;
        qVar.f1538g = true;
        if (qVar.f1535a.bindService(qVar.h, pVar, 1)) {
            return;
        }
        kVar.c("Failed to bind to the service.", new Object[0]);
        qVar.f1538g = false;
        for (l lVar2 : arrayList) {
            zzy zzyVar = new zzy();
            TaskCompletionSource taskCompletionSource = lVar2.f1527a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzyVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f1534n;
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

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new n(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
