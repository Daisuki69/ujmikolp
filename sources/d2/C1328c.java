package d2;

import U1.g;
import android.util.Log;
import h2.q;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: d2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1328c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f16255a;

    public C1328c(q qVar) {
        this.f16255a = qVar;
    }

    public static C1328c a() {
        C1328c c1328c = (C1328c) g.e().c(C1328c.class);
        if (c1328c != null) {
            return c1328c;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        Map map = Collections.EMPTY_MAP;
        q qVar = this.f16255a;
        qVar.f16905p.f17092a.a(new androidx.media3.common.util.g(qVar, th2));
    }

    public final void c(String str, String str2) {
        this.f16255a.e(str, str2);
    }
}
