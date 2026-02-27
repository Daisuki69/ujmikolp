package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f9821b;
    public final Xh.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f9822d;
    public final ScheduledThreadPoolExecutor f;
    public final x h;
    public final ArrayMap e = new ArrayMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9823g = false;

    public y(FirebaseMessaging firebaseMessaging, o oVar, x xVar, Xh.b bVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f9822d = firebaseMessaging;
        this.f9821b = oVar;
        this.h = xVar;
        this.c = bVar;
        this.f9820a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e7);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) throws IOException {
        String strA = this.f9822d.a();
        Xh.b bVar = this.c;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(bVar.h(bVar.l(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f9822d.a();
        Xh.b bVar = this.c;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        a(bVar.h(bVar.l(strA, "/topics/" + str, bundle)));
    }

    public final void e(w wVar) {
        synchronized (this.e) {
            try {
                String str = wVar.c;
                if (this.e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void f(boolean z4) {
        this.f9823g = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.g():boolean");
    }

    public final void h(long j6) {
        this.f.schedule(new z(this, this.f9820a, this.f9821b, Math.min(Math.max(30L, 2 * j6), i)), j6, TimeUnit.SECONDS);
        f(true);
    }
}
