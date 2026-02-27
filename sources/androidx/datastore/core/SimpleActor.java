package androidx.datastore.core;

import Bj.C0154m0;
import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import Dj.i;
import Dj.l;
import defpackage.AbstractC1414e;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import of.p;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleActor<T> {
    private final Function2<T, InterfaceC1526a<? super Unit>, Object> consumeMessage;
    private final i messageQueue;
    private final AtomicInt remainingMessages;
    private final E scope;

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<Throwable, Unit> {
        final /* synthetic */ Function1<Throwable, Unit> $onComplete;
        final /* synthetic */ Function2<T, Throwable, Unit> $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Throwable, Unit> function1, SimpleActor<T> simpleActor, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.$onComplete = function1;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f18162a;
        }

        public final void invoke(Throwable th2) {
            Unit unit;
            this.$onComplete.invoke(th2);
            ((SimpleActor) this.this$0).messageQueue.o(th2);
            do {
                Object objA = l.a(((SimpleActor) this.this$0).messageQueue.n());
                if (objA != null) {
                    this.$onUndeliveredElement.invoke(objA, th2);
                    unit = Unit.f18162a;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SimpleActor<T> simpleActor, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = simpleActor;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new AnonymousClass2(this.this$0, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            if (r1.invoke(r6, r5) != r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[PHI: r1 r6
  0x0053: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x0050, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r6v5 java.lang.Object) = (r6v13 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x0050, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005c -> B:18:0x005f). Please report as a decompilation issue!!! */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                hj.a r0 = hj.EnumC1578a.f17050a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                bj.AbstractC1039j.b(r6)
                goto L5f
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                bj.AbstractC1039j.b(r6)
                goto L53
            L20:
                bj.AbstractC1039j.b(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L6e
            L2f:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                Bj.E r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                Bj.H.m(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                kotlin.jvm.functions.Function2 r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                Dj.i r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.s(r5)
                if (r6 != r0) goto L53
                goto L5e
            L53:
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5f
            L5e:
                return r0
            L5f:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L2f
                kotlin.Unit r6 = kotlin.Unit.f18162a
                return r6
            L6e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(E scope, Function1<? super Throwable, Unit> onComplete, Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, Function2<? super T, ? super InterfaceC1526a<? super Unit>, ? extends Object> consumeMessage) {
        j.g(scope, "scope");
        j.g(onComplete, "onComplete");
        j.g(onUndeliveredElement, "onUndeliveredElement");
        j.g(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = p.a(Integer.MAX_VALUE, 6, null);
        this.remainingMessages = new AtomicInt(0);
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) scope.getCoroutineContext().get(C0154m0.f630a);
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.i(new AnonymousClass1(onComplete, this, onUndeliveredElement));
        }
    }

    public final void offer(T t5) {
        Object objJ = this.messageQueue.j(t5);
        if (!(objJ instanceof Dj.j)) {
            if (objJ instanceof Dj.k) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.remainingMessages.getAndIncrement() == 0) {
                H.w(this.scope, null, null, new AnonymousClass2(this, null), 3);
                return;
            }
            return;
        }
        Dj.j jVar = (Dj.j) objJ;
        if (!AbstractC1414e.u(jVar)) {
            jVar = null;
        }
        Throwable th2 = jVar != null ? jVar.f1192a : null;
        if (th2 != null) {
            throw th2;
        }
        throw new ClosedSendChannelException("Channel was closed normally");
    }
}
