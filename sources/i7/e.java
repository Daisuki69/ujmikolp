package I7;

import N5.r1;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.ServicesFeatureCategoryDetails;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;
import w.C2361c;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends RecyclerView.ViewHolder implements D7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaServicesV2Fragment f2229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2361c f2230b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CardView f2231d;
    public final RecyclerView e;
    public D7.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ServicesFeatureCategoryDetails f2232g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r1 r1Var, MayaServicesV2Fragment listener, com.paymaya.data.preference.a preference) {
        super((CardView) r1Var.c);
        kotlin.jvm.internal.j.g(listener, "listener");
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f2229a = listener;
        this.f2230b = new C2361c(this, preference);
        this.c = (TextView) r1Var.f4198b;
        CardView containerConstraintLayout = (CardView) r1Var.f4199d;
        kotlin.jvm.internal.j.f(containerConstraintLayout, "containerConstraintLayout");
        this.f2231d = containerConstraintLayout;
        this.e = (RecyclerView) r1Var.e;
        this.h = -1;
    }

    @Override // D7.b
    public final void M(SecondaryFeature secondaryFeature, int i) {
        ServicesFeatureCategoryDetails servicesFeatureCategoryDetails = this.f2232g;
        this.f2229a.H1(secondaryFeature, servicesFeatureCategoryDetails != null ? servicesFeatureCategoryDetails.getId() : null, i, this.h);
    }
}
