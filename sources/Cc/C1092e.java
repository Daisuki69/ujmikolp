package cc;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.store.L0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: cc.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1092e implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaShopFragment f9339a;

    public C1092e(MayaShopFragment mayaShopFragment) {
        this.f9339a = mayaShopFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        MayaShopFragment mayaShopFragment = this.f9339a;
        Callback.onPageSelected_enter(i);
        try {
            String name = ((ShopProviderCategory) ((L0) mayaShopFragment.R1().e).b().get(i)).getName();
            mayaShopFragment.o1().d(mayaShopFragment.getActivity(), mayaShopFragment.m1());
            mayaShopFragment.m1().s(name);
            mayaShopFragment.o1();
            mayaShopFragment.m1().f11205g = System.nanoTime();
            boolean zIsShopEventsV2Enabled = mayaShopFragment.t1().e().isShopEventsV2Enabled();
            String strTnTj78 = numX49.tnTj78("btQD");
            if (zIsShopEventsV2Enabled) {
                C1219h c1219hE = C1219h.e(AbstractC1213b.q(4));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                String str = mayaShopFragment.f14003v0;
                if (str != null) {
                    c1219hE.j.put("source_tab", str);
                }
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                if (name != null) {
                    c1219hE.j.put(strTnTj78, name);
                }
                mayaShopFragment.o1().b(c1219hE);
                mayaShopFragment.f14003v0 = name;
            } else {
                C1220i c1220iO1 = mayaShopFragment.o1();
                FragmentActivity activity = mayaShopFragment.getActivity();
                C1219h c1219hD = C1219h.d(mayaShopFragment.u1());
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.CATEGORY);
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                String strReplace = name.toLowerCase(Locale.getDefault()).replace(Global.BLANK, Global.UNDERSCORE);
                HashMap map = c1219hD.j;
                map.put(strTnTj78, strReplace);
                map.put("position", String.valueOf(i));
                c1220iO1.c(activity, c1219hD);
            }
            Callback.onPageSelected_exit();
        } catch (Throwable th2) {
            Callback.onPageSelected_exit();
            throw th2;
        }
    }
}
