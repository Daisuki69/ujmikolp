package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultSpecialEffectsController$TransitionEffect$onStart$4 extends kotlin.jvm.internal.k implements Function0<Unit> {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ Object $mergedTransition;
    final /* synthetic */ y $seekCancelLambda;
    final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2, reason: invalid class name */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.k implements Function0<Unit> {
        final /* synthetic */ ViewGroup $container;
        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup) {
            super(0);
            this.this$0 = transitionEffect;
            this.$container = viewGroup;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
            kotlin.jvm.internal.j.g(this$0, "this$0");
            kotlin.jvm.internal.j.g(container, "$container");
            Iterator<T> it = this$0.getTransitionInfos().iterator();
            while (it.hasNext()) {
                SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                View view = operation.getFragment().getView();
                if (view != null) {
                    operation.getFinalState().applyState(view, container);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m90invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m90invoke() {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animating to start");
            }
            FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
            Object controller = this.this$0.getController();
            kotlin.jvm.internal.j.d(controller);
            transitionImpl.animateToStart(controller, new d(0, this.this$0, this.$container));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$TransitionEffect$onStart$4(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup, Object obj, y yVar) {
        super(0);
        this.this$0 = transitionEffect;
        this.$container = viewGroup;
        this.$mergedTransition = obj;
        this.$seekCancelLambda = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m89invoke();
        return Unit.f18162a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m89invoke() {
        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
        transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(this.$container, this.$mergedTransition));
        boolean z4 = this.this$0.getController() != null;
        Object obj = this.$mergedTransition;
        ViewGroup viewGroup = this.$container;
        if (!z4) {
            throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
        }
        this.$seekCancelLambda.f18195a = new AnonymousClass2(this.this$0, viewGroup);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Started executing operations from " + this.this$0.getFirstOut() + " to " + this.this$0.getLastIn());
        }
    }
}
