package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public interface AFb1cSDK {

    public static final class AFa1vSDK {
        public final float AFInAppEventParameterName;
        public final String AFInAppEventType;

        public AFa1vSDK(float f, String str) {
            this.AFInAppEventParameterName = f;
            this.AFInAppEventType = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) obj;
            return Float.valueOf(this.AFInAppEventParameterName).equals(Float.valueOf(aFa1vSDK.AFInAppEventParameterName)) && j.b(this.AFInAppEventType, aFa1vSDK.AFInAppEventType);
        }

        public final int hashCode() {
            int iFloatToIntBits = Float.floatToIntBits(this.AFInAppEventParameterName) * 31;
            String str = this.AFInAppEventType;
            return iFloatToIntBits + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BatteryData(level=");
            sb2.append(this.AFInAppEventParameterName);
            sb2.append(", charging=");
            sb2.append(this.AFInAppEventType);
            sb2.append(')');
            return sb2.toString();
        }
    }

    AFa1vSDK valueOf(Context context);
}
