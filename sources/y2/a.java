package Y2;

import a3.C0627d;
import e2.C1420b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1420b f6735b;
    public final /* synthetic */ C0627d c;

    public /* synthetic */ a(C1420b c1420b, C0627d c0627d, int i) {
        this.f6734a = i;
        this.f6735b = c1420b;
        this.c = c0627d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6734a) {
            case 0:
                this.f6735b.a(this.c);
                break;
            default:
                this.f6735b.a(this.c);
                break;
        }
    }
}
