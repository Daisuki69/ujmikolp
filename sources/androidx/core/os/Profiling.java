package androidx.core.os;

import Dj.q;
import Dj.r;
import Ej.InterfaceC0230h;
import Ej.W;
import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.annotation.RequiresApi;
import androidx.core.os.Profiling;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class Profiling {
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", l = {79}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements Function0<Unit> {
            final /* synthetic */ Consumer<ProfilingResult> $listener;
            final /* synthetic */ ProfilingManager $service;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ProfilingManager profilingManager, Consumer<ProfilingResult> consumer) {
                super(0);
                this.$service = profilingManager;
                this.$listener = consumer;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m79invoke();
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m79invoke() {
                this.$service.unregisterForAllProfilingResults(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(r rVar, ProfilingResult result) {
            j.f(result, "result");
            ((q) rVar).j(result);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.os.c, java.util.function.Consumer] */
        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final r rVar = (r) this.L$0;
                ?? r1 = new Consumer() { // from class: androidx.core.os.c
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.AnonymousClass1.invokeSuspend$lambda$0(rVar, (ProfilingResult) obj2);
                    }
                };
                ProfilingManager profilingManagerS = b.s(this.$context.getSystemService(b.t()));
                profilingManagerS.registerForAllProfilingResults(new d(), r1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(profilingManagerS, r1);
                this.label = 1;
                if (x3.d.b(rVar, anonymousClass2, this) == enumC1578a) {
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

    @RequiresApi(api = 35)
    public static final InterfaceC0230h registerForAllProfilingResults(Context context) {
        j.g(context, "context");
        return W.f(new AnonymousClass1(context, null));
    }

    @RequiresApi(api = 35)
    public static final void requestProfiling(Context context, ProfilingRequest profilingRequest, Executor executor, Consumer<ProfilingResult> consumer) {
        j.g(context, "context");
        j.g(profilingRequest, "profilingRequest");
        b.s(context.getSystemService(b.t())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    @RequiresApi(api = 35)
    public static final void unregisterForAllProfilingResults(Context context, Consumer<ProfilingResult> listener) {
        j.g(context, "context");
        j.g(listener, "listener");
        b.s(context.getSystemService(b.t())).unregisterForAllProfilingResults(listener);
    }

    @RequiresApi(api = 35)
    public static final void registerForAllProfilingResults(Context context, Executor executor, Consumer<ProfilingResult> listener) {
        j.g(context, "context");
        j.g(executor, "executor");
        j.g(listener, "listener");
        b.s(context.getSystemService(b.t())).registerForAllProfilingResults(executor, listener);
    }
}
