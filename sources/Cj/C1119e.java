package cj;

import cj.AbstractC1117c;
import java.util.RandomAccess;

/* JADX INFO: renamed from: cj.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1119e extends AbstractC1117c implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1117c f9387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9388b;
    public final int c;

    public C1119e(AbstractC1117c abstractC1117c, int i, int i4) {
        this.f9387a = abstractC1117c;
        this.f9388b = i;
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int size = abstractC1117c.size();
        aVar.getClass();
        AbstractC1117c.a.d(i, i4, size);
        this.c = i4 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.c;
        aVar.getClass();
        AbstractC1117c.a.b(i, i4);
        return this.f9387a.get(this.f9388b + i);
    }

    @Override // cj.AbstractC1115a
    public final int getSize() {
        return this.c;
    }
}
