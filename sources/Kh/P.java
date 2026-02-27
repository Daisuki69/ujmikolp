package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2708b;
    public final long c;

    public /* synthetic */ P(int i, long j, Object obj) {
        this.f2707a = i;
        this.c = j;
        this.f2708b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Kh.O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ph.R2] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2707a) {
            case 0:
                this.f2708b.b(this.c);
                break;
            default:
                this.f2708b.b(this.c);
                break;
        }
    }
}
