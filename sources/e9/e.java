package E9;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.paymaya.domain.model.MissionsCategory;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxPageFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsCompletedFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsHomeFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsInProgressFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PageFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FragmentManager fragmentManager, List shopCategories, int i) {
        super(fragmentManager, 1);
        this.f1338a = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.g(shopCategories, "shopCategories");
                super(fragmentManager, 1);
                this.f1339b = new ArrayList(shopCategories);
                break;
            case 2:
                kotlin.jvm.internal.j.g(shopCategories, "mTags");
                super(fragmentManager, 1);
                this.f1339b = shopCategories;
                break;
            default:
                kotlin.jvm.internal.j.g(shopCategories, "missionsCategories");
                this.f1339b = new ArrayList(shopCategories);
                break;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        switch (this.f1338a) {
            case 0:
                return ((ArrayList) this.f1339b).size();
            case 1:
                return ((ArrayList) this.f1339b).size();
            default:
                return this.f1339b.size();
        }
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public final Fragment getItem(int i) {
        switch (this.f1338a) {
            case 0:
                return i != 0 ? i != 1 ? new MayaMissionsCompletedFragment() : new MayaMissionsInProgressFragment() : new MayaMissionsHomeFragment();
            case 1:
                ArrayList arrayList = (ArrayList) this.f1339b;
                if (i == 0) {
                    String strValueOf = String.valueOf(((ShopProviderCategory) arrayList.get(i)).getCode());
                    String name = ((ShopProviderCategory) arrayList.get(i)).getName();
                    ShopV3HomePageFragment shopV3HomePageFragment = new ShopV3HomePageFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("category_id", strValueOf);
                    bundle.putString("category_name", name);
                    shopV3HomePageFragment.setArguments(bundle);
                    return shopV3HomePageFragment;
                }
                String strValueOf2 = String.valueOf(((ShopProviderCategory) arrayList.get(i)).getCode());
                String name2 = ((ShopProviderCategory) arrayList.get(i)).getName();
                ShopV3PageFragment shopV3PageFragment = new ShopV3PageFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString("category_code", strValueOf2);
                bundle2.putString("category_name", name2);
                shopV3PageFragment.setArguments(bundle2);
                return shopV3PageFragment;
            default:
                String str = (String) this.f1339b.get(i);
                MayaInboxPageFragment mayaInboxPageFragment = new MayaInboxPageFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putString("inbox_tag", str);
                mayaInboxPageFragment.setArguments(bundle3);
                return mayaInboxPageFragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        switch (this.f1338a) {
            case 0:
                return ((MissionsCategory) ((ArrayList) this.f1339b).get(i)).getName();
            case 1:
                return ((ShopProviderCategory) ((ArrayList) this.f1339b).get(i)).getName();
            default:
                return (CharSequence) this.f1339b.get(i);
        }
    }
}
