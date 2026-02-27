package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends kotlin.jvm.internal.i implements Function0<Unit> {
    public OnBackPressedDispatcher$addCancellableCallback$1(Object obj) {
        super(obj, "updateEnabledCallbacks", 0, "updateEnabledCallbacks()V", 0, OnBackPressedDispatcher.class);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m43invoke();
        return Unit.f18162a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m43invoke() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
