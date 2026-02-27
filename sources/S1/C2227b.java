package s1;

import androidx.media3.common.C;
import com.google.android.exoplayer2.MediaItem;
import n1.AbstractC1894G;
import n1.C1892E;
import n1.C1893F;
import n1.C1905k;

/* JADX INFO: renamed from: s1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2227b extends AbstractC1894G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaItem f19993a;

    public C2227b(MediaItem mediaItem) {
        this.f19993a = mediaItem;
    }

    @Override // n1.AbstractC1894G
    public final int b(Object obj) {
        return obj == C2226a.f19990d ? 0 : -1;
    }

    @Override // n1.AbstractC1894G
    public final C1892E e(int i, C1892E c1892e, boolean z4) {
        Integer num = z4 ? 0 : null;
        Object obj = z4 ? C2226a.f19990d : null;
        c1892e.getClass();
        t1.b bVar = t1.b.f20146d;
        c1892e.f18552a = num;
        c1892e.f18553b = obj;
        c1892e.c = 0;
        c1892e.f18554d = C.TIME_UNSET;
        c1892e.e = bVar;
        return c1892e;
    }

    @Override // n1.AbstractC1894G
    public final int g() {
        return 1;
    }

    @Override // n1.AbstractC1894G
    public final Object j(int i) {
        return C2226a.f19990d;
    }

    @Override // n1.AbstractC1894G
    public final C1893F k(int i, C1893F c1893f, long j) {
        c1893f.f18556a = C1893F.f18555l;
        MediaItem mediaItem = this.f19993a;
        c1893f.f18557b = mediaItem != null ? mediaItem : C1893F.m;
        if (mediaItem != null) {
            C1905k c1905k = mediaItem.f9637b;
        }
        c1893f.c = C.TIME_UNSET;
        c1893f.f18558d = C.TIME_UNSET;
        c1893f.e = C.TIME_UNSET;
        c1893f.f = true;
        c1893f.f18559g = false;
        c1893f.f18560k = C.TIME_UNSET;
        c1893f.i = 0;
        c1893f.j = 0;
        c1893f.h = true;
        return c1893f;
    }

    @Override // n1.AbstractC1894G
    public final int m() {
        return 1;
    }
}
