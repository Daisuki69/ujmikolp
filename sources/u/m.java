package u;

import dOYHB6.tiZVw8.numX49;
import n.s;
import p.q;
import t.C2264a;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20246b;
    public final C2264a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20247d;

    public m(String str, int i, C2264a c2264a, boolean z4) {
        this.f20245a = str;
        this.f20246b = i;
        this.c = c2264a;
        this.f20247d = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        return new q(sVar, abstractC2327b, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("b2zE"));
        sb2.append(this.f20245a);
        sb2.append(numX49.tnTj78("b2zF"));
        return We.s.m(sb2, this.f20246b, '}');
    }
}
