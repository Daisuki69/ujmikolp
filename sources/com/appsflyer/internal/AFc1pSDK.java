package com.appsflyer.internal;

import We.s;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.trusted.sharing.ShareTarget;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1pSDK {

    @VisibleForTesting
    private static String AFInAppEventType = null;
    private static char AFLogger = 0;
    private static int AFVersionDeclaration = 1;
    private static int afDebugLog;
    private static char[] afErrorLog;

    @VisibleForTesting
    private static String valueOf;
    public static String values;
    private final AFb1bSDK AFInAppEventParameterName;
    private final CreateOneLinkHttpTask AFKeystoreWrapper;
    private final AppsFlyerProperties afInfoLog;
    private final AFd1ySDK afRDLog;

    static {
        values();
        valueOf = "https://%smonitorsdk.%s/remote-debug?app_id=";
        values = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFInAppEventType = "https://%sonelink.%s/shortlink-sdk/v2";
        AFVersionDeclaration = (afDebugLog + 29) % 128;
    }

    public AFc1pSDK(CreateOneLinkHttpTask createOneLinkHttpTask, AFb1bSDK aFb1bSDK, AppsFlyerProperties appsFlyerProperties, AFd1ySDK aFd1ySDK) {
        this.AFKeystoreWrapper = createOneLinkHttpTask;
        this.AFInAppEventParameterName = aFb1bSDK;
        this.afInfoLog = appsFlyerProperties;
        this.afRDLog = aFd1ySDK;
    }

    private boolean AFInAppEventParameterName() {
        int i = AFVersionDeclaration + 121;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            if (this.afInfoLog.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
                return false;
            }
        } else if (this.afInfoLog.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        AFVersionDeclaration = (afDebugLog + 31) % 128;
        return true;
    }

    public static void values() {
        AFLogger = (char) 4;
        afErrorLog = new char[]{13816, 13820, 13800, 13769, 13812, 13806, 13819, 13811, 13821, 13823, 13807, 13751, 13817, 13818, 13787, 13822};
    }

    @NonNull
    public final AFc1iSDK<String> AFInAppEventType(Map<String, Object> map, String str) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s.l("https://", AppsFlyerLib.getInstance().getHostPrefix(), "viap.", AFb1wSDK.AFKeystoreWrapper().getHostName(), "/api/v1/android/validate_purchase?app_id="));
        sb2.append(this.AFInAppEventParameterName.values.AFKeystoreWrapper.getPackageName());
        try {
            AFc1iSDK<String> aFc1iSDKAFInAppEventType = AFInAppEventType(new AFc1vSDK(sb2.toString(), (byte[]) ((Class) AFa1vSDK.values(74 - TextUtils.getOffsetBefore("", 0), (char) (17156 - Process.getGidForName("")), View.MeasureSpec.getMode(0) + 36)).getMethod("values", Map.class, String.class).invoke(null, map, str), ShareTarget.METHOD_POST, Collections.EMPTY_MAP, true), new AFc1gSDK());
            int i = afDebugLog + 123;
            AFVersionDeclaration = i % 128;
            if (i % 2 == 0) {
                int i4 = 66 / 0;
            }
            return aFc1iSDKAFInAppEventType;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @NonNull
    public final AFc1iSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s.l("https://", AppsFlyerLib.getInstance().getHostPrefix(), "ars.", AFb1wSDK.AFKeystoreWrapper().getHostName(), "/api/v2/android/validate_subscription?app_id="));
        sb2.append(this.AFInAppEventParameterName.values.AFKeystoreWrapper.getPackageName());
        try {
            AFc1iSDK<String> aFc1iSDKAFInAppEventType = AFInAppEventType(new AFc1vSDK(sb2.toString(), (byte[]) ((Class) AFa1vSDK.values(73 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 17157), TextUtils.indexOf("", "", 0) + 36)).getMethod("values", Map.class, String.class).invoke(null, map, str), ShareTarget.METHOD_POST, Collections.EMPTY_MAP, true), new AFc1gSDK());
            afDebugLog = (AFVersionDeclaration + 49) % 128;
            return aFc1iSDKAFInAppEventType;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final AFc1iSDK<Map<String, Object>> valueOf(String str, String str2) {
        AFc1iSDK<Map<String, Object>> aFc1iSDKAFInAppEventType = AFInAppEventType(AFc1jSDK.values(this.AFInAppEventParameterName.values.AFKeystoreWrapper.getPackageName(), AFb1zSDK.AFInAppEventParameterName(new WeakReference(this.AFInAppEventParameterName.values.AFKeystoreWrapper)), str, str2), new AFc1mSDK());
        int i = afDebugLog + 31;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            return aFc1iSDKAFInAppEventType;
        }
        throw null;
    }

    @NonNull
    public final AFc1iSDK<String> values(Map<String, Object> map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
        sb2.append(this.AFInAppEventParameterName.values.AFKeystoreWrapper.getPackageName());
        AFc1iSDK<String> aFc1iSDKAFInAppEventType = AFInAppEventType(new AFc1vSDK(sb2.toString(), new JSONObject(map).toString().getBytes(), ShareTarget.METHOD_POST, Collections.EMPTY_MAP, false), new AFc1gSDK());
        afDebugLog = (AFVersionDeclaration + 39) % 128;
        return aFc1iSDKAFInAppEventType;
    }

    public final AFc1iSDK<String> valueOf(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        HashMap mapQ = androidx.media3.datasource.cache.c.q("ttl", "-1", "uuid", string);
        mapQ.put("data", map);
        mapQ.put("meta", AFInAppEventType());
        if (str2 != null) {
            AFVersionDeclaration = (afDebugLog + 75) % 128;
            mapQ.put("brand_domain", str2);
            afDebugLog = (AFVersionDeclaration + 123) % 128;
        }
        String string2 = AFa1mSDK.valueOf(mapQ).toString();
        HashMap map2 = new HashMap();
        Object[] objArr = new Object[1];
        AFKeystoreWrapper(12 - TextUtils.indexOf("", ""), "\r\u0002\u000f\u0007\u0004\u000b\u0005\u0007\u0006\t\u0001\n", (byte) (View.resolveSizeAndState(0, 0, 0) + 43), objArr);
        map2.put(((String) objArr[0]).intern(), values(str3, string, ShareTarget.METHOD_POST, string2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
        sb2.append("/");
        sb2.append(str);
        return valueOf(new AFc1vSDK(sb2.toString(), string2.getBytes(Charset.forName("UTF-8")), ShareTarget.METHOD_POST, map2, false), new AFc1gSDK(), true);
    }

    public final AFc1iSDK<String> values(AFa1tSDK aFa1tSDK, String str) throws Throwable {
        try {
            AFc1iSDK<String> aFc1iSDKAFInAppEventType = AFInAppEventType(new AFc1vSDK(aFa1tSDK.afInfoLog, (byte[]) ((Class) AFa1vSDK.values(73 - TextUtils.lastIndexOf("", '0'), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17157), 36 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("AFInAppEventParameterName", AFa1tSDK.class, String.class).invoke(null, aFa1tSDK, str), ShareTarget.METHOD_POST, Collections.EMPTY_MAP, aFa1tSDK.valueOf()), new AFc1gSDK());
            int i = afDebugLog + 77;
            AFVersionDeclaration = i % 128;
            if (i % 2 == 0) {
                int i4 = 93 / 0;
            }
            return aFc1iSDKAFInAppEventType;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static String values(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strValues = AFb1ySDK.values((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String strAFInAppEventType = AFb1ySDK.AFInAppEventType(strValues, sb2.toString());
        int i = AFVersionDeclaration + 55;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            return strAFInAppEventType;
        }
        throw null;
    }

    private <T> AFc1iSDK<T> AFInAppEventType(AFc1vSDK aFc1vSDK, AFc1cSDK<T> aFc1cSDK) {
        int i = AFVersionDeclaration + 97;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            return valueOf(aFc1vSDK, aFc1cSDK, AFInAppEventParameterName());
        }
        valueOf(aFc1vSDK, aFc1cSDK, AFInAppEventParameterName());
        throw null;
    }

    public final AFc1iSDK<String> AFKeystoreWrapper(AFe1aSDK aFe1aSDK) {
        AFc1iSDK<String> aFc1iSDKAFInAppEventType = AFInAppEventType(new AFc1vSDK(aFe1aSDK.afInfoLog, aFe1aSDK.AFInAppEventType(), ShareTarget.METHOD_POST, Collections.EMPTY_MAP, true), new AFc1gSDK());
        int i = AFVersionDeclaration + 111;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            return aFc1iSDKAFInAppEventType;
        }
        throw null;
    }

    @VisibleForTesting
    private Map<String, Object> AFInAppEventType() {
        HashMap mapP = androidx.media3.datasource.cache.c.p("build_number", "6.10.1");
        mapP.put("counter", Integer.valueOf(this.AFInAppEventParameterName.AFInAppEventType.AFKeystoreWrapper("appsFlyerCount", 0)));
        mapP.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        AFKeystoreWrapper(5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0001\u0003\u0007\u0005㙥", (byte) (103 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr);
        mapP.put(((String) objArr[0]).intern(), Build.BRAND);
        mapP.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFInAppEventParameterName.values.AFKeystoreWrapper;
        mapP.put("app_version_name", AFa1cSDK.AFInAppEventType(context, context.getPackageName()));
        mapP.put("app_id", this.AFInAppEventParameterName.values.AFKeystoreWrapper.getPackageName());
        mapP.put("platformextension", new AFb1vSDK().values());
        int i = afDebugLog + 57;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            int i4 = 87 / 0;
        }
        return mapP;
    }

    private static void AFKeystoreWrapper(int i, String str, byte b8, Object[] objArr) {
        int i4;
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFg1zSDK.AFLogger) {
            try {
                char[] cArr2 = afErrorLog;
                char c = AFLogger;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i4 = i - 1;
                    cArr3[i4] = (char) (cArr[i4] - b8);
                } else {
                    i4 = i;
                }
                if (i4 > 1) {
                    AFg1zSDK.valueOf = 0;
                    while (true) {
                        int i6 = AFg1zSDK.valueOf;
                        if (i6 >= i4) {
                            break;
                        }
                        AFg1zSDK.values = cArr[i6];
                        AFg1zSDK.AFInAppEventType = cArr[AFg1zSDK.valueOf + 1];
                        if (AFg1zSDK.values == AFg1zSDK.AFInAppEventType) {
                            cArr3[AFg1zSDK.valueOf] = (char) (AFg1zSDK.values - b8);
                            cArr3[AFg1zSDK.valueOf + 1] = (char) (AFg1zSDK.AFInAppEventType - b8);
                        } else {
                            AFg1zSDK.AFInAppEventParameterName = AFg1zSDK.values / c;
                            AFg1zSDK.afRDLog = AFg1zSDK.values % c;
                            AFg1zSDK.AFKeystoreWrapper = AFg1zSDK.AFInAppEventType / c;
                            AFg1zSDK.afErrorLog = AFg1zSDK.AFInAppEventType % c;
                            if (AFg1zSDK.afRDLog == AFg1zSDK.afErrorLog) {
                                AFg1zSDK.AFInAppEventParameterName = ((AFg1zSDK.AFInAppEventParameterName + c) - 1) % c;
                                AFg1zSDK.AFKeystoreWrapper = ((AFg1zSDK.AFKeystoreWrapper + c) - 1) % c;
                                int i10 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afRDLog;
                                int i11 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afErrorLog;
                                int i12 = AFg1zSDK.valueOf;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            } else if (AFg1zSDK.AFInAppEventParameterName == AFg1zSDK.AFKeystoreWrapper) {
                                AFg1zSDK.afRDLog = ((AFg1zSDK.afRDLog + c) - 1) % c;
                                AFg1zSDK.afErrorLog = ((AFg1zSDK.afErrorLog + c) - 1) % c;
                                int i13 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afRDLog;
                                int i14 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afErrorLog;
                                int i15 = AFg1zSDK.valueOf;
                                cArr3[i15] = cArr2[i13];
                                cArr3[i15 + 1] = cArr2[i14];
                            } else {
                                int i16 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afErrorLog;
                                int i17 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afRDLog;
                                int i18 = AFg1zSDK.valueOf;
                                cArr3[i18] = cArr2[i16];
                                cArr3[i18 + 1] = cArr2[i17];
                            }
                        }
                        AFg1zSDK.valueOf += 2;
                    }
                }
                for (int i19 = 0; i19 < i; i19++) {
                    cArr3[i19] = (char) (cArr3[i19] ^ 13722);
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }

    public final AFc1iSDK<Map<String, String>> valueOf(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String string2 = sb2.toString();
        Map<String, Object> mapAFInAppEventType = AFInAppEventType();
        String strValueOf = String.valueOf(mapAFInAppEventType.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(mapAFInAppEventType.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(mapAFInAppEventType.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(mapAFInAppEventType.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(mapAFInAppEventType.get("sdk")));
        Object[] objArr = new Object[1];
        AFKeystoreWrapper(((Process.getThreadPriority(0) + 20) >> 6) + 12, "\r\u0002\u000f\u0007\u0004\u000b\u0005\u0007\u0006\t\u0001\n", (byte) (ExpandableListView.getPackedPositionType(0L) + 43), objArr);
        map.put(((String) objArr[0]).intern(), values(str3, string, ShareTarget.METHOD_GET, string, str, str2, strValueOf));
        AFc1iSDK<Map<String, String>> aFc1iSDKAFInAppEventType = AFInAppEventType(new AFc1vSDK(string2, null, ShareTarget.METHOD_GET, map, false), new AFc1hSDK());
        int i = afDebugLog + 17;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            return aFc1iSDKAFInAppEventType;
        }
        throw null;
    }

    public final AFc1iSDK<String> valueOf(@NonNull String str) {
        AFc1iSDK<String> aFc1iSDKAFInAppEventType = AFInAppEventType(new AFc1vSDK(str, null, ShareTarget.METHOD_GET, Collections.EMPTY_MAP, false).AFKeystoreWrapper(10000).getLevel(), new AFc1gSDK());
        AFVersionDeclaration = (afDebugLog + 47) % 128;
        return aFc1iSDKAFInAppEventType;
    }

    @NonNull
    public final AFc1iSDK<AFb1iSDK> AFInAppEventType(boolean z4, boolean z5, @NonNull String str, int i) {
        String str2;
        int i4 = AFVersionDeclaration + 83;
        afDebugLog = i4 % 128;
        String str3 = "";
        if (i4 % 2 == 0) {
            AFd1ySDK aFd1ySDK = this.afRDLog;
            j.g(str, "");
            String str4 = z4 ? AFd1ySDK.valueOf : AFd1ySDK.AFInAppEventParameterName;
            if (z5) {
                int i6 = (afDebugLog + 13) % 128;
                AFVersionDeclaration = i6;
                afDebugLog = (i6 + 17) % 128;
                str2 = "stg";
            } else {
                str2 = "";
            }
            if (AFd1ySDK.valueOf()) {
                int i10 = AFVersionDeclaration + 9;
                afDebugLog = i10 % 128;
                if (i10 % 2 != 0) {
                    str3 = (String) aFd1ySDK.AFKeystoreWrapper.getValue();
                    int i11 = 5 / 0;
                } else {
                    str3 = (String) aFd1ySDK.AFKeystoreWrapper.getValue();
                }
            }
            AFc1vSDK aFc1vSDK = new AFc1vSDK(String.format(str4, Arrays.copyOf(new Object[]{str3, str2, aFd1ySDK.values(), str}, 4)), ShareTarget.METHOD_GET);
            aFc1vSDK.AFKeystoreWrapper(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            return AFInAppEventType(aFc1vSDK, new AFc1fSDK());
        }
        j.g(str, "");
        throw null;
    }

    private <T> AFc1iSDK<T> valueOf(AFc1vSDK aFc1vSDK, AFc1cSDK<T> aFc1cSDK, boolean z4) {
        aFc1vSDK.AFKeystoreWrapper(z4);
        CreateOneLinkHttpTask createOneLinkHttpTask = this.AFKeystoreWrapper;
        AFc1iSDK<T> aFc1iSDK = new AFc1iSDK<>(aFc1vSDK, createOneLinkHttpTask.values, createOneLinkHttpTask.valueOf, aFc1cSDK);
        afDebugLog = (AFVersionDeclaration + 69) % 128;
        return aFc1iSDK;
    }
}
