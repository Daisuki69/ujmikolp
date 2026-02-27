package com.shield.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.location.Criteria;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.text.format.Formatter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.Shield;
import com.shield.android.common.ShieldModule;
import com.shield.android.context.TouchEventInfoJobScheduler;
import com.shield.android.view.InternalBlockedDialog;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.yFtIp6.ht2aO8;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15216d = {306340397, 1587988517, 1703810543, 1564932088, 1092305084, 1561819059, 1630114027, 917655708, 2108817004, 1652722364, 157164787, 389295952, 920402881, 146008658, 1588415812};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private volatile boolean f15217K;
    private final ShieldCallback<JSONObject> aA;
    private final Thread aB;
    private final boolean aC;
    private com.shield.android.f.c aD;
    private final String aE;
    private final String aF;
    private final long aG;
    private final String aH;
    private final String aI;
    private final String aJ;
    private final Shield.LogLevel aK;
    private final String aL;
    private final BlockedDialog aM;
    private boolean aN;
    private final com.shield.android.d.i aO;
    private final List<ShieldModule> aP;
    private ExecutorService aQ;
    private PhoneStateListener aR;
    private com.shield.android.d.a aS;
    private int aT;
    private int aU;
    private final String aV;
    private final String aW;
    private boolean aX;
    private TouchEventInfoJobScheduler aY;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private final AtomicBoolean f15218ag = new AtomicBoolean(((int) f15216d[0]) ^ 306340397);

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    public WeakReference<String> f15219ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private WeakReference<Activity> f15220ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private boolean f15221aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private boolean f15222ak;
    private boolean al;
    public boolean am;
    private String an;
    private final Application ao;
    private com.shield.android.d.e ap;
    private com.shield.android.d.d aq;
    private com.shield.android.d.c ar;
    private long as;
    private boolean at;
    private final boolean au;
    private DisplayManager.DisplayListener av;
    private ConnectivityManager.NetworkCallback aw;
    private f ax;
    private d ay;
    private final boolean az;

    /* JADX INFO: renamed from: com.shield.android.e$3, reason: invalid class name */
    public class AnonymousClass3 extends PhoneStateListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15228d = {779768275, 932715026, 1324026267, 1546044588, 891453193, 2017694020};

        public AnonymousClass3() {
        }

        public static String d(String str) {
            int i = ((int) f15228d[1]) ^ 932743800;
            StringBuilder sb2 = new StringBuilder();
            int i4 = ((int) f15228d[2]) ^ 1324026267;
            while (i4 < str.length()) {
                long[] jArr = f15228d;
                int i6 = (((i >> (((int) jArr[2]) ^ 1324026267)) ^ (i >> (((int) jArr[0]) ^ 779768273))) ^ (i >> (((int) jArr[3]) ^ 1546044591))) ^ (i >> 5);
                long j = jArr[4];
                i = (char) ((i >> (((int) j) ^ 891453192)) | (((char) (i6 & (((int) j) ^ 891453192))) << (((int) jArr[5]) ^ 2017694027)));
                char cCharAt = str.charAt(i4);
                int i10 = cCharAt + i;
                long j6 = f15228d[4];
                int i11 = (~cCharAt) | (~i);
                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 891453192, i11, i10, (((int) j6) ^ 891453192) + i10 + i11));
                long j7 = f15228d[4];
                int i12 = ~i4;
                i4 = i4 + (((int) j7) ^ 891453192) + (((int) j7) ^ 891453192) + ((~(((int) j7) ^ 891453192)) | i12) + (((((int) j7) ^ 891453192) + i4) - ((((((int) j7) ^ 891453192) + i4) + (((int) j7) ^ 891453192)) + ((~(((int) j7) ^ 891453192)) | i12)));
            }
            return sb2.toString();
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i, String str) {
            if (i == (((int) f15228d[0]) ^ 779768273) && e.this.aT != (((int) f15228d[0]) ^ 779768273)) {
                HashMap<String, String> map = new HashMap<>();
                map.put(d("䡐ꑬ퉨\ue968\uf4f7羽﵎ﻱ缥뿁"), d("䡖ꑻ퉡\ue96a\uf4dc免ﵔﻱ缼뿁徍⾊鞜䮛▓ኙ褚䓠∻酊䣣\u242eቆ襦䓬∠"));
                e.this.s().c(e.this.f15219ah.get(), map);
            }
            e.this.aT = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"MissingPermission"})
    public e(Application application, String str, final String str2, long j, boolean z4, boolean z5, ShieldCallback<JSONObject> shieldCallback, Thread thread, boolean z8, String str3, String str4, String str5, String str6, Shield.LogLevel logLevel, BlockedDialog blockedDialog, List<ShieldModule> list, String str7, String str8, String str9) {
        long[] jArr = f15216d;
        this.f15221aj = ((int) jArr[1]) ^ 1587988516;
        boolean z9 = ((int) jArr[0]) ^ 306340397;
        this.f15222ak = z9;
        this.al = z9;
        this.am = z9;
        this.an = g("");
        this.as = 0L;
        boolean z10 = ((int) f15216d[0]) ^ 306340397;
        this.at = z10;
        this.aN = z10;
        this.aT = z10 ? 1 : 0;
        this.aU = z10 ? 1 : 0;
        this.aX = z10;
        this.f15217K = z10;
        this.ao = application;
        this.au = z4;
        this.az = z5;
        this.aA = shieldCallback;
        this.aB = thread;
        this.aC = z8;
        this.aE = str;
        this.aF = str2;
        this.aG = j;
        this.aH = str3;
        this.aI = str4;
        this.aJ = str6;
        this.aK = logLevel;
        this.aL = str5;
        this.aM = blockedDialog;
        this.aP = list;
        this.aV = str7;
        this.aW = str8;
        this.aO = new com.shield.android.d.i() { // from class: com.shield.android.h
            @Override // com.shield.android.d.i
            public final String onDigestRequired(String str10, String str11, String str12) {
                return this.f15365a.a(str2, str10, str11, str12);
            }
        };
        new Thread(new k(0, this, str9)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        HashMap<String, String> map = new HashMap<>();
        map.put(g("팪팹팪팡팻판팡팮팢팪"), g("팡팪팻팸팠팽팤판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
        s().c(this.f15219ah.get(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        HashMap<String, String> map = new HashMap<>();
        map.put(g("팪팹팪팡팻판팡팮팢팪"), g("팻팠팠팣팼판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
        s().c(this.f15219ah.get(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        HashMap<String, String> map = new HashMap<>();
        map.put(g("팪팹팪팡팻판팡팮팢팪"), g("패팿팼판팿팽팠팹팦팫팪팽판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
        s().c(this.f15219ah.get(), map);
        u();
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void D() {
        try {
            String bestProvider = ((LocationManager) this.ao.getSystemService(g("팣팠팬팮팻팦팠팡"))).getBestProvider(new Criteria(), ((int) f15216d[1]) ^ 1587988516);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (bestProvider != this.an && jCurrentTimeMillis - this.as > (f15216d[11] ^ 389295740)) {
                HashMap<String, String> map = new HashMap<>();
                map.put(g("팪팹팪팡팻판팡팮팢팪"), g("패팿팼판팿팽팠팹팦팫팪팽판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
                s().c(this.f15219ah.get(), map);
                u();
            }
            this.as = jCurrentTimeMillis;
            this.an = bestProvider;
            v();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        HashMap<String, String> map = new HashMap<>();
        map.put(g("팪팹팪팡팻판팡팮팢팪"), g("팡팪팻팸팠팽팤판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
        s().c(this.f15219ah.get(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        HashMap<String, String> map = new HashMap<>();
        map.put(g("팪팹팪팡팻판팡팮팢팪"), g("팼팫팤판팦팡팦팻팦팮팣팦팵팪팫판팮팿팿팼"));
        String strG = g("팼팫팤판팦팡팦팻팦팮팣팦팵팪팫판팼팬팽팪팪팡");
        WeakReference<String> weakReference = this.f15219ah;
        if (weakReference != null && weakReference.get() != null) {
            strG = this.f15219ah.get();
        }
        s().c(strG, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        try {
            String str = this.aE;
            if (str == null || !str.equalsIgnoreCase(g("팬퍶퍼퍹팮팬퍷퍸퍹퍺퍽퍺팮퍷퍻팬퍻팭팩팫퍾퍼퍽퍼퍾퍼팭퍷퍻퍶팭퍷퍿퍷팫퍼퍺팩퍹퍶"))) {
                new Handler(Looper.getMainLooper()).postDelayed(new j(this, 0), f15216d[12] ^ 920402853);
                return;
            }
            WifiInfo connectionInfo = ((WifiManager) this.ao.getSystemService(g("팸팦팩팦"))).getConnectionInfo();
            if (connectionInfo != null) {
                String ipAddress = Formatter.formatIpAddress(connectionInfo.getIpAddress());
                b.a(ipAddress.substring(((int) f15216d[0]) ^ 306340397, ipAddress.lastIndexOf(g("퍡")) + (((int) f15216d[1]) ^ 1587988516)), new i(this, 7));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void H() {
        s().f(((int) f15216d[0]) ^ 306340397);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void I() {
        s().f(((int) f15216d[0]) ^ 306340397);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        try {
            Intent intent = new Intent(this.ao, (Class<?>) InternalBlockedDialog.class);
            intent.setAction(g("팮팡팫팽팠팦팫퍡팦팡팻팪팡팻퍡팮팬팻팦팠팡퍡팂팎팆팁"));
            intent.addCategory(g("팮팡팫팽팠팦팫퍡팦팡팻팪팡팻퍡팬팮팻팪패팠팽팶퍡팃팎팚팁파팇팊팝"));
            intent.addFlags(((int) f15216d[13]) ^ 414444114);
            try {
                BlockedDialog blockedDialog = this.aM;
                if (blockedDialog != null) {
                    intent.putExtra(InternalBlockedDialog.TITLE, blockedDialog.getTitle());
                    intent.putExtra(InternalBlockedDialog.BODY, this.aM.getBody());
                }
            } catch (Exception unused) {
            }
            this.ao.startActivity(intent);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void K() {
        try {
            if (this.f15218ag.get() || this.f15220ai != null) {
                return;
            }
            this.f15218ag.set(((int) f15216d[1]) ^ 1587988516);
            s().bs = ((int) f15216d[1]) ^ 1587988516;
            if (this.at) {
                d.a(this.ao);
                this.at = ((int) f15216d[0]) ^ 306340397;
            }
            if (this.av != null) {
                try {
                    if (Build.VERSION.SDK_INT >= (((int) f15216d[5]) ^ 1561819042)) {
                        ((DisplayManager) this.ao.getSystemService(g("팫팦팼팿팣팮팶"))).unregisterDisplayListener(this.av);
                    }
                    this.av = null;
                } catch (Exception unused) {
                }
            }
            this.ax.T();
            com.shield.android.k.a aVarK = com.shield.android.k.a.K(g("팜팧팦팪팣팫퍵퍯팎팿팿팣팦팬팮팻팦팠팡팃팦팩팪팬팶팬팣팪"));
            String strG = g("팦팼팍팮팬팤패팽팠팺팡팫팪팫퍯팮팻퍯퍪팼");
            long[] jArr = f15216d;
            Object[] objArr = new Object[((int) jArr[1]) ^ 1587988516];
            objArr[306340397 ^ ((int) jArr[0])] = this.f15219ah.get();
            aVarK.b(strG, objArr);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        HashMap<String, String> map = new HashMap<>();
        map.put(g("팪팹팪팡팻판팡팮팢팪"), g("팻팠팠팣팼판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
        s().c(this.f15219ah.get(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void z() {
        try {
            String bestProvider = ((LocationManager) this.ao.getSystemService(g("팣팠팬팮팻팦팠팡"))).getBestProvider(new Criteria(), ((int) f15216d[1]) ^ 1587988516);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (bestProvider != this.an && jCurrentTimeMillis - this.as > (f15216d[11] ^ 389295740)) {
                HashMap<String, String> map = new HashMap<>();
                map.put(g("팪팹팪팡팻판팡팮팢팪"), g("패팿팼판팿팽팠팹팦팫팪팽판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
                s().c(this.f15219ah.get(), map);
                u();
            }
            this.as = jCurrentTimeMillis;
            this.an = bestProvider;
            v();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"MissingPermission"})
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        try {
            List<ShieldModule> list = this.aP;
            if (list != null) {
                for (ShieldModule shieldModule : list) {
                    if (shieldModule.getModuleName().equals(g("팍팊팇팎팙팆팀팚팝팎팃판팂팀팋팚팃팊"))) {
                        this.f15220ai = new WeakReference<>(activity);
                        s().a(this.f15220ai, shieldModule, g("팮팺팻팠파팠팣팣팪팬팻팦팠팡"));
                    }
                }
            }
        } catch (Exception unused) {
        }
        com.shield.android.internal.a.a(g("팜팇팆팊팃팋퍯팉팟퍯팟팝팀파팊팜팜퍯퍢퍱퍯팠팡팎팬팻팦팹팦팻팶파팽팪팮팻팪팫퍯") + activity.getLocalClassName(), new Object[((int) f15216d[0]) ^ 306340397]);
        try {
            if (this.aN && !(activity instanceof InternalBlockedDialog)) {
                new Handler(Looper.getMainLooper()).post(new j(this, 3));
            }
            this.aN = activity instanceof InternalBlockedDialog;
        } catch (Exception unused2) {
        }
        try {
            if (this.au) {
                dLgao9.setFlags(activity.getWindow(), 8192, 8192);
            }
            if (!(activity instanceof g) || activity.getTitle() == null || activity.getTitle().length() <= 0) {
                this.f15219ah = new WeakReference<>(activity.getLocalClassName());
            } else {
                this.f15219ah = new WeakReference<>(activity.getTitle().toString());
            }
            if (!this.am) {
                HashMap<String, String> map = new HashMap<>();
                map.put(g("팪팹팪팡팻판팡팮팢팪"), g("팼팫팤판팦팡팦팻팦팮팣팦팵팪팫"));
                com.shield.android.internal.a.a(g("팜팇팆팊팃팋퍯팉팟퍯팟팝팀파팊팜팜퍯퍢퍱퍯팼팻팮팽팻퍯팼팪팡팫팦팡패퍯팩팦팽팼팻퍯팩팿"), new Object[((int) f15216d[0]) ^ 306340397]);
                s().a(this.f15219ah.get(), map, new i(this, 8));
                if (g("팩팺팣팣").equalsIgnoreCase(g("팬팽팪팫팦팻")) || g("팩팺팣팣").equalsIgnoreCase(g("팩팺팣팣"))) {
                    new Handler(Looper.getMainLooper()).postDelayed(new j(this, 4), f15216d[2] ^ 1703812695);
                }
                c.a(new com.shield.android.d.g() { // from class: com.shield.android.e.6

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15234d = {1444234191, 1485626337, 330462197, 738627407, 1170798372, 1723264195};

                    public static String d(String str) {
                        int i = ((int) f15234d[0]) ^ 1444243467;
                        StringBuilder sb2 = new StringBuilder();
                        int i4 = ((int) f15234d[1]) ^ 1485626337;
                        while (i4 < str.length()) {
                            long[] jArr = f15234d;
                            int i6 = (((i >> (((int) jArr[1]) ^ 1485626337)) ^ (i >> (((int) jArr[2]) ^ 330462199))) ^ (i >> (((int) jArr[3]) ^ 738627404))) ^ (i >> 5);
                            long j = jArr[4];
                            i = (char) ((i >> (((int) j) ^ 1170798373)) | (((char) (i6 & (((int) j) ^ 1170798373))) << (((int) jArr[5]) ^ 1723264204)));
                            char cCharAt = str.charAt(i4);
                            int i10 = cCharAt + i;
                            long j6 = f15234d[4];
                            int i11 = (~cCharAt) | (~i);
                            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1170798373, i11, i10, (((int) j6) ^ 1170798373) + i10 + i11));
                            long j7 = f15234d[4];
                            int i12 = ~i4;
                            i4 = i4 + (((int) j7) ^ 1170798373) + (((int) j7) ^ 1170798373) + ((~(((int) j7) ^ 1170798373)) | i12) + (((((int) j7) ^ 1170798373) + i4) - ((((((int) j7) ^ 1170798373) + i4) + (((int) j7) ^ 1170798373)) + ((~(((int) j7) ^ 1170798373)) | i12)));
                        }
                        return sb2.toString();
                    }

                    @Override // com.shield.android.d.g
                    public final void M() {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put(d("閇쪇攝㋒餪䳰☹ፊ觸䒯"), d("閆쪘攋㋌餲䳎☮፴觶䒢ꈄ템\ue8fe琩㩂"));
                        e.this.s().c(e.this.f15219ah.get(), map2);
                    }

                    @Override // com.shield.android.d.g
                    public final void N() {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put(d("閇쪇攝㋒餪䳰☹ፊ觸䒯"), d("閆쪘攋㋌餲䳎☮፴觶䒢ꈄ템\ue8fe琩㩂"));
                        e.this.s().c(e.this.f15219ah.get(), map2);
                    }

                    @Override // com.shield.android.d.g
                    public final void O() {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put(d("閇쪇攝㋒餪䳰☹ፊ觸䒯"), d("閆쪘攋㋌餲䳎☮፴觶䒢ꈄ템\ue8fe琩㩂"));
                        e.this.s().c(e.this.f15219ah.get(), map2);
                    }

                    @Override // com.shield.android.d.g
                    public final void P() {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put(d("閇쪇攝㋒餪䳰☹ፊ觸䒯"), d("閎쪕攻㋐餱䳚☳፴觱䒯ꈑ텗\ue8fa琸㩃ᵷ"));
                        e.this.s().c(e.this.f15219ah.get(), map2);
                    }
                });
                if (!this.at) {
                    if (this.ay == null) {
                        this.ay = new d();
                    }
                    this.ay.a(this.ao, this);
                }
                if (s().az) {
                    try {
                        if (Build.VERSION.SDK_INT >= (((int) f15216d[3]) ^ 1564932064)) {
                            final ConnectivityManager connectivityManager = (ConnectivityManager) this.ao.getApplicationContext().getSystemService(g("팬팠팡팡팪팬팻팦팹팦팻팶"));
                            if (connectivityManager != null) {
                                if (this.aw == null) {
                                    this.aw = new ConnectivityManager.NetworkCallback() { // from class: com.shield.android.e.7

                                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                                        private static long[] f15236d = {1812337517, 288673201, 1594590912, 1000360434, 1899561684, 1742098900};

                                        public static String d(String str) {
                                            int i = ((int) f15236d[2]) ^ 1594579375;
                                            StringBuilder sb2 = new StringBuilder();
                                            int i4 = ((int) f15236d[1]) ^ 288673201;
                                            while (i4 < str.length()) {
                                                long[] jArr = f15236d;
                                                int i6 = (((i >> (((int) jArr[1]) ^ 288673201)) ^ (i >> (((int) jArr[3]) ^ 1000360432))) ^ (i >> (((int) jArr[4]) ^ 1899561687))) ^ (i >> 5);
                                                long j = jArr[0];
                                                i = (char) ((i >> (((int) j) ^ 1812337516)) | (((char) (i6 & (((int) j) ^ 1812337516))) << (((int) jArr[5]) ^ 1742098907)));
                                                char cCharAt = str.charAt(i4);
                                                int i10 = cCharAt + i;
                                                long j6 = f15236d[0];
                                                int i11 = (~cCharAt) | (~i);
                                                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1812337516, i11, i10, (((int) j6) ^ 1812337516) + i10 + i11));
                                                long j7 = f15236d[0];
                                                int i12 = ~i4;
                                                i4 = i4 + (((int) j7) ^ 1812337516) + (((int) j7) ^ 1812337516) + ((~(((int) j7) ^ 1812337516)) | i12) + (((((int) j7) ^ 1812337516) + i4) - ((((((int) j7) ^ 1812337516) + i4) + (((int) j7) ^ 1812337516)) + ((~(((int) j7) ^ 1812337516)) | i12)));
                                            }
                                            return sb2.toString();
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // android.net.ConnectivityManager.NetworkCallback
                                        public final void onAvailable(@NonNull Network network) {
                                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                                            if (!e.this.f15221aj || (networkCapabilities != null && networkCapabilities.hasTransport(4) && !e.this.al)) {
                                                e.this.al = (networkCapabilities == null || !networkCapabilities.hasTransport(4)) ? ((int) f15236d[1]) ^ 288673201 : ((int) f15236d[0]) ^ 1812337516;
                                                HashMap<String, String> map2 = new HashMap<>();
                                                map2.put(d("濒랭守\u2d98ᚏ謢䗐ꊾ턂棒"), d("濙랾宙ⶁᚔ謏䗕ꊀ턌棟됺婃\u2d71雮䬚◆銴줜擑㈹饙䳳\ua62f"));
                                                e.this.s().c(e.this.f15219ah.get(), map2);
                                            }
                                            e.this.f15221aj = ((int) f15236d[0]) ^ 1812337516;
                                            super.onAvailable(network);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // android.net.ConnectivityManager.NetworkCallback
                                        public final void onLost(@NonNull Network network) {
                                            super.onLost(network);
                                            e.this.f15221aj = ((int) f15236d[1]) ^ 288673201;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // android.net.ConnectivityManager.NetworkCallback
                                        public final void onUnavailable() {
                                            super.onUnavailable();
                                            e.this.f15221aj = ((int) f15236d[1]) ^ 288673201;
                                        }
                                    };
                                }
                                connectivityManager.registerDefaultNetworkCallback(this.aw);
                            }
                        } else {
                            com.shield.android.d.e eVar = new com.shield.android.d.e(new i(this, 9));
                            this.ap = eVar;
                            try {
                                ht2aO8.registerReceiver(activity, eVar, new IntentFilter(g("팮팡팫팽팠팦팫퍡팡팪팻퍡팬팠팡팡퍡파팀팁팁팊파팛팆팙팆팛팖판파팇팎팁팈팊")));
                            } catch (Exception unused3) {
                            }
                        }
                        this.aq = new com.shield.android.d.d(new i(this, 10));
                        this.ar = new com.shield.android.d.c(new i(this, 0));
                        if (Build.VERSION.SDK_INT >= (((int) f15216d[4]) ^ 1092305071) && com.shield.android.internal.i.M(this.ao)) {
                            try {
                                ht2aO8.registerReceiver(activity, this.ar, new IntentFilter(g("팮팡팫팽팠팦팫퍡팣팠팬팮팻팦팠팡퍡팂팀팋팊판파팇팎팁팈팊팋")));
                            } catch (Exception unused4) {
                            }
                        }
                        ht2aO8.registerReceiver(activity, this.aq, new IntentFilter(g("팮팡팫팽팠팦팫퍡팣팠팬팮팻팦팠팡퍡팟팝팀팙팆팋팊팝팜판파팇팎팁팈팊팋")));
                    } catch (Exception unused5) {
                    }
                }
                this.am = ((int) f15216d[1]) ^ 1587988516;
                s().a((com.shield.android.d.h) new i(this, 1));
            }
        } catch (Exception unused6) {
        }
        com.shield.android.internal.a.a(g("팜팇팆팊팃팋퍯팉팟퍯팟팝팀파팊팜팜퍯퍢퍱퍯팪팡팫퍯팠팡팎팬팻팦팹팦팻팶파팽팪팮팻팪팫퍯") + activity.getLocalClassName(), new Object[((int) f15216d[0]) ^ 306340397]);
        v();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        int i = 1;
        if (!this.az) {
            b((Context) activity);
        }
        com.shield.android.k.a.K(g("팜팧팦팪팣팫퍵퍯팎팿팿팣팦팬팮팻팦팠팡팃팦팩팪팬팶팬팣팪")).b(g("팠팡팟팮팺팼팪팫"), new Object[((int) f15216d[0]) ^ 306340397]);
        int iO = com.shield.android.internal.i.O(this.ao);
        if (iO <= (((int) f15216d[1]) ^ 1587988516)) {
            this.aU = iO;
        }
        com.shield.android.internal.b bVar = com.shield.android.internal.b.fD;
        Application application = this.ao;
        ExecutorService executorServiceT = t();
        if (this.aR == null) {
            this.aR = new AnonymousClass3();
        }
        com.shield.android.internal.b.a(application, executorServiceT, this.aR);
        this.f15219ah = new WeakReference<>(activity.getLocalClassName());
        this.f15220ai = null;
        HandlerThread handlerThread = new HandlerThread(g("팍패팛팧팽팪팮팫"));
        handlerThread.start();
        new Handler(handlerThread.getLooper()).postDelayed(new j(this, i), f15216d[9] ^ 1652721746);
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(@NonNull Activity activity) {
        if (this.az) {
            b((Context) activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"MissingPermission"})
    public final void onActivityResumed(@NonNull Activity activity) {
        int i;
        int i4 = 6;
        int i6 = 4;
        int i10 = 3;
        int i11 = 5;
        com.shield.android.k.a.K(g("팜팧팦팪팣팫퍵퍯팎팿팿팣팦팬팮팻팦팠팡팃팦팩팪팬팶팬팣팪")).b(g("팠팡팝팪팼팺팢팪팫"), new Object[((int) f15216d[0]) ^ 306340397]);
        this.f15219ah = new WeakReference<>(activity.getLocalClassName());
        this.f15220ai = new WeakReference<>(activity);
        if (activity instanceof InternalBlockedDialog) {
            return;
        }
        if (!this.f15222ak) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.ao.getApplicationContext().getSystemService(g("팬팠팡팡팪팬팻팦팹팦팻팶"))).getActiveNetworkInfo();
                this.f15221aj = (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? ((int) f15216d[0]) ^ 306340397 : ((int) f15216d[1]) ^ 1587988516;
            } catch (Exception unused) {
            }
            this.f15222ak = ((int) f15216d[1]) ^ 1587988516;
        }
        try {
            if (this.f15218ag.get()) {
                try {
                    NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) this.ao.getApplicationContext().getSystemService(g("팬팠팡팡팪팬팻팦팹팦팻팶"))).getActiveNetworkInfo();
                    this.f15221aj = (activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected()) ? ((int) f15216d[0]) ^ 306340397 : ((int) f15216d[1]) ^ 1587988516;
                } catch (Exception unused2) {
                }
                com.shield.android.k.a aVarK = com.shield.android.k.a.K(g("팜팧팦팪팣팫퍵퍯팎팿팿팣팦팬팮팻팦팠팡팃팦팩팪팬팶팬팣팪"));
                String strG = g("팩팠팽팪패팽팠팺팡팫퍯팮팻퍯퍪팼");
                long[] jArr = f15216d;
                Object[] objArr = new Object[((int) jArr[1]) ^ 1587988516];
                objArr[((int) jArr[0]) ^ 306340397] = this.f15219ah.get();
                aVarK.b(strG, objArr);
                HashMap<String, String> map = new HashMap<>();
                map.put(g("팪팹팪팡팻판팡팮팢팪"), g("팮팿팿팣팦팬팮팻팦팠팡판팠팡판팽팪팼팺팢팪팫"));
                s().c(this.f15219ah.get(), map);
                this.f15218ag.set(((int) f15216d[0]) ^ 306340397);
                s().bs = ((int) f15216d[0]) ^ 306340397;
                if (!this.at) {
                    if (this.ay == null) {
                        this.ay = new d();
                    }
                    this.ay.a(this.ao, this);
                    this.at = ((int) f15216d[1]) ^ 1587988516;
                }
                c.a(new com.shield.android.d.g() { // from class: com.shield.android.e.4

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15230d = {315837710, 666339432, 762141410, 139980950, 1185742936, 1217262752};

                    public static String d(String str) {
                        int i12 = ((int) f15230d[0]) ^ 315849169;
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = ((int) f15230d[1]) ^ 666339432;
                        while (i13 < str.length()) {
                            long[] jArr2 = f15230d;
                            int i14 = (((i12 >> (((int) jArr2[1]) ^ 666339432)) ^ (i12 >> (((int) jArr2[2]) ^ 762141408))) ^ (i12 >> (((int) jArr2[3]) ^ 139980949))) ^ (i12 >> 5);
                            long j = jArr2[4];
                            i12 = (char) ((i12 >> (((int) j) ^ 1185742937)) | (((char) (i14 & (((int) j) ^ 1185742937))) << (((int) jArr2[5]) ^ 1217262767)));
                            char cCharAt = str.charAt(i13);
                            int i15 = cCharAt + i12;
                            long j6 = f15230d[4];
                            int i16 = (~cCharAt) | (~i12);
                            sb2.append((char) AbstractC1213b.H(i15, ((int) j6) ^ 1185742937, i16, i15, (((int) j6) ^ 1185742937) + i15 + i16));
                            long j7 = f15230d[4];
                            int i17 = ~i13;
                            i13 = i13 + (((int) j7) ^ 1185742937) + (((int) j7) ^ 1185742937) + ((~(((int) j7) ^ 1185742937)) | i17) + (((((int) j7) ^ 1185742937) + i13) - ((((((int) j7) ^ 1185742937) + i13) + (((int) j7) ^ 1185742937)) + ((~(((int) j7) ^ 1185742937)) | i17)));
                        }
                        return sb2.toString();
                    }

                    @Override // com.shield.android.d.g
                    public final void M() {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put(d("騊䵁\ua6fe匣꧒和ꨇ핕櫷딨"), d("騋䵞ꛨ匽꧊咲ꨐ핫櫹딥\udac7洽뛎\udb31\uedce"));
                        e.this.s().c(e.this.f15219ah.get(), map2);
                    }

                    @Override // com.shield.android.d.g
                    public final void N() {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put(d("騊䵁\ua6fe匣꧒和ꨇ핕櫷딨"), d("騋䵞ꛨ匽꧊咲ꨐ핫櫹딥\udac7洽뛎\udb31\uedce"));
                        e.this.s().c(e.this.f15219ah.get(), map2);
                    }

                    @Override // com.shield.android.d.g
                    public final void O() {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put(d("騊䵁\ua6fe匣꧒和ꨇ핕櫷딨"), d("騋䵞ꛨ匽꧊咲ꨐ핫櫹딥\udac7洽뛎\udb31\uedce"));
                        e.this.s().c(e.this.f15219ah.get(), map2);
                    }

                    @Override // com.shield.android.d.g
                    public final void P() {
                    }
                });
                if (this.av == null && Build.VERSION.SDK_INT >= (((int) f15216d[5]) ^ 1561819042)) {
                    try {
                        DisplayManager displayManager = (DisplayManager) this.ao.getSystemService(g("팫팦팼팿팣팮팶"));
                        DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: com.shield.android.e.5

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            private static long[] f15232d = {951102094, 1288455967, 570447177, 1022001407};

                            public static String f(String str) {
                                StringBuilder sb2 = new StringBuilder();
                                int i12 = ((int) f15232d[0]) ^ 951102094;
                                while (i12 < str.length()) {
                                    char cCharAt = str.charAt(i12);
                                    long[] jArr2 = f15232d;
                                    long j = jArr2[1];
                                    long j6 = jArr2[2];
                                    int i13 = ~cCharAt;
                                    int i14 = (((int) j) ^ 1288445877) + cCharAt;
                                    sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1288445877)) + (((int) j6) ^ 570447176), (~(((int) j) ^ 1288445877)) | i13, i14, (((((int) j) ^ 1288445877) + cCharAt) + (((int) j6) ^ 570447176)) + ((~(((int) j) ^ 1288445877)) | i13)) ^ (i12 % (((int) jArr2[3]) ^ 1022000896))));
                                    long j7 = f15232d[2];
                                    int i15 = ~i12;
                                    i12 = i12 + (((int) j7) ^ 570447176) + (((int) j7) ^ 570447176) + ((~(((int) j7) ^ 570447176)) | i15) + (((((int) j7) ^ 570447176) + i12) - ((((((int) j7) ^ 570447176) + i12) + (((int) j7) ^ 570447176)) + ((~(((int) j7) ^ 570447176)) | i15)));
                                }
                                return sb2.toString();
                            }

                            @Override // android.hardware.display.DisplayManager.DisplayListener
                            public final void onDisplayAdded(int i12) {
                                try {
                                    HashMap<String, String> map2 = new HashMap<>();
                                    map2.put(f("壏壝壍壇壚声壂壌壏壆"), f("壎壂壛壙壂壎壕売壁壋壁壏壁壂壀"));
                                    e.this.s().c(e.this.f15219ah.get(), map2);
                                } catch (Exception unused3) {
                                }
                            }

                            @Override // android.hardware.display.DisplayManager.DisplayListener
                            public final void onDisplayChanged(int i12) {
                            }

                            @Override // android.hardware.display.DisplayManager.DisplayListener
                            public final void onDisplayRemoved(int i12) {
                                try {
                                    HashMap<String, String> map2 = new HashMap<>();
                                    map2.put(f("壏壝壍壇壚声壂壌壏壆"), f("壎壂壛壙壂壎壕売壁壋壁壏壁壂壀"));
                                    e.this.s().c(e.this.f15219ah.get(), map2);
                                } catch (Exception unused3) {
                                }
                            }
                        };
                        this.av = displayListener;
                        displayManager.registerDisplayListener(displayListener, new Handler(Looper.getMainLooper()));
                    } catch (Exception unused3) {
                    }
                }
                s().a((com.shield.android.d.h) new i(this, 2));
            }
        } catch (Exception unused4) {
        }
        try {
            if (!this.az) {
                if (Build.VERSION.SDK_INT >= (((int) f15216d[3]) ^ 1564932064)) {
                    final ConnectivityManager connectivityManager = (ConnectivityManager) this.ao.getApplicationContext().getSystemService(g("팬팠팡팡팪팬팻팦팹팦팻팶"));
                    if (connectivityManager != null) {
                        if (this.aw == null) {
                            this.aw = new ConnectivityManager.NetworkCallback() { // from class: com.shield.android.e.8

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                private static long[] f15239d = {1125594328, 1241647741, 2007230886};

                                public static String g(String str) {
                                    StringBuilder sb2 = new StringBuilder();
                                    int i12 = ((int) f15239d[1]) ^ 1241647741;
                                    while (i12 < str.length()) {
                                        char cCharAt = str.charAt(i12);
                                        long[] jArr2 = f15239d;
                                        long j = jArr2[2];
                                        long j6 = jArr2[0];
                                        int i13 = ~cCharAt;
                                        int i14 = (((int) j) ^ 2007206968) + cCharAt;
                                        sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 2007206968) + (((int) j6) ^ 1125594329), i13 | (~(((int) j) ^ 2007206968)), i14, (((int) j) ^ 2007206968) + cCharAt + (((int) j6) ^ 1125594329) + ((~(((int) j) ^ 2007206968)) | i13)));
                                        long j7 = f15239d[0];
                                        int i15 = ~i12;
                                        i12 = i12 + (((int) j7) ^ 1125594329) + (((int) j7) ^ 1125594329) + ((~(((int) j7) ^ 1125594329)) | i15) + (((((int) j7) ^ 1125594329) + i12) - ((((((int) j7) ^ 1125594329) + i12) + (((int) j7) ^ 1125594329)) + ((~(((int) j7) ^ 1125594329)) | i15)));
                                    }
                                    return sb2.toString();
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public final void onAvailable(@NonNull Network network) {
                                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                                    if (!e.this.f15221aj || (networkCapabilities != null && networkCapabilities.hasTransport(4) && !e.this.al)) {
                                        e.this.al = (networkCapabilities == null || !networkCapabilities.hasTransport(4)) ? ((int) f15239d[1]) ^ 1241647741 : ((int) f15239d[0]) ^ 1125594329;
                                        HashMap<String, String> map2 = new HashMap<>();
                                        map2.put(g("旻旨旻旰旪旁旰旿旳旻"), g("旰旻旪早旱旬旵旁旽时旿旰旹旻旁旺旻旪旻旽旪旻旺"));
                                        e.this.s().c(e.this.f15219ah.get(), map2);
                                    }
                                    e.this.f15221aj = ((int) f15239d[0]) ^ 1125594329;
                                    super.onAvailable(network);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public final void onLost(@NonNull Network network) {
                                    super.onLost(network);
                                    e.this.f15221aj = ((int) f15239d[1]) ^ 1241647741;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public final void onUnavailable() {
                                    super.onUnavailable();
                                    e.this.f15221aj = ((int) f15239d[1]) ^ 1241647741;
                                }
                            };
                        }
                        connectivityManager.registerDefaultNetworkCallback(this.aw);
                    }
                } else {
                    com.shield.android.d.e eVar = new com.shield.android.d.e(new i(this, i10));
                    this.ap = eVar;
                    try {
                        ht2aO8.registerReceiver(activity, eVar, new IntentFilter(g("팮팡팫팽팠팦팫퍡팡팪팻퍡팬팠팡팡퍡파팀팁팁팊파팛팆팙팆팛팖판파팇팎팁팈팊")));
                    } catch (Exception unused5) {
                    }
                }
                this.aq = new com.shield.android.d.d(new i(this, i6));
                this.ar = new com.shield.android.d.c(new i(this, i11));
                if (Build.VERSION.SDK_INT >= (((int) f15216d[4]) ^ 1092305071) && com.shield.android.internal.i.M(this.ao)) {
                    try {
                        ht2aO8.registerReceiver(activity, this.ar, new IntentFilter(g("팮팡팫팽팠팦팫퍡팣팠팬팮팻팦팠팡퍡팂팀팋팊판파팇팎팁팈팊팋")));
                    } catch (Exception unused6) {
                    }
                }
                ht2aO8.registerReceiver(activity, this.aq, new IntentFilter(g("팮팡팫팽팠팦팫퍡팣팠팬팮팻팦팠팡퍡팟팝팀팙팆팋팊팝팜판파팇팎팁팈팊팋")));
            }
        } catch (Exception unused7) {
        }
        int iO = com.shield.android.internal.i.O(this.ao);
        int i12 = this.aT;
        long[] jArr2 = f15216d;
        if (i12 != (((int) jArr2[6]) ^ 1630114025) && iO >= (i = ((int) jArr2[7]) ^ 917655711) && this.aU < i) {
            HashMap<String, String> map2 = new HashMap<>();
            map2.put(g("팪팹팪팡팻판팡팮팢팪"), g("팬팮팣팣판팼팻팮팻팪판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
            s().c(this.f15219ah.get(), map2);
        }
        this.aU = iO;
        com.shield.android.internal.b bVar = com.shield.android.internal.b.fD;
        Application application = this.ao;
        if (this.aS == null) {
            this.aS = new i(this, i4);
        }
        com.shield.android.d.a aVar = this.aS;
        if (this.aR == null) {
            this.aR = new AnonymousClass3();
        }
        com.shield.android.internal.b.a(application, aVar, this.aR, t());
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        com.shield.android.k.a.K(g("팜팧팦팪팣팫퍵퍯팎팿팿팣팦팬팮팻팦팠팡팃팦팩팪팬팶팬팣팪")).b(g("팠팡팎팬팻팦팹팦팻팶팜팻팮팽팻팪팫"), new Object[((int) f15216d[0]) ^ 306340397]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15216d[0]) ^ 306340397;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15216d;
            long j = jArr[14];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1588436491) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1588436491) + (((int) j6) ^ 1587988516), i4 | (~(((int) j) ^ 1588436491)), i6, (((int) j) ^ 1588436491) + cCharAt + (((int) j6) ^ 1587988516) + ((~(((int) j) ^ 1588436491)) | i4)));
            long j7 = f15216d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1587988516) + (((int) j7) ^ 1587988516) + ((~(((int) j7) ^ 1587988516)) | i10) + (((((int) j7) ^ 1587988516) + i) - ((((((int) j7) ^ 1587988516) + i) + (((int) j7) ^ 1587988516)) + ((~(((int) j7) ^ 1587988516)) | i10)));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void h(String str) {
        if (!com.shield.android.internal.i.a(str)) {
            this.aX = ((int) f15216d[1]) ^ 1587988516;
            com.shield.android.internal.i.k(this.ao, this.aE).edit().putString(g("팪팡팫팿팠팦팡팻"), str).putString(g("팩팮팣팣팭팮팬팤판팪팡팫팿팠팦팡팻"), str).putString(g("팹팪팽팼팦팠팡"), g("")).putString(g("팩팮팣팣팭팮팬팤판팹팪팽팼팦팠팡"), g("")).apply();
        }
        try {
            boolean z4 = com.shield.android.internal.i.k(this.ao, this.aE).getBoolean(g("팦팡팼팻팮팣팣판팽팪팩팪팽팽팮팣판팬팠팣팣팪팬팻팪팫"), ((int) f15216d[0]) ^ 306340397);
            if (com.shield.android.internal.i.j(this.ao, g("팬팠팢퍡패팠팠패팣팪퍡팮팡팫팽팠팦팫퍡팩팦팡팼팤팶퍡팿팪팽팢팦팼팼팦팠팡퍡팍팆팁팋판팈팊팛판팆팁팜팛팎팃팃판팝팊팉팊팝팝팊팝판팜팊팝팙팆파팊"))) {
                if (z4) {
                    com.shield.android.internal.i.k(this.ao, this.aE).edit().putBoolean(g("팦팡팼팻팮팣팣판팽팪팩팪팽팽팮팣판팬팠팣팣팪팬팻팪팫"), ((int) f15216d[1]) ^ 1587988516).apply();
                } else {
                    final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.ao).build();
                    installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.shield.android.e.2

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static long[] f15225d = {1038768854, 175996038, 767130259, 1274224538};

                        public static String f(String str2) {
                            StringBuilder sb2 = new StringBuilder();
                            int i = ((int) f15225d[1]) ^ 175996038;
                            while (i < str2.length()) {
                                char cCharAt = str2.charAt(i);
                                long[] jArr = f15225d;
                                long j = jArr[2];
                                long j6 = jArr[0];
                                int i4 = ~cCharAt;
                                int i6 = (((int) j) ^ 767141036) + cCharAt;
                                sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 767141036)) + (((int) j6) ^ 1038768855), (~(((int) j) ^ 767141036)) | i4, i6, (((((int) j) ^ 767141036) + cCharAt) + (((int) j6) ^ 1038768855)) + ((~(((int) j) ^ 767141036)) | i4)) ^ (i % (((int) jArr[3]) ^ 1274273893))));
                                long j7 = f15225d[0];
                                int i10 = ~i;
                                i = i + (((int) j7) ^ 1038768855) + (((int) j7) ^ 1038768855) + ((~(((int) j7) ^ 1038768855)) | i10) + (((((int) j7) ^ 1038768855) + i) - ((((((int) j7) ^ 1038768855) + i) + (((int) j7) ^ 1038768855)) + ((~(((int) j7) ^ 1038768855)) | i10)));
                            }
                            return sb2.toString();
                        }

                        @Override // com.android.installreferrer.api.InstallReferrerStateListener
                        public final void onInstallReferrerServiceDisconnected() {
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.android.installreferrer.api.InstallReferrerStateListener
                        public final void onInstallReferrerSetupFinished(int i) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                            } catch (Exception e) {
                                com.shield.android.k.a.dL().a(e);
                            }
                            if (i == -1) {
                                jSONObject.put(f("\ude5a\ude4c\ude4f\ude53\ude49"), f("\ude4c\ude5b\ude4f\ude4a\ude52\ude59\ude5c\ude67\ude53\ude5f\ude46\ude57\ude5c\ude5c\ude5f\ude55\ude4c\ude5a\ude48\ude48"));
                            } else {
                                if (i == 0) {
                                    try {
                                        ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                                        if (installReferrer != null) {
                                            jSONObject.put(f("\ude4d\ude5b\ude5b\ude59\ude49\ude48\ude58\ude54\ude68\ude46\ude54\ude46\ude52\ude5f\ude42"), installReferrer.getInstallReferrer());
                                            jSONObject.put(f("\ude56\ude50\ude4e\ude48\ude5a\ude56\ude55\ude67\ude55\ude53\ude52\ude5d\ude5d\ude6d\ude45\ude59\ude42\ude4b\ude5e\ude58\ude4a\ude47\ude59\ude5b"), installReferrer.getInstallBeginTimestampSeconds());
                                            jSONObject.put(f("\ude4d\ude5b\ude5b\ude59\ude49\ude48\ude5c\ude4a\ude68\ude55\ude59\ude5d\ude50\ude59\ude6e\ude44\ude46\ude43\ude48\ude5f\ude5f\ude4b\ude44\ude58\ude54"), installReferrer.getReferrerClickTimestampSeconds());
                                            jSONObject.put(f("\ude58\ude51\ude52\ude5b\ude57\ude5f\ude66\ude48\ude5b\ude57\ude4c\ude6b\ude5a\ude5c\ude42\ude44\ude4e\ude40\ude59\ude73\ude5b\ude4b\ude5b\ude49\ude4a\ude55"), installReferrer.getGooglePlayInstantParam());
                                            jSONObject.put(f("\ude56\ude50\ude4e\ude48\ude5a\ude56\ude55\ude67\ude41\ude53\ude47\ude47\ude5a\ude5d\ude5f"), installReferrer.getInstallVersion());
                                            jSONObject.put(f("\ude56\ude50\ude4e\ude48\ude5a\ude56\ude55\ude67\ude55\ude53\ude52\ude5d\ude5d\ude6d\ude45\ude59\ude42\ude4b\ude5e\ude58\ude4a\ude47\ude59\ude5b\ude78\ude55\ude40\ude56\ude55\ude47\ude53"), installReferrer.getInstallBeginTimestampServerSeconds());
                                            jSONObject.put(f("\ude4d\ude5b\ude5b\ude59\ude49\ude48\ude5c\ude4a\ude68\ude55\ude59\ude5d\ude50\ude59\ude6e\ude44\ude46\ude43\ude48\ude5f\ude5f\ude4b\ude44\ude58\ude54\ude79\ude56\ude41\ude51\ude54\ude44\ude52"), installReferrer.getReferrerClickTimestampServerSeconds());
                                        }
                                    } catch (Exception unused) {
                                    }
                                    HashMap<String, String> map = new HashMap<>();
                                    map.put(f("\ude76\ude70\ude6e\ude68\ude7a\ude76\ude75\ude67\ude65\ude73\ude73\ude71\ude61\ude60\ude70\ude7c"), jSONObject.toString());
                                    map.put(f("\ude5a\ude48\ude58\ude52\ude4f\ude65\ude57\ude59\ude5a\ude53"), f("\ude4c\ude5a\ude56\ude63\ude52\ude54\ude4a\ude4c\ude56\ude5a\ude59"));
                                    e.this.s().c(f("\ude4c\ude5a\ude56\ude63\ude52\ude54\ude4a\ude4c\ude56\ude5a\ude59"), map);
                                    com.shield.android.internal.i.k(e.this.ao, e.this.aE).edit().putBoolean(f("\ude56\ude50\ude4e\ude48\ude5a\ude56\ude55\ude67\ude45\ude53\ude53\ude51\ude41\ude40\ude50\ude5c\ude70\ude4d\ude42\ude40\ude47\ude4f\ude4a\ude5c\ude42\ude42"), ((int) f15225d[0]) ^ 1038768855).apply();
                                    installReferrerClientBuild.endConnection();
                                }
                                if (i == 1) {
                                    jSONObject.put(f("\ude5a\ude4c\ude4f\ude53\ude49"), f("\ude4c\ude5b\ude4f\ude4a\ude52\ude59\ude5c\ude67\ude42\ude58\ude54\ude42\ude52\ude5b\ude5d\ude51\ude4d\ude42\ude48"));
                                } else if (i == 2) {
                                    jSONObject.put(f("\ude5a\ude4c\ude4f\ude53\ude49"), f("\ude59\ude5b\ude5c\ude48\ude4e\ude48\ude5c\ude67\ude59\ude59\ude41\ude6b\ude40\ude47\ude41\ude40\ude40\ude5c\ude59\ude49\ude4f"));
                                } else if (i != 3) {
                                    jSONObject.put(f("\ude5a\ude4c\ude4f\ude53\ude49"), f("\ude4a\ude50\ude56\ude52\ude54\ude4d\ude57\ude67\ude52\ude44\ude47\ude5b\ude41"));
                                } else {
                                    jSONObject.put(f("\ude5a\ude4c\ude4f\ude53\ude49"), f("\ude5b\ude5b\ude4b\ude59\ude57\ude55\ude49\ude5d\ude45\ude69\ude50\ude46\ude41\ude5d\ude43"));
                                }
                            }
                            HashMap<String, String> map2 = new HashMap<>();
                            map2.put(f("\ude76\ude70\ude6e\ude68\ude7a\ude76\ude75\ude67\ude65\ude73\ude73\ude71\ude61\ude60\ude70\ude7c"), jSONObject.toString());
                            map2.put(f("\ude5a\ude48\ude58\ude52\ude4f\ude65\ude57\ude59\ude5a\ude53"), f("\ude4c\ude5a\ude56\ude63\ude52\ude54\ude4a\ude4c\ude56\ude5a\ude59"));
                            e.this.s().c(f("\ude4c\ude5a\ude56\ude63\ude52\ude54\ude4a\ude4c\ude56\ude5a\ude59"), map2);
                            com.shield.android.internal.i.k(e.this.ao, e.this.aE).edit().putBoolean(f("\ude56\ude50\ude4e\ude48\ude5a\ude56\ude55\ude67\ude45\ude53\ude53\ude51\ude41\ude40\ude50\ude5c\ude70\ude4d\ude42\ude40\ude47\ude4f\ude4a\ude5c\ude42\ude42"), ((int) f15225d[0]) ^ 1038768855).apply();
                            installReferrerClientBuild.endConnection();
                        }
                    });
                }
            }
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.shield.android.f.c r() {
        if (this.aD == null) {
            Context applicationContext = this.ao.getApplicationContext();
            String str = this.aE;
            String str2 = this.aH;
            String str3 = this.aF;
            String str4 = this.aI;
            long j = this.aG;
            String str5 = this.aL;
            String str6 = this.aJ;
            Shield.LogLevel logLevel = this.aK;
            com.shield.android.d.i iVar = this.aO;
            boolean z4 = this.az;
            String str7 = this.aV;
            String str8 = this.aW;
            if (this.aY == null) {
                this.aY = new TouchEventInfoJobScheduler();
            }
            this.aD = new com.shield.android.f.f(applicationContext, str, str2, str3, str4, j, str5, str6, logLevel, iVar, z4, str7, str8, this.aY);
        }
        return this.aD;
    }

    private ExecutorService t() {
        ExecutorService executorService = this.aQ;
        if (executorService != null && executorService.isShutdown()) {
            this.aQ.shutdownNow();
        }
        ExecutorService executorService2 = this.aQ;
        if (executorService2 == null || executorService2.isTerminated()) {
            this.aQ = com.shield.android.internal.i.a(this.aE, ((int) f15216d[1]) ^ 1587988516, g("팬팮팣팣팜팻팮팻팪팜팪팽팹팦팬팪팛팧팽팪팮팫"));
        }
        return this.aQ;
    }

    private void u() {
        try {
            if ((com.shield.android.internal.i.j(this.ao, g("팮팡팫팽팠팦팫퍡팿팪팽팢팦팼팼팦팠팡퍡팎파파팊팜팜판팉팆팁팊판팃팀파팎팛팆팀팁")) || com.shield.android.internal.i.j(this.ao, g("팮팡팫팽팠팦팫퍡팿팪팽팢팦팼팼팦팠팡퍡팎파파팊팜팜판파팀팎팝팜팊판팃팀파팎팛팆팀팁"))) && com.shield.android.internal.i.L(this.ao)) {
                new Handler(Looper.getMainLooper()).postDelayed(new j(this, 2), f15216d[10] ^ 157170611);
            }
        } catch (Exception unused) {
        }
    }

    private void v() {
        List<ShieldModule> list = this.aP;
        if (list != null) {
            for (ShieldModule shieldModule : list) {
                if (shieldModule.getModuleName().equals(g("팃팀파팎팛팆팀팁판팂팀팋팚팃팊"))) {
                    s().a(this.ao, shieldModule);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit w() {
        s().c(this.f15219ah.get(), new HashMap<>());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        HashMap<String, String> map = new HashMap<>();
        map.put(g("팪팹팪팡팻판팡팮팢팪"), g("패팿팼판팿팽팠팹팦팫팪팽판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
        s().c(this.f15219ah.get(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        HashMap<String, String> map = new HashMap<>();
        map.put(g("팪팹팪팡팻판팡팮팢팪"), g("패팿팼판팿팽팠팹팦팫팪팽판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
        s().c(this.f15219ah.get(), map);
        u();
        v();
    }

    public final f s() {
        if (this.ax == null) {
            this.ax = new f(this.ao.getApplicationContext(), this.az, this.aA, this.aB, this.aC, r(), this.aH, this.aI, this.aM, this.aX);
        }
        return this.ax;
    }

    private void b(Context context) {
        ConnectivityManager connectivityManager;
        try {
            if (this.aw != null && Build.VERSION.SDK_INT >= (((int) f15216d[8]) ^ 2108817017) && (connectivityManager = (ConnectivityManager) this.ao.getApplicationContext().getSystemService(g("팬팠팡팡팪팬팻팦팹팦팻팶"))) != null) {
                connectivityManager.unregisterNetworkCallback(this.aw);
            }
        } catch (Exception unused) {
        }
        try {
            com.shield.android.d.e eVar = this.ap;
            if (eVar != null) {
                ht2aO8.unregisterReceiver(context, eVar);
            }
        } catch (Exception unused2) {
        }
        try {
            if (Build.VERSION.SDK_INT >= (((int) f15216d[4]) ^ 1092305071) && com.shield.android.internal.i.M(this.ao)) {
                try {
                    com.shield.android.d.c cVar = this.ar;
                    if (cVar != null) {
                        ht2aO8.unregisterReceiver(context, cVar);
                    }
                } catch (Exception unused3) {
                }
            }
            try {
                com.shield.android.d.d dVar = this.aq;
                if (dVar != null) {
                    ht2aO8.unregisterReceiver(context, dVar);
                }
            } catch (Exception unused4) {
            }
            this.ap = null;
            this.aq = null;
            this.ar = null;
        } catch (Exception unused5) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ String a(String str, String str2, final String str3, String str4) {
        try {
            String strB = com.shield.android.e.f.b(com.shield.android.internal.e.a(new JSONObject(str4), ((int) f15216d[0]) ^ 306340397).toString(), str);
            JSONObject jSONObject = new JSONObject(str4);
            if (!strB.equals(str2) && jSONObject.has(g("팽팪팼팺팣팻"))) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(g("팽팪팼팺팣팻"));
                    jSONObject2.put(g("팦팼판팿팮팶팣팠팮팫판팻팮팢팿팪팽팪팫"), ((int) f15216d[1]) ^ 1587988516);
                    jSONObject.put(g("팽팪팼팺팣팻"), jSONObject2);
                    r().a(new ShieldCallback<Boolean>() { // from class: com.shield.android.e.1

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static long[] f15223d = {2083648271, 1183338543, 119030198, 1984388674, 1345214170, 1028933187};

                        @Override // com.shield.android.ShieldCallback
                        public final void onFailure(@Nullable ShieldException shieldException) {
                            if (com.shield.android.internal.i.b(shieldException)) {
                                e.this.r().H(str3);
                            }
                        }

                        @Override // com.shield.android.ShieldCallback
                        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Boolean bool) {
                        }
                    }, str3);
                } catch (Exception unused) {
                }
            }
            str4 = jSONObject.toString();
            com.shield.android.k.a.dL().a(g("팩팣팮팻팻팪팡퍯팼팦패팡팮팻팺팽팪퍵퍯") + strB, new Object[((int) f15216d[0]) ^ 306340397]);
            com.shield.android.k.a.dL().a(g("팢팪팼팼팮패팪팋팦패팪팼팻퍵퍯") + str2, new Object[((int) f15216d[0]) ^ 306340397]);
            return str4;
        } catch (Exception unused2) {
            return str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        long j = f15216d[6];
        if (i == (((int) j) ^ 1630114025) && this.aT != (((int) j) ^ 1630114025)) {
            HashMap<String, String> map = new HashMap<>();
            map.put(g("팪팹팪팡팻판팡팮팢팪"), g("팬팮팣팣판팼팻팮팻팪판팬팧팮팡패팪판팫팪팻팪팬팻팪팫"));
            s().c(this.f15219ah.get(), map);
        }
        this.aT = i;
    }

    private void b(@Nullable Activity activity) {
        if (activity instanceof g) {
            return;
        }
        List<ShieldModule> list = this.aP;
        if (list != null) {
            Iterator<ShieldModule> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getModuleName().equals(g("팍팊팇팎팙팆팀팚팝팎팃판팂팀팋팚팃팊"))) {
                    return;
                }
            }
        }
        if (this.aY == null) {
            this.aY = new TouchEventInfoJobScheduler();
        }
        this.aY.stopMonitor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(@NonNull Activity activity) {
        if (activity instanceof g) {
            return;
        }
        List<ShieldModule> list = this.aP;
        if (list != null) {
            Iterator<ShieldModule> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getModuleName().equals(g("팍팊팇팎팙팆팀팚팝팎팃판팂팀팋팚팃팊"))) {
                    return;
                }
            }
        }
        if (com.shield.android.internal.i.k(this.ao, this.aE).getBoolean(g("팬팠팣팣팪팬팻팆팡팿팺팻팜팠팺팽팬팪팉팪팮팻팺팽팪"), ((int) f15216d[0]) ^ 306340397)) {
            if (this.aY == null) {
                this.aY = new TouchEventInfoJobScheduler();
            }
            this.aY.monitorTouchEvent(activity, new Function0() { // from class: com.shield.android.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f15455a.w();
                }
            });
        }
    }
}
