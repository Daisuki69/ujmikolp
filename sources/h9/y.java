package h9;

import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.mayaui.login.view.fragment.impl.MayaWizardFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaWizardFragment f16969a;

    public y(MayaWizardFragment mayaWizardFragment) {
        this.f16969a = mayaWizardFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        MayaWizardFragment mayaWizardFragment = this.f16969a;
        d9.a aVar = mayaWizardFragment.f12836b0;
        if (aVar == null) {
            kotlin.jvm.internal.j.n("mMayaWizardPagerItemAdapter");
            throw null;
        }
        int size = i % aVar.f16297a.size();
        int i4 = 0;
        for (Object obj : mayaWizardFragment.f12837c0) {
            int i6 = i4 + 1;
            if (i4 < 0) {
                C1132s.k();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            if (i4 == size) {
                imageView.setImageResource(R.drawable.maya_ic_pager_dots_indicator_selected);
            } else {
                imageView.setImageResource(R.drawable.maya_ic_pager_dots_indicator_default);
            }
            i4 = i6;
        }
    }
}
