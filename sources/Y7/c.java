package Y7;

import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.FavoriteLimits;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaFavoriteActivity;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC2509a implements X7.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6778d;
    public ArrayList e;
    public FavoriteLimits f;

    public c(com.paymaya.data.preference.a aVar) {
        this.f6778d = aVar;
    }

    public static FavoriteCount k(FavoriteCount favoriteCount) {
        FavoriteCount favoriteCountBuild = FavoriteCount.sBuilder().mUsed((favoriteCount != null ? favoriteCount.mUsed() : 0) - 1).mLimit(favoriteCount != null ? favoriteCount.mLimit() : 0).build();
        j.f(favoriteCountBuild, "build(...)");
        return favoriteCountBuild;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        if (this.f6778d.e().isFavoritesServiceAvailable()) {
            MayaFavoriteActivity mayaFavoriteActivity = (MayaFavoriteActivity) ((Z7.b) this.c.get());
            mayaFavoriteActivity.getClass();
            AbstractC1236z.g(mayaFavoriteActivity, R.id.frame_layout_container, new MayaFavoriteFragment());
        } else {
            String strMMessage = this.f6778d.e().mMaintenanceConfig().mServiceAvailabilityConfig().mFavoritesAvailability().mMessage();
            Z7.b bVar = (Z7.b) this.c.get();
            j.d(strMMessage);
            MayaFavoriteActivity mayaFavoriteActivity2 = (MayaFavoriteActivity) bVar;
            mayaFavoriteActivity2.getClass();
            AbstractC1236z.g(mayaFavoriteActivity2, R.id.frame_layout_container, M2.b.a0(strMMessage, 3));
        }
    }
}
