package M2;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static volatile a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3046b = false;

    public a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (b.f3047b == null) {
                    b.f3047b = new b(0);
                }
                bVar = b.f3047b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3045a = bVar;
    }

    public static a d() {
        if (c == null) {
            synchronized (a.class) {
                try {
                    if (c == null) {
                        c = new a();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final void a(String str) {
        if (this.f3046b) {
            this.f3045a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.f3046b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f3045a.getClass();
            Log.d("FirebasePerformance", str2);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f3046b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f3045a.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f3046b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f3045a.getClass();
            Log.i("FirebasePerformance", str2);
        }
    }

    public final void f(String str) {
        if (this.f3046b) {
            this.f3045a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f3046b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f3045a.getClass();
            Log.w("FirebasePerformance", str2);
        }
    }
}
