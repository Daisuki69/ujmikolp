package ph;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f19169b;
    public final /* synthetic */ F c;

    public /* synthetic */ E(F f, Collection collection, int i) {
        this.f19168a = i;
        this.c = f;
        this.f19169b = collection;
    }

    private final void a() {
        synchronized (this.c) {
            this.c.f19180n.remove(this.f19169b);
        }
        F f = this.c;
        f.E(this.f19169b, f.m);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19168a) {
            case 0:
                a();
                return;
            default:
                synchronized (this.c) {
                    this.c.f19180n.remove(this.f19169b);
                    break;
                }
                F f = this.c;
                f.E(this.f19169b, f.m);
                return;
        }
    }
}
