package F1;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1530b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, int i) {
        this.f1530b = i;
        this.c = obj;
    }

    @Override // F1.l
    public final void a() {
        switch (this.f1530b) {
            case 0:
                synchronized (((q) this.c).f) {
                    try {
                        if (((q) this.c).f1539k.get() > 0 && ((q) this.c).f1539k.decrementAndGet() > 0) {
                            ((q) this.c).f1536b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        q qVar = (q) this.c;
                        if (qVar.m != null) {
                            qVar.f1536b.c("Unbind from service.", new Object[0]);
                            q qVar2 = (q) this.c;
                            qVar2.f1535a.unbindService(qVar2.f1540l);
                            q qVar3 = (q) this.c;
                            qVar3.f1538g = false;
                            qVar3.m = null;
                            qVar3.f1540l = null;
                        }
                        ((q) this.c).d();
                        return;
                    } finally {
                    }
                }
            default:
                q qVar4 = (q) ((p) this.c).f1533b;
                qVar4.f1536b.c("unlinkToDeath", new Object[0]);
                qVar4.m.asBinder().unlinkToDeath(qVar4.j, 0);
                qVar4.m = null;
                qVar4.f1538g = false;
                return;
        }
    }
}
