package t1;

import androidx.media3.common.C;
import java.util.Arrays;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f20146d = new b(new long[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f20148b;
    public final C2266a[] c;

    public b(long[] jArr) {
        this.f20148b = jArr;
        int length = jArr.length;
        this.f20147a = length;
        C2266a[] c2266aArr = new C2266a[length];
        for (int i = 0; i < this.f20147a; i++) {
            c2266aArr[i] = new C2266a();
        }
        this.c = c2266aArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i = AbstractC2550e.f21351a;
        return this.f20147a == bVar.f20147a && Arrays.equals(this.f20148b, bVar.f20148b) && Arrays.equals(this.c, bVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.f20148b) + (((((this.f20147a * 961) + ((int) 0)) * 31) + ((int) C.TIME_UNSET)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C2266a[] c2266aArr = this.c;
            if (i >= c2266aArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f20148b[i]);
            sb2.append(", ads=[");
            for (int i4 = 0; i4 < c2266aArr[i].f20145b.length; i4++) {
                sb2.append("ad(state=");
                int i6 = c2266aArr[i].f20145b[i4];
                if (i6 == 0) {
                    sb2.append('_');
                } else if (i6 == 1) {
                    sb2.append('R');
                } else if (i6 == 2) {
                    sb2.append('S');
                } else if (i6 == 3) {
                    sb2.append('P');
                } else if (i6 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(c2266aArr[i].c[i4]);
                sb2.append(')');
                if (i4 < c2266aArr[i].f20145b.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < c2266aArr.length - 1) {
                sb2.append(", ");
            }
            i++;
        }
    }
}
