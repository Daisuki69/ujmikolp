package Z;

import android.content.Context;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView[] f6797b;

    public a(Context context, ImageView[] imageViewArr) {
        this.f6796a = context;
        this.f6797b = imageViewArr;
        imageViewArr[0].setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_selected_dot, null));
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        ImageView[] imageViewArr = this.f6797b;
        Callback.onPageSelected_enter(i);
        try {
            int length = imageViewArr.length;
            int i4 = 0;
            while (true) {
                Context context = this.f6796a;
                if (i4 >= length) {
                    imageViewArr[i].setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_selected_dot, null));
                    Callback.onPageSelected_exit();
                    return;
                } else {
                    imageViewArr[i4].setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_unselected_dot, null));
                    i4++;
                }
            }
        } catch (Throwable th2) {
            Callback.onPageSelected_exit();
            throw th2;
        }
    }
}
