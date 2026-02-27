package O1;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC0523q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4527b;
    public final /* synthetic */ C c;

    public A(C c, int i) {
        this.c = c;
        Object obj = C.j;
        this.f4526a = c.j()[i];
        this.f4527b = i;
    }

    public final void a() {
        int i = this.f4527b;
        Object obj = this.f4526a;
        C c = this.c;
        if (i != -1 && i < c.size()) {
            if (of.p.p(obj, c.j()[this.f4527b])) {
                return;
            }
        }
        Object obj2 = C.j;
        this.f4527b = c.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4526a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C c = this.c;
        Map mapC = c.c();
        if (mapC != null) {
            return mapC.get(this.f4526a);
        }
        a();
        int i = this.f4527b;
        if (i == -1) {
            return null;
        }
        return c.k()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C c = this.c;
        Map mapC = c.c();
        Object obj2 = this.f4526a;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.f4527b;
        if (i == -1) {
            c.put(obj2, obj);
            return null;
        }
        Object obj3 = c.k()[i];
        c.k()[this.f4527b] = obj;
        return obj3;
    }
}
