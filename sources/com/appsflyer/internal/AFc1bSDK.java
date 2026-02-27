package com.appsflyer.internal;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1bSDK {
    final String AFInAppEventParameterName;
    final String AFInAppEventType;

    public AFc1bSDK(String str, String str2) {
        j.g(str, "");
        j.g(str2, "");
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) obj;
        return j.b(this.AFInAppEventType, aFc1bSDK.AFInAppEventType) && j.b(this.AFInAppEventParameterName, aFc1bSDK.AFInAppEventParameterName);
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + (this.AFInAppEventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HostConfig(prefix=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", host=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }
}
