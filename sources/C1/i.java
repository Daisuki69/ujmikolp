package c1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9231b;
    public final Z0.e c;

    public i(String str, byte[] bArr, Z0.e eVar) {
        this.f9230a = str;
        this.f9231b = bArr;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f9230a.equals(((i) pVar).f9230a)) {
                if (Arrays.equals(this.f9231b, (pVar instanceof i ? (i) pVar : (i) pVar).f9231b) && this.c.equals(((i) pVar).c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f9230a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9231b)) * 1000003) ^ this.c.hashCode();
    }
}
