package com.dynatrace.agent.metrics;

import androidx.camera.core.impl.a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AppVersion {
    private final long versionCode;
    private final String versionName;

    public AppVersion(long j, String str) {
        this.versionCode = j;
        this.versionName = str;
    }

    public static /* synthetic */ AppVersion copy$default(AppVersion appVersion, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = appVersion.versionCode;
        }
        if ((i & 2) != 0) {
            str = appVersion.versionName;
        }
        return appVersion.copy(j, str);
    }

    public final long component1() {
        return this.versionCode;
    }

    public final String component2() {
        return this.versionName;
    }

    public final AppVersion copy(long j, String str) {
        return new AppVersion(j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersion)) {
            return false;
        }
        AppVersion appVersion = (AppVersion) obj;
        return this.versionCode == appVersion.versionCode && j.b(this.versionName, appVersion.versionName);
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        long j = this.versionCode;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.versionName;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppVersion(versionCode=");
        sb2.append(this.versionCode);
        sb2.append(", versionName=");
        return a.n(sb2, this.versionName, ')');
    }
}
