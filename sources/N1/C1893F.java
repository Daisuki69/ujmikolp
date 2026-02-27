package n1;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.paymaya.domain.model.MfaTencentErrorResult;
import d4.AbstractC1331a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: n1.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1893F {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f18555l = new Object();
    public static final MediaItem m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18556a = f18555l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaItem f18557b = m;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18558d;
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18559g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18560k;

    static {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        m = new MediaItem("com.google.android.exoplayer2.Timeline", new C1903i(), uri != null ? new C1905k(uri) : null, new C1904j(), new C1906l());
    }

    public final boolean a() {
        Xh.i.f(!this.f18559g);
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1893F.class.equals(obj.getClass())) {
            return false;
        }
        C1893F c1893f = (C1893F) obj;
        return AbstractC2550e.a(this.f18556a, c1893f.f18556a) && AbstractC2550e.a(this.f18557b, c1893f.f18557b) && this.c == c1893f.c && this.f18558d == c1893f.f18558d && this.e == c1893f.e && this.f == c1893f.f && this.h == c1893f.h && this.f18560k == c1893f.f18560k && this.i == c1893f.i && this.j == c1893f.j;
    }

    public final int hashCode() {
        int iHashCode = (this.f18557b.hashCode() + ((this.f18556a.hashCode() + MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT) * 31)) * 29791;
        long j = this.c;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.f18558d;
        int i4 = (i + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.e;
        int i6 = (((((i4 + ((int) (j7 ^ (j7 >>> 32)))) * 961) + (this.f ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31;
        int i10 = (int) 0;
        long j9 = this.f18560k;
        return AbstractC1331a.k((((((i6 + i10) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.i) * 31, this.j, 31, i10);
    }
}
