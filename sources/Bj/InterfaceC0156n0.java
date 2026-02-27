package Bj;

import gj.InterfaceC1526a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Bj.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0156n0 extends CoroutineContext.Element {
    void b(CancellationException cancellationException);

    W f(boolean z4, boolean z5, Function1 function1);

    CancellationException g();

    W i(Function1 function1);

    boolean isActive();

    boolean isCancelled();

    InterfaceC0157o q(u0 u0Var);

    boolean start();

    Object z(InterfaceC1526a interfaceC1526a);
}
