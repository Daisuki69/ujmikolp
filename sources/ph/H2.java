package ph;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class H2 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19209b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f19210d;
    public final ch.v e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19211g;

    public H2(ch.l lVar, long j, long j6, TimeUnit timeUnit, ch.v vVar, int i, boolean z4) {
        super(lVar);
        this.f19209b = j;
        this.c = j6;
        this.f19210d = timeUnit;
        this.e = vVar;
        this.f = i;
        this.f19211g = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19404a.subscribe(new G2(rVar, this.f19209b, this.c, this.f19210d, this.e, this.f, this.f19211g));
    }
}
