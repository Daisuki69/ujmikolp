package androidx.lifecycle;

import Bj.C0154m0;
import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import Bj.U;
import Gj.m;
import androidx.lifecycle.Lifecycle;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final CoroutineContext coroutineContext;
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = LifecycleCoroutineScopeImpl.this.new AnonymousClass1(interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            E e = (E) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) e.getCoroutineContext().get(C0154m0.f630a);
                if (interfaceC0156n0 != null) {
                    interfaceC0156n0.b(null);
                }
            }
            return Unit.f18162a;
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        InterfaceC0156n0 interfaceC0156n0;
        j.g(lifecycle, "lifecycle");
        j.g(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() != Lifecycle.State.DESTROYED || (interfaceC0156n0 = (InterfaceC0156n0) getCoroutineContext().get(C0154m0.f630a)) == null) {
            return;
        }
        interfaceC0156n0.b(null);
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, Bj.E
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        j.g(source, "source");
        j.g(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) getCoroutineContext().get(C0154m0.f630a);
            if (interfaceC0156n0 != null) {
                interfaceC0156n0.b(null);
            }
        }
    }

    public final void register() {
        Ij.e eVar = U.f603a;
        H.w(this, m.f2024a.c, null, new AnonymousClass1(null), 2);
    }
}
