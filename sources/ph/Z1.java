package ph;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class Z1 implements S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19398b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.v f19399d;

    public Z1(int i, long j, TimeUnit timeUnit, ch.v vVar) {
        this.f19397a = i;
        this.f19398b = j;
        this.c = timeUnit;
        this.f19399d = vVar;
    }

    @Override // ph.S1
    public final W1 call() {
        return new C2051a2(this.f19397a, this.f19398b, this.c, this.f19399d);
    }
}
