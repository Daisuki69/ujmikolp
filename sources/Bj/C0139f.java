package Bj;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: Bj.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0139f extends AbstractC0129a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f619d;
    public final AbstractC0138e0 e;

    public C0139f(CoroutineContext coroutineContext, Thread thread, AbstractC0138e0 abstractC0138e0) {
        super(coroutineContext, true, true);
        this.f619d = thread;
        this.e = abstractC0138e0;
    }

    @Override // Bj.u0
    public final void v(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f619d;
        if (kotlin.jvm.internal.j.b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
