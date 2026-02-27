package b3;

import defpackage.AbstractC1414e;

/* JADX INFO: renamed from: b3.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0872L {
    public static final C0871K Companion = new C0871K();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8394b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8395d;

    public /* synthetic */ C0872L(long j, String str, int i, int i4, String str2) {
        if (15 != (i & 15)) {
            Tj.m.d(i, 15, C0870J.f8392a.d());
            throw null;
        }
        this.f8393a = str;
        this.f8394b = str2;
        this.c = i4;
        this.f8395d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0872L)) {
            return false;
        }
        C0872L c0872l = (C0872L) obj;
        return kotlin.jvm.internal.j.b(this.f8393a, c0872l.f8393a) && kotlin.jvm.internal.j.b(this.f8394b, c0872l.f8394b) && this.c == c0872l.c && this.f8395d == c0872l.f8395d;
    }

    public final int hashCode() {
        int iC = (AbstractC1414e.c(this.f8393a.hashCode() * 31, 31, this.f8394b) + this.c) * 31;
        long j = this.f8395d;
        return iC + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f8393a + ", firstSessionId=" + this.f8394b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.f8395d + ')';
    }

    public C0872L(long j, String str, String str2, int i) {
        this.f8393a = str;
        this.f8394b = str2;
        this.c = i;
        this.f8395d = j;
    }
}
