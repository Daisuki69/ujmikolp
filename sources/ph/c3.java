package ph;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class c3 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19428b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(ch.l lVar, Object obj, int i, int i4) {
        super(lVar);
        this.f19428b = i4;
        this.f19429d = obj;
        this.c = i;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19428b) {
            case 0:
                b3 b3Var = new b3(rVar, this.c);
                rVar.onSubscribe(b3Var);
                ((ch.p) this.f19429d).subscribe(b3Var.c);
                this.f19404a.subscribe(b3Var);
                break;
            default:
                this.f19404a.subscribe(new h3(rVar, this.c, (Callable) this.f19429d));
                break;
        }
    }
}
