package Xh;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6655b;

    public /* synthetic */ l(Object obj, int i) {
        this.f6654a = i;
        this.f6655b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f6654a) {
            case 0:
                ((n) this.f6655b).a();
                break;
            default:
                ((Ag.l) this.f6655b).invoke();
                break;
        }
    }
}
