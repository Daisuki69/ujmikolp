package u;

import dOYHB6.tiZVw8.numX49;
import n.s;
import v.AbstractC2327b;
import z.AbstractC2540b;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements InterfaceC2291b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20230b;

    public g(String str, int i, boolean z4) {
        this.f20229a = i;
        this.f20230b = z4;
    }

    @Override // u.InterfaceC2291b
    public final p.c a(s sVar, AbstractC2327b abstractC2327b) {
        if (sVar.f18493l) {
            return new p.l(this);
        }
        AbstractC2540b.b(numX49.tnTj78("b2zP"));
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("b2zb"));
        int i = this.f20229a;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? numX49.tnTj78("b2z2") : numX49.tnTj78("b2zL") : numX49.tnTj78("b2zr") : numX49.tnTj78("b2zZ") : numX49.tnTj78("b2zk") : numX49.tnTj78("b2zB"));
        sb2.append('}');
        return sb2.toString();
    }
}
