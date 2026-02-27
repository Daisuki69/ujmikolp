package com.appsflyer.internal;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1aSDK {
    public final AFd1zSDK AFInAppEventParameterName;
    public final String AFKeystoreWrapper;
    public final String values;

    public AFc1aSDK(String str, String str2, AFd1zSDK aFd1zSDK) {
        j.g(str, "");
        j.g(aFd1zSDK, "");
        this.values = str;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventParameterName = aFd1zSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1aSDK)) {
            return false;
        }
        AFc1aSDK aFc1aSDK = (AFc1aSDK) obj;
        return j.b(this.values, aFc1aSDK.values) && j.b(this.AFKeystoreWrapper, aFc1aSDK.AFKeystoreWrapper) && this.AFInAppEventParameterName == aFc1aSDK.AFInAppEventParameterName;
    }

    public final int hashCode() {
        int iHashCode = this.values.hashCode() * 31;
        String str = this.AFKeystoreWrapper;
        return this.AFInAppEventParameterName.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFc1aSDK(values=");
        sb2.append(this.values);
        sb2.append(", AFInAppEventType=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }
}
