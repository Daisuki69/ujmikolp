package S1;

/* JADX INFO: renamed from: S1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0592f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f5613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f5614b;

    public RunnableC0592f(E e, y yVar) {
        this.f5613a = e;
        this.f5614b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5613a.f5621a != this) {
            return;
        }
        if (p.f.j(this.f5613a, this, p.g(this.f5614b))) {
            p.d(this.f5613a, false);
        }
    }
}
