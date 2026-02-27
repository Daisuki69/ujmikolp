package com.shield.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.common.ShieldModule;
import com.shield.android.shieldsignature.ShieldSignatureGenerator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Shield {
    public static final String ENVIRONMENT_DEV = "DEV";
    public static final String ENVIRONMENT_PROD = "PROD";
    public static final String ENVIRONMENT_STAGING = "STAGING";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f14976F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private List<ShieldModule> f14977G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f14978H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private e f14979I;
    private Handler J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private volatile boolean f14980K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f14981L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f14975d = {2178856, 254948166, 1722529971, 920109993, 571587444, 1343442940, 1333982073};
    public static LogLevel LOG_LEVEL = LogLevel.NONE;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Map<String, Shield> f14974E = new HashMap();

    public interface DeviceResultStateListener {
        void isReady();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Environment {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LogLevel {
        public static final LogLevel DEBUG;
        public static final LogLevel INFO;
        public static final LogLevel NONE;
        public static final LogLevel VERBOSE;

        /* JADX INFO: renamed from: af, reason: collision with root package name */
        private static final /* synthetic */ LogLevel[] f15004af;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15005d = {981395011, 593257772, 1683952126, 697993857, 1966304087, 1881591522};

        static {
            LogLevel logLevel = new LogLevel(d("鱎乏❎Ꮕ"), ((int) f15005d[0]) ^ 981395011);
            NONE = logLevel;
            LogLevel logLevel2 = new LogLevel(d("鱉乎❆Ꮟ"), ((int) f15005d[1]) ^ 593257773);
            INFO = logLevel2;
            LogLevel logLevel3 = new LogLevel(d("鱄久❂Ꮥই"), ((int) f15005d[2]) ^ 1683952124);
            DEBUG = logLevel3;
            LogLevel logLevel4 = new LogLevel(d("鱖久❒Ꮒএҳ舵"), ((int) f15005d[3]) ^ 697993858);
            VERBOSE = logLevel4;
            LogLevel[] logLevelArr = new LogLevel[4];
            long[] jArr = f15005d;
            logLevelArr[((int) jArr[0]) ^ 981395011] = logLevel;
            logLevelArr[((int) jArr[1]) ^ 593257773] = logLevel2;
            logLevelArr[((int) jArr[2]) ^ 1683952124] = logLevel3;
            logLevelArr[((int) jArr[3]) ^ 697993858] = logLevel4;
            f15004af = logLevelArr;
        }

        private LogLevel(String str, int i) {
        }

        public static String d(String str) {
            int i = ((int) f15005d[4]) ^ 1966297942;
            StringBuilder sb2 = new StringBuilder();
            int i4 = ((int) f15005d[0]) ^ 981395011;
            while (i4 < str.length()) {
                long[] jArr = f15005d;
                int i6 = (((i >> (((int) jArr[0]) ^ 981395011)) ^ (i >> (((int) jArr[2]) ^ 1683952124))) ^ (i >> (((int) jArr[3]) ^ 697993858))) ^ (i >> 5);
                long j = jArr[1];
                i = (char) ((i >> (((int) j) ^ 593257773)) | (((char) (i6 & (((int) j) ^ 593257773))) << (((int) jArr[5]) ^ 1881591533)));
                char cCharAt = str.charAt(i4);
                int i10 = cCharAt + i;
                long j6 = f15005d[1];
                int i11 = (~cCharAt) | (~i);
                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 593257773, i11, i10, (((int) j6) ^ 593257773) + i10 + i11));
                long j7 = f15005d[1];
                int i12 = ~i4;
                i4 = i4 + (((int) j7) ^ 593257773) + (((int) j7) ^ 593257773) + ((~(((int) j7) ^ 593257773)) | i12) + (((((int) j7) ^ 593257773) + i4) - ((((((int) j7) ^ 593257773) + i4) + (((int) j7) ^ 593257773)) + ((~(((int) j7) ^ 593257773)) | i12)));
            }
            return sb2.toString();
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) f15004af.clone();
        }
    }

    public /* synthetic */ Shield(Application application, boolean z4, boolean z5, boolean z8, e eVar, List list, String str, byte b8) {
        this(application, z4, z5, z8, eVar, list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Application application) {
        try {
            e eVar = this.f14979I;
            if (eVar == null || eVar.am) {
                return;
            }
            com.shield.android.internal.a.a(d("猂맠岝긯坹ꯞ헭\ueaa0産㪙鴌仼ꜘ叨ꦐ咹⨦锚䪰ꕰ劇ꤠ퓝\uea35\uf558竡㴣黋켵枉뎸\ud98b沁똟嬝ⷸᚦ謉엔押ㄞ飆䰩♄፸觿䒬∌酖"), new Object[((int) f14975d[0]) ^ 2178856]);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.pid == Process.myPid() && runningAppProcessInfo.importance == (((int) f14975d[2]) ^ 1722530007)) {
                com.shield.android.internal.a.a(d("猂맠岝긯坹ꯞ헭\ueaa0産㪙鴌仼ꜘ叨ꦐ咹⨦锚䪰ꕰ劇ꤒ퓙\uea24\uf546竼㴩黄켦柀뎻\ud984法") + application.getPackageName() + d("獱링岧깊坓꯵햿\uea83甔㫋鴳仛ꜹ叏"), new Object[((int) f14975d[0]) ^ 2178856]);
                g gVar = new g();
                gVar.setTitle(runningAppProcessInfo.processName);
                this.f14979I.onActivityCreated(gVar, null);
                this.f14979I.onActivityResumed(gVar);
            }
        } catch (Throwable unused) {
        }
    }

    public static String d(String str) {
        int i = ((int) f14975d[3]) ^ 920069386;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f14975d[0]) ^ 2178856;
        while (i4 < str.length()) {
            long[] jArr = f14975d;
            int i6 = (((i >> (((int) jArr[0]) ^ 2178856)) ^ (i >> (((int) jArr[4]) ^ 571587446))) ^ (i >> (((int) jArr[5]) ^ 1343442943))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 254948167)) | (((char) (i6 & (((int) j) ^ 254948167))) << (((int) jArr[6]) ^ 1333982070)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f14975d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 254948167, i11, i10, (((int) j6) ^ 254948167) + i10 + i11));
            long j7 = f14975d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 254948167) + (((int) j7) ^ 254948167) + ((~(((int) j7) ^ 254948167)) | i12) + (((((int) j7) ^ 254948167) + i4) - ((((((int) j7) ^ 254948167) + i4) + (((int) j7) ^ 254948167)) + ((~(((int) j7) ^ 254948167)) | i12)));
        }
        return sb2.toString();
    }

    public static Shield getInstance() throws IllegalStateException {
        Map<String, Shield> map = f14974E;
        if (map.isEmpty()) {
            throw new IllegalStateException(d("猂링岺긍坙\uabff햹\uea89甝㪙鴵什Ꜥ叟ꦴ咄⨖镟䪽ꔦ勆ꤠ퓇\uea73\uf55e窵㴩黗켷柈뎠\ud98f沑뙚孄ⷻᚻ證얓抉\u3100飓䰺♞፳覫䒶∇酅䢸ꐿ剏⥽铮䨨ꕇ틥\ue927\uf4ca穲㵀黺켹\ue7d1\uf3b3禇벗帟⼝\u17ffன薓슖愋난\ud83c汚㙾᭧\u0de1ګ̏Ǘ胸쀚\ue05f灺㠭鱤칶\ue768\uf3ec禤㲅鸂"));
        }
        return map.values().iterator().next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isInitialized() {
        try {
            return getInstance() != null ? ((int) f14975d[1]) ^ 254948167 : 2178856 ^ ((int) f14975d[0]);
        } catch (Exception unused) {
            return 2178856 ^ ((int) f14975d[0]);
        }
    }

    public static void setSingletonInstance(@NonNull Shield shield) {
        synchronized (Shield.class) {
            f14974E.put(shield.f14981L, shield);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public static boolean stop() {
        try {
            return Process.isIsolated();
        } catch (Exception unused) {
            return ((int) f14975d[0]) ^ 2178856;
        }
    }

    public static void stopSdk(@NonNull String str) {
    }

    @Nullable
    public JSONObject getLatestDeviceResult() {
        return this.f14979I.s().S();
    }

    @Nullable
    public ShieldException getResponseError() {
        return this.f14979I.s().Q();
    }

    public String getSessionId() {
        return this.f14979I.s().R();
    }

    @AnyThread
    public void sendAttributes(String str, HashMap<String, String> map) {
        if (this.f14976F) {
            return;
        }
        this.f14979I.s().a(str, map);
    }

    public void sendDeviceSignature(@NonNull String str, DeviceResultStateListener deviceResultStateListener) {
        this.f14979I.s().a(str, deviceResultStateListener);
    }

    public void setDeviceResultStateListener(DeviceResultStateListener deviceResultStateListener) {
        this.f14979I.s().a(deviceResultStateListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startTracking(Activity activity, String str, String str2) {
        List<ShieldModule> list = this.f14977G;
        if (list != null) {
            for (ShieldModule shieldModule : list) {
                String moduleName = shieldModule.getModuleName();
                if (this.f14978H) {
                    com.shield.android.internal.a.a(d("猓맍岼긋坃꯳햢\uea93甁㫘鴰代Ꜹ叏ꦠ咆⨐销䪽ꔛ勉ꤲ퓋\uea38\uf54f窵㴾黊콲柚뎠\ud98b沇똎嬝ⷪᚽ謆에抲ㄅ飘䰼☃ጶ觟䒷∃酒䣳ꐥ剈⥴钩䨭ꕑ튱\ue929\uf4c8稠㵌黵켮\ue7dc\uf3f2禈벗帎⽔៨ப藉"), new Object[((int) f14975d[0]) ^ 2178856]);
                }
                if (moduleName.equals(str) && !this.f14978H) {
                    shieldModule.startTracking(((int) f14975d[1]) ^ 254948167);
                    this.f14978H = ((int) f14975d[1]) ^ 254948167;
                    this.f14979I.s().a(new WeakReference<>(activity), shieldModule, str2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void stopTracking(String str) {
        for (ShieldModule shieldModule : this.f14977G) {
            String moduleName = shieldModule.getModuleName();
            if (!this.f14978H) {
                com.shield.android.internal.a.a(d("猓맍岼긋坃꯳햢\uea93甁㫘鴰代Ꜹ叏ꦠ咆⨐销䪽ꔛ勉ꤲ퓋\uea38\uf54f窵㴾黊콲柚뎠\ud985沅뙚孉ⷬᚮ謄엘抰\u3102飑䱵☍ፂ觹䒤∁酚䣱ꐢ剁⤳铠䨷ꔂ틿\ue927\uf4d0穲㵈黷켾\ue7cc\uf3a4禌볚"), new Object[((int) f14975d[0]) ^ 2178856]);
            }
            if (moduleName.equals(str) && this.f14978H) {
                shieldModule.stopTracking();
                this.f14978H = ((int) f14975d[0]) ^ 2178856;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    private Shield(Application application, boolean z4, boolean z5, boolean z8, e eVar, List<ShieldModule> list, String str) {
        boolean z9 = ((int) f14975d[0]) ^ 2178856;
        this.f14976F = z9;
        this.f14978H = z9;
        this.f14980K = z9;
        this.f14981L = str;
        if (stop()) {
            return;
        }
        this.f14976F = z4;
        this.f14979I = eVar;
        this.f14977G = list;
        Handler handler = new Handler(Looper.getMainLooper());
        this.J = handler;
        handler.postDelayed(new k(1, this, application), new Random().nextInt(500) + 500);
        com.shield.android.internal.a.a(d("猂맠岝긯坹ꯞ헭\ueaa0産㪙鴌仼ꜘ叨ꦐ咹⨦锚䪰ꕰ劇ꤠ퓁\uea3d\uf54f竹㴮麅켻柇뎽\ud99e沜똛孑ⷷᚵ謂엗拹ㄊ食䰵♄፥解䒠∆"), new Object[((int) f14975d[0]) ^ 2178856]);
    }

    public void sendDeviceSignature(@NonNull String str) {
        this.f14979I.s().a(str, (DeviceResultStateListener) null);
    }

    @AnyThread
    public void sendAttributes(@NonNull String str, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<Boolean> shieldCallback) {
        this.f14979I.s().a(str, map, shieldCallback);
    }

    public static class Builder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f14982d = {348414332, 718708019, 2000626815};

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private List<ShieldModule> f14983G;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private String f14984L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private final Application f14985M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private Activity f14986N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f14987O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private String f14988P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private String f14989Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private String f14990R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private String f14991S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private LogLevel f14992T = LogLevel.NONE;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private Boolean f14993U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        private ShieldCallback<JSONObject> f14994V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        private Boolean f14995W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private Thread f14996X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private String f14997Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private Boolean f14998Z;

        /* JADX INFO: renamed from: aa, reason: collision with root package name */
        private boolean f14999aa;

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        private BlockedDialog f15000ab;

        /* JADX INFO: renamed from: ac, reason: collision with root package name */
        private String f15001ac;

        /* JADX INFO: renamed from: ad, reason: collision with root package name */
        private String f15002ad;

        /* JADX INFO: renamed from: ae, reason: collision with root package name */
        private String f15003ae;

        /* JADX WARN: Multi-variable type inference failed */
        @RequiresPermission("android.permission.INTERNET")
        @SuppressLint({"NewApi"})
        public Builder(@NonNull Context context, @NonNull String str, @NonNull String str2) {
            Boolean bool = Boolean.FALSE;
            this.f14995W = bool;
            this.f14998Z = bool;
            this.f14999aa = ((int) f14982d[0]) ^ 348414332;
            Application application = (Application) context.getApplicationContext();
            this.f14985M = application;
            if (Process.isIsolated()) {
                return;
            }
            if (application == null) {
                throw new IllegalArgumentException(g("⠩⠘⠘⠄⠁⠋⠉⠜⠁⠇⠆⡈⠋⠇⠆⠜⠍⠐⠜⡈⠅⠝⠛⠜⡈⠆⠇⠜⡈⠊⠍⡈⠆⠝⠄⠄⡆"));
            }
            if (!com.shield.android.internal.i.b(context, g("⠉⠆⠌⠚⠇⠁⠌⡆⠘⠍⠚⠅⠁⠛⠛⠁⠇⠆⡆⠡⠦⠼⠭⠺⠦⠭⠼"))) {
                throw new IllegalArgumentException(g("⠡⠦⠼⠭⠺⠦⠭⠼⡈⠘⠍⠚⠅⠁⠛⠛⠁⠇⠆⡈⠁⠛⡈⠚⠍⠙⠝⠁⠚⠍⠌⡆"));
            }
            if (com.shield.android.internal.i.a(str)) {
                throw new IllegalArgumentException(g("⠛⠁⠜⠍⠡⠌⡈⠅⠝⠛⠜⡈⠆⠇⠜⡈⠊⠍⡈⠆⠝⠄⠄⡈⠇⠚⡈⠍⠅⠘⠜⠑⡆"));
            }
            this.f14984L = str;
            if (com.shield.android.internal.i.a(str2)) {
                throw new IllegalArgumentException(g("⠛⠍⠋⠚⠍⠜⠣⠍⠑⡈⠅⠝⠛⠜⡈⠆⠇⠜⡈⠊⠍⡈⠆⠝⠄⠄⡈⠇⠚⡈⠍⠅⠘⠜⠑⡆"));
            }
            this.f14991S = str2;
        }

        public static String g(String str) {
            StringBuilder sb2 = new StringBuilder();
            int i = ((int) f14982d[0]) ^ 348414332;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                long[] jArr = f14982d;
                long j = jArr[2];
                long j6 = jArr[1];
                int i4 = ~cCharAt;
                int i6 = (((int) j) ^ 2000620567) + cCharAt;
                sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 2000620567) + (((int) j6) ^ 718708018), i4 | (~(((int) j) ^ 2000620567)), i6, (((int) j) ^ 2000620567) + cCharAt + (((int) j6) ^ 718708018) + ((~(((int) j) ^ 2000620567)) | i4)));
                long j7 = f14982d[1];
                int i10 = ~i;
                i = i + (((int) j7) ^ 718708018) + (((int) j7) ^ 718708018) + ((~(((int) j7) ^ 718708018)) | i10) + (((((int) j7) ^ 718708018) + i) - ((((((int) j7) ^ 718708018) + i) + (((int) j7) ^ 718708018)) + ((~(((int) j7) ^ 718708018)) | i10)));
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q() {
            ShieldSignatureGenerator.initialize(this.f14985M, this.f14991S, this.f14984L);
        }

        public Builder addModule(List<ShieldModule> list) {
            this.f14983G = list;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder blockScreenRecording() {
            this.f14999aa = ((int) f14982d[1]) ^ 718708018;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"NewApi"})
        public Shield build() {
            if (Shield.stop()) {
                boolean z4 = ((int) f14982d[0]) ^ 348414332;
                return new Shield(null, z4, z4, z4, null, null, null, z4 ? (byte) 1 : (byte) 0);
            }
            synchronized (Shield.f14974E) {
                if (Shield.f14974E.containsKey(this.f14984L)) {
                    return null;
                }
                new Thread(new m(this, 4)).start();
                com.shield.android.internal.a.a(g("⠻⠠⠡⠭⠤⠬⡈⠮⠸⡈⠸⠺⠧⠫⠭⠻⠻⡈⡅⡖⡈⠛⠀⠁⠍⠄⠌⡈⠁⠆⠁⠜⠁⠉⠄⠁⠒⠍⠌"), new Object[((int) f14982d[0]) ^ 348414332]);
                try {
                    this.f14987O = UUID.randomUUID().toString().replaceAll(g("⠳⠶⠉⡅⠒⠩⡅⠲⡘⡅⡑⠵"), g(""));
                } catch (Exception unused) {
                    this.f14987O = UUID.randomUUID().toString();
                }
                com.shield.android.internal.a.a(g("⠻⠠⠡⠭⠤⠬⡈⠮⠸⡈⠸⠺⠧⠫⠭⠻⠻⡈⡅⡖⡈⠻⠍⠛⠛⠁⠇⠆⡈⠋⠚⠍⠉⠜⠍⠌⡈⠉⠜⡈") + System.currentTimeMillis(), new Object[((int) f14982d[0]) ^ 348414332]);
                if (com.shield.android.internal.i.a(this.f14988P)) {
                    this.f14988P = g("⠽⠻");
                }
                if (com.shield.android.internal.i.a(this.f14989Q)) {
                    this.f14989Q = g("⠸⠺⠧⠬");
                }
                if (this.f14992T == null) {
                    this.f14992T = LogLevel.NONE;
                }
                if (this.f14993U == null) {
                    this.f14993U = Boolean.TRUE;
                }
                if (this.f14995W == null) {
                    this.f14995W = Boolean.FALSE;
                }
                if (this.f14997Y == null) {
                    this.f14997Y = g("");
                }
                this.f15001ac = g("");
                this.f15002ad = g("");
                this.f15003ae = g("");
                if (this.f15001ac == null) {
                    this.f15001ac = g("");
                }
                if (this.f15002ad == null) {
                    this.f15002ad = g("");
                }
                e eVar = new e(this.f14985M, this.f14984L, this.f14991S, System.currentTimeMillis(), this.f14999aa, this.f14998Z.booleanValue(), this.f14994V, this.f14996X, this.f14995W.booleanValue(), this.f14987O, this.f14997Y, this.f14990R, this.f14989Q, this.f14992T, this.f15000ab, this.f14983G, this.f15001ac, this.f15002ad, this.f15003ae);
                this.f14985M.registerActivityLifecycleCallbacks(eVar);
                Activity activity = this.f14986N;
                if (activity != null) {
                    eVar.onActivityCreated(activity, null);
                }
                return new Shield(this.f14985M, this.f14995W.booleanValue(), this.f14998Z.booleanValue(), this.f14999aa, eVar, this.f14983G, this.f14984L, (((int) f14982d[0]) ^ 348414332) == true ? (byte) 1 : (byte) 0);
            }
        }

        public Builder enableBackgroundListener() {
            this.f14998Z = Boolean.TRUE;
            return this;
        }

        public Builder enableMocking() {
            this.f14995W = Boolean.TRUE;
            return this;
        }

        @Deprecated(since = "1.6.37")
        public Builder enableStopShield() {
            return this;
        }

        public Builder registerDeviceShieldCallback(ShieldCallback<JSONObject> shieldCallback) {
            this.f14994V = shieldCallback;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null || looperMyLooper != Looper.getMainLooper()) {
                this.f14996X = Thread.currentThread();
                return this;
            }
            this.f14996X = null;
            return this;
        }

        public Builder setAutoBlockDialog(BlockedDialog blockedDialog) {
            this.f15000ab = blockedDialog;
            return this;
        }

        public Builder setClientId(String str) {
            this.f15002ad = str;
            return this;
        }

        public Builder setCustomDomainUrl(@NonNull String str) {
            this.f15003ae = str;
            return this;
        }

        @AnyThread
        public Builder setEnvironment(String str) {
            if (com.shield.android.internal.i.a(str)) {
                throw new IllegalArgumentException(g("⠍⠆⠞⠁⠚⠇⠆⠅⠍⠆⠜⡈⠅⠝⠛⠜⡈⠆⠇⠜⡈⠊⠍⡈⠆⠝⠄⠄⡈⠇⠚⡈⠍⠅⠘⠜⠑⡆"));
            }
            this.f14989Q = str;
            return this;
        }

        public Builder setLogLevel(@NonNull LogLevel logLevel) {
            this.f14992T = logLevel;
            Shield.LOG_LEVEL = logLevel;
            return this;
        }

        public Builder setPartnerId(String str) {
            this.f14997Y = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.f15001ac = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @RequiresPermission("android.permission.INTERNET")
        public Builder(@NonNull Activity activity, @NonNull String str, @NonNull String str2) {
            Boolean bool = Boolean.FALSE;
            this.f14995W = bool;
            this.f14998Z = bool;
            this.f14999aa = ((int) f14982d[0]) ^ 348414332;
            this.f14986N = activity;
            Application application = (Application) activity.getApplicationContext();
            this.f14985M = application;
            if (application != null) {
                if (com.shield.android.internal.i.b(activity, g("⠉⠆⠌⠚⠇⠁⠌⡆⠘⠍⠚⠅⠁⠛⠛⠁⠇⠆⡆⠡⠦⠼⠭⠺⠦⠭⠼"))) {
                    if (!com.shield.android.internal.i.a(str)) {
                        this.f14984L = str;
                        if (!com.shield.android.internal.i.a(str2)) {
                            this.f14991S = str2;
                            return;
                        }
                        throw new IllegalArgumentException(g("⠛⠍⠋⠚⠍⠜⠣⠍⠑⡈⠅⠝⠛⠜⡈⠆⠇⠜⡈⠊⠍⡈⠆⠝⠄⠄⡈⠇⠚⡈⠍⠅⠘⠜⠑⡆"));
                    }
                    throw new IllegalArgumentException(g("⠛⠁⠜⠍⠡⠌⡈⠅⠝⠛⠜⡈⠆⠇⠜⡈⠊⠍⡈⠆⠝⠄⠄⡈⠇⠚⡈⠍⠅⠘⠜⠑⡆"));
                }
                throw new IllegalArgumentException(g("⠡⠦⠼⠭⠺⠦⠭⠼⡈⠘⠍⠚⠅⠁⠛⠛⠁⠇⠆⡈⠁⠛⡈⠚⠍⠙⠝⠁⠚⠍⠌⡆"));
            }
            throw new IllegalArgumentException(g("⠩⠘⠘⠄⠁⠋⠉⠜⠁⠇⠆⡈⠋⠇⠆⠜⠍⠐⠜⡈⠅⠝⠛⠜⡈⠆⠇⠜⡈⠊⠍⡈⠆⠝⠄⠄⡆"));
        }
    }
}
