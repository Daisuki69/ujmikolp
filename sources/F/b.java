package F;

import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1493b;

    public b(byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.j.g(bArr, numX49.tnTj78("PcN"));
        this.f1492a = bArr;
        this.f1493b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.e(obj, numX49.tnTj78("Pc6"));
        b bVar = (b) obj;
        return Arrays.equals(this.f1492a, bVar.f1492a) && Arrays.equals(this.f1493b, bVar.f1493b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1493b) + (Arrays.hashCode(this.f1492a) * 31);
    }

    public final String toString() {
        return numX49.tnTj78("Pca") + Arrays.toString(this.f1492a) + numX49.tnTj78("PcX") + Arrays.toString(this.f1493b) + ')';
    }
}
