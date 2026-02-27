package O1;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Y extends I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0 f4563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4564b = null;
    public I0 c = C0509f0.f4582d;

    public Y(U u3) {
        this.f4563a = u3.e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.f4563a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f4563a.next();
            this.f4564b = entry.getKey();
            this.c = ((M) entry.getValue()).iterator();
        }
        Object obj = this.f4564b;
        Objects.requireNonNull(obj);
        return new N(obj, this.c.next());
    }
}
