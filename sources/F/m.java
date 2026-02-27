package F;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1514b;

    public m(String str, boolean z4) {
        this.f1513a = str;
        this.f1514b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.j.b(this.f1513a, mVar.f1513a) && this.f1514b == mVar.f1514b;
    }

    public final int hashCode() {
        String str = this.f1513a;
        return ((str == null ? 0 : str.hashCode()) * 31) + (this.f1514b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("Pcx"));
        sb2.append(this.f1513a);
        sb2.append(numX49.tnTj78("Pcs"));
        return androidx.camera.core.impl.a.q(sb2, this.f1514b, ')');
    }
}
