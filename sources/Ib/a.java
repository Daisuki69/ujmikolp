package Ib;

import N5.i1;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.Decoration;
import kotlin.jvm.internal.j;
import yb.InterfaceC2517a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder implements Hb.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2269g = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f2270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaBaseFragment f2271b;
    public Decoration c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ae.a f2272d;
    public final ImageView e;
    public final View f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public a(i1 i1Var, InterfaceC2517a listener) {
        j.g(listener, "listener");
        CardView cardView = i1Var.f4120b;
        super(cardView);
        this.f2270a = i1Var;
        this.f2271b = (MayaBaseFragment) listener;
        Ae.a aVar = new Ae.a(5);
        this.f2272d = aVar;
        aVar.h(this);
        this.e = i1Var.f4121d;
        this.f = i1Var.c;
        cardView.setOnClickListener(new Ba.a(this, 16));
    }
}
