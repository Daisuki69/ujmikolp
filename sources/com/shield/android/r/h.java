package com.shield.android.r;

/* JADX INFO: loaded from: classes4.dex */
public final class h<A, B> {
    private final A rF;
    private final B rG;

    private h(A a8, B b8) {
        this.rF = a8;
        this.rG = b8;
    }

    public static <A, B> h<A, B> a(A a8, B b8) {
        return new h<>(a8, b8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        A a8 = this.rF;
        if (a8 == null) {
            if (hVar.rF != null) {
                return false;
            }
        } else if (!a8.equals(hVar.rF)) {
            return false;
        }
        B b8 = this.rG;
        if (b8 == null) {
            if (hVar.rG != null) {
                return false;
            }
        } else if (!b8.equals(hVar.rG)) {
            return false;
        }
        return true;
    }

    public final A et() {
        return this.rF;
    }

    public final B eu() {
        return this.rG;
    }

    public final int hashCode() {
        A a8 = this.rF;
        int iHashCode = ((a8 == null ? 0 : a8.hashCode()) + 31) * 31;
        B b8 = this.rG;
        return iHashCode + (b8 != null ? b8.hashCode() : 0);
    }
}
