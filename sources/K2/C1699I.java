package k2;

import java.util.Arrays;

/* JADX INFO: renamed from: k2.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1699I extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f17854b;

    public C1699I(String str, byte[] bArr) {
        this.f17853a = str;
        this.f17854b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.f17853a.equals(((C1699I) t0Var).f17853a)) {
                if (Arrays.equals(this.f17854b, (t0Var instanceof C1699I ? (C1699I) t0Var : (C1699I) t0Var).f17854b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17853a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f17854b);
    }

    public final String toString() {
        return "File{filename=" + this.f17853a + ", contents=" + Arrays.toString(this.f17854b) + "}";
    }
}
