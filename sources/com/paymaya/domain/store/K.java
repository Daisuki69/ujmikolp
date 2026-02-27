package com.paymaya.domain.store;

import K4.C0271b;
import K4.C0272c;
import K4.C0274e;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import com.paymaya.PayMayaApplication;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d2.C1328c;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ph.C2070f1;
import u5.AbstractC2302a;
import zj.C2576A;
import zj.C2578C;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1220i f11363b;
    public final S5.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f11364d;
    public Uh.b e;

    public K(C1220i analyticsUtils, S5.c flagConfigurationService, com.paymaya.data.preference.a preference) {
        kotlin.jvm.internal.j.g(analyticsUtils, "analyticsUtils");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f11363b = analyticsUtils;
        this.c = flagConfigurationService;
        this.f11364d = preference;
        W4.b bVar = new W4.b(this, 12);
        yk.a.f();
        ArrayList arrayList = AbstractC2302a.c;
        arrayList.remove(bVar);
        arrayList.add(bVar);
    }

    public static final void a(K k8, M8.A0 a02, String str) {
        String strB;
        String str2;
        Integer num;
        String string;
        k8.getClass();
        String strE = e(a02);
        String string2 = C2576A.b0(C2576A.M(C2576A.M(strE, "Failed to get challenge! Aborting extraction."), "Upload error! Aborting extraction.")).toString();
        if (string2 == null) {
            string2 = "";
        }
        String strE0 = C2578C.e0(100, string2);
        C1219h c1219hE = C1219h.e("DEVICE_EXTRACTION_FAILURE");
        c1219hE.g("step", C2576A.z(strE, "Upload error! Aborting extraction.", false, 2) ? "upload" : C2576A.z(strE, "Encryption error! Aborting extraction.", false, 2) ? "encrypt" : C2576A.z(strE, "Compression error! Aborting extraction.", false, 2) ? "compress" : C2576A.z(strE, "Extraction error! Aborting extraction.", false, 2) ? "extract_device_info" : C2576A.z(strE, "Failed to get challenge! Aborting extraction.", false, 2) ? "get_challenge" : null);
        c1219hE.g("event_trigger", str);
        c1219hE.l();
        if (strE0.length() > 0) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put(Constants.REASON, strE0);
        }
        if (a02 instanceof C0272c) {
            C0274e c0274e = ((C0272c) a02).c;
            if (c0274e != null && (num = c0274e.f2619d) != null && (string = num.toString()) != null) {
                c1219hE.g("status_code", string);
            }
            if (c0274e != null && (str2 = c0274e.e) != null) {
                c1219hE.g("rrn", str2);
            }
            if (c0274e != null && (strB = c0274e.b()) != null) {
                c1219hE.g(StateEvent.Name.ERROR_CODE, strB);
            }
        }
        k8.f11363b.b(c1219hE);
    }

    public static final void b(K k8, C5.a aVar, String str, K4.F f) {
        String strConcat;
        k8.getClass();
        if ((f instanceof K4.E) && f.f2611a) {
            C1219h c1219hE = C1219h.e("DEVICE_EXTRACTION_START_UPLOAD");
            c1219hE.g("event_trigger", str);
            c1219hE.l();
            k8.f11363b.b(c1219hE);
        }
        boolean z4 = f instanceof K4.B;
        if (z4) {
            if (str == null || (strConcat = "raven_extract_".concat(str)) == null) {
                strConcat = "raven_extract";
            }
        } else if (f instanceof K4.A) {
            if (str == null || (strConcat = "raven_extract_encrypt_".concat(str)) == null) {
                strConcat = "raven_extract_encrypt";
            }
        } else if (f instanceof K4.z) {
            if (str == null || (strConcat = "raven_extract_compress_".concat(str)) == null) {
                strConcat = "raven_extract_compress";
            }
        } else if (!(f instanceof K4.C)) {
            strConcat = "";
        } else if (str == null || (strConcat = "raven_extract_full_".concat(str)) == null) {
            strConcat = "raven_extract_full";
        }
        if (strConcat.length() <= 0) {
            strConcat = null;
        }
        if (strConcat == null) {
            return;
        }
        if (f.f2611a) {
            aVar.f739a = true;
            aVar.e(strConcat);
            return;
        }
        if (f instanceof K4.z) {
            if (((K4.z) f).f2642b != null) {
                aVar.d(strConcat, cj.M.g(new Pair("payload_size", Long.valueOf(r7.intValue()))));
            }
        } else if (f instanceof K4.A) {
            if (((K4.A) f).f2608b != null) {
                aVar.d(strConcat, cj.M.g(new Pair("payload_size", Long.valueOf(r7.intValue()))));
            }
        } else if (z4) {
            K4.B b8 = (K4.B) f;
            HashMap map = b8.c;
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(cj.L.b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(We.s.i((String) entry.getKey(), "_duration"), entry.getValue());
                }
                HashMap map2 = new HashMap(linkedHashMap);
                map2.toString();
                yk.a.f();
                aVar.d(strConcat, map2);
            }
            if (b8.f2610d != null) {
                aVar.d(strConcat, cj.M.g(new Pair("payload_size", Long.valueOf(r7.intValue()))));
            }
        }
        aVar.f(strConcat);
    }

    public static void d(K k8, Function2 function2) {
        Object objA;
        k8.getClass();
        C5.a aVar = new C5.a();
        aVar.f739a = true;
        aVar.e("raven_get_location");
        G g8 = new G(0, k8, aVar, function2);
        if (E4.d.f1257a == null) {
            throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
        }
        Ij.e eVar = Bj.U.f603a;
        Gj.c cVarC = Bj.H.c(Gj.m.f2024a);
        try {
            C1037h.a aVar2 = C1037h.f9166b;
            R4.j jVar = R4.j.f5471a;
            PayMayaApplication payMayaApplication = E4.d.f1257a;
            kotlin.jvm.internal.j.d(payMayaApplication);
            jVar.c(payMayaApplication, new E4.b(cVarC, g8));
            objA = Unit.f18162a;
        } catch (Throwable th2) {
            C1037h.a aVar3 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Throwable thA = C1037h.a(objA);
        if (thA != null) {
            String strB = C1030a.b(thA);
            String strC = kotlin.jvm.internal.z.a(E4.d.class).c();
            if (strC == null) {
                strC = "Raven";
            }
            M8.A0.w(2, strB, strC);
            Bj.H.w(cVarC, null, null, new E4.c(g8, null), 3);
        }
    }

    public static String e(M8.A0 a02) {
        String strC;
        if (a02 instanceof C0271b) {
            return ((C0271b) a02).c;
        }
        if (!(a02 instanceof C0272c)) {
            throw new NoWhenBranchMatchedException();
        }
        C0274e c0274e = ((C0272c) a02).c;
        return (c0274e == null || (strC = c0274e.c()) == null) ? "" : strC;
    }

    public static void f(Throwable th2) {
        yk.a.f21331b.getClass();
        C2070f1.i();
        C1328c.a().b(th2);
    }

    public final void c(String str, String str2, String str3, H h) {
        C1219h c1219hE = C1219h.e("DEVICE_EXTRACTION_START");
        c1219hE.g("event_trigger", str3);
        c1219hE.l();
        this.f11363b.b(c1219hE);
        C5.a aVar = new C5.a();
        this.e = new Uh.b(null);
        try {
            E4.d.a(str, str2, str3, new I(this, h, str3, aVar));
        } catch (Exception e) {
            Uh.b bVar = this.e;
            if (bVar != null) {
                bVar.onError(e);
            }
            if (h != null) {
                h.onError(e);
            }
            f(e);
        }
    }
}
