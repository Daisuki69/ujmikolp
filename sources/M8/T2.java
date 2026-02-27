package M8;

import Bj.C0144h0;
import Ng.C0496d;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDirections;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1111B;
import cj.C1114E;
import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T2 implements C3.n {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(io.ktor.utils.io.n r4, ij.AbstractC1609c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.r
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.r r0 = (io.ktor.utils.io.r) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            io.ktor.utils.io.r r0 = new io.ktor.utils.io.r
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Mj.a r4 = r0.f17548b
            io.ktor.utils.io.n r2 = r0.f17547a
            bj.AbstractC1039j.b(r5)
            r5 = r4
            r4 = r2
            goto L3d
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            bj.AbstractC1039j.b(r5)
            Mj.a r5 = new Mj.a
            r5.<init>()
        L3d:
            boolean r2 = r4.i()
            if (r2 != 0) goto L57
            Mj.i r2 = r4.f()
            r5.f(r2)
            r0.f17547a = r4
            r0.f17548b = r5
            r0.e = r3
            java.lang.Object r2 = r4.h(r3, r0)
            if (r2 != r1) goto L3d
            return r1
        L57:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L5e
            return r5
        L5e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.T2.A(io.ktor.utils.io.n, ij.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:24:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:23:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(io.ktor.utils.io.n r11, int r12, ij.AbstractC1609c r13) throws java.io.EOFException {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.s
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.s r0 = (io.ktor.utils.io.s) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            io.ktor.utils.io.s r0 = new io.ktor.utils.io.s
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.e
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r11 = r0.c
            Mj.a r12 = r0.f17550b
            io.ktor.utils.io.n r2 = r0.f17549a
            bj.AbstractC1039j.b(r13)
            goto L62
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            bj.AbstractC1039j.b(r13)
            Mj.a r13 = new Mj.a
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L40:
            long r4 = r12.c
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L94
            Mj.i r2 = r11.f()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto L64
            r0.f17549a = r11
            r0.f17550b = r12
            r0.c = r13
            r0.f = r3
            java.lang.Object r2 = r11.h(r3, r0)
            if (r2 != r1) goto L60
            return r1
        L60:
            r2 = r11
            r11 = r13
        L62:
            r13 = r11
            r11 = r2
        L64:
            boolean r2 = r11.i()
            if (r2 != 0) goto L94
            Mj.i r2 = r11.f()
            long r4 = Yg.a.b(r2)
            long r6 = (long) r13
            long r8 = r12.c
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L86
            Mj.i r2 = r11.f()
            long r4 = r12.c
            long r6 = r6 - r4
            r2.o(r12, r6)
            goto L40
        L86:
            Mj.i r2 = r11.f()
            long r4 = r2.e(r12)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            goto L40
        L94:
            long r0 = r12.c
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto L9c
            return r12
        L9c:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = We.s.t(r13, r0, r1)
            long r0 = r12.c
            java.lang.String r12 = " available"
            java.lang.String r12 = We.s.h(r0, r12, r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.T2.B(io.ktor.utils.io.n, int, ij.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(io.ktor.utils.io.n r8, long r9, ij.AbstractC1609c r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.u
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.u r0 = (io.ktor.utils.io.u) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            io.ktor.utils.io.u r0 = new io.ktor.utils.io.u
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.e
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r8 = r0.c
            Mj.a r10 = r0.f17554b
            io.ktor.utils.io.n r2 = r0.f17553a
            bj.AbstractC1039j.b(r11)
            r11 = r10
            r9 = r8
            r8 = r2
            goto L40
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            bj.AbstractC1039j.b(r11)
            Mj.a r11 = new Mj.a
            r11.<init>()
        L40:
            boolean r2 = r8.i()
            if (r2 != 0) goto L88
            r4 = 0
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L88
            Mj.i r2 = r8.f()
            long r6 = Yg.a.b(r2)
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 < 0) goto L70
            Mj.i r2 = r8.f()
            long r4 = Yg.a.b(r2)
            long r4 = r9 - r4
            Mj.i r9 = r8.f()
            long r9 = r9.e(r11)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            goto L77
        L70:
            Mj.i r2 = r8.f()
            r2.o(r11, r9)
        L77:
            r0.f17553a = r8
            r0.f17554b = r11
            r0.c = r4
            r0.f = r3
            java.lang.Object r9 = r8.h(r3, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r9 = r4
            goto L40
        L88:
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.T2.C(io.ktor.utils.io.n, long, ij.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(io.ktor.utils.io.n r4, ij.AbstractC1609c r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.t
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.t r0 = (io.ktor.utils.io.t) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            io.ktor.utils.io.t r0 = new io.ktor.utils.io.t
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Mj.a r4 = r0.f17552b
            io.ktor.utils.io.n r2 = r0.f17551a
            bj.AbstractC1039j.b(r5)
            r5 = r4
            r4 = r2
            goto L3d
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            bj.AbstractC1039j.b(r5)
            Mj.a r5 = new Mj.a
            r5.<init>()
        L3d:
            boolean r2 = r4.i()
            if (r2 != 0) goto L57
            Mj.i r2 = r4.f()
            r5.f(r2)
            r0.f17551a = r4
            r0.f17552b = r5
            r0.e = r3
            java.lang.Object r2 = r4.h(r3, r0)
            if (r2 != r1) goto L3d
            return r1
        L57:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L61
            r5.getClass()
            return r5
        L61:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.T2.D(io.ktor.utils.io.n, ij.c):java.lang.Object");
    }

    public static LocalDate E(String value) {
        Object objA;
        kotlin.jvm.internal.j.g(value, "value");
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendLiteral("/").appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).appendLiteral("/").appendFixedDecimal(DateTimeFieldType.year(), 4).toFormatter().parseLocalDateTime(value).toLocalDate();
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        return (LocalDate) objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable F(io.ktor.utils.io.n r4, ij.AbstractC1609c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.v
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.v r0 = (io.ktor.utils.io.v) r0
            int r1 = r0.f17556b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17556b = r1
            goto L18
        L13:
            io.ktor.utils.io.v r0 = new io.ktor.utils.io.v
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f17555a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f17556b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            bj.AbstractC1039j.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            bj.AbstractC1039j.b(r5)
            r0.f17556b = r3
            java.lang.Object r5 = A(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            Mj.a r5 = (Mj.a) r5
            long r0 = r5.c
            int r4 = (int) r0
            byte[] r4 = Mj.j.c(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.T2.F(io.ktor.utils.io.n, ij.c):java.io.Serializable");
    }

    public static void G(L8.c cVar, Map additionalAttributes, boolean z4) {
        kotlin.jvm.internal.j.g(additionalAttributes, "additionalAttributes");
        EnumC1216e enumC1216eU = cVar.U();
        if (enumC1216eU != null) {
            cVar.O().a(enumC1216eU, cVar.r(), z4, new L8.a(cVar, additionalAttributes, 0), new L8.b(cVar, 3));
        }
    }

    public static /* synthetic */ void H(L8.c cVar, Map map, int i) {
        if ((i & 1) != 0) {
            map = cj.M.e();
        }
        cVar.z(map);
    }

    public static void I(MayaKycBaseFragment mayaKycBaseFragment, String str) {
        EnumC1216e enumC1216eU = mayaKycBaseFragment.U();
        if (enumC1216eU != null) {
            mayaKycBaseFragment.O().a(enumC1216eU, str, false, new Ag.k(mayaKycBaseFragment), new L8.b(mayaKycBaseFragment, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [L8.c, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v1, types: [L8.c, androidx.fragment.app.Fragment] */
    public static void J(L8.c cVar, String pageSource, String str, Map map) {
        kotlin.jvm.internal.j.g(pageSource, "pageSource");
        cVar.O();
        ?? r02 = (Fragment) cVar;
        ?? r42 = (Fragment) cVar;
        C1219h c1219hH = ((MayaKycActivity) r02.Q()).H();
        if (r02.D()) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("path", "TOFU 1.0");
        }
        c1219hH.s("ERROR");
        c1219hH.n(2);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map2 = c1219hH.j;
        map2.put(Constants.REASON, str);
        map2.put("page", pageSource);
        map2.put(StateEvent.Name.ERROR_CODE, "");
        ((C1114E) map.entrySet()).getClass();
        C1111B.f9376a.getClass();
        r42.J().c((FragmentActivity) r42.Q(), c1219hH);
        Unit unit = Unit.f18162a;
    }

    public static void L(L8.c cVar, String fieldName, String errorSpielText, boolean z4) {
        kotlin.jvm.internal.j.g(fieldName, "fieldName");
        kotlin.jvm.internal.j.g(errorSpielText, "errorSpielText");
        EnumC1216e enumC1216eU = cVar.U();
        if (enumC1216eU != null) {
            com.paymaya.common.utility.D dO = cVar.O();
            Ag.k kVar = new Ag.k(cVar, 25);
            Ag.d dVar = new Ag.d(cVar, 23);
            Map mapH = cj.M.h(new Pair(EnumC1212a.FIELD, fieldName), new Pair(EnumC1212a.ERROR, errorSpielText));
            Boolean boolValueOf = Boolean.valueOf(z4);
            if (!z4) {
                boolValueOf = null;
            }
            com.paymaya.common.utility.D.c(dO, enumC1216eU, 11, mapH, boolValueOf != null ? We.s.i(enumC1216eU.name(), "_ERROR") : null, kVar, dVar, 16);
        }
    }

    public static void M(L8.c cVar, String pageName, String str, Map additionalAttributes) {
        kotlin.jvm.internal.j.g(pageName, "pageName");
        kotlin.jvm.internal.j.g(additionalAttributes, "additionalAttributes");
        EnumC1216e enumC1216eU = cVar.U();
        if (enumC1216eU != null) {
            cVar.O();
            com.paymaya.common.utility.D.b(enumC1216eU, 3, cj.L.c(new Pair(EnumC1212a.PAGE_NAME, pageName)), null, str, new L8.a(cVar, additionalAttributes, 3), new L8.b(cVar, 2));
        }
    }

    public static /* synthetic */ void N(L8.c cVar, String str, Map map, int i) {
        String strS = cVar.s();
        if ((i & 4) != 0) {
            map = cj.M.e();
        }
        cVar.A(strS, str, map);
    }

    public static void O(MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment, String actionValue, String str, String str2, Map map, int i) {
        if ((i & 1) != 0) {
            actionValue = "";
        }
        String pageName = j(mayaKycWorkDetailsFragment);
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        String str3 = (i & 16) == 0 ? "DNFBP_Q" : null;
        kotlin.jvm.internal.j.g(actionValue, "actionValue");
        kotlin.jvm.internal.j.g(pageName, "pageName");
        EnumC1216e enumC1216eU = mayaKycWorkDetailsFragment.U();
        if (enumC1216eU != null) {
            mayaKycWorkDetailsFragment.O();
            L8.a aVar = new L8.a(mayaKycWorkDetailsFragment, map, 2);
            L8.b bVar = new L8.b(mayaKycWorkDetailsFragment, 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(EnumC1212a.ACTION, actionValue);
            linkedHashMap.put(EnumC1212a.PAGE_NAME, pageName);
            if (str != null) {
            }
            if (str2 != null) {
                linkedHashMap.put(EnumC1212a.DESTINATION_PAGE, str2);
            }
            com.paymaya.common.utility.D.b(enumC1216eU, 18, linkedHashMap, null, str3, aVar, bVar);
        }
    }

    public static void P(L8.c cVar, String actionValue, String destination, Map additionalAttributes, boolean z4) {
        kotlin.jvm.internal.j.g(actionValue, "actionValue");
        kotlin.jvm.internal.j.g(destination, "destination");
        kotlin.jvm.internal.j.g(additionalAttributes, "additionalAttributes");
        EnumC1216e enumC1216eU = cVar.U();
        if (enumC1216eU != null) {
            com.paymaya.common.utility.D dO = cVar.O();
            L8.a aVar = new L8.a(cVar, additionalAttributes, 5);
            L8.b bVar = new L8.b(cVar, 6);
            Map mapH = cj.M.h(new Pair(EnumC1212a.ACTION, actionValue), new Pair(EnumC1212a.DESTINATION, destination));
            Boolean boolValueOf = Boolean.valueOf(z4);
            if (!z4) {
                boolValueOf = null;
            }
            com.paymaya.common.utility.D.c(dO, enumC1216eU, 18, mapH, boolValueOf != null ? We.s.i(enumC1216eU.name(), "_TAPPED") : null, aVar, bVar, 16);
        }
    }

    public static /* synthetic */ void Q(L8.c cVar, String str, String str2, Map map, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            map = cj.M.e();
        }
        cVar.g0(str, str2, map);
    }

    public static void R() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static final C0496d S(C0496d c0496d, Charset charset) {
        kotlin.jvm.internal.j.g(c0496d, "<this>");
        kotlin.jvm.internal.j.g(charset, "charset");
        String lowerCase = c0496d.f4425d.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        return !lowerCase.equals("text") ? c0496d : c0496d.d(A0.o(charset));
    }

    public static Object T(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(T(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray2.put(T(Array.get(obj, i)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), T(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static int a(boolean[] zArr, int i, int[] iArr, boolean z4) {
        int i4 = 0;
        for (int i6 : iArr) {
            int i10 = 0;
            while (i10 < i6) {
                zArr[i] = z4;
                i10++;
                i++;
            }
            i4 += i6;
            z4 = !z4;
        }
        return i4;
    }

    public static final Charset b(C0496d c0496d) {
        kotlin.jvm.internal.j.g(c0496d, "<this>");
        String strA = c0496d.a("charset");
        if (strA == null) {
            return null;
        }
        try {
            kotlin.jvm.internal.j.g(C2581c.f21467a, "<this>");
            Charset charsetForName = Charset.forName(strA);
            kotlin.jvm.internal.j.f(charsetForName, "forName(...)");
            return charsetForName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static IOException c(Closeable closeable, String str, IOException iOException) {
        try {
            closeable.close();
            return iOException;
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Error closing ".concat(str), e);
            return iOException == null ? e : iOException;
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void f(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r1.h(r4, r13) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.w] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.w] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.w] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d4 -> B:20:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(io.ktor.utils.io.n r17, io.ktor.utils.io.w r18, long r19, ij.AbstractC1609c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.T2.g(io.ktor.utils.io.n, io.ktor.utils.io.w, long, ij.c):java.lang.Object");
    }

    public static final void h(io.ktor.utils.io.n nVar, io.ktor.utils.io.k first, io.ktor.utils.io.k kVar) {
        kotlin.jvm.internal.j.g(nVar, "<this>");
        kotlin.jvm.internal.j.g(first, "first");
        Bj.H.w(C0144h0.f623a, Bj.U.f603a, null, new Rg.c(nVar, first, kVar, null), 2).i(new Rg.b(first, kVar, 0));
    }

    public static final CharSequence i(int i, int i4, int i6, CharSequence... listItems) {
        kotlin.jvm.internal.j.g(listItems, "listItems");
        CharSequence charSequenceConcat = "";
        for (CharSequence charSequence : listItems) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new G5.w(i4, i, i6), 0, charSequence.length(), 0);
            charSequenceConcat = TextUtils.concat(charSequenceConcat, spannableString);
            kotlin.jvm.internal.j.f(charSequenceConcat, "concat(...)");
        }
        return charSequenceConcat;
    }

    public static String j(L8.c cVar) {
        return ((MayaKycActivity) cVar.Q()).s().toString();
    }

    public static final String k(CharsetDecoder charsetDecoder, Mj.i input) {
        kotlin.jvm.internal.j.g(charsetDecoder, "<this>");
        kotlin.jvm.internal.j.g(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(Integer.MAX_VALUE, input.getBuffer().c));
        Charset charset = charsetDecoder.charset();
        kotlin.jvm.internal.j.d(charset);
        if (charset.equals(C2581c.f21468b)) {
            sb2.append((CharSequence) Mj.j.e(input));
        } else {
            Yg.a.b(input);
            byte[] bArrD = Mj.j.d(input, -1);
            Charset charset2 = charsetDecoder.charset();
            kotlin.jvm.internal.j.d(charset2);
            sb2.append((CharSequence) new String(bArrD, charset2));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    public static CharSequence l(L8.c cVar, NavDirections direction) {
        kotlin.jvm.internal.j.g(direction, "direction");
        return com.paymaya.common.utility.C.E((FragmentActivity) cVar.Q(), direction, R.id.maya_kyc_nav_host_fragment);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:26:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:25:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(io.ktor.utils.io.n r12, long r13, ij.AbstractC1609c r15) throws java.io.EOFException {
        /*
            boolean r0 = r15 instanceof io.ktor.utils.io.p
            if (r0 == 0) goto L13
            r0 = r15
            io.ktor.utils.io.p r0 = (io.ktor.utils.io.p) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            io.ktor.utils.io.p r0 = new io.ktor.utils.io.p
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.e
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r12 = r0.c
            long r4 = r0.f17544b
            io.ktor.utils.io.n r14 = r0.f17543a
            bj.AbstractC1039j.b(r15)
            goto L5d
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            bj.AbstractC1039j.b(r15)
            r4 = r13
        L39:
            r6 = 0
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 <= 0) goto L89
            boolean r15 = r12.i()
            if (r15 != 0) goto L89
            int r15 = p(r12)
            if (r15 != 0) goto L60
            r0.f17543a = r12
            r0.f17544b = r4
            r0.c = r13
            r0.f = r3
            java.lang.Object r15 = r12.h(r3, r0)
            if (r15 != r1) goto L5a
            return r1
        L5a:
            r10 = r13
            r14 = r12
            r12 = r10
        L5d:
            r10 = r12
            r12 = r14
            r13 = r10
        L60:
            Mj.i r15 = r12.f()
            long r6 = Yg.a.b(r15)
            long r6 = java.lang.Math.min(r13, r6)
            Mj.i r15 = r12.f()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.j.g(r15, r2)
            r15.request(r6)
            long r8 = Yg.a.b(r15)
            long r8 = java.lang.Math.min(r6, r8)
            Mj.a r15 = r15.getBuffer()
            r15.skip(r8)
            long r13 = r13 - r6
            goto L39
        L89:
            long r4 = r4 - r13
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.T2.m(io.ktor.utils.io.n, long, ij.c):java.lang.Object");
    }

    public static final void o(CharsetEncoder charsetEncoder, Mj.a aVar, CharSequence input, int i, int i4) throws CharacterCodingException {
        kotlin.jvm.internal.j.g(charsetEncoder, "<this>");
        kotlin.jvm.internal.j.g(input, "input");
        if (i >= i4) {
            return;
        }
        do {
            byte[] bArrK = A0.k(charsetEncoder, input, i, i4);
            aVar.k(bArrK, 0, bArrK.length);
            int length = bArrK.length;
            if (length < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i += length;
        } while (i < i4);
    }

    public static final int p(io.ktor.utils.io.n nVar) {
        kotlin.jvm.internal.j.g(nVar, "<this>");
        return (int) nVar.f().getBuffer().c;
    }

    public static HashMap q(int i, int i4) {
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        map.put("size", String.valueOf(i4));
        return map;
    }

    public static HashMap s() {
        HashMap mapP = androidx.media3.datasource.cache.c.p("device_type", "android");
        mapP.put("device_resolution", com.paymaya.common.utility.C.f10391a);
        return mapP;
    }

    public static HashMap t() {
        HashMap mapP = androidx.media3.datasource.cache.c.p("device_type", "android");
        mapP.put("device_resolution", com.paymaya.common.utility.C.f10391a);
        return mapP;
    }

    public static HashMap u(int i, String str) {
        HashMap mapS = s();
        mapS.put("category", str);
        mapS.put("page", String.valueOf(i));
        return mapS;
    }

    public static HashMap v(String str, String str2) {
        return androidx.media3.datasource.cache.c.q(AppsFlyerProperties.CHANNEL, str, "request-reference-no", str2);
    }

    public static com.google.gson.o w(j3.a aVar) {
        int i = aVar.f17701o;
        if (i == 2) {
            aVar.f17701o = 1;
        }
        try {
            try {
                return com.google.gson.internal.e.i(aVar);
            } finally {
                aVar.M(i);
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e);
        }
    }

    public static com.google.gson.o x(String str) {
        try {
            try {
                j3.a aVar = new j3.a(new StringReader(str));
                com.google.gson.o oVarW = w(aVar);
                try {
                    oVarW.getClass();
                    if (!(oVarW instanceof com.google.gson.p) && aVar.peek() != 10) {
                        throw new JsonSyntaxException("Did not consume the entire document.");
                    }
                    return oVarW;
                } catch (NumberFormatException e) {
                    e = e;
                    throw new JsonSyntaxException(e);
                }
            } catch (IOException e7) {
                throw new JsonIOException(e7);
            }
        } catch (MalformedJsonException | NumberFormatException e10) {
            e = e10;
        }
    }

    public static String y(L8.c cVar) {
        CharSequence label;
        NavDestination destination;
        NavBackStackEntry previousBackStackEntry = ActivityKt.findNavController((MayaKycActivity) cVar.Q(), R.id.maya_kyc_nav_host_fragment).getPreviousBackStackEntry();
        if (previousBackStackEntry == null || (destination = previousBackStackEntry.getDestination()) == null || (label = destination.getLabel()) == null) {
            label = "";
        }
        return label.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(io.ktor.utils.io.n r5, byte[] r6, int r7, ij.AbstractC1609c r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.q
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.q r0 = (io.ktor.utils.io.q) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            io.ktor.utils.io.q r0 = new io.ktor.utils.io.q
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r7 = r0.c
            byte[] r6 = r0.f17546b
            io.ktor.utils.io.n r5 = r0.f17545a
            bj.AbstractC1039j.b(r8)
            goto L5e
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            bj.AbstractC1039j.b(r8)
            boolean r8 = r5.i()
            if (r8 == 0) goto L45
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        L45:
            Mj.i r8 = r5.f()
            boolean r8 = r8.exhausted()
            if (r8 == 0) goto L5e
            r0.f17545a = r5
            r0.f17546b = r6
            r0.c = r7
            r0.f = r3
            java.lang.Object r8 = r5.h(r3, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            boolean r8 = r5.i()
            if (r8 == 0) goto L6a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        L6a:
            Mj.i r5 = r5.f()
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.j.g(r5, r8)
            java.lang.String r8 = "buffer"
            kotlin.jvm.internal.j.g(r6, r8)
            r8 = 0
            int r5 = r5.A(r8, r7, r6)
            if (r5 != r4) goto L80
            goto L81
        L80:
            r8 = r5
        L81:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.T2.z(io.ktor.utils.io.n, byte[], int, ij.c):java.lang.Object");
    }

    @Override // C3.n
    public K3.b e(String str, C3.a aVar, int i, int i4, HashMap map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i4 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i4);
        }
        int iR = r();
        if (map != null) {
            C3.c cVar = C3.c.f;
            if (map.containsKey(cVar)) {
                iR = Integer.parseInt(map.get(cVar).toString());
            }
        }
        boolean[] zArrN = n(str);
        int length = zArrN.length;
        int i6 = iR + length;
        int iMax = Math.max(i, i6);
        int iMax2 = Math.max(1, i4);
        int i10 = iMax / i6;
        int i11 = (iMax - (length * i10)) / 2;
        K3.b bVar = new K3.b(iMax, iMax2);
        int i12 = 0;
        while (i12 < length) {
            if (zArrN[i12]) {
                bVar.g(i11, 0, i10, iMax2);
            }
            i12++;
            i11 += i10;
        }
        return bVar;
    }

    public abstract boolean[] n(String str);

    public int r() {
        return 10;
    }
}
