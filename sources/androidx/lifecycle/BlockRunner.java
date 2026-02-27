package androidx.lifecycle;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import Bj.O;
import Bj.U;
import Gj.m;
import androidx.annotation.MainThread;
import androidx.media3.extractor.ts.TsExtractor;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class BlockRunner<T> {
    private final Function2<LiveDataScope<T>, InterfaceC1526a<? super Unit>, Object> block;
    private InterfaceC0156n0 cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final Function0<Unit> onDone;
    private InterfaceC0156n0 runningJob;
    private final E scope;
    private final long timeoutInMs;

    /* JADX INFO: renamed from: androidx.lifecycle.BlockRunner$cancel$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BlockRunner<T> blockRunner, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = blockRunner;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new AnonymousClass1(this.this$0, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                long j = ((BlockRunner) this.this$0).timeoutInMs;
                this.label = 1;
                if (O.b(j, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            if (!((BlockRunner) this.this$0).liveData.hasActiveObservers()) {
                InterfaceC0156n0 interfaceC0156n0 = ((BlockRunner) this.this$0).runningJob;
                if (interfaceC0156n0 != null) {
                    interfaceC0156n0.b(null);
                }
                ((BlockRunner) this.this$0).runningJob = null;
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.BlockRunner$maybeRun$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
    public static final class C07871 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07871(BlockRunner<T> blockRunner, InterfaceC1526a<? super C07871> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = blockRunner;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C07871 c07871 = new C07871(this.this$0, interfaceC1526a);
            c07871.L$0 = obj;
            return c07871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C07871) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.this$0).liveData, ((E) this.L$0).getCoroutineContext());
                Function2 function2 = ((BlockRunner) this.this$0).block;
                this.label = 1;
                if (function2.invoke(liveDataScopeImpl, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            ((BlockRunner) this.this$0).onDone.invoke();
            return Unit.f18162a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(CoroutineLiveData<T> liveData, Function2<? super LiveDataScope<T>, ? super InterfaceC1526a<? super Unit>, ? extends Object> block, long j, E scope, Function0<Unit> onDone) {
        j.g(liveData, "liveData");
        j.g(block, "block");
        j.g(scope, "scope");
        j.g(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        E e = this.scope;
        Ij.e eVar = U.f603a;
        this.cancellationJob = H.w(e, m.f2024a.c, null, new AnonymousClass1(this, null), 2);
    }

    @MainThread
    public final void maybeRun() {
        InterfaceC0156n0 interfaceC0156n0 = this.cancellationJob;
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.b(null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = H.w(this.scope, null, null, new C07871(this, null), 3);
    }
}
