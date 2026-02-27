package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f9812b;
    public final FirebaseMessaging c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f9813d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    public v(FirebaseMessaging firebaseMessaging, long j) {
        this.c = firebaseMessaging;
        this.f9811a = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f9761b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f9812b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.f9761b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVarR = r.r();
        FirebaseMessaging firebaseMessaging = this.c;
        boolean zC = rVarR.C(firebaseMessaging.f9761b);
        PowerManager.WakeLock wakeLock = this.f9812b;
        if (zC) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = true;
                }
                if (!firebaseMessaging.h.e()) {
                    firebaseMessaging.g(false);
                    if (r.r().C(firebaseMessaging.f9761b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (!r.r().B(firebaseMessaging.f9761b) || a()) {
                    if (b()) {
                        firebaseMessaging.g(false);
                    } else {
                        firebaseMessaging.j(this.f9811a);
                    }
                    if (r.r().C(firebaseMessaging.f9761b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                u uVar = new u();
                uVar.f9809a = this;
                uVar.a();
                if (r.r().C(firebaseMessaging.f9761b)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.g(false);
                if (r.r().C(firebaseMessaging.f9761b)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (r.r().C(firebaseMessaging.f9761b)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
