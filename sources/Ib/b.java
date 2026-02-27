package Ib;

import Bb.n;
import Ke.d;
import N5.m1;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Favorite;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder implements Hb.b {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f2274b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f2275d;
    public final TextView e;
    public Favorite f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MayaSendMoneyFragment f2276g;
    public final Ae.a h;

    public b(m1 m1Var, MayaSendMoneyFragment mayaSendMoneyFragment) {
        super(m1Var.f4156b);
        this.f2273a = m1Var.e;
        this.f2274b = m1Var.f;
        this.c = m1Var.f4158g;
        this.f2275d = m1Var.f4157d;
        ConstraintLayout constraintLayoutItemContainer = m1Var.c;
        j.f(constraintLayoutItemContainer, "constraintLayoutItemContainer");
        this.e = m1Var.h;
        this.f2276g = mayaSendMoneyFragment;
        Ae.a aVar = new Ae.a(6);
        this.h = aVar;
        aVar.h(this);
        constraintLayoutItemContainer.setOnClickListener(new Ba.a(this, 17));
    }

    public static final void D(b bVar) {
        Ae.a aVar = bVar.h;
        if (bVar.f == null) {
            j.n("mFavorite");
            throw null;
        }
        aVar.getClass();
        b bVar2 = (b) ((Hb.b) aVar.c.get());
        Favorite favorite = bVar2.f;
        if (favorite == null) {
            j.n("mFavorite");
            throw null;
        }
        MayaSendMoneyFragment mayaSendMoneyFragment = bVar2.f2276g;
        mayaSendMoneyFragment.getClass();
        if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
            EnumC1217f enumC1217f = EnumC1217f.ACCEPT_CONFIRM_CREDENTIAL;
            mayaSendMoneyFragment.U1(d.a("FAVORITE"), "Send Money Form Screen");
        } else {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.FAVORITE);
            mayaSendMoneyFragment.A1(c1219hH);
        }
        ((n) mayaSendMoneyFragment.P1()).m(favorite);
    }
}
