package androidx.lifecycle;

import Bj.E;
import Dj.q;
import Dj.r;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import Ej.W;
import androidx.lifecycle.Lifecycle;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class FlowExtKt {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ InterfaceC0230h $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1611e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        public static final class C00051 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ r $$this$callbackFlow;
            final /* synthetic */ InterfaceC0230h $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(InterfaceC0230h interfaceC0230h, r rVar, InterfaceC1526a<? super C00051> interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$this_flowWithLifecycle = interfaceC0230h;
                this.$$this$callbackFlow = rVar;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new C00051(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((C00051) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                int i = this.label;
                if (i == 0) {
                    AbstractC1039j.b(obj);
                    InterfaceC0230h interfaceC0230h = this.$this_flowWithLifecycle;
                    final r rVar = this.$$this$callbackFlow;
                    InterfaceC0231i interfaceC0231i = new InterfaceC0231i() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // Ej.InterfaceC0231i
                        public final Object emit(T t5, InterfaceC1526a<? super Unit> interfaceC1526a) {
                            Object objM = ((q) rVar).f1200d.m(interfaceC1526a, t5);
                            return objM == EnumC1578a.f17050a ? objM : Unit.f18162a;
                        }
                    };
                    this.label = 1;
                    if (interfaceC0230h.collect(interfaceC0231i, this) == enumC1578a) {
                        return enumC1578a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
                return Unit.f18162a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC0230h interfaceC0230h, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = interfaceC0230h;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                r rVar2 = (r) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C00051 c00051 = new C00051(this.$this_flowWithLifecycle, rVar2, null);
                this.L$0 = rVar2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c00051, this) == enumC1578a) {
                    return enumC1578a;
                }
                rVar = rVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) this.L$0;
                AbstractC1039j.b(obj);
            }
            ((q) rVar).o(null);
            return Unit.f18162a;
        }
    }

    public static final <T> InterfaceC0230h flowWithLifecycle(InterfaceC0230h interfaceC0230h, Lifecycle lifecycle, Lifecycle.State state) {
        return W.f(new AnonymousClass1(lifecycle, state, interfaceC0230h, null));
    }

    public static /* synthetic */ InterfaceC0230h flowWithLifecycle$default(InterfaceC0230h interfaceC0230h, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC0230h, lifecycle, state);
    }
}
