package D;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends AbstractC0173f {
    public long c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f894d;
    public final CleverTapInstanceConfig e;
    public final Q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0.d f895g;

    public a0(CleverTapInstanceConfig cleverTapInstanceConfig, B b8, o0.d dVar, Q q9) {
        this.e = cleverTapInstanceConfig;
        this.f894d = b8;
        this.f895g = dVar;
        this.f = q9;
    }

    public final void b() {
        B b8 = this.f894d;
        b8.f = 0;
        b8.f813u = false;
        b8.j(false);
        B b10 = this.f894d;
        if (b10.j) {
            b10.j = false;
        }
        S sC = this.e.c();
        String str = this.e.f9439a;
        String strTnTj78 = numX49.tnTj78("PeuQ");
        sC.getClass();
        S.s(str, strTnTj78);
        B b11 = this.f894d;
        synchronized (b11) {
            b11.f809q = null;
        }
        this.f894d.c();
        this.f894d.b();
        this.f894d.d();
    }

    public final void c(Context context) {
        B b8 = this.f894d;
        if (b8.f > 0) {
            return;
        }
        b8.i = true;
        this.f895g.f18757a = null;
        b8.f = (int) (System.currentTimeMillis() / 1000);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.e;
        S sC = cleverTapInstanceConfig.c();
        String str = numX49.tnTj78("Peut") + b8.f;
        String str2 = cleverTapInstanceConfig.f9439a;
        sC.getClass();
        S.s(str2, str);
        SharedPreferences sharedPreferencesE = b0.e(context);
        String strTnTj78 = numX49.tnTj78("PeuU");
        int iC = b0.c(context, cleverTapInstanceConfig, strTnTj78);
        int iC2 = b0.c(context, cleverTapInstanceConfig, "sexe");
        if (iC2 > 0) {
            b8.m = iC2 - iC;
        }
        S sC2 = cleverTapInstanceConfig.c();
        String str3 = numX49.tnTj78("Peue") + b8.m + numX49.tnTj78("Peu8");
        sC2.getClass();
        S.s(str2, str3);
        if (iC == 0) {
            b8.j = true;
        }
        b0.i(sharedPreferencesE.edit().putInt(b0.n(cleverTapInstanceConfig, strTnTj78), b8.f));
    }
}
