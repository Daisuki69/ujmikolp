package J1;

import F1.p;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2383b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, int i) {
        this.f2383b = i;
        this.c = obj;
    }

    @Override // J1.f
    public final void a() {
        switch (this.f2383b) {
            case 0:
                h hVar = (h) this.c;
                if (hVar.m != null) {
                    hVar.f2386b.b("Unbind from service.", new Object[0]);
                    hVar.f2385a.unbindService(hVar.f2390l);
                    hVar.f2388g = false;
                    hVar.m = null;
                    hVar.f2390l = null;
                }
                hVar.b();
                break;
            default:
                h hVar2 = (h) ((p) this.c).f1533b;
                hVar2.f2386b.b("unlinkToDeath", new Object[0]);
                hVar2.m.asBinder().unlinkToDeath(hVar2.j, 0);
                hVar2.m = null;
                hVar2.f2388g = false;
                break;
        }
    }
}
