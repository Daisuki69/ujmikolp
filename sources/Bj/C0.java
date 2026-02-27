package Bj;

import gj.InterfaceC1526a;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 extends Gj.q {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0(CoroutineContext coroutineContext, InterfaceC1526a interfaceC1526a, int i) {
        super(interfaceC1526a, coroutineContext);
        this.e = i;
    }

    @Override // Bj.u0
    public final boolean F(Throwable th2) {
        switch (this.e) {
            case 0:
                return false;
            default:
                if (th2 instanceof ChildCancelledException) {
                    return true;
                }
                return B(th2);
        }
    }
}
