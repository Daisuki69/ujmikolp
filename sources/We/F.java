package We;

import android.net.Uri;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f6354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6355b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6356d;
    public final int e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6357g;
    public final int h;

    static {
        TimeUnit.SECONDS.toNanos(5L);
    }

    public F(Uri uri, int i, ArrayList arrayList, int i4, int i6, boolean z4, int i10, int i11) {
        this.f6354a = uri;
        this.f6355b = i;
        if (arrayList == null) {
            this.c = null;
        } else {
            this.c = Collections.unmodifiableList(arrayList);
        }
        this.f6356d = i4;
        this.e = i6;
        this.f = z4;
        this.f6357g = i10;
        this.h = i11;
    }

    public final boolean a() {
        return (this.f6356d == 0 && this.e == 0) ? false : true;
    }

    public final boolean b() {
        return a();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bkRP"));
        int i = this.f6355b;
        if (i > 0) {
            sb2.append(i);
        } else {
            sb2.append(this.f6354a);
        }
        List<M> list = this.c;
        if (list != null && !list.isEmpty()) {
            for (M m : list) {
                sb2.append(' ');
                sb2.append(m.a());
            }
        }
        int i4 = this.f6356d;
        if (i4 > 0) {
            sb2.append(numX49.tnTj78("bkRb"));
            sb2.append(i4);
            sb2.append(',');
            sb2.append(this.e);
            sb2.append(')');
        }
        if (this.f) {
            sb2.append(numX49.tnTj78("bkR2"));
        }
        sb2.append('}');
        return sb2.toString();
    }
}
