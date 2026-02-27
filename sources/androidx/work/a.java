package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f8223b;

    public /* synthetic */ a(AtomicBoolean atomicBoolean, int i) {
        this.f8222a = i;
        this.f8223b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8222a) {
            case 0:
                this.f8223b.set(true);
                break;
            default:
                this.f8223b.set(true);
                break;
        }
    }
}
