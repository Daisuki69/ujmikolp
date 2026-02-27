package dc;

import N5.X0;
import Q6.s;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment;

/* JADX INFO: renamed from: dc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1350a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f16303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f16304b;
    public final s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350a(X0 x02, MayaShopPurchaseHistoryPageFragment listener) {
        super(x02.f4030b);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f16303a = x02.f4031d;
        this.f16304b = x02.c;
        this.c = new s(this, 8);
    }
}
