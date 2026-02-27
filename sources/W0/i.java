package W0;

import pg.t;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6190b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ i(t tVar, Exception exc, int i) {
        this.f6189a = i;
        this.f6190b = tVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6189a) {
            case 0:
                Exception exc = this.c;
                this.f6190b.error("", exc.getLocalizedMessage(), exc.toString());
                break;
            case 1:
                this.f6190b.error(this.c.toString(), "", "");
                break;
            default:
                this.f6190b.error("UNKNOWN_ERROR", "An Unknown Error Occurred", this.c.getLocalizedMessage());
                break;
        }
    }
}
