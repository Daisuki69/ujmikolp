package s1;

import n1.AbstractC1894G;
import n1.C1892E;
import n1.C1893F;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: s1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2226a extends AbstractC1894G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f19990d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1894G f19991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19992b;
    public final Object c;

    public C2226a(AbstractC1894G abstractC1894G, Object obj, Object obj2) {
        this.f19991a = abstractC1894G;
        this.f19992b = obj;
        this.c = obj2;
    }

    @Override // n1.AbstractC1894G
    public final int a(boolean z4) {
        return this.f19991a.a(z4);
    }

    @Override // n1.AbstractC1894G
    public final int b(Object obj) {
        Object obj2;
        if (f19990d.equals(obj) && (obj2 = this.c) != null) {
            obj = obj2;
        }
        return this.f19991a.b(obj);
    }

    @Override // n1.AbstractC1894G
    public final int c(boolean z4) {
        return this.f19991a.c(z4);
    }

    @Override // n1.AbstractC1894G
    public final int d(int i, int i4, boolean z4) {
        return this.f19991a.d(i, i4, z4);
    }

    @Override // n1.AbstractC1894G
    public final C1892E e(int i, C1892E c1892e, boolean z4) {
        this.f19991a.e(i, c1892e, z4);
        if (AbstractC2550e.a(c1892e.f18553b, this.c) && z4) {
            c1892e.f18553b = f19990d;
        }
        return c1892e;
    }

    @Override // n1.AbstractC1894G
    public final int g() {
        return this.f19991a.g();
    }

    @Override // n1.AbstractC1894G
    public final int i(int i, int i4, boolean z4) {
        return this.f19991a.i(i, i4, z4);
    }

    @Override // n1.AbstractC1894G
    public final Object j(int i) {
        Object objJ = this.f19991a.j(i);
        return AbstractC2550e.a(objJ, this.c) ? f19990d : objJ;
    }

    @Override // n1.AbstractC1894G
    public final C1893F k(int i, C1893F c1893f, long j) {
        this.f19991a.k(i, c1893f, j);
        if (AbstractC2550e.a(c1893f.f18556a, this.f19992b)) {
            c1893f.f18556a = C1893F.f18555l;
        }
        return c1893f;
    }

    @Override // n1.AbstractC1894G
    public final int m() {
        return this.f19991a.m();
    }
}
