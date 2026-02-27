package j2;

import java.util.Map;

/* JADX INFO: renamed from: j2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1664c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17676b;
    public final Map c;

    public C1664c(String str, long j, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.g(additionalCustomKeys, "additionalCustomKeys");
        this.f17675a = str;
        this.f17676b = j;
        this.c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1664c)) {
            return false;
        }
        C1664c c1664c = (C1664c) obj;
        return kotlin.jvm.internal.j.b(this.f17675a, c1664c.f17675a) && this.f17676b == c1664c.f17676b && kotlin.jvm.internal.j.b(this.c, c1664c.c);
    }

    public final int hashCode() {
        int iHashCode = this.f17675a.hashCode() * 31;
        long j = this.f17676b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f17675a + ", timestamp=" + this.f17676b + ", additionalCustomKeys=" + this.c + ')';
    }
}
