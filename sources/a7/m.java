package A7;

import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f224b;

    public /* synthetic */ m(o oVar, int i) {
        this.f223a = i;
        this.f224b = oVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f223a) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.j.g(it, "it");
                o oVar = this.f224b;
                D7.h hVar = ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).t0;
                if (hVar != null) {
                    hVar.notifyDataSetChanged();
                }
                ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).Q1(false);
                break;
            default:
                o oVar2 = this.f224b;
                PayMayaError payMayaErrorF = oVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                oVar2.m(payMayaErrorF);
                break;
        }
    }
}
