package K4;

import M8.A0;

/* JADX INFO: renamed from: K4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0271b extends A0 {
    public final String c;

    public C0271b(String str) {
        super(5);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0271b) && kotlin.jvm.internal.j.b(this.c, ((C0271b) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // M8.A0
    public final String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("LocalError(message="), this.c, ')');
    }
}
