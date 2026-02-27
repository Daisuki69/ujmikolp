package ag;

import We.s;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ag.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0700j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7210b;

    public C0700j(String str, String str2) {
        kotlin.jvm.internal.j.h(str, numX49.tnTj78("bues"));
        this.f7209a = str;
        this.f7210b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0700j)) {
            return false;
        }
        C0700j c0700j = (C0700j) obj;
        return kotlin.jvm.internal.j.b(this.f7209a, c0700j.f7209a) && kotlin.jvm.internal.j.b(this.f7210b, c0700j.f7210b);
    }

    public final int hashCode() {
        String str = this.f7209a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7210b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bue5"));
        sb2.append(this.f7209a);
        sb2.append(numX49.tnTj78("bueJ"));
        return s.p(sb2, this.f7210b, numX49.tnTj78("bueI"));
    }
}
