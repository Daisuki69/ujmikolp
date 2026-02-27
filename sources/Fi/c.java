package fi;

import A3.i;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements InterfaceC1488a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1488a f16764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16765b;

    public c(InterfaceC1488a interfaceC1488a, List list) {
        this.f16764a = interfaceC1488a;
        this.f16765b = list;
    }

    @Override // fi.InterfaceC1488a
    public final void a(i iVar) {
        this.f16764a.a(iVar);
    }

    public final void b() {
        Iterator it = this.f16765b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
    }

    public final void c(b bVar) {
        Iterator it = this.f16765b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(bVar);
        }
    }
}
