package com.dynatrace.agent.storage.db;

import androidx.camera.core.impl.a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class EndPointInfo {
    private final String applicationId;
    private final String url;

    public EndPointInfo(String applicationId, String url) {
        j.g(applicationId, "applicationId");
        j.g(url, "url");
        this.applicationId = applicationId;
        this.url = url;
    }

    public static /* synthetic */ EndPointInfo copy$default(EndPointInfo endPointInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endPointInfo.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = endPointInfo.url;
        }
        return endPointInfo.copy(str, str2);
    }

    public final String component1() {
        return this.applicationId;
    }

    public final String component2() {
        return this.url;
    }

    public final EndPointInfo copy(String applicationId, String url) {
        j.g(applicationId, "applicationId");
        j.g(url, "url");
        return new EndPointInfo(applicationId, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndPointInfo)) {
            return false;
        }
        EndPointInfo endPointInfo = (EndPointInfo) obj;
        return j.b(this.applicationId, endPointInfo.applicationId) && j.b(this.url, endPointInfo.url);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.applicationId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EndPointInfo(applicationId=");
        sb2.append(this.applicationId);
        sb2.append(", url=");
        return a.n(sb2, this.url, ')');
    }
}
