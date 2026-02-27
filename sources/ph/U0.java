package ph;

/* JADX INFO: loaded from: classes4.dex */
public final class U0 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V0 f19352b;

    public U0(Object obj, V0 v02) {
        this.f19351a = obj;
        this.f19352b = v02;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19352b.subscribe(rVar);
    }
}
