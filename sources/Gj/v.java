package Gj;

import Bj.C0165x;
import Bj.E0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f2034a = new t("NO_THREAD_ELEMENTS", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0165x f2035b = new C0165x(14);
    public static final C0165x c = new C0165x(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0165x f2036d = new C0165x(16);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f2034a) {
            return;
        }
        if (!(obj instanceof z)) {
            Object objFold = coroutineContext.fold(null, c);
            kotlin.jvm.internal.j.e(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((E0) objFold).k(obj);
            return;
        }
        z zVar = (z) obj;
        E0[] e0Arr = zVar.c;
        int length = e0Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            E0 e02 = e0Arr[length];
            kotlin.jvm.internal.j.d(e02);
            e02.k(zVar.f2043b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f2035b);
        kotlin.jvm.internal.j.d(objFold);
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f2034a : obj instanceof Integer ? coroutineContext.fold(new z(((Number) obj).intValue(), coroutineContext), f2036d) : ((E0) obj).y(coroutineContext);
    }
}
