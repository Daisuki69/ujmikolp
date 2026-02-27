package G9;

import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.MissionsCategory;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f1929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMissionsFragment f1930b;

    public g(List list, MayaMissionsFragment mayaMissionsFragment) {
        this.f1929a = list;
        this.f1930b = mayaMissionsFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        MayaMissionsFragment mayaMissionsFragment = this.f1930b;
        Callback.onPageSelected_enter(i);
        try {
            String lowerCase = ((MissionsCategory) this.f1929a.get(i)).getName().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
            C1219h c1219hD = C1219h.d(mayaMissionsFragment.u1());
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hD.j;
            map.put("category", lowerCase);
            c1219hD.r(EnumC1216e.CATEGORY);
            c1219hD.n(2);
            map.put("attribution", mayaMissionsFragment.n1().f10371a);
            c1219hD.i();
            mayaMissionsFragment.o1().c(mayaMissionsFragment.getActivity(), c1219hD);
        } finally {
            Callback.onPageSelected_exit();
        }
    }
}
