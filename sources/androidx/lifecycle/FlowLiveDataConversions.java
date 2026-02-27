package androidx.lifecycle;

import Bj.C0144h0;
import Bj.E;
import Bj.H;
import Bj.U;
import Dj.q;
import Dj.r;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import Ej.W;
import Ej.f0;
import Gj.m;
import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.RoomTrackingLiveData;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.time.Duration;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class FlowLiveDataConversions {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {112, 116}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1611e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        public static final class C00071 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00071(LiveData<T> liveData, Observer<T> observer, InterfaceC1526a<? super C00071> interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new C00071(this.$this_asFlow, this.$observer, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((C00071) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return Unit.f18162a;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements Function0<Unit> {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;

            /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1, reason: invalid class name and collision with other inner class name */
            @InterfaceC1611e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
            public static final class C00081 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
                final /* synthetic */ Observer<T> $observer;
                final /* synthetic */ LiveData<T> $this_asFlow;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00081(LiveData<T> liveData, Observer<T> observer, InterfaceC1526a<? super C00081> interfaceC1526a) {
                    super(2, interfaceC1526a);
                    this.$this_asFlow = liveData;
                    this.$observer = observer;
                }

                @Override // ij.AbstractC1607a
                public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                    return new C00081(this.$this_asFlow, this.$observer, interfaceC1526a);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
                    return ((C00081) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // ij.AbstractC1607a
                public final Object invokeSuspend(Object obj) {
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                    this.$this_asFlow.removeObserver(this.$observer);
                    return Unit.f18162a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer) {
                super(0);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m97invoke();
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m97invoke() {
                C0144h0 c0144h0 = C0144h0.f623a;
                Ij.e eVar = U.f603a;
                H.w(c0144h0, m.f2024a.c, null, new C00081(this.$this_asFlow, this.$observer, null), 2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData<T> liveData, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$this_asFlow = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(r rVar, Object obj) {
            ((q) rVar).j(obj);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
        
            if (x3.d.b(r3, r9, r8) == r0) goto L16;
         */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                hj.a r0 = hj.EnumC1578a.f17050a
                int r1 = r8.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L25
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                bj.AbstractC1039j.b(r9)
                goto L60
            L11:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L19:
                java.lang.Object r1 = r8.L$1
                androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
                java.lang.Object r3 = r8.L$0
                Dj.r r3 = (Dj.r) r3
                bj.AbstractC1039j.b(r9)
                goto L4c
            L25:
                bj.AbstractC1039j.b(r9)
                java.lang.Object r9 = r8.L$0
                Dj.r r9 = (Dj.r) r9
                androidx.lifecycle.c r1 = new androidx.lifecycle.c
                r1.<init>()
                Ij.e r5 = Bj.U.f603a
                Cj.d r5 = Gj.m.f2024a
                Cj.d r5 = r5.c
                androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r6 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
                androidx.lifecycle.LiveData<T> r7 = r8.$this_asFlow
                r6.<init>(r7, r1, r4)
                r8.L$0 = r9
                r8.L$1 = r1
                r8.label = r3
                java.lang.Object r3 = Bj.H.C(r6, r5, r8)
                if (r3 != r0) goto L4b
                goto L5f
            L4b:
                r3 = r9
            L4c:
                androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r9 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
                androidx.lifecycle.LiveData<T> r5 = r8.$this_asFlow
                r9.<init>(r5, r1)
                r8.L$0 = r4
                r8.L$1 = r4
                r8.label = r2
                java.lang.Object r9 = x3.d.b(r3, r9, r8)
                if (r9 != r0) goto L60
            L5f:
                return r0
            L60:
                kotlin.Unit r9 = kotlin.Unit.f18162a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {81}, m = "invokeSuspend")
    public static final class C07881<T> extends AbstractC1616j implements Function2<LiveDataScope<T>, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ InterfaceC0230h $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07881(InterfaceC0230h interfaceC0230h, InterfaceC1526a<? super C07881> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$this_asLiveData = interfaceC0230h;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C07881 c07881 = new C07881(this.$this_asLiveData, interfaceC1526a);
            c07881.L$0 = obj;
            return c07881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<T> liveDataScope, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C07881) create(liveDataScope, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                InterfaceC0230h interfaceC0230h = this.$this_asLiveData;
                InterfaceC0231i interfaceC0231i = new InterfaceC0231i() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // Ej.InterfaceC0231i
                    public final Object emit(T t5, InterfaceC1526a<? super Unit> interfaceC1526a) {
                        Object objEmit = liveDataScope.emit(t5, interfaceC1526a);
                        return objEmit == EnumC1578a.f17050a ? objEmit : Unit.f18162a;
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

    public static final <T> InterfaceC0230h asFlow(LiveData<T> liveData) {
        j.g(liveData, "<this>");
        return W.e(W.f(new AnonymousClass1(liveData, null)), -1);
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC0230h interfaceC0230h) {
        j.g(interfaceC0230h, "<this>");
        return asLiveData$default(interfaceC0230h, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC0230h interfaceC0230h, CoroutineContext coroutineContext, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f18170a;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(interfaceC0230h, coroutineContext, j);
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC0230h interfaceC0230h, CoroutineContext context) {
        j.g(interfaceC0230h, "<this>");
        j.g(context, "context");
        return asLiveData$default(interfaceC0230h, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(InterfaceC0230h interfaceC0230h, CoroutineContext context, long j) {
        j.g(interfaceC0230h, "<this>");
        j.g(context, "context");
        RoomTrackingLiveData roomTrackingLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j, new C07881(interfaceC0230h, null));
        if (interfaceC0230h instanceof f0) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                roomTrackingLiveData.setValue(((f0) interfaceC0230h).getValue());
                return roomTrackingLiveData;
            }
            roomTrackingLiveData.postValue(((f0) interfaceC0230h).getValue());
        }
        return roomTrackingLiveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC0230h interfaceC0230h, Duration duration, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlin.coroutines.g.f18170a;
        }
        return asLiveData(interfaceC0230h, duration, coroutineContext);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(InterfaceC0230h interfaceC0230h, Duration timeout, CoroutineContext context) {
        j.g(interfaceC0230h, "<this>");
        j.g(timeout, "timeout");
        j.g(context, "context");
        return asLiveData(interfaceC0230h, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
