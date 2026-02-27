package cc;

import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements ViewPager.OnPageChangeListener {
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        Callback.onPageSelected_enter(i);
        try {
        } finally {
            Callback.onPageSelected_exit();
        }
    }
}
