package dc;

import N5.B1;
import Q6.r;
import ac.InterfaceC0675D;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.ProductV3;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f16354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f16355b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f16356d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f16357g;
    public final MayaBaseFragment h;
    public int i;
    public ProductV3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(B1 b12, InterfaceC0675D listener) {
        super(b12.f3555b);
        kotlin.jvm.internal.j.g(listener, "listener");
        ConstraintLayout productSearchItemContainer = b12.i;
        kotlin.jvm.internal.j.f(productSearchItemContainer, "productSearchItemContainer");
        this.f16354a = b12.f3556d;
        this.f16355b = b12.e;
        this.c = b12.c;
        this.f16356d = b12.f;
        this.e = b12.f3557g;
        this.f = b12.h;
        this.i = -1;
        this.f16357g = new r(this, 15);
        this.h = (MayaBaseFragment) listener;
        productSearchItemContainer.setOnClickListener(new Y6.o(this, 24));
    }

    public final void D(String str, int i, boolean z4, boolean z5) {
        AppCompatImageView appCompatImageView = this.f16354a;
        int dimensionPixelSize = z4 ? appCompatImageView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_padding_extra_small) : 0;
        int i4 = z5 ? R.drawable.maya_bg_icon_circle_border : 0;
        int dimensionPixelSize2 = appCompatImageView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_icon_size_length_large);
        appCompatImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        appCompatImageView.setBackgroundResource(i4);
        C.c0(str, i, appCompatImageView, dimensionPixelSize2, dimensionPixelSize2, 0);
    }
}
