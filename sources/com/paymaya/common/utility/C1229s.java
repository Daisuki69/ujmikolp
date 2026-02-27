package com.paymaya.common.utility;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.paymaya.common.utility.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1229s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1220i f11229a;

    public C1229s(C1220i analyticsUtils) {
        kotlin.jvm.internal.j.g(analyticsUtils, "analyticsUtils");
        this.f11229a = analyticsUtils;
    }

    public static void c(C1229s c1229s, Activity activity, String str, String str2, String str3, String buttonLabel, String str4, String str5, Map additionalAttrs, int i) {
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            additionalAttrs = cj.M.e();
        }
        c1229s.getClass();
        kotlin.jvm.internal.j.g(activity, "activity");
        kotlin.jvm.internal.j.g(buttonLabel, "buttonLabel");
        kotlin.jvm.internal.j.g(additionalAttrs, "additionalAttrs");
        LinkedHashMap linkedHashMapI = cj.M.i(new Pair(EnumC1212a.SOURCE_PAGE, str2), new Pair(EnumC1212a.BUTTON, buttonLabel));
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        if (str5 != null) {
        }
        linkedHashMapI.putAll(additionalAttrs);
        c1229s.b(activity, str, linkedHashMapI);
    }

    public static void d(C1229s c1229s, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, String str5, Map map, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            map = cj.M.e();
        }
        EnumC1212a enumC1212a = EnumC1212a.SOURCE_PAGE;
        if (str2 == null) {
            str2 = "";
        }
        LinkedHashMap linkedHashMapI = cj.M.i(new Pair(enumC1212a, str2));
        if (str3 != null && str4 != null) {
            linkedHashMapI.put(EnumC1212a.PAGE, str3);
            linkedHashMapI.put(EnumC1212a.STEP_NO, str4);
        }
        if (str5 != null) {
        }
        linkedHashMapI.putAll(map);
        c1229s.b(fragmentActivity, str, linkedHashMapI);
    }

    public final void a(FragmentActivity fragmentActivity, String str, String str2, String str3, boolean z4, EnumC1212a enumC1212a, Function1 function1, Function1 function12, Map map) {
        LinkedHashMap linkedHashMapI = cj.M.i(new Pair(EnumC1212a.SOURCE_PAGE, str2), new Pair(EnumC1212a.ACTION_FUNCTION, function12.invoke(Boolean.valueOf(z4))), new Pair(enumC1212a, function1.invoke(Boolean.valueOf(z4))));
        if (str3 != null) {
        }
        linkedHashMapI.putAll(map);
        b(fragmentActivity, str, linkedHashMapI);
    }

    public final void b(Activity activity, String str, Map map) {
        C1219h c1219hE = C1219h.e(str);
        c1219hE.i();
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.f((EnumC1212a) entry.getKey(), (String) entry.getValue());
        }
        this.f11229a.c(activity, c1219hE);
    }
}
