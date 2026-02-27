package com.shield.android.context;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.PowerManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import dOYHB6.yFtIp6.svM7M6;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15145d = {627160714, 151370753, 799787994, 1399197149, 391978730, 1319882962, 986147795, 1042843922, 1709143568};
    private static final String dw;
    private final Context dt;
    private final NativeUtils du;
    private final String dv;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15146d = {1385918470};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15146d[0]) ^ 1385918471, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return k.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            JSONObject jSONObject = new JSONObject();
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bd"), k.b(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("be"), k.c(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bf"), k.d(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bg"), k.e(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bh"), k.f(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bi"), k.g(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("cf"), k.h(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bj"), k.i(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bk"), k.j(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue(CmcdConfiguration.KEY_BUFFER_LENGTH), k.k(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bm"), k.l(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bn"), k.m(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bo"), k.this.aI());
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bp"), k.o(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bq"), k.p(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("br"), k.q(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bt"), k.r(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bu"), k.s(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bv"), k.t(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bw"), k.u(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bx"), k.v(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("by"), k.w(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("bz"), k.x(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("ca"), k.y(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.i), k.z(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("cc"), k.A(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("cd"), k.B(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue("ce"), k.C(k.this));
            com.shield.android.internal.i.a(jSONObject, k.this.du.getKeyValue(CmcdConfiguration.KEY_BUFFER_STARVATION), k.this.aJ());
            String keyValue = k.this.du.getKeyValue("en");
            k kVar = k.this;
            com.shield.android.internal.i.a(jSONObject, keyValue, k.a(kVar, kVar.dt));
            concurrentHashMapR.put(k.this.du.getKeyValue("bc"), jSONObject.toString());
            return concurrentHashMapR;
        }
    }

    static {
        new a((((int) 391978730) ^ 391978730) == true ? (byte) 1 : (byte) 0);
        dw = "k";
    }

    public k(Context context, NativeUtils nativeUtils, String str) {
        kotlin.jvm.internal.j.g(context, g("颢颮颯颵颤颹颵"));
        kotlin.jvm.internal.j.g(nativeUtils, g("颯颠颵風颷颤颔颵風颭颲"));
        kotlin.jvm.internal.j.g(str, g("颲風颵颤颈颥"));
        this.dt = context;
        this.du = nativeUtils;
        this.dv = str;
    }

    public static final /* synthetic */ String A(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颠颴颵颮颞颱颴颯颢颵颴颠颵颤")));
    }

    public static final /* synthetic */ String B(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颠颴颵颮颞颳颤颱颭颠颢颤")));
    }

    public static final /* synthetic */ String C(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颲颩颮颶颞颱颠颲颲颶颮颳颥")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String aI() {
        if ((com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? com.shield.android.internal.i.h(this.dt, g("颠風颳颱颭颠颯颤颞颬颮颥颤颞颮颯")) : com.shield.android.internal.i.d(this.dt, g("颠風颳颱颭颠颯颤颞颬颮颥颤颞颮颯"))) != (((int) f15145d[1]) ^ 151370752)) {
            return svM7M6.getString(com.shield.android.internal.i.k(this.dt, this.dv), g("颭颠颲颵颞颠風颳颱颭颠颯颤颞颬颮颥颤颞颮颯"), g("飬飰"));
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        try {
            SharedPreferences.Editor editorEdit = com.shield.android.internal.i.k(this.dt, this.dv).edit();
            editorEdit.putString(g("颭颠颲颵颞颠風颳颱颭颠颯颤颞颬颮颥颤颞颮颯"), strValueOf);
            editorEdit.apply();
        } catch (Exception unused) {
        }
        return strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String aJ() {
        try {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.dt);
            return defaultAdapter == null ? g("飬飰") : !defaultAdapter.isEnabled() ? g("飱") : g("飰");
        } catch (Exception unused) {
            return g("颤颳颳颮颳");
        }
    }

    public static final /* synthetic */ String b(k kVar) {
        return com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? com.shield.android.internal.i.i(kVar.dt, g("颠颥颣颞颤颯颠颣颭颤颥")) : com.shield.android.internal.i.e(kVar.dt, g("颠颥颣颞颤颯颠颣颭颤颥"));
    }

    public static final /* synthetic */ String c(k kVar) {
        return com.shield.android.internal.i.e(kVar.dt, g("颲颢颳颤颤颯颞颣颳風颦颩颵颯颤颲颲"));
    }

    public static final /* synthetic */ String d(k kVar) {
        return com.shield.android.internal.i.e(kVar.dt, g("颲颢颳颤颤颯颞颣颳風颦颩颵颯颤颲颲颞颬颮颥颤"));
    }

    public static final /* synthetic */ String e(k kVar) {
        Object systemService = kVar.dt.getSystemService(g("颠颴颥風颮"));
        kotlin.jvm.internal.j.e(systemService, g("颯颴颭颭飡颢颠颯颯颮颵飡颣颤飡颢颠颲颵飡颵颮飡颯颮颯飬颯颴颭颭飡颵颸颱颤飡颠颯颥颳颮風颥飯颬颤颥風颠飯颀颴颥風颮颌颠颯颠颦颤颳"));
        int ringerMode = ((AudioManager) systemService).getRingerMode();
        return ringerMode != 0 ? ringerMode != 1 ? g("颏颎颓颌颀颍") : g("颗颈颃颓颀颕预") : g("颒颈颍预颏颕");
    }

    public static final /* synthetic */ String f(k kVar) {
        int i;
        int i4;
        Object systemService = kVar.dt.getSystemService(g("颲颤颯颲颮颳"));
        kotlin.jvm.internal.j.e(systemService, g("颯颴颭颭飡颢颠颯颯颮颵飡颣颤飡颢颠颲颵飡颵颮飡颯颮颯飬颯颴颭颭飡颵颸颱颤飡颠颯颥颳颮風颥飯颩颠颳颥颶颠颳颤飯颒颤颯颲颮颳颌颠颯颠颦颤颳"));
        StringBuilder sb2 = new StringBuilder();
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        if (sensorList != null) {
            for (Sensor sensor : sensorList) {
                if (sensor != null) {
                    if (sb2.length() == 0) {
                        i = (int) f15145d[1];
                        i4 = 151370752;
                    } else {
                        i = (int) f15145d[4];
                        i4 = 391978730;
                    }
                    if ((i ^ i4) != 0) {
                        sb2.append(sensor.getName());
                    } else {
                        sb2.append(g("飭飡"));
                        sb2.append(sensor.getName());
                    }
                }
            }
        }
        return sb2.toString();
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15145d[4]) ^ 391978730;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15145d;
            long j = jArr[8];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1709174481) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1709174481) + (((int) j6) ^ 151370752), i4 | (~(((int) j) ^ 1709174481)), i6, (((int) j) ^ 1709174481) + cCharAt + (((int) j6) ^ 151370752) + ((~(((int) j) ^ 1709174481)) | i4)));
            long j7 = f15145d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 151370752) + (((int) j7) ^ 151370752) + ((~(((int) j7) ^ 151370752)) | i10) + (((((int) j7) ^ 151370752) + i) - ((((((int) j7) ^ 151370752) + i) + (((int) j7) ^ 151370752)) + ((~(((int) j7) ^ 151370752)) | i10)));
        }
        return sb2.toString();
    }

    public static final /* synthetic */ String h(k kVar) {
        String strF = com.shield.android.internal.i.f(kVar.dt, g("颥颤颧颠颴颭颵颞風颯颱颴颵颞颬颤颵颩颮颥"));
        String strG = g("飯");
        String strG2 = g("颞");
        long j = f15145d[4];
        return zj.z.t(strF, strG, strG2);
    }

    public static final /* synthetic */ String i(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颠颢颢颤颭颤颳颮颬颤颵颤颳颞颳颮颵颠颵風颮颯")));
    }

    public static final /* synthetic */ String j(k kVar) {
        return com.shield.android.internal.i.e(kVar.dt, g("颵風颬颤颞飰飳颞飳飵"));
    }

    public static final /* synthetic */ String k(k kVar) {
        return com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? com.shield.android.internal.i.i(kVar.dt, g("颥颤颷風颢颤颞颱颳颮颷風颲風颮颯颤颥")) : com.shield.android.internal.i.e(kVar.dt, g("颥颤颷風颢颤颞颱颳颮颷風颲風颮颯颤颥"));
    }

    public static final /* synthetic */ String l(k kVar) {
        return com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? String.valueOf(com.shield.android.internal.i.h(kVar.dt, g("颥颤颷颤颭颮颱颬颤颯颵颞颲颤颵颵風颯颦颲颞颤颯颠颣颭颤颥"))) : com.shield.android.internal.i.f(((int) f15145d[6]) ^ 986147779) ? String.valueOf(com.shield.android.internal.i.g(kVar.dt, g("颥颤颷颤颭颮颱颬颤颯颵颞颲颤颵颵風颯颦颲颞颤颯颠颣颭颤颥"))) : g("飱");
    }

    public static final /* synthetic */ String m(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颥颵颬颧颞颵颮颯颤")));
    }

    public static final /* synthetic */ String o(k kVar) {
        return com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? String.valueOf(com.shield.android.internal.i.h(kVar.dt, g("颠颴颵颮颞颵風颬颤"))) : String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颠颴颵颮颞颵風颬颤")));
    }

    public static final /* synthetic */ String p(k kVar) {
        return com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? String.valueOf(com.shield.android.internal.i.h(kVar.dt, g("颠颴颵颮颞颵風颬颤"))) : String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颠颴颵颮颞颵風颬颤")));
    }

    public static final /* synthetic */ String q(k kVar) {
        return com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? String.valueOf(com.shield.android.internal.i.h(kVar.dt, g("颣颭颴颤颵颮颮颵颩颞颮颯"))) : String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颣颭颴颤颵颮颮颵颩颞颮颯")));
    }

    public static final /* synthetic */ String r(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颤颯颥颞颣颴颵颵颮颯颞颣颤颩颠颷風颮颳")));
    }

    public static final /* synthetic */ String s(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颩颠颱颵風颢颞颧颤颤颥颣颠颢颪颞颤颯颠颣颭颤颥")));
    }

    public static final /* synthetic */ String t(k kVar) {
        return com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? String.valueOf(com.shield.android.internal.i.g(kVar.dt, g("風颯颲颵颠颭颭颞颯颮颯颞颬颠颳颪颤颵颞颠颱颱颲"))) : String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("風颯颲颵颠颭颭颞颯颮颯颞颬颠颳颪颤颵颞颠颱颱颲")));
    }

    public static final /* synthetic */ String u(k kVar) {
        int i;
        int i4;
        Object systemService = kVar.dt.getSystemService(g("颪颤颸颦颴颠颳颥"));
        kotlin.jvm.internal.j.e(systemService, g("颯颴颭颭飡颢颠颯颯颮颵飡颣颤飡颢颠颲颵飡颵颮飡颯颮颯飬颯颴颭颭飡颵颸颱颤飡颠颯颥颳颮風颥飯颠颱颱飯颊颤颸颦颴颠颳颥颌颠颯颠颦颤颳"));
        if (((KeyguardManager) systemService).isKeyguardSecure()) {
            i = (int) f15145d[1];
            i4 = 151370752;
        } else {
            i = (int) f15145d[4];
            i4 = 391978730;
        }
        return String.valueOf(i ^ i4);
    }

    public static final /* synthetic */ String v(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颲颢颳颤颤颯颞颮颧颧颞颵風颬颤颮颴颵")));
    }

    public static final /* synthetic */ String w(k kVar) {
        return com.shield.android.internal.i.f(kVar.dt, g("颲颤颵颵風颯颦颲颞颢颭颠颲颲颯颠颬颤"));
    }

    public static final /* synthetic */ String x(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颲颮颴颯颥颞颤颧颧颤颢颵颲颞颤颯颠颣颭颤颥")));
    }

    public static final /* synthetic */ String y(k kVar) {
        return com.shield.android.internal.i.f(((int) f15145d[0]) ^ 627160731) ? String.valueOf(com.shield.android.internal.i.h(kVar.dt, g("颲颵颠颸颞颮颯颞颶颩風颭颤颞颱颭颴颦颦颤颥颞風颯"))) : String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颲颵颠颸颞颮颯颞颶颩風颭颤颞颱颭颴颦颦颤颥颞風颯")));
    }

    public static final /* synthetic */ String z(k kVar) {
        return String.valueOf(com.shield.android.internal.i.d(kVar.dt, g("颠颴颵颮颞颢颠颱颲")));
    }

    public final List<g> aK() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        return cj.r.c(new g(dw + ((((int) f15145d[2]) ^ 799788011) == true ? (char) 1 : (char) 0), 0L, null, new b(null), ((int) f15145d[3]) ^ 1399197147));
    }

    public static final /* synthetic */ String a(k kVar, Context context) {
        Object systemService = context.getSystemService(g("颱颮颶颤颳"));
        kotlin.jvm.internal.j.e(systemService, g("颯颴颭颭飡颢颠颯颯颮颵飡颣颤飡颢颠颲颵飡颵颮飡颯颮颯飬颯颴颭颭飡颵颸颱颤飡颠颯颥颳颮風颥飯颮颲飯频颮颶颤颳颌颠颯颠颦颤颳"));
        PowerManager powerManager = (PowerManager) systemService;
        return Build.VERSION.SDK_INT >= (((int) f15145d[7]) ^ 1042843910) ? powerManager.isInteractive() ? g("颵颳颴颤") : g("颧颠颭颲颤") : powerManager.isScreenOn() ? g("颵颳颴颤") : g("颧颠颭颲颤");
    }

    public static final /* synthetic */ String g(k kVar) {
        Object systemService = kVar.dt.getSystemService(g("風颯颱颴颵颞颬颤颵颩颮颥"));
        kotlin.jvm.internal.j.e(systemService, g("颯颴颭颭飡颢颠颯颯颮颵飡颣颤飡颢颠颲颵飡颵颮飡颯颮颯飬颯颴颭颭飡颵颸颱颤飡颠颯颥颳颮風颥飯颷風颤颶飯風颯颱颴颵颬颤颵颩颮颥飯颈颯颱颴颵颌颤颵颩颮颥颌颠颯颠颦颤颳"));
        List<InputMethodInfo> inputMethodList = ((InputMethodManager) systemService).getInputMethodList();
        if (inputMethodList == null || inputMethodList.size() <= 0) {
            return g("");
        }
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15145d[4]) ^ 391978730;
        int size = inputMethodList.size();
        while (i < size) {
            String packageName = inputMethodList.get(i).getPackageName();
            String strG = g("飯");
            String strG2 = g("颞");
            long j = f15145d[4];
            sb2.append(zj.z.t(packageName, strG, strG2));
            long[] jArr = f15145d;
            int i4 = -(((int) jArr[1]) ^ 151370752);
            if (((((int) jArr[5]) ^ 1319882960) * (i4 & i)) + (i ^ i4) < inputMethodList.size()) {
                sb2.append(g("飭飡"));
            }
            int i6 = ((int) f15145d[1]) ^ 151370752;
            int i10 = i + i6;
            int i11 = i10 + i6 + ((~i) | (~i6));
            i = (i10 - i11) + i11;
        }
        return sb2.toString();
    }
}
