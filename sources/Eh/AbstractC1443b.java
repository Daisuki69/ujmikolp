package eh;

import vh.AbstractC2353d;

/* JADX INFO: renamed from: eh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1443b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16674a;

    static {
        try {
            e eVar = AbstractC1442a.f16673a;
            if (eVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f16674a = eVar;
        } catch (Throwable th2) {
            throw AbstractC2353d.d(th2);
        }
    }
}
