package qk;

import Bj.C0162u;
import Bj.H;
import Gj.q;
import S1.y;
import We.s;
import ag.C0707q;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1132s;
import cj.I;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.conf.DynatraceConfigurationBuilder;
import com.google.firebase.messaging.C1186d;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeMfaInitialFragment;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.svM7M6;
import hj.EnumC1578a;
import ij.AbstractC1607a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.ISODateTimeFormat;
import org.json.JSONException;
import org.json.JSONObject;
import ph.C2070f1;
import s.AbstractC2217b;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static h f19820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f19821b;
    public static boolean c;

    public static final int A(Context context) {
        j.g(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            j.f(packageName, "getPackageName(...)");
            return packageManager.getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            yk.a.e();
            return 0;
        }
    }

    public static void B(Application context) {
        j.g(context, "context");
        if (c) {
            yk.a.g("Maya-Dynatrace").getClass();
            C2070f1.b();
            return;
        }
        yk.a.g("Maya-Dynatrace").getClass();
        C2070f1.b();
        yk.a.g("Maya-Dynatrace").getClass();
        C2070f1.b();
        Dynatrace.startup(context, new DynatraceConfigurationBuilder("86f8147b-7878-4579-980f-e6d60dbdcfc3", "https://bf46601txs.bf.dynatrace.com/mbeacon").withUserOptIn(false).withDebugLogging(false).buildConfiguration());
        yk.a.g("Maya-Dynatrace").getClass();
        C2070f1.b();
        c = true;
    }

    public static void D(x9.b bVar) {
        MayaMultiTypeMfaInitialFragment mayaMultiTypeMfaInitialFragment = (MayaMultiTypeMfaInitialFragment) bVar;
        y9.c cVar = mayaMultiTypeMfaInitialFragment.f12941V;
        if (cVar != null) {
            String string = mayaMultiTypeMfaInitialFragment.getString(R.string.maya_label_that_didnt_load_right);
            String string2 = mayaMultiTypeMfaInitialFragment.getString(R.string.maya_label_please_check_your_internet);
            String string3 = mayaMultiTypeMfaInitialFragment.getString(R.string.maya_label_close);
            j.f(string3, "getString(...)");
            ((MayaMfaActivity) cVar).h2(2131231238, string, string2, string3, new n0.e(7));
        }
    }

    public static final Object E(q qVar, q qVar2, Function2 function2) {
        Object c0162u;
        Object objU;
        try {
            if (function2 instanceof AbstractC1607a) {
                D.d(2, function2);
                c0162u = function2.invoke(qVar2, qVar);
            } else {
                c0162u = hj.h.c(function2, qVar2, qVar);
            }
        } catch (Throwable th2) {
            c0162u = new C0162u(th2, false);
        }
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        if (c0162u == enumC1578a || (objU = qVar.U(c0162u)) == H.e) {
            return enumC1578a;
        }
        if (objU instanceof C0162u) {
            throw ((C0162u) objU).f642a;
        }
        return H.B(objU);
    }

    public static byte[] F(C1186d c1186d) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < iMin2) {
                int i6 = c1186d.read(bArr, i4, iMin2 - i4);
                if (i6 == -1) {
                    return q(i, arrayDeque);
                }
                i4 += i6;
                i += i6;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (c1186d.read() == -1) {
            return q(2147483639, arrayDeque);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static String G(int i) {
        switch (AbstractC2217b.c(i)) {
            case 0:
                return TypedValues.Custom.S_FLOAT;
            case 1:
                return "int";
            case 2:
            case 7:
                return "byte";
            case 3:
                return "long";
            case 4:
                return TypedValues.Custom.S_STRING;
            case 5:
                return "bool";
            case 6:
                return "short";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + AbstractC1331a.A(i) + " is not supported yet");
        }
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final List b(Throwable th2) {
        return C1132s.g(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
    }

    public static final void c(MayaInputLayout mayaInputLayout) {
        mayaInputLayout.getInputEditText().addTextChangedListener(new G5.i(mayaInputLayout.getInputEditText()));
    }

    public static String d(int i, int i4, String str) {
        if (i < 0) {
            return x3.d.r("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return x3.d.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(s.f(i4, "negative size: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(Kg.c r5, java.nio.charset.Charset r6, ij.AbstractC1609c r7) {
        /*
            boolean r0 = r7 instanceof Kg.e
            if (r0 == 0) goto L13
            r0 = r7
            Kg.e r0 = (Kg.e) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Kg.e r0 = new Kg.e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2666b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.nio.charset.CharsetDecoder r5 = r0.f2665a
            bj.AbstractC1039j.b(r7)
            goto L6d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            bj.AbstractC1039j.b(r7)
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.j.g(r5, r7)
            Ng.d r7 = S1.s.g(r5)
            r2 = 0
            if (r7 == 0) goto L45
            java.nio.charset.Charset r7 = M8.T2.b(r7)
            goto L46
        L45:
            r7 = r2
        L46:
            if (r7 != 0) goto L49
            goto L4a
        L49:
            r6 = r7
        L4a:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            xg.b r5 = r5.b()
            java.lang.Class<Mj.i> r7 = Mj.i.class
            kotlin.jvm.internal.e r4 = kotlin.jvm.internal.z.a(r7)
            kotlin.jvm.internal.F r2 = kotlin.jvm.internal.z.c(r7)     // Catch: java.lang.Throwable -> L5c
        L5c:
            Wg.a r7 = new Wg.a
            r7.<init>(r4, r2)
            r0.f2665a = r6
            r0.c = r3
            java.lang.Object r7 = r5.a(r7, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            r5 = r6
        L6d:
            if (r7 == 0) goto L79
            Mj.i r7 = (Mj.i) r7
            kotlin.jvm.internal.j.d(r5)
            java.lang.String r5 = M8.T2.k(r5, r7)
            return r5
        L79:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.io.Source"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.i.e(Kg.c, java.nio.charset.Charset, ij.c):java.lang.Object");
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        boolean z4 = true;
        for (char c10 : charArray) {
            if (z4 && Character.isLetter(c10)) {
                sb2.append(Character.toUpperCase(c10));
                z4 = false;
            } else {
                if (Character.isWhitespace(c10)) {
                    z4 = true;
                }
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    public static void g(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(boolean z4, String str, long j) {
        if (!z4) {
            throw new IllegalArgumentException(x3.d.r(str, Long.valueOf(j)));
        }
    }

    public static void j(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void k(int i, int i4) {
        String strR;
        if (i < 0 || i >= i4) {
            if (i < 0) {
                strR = x3.d.r("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(s.f(i4, "negative size: "));
                }
                strR = x3.d.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strR);
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void n(int i, int i4) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(d(i, i4, "index"));
        }
    }

    public static void o(int i, int i4, int i6) {
        if (i < 0 || i4 < i || i4 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? d(i, i6, "start index") : (i4 < 0 || i4 > i6) ? d(i4, i6, "end index") : x3.d.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    public static void p(boolean z4, String str) {
        if (!z4) {
            throw new IllegalStateException(str);
        }
    }

    public static byte[] q(int i, ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static String r(String value, DateTimeZone timeZone) {
        Object objA;
        String string;
        j.g(value, "value");
        j.g(timeZone, "timeZone");
        try {
            C1037h.a aVar = C1037h.f9166b;
            DateTime dateTime = ISODateTimeFormat.dateTime().withOffsetParsed().parseDateTime(value).toDateTime(timeZone);
            objA = (dateTime == null || (string = dateTime.toString("MMM dd, yyyy, h:mm a")) == null) ? null : z.t(z.t(string, "am", "AM"), "pm", "PM");
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        return (String) (objA instanceof C1038i ? null : objA);
    }

    public static ShortcutInfo s(int i, PayMayaApplication payMayaApplication, String str, String str2, String str3, int i4) {
        ShortcutInfo shortcutInfoBuild = Oe.a.j(payMayaApplication, str).setShortLabel(str3).setLongLabel(str3).setIcon(Icon.createWithResource(payMayaApplication, i4)).setIntents(new Intent[]{new Intent("android.intent.action.VIEW", Uri.parse(str2), payMayaApplication, DeepLinkActivity.class)}).setRank(i).build();
        j.f(shortcutInfoBuild, "build(...)");
        return shortcutInfoBuild;
    }

    public static final boolean t(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                j.g(objArr, "<this>");
                Iterable intRange = new IntRange(0, objArr.length - 1, 1);
                if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                    Iterator it = intRange.iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((I) it).nextInt();
                        if (!t(objArr[iNextInt], objArr2[iNextInt])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Iterable iterableE = C1132s.e((Collection) obj);
                if (!(iterableE instanceof Collection) || !((Collection) iterableE).isEmpty()) {
                    Iterator it2 = iterableE.iterator();
                    while (it2.hasNext()) {
                        int iNextInt2 = ((I) it2).nextInt();
                        if (!t(list.get(iNextInt2), list2.get(iNextInt2))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return j.b(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!map2.containsKey(entry.getKey()) || !t(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static C0707q w(Context context) {
        l4.a aVar;
        C0707q c0707qC;
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_names", 0);
        String strJ = androidx.camera.core.impl.a.j(str, Global.COLON, str2);
        String string = svM7M6.getString(sharedPreferences, strJ, null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                C0707q c0707q = new C0707q();
                c0707q.f7224a = jSONObject.getString("manufacturer");
                c0707q.f7225b = jSONObject.getString("market_name");
                c0707q.c = jSONObject.getString("codename");
                c0707q.f7226d = jSONObject.getString("model");
                return c0707q;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            aVar = new l4.a(context);
            try {
                c0707qC = aVar.c();
            } finally {
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        if (c0707qC == null) {
            aVar.close();
            return (str.equals(Build.DEVICE) || !Build.MODEL.equals(str2)) ? new C0707q(null, null, str, str2) : new C0707q(Build.MANUFACTURER, str, str, str2);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("manufacturer", c0707qC.f7224a);
        jSONObject2.put("codename", c0707qC.c);
        jSONObject2.put("model", c0707qC.f7226d);
        jSONObject2.put("market_name", c0707qC.f7225b);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(strJ, jSONObject2.toString());
        editorEdit.apply();
        aVar.close();
        return c0707qC;
        e7.printStackTrace();
        if (str.equals(Build.DEVICE)) {
        }
    }

    public static Object x(y yVar) {
        Object obj;
        boolean z4 = false;
        if (!yVar.isDone()) {
            throw new IllegalStateException(x3.d.r("Future was expected to be done: %s", yVar));
        }
        while (true) {
            try {
                obj = yVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th2) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Jg.b z(Kg.c cVar) {
        j.g(cVar, "<this>");
        return cVar.b().c();
    }

    public abstract boolean C(Class cls);

    public abstract Method u(Class cls, Field field);

    public abstract Constructor v(Class cls);

    public abstract String[] y(Class cls);
}
