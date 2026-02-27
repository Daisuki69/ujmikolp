package Cg;

import Bg.e0;
import Bj.E;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f779b;

    public h(e0 httpSendSender, CoroutineContext coroutineContext) {
        kotlin.jvm.internal.j.g(httpSendSender, "httpSendSender");
        kotlin.jvm.internal.j.g(coroutineContext, "coroutineContext");
        this.f778a = httpSendSender;
        this.f779b = coroutineContext;
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.f779b;
    }
}
