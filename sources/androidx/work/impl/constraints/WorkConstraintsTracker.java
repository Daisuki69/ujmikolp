package androidx.work.impl.constraints;

import Bj.C0;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import Ej.W;
import Fj.r;
import android.os.Build;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import bj.AbstractC1039j;
import cj.C1110A;
import cj.C1129o;
import cj.t;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import qj.n;
import qk.i;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkConstraintsTracker {
    private final List<ConstraintController> controllers;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$areAllConstraintsMet$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<ConstraintController, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(ConstraintController it) {
            j.g(it, "it");
            return it.getClass().getSimpleName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController> controllers) {
        j.g(controllers, "controllers");
        this.controllers = controllers;
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        j.g(workSpec, "workSpec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + workSpec.id + " constrained by " + C1110A.F(arrayList, null, null, null, AnonymousClass1.INSTANCE, 31));
        }
        return arrayList.isEmpty();
    }

    public final InterfaceC0230h track(WorkSpec spec) {
        j.g(spec, "spec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ConstraintController) it.next()).track(spec.constraints));
        }
        final InterfaceC0230h[] interfaceC0230hArr = (InterfaceC0230h[]) C1110A.V(arrayList2).toArray(new InterfaceC0230h[0]);
        return W.h(new InterfaceC0230h() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends k implements Function0<ConstraintsState[]> {
                final /* synthetic */ InterfaceC0230h[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC0230h[] interfaceC0230hArr) {
                    super(0);
                    this.$flowArray = interfaceC0230hArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final ConstraintsState[] invoke() {
                    return new ConstraintsState[this.$flowArray.length];
                }
            }

            /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            @InterfaceC1611e(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
            public static final class AnonymousClass3 extends AbstractC1616j implements n {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(InterfaceC1526a interfaceC1526a) {
                    super(3, interfaceC1526a);
                }

                @Override // qj.n
                public final Object invoke(InterfaceC0231i interfaceC0231i, ConstraintsState[] constraintsStateArr, InterfaceC1526a<? super Unit> interfaceC1526a) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC1526a);
                    anonymousClass3.L$0 = interfaceC0231i;
                    anonymousClass3.L$1 = constraintsStateArr;
                    return anonymousClass3.invokeSuspend(Unit.f18162a);
                }

                @Override // ij.AbstractC1607a
                public final Object invokeSuspend(Object obj) {
                    ConstraintsState constraintsState;
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC1039j.b(obj);
                        InterfaceC0231i interfaceC0231i = (InterfaceC0231i) this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                constraintsState = null;
                                break;
                            }
                            constraintsState = constraintsStateArr[i4];
                            if (!j.b(constraintsState, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i4++;
                        }
                        if (constraintsState == null) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (interfaceC0231i.emit(constraintsState, this) == enumC1578a) {
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

            @Override // Ej.InterfaceC0230h
            public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
                InterfaceC0230h[] interfaceC0230hArr2 = interfaceC0230hArr;
                r rVar = new r(interfaceC0230hArr2, new AnonymousClass2(interfaceC0230hArr2), new AnonymousClass3(null), interfaceC0231i, null);
                C0 c02 = new C0(interfaceC1526a.getContext(), interfaceC1526a, 1);
                Object objE = i.E(c02, c02, rVar);
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                if (objE != enumC1578a) {
                    objE = Unit.f18162a;
                }
                return objE == enumC1578a ? objE : Unit.f18162a;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this((List<? extends ConstraintController>) C1129o.q(new ConstraintController[]{new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker()), Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.NetworkRequestConstraintController(trackers.getContext()) : null}));
        j.g(trackers, "trackers");
    }
}
