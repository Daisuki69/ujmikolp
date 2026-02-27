package R2;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5446b;
    public final /* synthetic */ Timer c;

    public /* synthetic */ f(g gVar, Timer timer, int i) {
        this.f5445a = i;
        this.f5446b = gVar;
        this.c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5445a) {
            case 0:
                g gVar = this.f5446b;
                U2.d dVarC = gVar.c(this.c);
                if (dVarC != null) {
                    gVar.f5448b.add(dVarC);
                }
                break;
            default:
                g gVar2 = this.f5446b;
                U2.d dVarC2 = gVar2.c(this.c);
                if (dVarC2 != null) {
                    gVar2.f5448b.add(dVarC2);
                }
                break;
        }
    }
}
