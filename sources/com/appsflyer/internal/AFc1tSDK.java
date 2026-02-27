package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Build;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.L;
import cj.M;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1oSDK;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import org.json.JSONObject;
import zj.C2581c;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1tSDK implements AFc1uSDK {
    private static boolean AFLogger$LogLevel = true;
    private static int AFVersionDeclaration = 0;
    private static int afWarnLog = 1;
    private final InterfaceC1033d AFInAppEventParameterName;
    private final InterfaceC1033d AFInAppEventType;
    private final InterfaceC1033d AFKeystoreWrapper;
    private final InterfaceC1033d afDebugLog;
    private final InterfaceC1033d afErrorLog;
    private final String afInfoLog;
    private final InterfaceC1033d afRDLog;
    private AFc1zSDK valueOf;
    private final InterfaceC1033d values;
    private static char[] AFLogger = {201, 217, 200, 213, 203};
    private static boolean afErrorLogForExcManagerOnly = true;
    private static int getLevel = 103;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1tSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<AFb1tSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFb1tSDK invoke() {
            AFb1tSDK aFb1tSDKAfInfoLog = AFc1tSDK.values(AFc1tSDK.this).afInfoLog();
            j.f(aFb1tSDKAfInfoLog, "");
            return aFb1tSDKAfInfoLog;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1tSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function0<AFa1eSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFa1eSDK invoke() {
            AFc1xSDK aFc1xSDKAFVersionDeclaration = AFc1tSDK.values(AFc1tSDK.this).AFVersionDeclaration();
            j.f(aFc1xSDKAFVersionDeclaration, "");
            return new AFa1eSDK(aFc1xSDKAFVersionDeclaration);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1tSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends k implements Function0<AFb1bSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final AFb1bSDK invoke() {
            AFb1bSDK aFb1bSDKValueOf = AFc1tSDK.values(AFc1tSDK.this).valueOf();
            j.f(aFb1bSDKValueOf, "");
            return aFb1bSDKValueOf;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1tSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends k implements Function0<AFb1gSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFb1gSDK invoke() {
            AFb1gSDK aFb1gSDKAfDebugLog = AFc1tSDK.values(AFc1tSDK.this).afDebugLog();
            j.f(aFb1gSDKAfDebugLog, "");
            return aFb1gSDKAfDebugLog;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1tSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends k implements Function0<ExecutorService> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService executorServiceAFInAppEventParameterName = AFc1tSDK.values(AFc1tSDK.this).AFInAppEventParameterName();
            j.f(executorServiceAFInAppEventParameterName, "");
            return executorServiceAFInAppEventParameterName;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1tSDK$7, reason: invalid class name */
    public static final class AnonymousClass7 extends k implements Function0<AFa1cSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final AFa1cSDK invoke() {
            return new AFa1cSDK(AFc1tSDK.this.AFInAppEventParameterName());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1tSDK$9, reason: invalid class name */
    public static final class AnonymousClass9 extends k implements Function0<AFe1sSDK> {
        public AnonymousClass9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final AFe1sSDK invoke() {
            AFe1sSDK aFe1sSDKAfWarnLog = AFc1tSDK.values(AFc1tSDK.this).afWarnLog();
            j.f(aFe1sSDKAfWarnLog, "");
            return aFe1sSDKAfWarnLog;
        }
    }

    public AFc1tSDK(AFc1zSDK aFc1zSDK) {
        j.g(aFc1zSDK, "");
        this.valueOf = aFc1zSDK;
        this.values = C1034e.b(new AnonymousClass1());
        this.AFInAppEventType = C1034e.b(new AnonymousClass3());
        this.AFKeystoreWrapper = C1034e.b(new AnonymousClass4());
        this.AFInAppEventParameterName = C1034e.b(new AnonymousClass9());
        this.afErrorLog = C1034e.b(new AnonymousClass5());
        this.afInfoLog = "6.10.1";
        this.afDebugLog = C1034e.b(new AnonymousClass2());
        this.afRDLog = C1034e.b(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFc1tSDK aFc1tSDK, Throwable th2, String str) {
        j.g(aFc1tSDK, "");
        j.g(th2, "");
        j.g(str, "");
        AFb1oSDK level = aFc1tSDK.getLevel();
        if (level == null || !aFc1tSDK.AFInAppEventType(level)) {
            return;
        }
        int i = AFVersionDeclaration + 77;
        int i4 = i % 128;
        afWarnLog = i4;
        if (i % 2 == 0) {
            return;
        }
        AFVersionDeclaration = (i4 + 123) % 128;
        aFc1tSDK.AFInAppEventParameterName().values(th2, str);
    }

    private final ExecutorService AFLogger() {
        int i = afWarnLog + 37;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            return (ExecutorService) this.afErrorLog.getValue();
        }
        int i4 = 33 / 0;
        return (ExecutorService) this.afErrorLog.getValue();
    }

    private AFc1oSDK AFLogger$LogLevel() {
        AFc1oSDK aFc1oSDK;
        int i = AFVersionDeclaration + 99;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            aFc1oSDK = (AFc1oSDK) this.afRDLog.getValue();
            int i4 = 9 / 0;
        } else {
            aFc1oSDK = (AFc1oSDK) this.afRDLog.getValue();
        }
        afWarnLog = (AFVersionDeclaration + 45) % 128;
        return aFc1oSDK;
    }

    private final void AFVersionDeclaration() {
        AFVersionDeclaration = (afWarnLog + 11) % 128;
        AFb1oSDK level = getLevel();
        if (level == null) {
            int i = afWarnLog + 73;
            AFVersionDeclaration = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!values(level)) {
            AFLogger.afRDLog("[Exception Manager]: ".concat("skipping"));
            return;
        }
        int i4 = AFVersionDeclaration + 117;
        afWarnLog = i4 % 128;
        if (i4 % 2 == 0) {
            String str = afErrorLog().AFInAppEventParameterName;
            throw null;
        }
        String str2 = afErrorLog().AFInAppEventParameterName;
        if (str2 != null) {
            String string = new JSONObject(AFInAppEventParameterName(AFInAppEventParameterName(level), AFInAppEventParameterName().AFInAppEventParameterName())).toString();
            j.f(string, "");
            AFInAppEventType(string, str2);
        }
    }

    private final AFb1gSDK afDebugLog() {
        afWarnLog = (AFVersionDeclaration + 9) % 128;
        AFb1gSDK aFb1gSDK = (AFb1gSDK) this.AFKeystoreWrapper.getValue();
        int i = afWarnLog + 69;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            return aFb1gSDK;
        }
        throw null;
    }

    private final AFe1sSDK afErrorLog() {
        AFVersionDeclaration = (afWarnLog + 91) % 128;
        AFe1sSDK aFe1sSDK = (AFe1sSDK) this.AFInAppEventParameterName.getValue();
        afWarnLog = (AFVersionDeclaration + 13) % 128;
        return aFe1sSDK;
    }

    private final synchronized void afErrorLogForExcManagerOnly() {
        String str;
        try {
            afWarnLog = (AFVersionDeclaration + 95) % 128;
            try {
                AFb1oSDK level = getLevel();
                str = level != null ? level.AFInAppEventParameterName : null;
                if (str == null) {
                    str = "";
                }
            } catch (NullPointerException unused) {
                str = "NOT_DETECTED";
            }
            if (AFc1oSDK.AFa1vSDK.values(str) != -1) {
                int i = AFVersionDeclaration + 89;
                afWarnLog = i % 128;
                if (i % 2 == 0) {
                    AFc1oSDK.AFa1vSDK.values(str);
                    AFc1oSDK.AFa1vSDK.values(afRDLog());
                    throw null;
                }
                if (AFc1oSDK.AFa1vSDK.values(str) <= AFc1oSDK.AFa1vSDK.values(afRDLog())) {
                    AFInAppEventParameterName().AFInAppEventParameterName(afRDLog());
                    AFVersionDeclaration = (afWarnLog + 1) % 128;
                    return;
                }
            }
            afDebugLog().AFInAppEventType("af_send_exc_to_server_window");
            AFInAppEventParameterName().values();
            afWarnLog = (AFVersionDeclaration + 1) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final AFb1bSDK afInfoLog() {
        AFVersionDeclaration = (afWarnLog + 17) % 128;
        AFb1bSDK aFb1bSDK = (AFb1bSDK) this.AFInAppEventType.getValue();
        afWarnLog = (AFVersionDeclaration + 113) % 128;
        return aFb1bSDK;
    }

    private String afRDLog() {
        int i = (AFVersionDeclaration + 81) % 128;
        afWarnLog = i;
        String str = this.afInfoLog;
        AFVersionDeclaration = (i + 49) % 128;
        return str;
    }

    private final synchronized void afWarnLog() {
        int i = afWarnLog + 69;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            getLevel();
            throw null;
        }
        AFb1oSDK level = getLevel();
        if (level == null) {
            int i4 = afWarnLog + 71;
            AFVersionDeclaration = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            } else {
                throw null;
            }
        }
        if (level.valueOf == -1) {
            afDebugLog().AFInAppEventType("af_send_exc_to_server_window");
            return;
        }
        if (afDebugLog().AFInAppEventParameterName("af_send_exc_to_server_window", -1L) == -1) {
            int i6 = level.AFKeystoreWrapper;
            long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(level.valueOf);
            AFb1gSDK aFb1gSDKAfDebugLog = afDebugLog();
            aFb1gSDKAfDebugLog.values("af_send_exc_to_server_window", jCurrentTimeMillis);
            aFb1gSDKAfDebugLog.AFInAppEventParameterName("af_send_exc_min", i6);
        }
        return;
    }

    private final AFb1oSDK getLevel() {
        AFb1iSDK aFb1iSDK = valueOf().valueOf.AFInAppEventType;
        if (aFb1iSDK != null) {
            int i = AFVersionDeclaration;
            afWarnLog = (i + 21) % 128;
            AFb1nSDK aFb1nSDK = aFb1iSDK.AFInAppEventType;
            if (aFb1nSDK != null) {
                int i4 = i + 41;
                afWarnLog = i4 % 128;
                int i6 = i4 % 2;
                AFb1oSDK aFb1oSDK = aFb1nSDK.values;
                if (i6 != 0) {
                    return aFb1oSDK;
                }
                throw null;
            }
        }
        int i10 = afWarnLog + 105;
        AFVersionDeclaration = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final AFb1tSDK valueOf() {
        int i = AFVersionDeclaration + 85;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            return (AFb1tSDK) this.values.getValue();
        }
        throw null;
    }

    public static final /* synthetic */ AFc1zSDK values(AFc1tSDK aFc1tSDK) {
        int i = AFVersionDeclaration;
        int i4 = i + 89;
        afWarnLog = i4 % 128;
        int i6 = i4 % 2;
        AFc1zSDK aFc1zSDK = aFc1tSDK.valueOf;
        if (i6 == 0) {
            throw null;
        }
        int i10 = i + 111;
        afWarnLog = i10 % 128;
        if (i10 % 2 != 0) {
            return aFc1zSDK;
        }
        throw null;
    }

    public final AFc1sSDK AFInAppEventParameterName() {
        AFVersionDeclaration = (afWarnLog + 109) % 128;
        AFc1sSDK aFc1sSDK = (AFc1sSDK) this.afDebugLog.getValue();
        int i = afWarnLog + 61;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            int i4 = 51 / 0;
        }
        return aFc1sSDK;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void AFKeystoreWrapper() {
        afWarnLog = (AFVersionDeclaration + 87) % 128;
        AFLogger().execute(new c(this, 0));
        afWarnLog = (AFVersionDeclaration + 41) % 128;
    }

    private final Map<String, String> AFInAppEventParameterName(AFb1oSDK aFb1oSDK) throws UnsupportedEncodingException {
        Object[] objArr = new Object[1];
        AFInAppEventParameterName(null, null, "\u0085\u0084\u0083\u0082\u0081", 127 - Color.blue(0), objArr);
        Map<String, String> mapH = M.h(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", afInfoLog().values.AFKeystoreWrapper.getPackageName()), new Pair("p_ex", new AFb1vSDK().values()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", afRDLog()), new Pair("uid", AFb1zSDK.AFInAppEventParameterName(new WeakReference(afInfoLog().values.AFKeystoreWrapper))), new Pair("exc_config", aFb1oSDK.valueOf()));
        int i = AFVersionDeclaration + 7;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            return mapH;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFc1tSDK aFc1tSDK) {
        int i = AFVersionDeclaration + 35;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            j.g(aFc1tSDK, "");
            aFc1tSDK.afWarnLog();
        } else {
            j.g(aFc1tSDK, "");
            aFc1tSDK.afWarnLog();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void valueOf(Throwable th2, String str) {
        int i = afWarnLog + 89;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            j.g(th2, "");
            j.g(str, "");
            AFLogger().execute(new androidx.work.impl.b(3, this, th2, str));
        } else {
            j.g(th2, "");
            j.g(str, "");
            AFLogger().execute(new androidx.work.impl.b(3, this, th2, str));
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void values() {
        afWarnLog = (AFVersionDeclaration + 123) % 128;
        AFLogger().execute(new c(this, 1));
        int i = afWarnLog + 63;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFc1tSDK aFc1tSDK) {
        AFVersionDeclaration = (afWarnLog + 29) % 128;
        j.g(aFc1tSDK, "");
        aFc1tSDK.afErrorLogForExcManagerOnly();
        int i = afWarnLog + 55;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final boolean values(AFb1oSDK aFb1oSDK) {
        int iAFKeystoreWrapper;
        AFVersionDeclaration = (afWarnLog + 9) % 128;
        long jAFInAppEventParameterName = afDebugLog().AFInAppEventParameterName("af_send_exc_to_server_window", -1L);
        if (jAFInAppEventParameterName != -1) {
            int i = AFVersionDeclaration + 91;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                System.currentTimeMillis();
                throw null;
            }
            if (jAFInAppEventParameterName >= System.currentTimeMillis() && (iAFKeystoreWrapper = afDebugLog().AFKeystoreWrapper("af_send_exc_min", -1)) != -1) {
                AFVersionDeclaration = (afWarnLog + 115) % 128;
                if (AFInAppEventParameterName().AFKeystoreWrapper() >= iAFKeystoreWrapper) {
                    String str = aFb1oSDK.AFInAppEventParameterName;
                    j.f(str, "");
                    if (AFc1oSDK.AFa1vSDK.values(str) == AFc1oSDK.AFa1vSDK.values(afRDLog())) {
                        return true;
                    }
                    int i4 = AFVersionDeclaration + 29;
                    afWarnLog = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i6 = 17 / 0;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFc1tSDK aFc1tSDK) {
        int i = AFVersionDeclaration + 75;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            j.g(aFc1tSDK, "");
            aFc1tSDK.AFVersionDeclaration();
        } else {
            j.g(aFc1tSDK, "");
            aFc1tSDK.AFVersionDeclaration();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void AFInAppEventType() {
        afWarnLog = (AFVersionDeclaration + 97) % 128;
        AFLogger().execute(new c(this, 2));
        int i = afWarnLog + 9;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final boolean AFInAppEventType(AFb1oSDK aFb1oSDK) {
        long jAFInAppEventParameterName = afDebugLog().AFInAppEventParameterName("af_send_exc_to_server_window", -1L);
        if (jAFInAppEventParameterName != -1) {
            int i = afWarnLog + 113;
            AFVersionDeclaration = i % 128;
            if (i % 2 != 0) {
                System.currentTimeMillis();
                throw null;
            }
            if (jAFInAppEventParameterName >= System.currentTimeMillis()) {
                String str = aFb1oSDK.AFInAppEventParameterName;
                j.f(str, "");
                if (AFc1oSDK.AFa1vSDK.values(str) != AFc1oSDK.AFa1vSDK.values(afRDLog())) {
                    return false;
                }
                afWarnLog = (AFVersionDeclaration + 33) % 128;
                return true;
            }
        }
        return false;
    }

    @WorkerThread
    private final void AFInAppEventType(String str, String str2) {
        afWarnLog = (AFVersionDeclaration + 47) % 128;
        byte[] bytes = str.getBytes(C2581c.f21468b);
        j.f(bytes, "");
        AFLogger$LogLevel().AFKeystoreWrapper(bytes, L.c(new Pair(RtspHeaders.AUTHORIZATION, AFb1ySDK.AFInAppEventType(str, str2))), 2000);
        int i = AFVersionDeclaration + 53;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static Map<String, Object> AFInAppEventParameterName(Map<String, ? extends Object> map, List<AFc1wSDK> list) {
        AFVersionDeclaration = (afWarnLog + 15) % 128;
        Map<String, Object> mapH = M.h(new Pair("deviceInfo", map), new Pair("excs", AFc1oSDK.AFa1vSDK.AFInAppEventParameterName(list)));
        int i = afWarnLog + 35;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            int i4 = 30 / 0;
        }
        return mapH;
    }

    private static void AFInAppEventParameterName(int[] iArr, String str, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFg1wSDK.valueOf) {
            try {
                char[] cArr2 = AFLogger;
                int i4 = getLevel;
                if (afErrorLogForExcManagerOnly) {
                    int length = bArr.length;
                    AFg1wSDK.AFKeystoreWrapper = length;
                    char[] cArr3 = new char[length];
                    AFg1wSDK.AFInAppEventType = 0;
                    while (AFg1wSDK.AFInAppEventType < AFg1wSDK.AFKeystoreWrapper) {
                        int i6 = AFg1wSDK.AFInAppEventType;
                        int i10 = AFg1wSDK.AFKeystoreWrapper - 1;
                        int i11 = AFg1wSDK.AFInAppEventType;
                        cArr3[i6] = (char) (cArr2[bArr[i10 - i11] + i] - i4);
                        AFg1wSDK.AFInAppEventType = i11 + 1;
                    }
                    objArr[0] = new String(cArr3);
                    return;
                }
                if (AFLogger$LogLevel) {
                    int length2 = cArr.length;
                    AFg1wSDK.AFKeystoreWrapper = length2;
                    char[] cArr4 = new char[length2];
                    AFg1wSDK.AFInAppEventType = 0;
                    while (AFg1wSDK.AFInAppEventType < AFg1wSDK.AFKeystoreWrapper) {
                        int i12 = AFg1wSDK.AFInAppEventType;
                        int i13 = AFg1wSDK.AFKeystoreWrapper - 1;
                        int i14 = AFg1wSDK.AFInAppEventType;
                        cArr4[i12] = (char) (cArr2[cArr[i13 - i14] - i] - i4);
                        AFg1wSDK.AFInAppEventType = i14 + 1;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                int length3 = iArr.length;
                AFg1wSDK.AFKeystoreWrapper = length3;
                char[] cArr5 = new char[length3];
                AFg1wSDK.AFInAppEventType = 0;
                while (AFg1wSDK.AFInAppEventType < AFg1wSDK.AFKeystoreWrapper) {
                    int i15 = AFg1wSDK.AFInAppEventType;
                    int i16 = AFg1wSDK.AFKeystoreWrapper - 1;
                    int i17 = AFg1wSDK.AFInAppEventType;
                    cArr5[i15] = (char) (cArr2[iArr[i16 - i17] - i] - i4);
                    AFg1wSDK.AFInAppEventType = i17 + 1;
                }
                objArr[0] = new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
