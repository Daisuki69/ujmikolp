package Z;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6852b;

    public q(String url, String contentDescription) {
        kotlin.jvm.internal.j.g(url, "url");
        kotlin.jvm.internal.j.g(contentDescription, "contentDescription");
        this.f6851a = url;
        this.f6852b = contentDescription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.j.b(this.f6851a, qVar.f6851a) && kotlin.jvm.internal.j.b(this.f6852b, qVar.f6852b);
    }

    public final int hashCode() {
        return this.f6852b.hashCode() + (this.f6851a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CTInboxImageData(url=");
        sb2.append(this.f6851a);
        sb2.append(", contentDescription=");
        return androidx.camera.core.impl.a.n(sb2, this.f6852b, ')');
    }
}
