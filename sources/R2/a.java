package R2;

import U2.k;
import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f5434b;
    public final /* synthetic */ Timer c;

    public /* synthetic */ a(b bVar, Timer timer, int i) {
        this.f5433a = i;
        this.f5434b = bVar;
        this.c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5433a) {
            case 0:
                b bVar = this.f5434b;
                k kVarB = bVar.b(this.c);
                if (kVarB != null) {
                    bVar.f5436a.add(kVarB);
                }
                break;
            default:
                b bVar2 = this.f5434b;
                k kVarB2 = bVar2.b(this.c);
                if (kVarB2 != null) {
                    bVar2.f5436a.add(kVarB2);
                }
                break;
        }
    }
}
