package com.google.firebase.messaging;

import android.content.Context;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import y1.C2496a;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Runnable {
    public static final Object f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f9824g;
    public static Boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f9826b;
    public final PowerManager.WakeLock c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f9827d;
    public final long e;

    public z(y yVar, Context context, o oVar, long j) {
        this.f9827d = yVar;
        this.f9825a = context;
        this.e = j;
        this.f9826b = oVar;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                Boolean bool = h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b("android.permission.ACCESS_NETWORK_STATE", bool, context) : bool.booleanValue());
                h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(String str, Boolean bool, Context context) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z4 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z4 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z4;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                Boolean bool = f9824g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b("android.permission.WAKE_LOCK", bool, context) : bool.booleanValue());
                f9824g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean d() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f9825a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.z.d():boolean");
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f9827d;
        Context context = this.f9825a;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (zC) {
            wakeLock.acquire(f.f9781a);
        }
        try {
            try {
                try {
                    yVar.f(true);
                    if (!this.f9826b.e()) {
                        yVar.f(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (yVar.g()) {
                            yVar.f(false);
                        } else {
                            yVar.h(this.e);
                        }
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        new C2496a(this, this).d();
                        if (!c(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    yVar.f(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th2) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th2;
            }
        } catch (RuntimeException unused2) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
