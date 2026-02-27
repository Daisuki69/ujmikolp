package com.shield.android.context;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ServiceInfo;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.exifinterface.media.ExifInterface;
import cj.C1112C;
import cj.C1132s;
import com.google.android.gms.ads.RequestConfiguration;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import com.shield.android.shieldsignature.NTPTimestamp;
import com.shield.android.shieldsignature.ShieldSignatureGenerator;
import dOYHB6.yFtIp6.ht2aO8;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.lang.reflect.Field;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    private final Context cQ;
    private final r cR;
    private final NativeUtils cS;
    private boolean cT;
    private final boolean cU;

    /* JADX INFO: renamed from: ck, reason: collision with root package name */
    private String f15107ck;

    public static final class a extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15108d = {1515478003};

        public a(InterfaceC1526a<? super a> interfaceC1526a) {
            super(((int) f15108d[0]) ^ 1515478002, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return e.this.new a(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((a) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            String keyValue = e.this.am().getKeyValue("N");
            e eVar = e.this;
            concurrentHashMapR.put(keyValue, TextUtils.join(",", e.b(eVar, eVar.al())));
            String keyValue2 = e.this.am().getKeyValue("O");
            e eVar2 = e.this;
            concurrentHashMapR.put(keyValue2, TextUtils.join(",", e.c(eVar2, eVar2.al())));
            return concurrentHashMapR;
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15109d = {1770623830};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15109d[0]) ^ 1770623831, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return e.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put(e.this.am().getKeyValue("I"), e.p(e.this.al()));
            return concurrentHashMapR;
        }
    }

    public static final class c extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15110d = {90102924};

        public c(InterfaceC1526a<? super c> interfaceC1526a) {
            super(((int) f15110d[0]) ^ 90102925, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return e.this.new c(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((c) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            String keyValue = e.this.am().getKeyValue(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16189u);
            e eVar = e.this;
            concurrentHashMapR.put(keyValue, eVar.r(eVar.al()));
            return concurrentHashMapR;
        }
    }

    public static final class d extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15111d = {385578811};

        public d(InterfaceC1526a<? super d> interfaceC1526a) {
            super(((int) f15111d[0]) ^ 385578810, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return e.this.new d(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((d) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            String keyValue = e.this.am().getKeyValue("J");
            e eVar = e.this;
            concurrentHashMapR.put(keyValue, eVar.q(eVar.al()));
            return concurrentHashMapR;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.e$e, reason: collision with other inner class name */
    public static final class C0056e extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15112d = {1736886100};

        public C0056e(InterfaceC1526a<? super C0056e> interfaceC1526a) {
            super(((int) f15112d[0]) ^ 1736886101, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return e.this.new C0056e(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((C0056e) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            e eVar = e.this;
            Pair pairD = e.d(eVar, eVar.al());
            e eVar2 = e.this;
            concurrentHashMapR.put(eVar2.am().getKeyValue(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.m), pairD.f18160a);
            concurrentHashMapR.put(eVar2.am().getKeyValue("ep"), pairD.f18161b);
            return concurrentHashMapR;
        }
    }

    public static final class f extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15113d = {1532208435};

        public f(InterfaceC1526a<? super f> interfaceC1526a) {
            super(((int) f15113d[0]) ^ 1532208434, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return e.this.new f(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((f) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put(e.this.am().getKeyValue("K"), e.this.at());
            String keyValue = e.this.am().getKeyValue("M");
            e eVar = e.this;
            concurrentHashMapR.put(keyValue, e.f(eVar, eVar.al()));
            String keyValue2 = e.this.am().getKeyValue("R");
            e eVar2 = e.this;
            concurrentHashMapR.put(keyValue2, String.valueOf(e.g(eVar2, eVar2.al())));
            String keyValue3 = e.this.am().getKeyValue("S");
            e eVar3 = e.this;
            concurrentHashMapR.put(keyValue3, e.h(eVar3, eVar3.al()));
            concurrentHashMapR.put(e.this.am().getKeyValue("Q"), ExifInterface.GPS_MEASUREMENT_2D);
            concurrentHashMapR.put(e.this.am().getKeyValue("C"), Locale.getDefault().getDisplayLanguage());
            concurrentHashMapR.put(e.this.am().getKeyValue(Ef.a.c), e.this.ar());
            concurrentHashMapR.put(e.this.am().getKeyValue(ExifInterface.LONGITUDE_EAST), Build.VERSION.RELEASE);
            concurrentHashMapR.put(e.this.am().getKeyValue("F"), e.this.as());
            concurrentHashMapR.put(e.this.am().getKeyValue(RequestConfiguration.MAX_AD_CONTENT_RATING_G), e.d(e.this));
            concurrentHashMapR.put(e.this.am().getKeyValue(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16182n), e.e(e.this));
            NTPTimestamp nTPTime = ShieldSignatureGenerator.getNTPTime();
            if (nTPTime.isNTP()) {
                concurrentHashMapR.put(e.this.am().getKeyValue("ev"), String.valueOf(nTPTime.getTimestamp()));
            }
            concurrentHashMapR.put(e.this.am().getKeyValue("ew"), String.valueOf(System.currentTimeMillis()));
            return concurrentHashMapR;
        }
    }

    public e(Context context, r rVar, String str, NativeUtils nativeUtils) {
        kotlin.jvm.internal.j.g(context, d("\uf509竚봴\uded9漳럓\udba1"));
        kotlin.jvm.internal.j.g(rVar, d("\uf506竚봹\udecc漢럂\udbba涄㚼鬔䷛⚱ጥ\u09d8蒹䈾⅕ჳࠨ葂䉦ꅥ僡꠰"));
        kotlin.jvm.internal.j.g(str, d("\uf508竌봪\udecc漥럘\udb96涅㚑鬟"));
        kotlin.jvm.internal.j.g(nativeUtils, d("\uf504竔봮\udec4漠럎\udb80涞㚜鬖䷎"));
        this.cQ = context;
        this.cR = rVar;
        this.cS = nativeUtils;
        this.f15107ck = "e";
    }

    private static boolean aq() {
        try {
            return Debug.isDebuggerConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String ar() {
        String strD = d("");
        try {
            Typeface typefaceCreate = Typeface.create(Typeface.DEFAULT, 0);
            Field declaredField = Typeface.class.getDeclaredField(d("\uf519竦봣\udede漢럎\udbb8涬㚚鬔䷉⚓ጎে"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(typefaceCreate);
            kotlin.jvm.internal.j.e(obj, d("\uf504竀봶\udec1潶럈\udbb4涄㚛鬕䷉⛾ግ\u09d2蓻䈎⅗შ࠹萆䉧ꅦ傤꠬呎⩾ᔥ諪씷拍ㄼᢈఠ虓䍥⇯郥䠉ꑞ剬ꥠ哯ꨭ픏櫳㔧髈䴾⛌錷짞撼㈅ᥛ賩왣\ue36b燲뢹屘⹙靶䯸▪銊䤟⒖ሏग़蓥䈢⅋郵䡥␄ታ१Ӡ舰䅎\u20f9ာ蠊䑵≻ᅥ裲䐩ꉉ텳棻둪\uda76\ued68\uf6f8ﬡﷄﺰ＋翑㿥鿓"));
            Iterator it = ((Map) obj).entrySet().iterator();
            while (it.hasNext()) {
                strD = strD + ((String) ((Map.Entry) it.next()).getKey()) + ',';
            }
        } catch (Exception e) {
            com.shield.android.k.a.K(this.f15107ck).a(e);
        }
        return strD.length() > 0 ? strD.substring(0, strD.length() - 1) : d("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String as() {
        try {
            Context context = this.cQ;
            if (context == null) {
                return d("");
            }
            Display defaultDisplay = ((WindowManager) com.shield.android.internal.i.c(context, d("\uf51d竜봴\udec9漹럜"))).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            w wVar = new w(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.densityDpi, displayMetrics.xdpi, displayMetrics.ydpi);
            int i = this.cQ.getResources().getConfiguration().orientation;
            double dSqrt = Math.sqrt(Math.pow(((double) wVar.bi()) / ((double) wVar.be()), 2.0d) + Math.pow(((double) wVar.bh()) / ((double) wVar.bf()), 2.0d));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wVar.bi());
            sb2.append('|');
            sb2.append(wVar.bh());
            sb2.append('|');
            sb2.append(dSqrt);
            sb2.append('|');
            sb2.append(wVar.bg());
            return sb2.toString();
        } catch (Exception e) {
            com.shield.android.k.a.K(this.f15107ck).a(e);
            return d("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String at() {
        try {
            return this.cS.getKeyValue(d("\uf53d")) + SystemClock.elapsedRealtime() + this.cS.getKeyValue(d("\uf532")) + SystemClock.uptimeMillis();
        } catch (Exception e) {
            com.shield.android.k.a.K(this.f15107ck).a(e);
            return d("");
        }
    }

    private static String au() {
        String strD = d("");
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                kotlin.jvm.internal.j.e(networkInterfaceNextElement, d("\uf504竀봶\udec1潶럈\udbb4涄㚛鬕䷉⛾ግ\u09d2蓻䈎⅗შ࠹萆䉧ꅦ傤꠬呎⩾ᔥ諪씷拍ㄼᢈఠ虓䍥⇯郥䠈ꑐ剮ꥭ咨ꨭ필櫤㕦髪䴷⛝錣짅撧㈁\u197c賴옹\ue343燡뢯尅⹑靼"));
                NetworkInterface networkInterface = networkInterfaceNextElement;
                if (networkInterface.isUp()) {
                    strD = networkInterface.getName();
                }
                if (C2576A.z(strD, d("\uf51e竀봴"), false, 2) || C2576A.z(strD, d("\uf51a竅봪"), false, 2) || C2576A.z(strD, d("\uf51a竅봮\udedd"), false, 2)) {
                    return strD;
                }
            }
        } catch (Exception unused) {
        }
        return d("\uf51e竀봴\ude9d");
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        char c10 = 60116;
        int i = 0;
        while (i < str.length()) {
            c10 = (char) ((c10 >> 1) | (((char) (((((c10 >> 2) ^ c10) ^ (c10 >> 3)) ^ (c10 >> 5)) & 1)) << 15));
            char cCharAt = str.charAt(i);
            int i4 = cCharAt + c10;
            int i6 = i4 + 1 + ((~cCharAt) | (~c10));
            sb2.append((char) (i6 - (i4 - i6)));
            int i10 = i + 2 + ((~i) | (-2));
            i = ((i + 1) - i10) + i10;
        }
        return sb2.toString();
    }

    public static final /* synthetic */ String f(e eVar, Context context) {
        return d("\uf511窕뵸\udec9漳량\udba0涍㚒鬛䷟⚲ጊক蓡䉍") + l(context) + d("\uf546窕뵸\udec9漳량\udba0涍㚒鬟䷏⚁ጌ\u09d8蒵䈃⅓ჸ࠹葃䉷ꄫ傾ꡢ") + aq() + d("\uf54a竈");
    }

    public static final /* synthetic */ boolean g(e eVar, Context context) {
        return o(context);
    }

    public static final /* synthetic */ String h(e eVar, Context context) {
        return m(context);
    }

    private static boolean l(Context context) {
        return (context.getApplicationContext().getApplicationInfo().flags & 2) != 0;
    }

    private static String m(Context context) {
        try {
            return String.valueOf(context.getResources().getConfiguration().fontScale);
        } catch (Exception unused) {
            return d("\uf55b窛뵪");
        }
    }

    private static Pair<String, String> n(Context context) {
        String strD = d("");
        String strD2 = d("");
        Pair<String, String> pair = new Pair<>(d(""), d(""));
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object systemService = context.getSystemService(d("\uf50e竐봬\udec4漵럎\udb8a涚㚚鬖䷔⚽\u1316"));
            kotlin.jvm.internal.j.e(systemService, d("\uf504竀봶\udec1潶럈\udbb4涄㚛鬕䷉⛾ግ\u09d2蓻䈎⅗შ࠹萆䉧ꅦ傤꠬呎⩾ᔥ諪씷拍ㄼᢈఠ虓䍥⇯郥䠃ꑟ剼\ua97e哩ꨪ핅檾㔩體䴢⚇錵짎撸㈃ᥛ貴옉\ue343燥뢠將⹗靉䯣▪銊䤒Ⓛሑॏ蓹䈪⅂郷䠻"));
            List<ComponentName> activeAdmins = ((DevicePolicyManager) systemService).getActiveAdmins();
            if (activeAdmins != null) {
                for (ComponentName componentName : activeAdmins) {
                    String strT = zj.z.t(componentName.getPackageName(), d("\uf544"), d("\uf535"));
                    String strT2 = zj.z.t(componentName.getClassName(), d("\uf544"), d("\uf535"));
                    arrayList.add(strT);
                    arrayList2.add(strT2);
                }
            }
            if (!arrayList.isEmpty()) {
                strD = TextUtils.join(d("\uf546"), arrayList);
            }
            if (!arrayList2.isEmpty()) {
                strD2 = TextUtils.join(d("\uf546"), arrayList2);
            }
            return new Pair<>(strD, strD2);
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
            return pair;
        }
    }

    private static boolean o(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), d("\uf50e竔봮\udecc漉럙\udbba涋㚘鬓䷓⚹")) == 1;
    }

    public static String p(Context context) {
        kotlin.jvm.internal.j.g(context, d("\uf509竚봴\uded9漳럓\udba1"));
        try {
            ArrayList arrayList = new ArrayList();
            Object systemService = context.getSystemService(d("\uf50b竖봮\udec4漠럂\udba1涓"));
            kotlin.jvm.internal.j.e(systemService, d("\uf504竀봶\udec1潶럈\udbb4涄㚛鬕䷉⛾ግ\u09d2蓻䈎⅗შ࠹萆䉧ꅦ傤꠬呎⩾ᔥ諪씷拍ㄼᢈఠ虓䍥⇯郥䠃ꑟ剼\ua97e哩ꨪ핅檾㔩體䴢⚇錕짉撡㈃\u1943賳옹\ue35f燞뢨尊⹓靾䯩▴"));
            for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) systemService).getRunningTasks(Integer.MAX_VALUE)) {
                StringBuilder sb2 = new StringBuilder();
                ComponentName componentName = runningTaskInfo.baseActivity;
                sb2.append(componentName != null ? componentName.toShortString() : null);
                sb2.append(':');
                sb2.append(runningTaskInfo.numRunning);
                arrayList.add(sb2.toString());
            }
            return TextUtils.join(d("\uf516"), arrayList);
        } catch (Throwable unused) {
            return d("\uf50f竇봨\udec2漤");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            Intent intentRegisterReceiver = ht2aO8.registerReceiver(context, null, new IntentFilter(d("\uf50b竛봾\udedf漹럂\udbb1淄㚜鬔䷉⚻ጁৃ蓵䈌⅕ჯࠤ葉䉽ꄧ僆ꠃ呵⩄ᕍ論씛拾ㄓᣠక虤䍒⇏邁")));
            if (intentRegisterReceiver != null) {
                jSONObject.put(d("\uf502竐봻\udec1漢럃"), String.valueOf(intentRegisterReceiver.getIntExtra(d("\uf502竐봻\udec1漢럃"), -1)));
                jSONObject.put(d("\uf51a站봯\udeca漱럎\udbb1"), String.valueOf(intentRegisterReceiver.getIntExtra(d("\uf51a站봯\udeca漱럎\udbb1"), -1)));
                jSONObject.put(d("\uf519竁봻\uded9漣럘"), String.valueOf(intentRegisterReceiver.getIntExtra(d("\uf519竁봻\uded9漣럘"), -1)));
                int intExtra = intentRegisterReceiver.getIntExtra(d("\uf506竐봬\udec8漺"), -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra(d("\uf519竖봻\udec1漳"), -1);
                jSONObject.put(d("\uf506竐봬\udec8漺"), String.valueOf(intExtra));
                jSONObject.put(d("\uf519竖봻\udec1漳"), String.valueOf(intExtra2));
                jSONObject.put(d("\uf51a竐봨\udece漳럅\udba1涋㚒鬟"), String.valueOf((intExtra / intExtra2) * 100.0f));
                jSONObject.put(d("\uf51a竇봿\udede漳럅\udba1"), String.valueOf(intentRegisterReceiver.getBooleanExtra(d("\uf51a竇봿\udede漳럅\udba1"), true)));
                jSONObject.put(d("\uf51e竐봹\udec5漸럄\udbb9涅㚒鬃"), intentRegisterReceiver.getStringExtra(d("\uf51e竐봹\udec5漸럄\udbb9涅㚒鬃")));
                jSONObject.put(d("\uf51e竐봷\udedd漳럙\udbb4涞㚀鬈䷘"), String.valueOf(intentRegisterReceiver.getIntExtra(d("\uf51e竐봷\udedd漳럙\udbb4涞㚀鬈䷘"), -1)));
                int intExtra3 = intentRegisterReceiver.getIntExtra(d("\uf51c竚봶\uded9漷럌\udbb0"), -1);
                if (intExtra3 < 1000) {
                    intExtra3 *= 1000;
                }
                jSONObject.put(d("\uf51c竚봶\uded9漷럌\udbb0"), String.valueOf(intExtra3));
            }
        } catch (Exception e) {
            com.shield.android.k.a.K(this.f15107ck).a(e);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.cS.getKeyValue(d("\uf53e")), String.valueOf(s(context)));
            jSONObject.put(this.cS.getKeyValue(d("\uf53f")), au());
            jSONObject.put(this.cS.getKeyValue(d("\uf53c")), String.valueOf(t(context)));
            return jSONObject.toString();
        } catch (Exception e) {
            com.shield.android.k.a.K(this.f15107ck).a(e);
            return d("");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean s(android.content.Context r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "\uf50b竛봾\udedf漹럂\udbb1淄㚅鬟䷏⚳ጆৄ蒨䈄⅙ჵࡣ葧䉐ꅊ僁ꠑ呲⩏ᕆ諁씖拶ㄟ\u18faట虵䍆⇞還䠶ꑴ"
            java.lang.String r2 = d(r2)     // Catch: java.lang.Exception -> L20
            boolean r2 = com.shield.android.internal.i.b(r9, r2)     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L3c
            java.lang.String r2 = "\uf509竚봴\udec3漳럈\udba1涃㚃鬓䷉⚧"
            java.lang.String r2 = d(r2)     // Catch: java.lang.Exception -> L20
            java.lang.Object r9 = r9.getSystemService(r2)     // Catch: java.lang.Exception -> L20
            boolean r2 = r9 instanceof android.net.ConnectivityManager     // Catch: java.lang.Exception -> L20
            r3 = 0
            if (r2 == 0) goto L25
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9     // Catch: java.lang.Exception -> L20
            goto L26
        L20:
            r9 = move-exception
            r2 = r1
            r4 = r2
            goto L98
        L25:
            r9 = r3
        L26:
            if (r9 == 0) goto L2d
            android.net.Network r2 = r9.getActiveNetwork()     // Catch: java.lang.Exception -> L20
            goto L2e
        L2d:
            r2 = r3
        L2e:
            if (r9 == 0) goto L34
            android.net.NetworkCapabilities r3 = r9.getNetworkCapabilities(r2)     // Catch: java.lang.Exception -> L20
        L34:
            if (r3 == 0) goto L3c
            r9 = 4
            boolean r9 = r3.hasTransport(r9)     // Catch: java.lang.Exception -> L20
            goto L3d
        L3c:
            r9 = r1
        L3d:
            java.lang.String r2 = ""
            java.lang.String r2 = d(r2)     // Catch: java.lang.Exception -> L93
            java.util.Enumeration r3 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L93
            java.util.ArrayList r3 = java.util.Collections.list(r3)     // Catch: java.lang.Exception -> L93
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L93
            r4 = r1
        L50:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Exception -> L67
            if (r5 == 0) goto Laa
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Exception -> L67
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5     // Catch: java.lang.Exception -> L67
            boolean r6 = r5.isUp()     // Catch: java.lang.Exception -> L67
            if (r6 == 0) goto L6c
            java.lang.String r2 = r5.getName()     // Catch: java.lang.Exception -> L67
            goto L6c
        L67:
            r2 = move-exception
            r7 = r2
            r2 = r9
            r9 = r7
            goto L98
        L6c:
            java.lang.String r5 = "\uf51e竀봴"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Exception -> L67
            r6 = 2
            boolean r5 = zj.C2576A.z(r2, r5, r1, r6)     // Catch: java.lang.Exception -> L67
            if (r5 != 0) goto L91
            java.lang.String r5 = "\uf51a竅봪"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Exception -> L67
            boolean r5 = zj.C2576A.z(r2, r5, r1, r6)     // Catch: java.lang.Exception -> L67
            if (r5 != 0) goto L91
            java.lang.String r5 = "\uf51a竅봮\udedd"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Exception -> L67
            boolean r5 = zj.C2576A.z(r2, r5, r1, r6)     // Catch: java.lang.Exception -> L67
            if (r5 == 0) goto L50
        L91:
            r4 = r0
            goto L50
        L93:
            r2 = move-exception
            r4 = r2
            r2 = r9
            r9 = r4
            r4 = r1
        L98:
            java.lang.String r3 = r8.f15107ck
            com.shield.android.k.a r3 = com.shield.android.k.a.K(r3)
            java.lang.String r5 = "\uf509竝봿\udece漽럂\udbbb涍㛕鬌䷍⚰"
            java.lang.String r5 = d(r5)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r3.a(r9, r5, r6)
            r9 = r2
        Laa:
            if (r9 != 0) goto Lb0
            if (r4 == 0) goto Laf
            goto Lb0
        Laf:
            return r1
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.e.s(android.content.Context):boolean");
    }

    @SuppressLint({"MissingPermission"})
    private final boolean t(Context context) {
        return ((com.shield.android.internal.i.j(context, d("\uf50b竛봾\udedf漹럂\udbb1淄㚅鬟䷏⚳ጆৄ蒨䈄⅙ჵࡣ葧䉐ꅊ僁ꠑ呲⩏ᕎ諍씌拤ㄏᣤఛ虩䍔⇞邌䠭ꑿ")) || com.shield.android.internal.i.j(context, d("\uf50b竛봾\udedf漹럂\udbb1淄㚅鬟䷏⚳ጆৄ蒨䈄⅙ჵࡣ葧䉐ꅊ僁ꠑ呲⩏ᕋ請씃拳\u3103ᣭఋ虦䍚⇉還䠶ꑸ剗ꥂ"))) && com.shield.android.internal.i.L(context)) ? this.cR.bc() : this.cU;
    }

    private static List<String> u(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            Object systemService = context.getSystemService(d("\uf50b竖봹\udec8漥럘\udbbc消㚜鬖䷔⚪\u1316"));
            kotlin.jvm.internal.j.e(systemService, d("\uf504竀봶\udec1潶럈\udbb4涄㚛鬕䷉⛾ግ\u09d2蓻䈎⅗შ࠹萆䉧ꅦ傤꠬呎⩾ᔥ諪씷拍ㄼᢈఠ虓䍥⇯郥䠃ꑟ剼\ua97e哩ꨪ핅檾㔾髍䴷⛞鍺짋撶㈉ᥐ賩옾\ue34f燱뢠專⹛靭䯵◨銢䤒ⓛሹढ़蓤䈢ⅇ郻䠥\u244dቦ॰Ӊ舣䅏\u20f1ု衁䑠"));
            Iterator<AccessibilityServiceInfo> it = ((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().getResolveInfo().serviceInfo;
                if ((serviceInfo.applicationInfo.flags & 1) == 0) {
                    arrayList.add(zj.z.t(serviceInfo.packageName, d("\uf544"), d("\uf535")));
                }
            }
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
        }
        return arrayList;
    }

    private static List<String> v(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            Object systemService = context.getSystemService(d("\uf50b竖봹\udec8漥럘\udbbc消㚜鬖䷔⚪\u1316"));
            kotlin.jvm.internal.j.e(systemService, d("\uf504竀봶\udec1潶럈\udbb4涄㚛鬕䷉⛾ግ\u09d2蓻䈎⅗შ࠹萆䉧ꅦ傤꠬呎⩾ᔥ諪씷拍ㄼᢈఠ虓䍥⇯郥䠃ꑟ剼\ua97e哩ꨪ핅檾㔾髍䴷⛞鍺짋撶㈉ᥐ賩옾\ue34f燱뢠專⹛靭䯵◨銢䤒ⓛሹढ़蓤䈢ⅇ郻䠥\u244dቦ॰Ӊ舣䅏\u20f1ု衁䑠"));
            Iterator<AccessibilityServiceInfo> it = ((AccessibilityManager) systemService).getInstalledAccessibilityServiceList().iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().getResolveInfo().serviceInfo;
                if ((serviceInfo.applicationInfo.flags & 1) == 0) {
                    arrayList.add(zj.z.t(serviceInfo.packageName, d("\uf544"), d("\uf535")));
                }
            }
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
        }
        return arrayList;
    }

    public boolean a(Context context, String str, String str2) {
        kotlin.jvm.internal.j.g(context, d("\uf509竚봴\uded9漳럓\udba1"));
        kotlin.jvm.internal.j.g(str, d("\uf50b竅봪"));
        kotlin.jvm.internal.j.g(str2, d("\uf51a竐봨\udec0漿럘\udba6涃㚚鬔"));
        return false;
    }

    public final Context al() {
        return this.cQ;
    }

    public final NativeUtils am() {
        return this.cS;
    }

    public final boolean an() {
        return this.cT;
    }

    public final String ao() {
        return this.f15107ck;
    }

    public final void ap() {
        this.cT = true;
    }

    public boolean b(Context context, String str, String str2) {
        kotlin.jvm.internal.j.g(context, d("\uf509竚봴\uded9漳럓\udba1"));
        kotlin.jvm.internal.j.g(str, d("\uf50b竅봪"));
        kotlin.jvm.internal.j.g(str2, d("\uf51a竐봨\udec0漿럘\udba6涃㚚鬔"));
        return false;
    }

    public List<g> scheduleJobs() {
        return !com.shield.android.internal.f.bI() ? C1112C.f9377a : C1132s.g(new g(androidx.camera.core.impl.a.n(new StringBuilder(), this.f15107ck, '1'), 0L, null, new c(null), 6), new g(androidx.camera.core.impl.a.n(new StringBuilder(), this.f15107ck, '2'), 0L, null, new a(null), 6), new g(androidx.camera.core.impl.a.n(new StringBuilder(), this.f15107ck, '3'), 0L, null, new b(null), 6), new g(androidx.camera.core.impl.a.n(new StringBuilder(), this.f15107ck, '4'), 0L, null, new C0056e(null), 6), new g(androidx.camera.core.impl.a.n(new StringBuilder(), this.f15107ck, '5'), 0L, null, new d(null), 6), new g(androidx.camera.core.impl.a.n(new StringBuilder(), this.f15107ck, '6'), 0L, null, new f(null), 6));
    }

    public static final /* synthetic */ List c(e eVar, Context context) {
        return v(context);
    }

    public static final /* synthetic */ Pair d(e eVar, Context context) {
        return n(context);
    }

    public static final /* synthetic */ String e(e eVar) {
        return String.valueOf(TimeUnit.HOURS.convert(new GregorianCalendar().getTimeZone().getRawOffset(), TimeUnit.MILLISECONDS));
    }

    public static final /* synthetic */ List b(e eVar, Context context) {
        return u(context);
    }

    public static final /* synthetic */ String d(e eVar) {
        return System.getProperty(d("\uf502竁봮\udedd潸럊\udbb2涏㚛鬎"));
    }

    public String a(Context context, String str) {
        kotlin.jvm.internal.j.g(context, d("\uf509竚봴\uded9漳럓\udba1"));
        kotlin.jvm.internal.j.g(str, d("\uf51a竔봹\udec6漷럌\udbb0涤㚔鬗䷘"));
        return d("");
    }
}
