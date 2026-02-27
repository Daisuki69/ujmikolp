package Z;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment[] f6858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6859b;

    public u(FragmentManager fragmentManager, int i) {
        super(fragmentManager, 1);
        this.f6859b = new ArrayList();
        this.f6858a = new Fragment[i];
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f6858a.length;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final Fragment getItem(int i) {
        return this.f6858a[i];
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return (CharSequence) this.f6859b.get(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Object objInstantiateItem = super.instantiateItem(viewGroup, i);
        this.f6858a[i] = (Fragment) objInstantiateItem;
        return objInstantiateItem;
    }
}
