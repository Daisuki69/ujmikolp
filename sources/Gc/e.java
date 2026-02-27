package Gc;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersCollectionFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaVouchersCollectionFragment f1961a;

    public e(MayaVouchersCollectionFragment mayaVouchersCollectionFragment) {
        this.f1961a = mayaVouchersCollectionFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        MayaVouchersCollectionFragment mayaVouchersCollectionFragment = this.f1961a;
        Callback.onPageSelected_enter(i);
        try {
            C1220i c1220iO1 = mayaVouchersCollectionFragment.o1();
            FragmentActivity activity = mayaVouchersCollectionFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaVouchersCollectionFragment.u1());
            c1219hD.n(17);
            Ac.e eVar = mayaVouchersCollectionFragment.f14310X;
            c1219hD.u(((Object) (eVar != null ? eVar.getPageTitle(i) : null)) + "TAB");
            c1220iO1.c(activity, c1219hD);
            Callback.onPageSelected_exit();
        } catch (Throwable th2) {
            Callback.onPageSelected_exit();
            throw th2;
        }
    }
}
