package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f9756b;
    public final ScheduledThreadPoolExecutor c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f9757d;
    public B e;
    public boolean f;

    public D(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f9757d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.f9755a = applicationContext;
        this.f9756b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f9757d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                B b8 = this.e;
                if (b8 == null || !b8.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((C) this.f9757d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        C c;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c = new C(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
            c.f9754b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new androidx.work.impl.e(scheduledThreadPoolExecutor.schedule(new androidx.window.layout.adapter.extensions.a(c, 7), 20L, TimeUnit.SECONDS), 15));
            this.f9757d.add(c);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return c.f9754b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f9755a, this.f9756b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f9757d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((C) arrayDeque.poll()).f9754b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f = false;
            if (iBinder instanceof B) {
                this.e = (B) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f9757d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((C) arrayDeque.poll()).f9754b.trySetResult(null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
