package ok;

import oi.C1983a;
import p0.C2004c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rk.a f18909a;

    static {
        rk.a aVar;
        qk.d dVarB = d.b();
        if (dVarB == null) {
            qk.e.a("Failed to find provider.");
            qk.e.a("Defaulting to no-operation MDCAdapter implementation.");
            f18909a = new C2004c();
        } else {
            switch (dVarB.f19810a) {
                case 0:
                    aVar = (C2004c) dVarB.c;
                    break;
                default:
                    aVar = (C1983a) dVarB.c;
                    break;
            }
            f18909a = aVar;
        }
    }
}
