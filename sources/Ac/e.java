package Ac;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.paymaya.R;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersPageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryPageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f258b;
    public final ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, FragmentManager fragmentManager, int i) {
        super(fragmentManager, 1);
        this.f257a = i;
        switch (i) {
            case 1:
                super(fragmentManager, 1);
                ArrayList arrayList = new ArrayList();
                this.f258b = arrayList;
                ArrayList arrayList2 = new ArrayList();
                this.c = arrayList2;
                String string = context.getString(R.string.pma_label_tab_title_shop_purchase_history_processing);
                String strTnTj78 = numX49.tnTj78("buT4");
                j.f(string, strTnTj78);
                arrayList.add(string);
                String string2 = context.getString(R.string.pma_label_tab_title_shop_purchase_history_completed);
                j.f(string2, strTnTj78);
                arrayList.add(string2);
                arrayList2.add(numX49.tnTj78("buTo"));
                arrayList2.add(numX49.tnTj78("buTK"));
                break;
            case 2:
                super(fragmentManager, 1);
                ArrayList arrayList3 = new ArrayList();
                this.f258b = arrayList3;
                ArrayList arrayList4 = new ArrayList();
                this.c = arrayList4;
                String string3 = context.getString(R.string.pma_label_tab_title_shop_purchase_history_processing);
                String strTnTj782 = numX49.tnTj78("buTe");
                j.f(string3, strTnTj782);
                arrayList3.add(string3);
                String string4 = context.getString(R.string.pma_label_tab_title_shop_purchase_history_completed);
                j.f(string4, strTnTj782);
                arrayList3.add(string4);
                arrayList4.add(numX49.tnTj78("buT8"));
                arrayList4.add(numX49.tnTj78("buTC"));
                break;
            default:
                j.d(fragmentManager);
                ArrayList arrayList5 = new ArrayList();
                this.f258b = arrayList5;
                ArrayList arrayList6 = new ArrayList();
                this.c = arrayList6;
                String string5 = context.getString(R.string.maya_label_tab_title_voucher_available);
                String strTnTj783 = numX49.tnTj78("buTO");
                j.f(string5, strTnTj783);
                arrayList5.add(string5);
                String string6 = context.getString(R.string.maya_label_tab_title_voucher_claimed);
                j.f(string6, strTnTj783);
                arrayList5.add(string6);
                String string7 = context.getString(R.string.maya_label_tab_title_voucher_expired);
                j.f(string7, strTnTj783);
                arrayList5.add(string7);
                arrayList6.add(numX49.tnTj78("buTQ"));
                arrayList6.add(numX49.tnTj78("buTt"));
                arrayList6.add(numX49.tnTj78("buTU"));
                break;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        switch (this.f257a) {
        }
        return this.f258b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final Fragment getItem(int i) {
        switch (this.f257a) {
            case 0:
                String str = (String) this.c.get(i);
                MayaVouchersPageFragment mayaVouchersPageFragment = new MayaVouchersPageFragment();
                Bundle bundle = new Bundle();
                bundle.putString(numX49.tnTj78("buTm"), str);
                mayaVouchersPageFragment.setArguments(bundle);
                return mayaVouchersPageFragment;
            case 1:
                String str2 = (String) this.c.get(i);
                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = new MayaShopPurchaseHistoryPageFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString(numX49.tnTj78("buTc"), str2);
                mayaShopPurchaseHistoryPageFragment.setArguments(bundle2);
                return mayaShopPurchaseHistoryPageFragment;
            default:
                String str3 = (String) this.c.get(i);
                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment = new ShopV3PurchaseHistoryPageFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putString(numX49.tnTj78("buTw"), str3);
                shopV3PurchaseHistoryPageFragment.setArguments(bundle3);
                return shopV3PurchaseHistoryPageFragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        switch (this.f257a) {
        }
        return (CharSequence) this.f258b.get(i);
    }
}
