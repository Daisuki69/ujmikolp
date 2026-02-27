package ac;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import cj.C1132s;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ac.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0680d extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7096a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7097b;
    public final List c;

    public C0680d(FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        List listG = C1132s.g(numX49.tnTj78("buObw"), numX49.tnTj78("buObc"));
        this.f7097b = listG;
        String str = (String) listG.get(0);
        MayaAccountLimitsPageFragment mayaAccountLimitsPageFragment = new MayaAccountLimitsPageFragment();
        Bundle bundle = new Bundle();
        String strTnTj78 = numX49.tnTj78("buObm");
        bundle.putString(strTnTj78, str);
        mayaAccountLimitsPageFragment.setArguments(bundle);
        String str2 = (String) listG.get(1);
        MayaAccountLimitsPageFragment mayaAccountLimitsPageFragment2 = new MayaAccountLimitsPageFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(strTnTj78, str2);
        mayaAccountLimitsPageFragment2.setArguments(bundle2);
        this.c = C1132s.g(mayaAccountLimitsPageFragment, mayaAccountLimitsPageFragment2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        switch (this.f7096a) {
            case 0:
                return ((ArrayList) this.c).size();
            default:
                return ((List) this.f7097b).size();
        }
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public final Fragment getItem(int i) {
        switch (this.f7096a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                String strTnTj78 = numX49.tnTj78("buObh");
                if (i != 0) {
                    String strValueOf = String.valueOf(((ShopProviderCategory) arrayList.get(i)).getCode());
                    String name = ((ShopProviderCategory) arrayList.get(i)).getName();
                    MayaShopPageFragment mayaShopPageFragment = new MayaShopPageFragment();
                    Bundle bundleE = androidx.media3.datasource.cache.c.e(numX49.tnTj78("buObN"), strValueOf, strTnTj78, name);
                    bundleE.putString(numX49.tnTj78("buOb6"), (String) this.f7097b);
                    mayaShopPageFragment.setArguments(bundleE);
                    return mayaShopPageFragment;
                }
                String strValueOf2 = String.valueOf(((ShopProviderCategory) arrayList.get(i)).getCode());
                String name2 = ((ShopProviderCategory) arrayList.get(i)).getName();
                MayaShopHomePageFragment mayaShopHomePageFragment = new MayaShopHomePageFragment();
                Bundle bundle = new Bundle();
                bundle.putString(numX49.tnTj78("buObM"), strValueOf2);
                bundle.putString(strTnTj78, name2);
                mayaShopHomePageFragment.setArguments(bundle);
                return mayaShopHomePageFragment;
            default:
                return (Fragment) this.c.get(i);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        switch (this.f7096a) {
            case 0:
                return ((ShopProviderCategory) ((ArrayList) this.c).get(i)).getName();
            default:
                return (CharSequence) ((List) this.f7097b).get(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0680d(FragmentManager fragmentManager, List list, String str) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("buObD"));
        this.f7097b = str;
        this.c = new ArrayList(list);
    }
}
