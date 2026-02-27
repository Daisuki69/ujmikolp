package h2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.paymaya.domain.store.A0;
import d2.C1326a;
import e2.C1419a;
import e2.C1421c;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import n2.C1915b;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16898b;
    public final C1421c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16899d;
    public C1421c e;
    public C1421c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16900g;
    public l h;
    public final w i;
    public final C1915b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1326a f16901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1326a f16902l;
    public final i m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1419a f16903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A0 f16904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i2.e f16905p;

    public q(U1.g gVar, w wVar, C1419a c1419a, t tVar, C1326a c1326a, C1326a c1326a2, C1915b c1915b, i iVar, A0 a02, i2.e eVar) {
        this.f16898b = tVar;
        gVar.a();
        this.f16897a = gVar.f5904a;
        this.i = wVar;
        this.f16903n = c1419a;
        this.f16901k = c1326a;
        this.f16902l = c1326a2;
        this.j = c1915b;
        this.m = iVar;
        this.f16904o = a02;
        this.f16905p = eVar;
        this.f16899d = System.currentTimeMillis();
        this.c = new C1421c(8);
    }

    public final void a(b1.t tVar) {
        i2.e.a();
        i2.e.a();
        this.e.d();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f16901k.a(new p(this));
                this.h.h();
                if (!tVar.h().f19018b.f19015a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.h.d(tVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.h.j(((TaskCompletionSource) ((AtomicReference) tVar.i).get()).getTask());
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(b1.t tVar) {
        Future<?> futureSubmit = this.f16905p.f17092a.f17089a.submit(new m(this, tVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e7) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e7);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }

    public final void c() {
        i2.e.a();
        try {
            C1421c c1421c = this.e;
            String str = (String) c1421c.f16555b;
            C1915b c1915b = (C1915b) c1421c.c;
            c1915b.getClass();
            if (new File((File) c1915b.f18588d, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public final void d(Boolean bool) {
        t tVar = this.f16898b;
        synchronized (tVar) {
            tVar.f = false;
            tVar.f16916g = bool;
            SharedPreferences.Editor editorEdit = tVar.f16913a.edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            editorEdit.apply();
            synchronized (tVar.c) {
                try {
                    if (tVar.a()) {
                        if (!tVar.e) {
                            tVar.f16915d.trySetResult(null);
                            tVar.e = true;
                        }
                    } else if (tVar.e) {
                        tVar.f16915d = new TaskCompletionSource();
                        tVar.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void e(String str, String str2) {
        this.f16905p.f17092a.a(new androidx.work.impl.b(9, this, str, str2));
    }
}
