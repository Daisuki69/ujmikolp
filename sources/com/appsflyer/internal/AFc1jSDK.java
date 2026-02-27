package com.appsflyer.internal;

import androidx.annotation.VisibleForTesting;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import cj.M;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1jSDK extends AFc1vSDK {
    public static final AFa1xSDK AFa1xSDK = new AFa1xSDK(null);

    public static final class AFa1xSDK {
        private AFa1xSDK() {
        }

        @VisibleForTesting
        public static String AFInAppEventParameterName(String str, String str2, String str3, String str4, String str5) {
            j.g(str, "");
            j.g(str2, "");
            j.g(str4, "");
            j.g(str5, "");
            return AFb1ySDK.AFInAppEventType(AFb1ySDK.values(str5, str3, str.concat(str2)), str4);
        }

        public static String values(String str, String str2, String str3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(AFc1pSDK.values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
            sb2.append(str);
            sb2.append(str3);
            sb2.append("?device_id=");
            sb2.append(str2);
            return sb2.toString();
        }

        public /* synthetic */ AFa1xSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AFc1jSDK(String str, Map map, byte[] bArr, String str2, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? ShareTarget.METHOD_GET : str2, (i & 16) != 0 ? false : z4);
    }

    public static final AFc1jSDK values(String str, String str2, String str3, String str4) {
        j.g(str, "");
        j.g(str3, "");
        j.g(str4, "");
        String strValues = AFa1xSDK.values(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFc1jSDK aFc1jSDK = new AFc1jSDK(strValues, M.h(new Pair(RtspHeaders.CONNECTION, "close"), new Pair("af_request_epoch_ms", strValueOf), new Pair("af_sig", AFa1xSDK.AFInAppEventParameterName(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFc1jSDK.AFKeystoreWrapper(10000);
        return aFc1jSDK;
    }

    private AFc1jSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z4) {
        super(str, bArr, str2, map, z4);
    }
}
