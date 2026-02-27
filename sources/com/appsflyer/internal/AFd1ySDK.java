package com.appsflyer.internal;

import android.util.Base64;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1132s;
import com.appsflyer.AFLogger;
import com.dynatrace.android.agent.Global;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import zj.C2576A;
import zj.C2581c;
import zj.o;

/* JADX INFO: loaded from: classes2.dex */
public class AFd1ySDK {
    private static AFc1bSDK afInfoLog;
    private final AFb1gSDK AFInAppEventType;
    public final InterfaceC1033d AFKeystoreWrapper;
    private final InterfaceC1033d AFLogger;
    private final AFb1bSDK values;
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public static String AFInAppEventParameterName = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String valueOf = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> afErrorLog = C1132s.g("googleplay", "playstore", "googleplaystore");

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFd1ySDK.this.values.values.AFKeystoreWrapper.getPackageName();
            j.f(packageName, "");
            return AFd1ySDK.values(packageName, AFd1ySDK.AFKeystoreWrapper(AFd1ySDK.this));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1ySDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function0<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strAFInAppEventParameterName = AFb1wSDK.AFInAppEventParameterName(AFd1ySDK.this.AFInAppEventType, AFd1ySDK.this.values.values());
            if (strAFInAppEventParameterName != null && !C2576A.H(strAFInAppEventParameterName)) {
                String string = C2576A.b0(strAFInAppEventParameterName).toString();
                List<String> listValues = AFa1ySDK.values();
                Locale locale = Locale.getDefault();
                j.f(locale, "");
                String lowerCase = string.toLowerCase(locale);
                j.f(lowerCase, "");
                if (listValues.contains(lowerCase)) {
                    AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1)));
                    strAFInAppEventParameterName = "";
                } else {
                    strAFInAppEventParameterName = Global.HYPHEN.concat(string);
                }
            }
            return C2576A.b0(strAFInAppEventParameterName != null ? strAFInAppEventParameterName : "").toString();
        }
    }

    public /* synthetic */ class AFa1xSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFd1zSDK.values().length];
            iArr[AFd1zSDK.DEFAULT.ordinal()] = 1;
            iArr[AFd1zSDK.API.ordinal()] = 2;
            iArr[AFd1zSDK.RC.ordinal()] = 3;
            AFKeystoreWrapper = iArr;
        }
    }

    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public static void AFKeystoreWrapper(AFc1bSDK aFc1bSDK) {
            AFd1ySDK.afInfoLog = aFc1bSDK;
        }

        public static List<String> values() {
            return AFd1ySDK.afErrorLog;
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFd1ySDK(AFb1bSDK aFb1bSDK, AFb1gSDK aFb1gSDK) {
        j.g(aFb1bSDK, "");
        j.g(aFb1gSDK, "");
        this.values = aFb1bSDK;
        this.AFInAppEventType = aFb1gSDK;
        this.AFLogger = C1034e.b(new AnonymousClass2());
        this.AFKeystoreWrapper = C1034e.b(new AnonymousClass1());
    }

    public static final void values(AFc1bSDK aFc1bSDK) {
        AFa1ySDK.AFKeystoreWrapper(aFc1bSDK);
    }

    public static final /* synthetic */ String AFKeystoreWrapper(AFd1ySDK aFd1ySDK) {
        return (String) aFd1ySDK.AFLogger.getValue();
    }

    public static boolean valueOf() {
        return afInfoLog == null;
    }

    public final String values() {
        int i = AFa1xSDK.AFKeystoreWrapper[(valueOf() ? AFd1zSDK.DEFAULT : AFd1zSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFc1bSDK aFc1bSDK = afInfoLog;
        String str = aFc1bSDK != null ? aFc1bSDK.AFInAppEventParameterName : null;
        return str == null ? "" : str;
    }

    public final String AFInAppEventParameterName() {
        AFd1zSDK aFd1zSDK;
        if (valueOf()) {
            aFd1zSDK = AFd1zSDK.DEFAULT;
        } else {
            aFd1zSDK = AFd1zSDK.API;
        }
        int i = AFa1xSDK.AFKeystoreWrapper[aFd1zSDK.ordinal()];
        if (i == 1) {
            return (String) this.AFKeystoreWrapper.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFc1bSDK aFc1bSDK = afInfoLog;
        String str = aFc1bSDK != null ? aFc1bSDK.AFInAppEventType : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String values(String str, String str2) throws NoSuchAlgorithmException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        String string = sb2.toString();
        j.g(string, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = string.getBytes(C2581c.f21468b);
        j.f(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        j.f(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        j.f(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        j.f(lowerCase, "");
        String strSubstring = new o("[^\\w]+").f("", lowerCase).substring(0, 6);
        j.f(strSubstring, "");
        return strSubstring.concat(Global.HYPHEN);
    }
}
