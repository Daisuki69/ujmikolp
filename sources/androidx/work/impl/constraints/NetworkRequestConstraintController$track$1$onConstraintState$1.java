package androidx.work.impl.constraints;

import Bj.InterfaceC0156n0;
import Dj.q;
import Dj.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkRequestConstraintController$track$1$onConstraintState$1 extends k implements Function1<ConstraintsState, Unit> {
    final /* synthetic */ r $$this$callbackFlow;
    final /* synthetic */ InterfaceC0156n0 $timeoutJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1$onConstraintState$1(InterfaceC0156n0 interfaceC0156n0, r rVar) {
        super(1);
        this.$timeoutJob = interfaceC0156n0;
        this.$$this$callbackFlow = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConstraintsState) obj);
        return Unit.f18162a;
    }

    public final void invoke(ConstraintsState it) {
        j.g(it, "it");
        this.$timeoutJob.b(null);
        ((q) this.$$this$callbackFlow).j(it);
    }
}
