package Rj;

import cj.AbstractC1117c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes4.dex */
public class f implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5567a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5568b;
    public final Object c;

    public f(Object[] array) {
        kotlin.jvm.internal.j.g(array, "array");
        this.c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5567a) {
            case 0:
                if (this.f5568b > 0) {
                }
                break;
            case 1:
                if (this.f5568b < ((AbstractC1117c) this.c).size()) {
                }
                break;
            default:
                if (this.f5568b < ((Object[]) this.c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5567a) {
            case 0:
                Tj.f fVar = (Tj.f) this.c;
                int i = this.f5568b;
                this.f5568b = i - 1;
                return fVar.e[fVar.c - i];
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i4 = this.f5568b;
                this.f5568b = i4 + 1;
                return ((AbstractC1117c) this.c).get(i4);
            default:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i6 = this.f5568b;
                    this.f5568b = i6 + 1;
                    return objArr[i6];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f5568b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5567a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(AbstractC1117c abstractC1117c) {
        this.c = abstractC1117c;
    }

    public f(Tj.f fVar) {
        this.c = fVar;
        this.f5568b = fVar.c;
    }
}
