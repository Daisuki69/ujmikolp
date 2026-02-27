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
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcherKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
    public static final class AnonymousClass2<T> extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super T>, Object> {
        final /* synthetic */ Function2<E, InterfaceC1526a<? super T>, Object> $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = function2;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC1526a);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super T> interfaceC1526a) {
            return ((AnonymousClass2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    AbstractC1039j.b(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController.finish();
                    throw th;
                }
            }
            AbstractC1039j.b(obj);
            InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) ((E) this.L$0).getCoroutineContext().get(C0154m0.f630a);
            if (interfaceC0156n0 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC0156n0);
            try {
                Function2<E, InterfaceC1526a<? super T>, Object> function2 = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = H.C(function2, pausingDispatcher, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }
    }

    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a) {
        return whenCreated(lifecycleOwner.getLifecycle(), function2, interfaceC1526a);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a) {
        return whenResumed(lifecycleOwner.getLifecycle(), function2, interfaceC1526a);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a) {
        return whenStarted(lifecycleOwner.getLifecycle(), function2, interfaceC1526a);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a) {
        Ij.e eVar = U.f603a;
        return H.C(new AnonymousClass2(lifecycle, state, function2, null), m.f2024a.c, interfaceC1526a);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, function2, interfaceC1526a);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, function2, interfaceC1526a);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, function2, interfaceC1526a);
    }
}
