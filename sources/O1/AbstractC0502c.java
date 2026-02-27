package O1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: renamed from: O1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0502c extends AbstractC0522p implements InterfaceC0515i0 {
    @Override // O1.n0
    public final Map b() {
        Map map = this.f9741d;
        if (map != null) {
            return map;
        }
        Map mapF = f();
        this.f9741d = mapF;
        return mapF;
    }

    @Override // O1.AbstractC0522p, O1.n0
    public final Collection get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // O1.AbstractC0522p
    public final Collection i(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0517k(this, obj, list, null) : new C0521o(this, obj, list, null);
    }

    @Override // O1.AbstractC0522p, O1.n0
    public final List get(Object obj) {
        return (List) super.get(obj);
    }
}
