package qf;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.could.huiyansdk.fragments.e f19783b;

    public /* synthetic */ f(com.tencent.could.huiyansdk.fragments.e eVar, int i) {
        this.f19782a = i;
        this.f19783b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19782a) {
            case 0:
                this.f19783b.b();
                break;
            default:
                this.f19783b.a();
                break;
        }
    }
}
