package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    private final LinearLayoutManager mLayoutManager;
    private ViewPager2.PageTransformer mPageTransformer;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    public ViewPager2.PageTransformer getPageTransformer() {
        return this.mPageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, int i4) {
        if (this.mPageTransformer == null) {
            return;
        }
        float f3 = -f;
        for (int i6 = 0; i6 < this.mLayoutManager.getChildCount(); i6++) {
            View childAt = this.mLayoutManager.getChildAt(i6);
            if (childAt == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException(a.h("LayoutManager returned a null child at pos ", i6, "/", this.mLayoutManager.getChildCount(), " while transforming pages"));
            }
            this.mPageTransformer.transformPage(childAt, (this.mLayoutManager.getPosition(childAt) - i) + f3);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
    }

    public void setPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        this.mPageTransformer = pageTransformer;
    }
}
