package U7;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import cj.C1132s;
import com.paymaya.mayaui.favorite.model.FavoriteCategory;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteCategoryFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5959b;

    public c(FragmentActivity fragmentActivity, MayaFavoriteFragment mayaFavoriteFragment) {
        super(fragmentActivity);
        List<FavoriteCategory> listG = C1132s.g(new FavoriteCategory("All", null), new FavoriteCategory("Bills", "billspay"), new FavoriteCategory("Bank Transfer", "bank"), new FavoriteCategory("Send Money", "moneysend"));
        this.f5958a = listG;
        this.f5959b = new ArrayList();
        for (FavoriteCategory favoriteCategory : listG) {
            ArrayList arrayList = this.f5959b;
            j.g(favoriteCategory, "favoriteCategory");
            Bundle bundle = new Bundle();
            bundle.putParcelable("favorite_category", favoriteCategory);
            MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment = new MayaFavoriteCategoryFragment();
            mayaFavoriteCategoryFragment.setArguments(bundle);
            arrayList.add(mayaFavoriteCategoryFragment);
        }
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment createFragment(int i) {
        return (Fragment) this.f5959b.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f5958a.size();
    }
}
