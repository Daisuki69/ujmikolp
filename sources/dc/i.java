package dc;

import N5.A1;
import N5.r1;
import Q6.s;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaShopHomePageFragment f16323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16324b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CardView f16325d;
    public final MayaCarousel e;
    public boolean f;

    public i(r1 r1Var, MayaShopHomePageFragment mayaShopHomePageFragment) {
        super((ConstraintLayout) r1Var.c);
        this.f16323a = mayaShopHomePageFragment;
        this.c = (TextView) r1Var.f4198b;
        this.f16325d = ((A1) r1Var.e).f3548b;
        this.e = (MayaCarousel) r1Var.f4199d;
        this.f16324b = new s(this, 10);
    }
}
