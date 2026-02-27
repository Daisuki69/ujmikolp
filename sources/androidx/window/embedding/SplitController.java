package androidx.window.embedding;

import Dj.q;
import Dj.r;
import Ej.InterfaceC0230h;
import Ej.W;
import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.RequiresWindowSdkExtension;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.SplitController;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SplitController {
    public static final Companion Companion = new Companion(null);
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SplitController getInstance(Context context) {
            j.g(context, "context");
            return new SplitController(EmbeddingBackend.Companion.getInstance(context));
        }

        private Companion() {
        }
    }

    public static final class SplitSupportStatus {
        private final int rawValue;
        public static final Companion Companion = new Companion(null);
        public static final SplitSupportStatus SPLIT_AVAILABLE = new SplitSupportStatus(0);
        public static final SplitSupportStatus SPLIT_UNAVAILABLE = new SplitSupportStatus(1);
        public static final SplitSupportStatus SPLIT_ERROR_PROPERTY_NOT_DECLARED = new SplitSupportStatus(2);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        private SplitSupportStatus(int i) {
            this.rawValue = i;
        }

        public String toString() {
            int i = this.rawValue;
            return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED" : "SplitSupportStatus: UNAVAILABLE" : "SplitSupportStatus: AVAILABLE";
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.SplitController$splitInfoList$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.window.embedding.SplitController$splitInfoList$1", f = "SplitController.kt", l = {64}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.window.embedding.SplitController$splitInfoList$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends k implements Function0<Unit> {
            final /* synthetic */ Consumer<List<SplitInfo>> $listener;
            final /* synthetic */ SplitController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SplitController splitController, Consumer<List<SplitInfo>> consumer) {
                super(0);
                this.this$0 = splitController;
                this.$listener = consumer;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m134invoke();
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m134invoke() {
                this.this$0.embeddingBackend.removeSplitListenerForActivity(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(r rVar, List list) {
            ((q) rVar).j(list);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = SplitController.this.new AnonymousClass1(this.$activity, interfaceC1526a);
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
                final r rVar = (r) this.L$0;
                Consumer<List<SplitInfo>> consumer = new Consumer() { // from class: androidx.window.embedding.i
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        SplitController.AnonymousClass1.invokeSuspend$lambda$0(rVar, (List) obj2);
                    }
                };
                SplitController.this.embeddingBackend.addSplitListenerForActivity(this.$activity, new androidx.arch.core.executor.a(2), consumer);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SplitController.this, consumer);
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

    public SplitController(EmbeddingBackend embeddingBackend) {
        j.g(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    public static final SplitController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    @RequiresWindowSdkExtension(version = 2)
    public final void clearSplitAttributesCalculator() {
        this.embeddingBackend.clearSplitAttributesCalculator();
    }

    public final SplitSupportStatus getSplitSupportStatus() {
        return this.embeddingBackend.getSplitSupportStatus();
    }

    @ExperimentalWindowApi
    @RequiresWindowSdkExtension(version = 3)
    public final void invalidateTopVisibleSplitAttributes() {
        this.embeddingBackend.invalidateTopVisibleSplitAttributes();
    }

    @RequiresWindowSdkExtension(version = 2)
    public final void setSplitAttributesCalculator(Function1<? super SplitAttributesCalculatorParams, SplitAttributes> calculator) {
        j.g(calculator, "calculator");
        this.embeddingBackend.setSplitAttributesCalculator(calculator);
    }

    public final InterfaceC0230h splitInfoList(Activity activity) {
        j.g(activity, "activity");
        return W.f(new AnonymousClass1(activity, null));
    }

    @ExperimentalWindowApi
    @RequiresWindowSdkExtension(version = 3)
    public final void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        j.g(splitInfo, "splitInfo");
        j.g(splitAttributes, "splitAttributes");
        this.embeddingBackend.updateSplitAttributes(splitInfo, splitAttributes);
    }
}
