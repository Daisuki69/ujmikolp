package O1;

import java.util.NoSuchElementException;
import s.AbstractC2217b;

/* JADX INFO: renamed from: O1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0500b extends I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4570a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4571b;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4570a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iC = AbstractC2217b.c(i);
        if (iC == 0) {
            return true;
        }
        if (iC == 2) {
            return false;
        }
        this.f4570a = 4;
        this.f4571b = a();
        if (this.f4570a == 3) {
            return false;
        }
        this.f4570a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4570a = 2;
        Object obj = this.f4571b;
        this.f4571b = null;
        return obj;
    }
}
