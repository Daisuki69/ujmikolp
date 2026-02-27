package A3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements b2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k f43b = new k(0);
    public static final /* synthetic */ k c = new k(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    public /* synthetic */ k(int i) {
        this.f44a = i;
    }

    @Override // b2.c
    public final Object v(Xh.b bVar) {
        switch (this.f44a) {
            case 0:
                return new e((p3.g) bVar.get(p3.g.class));
            default:
                return new d((e) bVar.get(e.class), (p3.d) bVar.get(p3.d.class));
        }
    }
}
