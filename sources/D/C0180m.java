package D;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: D.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0180m {
    public C0181n a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        C0181n c0181n;
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("PePt"));
        kotlin.jvm.internal.j.g(cleverTapInstanceConfig, numX49.tnTj78("PePU"));
        C0181n c0181n2 = C0181n.f930b;
        if (c0181n2 != null) {
            return c0181n2;
        }
        synchronized (this) {
            c0181n = C0181n.f930b;
            if (c0181n == null) {
                l0.b.a(cleverTapInstanceConfig).a().k("buildCache", new CallableC0179l(context, 0));
                c0181n = new C0181n();
                C0181n.f930b = c0181n;
            }
        }
        return c0181n;
    }

    public c0 b() {
        c0 c0Var;
        c0 c0Var2 = c0.f901b;
        if (c0Var2 != null) {
            return c0Var2;
        }
        synchronized (this) {
            c0Var = c0.f901b;
            if (c0Var == null) {
                c0Var = new c0();
                c0.f901b = c0Var;
            }
        }
        return c0Var;
    }
}
