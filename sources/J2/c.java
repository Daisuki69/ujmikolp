package J2;

import T2.h;
import U2.A;
import U2.i;
import U2.w;
import U2.x;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final M2.a f2392r = M2.a.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile c f2393s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f2394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2395b;
    public final WeakHashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f2396d;
    public final HashMap e;
    public final HashSet f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f2397g;
    public final AtomicInteger h;
    public final S2.f i;
    public final K2.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final M2.b f2398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2399l;
    public Timer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Timer f2400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f2401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2403q;

    public c(S2.f fVar, M2.b bVar) {
        K2.a aVarE = K2.a.e();
        M2.a aVar = f.e;
        this.f2394a = new WeakHashMap();
        this.f2395b = new WeakHashMap();
        this.c = new WeakHashMap();
        this.f2396d = new WeakHashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.f2397g = new HashSet();
        this.h = new AtomicInteger(0);
        this.f2401o = i.BACKGROUND;
        this.f2402p = false;
        this.f2403q = true;
        this.i = fVar;
        this.f2398k = bVar;
        this.j = aVarE;
        this.f2399l = true;
    }

    public static c a() {
        if (f2393s == null) {
            synchronized (c.class) {
                try {
                    if (f2393s == null) {
                        f2393s = new c(S2.f.f5648s, new M2.b(15));
                    }
                } finally {
                }
            }
        }
        return f2393s;
    }

    public final void b(String str) {
        synchronized (this.e) {
            try {
                Long l6 = (Long) this.e.get(str);
                if (l6 == null) {
                    this.e.put(str, 1L);
                } else {
                    this.e.put(str, Long.valueOf(l6.longValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(I2.d dVar) {
        synchronized (this.f2397g) {
            this.f2397g.add(dVar);
        }
    }

    public final void d(WeakReference weakReference) {
        synchronized (this.f) {
            this.f.add(weakReference);
        }
    }

    public final void e() {
        synchronized (this.f2397g) {
            try {
                Iterator it = this.f2397g.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()) != null) {
                        try {
                            M2.a aVar = I2.c.f2204b;
                        } catch (IllegalStateException e) {
                            I2.d.f2206a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(Activity activity) {
        T2.d dVar;
        WeakHashMap weakHashMap = this.f2396d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        f fVar = (f) this.f2395b.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = fVar.f2408b;
        boolean z4 = fVar.f2409d;
        M2.a aVar = f.e;
        if (z4) {
            HashMap map = fVar.c;
            if (!map.isEmpty()) {
                aVar.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            T2.d dVarA = fVar.a();
            try {
                frameMetricsAggregator.remove(fVar.f2407a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                aVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                dVarA = new T2.d();
            }
            frameMetricsAggregator.reset();
            fVar.f2409d = false;
            dVar = dVarA;
        } else {
            aVar.a("Cannot stop because no recording was started");
            dVar = new T2.d();
        }
        if (!dVar.b()) {
            f2392r.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            h.a(trace, (N2.c) dVar.a());
            trace.stop();
        }
    }

    public final void g(String str, Timer timer, Timer timer2) {
        if (this.j.t()) {
            x xVarL = A.L();
            xVarL.n(str);
            xVarL.l(timer.f9858a);
            xVarL.m(timer.b(timer2));
            w wVarA = SessionManager.getInstance().perfSession().a();
            xVarL.i();
            A.x((A) xVarL.f10116b, wVarA);
            int andSet = this.h.getAndSet(0);
            synchronized (this.e) {
                try {
                    HashMap map = this.e;
                    xVarL.i();
                    A.t((A) xVarL.f10116b).putAll(map);
                    if (andSet != 0) {
                        xVarL.k(andSet, "_tsns");
                    }
                    this.e.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.i.c((A) xVarL.g(), i.FOREGROUND_BACKGROUND);
        }
    }

    public final void h(Activity activity) {
        if (this.f2399l && this.j.t()) {
            f fVar = new f(activity);
            this.f2395b.put(activity, fVar);
            if (activity instanceof FragmentActivity) {
                e eVar = new e(this.f2398k, this.i, this, fVar);
                this.c.put(activity, eVar);
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(eVar, true);
            }
        }
    }

    public final void i(i iVar) {
        this.f2401o = iVar;
        synchronized (this.f) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f2401o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2395b.remove(activity);
        WeakHashMap weakHashMap = this.c;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks((FragmentManager.FragmentLifecycleCallbacks) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f2394a.isEmpty()) {
                this.f2398k.getClass();
                this.m = new Timer();
                this.f2394a.put(activity, Boolean.TRUE);
                if (this.f2403q) {
                    i(i.FOREGROUND);
                    e();
                    this.f2403q = false;
                } else {
                    g("_bs", this.f2400n, this.m);
                    i(i.FOREGROUND);
                }
            } else {
                this.f2394a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.f2399l && this.j.t()) {
                if (!this.f2395b.containsKey(activity)) {
                    h(activity);
                }
                f fVar = (f) this.f2395b.get(activity);
                boolean z4 = fVar.f2409d;
                Activity activity2 = fVar.f2407a;
                if (z4) {
                    f.e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    fVar.f2408b.add(activity2);
                    fVar.f2409d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.i, this.f2398k, this);
                trace.start();
                this.f2396d.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f2399l) {
                f(activity);
            }
            if (this.f2394a.containsKey(activity)) {
                this.f2394a.remove(activity);
                if (this.f2394a.isEmpty()) {
                    this.f2398k.getClass();
                    Timer timer = new Timer();
                    this.f2400n = timer;
                    g("_fs", this.m, timer);
                    i(i.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
