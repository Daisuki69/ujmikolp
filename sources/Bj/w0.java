package Bj;

import gj.InterfaceC1526a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1526a f646d;

    public w0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, true, false);
        this.f646d = hj.h.a(this, this, function2);
    }

    @Override // Bj.u0
    public final void a0() {
        Hj.a.a(this.f646d, this);
    }
}
