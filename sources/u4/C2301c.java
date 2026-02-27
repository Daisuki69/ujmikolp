package u4;

import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: u4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2301c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f20264b;

    public C2301c(long j, Long l6) {
        this.f20263a = j;
        this.f20264b = l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2301c)) {
            return false;
        }
        C2301c c2301c = (C2301c) obj;
        return this.f20263a == c2301c.f20263a && j.b(this.f20264b, c2301c.f20264b);
    }

    public final int hashCode() {
        long j = this.f20263a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l6 = this.f20264b;
        return i + (l6 != null ? l6.hashCode() : 0);
    }

    public final String toString() {
        return "KronosTime(posixTimeMs=" + this.f20263a + ", timeSinceLastNtpSyncMs=" + this.f20264b + ")";
    }
}
