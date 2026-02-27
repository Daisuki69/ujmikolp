package O1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: O1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0524s extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0522p f4607b;

    public /* synthetic */ C0524s(AbstractC0522p abstractC0522p, int i) {
        this.f4606a = i;
        this.f4607b = abstractC0522p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4606a) {
            case 0:
                this.f4607b.e();
                break;
            default:
                this.f4607b.e();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4606a) {
            case 0:
                return this.f4607b.c(obj);
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) this.f4607b.b().get(key);
                return collection != null && collection.contains(value);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4606a) {
            case 0:
                return new C0504d(this.f4607b, 0);
            default:
                return new C0504d(this.f4607b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4606a) {
            case 1:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f4607b.remove(entry.getKey(), entry.getValue());
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4606a) {
        }
        return this.f4607b.f;
    }
}
