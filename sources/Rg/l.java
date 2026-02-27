package Rg;

import java.util.Iterator;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5541a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f5542b;
    public final /* synthetic */ Object c;

    public l(m mVar) {
        this.c = mVar;
        this.f5542b = mVar.f5543a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5541a) {
        }
        return this.f5542b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5541a) {
            case 0:
                return ((m) this.c).f5544b.invoke(this.f5542b.next());
            default:
                return ((yj.r) this.c).f21329b.invoke(this.f5542b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5541a) {
            case 0:
                this.f5542b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(yj.r rVar) {
        this.c = rVar;
        this.f5542b = rVar.f21328a.iterator();
    }
}
