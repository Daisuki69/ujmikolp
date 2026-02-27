package Nj;

import java.util.Arrays;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f4502b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4503a;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        j.f(charArray, "toCharArray(...)");
        f4502b = charArray;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a other = (a) obj;
        j.g(other, "other");
        if (other == this) {
            return 0;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f4503a;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode((byte[]) null);
        this.f4503a = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        throw null;
    }
}
