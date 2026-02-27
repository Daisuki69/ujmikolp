package O1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f4559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4560b = 0;
    public V c;

    public W(int i) {
        this.f4559a = new Object[i * 2];
    }

    public final y0 a() {
        V v7 = this.c;
        if (v7 != null) {
            throw v7.a();
        }
        y0 y0VarE = y0.e(this.f4560b, this.f4559a, this);
        V v8 = this.c;
        if (v8 == null) {
            return y0VarE;
        }
        throw v8.a();
    }

    public final void b(Object obj, Object obj2) {
        int i = (this.f4560b + 1) * 2;
        Object[] objArr = this.f4559a;
        if (i > objArr.length) {
            this.f4559a = Arrays.copyOf(objArr, L.e(objArr.length, i));
        }
        AbstractC0529x.c(obj, obj2);
        Object[] objArr2 = this.f4559a;
        int i4 = this.f4560b;
        int i6 = i4 * 2;
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        this.f4560b = i4 + 1;
    }

    public final void c(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.f4560b) * 2;
            Object[] objArr = this.f4559a;
            if (size > objArr.length) {
                this.f4559a = Arrays.copyOf(objArr, L.e(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b(entry.getKey(), entry.getValue());
        }
    }
}
