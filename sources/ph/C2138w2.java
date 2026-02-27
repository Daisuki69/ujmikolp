package ph;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ph.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2138w2 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19677b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.v f19678d;
    public final int e;
    public final boolean f;

    public C2138w2(int i, long j, ch.l lVar, ch.v vVar, TimeUnit timeUnit, boolean z4) {
        super(lVar);
        this.f19677b = j;
        this.c = timeUnit;
        this.f19678d = vVar;
        this.e = i;
        this.f = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19404a.subscribe(new C2134v2(rVar, this.f19677b, this.c, this.f19678d, this.e, this.f));
    }
}
