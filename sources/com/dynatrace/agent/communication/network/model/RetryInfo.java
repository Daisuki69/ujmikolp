package com.dynatrace.agent.communication.network.model;

import androidx.camera.core.impl.a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryInfo {
    private final int count;
    private final String reason;

    public RetryInfo(int i, String str) {
        this.count = i;
        this.reason = str;
    }

    public static /* synthetic */ RetryInfo copy$default(RetryInfo retryInfo, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = retryInfo.count;
        }
        if ((i4 & 2) != 0) {
            str = retryInfo.reason;
        }
        return retryInfo.copy(i, str);
    }

    public final int component1() {
        return this.count;
    }

    public final String component2() {
        return this.reason;
    }

    public final RetryInfo copy(int i, String str) {
        return new RetryInfo(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetryInfo)) {
            return false;
        }
        RetryInfo retryInfo = (RetryInfo) obj;
        return this.count == retryInfo.count && j.b(this.reason, retryInfo.reason);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int i = this.count * 31;
        String str = this.reason;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RetryInfo(count=");
        sb2.append(this.count);
        sb2.append(", reason=");
        return a.n(sb2, this.reason, ')');
    }
}
