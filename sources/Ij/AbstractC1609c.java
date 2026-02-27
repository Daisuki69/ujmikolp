package ij;

import gj.InterfaceC1526a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: ij.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1609c extends AbstractC1607a {
    private final CoroutineContext _context;
    private transient InterfaceC1526a<Object> intercepted;

    public AbstractC1609c(InterfaceC1526a interfaceC1526a, CoroutineContext coroutineContext) {
        super(interfaceC1526a);
        this._context = coroutineContext;
    }

    @Override // gj.InterfaceC1526a
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        kotlin.jvm.internal.j.d(coroutineContext);
        return coroutineContext;
    }

    public final InterfaceC1526a<Object> intercepted() {
        InterfaceC1526a interfaceC1526aInterceptContinuation = this.intercepted;
        if (interfaceC1526aInterceptContinuation == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.f18169N);
            if (dVar == null || (interfaceC1526aInterceptContinuation = dVar.interceptContinuation(this)) == null) {
                interfaceC1526aInterceptContinuation = this;
            }
            this.intercepted = interfaceC1526aInterceptContinuation;
        }
        return interfaceC1526aInterceptContinuation;
    }

    @Override // ij.AbstractC1607a
    public void releaseIntercepted() {
        InterfaceC1526a<Object> interfaceC1526a = this.intercepted;
        if (interfaceC1526a != null && interfaceC1526a != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.d.f18169N);
            kotlin.jvm.internal.j.d(element);
            ((kotlin.coroutines.d) element).releaseInterceptedContinuation(interfaceC1526a);
        }
        this.intercepted = C1608b.f17151a;
    }

    public AbstractC1609c(InterfaceC1526a interfaceC1526a) {
        this(interfaceC1526a, interfaceC1526a != null ? interfaceC1526a.getContext() : null);
    }
}
