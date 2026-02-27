package cj;

import cj.AbstractC1117c;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: cj.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1118d extends Rj.f implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1117c f9386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1118d(AbstractC1117c abstractC1117c, int i) {
        super(abstractC1117c);
        this.f9386d = abstractC1117c;
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int size = abstractC1117c.size();
        aVar.getClass();
        AbstractC1117c.a.c(i, size);
        this.f5568b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5568b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5568b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5568b - 1;
        this.f5568b = i;
        return this.f9386d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5568b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
