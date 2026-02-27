package V;

import dOYHB6.tiZVw8.numX49;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6022b;
    public final File c;

    public f(long j, long j6, File file) {
        this.f6021a = j;
        this.f6022b = j6;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6021a == fVar.f6021a && this.f6022b == fVar.f6022b && this.c.equals(fVar.c);
    }

    public final int hashCode() {
        long j = this.f6021a;
        long j6 = this.f6022b;
        return this.c.hashCode() + (((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + ((int) 5120)) * 31);
    }

    public final String toString() {
        return numX49.tnTj78("bPCP") + this.f6021a + numX49.tnTj78("bPCb") + this.f6022b + numX49.tnTj78("bPC2") + this.c + ')';
    }
}
