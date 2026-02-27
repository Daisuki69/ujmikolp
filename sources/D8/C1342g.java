package d8;

import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteCategoryFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteFragment;
import java.util.ArrayList;

/* JADX INFO: renamed from: d8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1342g implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaFavoriteFragment f16294a;

    public C1342g(MayaFavoriteFragment mayaFavoriteFragment) {
        this.f16294a = mayaFavoriteFragment;
    }

    public final MayaFavoriteCategoryFragment a(TabLayout.Tab tab) {
        ArrayList arrayList;
        if (tab != null) {
            U7.c cVar = this.f16294a.f12349s0;
            Fragment fragment = (cVar == null || (arrayList = cVar.f5959b) == null) ? null : (Fragment) arrayList.get(tab.getPosition());
            if (fragment instanceof MayaFavoriteCategoryFragment) {
                return (MayaFavoriteCategoryFragment) fragment;
            }
        }
        return null;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        MayaFavoriteCategoryFragment mayaFavoriteCategoryFragmentA = a(tab);
        if (mayaFavoriteCategoryFragmentA != null) {
            mayaFavoriteCategoryFragmentA.f10338R = true;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        MayaFavoriteCategoryFragment mayaFavoriteCategoryFragmentA = a(tab);
        if (mayaFavoriteCategoryFragmentA != null) {
            mayaFavoriteCategoryFragmentA.y1();
            mayaFavoriteCategoryFragmentA.f10338R = false;
        }
    }
}
