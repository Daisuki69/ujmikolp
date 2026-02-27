package com.google.firebase.perf.metrics;

import K2.a;
import N2.b;
import S2.f;
import Sc.c;
import T2.e;
import U1.g;
import U2.A;
import U2.i;
import U2.w;
import U2.x;
import We.s;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.dynatrace.android.agent.Global;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static volatile AppStartTrace f9828B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static ThreadPoolExecutor f9829K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Timer f9830w = new Timer();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f9831x = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f9832y = TimeUnit.MILLISECONDS.toMicros(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f9834b;
    public final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f9835d;
    public Application e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Timer f9836g;
    public final Timer h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PerfSession f9843r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9833a = false;
    public boolean f = false;
    public Timer i = null;
    public Timer j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Timer f9837k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f9838l = null;
    public Timer m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Timer f9839n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Timer f9840o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Timer f9841p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Timer f9842q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9844s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9845t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f9846u = new b(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9847v = false;

    public AppStartTrace(f fVar, M2.b bVar, a aVar, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer;
        Timer timer2 = null;
        this.f9834b = fVar;
        this.c = aVar;
        f9829K = threadPoolExecutor;
        x xVarL = A.L();
        xVarL.n("_experiment_app_start_ttid");
        this.f9835d = xVarL;
        if (Build.VERSION.SDK_INT >= 24) {
            long startElapsedRealtime = Process.getStartElapsedRealtime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(startElapsedRealtime);
            timer = new Timer((micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        } else {
            timer = null;
        }
        this.f9836g = timer;
        U1.a aVar2 = (U1.a) g.e().c(U1.a.class);
        if (aVar2 != null) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros2 = timeUnit2.toMicros(aVar2.f5893b);
            timer2 = new Timer((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit2.toMicros(System.currentTimeMillis()), micros2);
        }
        this.h = timer2;
    }

    public static AppStartTrace b() {
        if (f9828B != null) {
            return f9828B;
        }
        f fVar = f.f5648s;
        M2.b bVar = new M2.b(15);
        if (f9828B == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f9828B == null) {
                        f9828B = new AppStartTrace(fVar, bVar, a.e(), new ThreadPoolExecutor(0, 1, 10 + f9831x, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f9828B;
    }

    public static boolean d(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strI = s.i(packageName, Global.COLON);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strI))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final Timer a() {
        Timer timer = this.h;
        return timer != null ? timer : f9830w;
    }

    public final Timer c() {
        Timer timer = this.f9836g;
        return timer != null ? timer : a();
    }

    public final void e(x xVar) {
        if (this.f9840o == null || this.f9841p == null || this.f9842q == null) {
            return;
        }
        f9829K.execute(new B5.g(10, this, xVar));
        g();
    }

    public final synchronized void f(Context context) {
        if (this.f9833a) {
            return;
        }
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f9847v = this.f9847v || d((Application) applicationContext);
            this.f9833a = true;
            this.e = (Application) applicationContext;
        }
    }

    public final synchronized void g() {
        if (this.f9833a) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
            this.e.unregisterActivityLifecycleCallbacks(this);
            this.f9833a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Timer timer = this.j;
            if (timer != null) {
                if (Build.VERSION.SDK_INT < 34 || timer.a() > f9832y) {
                    this.f9844s = true;
                }
                this.j = null;
            }
            if (!this.f9844s && this.i == null) {
                this.f9847v = this.f9847v || d(this.e);
                new WeakReference(activity);
                this.i = new Timer();
                if (c().b(this.i) > f9831x) {
                    this.f = true;
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f9844s || this.f || !this.c.f() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f9846u);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [N2.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [N2.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [N2.a] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f9844s && !this.f) {
                boolean zF = this.c.f();
                if (zF && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f9846u);
                    final int i = 0;
                    T2.b bVar = new T2.b(viewFindViewById, new Runnable(this) { // from class: N2.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f3512b;

                        {
                            this.f3512b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.f3512b;
                            switch (i) {
                                case 0:
                                    if (appStartTrace.f9842q == null) {
                                        appStartTrace.f9842q = new Timer();
                                        x xVarL = A.L();
                                        xVarL.n("_experiment_onDrawFoQ");
                                        xVarL.l(appStartTrace.c().f9858a);
                                        xVarL.m(appStartTrace.c().b(appStartTrace.f9842q));
                                        A a8 = (A) xVarL.g();
                                        x xVar = appStartTrace.f9835d;
                                        xVar.j(a8);
                                        if (appStartTrace.f9836g != null) {
                                            x xVarL2 = A.L();
                                            xVarL2.n("_experiment_procStart_to_classLoad");
                                            xVarL2.l(appStartTrace.c().f9858a);
                                            xVarL2.m(appStartTrace.c().b(appStartTrace.a()));
                                            xVar.j((A) xVarL2.g());
                                        }
                                        String str = appStartTrace.f9847v ? "true" : "false";
                                        xVar.i();
                                        A.w((A) xVar.f10116b).put("systemDeterminedForeground", str);
                                        xVar.k(appStartTrace.f9845t, "onDrawCount");
                                        w wVarA = appStartTrace.f9843r.a();
                                        xVar.i();
                                        A.x((A) xVar.f10116b, wVarA);
                                        appStartTrace.e(xVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (appStartTrace.f9840o == null) {
                                        appStartTrace.f9840o = new Timer();
                                        long j = appStartTrace.c().f9858a;
                                        x xVar2 = appStartTrace.f9835d;
                                        xVar2.l(j);
                                        xVar2.m(appStartTrace.c().b(appStartTrace.f9840o));
                                        appStartTrace.e(xVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (appStartTrace.f9841p == null) {
                                        appStartTrace.f9841p = new Timer();
                                        x xVarL3 = A.L();
                                        xVarL3.n("_experiment_preDrawFoQ");
                                        xVarL3.l(appStartTrace.c().f9858a);
                                        xVarL3.m(appStartTrace.c().b(appStartTrace.f9841p));
                                        A a10 = (A) xVarL3.g();
                                        x xVar3 = appStartTrace.f9835d;
                                        xVar3.j(a10);
                                        appStartTrace.e(xVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.f9830w;
                                    x xVarL4 = A.L();
                                    xVarL4.n("_as");
                                    xVarL4.l(appStartTrace.a().f9858a);
                                    xVarL4.m(appStartTrace.a().b(appStartTrace.f9838l));
                                    ArrayList arrayList = new ArrayList(3);
                                    x xVarL5 = A.L();
                                    xVarL5.n("_astui");
                                    xVarL5.l(appStartTrace.a().f9858a);
                                    xVarL5.m(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((A) xVarL5.g());
                                    if (appStartTrace.f9837k != null) {
                                        x xVarL6 = A.L();
                                        xVarL6.n("_astfd");
                                        xVarL6.l(appStartTrace.i.f9858a);
                                        xVarL6.m(appStartTrace.i.b(appStartTrace.f9837k));
                                        arrayList.add((A) xVarL6.g());
                                        x xVarL7 = A.L();
                                        xVarL7.n("_asti");
                                        xVarL7.l(appStartTrace.f9837k.f9858a);
                                        xVarL7.m(appStartTrace.f9837k.b(appStartTrace.f9838l));
                                        arrayList.add((A) xVarL7.g());
                                    }
                                    xVarL4.i();
                                    A.v((A) xVarL4.f10116b, arrayList);
                                    w wVarA2 = appStartTrace.f9843r.a();
                                    xVarL4.i();
                                    A.x((A) xVarL4.f10116b, wVarA2);
                                    appStartTrace.f9834b.c((A) xVarL4.g(), i.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    });
                    if (Build.VERSION.SDK_INT >= 26 || (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow())) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(bVar);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new c(bVar, 1));
                    }
                    final int i4 = 1;
                    final int i6 = 2;
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new e(viewFindViewById, new Runnable(this) { // from class: N2.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f3512b;

                        {
                            this.f3512b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.f3512b;
                            switch (i4) {
                                case 0:
                                    if (appStartTrace.f9842q == null) {
                                        appStartTrace.f9842q = new Timer();
                                        x xVarL = A.L();
                                        xVarL.n("_experiment_onDrawFoQ");
                                        xVarL.l(appStartTrace.c().f9858a);
                                        xVarL.m(appStartTrace.c().b(appStartTrace.f9842q));
                                        A a8 = (A) xVarL.g();
                                        x xVar = appStartTrace.f9835d;
                                        xVar.j(a8);
                                        if (appStartTrace.f9836g != null) {
                                            x xVarL2 = A.L();
                                            xVarL2.n("_experiment_procStart_to_classLoad");
                                            xVarL2.l(appStartTrace.c().f9858a);
                                            xVarL2.m(appStartTrace.c().b(appStartTrace.a()));
                                            xVar.j((A) xVarL2.g());
                                        }
                                        String str = appStartTrace.f9847v ? "true" : "false";
                                        xVar.i();
                                        A.w((A) xVar.f10116b).put("systemDeterminedForeground", str);
                                        xVar.k(appStartTrace.f9845t, "onDrawCount");
                                        w wVarA = appStartTrace.f9843r.a();
                                        xVar.i();
                                        A.x((A) xVar.f10116b, wVarA);
                                        appStartTrace.e(xVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (appStartTrace.f9840o == null) {
                                        appStartTrace.f9840o = new Timer();
                                        long j = appStartTrace.c().f9858a;
                                        x xVar2 = appStartTrace.f9835d;
                                        xVar2.l(j);
                                        xVar2.m(appStartTrace.c().b(appStartTrace.f9840o));
                                        appStartTrace.e(xVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (appStartTrace.f9841p == null) {
                                        appStartTrace.f9841p = new Timer();
                                        x xVarL3 = A.L();
                                        xVarL3.n("_experiment_preDrawFoQ");
                                        xVarL3.l(appStartTrace.c().f9858a);
                                        xVarL3.m(appStartTrace.c().b(appStartTrace.f9841p));
                                        A a10 = (A) xVarL3.g();
                                        x xVar3 = appStartTrace.f9835d;
                                        xVar3.j(a10);
                                        appStartTrace.e(xVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.f9830w;
                                    x xVarL4 = A.L();
                                    xVarL4.n("_as");
                                    xVarL4.l(appStartTrace.a().f9858a);
                                    xVarL4.m(appStartTrace.a().b(appStartTrace.f9838l));
                                    ArrayList arrayList = new ArrayList(3);
                                    x xVarL5 = A.L();
                                    xVarL5.n("_astui");
                                    xVarL5.l(appStartTrace.a().f9858a);
                                    xVarL5.m(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((A) xVarL5.g());
                                    if (appStartTrace.f9837k != null) {
                                        x xVarL6 = A.L();
                                        xVarL6.n("_astfd");
                                        xVarL6.l(appStartTrace.i.f9858a);
                                        xVarL6.m(appStartTrace.i.b(appStartTrace.f9837k));
                                        arrayList.add((A) xVarL6.g());
                                        x xVarL7 = A.L();
                                        xVarL7.n("_asti");
                                        xVarL7.l(appStartTrace.f9837k.f9858a);
                                        xVarL7.m(appStartTrace.f9837k.b(appStartTrace.f9838l));
                                        arrayList.add((A) xVarL7.g());
                                    }
                                    xVarL4.i();
                                    A.v((A) xVarL4.f10116b, arrayList);
                                    w wVarA2 = appStartTrace.f9843r.a();
                                    xVarL4.i();
                                    A.x((A) xVarL4.f10116b, wVarA2);
                                    appStartTrace.f9834b.c((A) xVarL4.g(), i.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: N2.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f3512b;

                        {
                            this.f3512b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.f3512b;
                            switch (i6) {
                                case 0:
                                    if (appStartTrace.f9842q == null) {
                                        appStartTrace.f9842q = new Timer();
                                        x xVarL = A.L();
                                        xVarL.n("_experiment_onDrawFoQ");
                                        xVarL.l(appStartTrace.c().f9858a);
                                        xVarL.m(appStartTrace.c().b(appStartTrace.f9842q));
                                        A a8 = (A) xVarL.g();
                                        x xVar = appStartTrace.f9835d;
                                        xVar.j(a8);
                                        if (appStartTrace.f9836g != null) {
                                            x xVarL2 = A.L();
                                            xVarL2.n("_experiment_procStart_to_classLoad");
                                            xVarL2.l(appStartTrace.c().f9858a);
                                            xVarL2.m(appStartTrace.c().b(appStartTrace.a()));
                                            xVar.j((A) xVarL2.g());
                                        }
                                        String str = appStartTrace.f9847v ? "true" : "false";
                                        xVar.i();
                                        A.w((A) xVar.f10116b).put("systemDeterminedForeground", str);
                                        xVar.k(appStartTrace.f9845t, "onDrawCount");
                                        w wVarA = appStartTrace.f9843r.a();
                                        xVar.i();
                                        A.x((A) xVar.f10116b, wVarA);
                                        appStartTrace.e(xVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (appStartTrace.f9840o == null) {
                                        appStartTrace.f9840o = new Timer();
                                        long j = appStartTrace.c().f9858a;
                                        x xVar2 = appStartTrace.f9835d;
                                        xVar2.l(j);
                                        xVar2.m(appStartTrace.c().b(appStartTrace.f9840o));
                                        appStartTrace.e(xVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (appStartTrace.f9841p == null) {
                                        appStartTrace.f9841p = new Timer();
                                        x xVarL3 = A.L();
                                        xVarL3.n("_experiment_preDrawFoQ");
                                        xVarL3.l(appStartTrace.c().f9858a);
                                        xVarL3.m(appStartTrace.c().b(appStartTrace.f9841p));
                                        A a10 = (A) xVarL3.g();
                                        x xVar3 = appStartTrace.f9835d;
                                        xVar3.j(a10);
                                        appStartTrace.e(xVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.f9830w;
                                    x xVarL4 = A.L();
                                    xVarL4.n("_as");
                                    xVarL4.l(appStartTrace.a().f9858a);
                                    xVarL4.m(appStartTrace.a().b(appStartTrace.f9838l));
                                    ArrayList arrayList = new ArrayList(3);
                                    x xVarL5 = A.L();
                                    xVarL5.n("_astui");
                                    xVarL5.l(appStartTrace.a().f9858a);
                                    xVarL5.m(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((A) xVarL5.g());
                                    if (appStartTrace.f9837k != null) {
                                        x xVarL6 = A.L();
                                        xVarL6.n("_astfd");
                                        xVarL6.l(appStartTrace.i.f9858a);
                                        xVarL6.m(appStartTrace.i.b(appStartTrace.f9837k));
                                        arrayList.add((A) xVarL6.g());
                                        x xVarL7 = A.L();
                                        xVarL7.n("_asti");
                                        xVarL7.l(appStartTrace.f9837k.f9858a);
                                        xVarL7.m(appStartTrace.f9837k.b(appStartTrace.f9838l));
                                        arrayList.add((A) xVarL7.g());
                                    }
                                    xVarL4.i();
                                    A.v((A) xVarL4.f10116b, arrayList);
                                    w wVarA2 = appStartTrace.f9843r.a();
                                    xVarL4.i();
                                    A.x((A) xVarL4.f10116b, wVarA2);
                                    appStartTrace.f9834b.c((A) xVarL4.g(), i.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                }
                if (this.f9838l != null) {
                    return;
                }
                new WeakReference(activity);
                this.f9838l = new Timer();
                this.f9843r = SessionManager.getInstance().perfSession();
                M2.a.d().a("onResume(): " + activity.getClass().getName() + ": " + a().b(this.f9838l) + " microseconds");
                final int i10 = 3;
                f9829K.execute(new Runnable(this) { // from class: N2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f3512b;

                    {
                        this.f3512b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace appStartTrace = this.f3512b;
                        switch (i10) {
                            case 0:
                                if (appStartTrace.f9842q == null) {
                                    appStartTrace.f9842q = new Timer();
                                    x xVarL = A.L();
                                    xVarL.n("_experiment_onDrawFoQ");
                                    xVarL.l(appStartTrace.c().f9858a);
                                    xVarL.m(appStartTrace.c().b(appStartTrace.f9842q));
                                    A a8 = (A) xVarL.g();
                                    x xVar = appStartTrace.f9835d;
                                    xVar.j(a8);
                                    if (appStartTrace.f9836g != null) {
                                        x xVarL2 = A.L();
                                        xVarL2.n("_experiment_procStart_to_classLoad");
                                        xVarL2.l(appStartTrace.c().f9858a);
                                        xVarL2.m(appStartTrace.c().b(appStartTrace.a()));
                                        xVar.j((A) xVarL2.g());
                                    }
                                    String str = appStartTrace.f9847v ? "true" : "false";
                                    xVar.i();
                                    A.w((A) xVar.f10116b).put("systemDeterminedForeground", str);
                                    xVar.k(appStartTrace.f9845t, "onDrawCount");
                                    w wVarA = appStartTrace.f9843r.a();
                                    xVar.i();
                                    A.x((A) xVar.f10116b, wVarA);
                                    appStartTrace.e(xVar);
                                    break;
                                }
                                break;
                            case 1:
                                if (appStartTrace.f9840o == null) {
                                    appStartTrace.f9840o = new Timer();
                                    long j = appStartTrace.c().f9858a;
                                    x xVar2 = appStartTrace.f9835d;
                                    xVar2.l(j);
                                    xVar2.m(appStartTrace.c().b(appStartTrace.f9840o));
                                    appStartTrace.e(xVar2);
                                    break;
                                }
                                break;
                            case 2:
                                if (appStartTrace.f9841p == null) {
                                    appStartTrace.f9841p = new Timer();
                                    x xVarL3 = A.L();
                                    xVarL3.n("_experiment_preDrawFoQ");
                                    xVarL3.l(appStartTrace.c().f9858a);
                                    xVarL3.m(appStartTrace.c().b(appStartTrace.f9841p));
                                    A a10 = (A) xVarL3.g();
                                    x xVar3 = appStartTrace.f9835d;
                                    xVar3.j(a10);
                                    appStartTrace.e(xVar3);
                                    break;
                                }
                                break;
                            default:
                                Timer timer = AppStartTrace.f9830w;
                                x xVarL4 = A.L();
                                xVarL4.n("_as");
                                xVarL4.l(appStartTrace.a().f9858a);
                                xVarL4.m(appStartTrace.a().b(appStartTrace.f9838l));
                                ArrayList arrayList = new ArrayList(3);
                                x xVarL5 = A.L();
                                xVarL5.n("_astui");
                                xVarL5.l(appStartTrace.a().f9858a);
                                xVarL5.m(appStartTrace.a().b(appStartTrace.i));
                                arrayList.add((A) xVarL5.g());
                                if (appStartTrace.f9837k != null) {
                                    x xVarL6 = A.L();
                                    xVarL6.n("_astfd");
                                    xVarL6.l(appStartTrace.i.f9858a);
                                    xVarL6.m(appStartTrace.i.b(appStartTrace.f9837k));
                                    arrayList.add((A) xVarL6.g());
                                    x xVarL7 = A.L();
                                    xVarL7.n("_asti");
                                    xVarL7.l(appStartTrace.f9837k.f9858a);
                                    xVarL7.m(appStartTrace.f9837k.b(appStartTrace.f9838l));
                                    arrayList.add((A) xVarL7.g());
                                }
                                xVarL4.i();
                                A.v((A) xVarL4.f10116b, arrayList);
                                w wVarA2 = appStartTrace.f9843r.a();
                                xVarL4.i();
                                A.x((A) xVarL4.f10116b, wVarA2);
                                appStartTrace.f9834b.c((A) xVarL4.g(), i.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!zF) {
                    g();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f9844s && this.f9837k == null && !this.f) {
            this.f9837k = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.f9844s || this.f || this.f9839n != null) {
            return;
        }
        this.f9839n = new Timer();
        x xVarL = A.L();
        xVarL.n("_experiment_firstBackgrounding");
        xVarL.l(c().f9858a);
        xVarL.m(c().b(this.f9839n));
        this.f9835d.j((A) xVarL.g());
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.f9844s || this.f || this.m != null) {
            return;
        }
        this.m = new Timer();
        x xVarL = A.L();
        xVarL.n("_experiment_firstForegrounding");
        xVarL.l(c().f9858a);
        xVarL.m(c().b(this.m));
        this.f9835d.j((A) xVarL.g());
    }
}
