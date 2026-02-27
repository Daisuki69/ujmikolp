package Jd;

import B5.i;
import Hd.b;
import N5.n1;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.ui.invest.view.activity.impl.InvestActivity;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder implements Id.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f2508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestPreviewFragment f2509b;
    public final Ae.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnlinePayment f2510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n1 n1Var, InvestPreviewFragment mInvestmentPartnerViewHolderListener) {
        super(n1Var.f4165b);
        j.g(mInvestmentPartnerViewHolderListener, "mInvestmentPartnerViewHolderListener");
        this.f2508a = n1Var;
        this.f2509b = mInvestmentPartnerViewHolderListener;
        Ae.a aVar = new Ae.a(23);
        this.c = aVar;
        n1Var.c.setOnClickListener(new Ba.a(this, 18));
        aVar.h(this);
    }

    public static final void D(a aVar) {
        OnlinePayment onlinePayment = aVar.f2510d;
        if (onlinePayment != null) {
            InvestPreviewFragment investPreviewFragment = aVar.f2509b;
            investPreviewFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.PARTNER);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("partner", onlinePayment.mName());
            investPreviewFragment.o1(c1219h);
            String strMExternalLink = onlinePayment.mExternalLink();
            if (strMExternalLink != null) {
                b bVar = investPreviewFragment.f14614b0;
                if (bVar == null) {
                    j.n("mInvestPreviewFragmentListener");
                    throw null;
                }
                InvestActivity investActivity = (InvestActivity) bVar;
                investActivity.e.getClass();
                i.f(investActivity, strMExternalLink);
            }
        }
    }
}
