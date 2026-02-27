package androidx.work.impl.constraints.controllers;

import Dj.q;
import Dj.r;
import Ej.InterfaceC0230h;
import Ej.W;
import androidx.work.Constraints;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
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
public abstract class BaseConstraintController<T> implements ConstraintController {
    private final ConstraintTracker<T> tracker;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseConstraintController<T> this$0;

        /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00201 extends k implements Function0<Unit> {
            final /* synthetic */ BaseConstraintController$track$1$listener$1 $listener;
            final /* synthetic */ BaseConstraintController<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00201(BaseConstraintController<T> baseConstraintController, BaseConstraintController$track$1$listener$1 baseConstraintController$track$1$listener$1) {
                super(0);
                this.this$0 = baseConstraintController;
                this.$listener = baseConstraintController$track$1$listener$1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m144invoke();
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m144invoke() {
                ((BaseConstraintController) this.this$0).tracker.removeListener(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseConstraintController<T> baseConstraintController, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = baseConstraintController;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC1526a);
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
                final BaseConstraintController<T> baseConstraintController = this.this$0;
                ConstraintListener<T> constraintListener = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1
                    @Override // androidx.work.impl.constraints.ConstraintListener
                    public void onConstraintChanged(T t5) {
                        Object constraintsNotMet = baseConstraintController.isConstrained(t5) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController.getReason()) : ConstraintsState.ConstraintsMet.INSTANCE;
                        q qVar = (q) rVar;
                        qVar.getClass();
                        qVar.j(constraintsNotMet);
                    }
                };
                ((BaseConstraintController) this.this$0).tracker.addListener(constraintListener);
                C00201 c00201 = new C00201(this.this$0, constraintListener);
                this.label = 1;
                if (d.b(rVar, c00201, this) == enumC1578a) {
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

    public BaseConstraintController(ConstraintTracker<T> tracker) {
        j.g(tracker, "tracker");
        this.tracker = tracker;
    }

    public static /* synthetic */ void getReason$annotations() {
    }

    public abstract int getReason();

    public boolean isConstrained(T t5) {
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        j.g(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained(this.tracker.readSystemState());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public InterfaceC0230h track(Constraints constraints) {
        j.g(constraints, "constraints");
        return W.f(new AnonymousClass1(this, null));
    }
}
