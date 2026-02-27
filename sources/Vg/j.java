package Vg;

import gj.InterfaceC1526a;
import ij.InterfaceC1610d;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements InterfaceC1610d, InterfaceC1526a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f6115a = new j();

    @Override // ij.InterfaceC1610d
    public final InterfaceC1610d getCallerFrame() {
        return null;
    }

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f18170a;
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
