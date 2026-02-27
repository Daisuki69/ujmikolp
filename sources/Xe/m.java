package xe;

import N5.G1;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.domain.model.ProductV3;
import ph.C2070f1;
import ue.y;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f20979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f20980b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f20981d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2070f1 f20982g;
    public final BaseLoadingFragment h;
    public ProductV3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(G1 g1, y listener) {
        super(g1.f3629b);
        kotlin.jvm.internal.j.g(listener, "listener");
        ConstraintLayout layoutContainerPmaViewShopSearchItem = g1.c;
        kotlin.jvm.internal.j.f(layoutContainerPmaViewShopSearchItem, "layoutContainerPmaViewShopSearchItem");
        this.f20979a = g1.e;
        this.f20980b = g1.f;
        this.c = g1.f3630d;
        this.f20981d = g1.f3631g;
        this.e = g1.h;
        this.f = g1.i;
        this.f20982g = new C2070f1(this, 14);
        this.h = (BaseLoadingFragment) listener;
        layoutContainerPmaViewShopSearchItem.setOnClickListener(new qf.d(this, 23));
    }
}
