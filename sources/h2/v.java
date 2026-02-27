package h2;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16920b;

    public v(String str, String str2) {
        this.f16919a = str;
        this.f16920b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.j.b(this.f16919a, vVar.f16919a) && kotlin.jvm.internal.j.b(this.f16920b, vVar.f16920b);
    }

    public final int hashCode() {
        String str = this.f16919a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16920b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f16919a);
        sb2.append(", authToken=");
        return androidx.camera.core.impl.a.n(sb2, this.f16920b, ')');
    }
}
