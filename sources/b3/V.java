package b3;

import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8415b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8416d;
    public final C0890k e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8417g;

    public V(String sessionId, String firstSessionId, int i, long j, C0890k c0890k, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.g(sessionId, "sessionId");
        kotlin.jvm.internal.j.g(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.g(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f8414a = sessionId;
        this.f8415b = firstSessionId;
        this.c = i;
        this.f8416d = j;
        this.e = c0890k;
        this.f = str;
        this.f8417g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v7 = (V) obj;
        return kotlin.jvm.internal.j.b(this.f8414a, v7.f8414a) && kotlin.jvm.internal.j.b(this.f8415b, v7.f8415b) && this.c == v7.c && this.f8416d == v7.f8416d && kotlin.jvm.internal.j.b(this.e, v7.e) && kotlin.jvm.internal.j.b(this.f, v7.f) && kotlin.jvm.internal.j.b(this.f8417g, v7.f8417g);
    }

    public final int hashCode() {
        int iC = (AbstractC1414e.c(this.f8414a.hashCode() * 31, 31, this.f8415b) + this.c) * 31;
        long j = this.f8416d;
        return this.f8417g.hashCode() + AbstractC1414e.c((this.e.hashCode() + ((iC + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f8414a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f8415b);
        sb2.append(", sessionIndex=");
        sb2.append(this.c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f8416d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f);
        sb2.append(", firebaseAuthenticationToken=");
        return androidx.camera.core.impl.a.n(sb2, this.f8417g, ')');
    }
}
