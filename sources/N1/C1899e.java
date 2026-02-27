package n1;

/* JADX INFO: renamed from: n1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1899e implements InterfaceC1907m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1894G f18564b;

    public C1899e(Object obj, AbstractC1894G abstractC1894G) {
        this.f18563a = obj;
        this.f18564b = abstractC1894G;
    }

    @Override // n1.InterfaceC1907m
    public final AbstractC1894G getTimeline() {
        return this.f18564b;
    }

    @Override // n1.InterfaceC1907m
    public final Object getUid() {
        return this.f18563a;
    }
}
