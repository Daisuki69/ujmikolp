package u;

import dOYHB6.tiZVw8.numX49;
import n.s;
import t.C2265b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2265b f20253b;
    public final C2265b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2265b f20254d;
    public final boolean e;

    public o(String str, int i, C2265b c2265b, C2265b c2265b2, C2265b c2265b3, boolean z4) {
        this.f20252a = i;
        this.f20253b = c2265b;
        this.c = c2265b2;
        this.f20254d = c2265b3;
        this.e = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new p.s(abstractC2327b, this);
    }

    public final String toString() {
        return numX49.tnTj78("b2zS") + this.f20253b + numX49.tnTj78("b2zj") + this.c + numX49.tnTj78("b2zd") + this.f20254d + "}";
    }
}
