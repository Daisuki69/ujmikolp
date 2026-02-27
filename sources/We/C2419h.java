package we;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.store.L0;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3Fragment;

/* JADX INFO: renamed from: we.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2419h implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShopV3Fragment f20759a;

    public C2419h(ShopV3Fragment shopV3Fragment) {
        this.f20759a = shopV3Fragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        ShopV3Fragment shopV3Fragment = this.f20759a;
        Callback.onPageSelected_enter(i);
        try {
            String name = ((ShopProviderCategory) ((L0) shopV3Fragment.C1().f8540g).b().get(i)).getName();
            shopV3Fragment.f10245B.d(shopV3Fragment.getActivity(), shopV3Fragment.f10248Q);
            shopV3Fragment.f10248Q.s(name);
            C1220i c1220i = shopV3Fragment.f10245B;
            C1219h c1219h = shopV3Fragment.f10248Q;
            c1220i.getClass();
            C1220i.f(c1219h);
            C1220i c1220i2 = shopV3Fragment.f10245B;
            FragmentActivity activity = shopV3Fragment.getActivity();
            C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
            c1219hD.n(17);
            c1219hD.u(name);
            c1220i2.c(activity, c1219hD);
        } finally {
            Callback.onPageSelected_exit();
        }
    }
}
