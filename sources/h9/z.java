package h9;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.login.view.fragment.impl.MayaWizardFragment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaWizardFragment f16970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f16971b;

    public z(MayaWizardFragment mayaWizardFragment, kotlin.jvm.internal.w wVar) {
        this.f16970a = mayaWizardFragment;
        this.f16971b = wVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        MayaWizardFragment mayaWizardFragment = this.f16970a;
        d9.a aVar = mayaWizardFragment.f12836b0;
        if (aVar == null) {
            kotlin.jvm.internal.j.n("mMayaWizardPagerItemAdapter");
            throw null;
        }
        int size = i % aVar.f16297a.size();
        kotlin.jvm.internal.w wVar = this.f16971b;
        String string = mayaWizardFragment.getString(((i9.a) mayaWizardFragment.G1().get(wVar.f18193a)).f17126b);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        mayaWizardFragment.f12835a0 = string;
        String string2 = mayaWizardFragment.getString(((i9.a) mayaWizardFragment.G1().get(size)).f17126b);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        C1220i c1220iO1 = mayaWizardFragment.o1();
        FragmentActivity activity = mayaWizardFragment.getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(1));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("user_action", "Swipe");
        map.put("source_page", mayaWizardFragment.f12835a0);
        map.put("destination_page", string2);
        map.put("version", "v1_Oct2024");
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
        wVar.f18193a = size;
    }
}
