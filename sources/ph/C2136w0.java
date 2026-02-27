package ph;

/* JADX INFO: renamed from: ph.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2136w0 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19674b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19675d;

    public C2136w0(ch.l lVar, long j, Object obj, boolean z4) {
        super(lVar);
        this.f19674b = j;
        this.c = obj;
        this.f19675d = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19404a.subscribe(new C2132v0(rVar, this.f19674b, this.c, this.f19675d));
    }
}
