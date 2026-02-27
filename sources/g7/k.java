package G7;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements pg.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1884b;

    public /* synthetic */ k(l lVar, int i) {
        this.f1883a = i;
        this.f1884b = lVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public final void onMethodCall(pg.r call, pg.t result) {
        switch (this.f1883a) {
            case 0:
                kotlin.jvm.internal.j.g(call, "call");
                kotlin.jvm.internal.j.g(result, "result");
                boolean zB = kotlin.jvm.internal.j.b(call.f19112a, "reloadHome");
                l lVar = this.f1884b;
                if (!zB) {
                    lVar.a(call, result);
                    return;
                }
                pg.u uVar = lVar.h;
                if (uVar != null) {
                    uVar.a("reloadHome", null, null);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("flutterActivityEngineMethodChannel");
                    throw null;
                }
            default:
                l lVar2 = this.f1884b;
                lVar2.getClass();
                String str = call.f19112a;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1249356004:
                            if (str.equals("getMin")) {
                                lVar2.m.invoke(result);
                                return;
                            }
                            break;
                        case -476469337:
                            if (str.equals("finishCurrentModuleForCard")) {
                                result.success(Boolean.TRUE);
                                return;
                            }
                            break;
                        case -67833007:
                            if (str.equals("getPinningFingerprint")) {
                                result.success("");
                                return;
                            }
                            break;
                        case 1671672458:
                            if (str.equals("dismiss")) {
                                ((Ah.p) lVar2.f1891n.invoke()).f(new Gh.d(1, new G6.u(lVar2, 1), Eh.d.f1366d));
                                lVar2.c();
                                result.success(Boolean.TRUE);
                                return;
                            }
                            break;
                    }
                }
                lVar2.a(call, result);
                return;
        }
    }
}
