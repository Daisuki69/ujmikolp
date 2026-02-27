package androidx.lifecycle;

import Bj.E;
import Bj.H;
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
public final class RepeatOnLifecycleKt {

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Function2<E, InterfaceC1526a<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        @InterfaceC1611e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ E $$this$coroutineScope;
            final /* synthetic */ Function2<E, InterfaceC1526a<? super Unit>, Object> $block;
            final /* synthetic */ Lifecycle.State $state;
            final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, E e, Function2<? super E, ? super InterfaceC1526a<? super Unit>, ? extends Object> function2, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = e;
                this.$block = function2;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
            @Override // ij.AbstractC1607a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    r12 = this;
                    hj.a r0 = hj.EnumC1578a.f17050a
                    int r1 = r12.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L34
                    if (r1 != r3) goto L2c
                    java.lang.Object r0 = r12.L$5
                    kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                    java.lang.Object r0 = r12.L$4
                    Bj.E r0 = (Bj.E) r0
                    java.lang.Object r0 = r12.L$3
                    androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                    java.lang.Object r0 = r12.L$2
                    androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                    java.lang.Object r0 = r12.L$1
                    r1 = r0
                    kotlin.jvm.internal.y r1 = (kotlin.jvm.internal.y) r1
                    java.lang.Object r0 = r12.L$0
                    r3 = r0
                    kotlin.jvm.internal.y r3 = (kotlin.jvm.internal.y) r3
                    bj.AbstractC1039j.b(r13)     // Catch: java.lang.Throwable -> L28
                    goto L92
                L28:
                    r0 = move-exception
                    r13 = r0
                    goto Lac
                L2c:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L34:
                    bj.AbstractC1039j.b(r13)
                    androidx.lifecycle.Lifecycle r13 = r12.$this_repeatOnLifecycle
                    androidx.lifecycle.Lifecycle$State r13 = r13.getCurrentState()
                    androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                    if (r13 != r1) goto L44
                    kotlin.Unit r13 = kotlin.Unit.f18162a
                    return r13
                L44:
                    kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y
                    r5.<init>()
                    kotlin.jvm.internal.y r1 = new kotlin.jvm.internal.y
                    r1.<init>()
                    androidx.lifecycle.Lifecycle$State r13 = r12.$state     // Catch: java.lang.Throwable -> La9
                    androidx.lifecycle.Lifecycle r11 = r12.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La9
                    Bj.E r6 = r12.$$this$coroutineScope     // Catch: java.lang.Throwable -> La9
                    kotlin.jvm.functions.Function2<Bj.E, gj.a<? super kotlin.Unit>, java.lang.Object> r10 = r12.$block     // Catch: java.lang.Throwable -> La9
                    r12.L$0 = r5     // Catch: java.lang.Throwable -> La9
                    r12.L$1 = r1     // Catch: java.lang.Throwable -> La9
                    r12.L$2 = r13     // Catch: java.lang.Throwable -> La9
                    r12.L$3 = r11     // Catch: java.lang.Throwable -> La9
                    r12.L$4 = r6     // Catch: java.lang.Throwable -> La9
                    r12.L$5 = r10     // Catch: java.lang.Throwable -> La9
                    r12.label = r3     // Catch: java.lang.Throwable -> La9
                    Bj.l r8 = new Bj.l     // Catch: java.lang.Throwable -> La9
                    gj.a r4 = hj.h.b(r12)     // Catch: java.lang.Throwable -> La9
                    r8.<init>(r3, r4)     // Catch: java.lang.Throwable -> La9
                    r8.r()     // Catch: java.lang.Throwable -> La9
                    androidx.lifecycle.Lifecycle$Event$Companion r4 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> La9
                    r7 = r4
                    androidx.lifecycle.Lifecycle$Event r4 = r7.upTo(r13)     // Catch: java.lang.Throwable -> La9
                    androidx.lifecycle.Lifecycle$Event r7 = r7.downFrom(r13)     // Catch: java.lang.Throwable -> La9
                    r13 = 0
                    Kj.d r9 = Kj.e.a(r3, r13)     // Catch: java.lang.Throwable -> La9
                    androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r3 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La9
                    r3.<init>()     // Catch: java.lang.Throwable -> La9
                    r1.f18195a = r3     // Catch: java.lang.Throwable -> La9
                    r11.addObserver(r3)     // Catch: java.lang.Throwable -> La9
                    java.lang.Object r13 = r8.q()     // Catch: java.lang.Throwable -> La9
                    if (r13 != r0) goto L91
                    return r0
                L91:
                    r3 = r5
                L92:
                    java.lang.Object r13 = r3.f18195a
                    Bj.n0 r13 = (Bj.InterfaceC0156n0) r13
                    if (r13 == 0) goto L9b
                    r13.b(r2)
                L9b:
                    java.lang.Object r13 = r1.f18195a
                    androidx.lifecycle.LifecycleEventObserver r13 = (androidx.lifecycle.LifecycleEventObserver) r13
                    if (r13 == 0) goto La6
                    androidx.lifecycle.Lifecycle r0 = r12.$this_repeatOnLifecycle
                    r0.removeObserver(r13)
                La6:
                    kotlin.Unit r13 = kotlin.Unit.f18162a
                    return r13
                La9:
                    r0 = move-exception
                    r13 = r0
                    r3 = r5
                Lac:
                    java.lang.Object r0 = r3.f18195a
                    Bj.n0 r0 = (Bj.InterfaceC0156n0) r0
                    if (r0 == 0) goto Lb5
                    r0.b(r2)
                Lb5:
                    java.lang.Object r0 = r1.f18195a
                    androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                    if (r0 == 0) goto Lc0
                    androidx.lifecycle.Lifecycle r1 = r12.$this_repeatOnLifecycle
                    r1.removeObserver(r0)
                Lc0:
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super E, ? super InterfaceC1526a<? super Unit>, ? extends Object> function2, InterfaceC1526a<? super AnonymousClass3> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = function2;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC1526a);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass3) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                E e = (E) this.L$0;
                Ij.e eVar = U.f603a;
                Cj.d dVar = m.f2024a.c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, e, this.$block, null);
                this.label = 1;
                if (H.C(anonymousClass1, dVar, this) == enumC1578a) {
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

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, Function2<? super E, ? super InterfaceC1526a<? super Unit>, ? extends Object> function2, InterfaceC1526a<? super Unit> interfaceC1526a) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return Unit.f18162a;
        }
        Object objL = H.l(new AnonymousClass3(lifecycle, state, function2, null), interfaceC1526a);
        return objL == EnumC1578a.f17050a ? objL : Unit.f18162a;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2<? super E, ? super InterfaceC1526a<? super Unit>, ? extends Object> function2, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, function2, interfaceC1526a);
        return objRepeatOnLifecycle == EnumC1578a.f17050a ? objRepeatOnLifecycle : Unit.f18162a;
    }
}
