package G6;

import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.cashin.view.widget.MayaCashInAccountLimitSection;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f1790b;

    public /* synthetic */ i(k kVar, int i) {
        this.f1789a = i;
        this.f1790b = kVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1789a) {
            case 0:
                CreatePullFunds createPullFunds = (CreatePullFunds) obj;
                kotlin.jvm.internal.j.g(createPullFunds, "createPullFunds");
                this.f1790b.w(createPullFunds);
                return;
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                k kVar = this.f1790b;
                kotlin.jvm.internal.j.f(kVar.f(it, true), "mayaErrorHandling(...)");
                MayaCashInAccountLimitSection mayaCashInAccountLimitSection = ((MayaCashInCodeFormFragment) ((K6.f) kVar.c.get())).t0;
                if (mayaCashInAccountLimitSection == null) {
                    kotlin.jvm.internal.j.n("mMayaCashInAccountLimitSection");
                    throw null;
                }
                mayaCashInAccountLimitSection.setVisibility(8);
                ((MayaCashInCodeFormFragment) ((K6.f) kVar.c.get())).W1();
                return;
        }
    }
}
