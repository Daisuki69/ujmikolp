package ij;

import gj.InterfaceC1526a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: ij.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1608b implements InterfaceC1526a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1608b f17151a = new C1608b();

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
