package com.paymaya;

import A5.m;
import B5.c;
import Bj.U;
import C2.f;
import D.AbstractC0173f;
import D.C;
import D.C0172e;
import D.C0187u;
import D.CallableC0185s;
import D.H;
import D.S;
import D.b0;
import G6.v;
import J1.e;
import Kh.I;
import M8.A0;
import N.h;
import N.k;
import P5.C0534c;
import P5.Y;
import P5.Z;
import P5.a0;
import Pf.b;
import Q6.s;
import S1.r;
import T3.l;
import U1.g;
import Xh.i;
import a.AbstractC0617a;
import a5.C0630b;
import a5.C0631c;
import ag.C0707q;
import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.multidex.MultiDex;
import com.appsflyer.AppsFlyerLib;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.F;
import com.paymaya.data.preference.a;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import d2.C1328c;
import dOYHB6.speLp8.ilLni8;
import dOYHB6.speLp8.pl7Hu0;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import h2.o;
import h2.q;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.j;
import n.AbstractC1883j;
import n3.C1916a;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import p3.C2011b;
import u5.AbstractC2302a;
import x5.C2467a;
import z2.d;

/* JADX INFO: loaded from: classes3.dex */
public class PayMayaApplication extends Application {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f10200l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10201a = Arrays.asList(numX49.tnTj78("bLAb"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10202b;
    public C1220i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f10203d;
    public C0631c e;
    public C1232v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F f10204g;
    public c h;
    public m i;
    public S5.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Yc.a f10205k;

    static {
        ilLni8.d8ErU0();
        System.loadLibrary(numX49.tnTj78("bLAP"));
    }

    public static String a(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        HashMap map = F5.a.f1549a;
        String strTnTj78 = numX49.tnTj78("bLA2");
        Cipher cipher = Cipher.getInstance((String) map.get(strTnTj78));
        BigInteger bigInteger = new BigInteger(Base64.decode(getKeyParams()[0].getBytes(), 0));
        BigInteger bigInteger2 = new BigInteger(Base64.decode(getKeyParams()[1].getBytes(), 0));
        cipher.init(2, KeyFactory.getInstance(strTnTj78).generatePublic(new RSAPublicKeySpec(new BigInteger(bigInteger.toByteArray()), new BigInteger(bigInteger2.toByteArray()))));
        return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)), numX49.tnTj78("bLAL"));
    }

    public static native String getEncryptedClient();

    public static native String getEncryptedFinal();

    public static native String getEncryptedPin();

    public static native String getEncryptedRavenApiKey();

    public static native String getEncryptedRavenP1();

    public static native String getEncryptedRavenP2();

    public static native String getEncryptedRequest();

    public static native String getEncryptedSecret();

    public static native String getEncryptedSha1();

    public static native String getEncryptedSha256();

    public static native String getEncryptedShield();

    public static native String[] getKeyParams();

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    public final void b() {
        String str;
        SharedPreferences sharedPreferences = this.f10202b.f11330b;
        String strTnTj78 = numX49.tnTj78("bLAr");
        if (sharedPreferences.getInt(strTnTj78, 0) < 13435) {
            androidx.media3.datasource.cache.c.u(this.f10202b.f11330b, numX49.tnTj78("bLAZ"), null);
        }
        if (this.f10202b.H() || this.f10202b.f11330b.getInt(strTnTj78, 0) == 0) {
            str = strTnTj78;
        } else {
            yk.a.a();
            String strD = this.f10202b.d();
            String strZ = this.f10202b.z();
            String strG = this.f10202b.g();
            String strI = this.f10202b.i();
            String strT = this.f10202b.t();
            String strS = this.f10202b.s();
            String strB = this.f10202b.b();
            String strF = this.f10202b.f();
            a aVar = this.f10202b;
            SharedPreferences sharedPreferences2 = aVar.f11330b;
            String strTnTj782 = numX49.tnTj78("bLAk");
            String strTnTj783 = numX49.tnTj78("bLAB");
            String string = svM7M6.getString(sharedPreferences2, strTnTj782, strTnTj783);
            String string2 = svM7M6.getString(sharedPreferences2, numX49.tnTj78("bLAu"), strTnTj783);
            String strJ = aVar.H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
            a aVar2 = this.f10202b;
            SharedPreferences sharedPreferences3 = aVar2.f11330b;
            String string3 = svM7M6.getString(sharedPreferences3, numX49.tnTj78("bLAV"), strTnTj783);
            String string4 = svM7M6.getString(sharedPreferences3, numX49.tnTj78("bLAS"), strTnTj783);
            String strJ2 = aVar2.H() ? i.j(string3, string4) : AbstractC0617a.r(string3, string4);
            String strU = this.f10202b.u();
            String strC = this.f10202b.C();
            String strN = this.f10202b.n();
            String strM = this.f10202b.m();
            yk.a.a();
            str = strTnTj78;
            this.f10202b.R(strD);
            this.f10202b.q0(strZ);
            this.f10202b.W(strG);
            this.f10202b.Y(strI);
            this.f10202b.k0(strT);
            this.f10202b.j0(strS);
            this.f10202b.O(strB);
            this.f10202b.V(strF);
            this.f10202b.v0(strJ);
            this.f10202b.i0(strJ2);
            this.f10202b.l0(strU);
            this.f10202b.w0(strC);
            this.f10202b.b0(strN);
            this.f10202b.a0(strM);
        }
        androidx.camera.core.impl.a.A(this.f10202b.f11330b, numX49.tnTj78("bLAj"), true);
        this.f10202b.f11330b.edit().putInt(str, 13435).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application
    public void onCreate() {
        String str;
        String strA;
        pl7Hu0.eaXH36(this);
        int i = 11;
        int i4 = 23;
        int i6 = 2;
        boolean z4 = true;
        char c = 1;
        int i10 = 12;
        boolean z5 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Callback.onCreate(this);
        if (AbstractC0173f.f907a) {
            S.l(numX49.tnTj78("bLAd"));
        } else {
            AbstractC0173f.f907a = true;
            C0172e c0172e = AbstractC0173f.f908b;
            unregisterActivityLifecycleCallbacks(c0172e);
            registerActivityLifecycleCallbacks(c0172e);
            S.i(numX49.tnTj78("bLAi"));
        }
        super.onCreate();
        this.f10202b = a.j(getApplicationContext());
        r.f(numX49.tnTj78("bLAE") + getPackageName());
        String strTnTj78 = numX49.tnTj78("bLAF");
        b bVar = new b();
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i11 = applicationInfo.labelRes;
        bVar.f5162a = i11 == 0 ? applicationInfo.nonLocalizedLabel.toString() : getString(i11);
        bVar.f5163b = getPackageName();
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = strTnTj78;
        }
        bVar.c = str;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String str2 = b.f;
        String string = svM7M6.getString(defaultSharedPreferences, str2, strTnTj78);
        if (string.isEmpty()) {
            string = UUID.randomUUID().toString();
            SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
            editorEdit.putString(str2, string);
            editorEdit.apply();
        }
        bVar.f5164d = string;
        bVar.e = numX49.tnTj78("bLAH");
        e eVar = new e(3);
        eVar.f2381b = new String(Base64.encode(numX49.tnTj78("bLAO").getBytes(), 2));
        File externalFilesDir = getExternalFilesDir(null);
        l lVar = new l(i6, z5);
        lVar.f5786b = externalFilesDir;
        Lh.c cVar = new Lh.c(24);
        cVar.c = lVar;
        cVar.f2990b = new Vf.a();
        Sf.a aVar = new Sf.a(cVar, eVar);
        Cg.c cVar2 = new Cg.c(23);
        new HashMap();
        cVar2.f769d = new HashMap();
        cVar2.c = aVar;
        cVar2.f768b = bVar;
        r.f5624b = false;
        Log.d(numX49.tnTj78("bLAQ"), numX49.tnTj78("bLAt"));
        aVar.c();
        Cg.c.e = cVar2;
        s sVar = new s(this, 5);
        AppsFlyerLib.getInstance().setOneLinkCustomDomain(numX49.tnTj78("bLA8"), numX49.tnTj78("bLAC"), numX49.tnTj78("bLA4"), numX49.tnTj78("bLAo"), numX49.tnTj78("bLAK"), numX49.tnTj78("bLAw"), numX49.tnTj78("bLAU"), numX49.tnTj78("bLAe"));
        AppsFlyerLib.getInstance().init(numX49.tnTj78("bLAc"), sVar, this).setDebugLog(false);
        AppsFlyerLib.getInstance().start(this);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        ((HashMap) Cg.c.k().f769d).put(numX49.tnTj78("bLAm"), AppsFlyerLib.getInstance().getAppsFlyerUID(this));
        String strTnTj782 = numX49.tnTj78("bLAD");
        String strTnTj783 = numX49.tnTj78("bLAh");
        String strTnTj784 = numX49.tnTj78("bLAM");
        try {
            KeyStore keyStore = KeyStore.getInstance(strTnTj783);
            keyStore.load(null);
            boolean zContainsAlias = keyStore.containsAlias(strTnTj784);
            String strTnTj785 = numX49.tnTj78("bLAN");
            if (!zContainsAlias) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(strTnTj785, strTnTj783);
                keyGenerator.init(new KeyGenParameterSpec.Builder(strTnTj784, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setRandomizedEncryptionRequired(true).build());
                keyGenerator.generateKey();
            }
            String strTnTj786 = numX49.tnTj78("bLA6");
            try {
                KeyStore keyStore2 = KeyStore.getInstance(strTnTj783);
                keyStore2.load(null);
                if (!keyStore2.containsAlias(strTnTj786)) {
                    KeyGenerator keyGenerator2 = KeyGenerator.getInstance(strTnTj785, strTnTj783);
                    keyGenerator2.init(new KeyGenParameterSpec.Builder(strTnTj786, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
                    keyGenerator2.generateKey();
                }
                try {
                    b();
                    try {
                        this.f10202b.R(a(getEncryptedClient()));
                        this.f10202b.q0(a(getEncryptedSecret()));
                        this.f10202b.W(a(getEncryptedFinal()));
                        this.f10202b.Y(a(getEncryptedRequest()));
                        this.f10202b.k0(a(getEncryptedPin()));
                    } catch (Exception unused2) {
                        yk.a.e();
                    }
                    a aVar2 = this.f10202b;
                    Context applicationContext = getApplicationContext();
                    j.g(applicationContext, numX49.tnTj78("bLAa"));
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    String str3 = Build.DEVICE;
                    String str4 = Build.MODEL;
                    C0707q c0707qW = qk.i.w(applicationContext2);
                    String strF = c0707qW.f7225b;
                    if (TextUtils.isEmpty(strF)) {
                        strF = qk.i.f(c0707qW.f7226d);
                    }
                    j.f(strF, numX49.tnTj78("bLAX"));
                    aVar2.f11330b.edit().putString(numX49.tnTj78("bLAv"), We.s.i(strF, We.s.l(numX49.tnTj78("bLAG"), Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName(), numX49.tnTj78("bLA3"), Build.VERSION.RELEASE, numX49.tnTj78("bLAy")))).apply();
                    v vVar = new v();
                    vVar.f1820b = this;
                    O5.a aVar3 = new O5.a(vVar, new C0534c(), new a0(), new I(13), new C1916a(i), new P5.S(), new C2011b(i10), new Y(), new Z(), new d(i10), new N4.d(i10), new mg.c(i10), new C2011b(i));
                    this.c = (C1220i) aVar3.f4716g.get();
                    this.f10203d = (Context) aVar3.f4709d.get();
                    this.e = (C0631c) aVar3.f4661E.get();
                    this.f = (C1232v) aVar3.f4663F.get();
                    this.f10204g = (F) aVar3.f4665G.get();
                    this.h = (c) aVar3.f4655B.get();
                    this.i = (m) aVar3.f4653A.get();
                    this.j = (S5.c) aVar3.f4724k.get();
                    W4.a.e().f6267a = aVar3;
                    registerActivityLifecycleCallbacks(new B5.j());
                    E1.c.c = new f(22);
                    this.i.g(Ke.d.e(), Ke.d.c());
                    this.i.h();
                    C1328c.a().f16255a.d(Boolean.TRUE);
                    C1328c c1328cA = C1328c.a();
                    String strH = this.f10202b.h();
                    q qVar = c1328cA.f16255a;
                    qVar.f16905p.f17092a.a(new o(qVar, strH, objArr2 == true ? 1 : 0));
                    C0187u.c = -1;
                    C0187u c0187uF = C0187u.f(this.f10203d);
                    H h = (H) c0187uF.f949b.c;
                    h.f845g = false;
                    CleverTapInstanceConfig cleverTapInstanceConfig = h.f844d;
                    b0.j(h.e, b0.n(cleverTapInstanceConfig, numX49.tnTj78("bLA7")), h.f845g);
                    S sC = cleverTapInstanceConfig.c();
                    String str5 = numX49.tnTj78("bLAA") + h.f845g;
                    String str6 = cleverTapInstanceConfig.f9439a;
                    sC.getClass();
                    S.s(str6, str5);
                    ((l0.c) c0187uF.f949b.f825s).b().k(numX49.tnTj78("bLAY"), new CallableC0185s(c0187uF, z4));
                    if (this.f10202b.f11330b.getBoolean(numX49.tnTj78("bLAT"), false)) {
                        C0187u c0187u = this.f.f11232a;
                        C c10 = c0187u.f949b;
                        if (((CleverTapInstanceConfig) c10.f814a).h) {
                            S sE = c0187u.e();
                            String strC = c0187u.c();
                            String strTnTj787 = numX49.tnTj78("bLAg");
                            sE.getClass();
                            S.g(strC, strTnTj787);
                        } else {
                            S sE2 = c0187u.e();
                            String strC2 = c0187u.c();
                            String strTnTj788 = numX49.tnTj78("bLAR");
                            sE2.getClass();
                            S.g(strC2, strTnTj788);
                            S sE3 = c0187u.e();
                            String strC3 = c0187u.c();
                            String strTnTj789 = numX49.tnTj78("bLAp");
                            sE3.getClass();
                            S.g(strC3, strTnTj789);
                            k kVar = (k) c10.f818k;
                            kVar.f3482p = h.f3467a;
                            S s9 = kVar.f3480n;
                            String str7 = kVar.f3481o;
                            String strTnTj7810 = numX49.tnTj78("bLA0");
                            s9.getClass();
                            S.s(str7, strTnTj7810);
                        }
                    }
                    FirebaseAnalytics.getInstance(this.c.c).f9742a.zzo(null);
                    this.c.getClass();
                    FirebaseAnalytics.getInstance(this).f9742a.zzk(null, numX49.tnTj78("bLAf"), String.valueOf(13435), false);
                    try {
                        String strA2 = a(getEncryptedSha1());
                        String strA3 = a(getEncryptedSha256());
                        Signature signature = getPackageManager().getPackageInfo(getPackageName(), 64).signatures[0];
                        this.f10202b.f11330b.edit().putBoolean("key_sig", strA2.equalsIgnoreCase(com.paymaya.common.utility.C.o("SHA1", signature.toByteArray())) && strA3.equalsIgnoreCase(com.paymaya.common.utility.C.o("SHA256", signature.toByteArray()))).apply();
                    } catch (Exception e) {
                        C1328c.a().b(e);
                        yk.a.b();
                    }
                    g.j(this);
                    FirebaseMessaging.c().e().addOnCompleteListener(new Na.d(this, i4));
                    Yc.a aVar4 = new Yc.a();
                    aVar4.c = false;
                    O5.a aVar5 = (O5.a) W4.a.e().a().c;
                    aVar4.f6783a = new A7.j(aVar5.d(), (a) aVar5.e.get());
                    aVar4.f6784b = (a) aVar5.e.get();
                    aVar4.f6783a.h(aVar4);
                    this.f10205k = aVar4;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(numX49.tnTj78("bLA1"));
                    ContextCompat.registerReceiver(this, this.f10205k, intentFilter, null, null, 2);
                    NotificationManager notificationManager = (NotificationManager) getSystemService(numX49.tnTj78("bLAn"));
                    if (notificationManager != null && Build.VERSION.SDK_INT >= 26) {
                        androidx.core.graphics.a.x();
                        notificationManager.createNotificationChannel(C0.b.h(getString(R.string.pma_default_notification_channel), getString(R.string.pma_default_notification_channel)));
                        androidx.core.graphics.a.x();
                        notificationManager.createNotificationChannel(C0.b.h(getString(R.string.pma_notification_channel_id_reminders), getString(R.string.pma_notification_channel_name_reminders)));
                    }
                    m mVar = this.i;
                    W4.b bVar2 = new W4.b(this, objArr == true ? 1 : 0);
                    mVar.getClass();
                    m.b(bVar2);
                    if (Build.VERSION.SDK_INT >= 25) {
                        a aVar6 = this.f10202b;
                        j.g(aVar6, numX49.tnTj78("bLAx"));
                        new Xh.l(new Ag.l(15, this, aVar6), c == true ? 1 : 0).start();
                    }
                    Context context = this.f10204g.f10413a;
                    String strH2 = AbstractC1883j.h(context, R.raw.maya_landing_screen_logo_animation);
                    AbstractC1883j.a(strH2, new K.d(new WeakReference(context), context.getApplicationContext(), R.raw.maya_landing_screen_logo_animation, strH2));
                    C0631c c0631c = this.e;
                    Context context2 = c0631c.f6997a;
                    C2467a c2467a = c0631c.f6998b;
                    if (!AbstractC0617a.f6972a) {
                        AbstractC0617a.f6973b = c2467a;
                        Ij.e eVar2 = U.f603a;
                        Bj.H.w(Bj.H.c(Ij.d.f2362a), null, null, new C0630b(context2, null), 3);
                    }
                    HuiYanOsApi.init(this);
                    AbstractC2302a.b(this);
                    String strB = Je.b.b();
                    yk.a.f();
                    String strTnTj7811 = numX49.tnTj78("bLAs");
                    if (strB == null || strB.isEmpty()) {
                        try {
                            strB = Settings.Secure.getString(getContentResolver(), "android_id");
                        } catch (Exception unused3) {
                            yk.a.e();
                            strB = strTnTj7811;
                        }
                        yk.a.f();
                        if (strB == null || strB.isEmpty()) {
                            strB = this.f10202b.c();
                            if (strB.isEmpty()) {
                                strB = UUID.randomUUID().toString().toUpperCase();
                                this.f10202b.P(strB);
                            }
                        }
                    }
                    String upperCase = UUID.randomUUID().toString().toUpperCase();
                    try {
                        strA = a(getEncryptedRavenApiKey());
                        yk.a.f();
                    } catch (Exception unused4) {
                        yk.a.e();
                        strA = strTnTj7811;
                    }
                    try {
                        strTnTj7811 = a(getEncryptedRavenP1()).concat(a(getEncryptedRavenP2()));
                    } catch (Exception unused5) {
                        yk.a.e();
                    }
                    j.g(strB, numX49.tnTj78("bLA5"));
                    j.g(upperCase, numX49.tnTj78("bLAJ"));
                    j.g(strTnTj7811, numX49.tnTj78("bLAI"));
                    if (!equals(getApplicationContext())) {
                        throw new IllegalArgumentException(numX49.tnTj78("bLAPr"));
                    }
                    E4.d.f1257a = this;
                    E4.d.f1258b = upperCase;
                    E4.d.c = strB;
                    E4.d.e = strTnTj7811;
                    E4.d.f = numX49.tnTj78("bLAq");
                    E1.c.f1225b = 4;
                    E4.d.f1260g = strA;
                    r.f5623a = getSharedPreferences(numX49.tnTj78("bLAz"), 0);
                    Gj.c cVar3 = N4.c.f3526a;
                    N4.g.c = 4;
                    N4.g.f3536d = strA;
                    N4.g.e = N4.g.a();
                    N4.g.f = N4.g.b();
                    String strTnTj7812 = numX49.tnTj78("bLAl");
                    StringBuilder sb2 = new StringBuilder(strTnTj7812);
                    sb2.append(AbstractC1414e.v(E1.c.f1225b));
                    sb2.append(numX49.tnTj78("bLAW"));
                    String str8 = E4.d.c;
                    String strTnTj7813 = numX49.tnTj78("bLAP9");
                    if (str8 == null) {
                        throw new UninitializedPropertyAccessException(strTnTj7813);
                    }
                    sb2.append(str8);
                    A0.w(3, sb2.toString(), null);
                    StringBuilder sb3 = new StringBuilder(strTnTj7812);
                    sb3.append(AbstractC1414e.v(E1.c.f1225b));
                    sb3.append(numX49.tnTj78("bLAPP"));
                    String str9 = E4.d.f1258b;
                    if (str9 == null) {
                        throw new UninitializedPropertyAccessException(strTnTj7813);
                    }
                    sb3.append(str9);
                    A0.w(3, sb3.toString(), null);
                    A0.w(3, strTnTj7812 + AbstractC1414e.v(E1.c.f1225b) + numX49.tnTj78("bLAPb") + strA, null);
                    A0.w(3, strTnTj7812 + AbstractC1414e.v(E1.c.f1225b) + numX49.tnTj78("bLAP2") + E4.d.f, null);
                    A0.w(3, strTnTj7812 + AbstractC1414e.v(E1.c.f1225b) + numX49.tnTj78("bLAPL") + E4.d.e, null);
                    E4.d.f1259d = new A5.j(19);
                    DateTimeFormatter dateTimeFormatter = AbstractC1234x.f11248a;
                    synchronized (AbstractC1234x.class) {
                        AbstractC1234x.f11261u = this;
                        AbstractC1234x.f11262v = new PeriodFormatterBuilder().printZeroNever().appendHours().appendSuffix(Global.BLANK).appendSuffix(AbstractC1234x.f11261u.getString(R.string.pma_suffix_hour_ago), AbstractC1234x.f11261u.getString(R.string.pma_suffix_hours_ago)).toFormatter();
                        AbstractC1234x.f11263w = new PeriodFormatterBuilder().printZeroNever().appendMinutes().appendSuffix(Global.BLANK).appendSuffix(AbstractC1234x.f11261u.getString(R.string.pma_suffix_minute_ago), AbstractC1234x.f11261u.getString(R.string.pma_suffix_minutes_ago)).toFormatter();
                        AbstractC1234x.f11265y = AbstractC1234x.f11261u.getString(R.string.pma_label_today);
                        AbstractC1234x.f11264x = AbstractC1234x.f11261u.getString(R.string.pma_label_just_now);
                    }
                    com.paymaya.common.utility.C.T(this);
                    if (this.f10202b.G()) {
                        this.f10202b.r0(true);
                    }
                    C1220i c1220i = this.c;
                    C1219h c1219hD = C1219h.d(EnumC1215d.MAYA_APP);
                    c1219hD.t(EnumC1217f.START);
                    c1219hD.n(41);
                    c1220i.b(c1219hD);
                } catch (Exception e7) {
                    C1328c.a().b(e7);
                    yk.a.a();
                    Thread.currentThread().toString();
                    yk.a.d();
                    this.f10202b.f11330b.edit().clear().commit();
                    Object systemService = getSystemService(numX49.tnTj78("bLAPZ"));
                    j.e(systemService, numX49.tnTj78("bLAPk"));
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                        if (runningAppProcessInfo.pid != Process.myPid()) {
                            Process.killProcess(runningAppProcessInfo.pid);
                        }
                    }
                    Process.killProcess(Process.myPid());
                    System.exit(1);
                }
            } catch (IOException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e10) {
                e10.getMessage();
                yk.a.c();
                throw new PayMayaRuntimeException(strTnTj782 + e10.getMessage(), e10);
            }
        } catch (IOException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e11) {
            e11.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException(strTnTj782 + e11.getMessage(), e11);
        }
    }
}
