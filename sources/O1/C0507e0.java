package O1;

import java.util.Iterator;

/* JADX INFO: renamed from: O1.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0507e0 extends AbstractC0500b {
    public final /* synthetic */ int c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f4578d;
    public final /* synthetic */ Object e;

    public C0507e0(Iterator it, N1.j jVar) {
        this.f4578d = it;
        this.e = jVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // O1.AbstractC0500b
    public final Object a() {
        Object next;
        Object next2;
        switch (this.c) {
            case 0:
                do {
                    Iterator it = this.f4578d;
                    if (!it.hasNext()) {
                        this.f4570a = 3;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((N1.j) this.e).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f4578d;
                    if (!it2.hasNext()) {
                        this.f4570a = 3;
                    } else {
                        next2 = it2.next();
                    }
                    break;
                } while (!((AbstractC0505d0) ((C0) this.e).f4537d).contains(next2));
                break;
        }
        return null;
    }

    public C0507e0(C0 c02) {
        this.e = c02;
        this.f4578d = ((AbstractC0505d0) c02.c).iterator();
    }
}
