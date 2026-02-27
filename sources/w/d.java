package W;

import Bj.B;
import Bj.C;
import D.S;
import dOYHB6.tiZVw8.numX49;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends kotlin.coroutines.a implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f6161a;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(e eVar) {
        B b8 = B.f582a;
        this.f6161a = eVar;
        super(b8);
    }

    @Override // Bj.C
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        if (this.f6161a.f6163b != null) {
            S.q(numX49.tnTj78("bPwb") + th2.getStackTrace());
        }
    }
}
