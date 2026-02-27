package com.appsflyer.internal;

import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.dynatrace.android.agent.Global;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;
import zj.C2581c;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1wSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    public final String AFInAppEventParameterName;
    public int AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String valueOf;

    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        private static String AFInAppEventType(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            j.f(strSubstring, "");
            String string = C2576A.b0(strSubstring).toString();
            j.g(string, "");
            Charset charset = C2581c.f21468b;
            byte[] bytes = string.getBytes(charset);
            j.f(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            j.f(bArrDecode, "");
            return new String(bArrDecode, charset);
        }

        public static AFc1wSDK AFKeystoreWrapper(String str) {
            j.g(str, "");
            List<String> listT = C2576A.T(str, new String[]{Global.NEWLINE}, 6);
            if (listT.size() == 4) {
                String strAFInAppEventType = null;
                String strAFInAppEventType2 = null;
                String strAFInAppEventType3 = null;
                Integer numValueOf = null;
                for (String str2 : listT) {
                    if (z.w(str2, 2, "label=", false)) {
                        strAFInAppEventType = AFInAppEventType(str2, "label=");
                    } else if (z.w(str2, 2, "hashName=", false)) {
                        strAFInAppEventType2 = AFInAppEventType(str2, "hashName=");
                    } else if (!z.w(str2, 2, "stackTrace=", false)) {
                        if (!z.w(str2, 2, "c=", false)) {
                            break;
                        }
                        String strSubstring = str2.substring(2);
                        j.f(strSubstring, "");
                        numValueOf = Integer.valueOf(Integer.parseInt(C2576A.b0(strSubstring).toString()));
                    } else {
                        strAFInAppEventType3 = AFInAppEventType(str2, "stackTrace=");
                    }
                }
                if (!values(numValueOf, strAFInAppEventType, strAFInAppEventType2, strAFInAppEventType3)) {
                    j.d(strAFInAppEventType);
                    j.d(strAFInAppEventType2);
                    j.d(strAFInAppEventType3);
                    j.d(numValueOf);
                    return new AFc1wSDK(strAFInAppEventType, strAFInAppEventType2, strAFInAppEventType3, numValueOf.intValue());
                }
            }
            return null;
        }

        private static boolean values(Integer num, String... strArr) {
            boolean z4 = num == null;
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                z4 = z4 || str == null || str.length() == 0;
            }
            return z4;
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFc1wSDK(String str, String str2, String str3, int i) {
        j.g(str, "");
        j.g(str2, "");
        j.g(str3, "");
        this.valueOf = str;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventParameterName = str3;
        this.AFInAppEventType = i;
    }

    public final JSONObject AFInAppEventParameterName() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.valueOf);
        jSONObject.put("hash_name", this.AFKeystoreWrapper);
        jSONObject.put(CmcdConfiguration.KEY_STREAM_TYPE, this.AFInAppEventParameterName);
        jSONObject.put("c", String.valueOf(this.AFInAppEventType));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1wSDK)) {
            return false;
        }
        AFc1wSDK aFc1wSDK = (AFc1wSDK) obj;
        return j.b(this.valueOf, aFc1wSDK.valueOf) && j.b(this.AFKeystoreWrapper, aFc1wSDK.AFKeystoreWrapper) && j.b(this.AFInAppEventParameterName, aFc1wSDK.AFInAppEventParameterName) && this.AFInAppEventType == aFc1wSDK.AFInAppEventType;
    }

    public final int hashCode() {
        return ((this.AFInAppEventParameterName.hashCode() + ((this.AFKeystoreWrapper.hashCode() + (this.valueOf.hashCode() * 31)) * 31)) * 31) + this.AFInAppEventType;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFc1wSDK(AFInAppEventType=");
        sb2.append(this.valueOf);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", AFKeystoreWrapper=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", values=");
        sb2.append(this.AFInAppEventType);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ AFc1wSDK(String str, String str2, String str3, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i4 & 8) != 0 ? 1 : i);
    }
}
