package O1;

import java.util.Objects;

/* JADX INFO: renamed from: O1.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0503c0 extends L {
    @Override // O1.L
    public final L c(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final AbstractC0505d0 g() {
        int i = this.f4550b;
        if (i == 0) {
            int i4 = AbstractC0505d0.c;
            return z0.j;
        }
        if (i != 1) {
            AbstractC0505d0 abstractC0505d0J = AbstractC0505d0.j(i, this.f4549a);
            this.f4550b = abstractC0505d0J.size();
            this.c = true;
            return abstractC0505d0J;
        }
        Object obj = this.f4549a[0];
        Objects.requireNonNull(obj);
        int i6 = AbstractC0505d0.c;
        return new G0(obj);
    }
}
