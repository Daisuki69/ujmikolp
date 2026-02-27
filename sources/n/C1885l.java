package n;

/* JADX INFO: renamed from: n.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1885l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18477b;
    public final /* synthetic */ s c;

    public C1885l(s sVar, int i, int i4) {
        this.c = sVar;
        this.f18476a = i;
        this.f18477b = i4;
    }

    @Override // n.r
    public final void run() {
        s sVar = this.c;
        C1880g c1880g = sVar.f18489b;
        int i = this.f18476a;
        int i4 = this.f18477b;
        if (c1880g == null) {
            sVar.h.add(new C1885l(sVar, i, i4));
        } else {
            sVar.c.i(i, i4 + 0.99f);
        }
    }
}
