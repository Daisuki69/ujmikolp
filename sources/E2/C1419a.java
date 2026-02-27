package e2;

import X2.g;
import android.util.Log;
import b2.l;
import de.m;
import defpackage.AbstractC1414e;
import java.util.concurrent.atomic.AtomicReference;
import k2.C1739m0;

/* JADX INFO: renamed from: e2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1419a {
    public static final C1422d c = new C1422d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f16552b = new AtomicReference(null);

    public C1419a(l lVar) {
        this.f16551a = lVar;
        lVar.a(new m(this, 1));
    }

    public final C1422d a(String str) {
        C1419a c1419a = (C1419a) this.f16552b.get();
        return c1419a == null ? c : c1419a.a(str);
    }

    public final boolean b() {
        C1419a c1419a = (C1419a) this.f16552b.get();
        return c1419a != null && c1419a.b();
    }

    public final boolean c(String str) {
        C1419a c1419a = (C1419a) this.f16552b.get();
        return c1419a != null && c1419a.c(str);
    }

    public final void d(String str, long j, C1739m0 c1739m0) {
        String strH = AbstractC1414e.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strH, null);
        }
        this.f16551a.a(new g(str, j, c1739m0));
    }
}
