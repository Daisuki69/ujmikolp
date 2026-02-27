package com.paymaya.common.utility;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: renamed from: com.paymaya.common.utility.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1219h {
    public static final List m = Arrays.asList(EnumC1215d.NEW_WIZARD, EnumC1215d.WIZARD_V2, EnumC1215d.WELCOME, EnumC1215d.REGISTRATION, EnumC1215d.DATA_PRIVACY, EnumC1215d.DEFAULT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11205g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1214c f11202a = EnumC1215d.DEFAULT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11203b = "MODULE";
    public String c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11207l = 39;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11204d = null;
    public String e = null;
    public boolean f = false;
    public String h = "MODULE";
    public String i = "ACTION";
    public final HashMap j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f11206k = new HashMap();

    public static C1219h b(String str, String str2, String str3, boolean z4, String str4, boolean z5) {
        C1219h c1219hE = e(str);
        EnumC1212a enumC1212a = z5 ? EnumC1212a.PAGE_NAME : EnumC1212a.SOURCE_PAGE;
        HashMap map = c1219hE.j;
        map.put(enumC1212a.f10691a, str2);
        map.put("input_label", str3);
        map.put("is_invalid", z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        c1219hE.i();
        if (!z4) {
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("invalid_reason", str4);
        }
        return c1219hE;
    }

    public static C1219h d(EnumC1215d enumC1215d) {
        C1219h c1219h = new C1219h();
        c1219h.p(enumC1215d);
        return c1219h;
    }

    public static C1219h e(String str) {
        C1219h c1219h = new C1219h();
        c1219h.e = str;
        return c1219h;
    }

    public static String m(String str) {
        return str.toUpperCase().replace(Global.BLANK, Global.UNDERSCORE).replace("&", "AND");
    }

    public final void a() {
        String str;
        if (this.e != null) {
            return;
        }
        if (this.f) {
            if (C.e(this.c)) {
                str = this.f11203b;
            } else {
                str = this.f11203b + Global.UNDERSCORE + m(this.c);
            }
            this.h = str;
            if (C.e(this.f11204d)) {
                this.i = AbstractC1173g.c(this.f11207l);
            } else {
                int i = this.f11207l;
                if (i == 14 || i == 12) {
                    this.i = this.f11204d.toUpperCase() + Global.UNDERSCORE + AbstractC1173g.c(this.f11207l);
                } else {
                    this.i = AbstractC1173g.c(this.f11207l) + Global.UNDERSCORE + m(this.f11204d);
                }
            }
        }
        this.f = false;
    }

    public final String c() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        a();
        return this.h + Global.UNDERSCORE + this.i;
    }

    public final void f(EnumC1212a enumC1212a, String str) {
        this.j.put(enumC1212a.f10691a, str);
    }

    public final void g(String str, String str2) {
        this.j.put(str, str2);
    }

    public final void h(String str, String str2) {
        this.j.put(str, str2);
    }

    public final void i() {
        HashMap map = this.j;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("design", "2.0");
    }

    public final void j() {
        HashMap map = this.j;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("design", "2.1");
    }

    public final void k(EnumC1212a enumC1212a, String str) {
        if (str != null) {
            f(enumC1212a, str);
        }
    }

    public final void l() {
        HashMap map = this.j;
        try {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str = E4.d.c;
            if (str == null) {
                throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
            }
            map.put("aid", str);
            String str2 = E4.d.f1258b;
            if (str2 == null) {
                throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
            }
            map.put("dsid", str2);
        } catch (Exception unused) {
            yk.a.e();
        }
    }

    public final void n(int i) {
        if (this.e != null) {
            yk.a.c();
        } else {
            this.f11207l = i;
            this.f = true;
        }
    }

    public final void o(InterfaceC1214c interfaceC1214c) {
        if (this.e != null) {
            yk.a.c();
            return;
        }
        this.f11202a = interfaceC1214c;
        this.f11203b = interfaceC1214c.getValue();
        this.f = true;
    }

    public final void p(EnumC1215d enumC1215d) {
        if (this.e != null) {
            yk.a.c();
            return;
        }
        this.f11202a = enumC1215d;
        this.f11203b = enumC1215d.f10786a;
        this.f = true;
    }

    public final void q(String str) {
        if (this.e != null) {
            yk.a.c();
            return;
        }
        this.f11202a = (InterfaceC1214c) N1.f.a(EnumC1215d.class, m(str)).c(EnumC1215d.DEFAULT);
        this.f11203b = m(str);
        this.f = true;
    }

    public final void r(EnumC1216e enumC1216e) {
        if (this.e != null) {
            yk.a.c();
        } else {
            this.c = C.e(enumC1216e) ? null : enumC1216e.f10904a;
            this.f = true;
        }
    }

    public final void s(String str) {
        if (this.e != null) {
            yk.a.c();
            return;
        }
        if (!C.e(str)) {
        }
        this.c = C.e(str) ? null : m(str);
        this.f = true;
    }

    public final void t(EnumC1217f enumC1217f) {
        if (this.e != null) {
            yk.a.c();
        } else {
            this.f11204d = C.e(enumC1217f) ? null : enumC1217f.f11196a;
            this.f = true;
        }
    }

    public final String toString() {
        String str = this.e;
        HashMap map = this.j;
        if (str != null) {
            return "AnalyticsEvent{NAME='" + this.e + "', mAttributes=" + map + "} <Finalized Event>";
        }
        a();
        return "AnalyticsEvent{NAME='" + this.h + Global.UNDERSCORE + this.i + "', mStartTimeInNanoSeconds=" + this.f11205g + ", mModule=" + this.f11203b + ", mCompleteModule='" + this.h + "', mCompleteAction='" + this.i + "', mAttributes=" + map + "}";
    }

    public final void u(String str) {
        if (this.e != null) {
            yk.a.c();
            return;
        }
        if (!C.e(str)) {
        }
        this.f11204d = C.e(str) ? null : m(str);
        this.f = true;
    }
}
