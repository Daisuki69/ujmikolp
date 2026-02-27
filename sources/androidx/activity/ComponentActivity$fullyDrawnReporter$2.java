package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ComponentActivity$fullyDrawnReporter$2 extends kotlin.jvm.internal.k implements Function0<FullyDrawnReporter> {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$fullyDrawnReporter$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.k implements Function0<Unit> {
        final /* synthetic */ ComponentActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ComponentActivity componentActivity) {
            super(0);
            this.this$0 = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m38invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m38invoke() {
            this.this$0.reportFullyDrawn();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$fullyDrawnReporter$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FullyDrawnReporter invoke() {
        return new FullyDrawnReporter(this.this$0.reportFullyDrawnExecutor, new AnonymousClass1(this.this$0));
    }
}
