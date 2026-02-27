package androidx.window.layout;

import Bj.U;
import Dj.q;
import Dj.r;
import Ej.C0225c;
import Ej.InterfaceC0230h;
import Ej.W;
import Gj.m;
import Ij.e;
import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.adapter.WindowBackend;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import x3.d;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {50}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements Function0<Unit> {
            final /* synthetic */ Consumer<WindowLayoutInfo> $listener;
            final /* synthetic */ WindowInfoTrackerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(WindowInfoTrackerImpl windowInfoTrackerImpl, Consumer<WindowLayoutInfo> consumer) {
                super(0);
                this.this$0 = windowInfoTrackerImpl;
                this.$listener = consumer;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m135invoke();
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m135invoke() {
                this.this$0.windowBackend.unregisterLayoutChangeCallback(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(r rVar, WindowLayoutInfo windowLayoutInfo) {
            ((q) rVar).j(windowLayoutInfo);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = WindowInfoTrackerImpl.this.new AnonymousClass1(this.$context, interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                r rVar = (r) this.L$0;
                b bVar = new b(rVar, 0);
                WindowInfoTrackerImpl.this.windowBackend.registerLayoutChangeCallback(this.$context, new androidx.arch.core.executor.a(2), bVar);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(WindowInfoTrackerImpl.this, bVar);
                this.label = 1;
                if (d.b(rVar, anonymousClass2, this) == enumC1578a) {
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

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {63}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C00172 extends k implements Function0<Unit> {
            final /* synthetic */ Consumer<WindowLayoutInfo> $listener;
            final /* synthetic */ WindowInfoTrackerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00172(WindowInfoTrackerImpl windowInfoTrackerImpl, Consumer<WindowLayoutInfo> consumer) {
                super(0);
                this.this$0 = windowInfoTrackerImpl;
                this.$listener = consumer;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m136invoke();
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m136invoke() {
                this.this$0.windowBackend.unregisterLayoutChangeCallback(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Activity activity, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(r rVar, WindowLayoutInfo windowLayoutInfo) {
            ((q) rVar).j(windowLayoutInfo);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = WindowInfoTrackerImpl.this.new AnonymousClass2(this.$activity, interfaceC1526a);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                r rVar = (r) this.L$0;
                b bVar = new b(rVar, 1);
                WindowInfoTrackerImpl.this.windowBackend.registerLayoutChangeCallback(this.$activity, new androidx.arch.core.executor.a(2), bVar);
                C00172 c00172 = new C00172(WindowInfoTrackerImpl.this, bVar);
                this.label = 1;
                if (d.b(rVar, c00172, this) == enumC1578a) {
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

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        j.g(windowMetricsCalculator, "windowMetricsCalculator");
        j.g(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC0230h windowLayoutInfo(Context context) {
        j.g(context, "context");
        C0225c c0225cF = W.f(new AnonymousClass1(context, null));
        e eVar = U.f603a;
        return W.n(c0225cF, m.f2024a);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC0230h windowLayoutInfo(Activity activity) {
        j.g(activity, "activity");
        C0225c c0225cF = W.f(new AnonymousClass2(activity, null));
        e eVar = U.f603a;
        return W.n(c0225cF, m.f2024a);
    }
}
