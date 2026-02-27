package ij;

import gj.InterfaceC1526a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: ij.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1614h extends AbstractC1607a {
    public AbstractC1614h(InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        if (interfaceC1526a != null && interfaceC1526a.getContext() != kotlin.coroutines.g.f18170a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // gj.InterfaceC1526a
    public CoroutineContext getContext() {
        return kotlin.coroutines.g.f18170a;
    }
}
