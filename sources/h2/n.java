package h2;

import j2.InterfaceC1665d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16892b;
    public final /* synthetic */ long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16893d;

    public /* synthetic */ n(q qVar, long j, String str, int i) {
        this.f16891a = i;
        this.f16892b = qVar;
        this.c = j;
        this.f16893d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16891a) {
            case 0:
                l lVar = this.f16892b.h;
                s sVar = lVar.f16883n;
                if (sVar == null || !sVar.e.get()) {
                    ((InterfaceC1665d) lVar.i.f17680b).i(this.c, this.f16893d);
                }
                break;
            default:
                q qVar = this.f16892b;
                qVar.f16905p.f17093b.a(new n(qVar, this.c, this.f16893d, 0));
                break;
        }
    }
}
