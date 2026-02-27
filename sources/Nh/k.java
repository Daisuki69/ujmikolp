package Nh;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Ah.o {
    public static final n c = new n("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f4471b = c;

    @Override // Ah.o
    public final Ah.n a() {
        return new l(this.f4471b);
    }
}
