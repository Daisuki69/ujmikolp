package h2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16890b;
    public final /* synthetic */ b1.t c;

    public /* synthetic */ m(q qVar, b1.t tVar, int i) {
        this.f16889a = i;
        this.f16890b = qVar;
        this.c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16889a) {
            case 0:
                this.f16890b.a(this.c);
                break;
            default:
                this.f16890b.a(this.c);
                break;
        }
    }
}
