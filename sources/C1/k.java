package c1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z0.c f9235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9236b;

    public k(Z0.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f9235a = cVar;
        this.f9236b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f9235a.equals(kVar.f9235a)) {
            return Arrays.equals(this.f9236b, kVar.f9236b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9235a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9236b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f9235a + ", bytes=[...]}";
    }
}
