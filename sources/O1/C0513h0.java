package O1;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: O1.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0513h0 extends I0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4589b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4590a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4590a != f4589b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f4590a;
        Object obj2 = f4589b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f4590a = obj2;
        return obj;
    }
}
