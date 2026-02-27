package d0;

import S1.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16242b;
    public final String c;

    public d(String str, String str2) {
        this.f16242b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.b(this.f16242b, dVar.f16242b) && j.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.f16242b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EncryptionSuccess(data=");
        sb2.append(this.f16242b);
        sb2.append(", iv=");
        return androidx.camera.core.impl.a.n(sb2, this.c, ')');
    }
}
