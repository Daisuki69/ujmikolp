package O1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends AbstractC0500b {
    public final Iterator c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f4531d;
    public final /* synthetic */ C0 e;

    public B0(C0 c02) {
        this.e = c02;
        this.c = c02.c.iterator();
        this.f4531d = c02.f4537d.iterator();
    }

    @Override // O1.AbstractC0500b
    public final Object a() {
        Object next;
        Iterator it = this.c;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.f4531d;
            if (!it2.hasNext()) {
                this.f4570a = 3;
                return null;
            }
            next = it2.next();
        } while (this.e.c.contains(next));
        return next;
    }
}
