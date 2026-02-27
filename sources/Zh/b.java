package zh;

import Ah.o;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f21440a;

    static {
        try {
            e eVar = AbstractC2575a.f21439a;
            if (eVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f21440a = eVar;
        } catch (Throwable th2) {
            throw Qh.e.e(th2);
        }
    }

    public static o a() {
        o oVar = f21440a;
        if (oVar != null) {
            return oVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
