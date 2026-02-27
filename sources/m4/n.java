package m4;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends i {
    public boolean c;

    @Override // m4.i
    public final A7.f b(C3.g gVar) {
        if (this.c) {
            this.c = false;
            return new A7.f(new K3.e(new C3.d(gVar)), 6);
        }
        this.c = true;
        return new A7.f(new K3.e(gVar), 6);
    }
}
