package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public class AFc1kSDK {
    public final long values;

    public AFc1kSDK(long j) {
        this.values = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.values == ((AFc1kSDK) obj).values;
    }

    public int hashCode() {
        long j = this.values;
        return (int) (j ^ (j >>> 32));
    }
}
