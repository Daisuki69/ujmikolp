package n1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: n1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1905k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f18573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18574b;
    public final List c;

    public C1905k(Uri uri) {
        List list = Collections.EMPTY_LIST;
        this.f18573a = uri;
        this.f18574b = list;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1905k)) {
            return false;
        }
        if (!this.f18573a.equals(((C1905k) obj).f18573a)) {
            return false;
        }
        int i = AbstractC2550e.f21351a;
        List list = Collections.EMPTY_LIST;
        return list.equals(list) && list.equals(list);
    }

    public final int hashCode() {
        int iHashCode = this.f18573a.hashCode() * 923521;
        List list = Collections.EMPTY_LIST;
        return (list.hashCode() + ((list.hashCode() + iHashCode) * 961)) * 31;
    }
}
