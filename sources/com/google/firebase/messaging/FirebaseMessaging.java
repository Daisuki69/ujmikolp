package com.google.firebase.messaging;

import D.CallableC0188v;
import M8.A0;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dOYHB6.yFtIp6.svM7M6;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static t f9758k;
    public static ScheduledThreadPoolExecutor m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1.g f9760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9761b;
    public final Xh.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f9762d;
    public final B1.a e;
    public final ScheduledThreadPoolExecutor f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f9763g;
    public final o h;
    public boolean i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static B2.b f9759l = new R2.d(10);

    public FirebaseMessaging(U1.g gVar, B2.b bVar, B2.b bVar2, C2.e eVar, B2.b bVar3, y2.d dVar) {
        final int i = 1;
        final int i4 = 0;
        gVar.a();
        Context context = gVar.f5904a;
        o oVar = new o(context);
        Xh.b bVar4 = new Xh.b(gVar, oVar, bVar, bVar2, eVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.i = false;
        f9759l = bVar3;
        this.f9760a = gVar;
        this.e = new B1.a(this, dVar);
        gVar.a();
        Context context2 = gVar.f5904a;
        this.f9761b = context2;
        B5.b bVar5 = new B5.b();
        this.h = oVar;
        this.c = bVar4;
        this.f9762d = new i(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.f9763g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(bVar5);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f9788b;

            {
                this.f9788b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f9788b;
                        if (firebaseMessaging.e.e()) {
                            firebaseMessaging.i();
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f9788b;
                        Context context3 = firebaseMessaging2.f9761b;
                        E1.c.i(context3);
                        boolean zH = firebaseMessaging2.h();
                        boolean zIsAtLeastQ = PlatformVersion.isAtLeastQ();
                        Xh.b bVar6 = firebaseMessaging2.c;
                        if (zIsAtLeastQ) {
                            SharedPreferences sharedPreferencesR = A0.r(context3);
                            if (!sharedPreferencesR.contains("proxy_retention") || sharedPreferencesR.getBoolean("proxy_retention", false) != zH) {
                                ((Rpc) bVar6.c).setRetainProxiedNotifications(zH).addOnSuccessListener(new androidx.arch.core.executor.a(2), new Gb.n(context3, zH, 5));
                            }
                        }
                        if (firebaseMessaging2.h()) {
                            ((Rpc) bVar6.c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f, new k(firebaseMessaging2, 1));
                        }
                        break;
                }
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i6 = y.j;
        Tasks.call(scheduledThreadPoolExecutor2, new CallableC0188v(context2, scheduledThreadPoolExecutor2, this, oVar, bVar4, 1)).addOnSuccessListener(scheduledThreadPoolExecutor, new k(this, i4));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f9788b;

            {
                this.f9788b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f9788b;
                        if (firebaseMessaging.e.e()) {
                            firebaseMessaging.i();
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f9788b;
                        Context context3 = firebaseMessaging2.f9761b;
                        E1.c.i(context3);
                        boolean zH = firebaseMessaging2.h();
                        boolean zIsAtLeastQ = PlatformVersion.isAtLeastQ();
                        Xh.b bVar6 = firebaseMessaging2.c;
                        if (zIsAtLeastQ) {
                            SharedPreferences sharedPreferencesR = A0.r(context3);
                            if (!sharedPreferencesR.contains("proxy_retention") || sharedPreferencesR.getBoolean("proxy_retention", false) != zH) {
                                ((Rpc) bVar6.c).setRetainProxiedNotifications(zH).addOnSuccessListener(new androidx.arch.core.executor.a(2), new Gb.n(context3, zH, 5));
                            }
                        }
                        if (firebaseMessaging2.h()) {
                            ((Rpc) bVar6.c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f, new k(firebaseMessaging2, 1));
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j6) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                m.schedule(runnable, j6, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(U1.g.e());
    }

    public static synchronized t d(Context context) {
        try {
            if (f9758k == null) {
                f9758k = new t(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f9758k;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull U1.g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.c(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() throws IOException {
        Task taskContinueWithTask;
        s sVarF = f();
        if (!k(sVarF)) {
            return sVarF.f9806a;
        }
        String strC = o.c(this.f9760a);
        i iVar = this.f9762d;
        synchronized (iVar) {
            taskContinueWithTask = (Task) ((ArrayMap) iVar.f9786b).get(strC);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strC);
                }
                Xh.b bVar = this.c;
                taskContinueWithTask = bVar.h(bVar.l(o.c((U1.g) bVar.f6628b), ProxyConfig.MATCH_ALL_SCHEMES, new Bundle())).onSuccessTask(this.f9763g, new Bb.c(23, this, strC, sVarF)).continueWithTask((ExecutorService) iVar.f9785a, new androidx.camera.lifecycle.a(22, iVar, strC));
                ((ArrayMap) iVar.f9786b).put(strC, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strC);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final Task e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f.execute(new androidx.media3.common.util.g(18, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final s f() {
        s sVarB;
        t tVarD = d(this.f9761b);
        U1.g gVar = this.f9760a;
        gVar.a();
        String strG = "[DEFAULT]".equals(gVar.f5905b) ? "" : gVar.g();
        String strC = o.c(this.f9760a);
        synchronized (tVarD) {
            sVarB = s.b(svM7M6.getString(tVarD.f9808a, strG + "|T|" + strC + "|*", null));
        }
        return sVarB;
    }

    public final synchronized void g(boolean z4) {
        this.i = z4;
    }

    public final boolean h() {
        Context context = this.f9761b;
        E1.c.i(context);
        if (PlatformVersion.isAtLeastQ()) {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f9760a.c(Y1.b.class) != null || (x3.d.j() && f9759l != null)) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    public final void i() {
        if (k(f())) {
            synchronized (this) {
                if (!this.i) {
                    j(0L);
                }
            }
        }
    }

    public final synchronized void j(long j6) {
        b(new v(this, Math.min(Math.max(30L, 2 * j6), j)), j6);
        this.i = true;
    }

    public final boolean k(s sVar) {
        if (sVar != null) {
            return System.currentTimeMillis() > sVar.c + s.f9805d || !this.h.a().equals(sVar.f9807b);
        }
        return true;
    }
}
