package Hh;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ah.a f2174b;
    public final Object c;

    public /* synthetic */ a(Ah.a aVar, Object obj, int i) {
        this.f2173a = i;
        this.f2174b = aVar;
        this.c = obj;
    }

    @Override // Ah.a
    public final void e(Ah.b bVar) {
        switch (this.f2173a) {
            case 0:
                this.f2174b.d(new Gh.d(2, bVar, (Ah.a) this.c));
                break;
            default:
                this.f2174b.d(new d(bVar, (Ch.a) this.c, 0));
                break;
        }
    }
}
