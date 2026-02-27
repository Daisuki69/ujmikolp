package we;

import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: renamed from: we.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2401F implements ViewPager.OnPageChangeListener {
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
