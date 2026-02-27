package O1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f4549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4550b;
    public boolean c;

    public L(int i) {
        AbstractC0529x.d(i, "initialCapacity");
        this.f4549a = new Object[i];
        this.f4550b = 0;
    }

    public static int e(int i, int i4) {
        if (i4 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i4) {
            iHighestOneBit = Integer.highestOneBit(i4 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        f(this.f4550b + 1);
        Object[] objArr = this.f4549a;
        int i = this.f4550b;
        this.f4550b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        AbstractC0529x.b(length, objArr);
        f(this.f4550b + length);
        System.arraycopy(objArr, 0, this.f4549a, this.f4550b, length);
        this.f4550b += length;
    }

    public abstract L c(Object obj);

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size() + this.f4550b);
            if (collection instanceof M) {
                this.f4550b = ((M) collection).c(this.f4550b, this.f4549a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void f(int i) {
        Object[] objArr = this.f4549a;
        if (objArr.length < i) {
            this.f4549a = Arrays.copyOf(objArr, e(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.f4549a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
