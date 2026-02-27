package ba;

import L9.C0323a;
import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.data.database.repository.C1243g;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1273n;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import dOYHB6.tiZVw8.numX49;
import ga.InterfaceC1514a;
import ha.InterfaceC1549b;
import ha.ViewOnClickListenerC1548a;

/* JADX INFO: renamed from: ba.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0933d implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f8577b;

    public /* synthetic */ C0933d(C0323a c0323a, int i) {
        this.f8576a = i;
        this.f8577b = c0323a;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8576a) {
            case 0:
                FavoriteCount favoriteCount = (FavoriteCount) obj;
                kotlin.jvm.internal.j.g(favoriteCount, numX49.tnTj78("bucZk"));
                C0323a c0323a = this.f8577b;
                c0323a.getClass();
                MayaBillersCategoryFragment mayaBillersCategoryFragment = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get());
                mayaBillersCategoryFragment.getClass();
                InterfaceC1549b interfaceC1549b = mayaBillersCategoryFragment.f13360K0;
                if (interfaceC1549b != null) {
                    ((MayaPayBillsActivity) interfaceC1549b).f13341t = favoriteCount;
                }
                InterfaceC1514a interfaceC1514a = (InterfaceC1514a) c0323a.c.get();
                int iMUsed = favoriteCount.mUsed();
                int iMLimit = favoriteCount.mLimit();
                MayaBillersCategoryFragment mayaBillersCategoryFragment2 = (MayaBillersCategoryFragment) interfaceC1514a;
                TextView textView = mayaBillersCategoryFragment2.f13368s0;
                if (textView != null) {
                    textView.setText(mayaBillersCategoryFragment2.getString(R.string.maya_pay_bill_format_my_favorites, Integer.valueOf(iMUsed), Integer.valueOf(iMLimit)));
                    return;
                } else {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucZB"));
                    throw null;
                }
            default:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucZb"));
                PayMayaError payMayaErrorF = this.f8577b.f(th2, true);
                C0323a c0323a2 = this.f8577b;
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, numX49.tnTj78("bucZ2"));
                c0323a2.u(iMErrorCode, strMSpiel, numX49.tnTj78("bucZL"));
                if (payMayaErrorF.isSessionTimeout() || !C1243g.a(((C1273n) c0323a2.e).f11464d.f11309a.f2811a.query(String.format(numX49.tnTj78("bucZZ"), numX49.tnTj78("bucZr")))).isEmpty()) {
                    return;
                }
                if (payMayaErrorF.isNetworkError()) {
                    InterfaceC1514a interfaceC1514a2 = (InterfaceC1514a) c0323a2.c.get();
                    String strMSpiel2 = payMayaErrorF.mSpiel();
                    MayaBillersCategoryFragment mayaBillersCategoryFragment3 = (MayaBillersCategoryFragment) interfaceC1514a2;
                    mayaBillersCategoryFragment3.getClass();
                    MayaBaseLoadingFragment.N1(mayaBillersCategoryFragment3, 100, strMSpiel2, null, new ViewOnClickListenerC1548a(mayaBillersCategoryFragment3, 6), 28);
                    return;
                }
                InterfaceC1514a interfaceC1514a3 = (InterfaceC1514a) c0323a2.c.get();
                String strMSpiel3 = payMayaErrorF.mSpiel();
                MayaBillersCategoryFragment mayaBillersCategoryFragment4 = (MayaBillersCategoryFragment) interfaceC1514a3;
                mayaBillersCategoryFragment4.getClass();
                MayaBaseLoadingFragment.N1(mayaBillersCategoryFragment4, 200, strMSpiel3, null, new ViewOnClickListenerC1548a(mayaBillersCategoryFragment4, 5), 28);
                return;
        }
    }
}
