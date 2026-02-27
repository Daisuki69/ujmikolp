package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1qSDK {

    @Nullable
    public AFd1uSDK AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    public String AFKeystoreWrapper;
    public String valueOf;
    public String values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1qSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends k implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 AFInAppEventType = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            j.g(stackTraceElement, "");
            return "at ".concat(String.valueOf(stackTraceElement));
        }
    }

    public AFc1qSDK() {
    }

    public static Map<String, String> AFKeystoreWrapper(Context context) {
        HashMap map = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = context.getResources().getConfiguration().screenLayout & 15;
            map.put("x_px", String.valueOf(displayMetrics.widthPixels));
            map.put("y_px", String.valueOf(displayMetrics.heightPixels));
            map.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            map.put("size", String.valueOf(i));
            map.put("xdp", String.valueOf(displayMetrics.xdpi));
            map.put("ydp", String.valueOf(displayMetrics.ydpi));
            return map;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Couldn't aggregate screen stats: ", th2);
            return map;
        }
    }

    public static final List<StackTraceElement> valueOf(Throwable th2) {
        j.g(th2, "");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        j.f(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            j.f(className, "");
            if (!z.w(className, 2, "com.appsflyer", false)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }

    public final byte[] AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1qSDK.class == obj.getClass()) {
            AFc1qSDK aFc1qSDK = (AFc1qSDK) obj;
            String str = this.values;
            if (str == null ? aFc1qSDK.values != null : !str.equals(aFc1qSDK.values)) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventType, aFc1qSDK.AFInAppEventType)) {
                return false;
            }
            String str2 = this.valueOf;
            if (str2 == null ? aFc1qSDK.valueOf != null : !str2.equals(aFc1qSDK.valueOf)) {
                return false;
            }
            String str3 = this.AFKeystoreWrapper;
            if (str3 == null ? aFc1qSDK.AFKeystoreWrapper != null : !str3.equals(aFc1qSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (this.AFInAppEventParameterName == aFc1qSDK.AFInAppEventParameterName) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.values;
        int iHashCode = (Arrays.hashCode(this.AFInAppEventType) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.valueOf;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFKeystoreWrapper;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFd1uSDK aFd1uSDK = this.AFInAppEventParameterName;
        return iHashCode3 + (aFd1uSDK != null ? aFd1uSDK.hashCode() : 0);
    }

    public AFc1qSDK(String str, byte[] bArr, String str2, AFd1uSDK aFd1uSDK) {
        this.valueOf = str;
        this.AFInAppEventType = bArr;
        this.values = str2;
        this.AFInAppEventParameterName = aFd1uSDK;
    }

    public AFc1qSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i4 = 0;
        while (scanner.hasNextLine()) {
            String strNextLine = scanner.nextLine();
            if (strNextLine.startsWith("url=")) {
                this.valueOf = strNextLine.substring(4).trim();
            } else if (strNextLine.startsWith("version=")) {
                this.values = strNextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.values);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i4 = Integer.parseInt(matcher.group(2));
                }
            } else if (strNextLine.startsWith("data=")) {
                String strTrim = strNextLine.substring(5).trim();
                this.AFInAppEventType = (i > 4 || i4 >= 11) ? Base64.decode(strTrim, 2) : strTrim.getBytes();
            } else if (strNextLine.startsWith("type=")) {
                String strTrim2 = strNextLine.substring(5).trim();
                try {
                    this.AFInAppEventParameterName = AFd1uSDK.valueOf(strTrim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(strTrim2)), e);
                }
            }
        }
        scanner.close();
    }
}
