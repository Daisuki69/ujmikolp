package D;

import android.app.UiModeManager;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.UUID;
import mx_android.support.v7.media.MediaRouter;
import o0.C1954a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f841l = -1;
    public F c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CleverTapInstanceConfig f844d;
    public final Context e;
    public final B j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f842a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f843b = false;
    public final Object f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f845g = false;
    public String h = null;
    public boolean i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f846k = new ArrayList();

    public H(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, B b8) {
        this.e = context;
        this.f844d = cleverTapInstanceConfig;
        this.j = b8;
    }

    public static int h(Context context) {
        if (f841l == -1) {
            try {
                if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
                    f841l = 3;
                    return 3;
                }
            } catch (Exception e) {
                S.b(numX49.tnTj78("PePe"));
                e.printStackTrace();
            }
            try {
                f841l = context.getResources().getBoolean(R.bool.ctIsTablet) ? 2 : 1;
            } catch (Exception e7) {
                S.b(numX49.tnTj78("PeP8"));
                e7.printStackTrace();
                f841l = 0;
            }
        }
        return f841l;
    }

    public final String a() {
        String strG;
        String str;
        d0.k();
        String strTnTj78 = numX49.tnTj78("PePC");
        synchronized (this) {
            strG = b0.g(this.e, "fallbackId:" + this.f844d.f9439a, null);
            if (strG == null) {
                synchronized (this.f) {
                    str = strTnTj78 + UUID.randomUUID().toString().replace(Global.HYPHEN, "");
                    CleverTapInstanceConfig cleverTapInstanceConfig = this.f844d;
                    S sC = cleverTapInstanceConfig.c();
                    sC.getClass();
                    S.s(cleverTapInstanceConfig.f9439a, "Updating the fallback id - " + str);
                    b0.l(this.e, "fallbackId:" + this.f844d.f9439a, str);
                }
                strG = str;
            }
        }
        b0.m(this.e, g());
        this.f844d.c().k(this.f844d.f9439a, j(21, null, b0.g(this.e, numX49.tnTj78("PeP4") + this.f844d.f9439a, null)));
        return strG;
    }

    public final void b(String str) {
        S sC = this.f844d.c();
        String str2 = this.f844d.f9439a;
        String str3 = numX49.tnTj78("PePo") + str;
        sC.getClass();
        S.s(str2, str3);
        synchronized (this.f) {
            b0.l(this.e, g(), str);
        }
    }

    public final synchronized String c() {
        String str;
        String strConcat;
        String strTnTj78 = numX49.tnTj78("PePK");
        synchronized (this) {
            try {
                S sC = this.f844d.c();
                String str2 = this.f844d.f9439a + ":async_deviceID";
                sC.getClass();
                S.s(str2, "generateDeviceID() called!");
                String strI = i();
                if (strI != null) {
                    strConcat = strTnTj78.concat(strI);
                } else {
                    synchronized (this.f) {
                        str = "__" + UUID.randomUUID().toString().replace(Global.HYPHEN, "");
                    }
                    strConcat = str;
                }
                b(strConcat);
                S sC2 = this.f844d.c();
                String str3 = this.f844d.f9439a + ":async_deviceID";
                sC2.getClass();
                S.s(str3, "generateDeviceID() done executing!");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strConcat;
    }

    public final JSONObject d() {
        String strTnTj78 = numX49.tnTj78("PePw");
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f844d;
        try {
            if (i() != null) {
                int iB = b0.b(this.e, 0, b0.o(cleverTapInstanceConfig.f9439a, "cachedGUIDsLengthKey"));
                cleverTapInstanceConfig.e(strTnTj78, "Retrieved size of cachedGUIDs: " + iB);
                z = iB > 1;
                cleverTapInstanceConfig.e(strTnTj78, "deviceIsMultiUser:[" + z + "]");
            }
            return n0.b.b(this, this.j, this.f845g, z);
        } catch (Throwable th2) {
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.t(str, numX49.tnTj78("PePc"), th2);
            return new JSONObject();
        }
    }

    public final F e() {
        if (this.c == null) {
            this.c = new F(this);
        }
        return this.c;
    }

    public final String f() {
        String strG = g();
        Context context = this.e;
        String strG2 = b0.g(context, strG, null);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f844d;
        if (cleverTapInstanceConfig.f9447p && strG2 == null) {
            strG2 = b0.g(context, numX49.tnTj78("PePm"), null);
        }
        if (strG2 != null) {
            return strG2;
        }
        return b0.g(context, numX49.tnTj78("PePD") + cleverTapInstanceConfig.f9439a, null);
    }

    public final String g() {
        return numX49.tnTj78("PePh") + this.f844d.f9439a;
    }

    public final String i() {
        String str;
        synchronized (this.f842a) {
            str = this.h;
        }
        return str;
    }

    public final String j(int i, String... strArr) {
        C1954a c1954aA = o0.b.a(strArr, MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_PROVIDER_REMOVED, i);
        this.f846k.add(c1954aA);
        return c1954aA.f18752b;
    }

    public final void k() {
        String strF = f();
        String strConcat = strF == null ? null : numX49.tnTj78("PePM").concat(strF);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f844d;
        if (strConcat == null) {
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.s(str, numX49.tnTj78("PePN"));
            return;
        }
        boolean zA = b0.a(this.e, cleverTapInstanceConfig, strConcat);
        this.j.l(zA);
        S sC2 = cleverTapInstanceConfig.c();
        String str2 = cleverTapInstanceConfig.f9439a;
        String str3 = numX49.tnTj78("PeP6") + zA + numX49.tnTj78("PePa") + strConcat;
        sC2.getClass();
        S.s(str2, str3);
    }

    public final void l() {
        String strF = f();
        String strConcat = strF == null ? null : numX49.tnTj78("PePX").concat(strF);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f844d;
        if (strConcat == null) {
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            String strTnTj78 = numX49.tnTj78("PePG");
            sC.getClass();
            S.s(str, strTnTj78);
            return;
        }
        boolean zA = b0.a(this.e, cleverTapInstanceConfig, strConcat);
        B b8 = this.j;
        synchronized (b8.f806n) {
            b8.h = zA;
        }
        S sC2 = cleverTapInstanceConfig.c();
        String str2 = cleverTapInstanceConfig.f9439a;
        String str3 = numX49.tnTj78("PeP3") + zA + numX49.tnTj78("PePy") + strConcat;
        sC2.getClass();
        S.s(str2, str3);
    }
}
