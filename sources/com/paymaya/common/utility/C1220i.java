package com.paymaya.common.utility;

import D.C0176i;
import D.C0187u;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.paymaya.common.utility.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1220i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.paymaya.data.preference.a f11212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0187u f11213b;
    public Context c;

    public static void f(C1219h c1219h) {
        c1219h.getClass();
        c1219h.f11205g = System.nanoTime();
    }

    public final void a(String str, String str2, String str3) {
        if (C.e(str3)) {
            HashMap map = new HashMap();
            Boolean bool = Boolean.TRUE;
            map.put("MSG-email", bool);
            map.put("MSG-push", bool);
            map.put("MSG-sms", bool);
            map.put("MSG-push-all", bool);
            map.put("Identity", str);
            map.put("Phone", str2);
            this.f11213b.l(map);
            return;
        }
        HashMap map2 = new HashMap();
        Boolean bool2 = Boolean.TRUE;
        map2.put("MSG-email", bool2);
        map2.put("MSG-push", bool2);
        map2.put("MSG-sms", bool2);
        map2.put("MSG-push-all", bool2);
        map2.put("Identity", str);
        map2.put("Phone", str2);
        map2.put("Email", str3);
        this.f11213b.l(map2);
    }

    public final void b(C1219h c1219h) {
        c(this.c, c1219h);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r12, com.paymaya.common.utility.C1219h r13) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.common.utility.C1220i.c(android.content.Context, com.paymaya.common.utility.h):void");
    }

    public final void d(FragmentActivity fragmentActivity, C1219h c1219h) {
        c1219h.getClass();
        long jConvert = TimeUnit.SECONDS.convert(System.nanoTime() - c1219h.f11205g, TimeUnit.NANOSECONDS);
        HashMap map = c1219h.j;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("duration", Long.toString(jConvert));
        c(fragmentActivity, c1219h);
    }

    public final void e(String str) {
        C0187u c0187u = this.f11213b;
        c0187u.getClass();
        D.S.l("CleverTapAPI:pushInboxNotificationClickedEvent() called with: messageId = [" + str + "]");
        ((C0176i) c0187u.f949b.f).s(true, c0187u.g(str), null);
    }
}
