package b1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8330b;

    public q(byte[] bArr, byte[] bArr2) {
        this.f8329a = bArr;
        this.f8330b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D) {
            D d10 = (D) obj;
            boolean z4 = d10 instanceof q;
            if (Arrays.equals(this.f8329a, z4 ? ((q) d10).f8329a : ((q) d10).f8329a)) {
                if (Arrays.equals(this.f8330b, z4 ? ((q) d10).f8330b : ((q) d10).f8330b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f8329a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8330b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f8329a) + ", encryptedBlob=" + Arrays.toString(this.f8330b) + "}";
    }
}
