package k2;

import java.util.List;

/* JADX INFO: renamed from: k2.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1708S extends F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1709T f17886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17887b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f17888d;
    public final E0 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17889g;

    public C1708S(C1709T c1709t, List list, List list2, Boolean bool, E0 e02, List list3, int i) {
        this.f17886a = c1709t;
        this.f17887b = list;
        this.c = list2;
        this.f17888d = bool;
        this.e = e02;
        this.f = list3;
        this.f17889g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        C1708S c1708s = (C1708S) ((F0) obj);
        if (!this.f17886a.equals(c1708s.f17886a)) {
            return false;
        }
        List list = this.f17887b;
        if (list == null) {
            if (c1708s.f17887b != null) {
                return false;
            }
        } else if (!list.equals(c1708s.f17887b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null) {
            if (c1708s.c != null) {
                return false;
            }
        } else if (!list2.equals(c1708s.c)) {
            return false;
        }
        Boolean bool = this.f17888d;
        if (bool == null) {
            if (c1708s.f17888d != null) {
                return false;
            }
        } else if (!bool.equals(c1708s.f17888d)) {
            return false;
        }
        E0 e02 = this.e;
        if (e02 == null) {
            if (c1708s.e != null) {
                return false;
            }
        } else if (!e02.equals(c1708s.e)) {
            return false;
        }
        List list3 = this.f;
        if (list3 == null) {
            if (c1708s.f != null) {
                return false;
            }
        } else if (!list3.equals(c1708s.f)) {
            return false;
        }
        return this.f17889g == c1708s.f17889g;
    }

    public final int hashCode() {
        int iHashCode = (this.f17886a.hashCode() ^ 1000003) * 1000003;
        List list = this.f17887b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f17888d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        E0 e02 = this.e;
        int iHashCode5 = (iHashCode4 ^ (e02 == null ? 0 : e02.hashCode())) * 1000003;
        List list3 = this.f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f17889g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f17886a);
        sb2.append(", customAttributes=");
        sb2.append(this.f17887b);
        sb2.append(", internalKeys=");
        sb2.append(this.c);
        sb2.append(", background=");
        sb2.append(this.f17888d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f);
        sb2.append(", uiOrientation=");
        return We.s.o(sb2, "}", this.f17889g);
    }
}
