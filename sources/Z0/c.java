package Z0;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6873a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f6873a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f6873a.equals(((c) obj).f6873a);
    }

    public final int hashCode() {
        return this.f6873a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s.p(new StringBuilder("Encoding{name=\""), this.f6873a, "\"}");
    }
}
