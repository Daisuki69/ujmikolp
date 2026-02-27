package ba;

import cj.L;
import cj.M;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f8626b;
    public final /* synthetic */ String c;

    public /* synthetic */ w(C c, String str, int i) {
        this.f8625a = i;
        this.f8626b = c;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8625a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucLC"));
                PayMayaError payMayaErrorF = this.f8626b.f(th2, true);
                C c = this.f8626b;
                String str = this.c;
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                String strTnTj78 = numX49.tnTj78("bucL4");
                kotlin.jvm.internal.j.f(strMSpiel, strTnTj78);
                c.getClass();
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bucLo"));
                if (c.f8560d.e().isBillsPayEventsV2Enabled()) {
                    Biller biller = (Biller) ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13422F0.getValue();
                    ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).U1(strMSpiel, biller != null ? M.h(new Pair(EnumC1212a.CATEGORY_SLUG, biller.mCategorySlug()), new Pair(EnumC1212a.CATEGORY_NAME, biller.mCategory()), new Pair(EnumC1212a.BILLER_SLUG, biller.mSlug()), new Pair(EnumC1212a.BILLER_NAME, biller.mName())) : L.c(new Pair(EnumC1212a.BILLER_SLUG, str)), iMErrorCode);
                }
                if (!payMayaErrorF.isSessionTimeout()) {
                    if (!payMayaErrorF.isNetworkError()) {
                        ga.e eVar = (ga.e) c.c.get();
                        String strMSpiel2 = payMayaErrorF.mSpiel();
                        kotlin.jvm.internal.j.f(strMSpiel2, strTnTj78);
                        MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) eVar;
                        mayaPayBillsFormFragment.getClass();
                        MayaBaseLoadingFragment.N1(mayaPayBillsFormFragment, 200, strMSpiel2, null, new ha.q(mayaPayBillsFormFragment, 1), 28);
                    } else {
                        ga.e eVar2 = (ga.e) c.c.get();
                        String strMSpiel3 = payMayaErrorF.mSpiel();
                        kotlin.jvm.internal.j.f(strMSpiel3, strTnTj78);
                        MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) eVar2;
                        mayaPayBillsFormFragment2.getClass();
                        MayaBaseLoadingFragment.N1(mayaPayBillsFormFragment2, 100, strMSpiel3, null, new ha.q(mayaPayBillsFormFragment2, 3), 28);
                    }
                    break;
                }
                break;
            default:
                FavoriteDetails favoriteDetails = (FavoriteDetails) obj;
                kotlin.jvm.internal.j.g(favoriteDetails, numX49.tnTj78("bucL8"));
                C c10 = this.f8626b;
                String str2 = this.c;
                c10.getClass();
                ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).f13426K0 = favoriteDetails;
                c10.o(str2);
                break;
        }
    }
}
