package ba;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerInput;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.BillsPayRequest;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f8559b;

    public /* synthetic */ B(C c, int i) {
        this.f8558a = i;
        this.f8559b = c;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8558a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("buc2W"));
                C c = this.f8559b;
                PayMayaError payMayaErrorF = c.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, numX49.tnTj78("bucL9"));
                c.A(payMayaErrorF);
                break;
            default:
                BillerTransaction billerTransaction = (BillerTransaction) obj;
                kotlin.jvm.internal.j.g(billerTransaction, numX49.tnTj78("buc2J"));
                C c10 = this.f8559b;
                c10.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.t(EnumC1217f.CREATE);
                if (c10.z()) {
                    c1219h.g(numX49.tnTj78("buc2I"), (String) ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).I0.getValue());
                    c1219h.g(numX49.tnTj78("buc2q"), (String) ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).f13425J0.getValue());
                    c10.j = true;
                }
                ((MayaBaseFragment) ((ga.e) c10.c.get())).A1(c1219h);
                BillerDetails billerDetails = ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).f13428M0;
                if (billerDetails != null) {
                    BillerTransaction billerTransactionBuild = billerTransaction.toBuilder().mBiller(billerDetails.toBuilder().mAccountNumber(billerTransaction.mBiller().mAccountNumber()).mDynamicFields(billerTransaction.mBiller().mDynamicFields()).build()).build();
                    kotlin.jvm.internal.j.f(billerTransactionBuild, numX49.tnTj78("buc2z"));
                    BillerInput billerInputBuild = ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).Q1().build();
                    BillsPayRequest billsPayRequestBuild = billerInputBuild.toBillsPayRequest().toBuilder().mImageUrl(billerDetails.mIconUrl()).build();
                    kotlin.jvm.internal.j.d(billsPayRequestBuild);
                    FavoriteCount favoriteCount = (FavoriteCount) ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).N0.getValue();
                    FavoriteDetails favoriteDetails = ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).f13426K0;
                    FavoriteDetails favoriteDetailsBuild = null;
                    if (favoriteDetails != null) {
                        BillsPayRequest billsPayRequest = (BillsPayRequest) com.paymaya.common.utility.A.f10366a.e(favoriteDetails.mTemplateJson(), BillsPayRequest.class);
                        kotlin.jvm.internal.j.d(billsPayRequest);
                        Amount amountMAmount = billsPayRequest.mAmount();
                        String currencyFormattedValue = amountMAmount != null ? amountMAmount.getCurrencyFormattedValue() : null;
                        Amount amountMAmount2 = billsPayRequestBuild.mAmount();
                        if (!kotlin.jvm.internal.j.b(currencyFormattedValue, amountMAmount2 != null ? amountMAmount2.getCurrencyFormattedValue() : null) || !kotlin.jvm.internal.j.b(billsPayRequest.mBiller(), billsPayRequestBuild.mBiller()) || !kotlin.jvm.internal.j.b(billsPayRequest.mOtherFields(), billsPayRequestBuild.mOtherFields())) {
                            favoriteDetailsBuild = favoriteDetails.toBuilder().mTemplateJson(billsPayRequestBuild.toJson()).build();
                        }
                    } else if (favoriteCount != null && favoriteCount.mUsed() < favoriteCount.mLimit()) {
                        favoriteDetailsBuild = FavoriteDetails.sBuilder().mType(numX49.tnTj78("buc2l")).mTemplateJson(billsPayRequestBuild.toJson()).build();
                    }
                    MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) ((ga.e) c10.c.get());
                    mayaPayBillsFormFragment.getClass();
                    ha.w wVar = mayaPayBillsFormFragment.f13419C0;
                    if (wVar != null) {
                        ((MayaPayBillsActivity) wVar).d2(billerInputBuild, billerTransactionBuild, favoriteDetailsBuild, (String) mayaPayBillsFormFragment.I0.getValue(), (String) mayaPayBillsFormFragment.f13425J0.getValue());
                    }
                    break;
                }
                break;
        }
    }
}
