package N5;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class H0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f3643b;
    public final ViewPager c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TabLayout f3644d;

    public /* synthetic */ H0(LinearLayout linearLayout, ViewPager viewPager, TabLayout tabLayout, int i) {
        this.f3642a = i;
        this.f3643b = linearLayout;
        this.c = viewPager;
        this.f3644d = tabLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3642a) {
        }
        return this.f3643b;
    }

    public H0(LinearLayout linearLayout, TabLayout tabLayout, ViewPager viewPager) {
        this.f3642a = 2;
        this.f3643b = linearLayout;
        this.f3644d = tabLayout;
        this.c = viewPager;
    }
}
