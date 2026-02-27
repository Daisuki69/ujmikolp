package io.ktor.utils.io;

import Bj.E;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f17517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f17518b;

    public D(w wVar, CoroutineContext coroutineContext) {
        kotlin.jvm.internal.j.g(coroutineContext, "coroutineContext");
        this.f17517a = wVar;
        this.f17518b = coroutineContext;
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.f17518b;
    }
}
