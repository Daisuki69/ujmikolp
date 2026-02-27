package dc;

import N5.C0446d1;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.domain.store.H0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f16320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0446d1 c0446d1, Context mContext, LifecycleOwner lifecycleOwner, FragmentActivity activity, MayaShopHomePageFragment viewModelStoreOwner) {
        super(c0446d1.f4077b);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        kotlin.jvm.internal.j.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.j.g(activity, "activity");
        kotlin.jvm.internal.j.g(viewModelStoreOwner, "viewModelStoreOwner");
        this.f16320a = lifecycleOwner;
        BannerAdCarousel bannerAdCarousel = c0446d1.c;
        bannerAdCarousel.c();
        f5.f fVar = new f5.f(bannerAdCarousel);
        fVar.f16717b = s5.d.f;
        fVar.c = lifecycleOwner;
        fVar.f16718d = activity;
        fVar.e = viewModelStoreOwner;
        fVar.f16720k = new H0(1);
        fVar.f16721l = new Sb.i(4);
        fVar.j = new H0(2);
        fVar.a();
    }
}
