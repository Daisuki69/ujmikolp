package kotlin.coroutines;

import gj.C1527b;
import gj.InterfaceC1526a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends CoroutineContext.Element {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C1527b f18169N = C1527b.f16848a;

    InterfaceC1526a interceptContinuation(InterfaceC1526a interfaceC1526a);

    void releaseInterceptedContinuation(InterfaceC1526a interfaceC1526a);
}
