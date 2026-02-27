package com.paymaya.domain.store;

/* JADX INFO: renamed from: com.paymaya.domain.store.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1263i extends AbstractC1259g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11448b;
    public final String c;

    public C1263i(Integer num, String str, String str2) {
        this.f11447a = num;
        this.f11448b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1259g) {
            AbstractC1259g abstractC1259g = (AbstractC1259g) obj;
            Integer num = this.f11447a;
            if (num != null ? num.equals(((C1263i) abstractC1259g).f11447a) : ((C1263i) abstractC1259g).f11447a == null) {
                String str = this.f11448b;
                if (str != null ? str.equals(((C1263i) abstractC1259g).f11448b) : ((C1263i) abstractC1259g).f11448b == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(((C1263i) abstractC1259g).c) : ((C1263i) abstractC1259g).c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f11447a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f11448b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return (str2 != null ? str2.hashCode() : 0) ^ iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgeRestricted{mAge=");
        sb2.append(this.f11447a);
        sb2.append(", mTitle=");
        sb2.append(this.f11448b);
        sb2.append(", mMessage=");
        return We.s.p(sb2, this.c, "}");
    }
}
