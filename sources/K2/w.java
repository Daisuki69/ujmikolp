package K2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class w {
    public static final M2.a c = M2.a.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w f2583d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f2584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f2585b;

    public w(ExecutorService executorService) {
        this.f2585b = executorService;
    }

    public static Context a() {
        try {
            U1.g.e();
            U1.g gVarE = U1.g.e();
            gVarE.a();
            return gVarE.f5904a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized w b() {
        try {
            if (f2583d == null) {
                f2583d = new w(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2583d;
    }

    public final synchronized void c(Context context) {
        if (this.f2584a == null && context != null) {
            this.f2585b.execute(new B5.g(6, this, context));
        }
    }

    public final void d(long j, String str) {
        if (this.f2584a == null) {
            c(a());
            if (this.f2584a == null) {
                return;
            }
        }
        this.f2584a.edit().putLong(str, j).apply();
    }

    public final void e(String str, double d10) {
        if (this.f2584a == null) {
            c(a());
            if (this.f2584a == null) {
                return;
            }
        }
        this.f2584a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
    }

    public final void f(String str, String str2) {
        if (this.f2584a == null) {
            c(a());
            if (this.f2584a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f2584a.edit().remove(str).apply();
        } else {
            androidx.media3.datasource.cache.c.u(this.f2584a, str, str2);
        }
    }

    public final void g(String str, boolean z4) {
        if (this.f2584a == null) {
            c(a());
            if (this.f2584a == null) {
                return;
            }
        }
        androidx.camera.core.impl.a.A(this.f2584a, str, z4);
    }
}
