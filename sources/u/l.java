package u;

import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;
import java.util.List;
import n.s;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20244b;
    public final boolean c;

    public l(String str, List list, boolean z4) {
        this.f20243a = str;
        this.f20244b = list;
        this.c = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new p.d(sVar, abstractC2327b, this);
    }

    public final String toString() {
        return numX49.tnTj78("b2zu") + this.f20243a + numX49.tnTj78("b2zV") + Arrays.toString(this.f20244b.toArray()) + '}';
    }
}
