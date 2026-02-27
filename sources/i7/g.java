package I7;

import N5.C0446d1;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaServicesV2Fragment f2236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdCarousel f2237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0446d1 c0446d1, MayaServicesV2Fragment serviceFeatureAdapterListener) {
        super(c0446d1.f4077b);
        kotlin.jvm.internal.j.g(serviceFeatureAdapterListener, "serviceFeatureAdapterListener");
        this.f2236a = serviceFeatureAdapterListener;
        this.f2237b = c0446d1.c;
    }
}
