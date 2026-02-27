package androidx.lifecycle;

import Bj.A;
import Bj.C0151l;
import Bj.InterfaceC0147j;
import Bj.U;
import Gj.m;
import androidx.lifecycle.Lifecycle;
import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2, reason: invalid class name */
    public static final class AnonymousClass2<R> extends k implements Function0<R> {
        final /* synthetic */ Function0<R> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function0<? extends R> function0) {
            super(0);
            this.$block = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final R invoke() {
            return (R) this.$block.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z4, A a8, final Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        final C0151l c0151l = new C0151l(1, hj.h.b(interfaceC1526a));
        c0151l.r();
        final ?? r72 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Object objA;
                if (event != Lifecycle.Event.Companion.upTo(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        InterfaceC0147j interfaceC0147j = c0151l;
                        C1037h.a aVar = C1037h.f9166b;
                        interfaceC0147j.resumeWith(AbstractC1039j.a(new LifecycleDestroyedException()));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                InterfaceC0147j interfaceC0147j2 = c0151l;
                Function0<R> function02 = function0;
                try {
                    C1037h.a aVar2 = C1037h.f9166b;
                    objA = function02.invoke();
                } catch (Throwable th2) {
                    C1037h.a aVar3 = C1037h.f9166b;
                    objA = AbstractC1039j.a(th2);
                }
                interfaceC0147j2.resumeWith(objA);
            }
        };
        if (z4) {
            a8.dispatch(kotlin.coroutines.g.f18170a, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r72);
                }
            });
        } else {
            lifecycle.addObserver(r72);
        }
        c0151l.t(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(a8, lifecycle, r72));
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            Ij.e eVar = U.f603a;
            Cj.d dVar = m.f2024a.c;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            Ij.e eVar = U.f603a;
            Cj.d dVar = m.f2024a.c;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        Ij.e eVar = U.f603a;
        Cj.d dVar = m.f2024a.c;
        boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1526a<? super R> interfaceC1526a) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            Ij.e eVar = U.f603a;
            Cj.d dVar = m.f2024a.c;
            boolean zIsDispatchNeeded = dVar.isDispatchNeeded(interfaceC1526a.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return function0.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, dVar, new AnonymousClass2(function0), interfaceC1526a);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
