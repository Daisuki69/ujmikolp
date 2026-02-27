package dc;

import N5.B1;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.ProductV3;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f16330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f16331b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f16332d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Qd.a f16333g;
    public final MayaBaseLoadingFragment h;
    public int i;
    public ProductV3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(B1 b12, ac.p listener) {
        super(b12.f3555b);
        kotlin.jvm.internal.j.g(listener, "listener");
        ConstraintLayout productItemContainer = b12.i;
        kotlin.jvm.internal.j.f(productItemContainer, "productItemContainer");
        this.f16330a = b12.f3556d;
        this.f16331b = b12.e;
        this.c = b12.c;
        this.f16332d = b12.f;
        this.e = b12.f3557g;
        this.f = b12.h;
        this.i = -1;
        this.f16333g = new Qd.a(this, 10);
        this.h = (MayaBaseLoadingFragment) listener;
        productItemContainer.setOnClickListener(new Y6.o(this, 20));
    }

    public final void D(String str, int i, boolean z4, boolean z5) {
        AppCompatImageView appCompatImageView = this.f16330a;
        int dimensionPixelSize = z4 ? appCompatImageView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_padding_extra_small) : 0;
        int i4 = z5 ? R.drawable.maya_bg_icon_circle_border : 0;
        int dimensionPixelSize2 = appCompatImageView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_icon_size_length_large);
        appCompatImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        appCompatImageView.setBackgroundResource(i4);
        C.c0(str, i, appCompatImageView, dimensionPixelSize2, dimensionPixelSize2, 0);
    }
}
