package t1;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: t1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2266a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f20145b = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri[] f20144a = new Uri[0];
    public final long[] c = new long[0];

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2266a.class != obj.getClass()) {
            return false;
        }
        C2266a c2266a = (C2266a) obj;
        return Arrays.equals(this.f20144a, c2266a.f20144a) && Arrays.equals(this.f20145b, c2266a.f20145b) && Arrays.equals(this.c, c2266a.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.f20145b) + (((-31) + Arrays.hashCode(this.f20144a)) * 31)) * 31);
    }
}
