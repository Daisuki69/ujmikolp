package androidx.work.impl.constraints;

import Bj.H;
import Dj.q;
import Dj.r;
import Ej.InterfaceC0230h;
import Ej.W;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.Constraints;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import x3.d;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
public final class NetworkRequestConstraintController implements ConstraintController {
    private final ConnectivityManager connManager;
    private final long timeoutMs;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {178}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Constraints $constraints;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NetworkRequestConstraintController this$0;

        /* JADX INFO: renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00181 extends k implements Function0<Unit> {
            final /* synthetic */ Function0<Unit> $tryUnregister;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00181(Function0<Unit> function0) {
                super(0);
                this.$tryUnregister = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m142invoke();
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m142invoke() {
                this.$tryUnregister.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$constraints = constraints;
            this.this$0 = networkRequestConstraintController;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$constraints, this.this$0, interfaceC1526a);
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
                NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
                if (requiredNetworkRequest == null) {
                    q qVar = (q) rVar;
                    qVar.getClass();
                    qVar.o(null);
                    return Unit.f18162a;
                }
                NetworkRequestConstraintController$track$1$onConstraintState$1 networkRequestConstraintController$track$1$onConstraintState$1 = new NetworkRequestConstraintController$track$1$onConstraintState$1(H.w(rVar, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, rVar, null), 3), rVar);
                C00181 c00181 = new C00181(Build.VERSION.SDK_INT >= 30 ? SharedNetworkCallback.INSTANCE.addCallback(this.this$0.connManager, requiredNetworkRequest, networkRequestConstraintController$track$1$onConstraintState$1) : IndividualNetworkCallback.Companion.addCallback(this.this$0.connManager, requiredNetworkRequest, networkRequestConstraintController$track$1$onConstraintState$1));
                this.label = 1;
                if (d.b(rVar, c00181, this) == enumC1578a) {
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

    public NetworkRequestConstraintController(ConnectivityManager connManager, long j) {
        j.g(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        j.g(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkRequest() != null;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        j.g(workSpec, "workSpec");
        if (hasConstraint(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public InterfaceC0230h track(Constraints constraints) {
        j.g(constraints, "constraints");
        return W.f(new AnonymousClass1(constraints, this, null));
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i & 2) != 0 ? 1000L : j);
    }
}
