package xe;

import N5.C0450f;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.ui.common.view.widget.Carousel;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import o6.C1967a;

/* JADX INFO: renamed from: xe.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2473d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopV3HomePageFragment f20946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1967a f20947b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Carousel f20948d;

    public C2473d(C0450f c0450f, ShopV3HomePageFragment shopV3HomePageFragment) {
        super((ConstraintLayout) c0450f.c);
        this.f20946a = shopV3HomePageFragment;
        this.c = (TextView) c0450f.f4088d;
        this.f20948d = (Carousel) c0450f.f4087b;
        this.f20947b = new C1967a(this, 14);
    }
}
