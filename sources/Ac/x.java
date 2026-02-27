package ac;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageProductsListFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopProvider f7122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7123b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7124d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(FragmentManager fragmentManager, ShopProvider shopProvider, List list, String str, String str2) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.j.g(shopProvider, numX49.tnTj78("buOa"));
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("buOX"));
        this.f7122a = shopProvider;
        this.f7123b = list;
        this.c = str;
        this.f7124d = numX49.tnTj78("buOG");
        this.e = str2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f7123b.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public final Fragment getItem(int i) {
        int i4;
        int size;
        List list = this.f7123b;
        if (((ShopProviderSubcategory) list.get(i)).isNotEmpty()) {
            i4 = i + 1;
            size = list.size();
        } else {
            i4 = 0;
            size = 0;
        }
        ShopProviderSubcategory shopProviderSubcategory = (ShopProviderSubcategory) list.get(i);
        ShopProvider shopProvider = this.f7122a;
        kotlin.jvm.internal.j.g(shopProvider, numX49.tnTj78("buO3"));
        kotlin.jvm.internal.j.g(shopProviderSubcategory, numX49.tnTj78("buOy"));
        MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment = new MayaShopProviderPageProductsListFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("buOv"), shopProvider);
        bundle.putParcelable(numX49.tnTj78("buO7"), shopProviderSubcategory);
        bundle.putInt(numX49.tnTj78("buOA"), i4);
        bundle.putInt(numX49.tnTj78("buOY"), size);
        bundle.putString(numX49.tnTj78("buOT"), this.c);
        bundle.putString(numX49.tnTj78("buOR"), this.f7124d);
        bundle.putString(numX49.tnTj78("buOp"), this.e);
        mayaShopProviderPageProductsListFragment.setArguments(bundle);
        return mayaShopProviderPageProductsListFragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return ((ShopProviderSubcategory) this.f7123b.get(i)).getName();
    }
}
