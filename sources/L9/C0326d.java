package L9;

import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditInterstitialActivity;

/* JADX INFO: renamed from: L9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0326d implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A7.j f2884b;

    public /* synthetic */ C0326d(A7.j jVar, int i) {
        this.f2883a = i;
        this.f2884b = jVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f2883a) {
            case 0:
                this.f2884b.p();
                break;
            default:
                ((MayaCreditInterstitialActivity) ((M9.b) this.f2884b.c.get())).W1();
                break;
        }
    }
}
