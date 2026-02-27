package Bj;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends AbstractRunnableC0132b0 {
    public final C0151l c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0136d0 f607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC0136d0 abstractC0136d0, long j, C0151l c0151l) {
        super(j);
        this.f607d = abstractC0136d0;
        this.c = c0151l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.C(this.f607d, Unit.f18162a);
    }

    @Override // Bj.AbstractRunnableC0132b0
    public final String toString() {
        return super.toString() + this.c;
    }
}
