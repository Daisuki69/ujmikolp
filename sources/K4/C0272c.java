package K4;

import M8.A0;

/* JADX INFO: renamed from: K4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0272c extends A0 {
    public final C0274e c;

    public C0272c(C0274e c0274e) {
        super(5);
        this.c = c0274e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0272c) && kotlin.jvm.internal.j.b(this.c, ((C0272c) obj).c);
    }

    public final int hashCode() {
        C0274e c0274e = this.c;
        if (c0274e == null) {
            return 0;
        }
        return c0274e.hashCode();
    }

    @Override // M8.A0
    public final String toString() {
        return "NetworkError(error=" + this.c + ')';
    }
}
