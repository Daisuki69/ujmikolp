package M6;

import N5.F;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.widget.ItemSlideLayoutView;
import w.C2361c;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseFragment f3111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3112b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3113d;
    public final ImageView e;
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f3114g;
    public final ItemSlideLayoutView h;
    public final C2361c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(F f, J6.a listener) {
        super((ItemSlideLayoutView) f.c);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f3111a = (MayaBaseFragment) listener;
        this.f3112b = (ImageView) f.f3616g;
        this.c = (TextView) f.f;
        this.f3113d = (TextView) f.e;
        this.e = (ImageView) f.h;
        this.f = (ConstraintLayout) f.f3615d;
        this.f3114g = (ConstraintLayout) f.f3614b;
        ItemSlideLayoutView viewContainer = (ItemSlideLayoutView) f.i;
        kotlin.jvm.internal.j.f(viewContainer, "viewContainer");
        this.h = viewContainer;
        this.i = new C2361c(this, 26);
    }
}
