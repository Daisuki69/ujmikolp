package lc;

import B5.i;
import N5.t1;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelHomeFragment;
import dOYHB6.tiZVw8.numX49;
import gc.C1516a;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: lc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1825b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaTravelHomeFragment f18289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f18290b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f18291d;
    public final C1258f0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825b(t1 t1Var, MayaTravelHomeFragment mayaTravelHomeFragment) {
        super(t1Var.f4216b);
        j.g(mayaTravelHomeFragment, numX49.tnTj78("bF9P"));
        this.f18289a = mayaTravelHomeFragment;
        ConstraintLayout constraintLayout = t1Var.c;
        j.f(constraintLayout, numX49.tnTj78("bF9b"));
        this.f18290b = constraintLayout;
        this.c = t1Var.e;
        this.f18291d = t1Var.f4217d;
        this.e = new C1258f0(this, 9);
    }

    public static final void D(C1825b c1825b, OnlinePayment onlinePayment) {
        MayaTravelHomeFragment mayaTravelHomeFragment = c1825b.f18289a;
        mayaTravelHomeFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(EnumC1217f.MERCHANTS);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(numX49.tnTj78("bF92"), onlinePayment.mName());
        mayaTravelHomeFragment.A1(c1219h);
        C1516a c1516a = (C1516a) mayaTravelHomeFragment.G1();
        if (onlinePayment.isInternal()) {
            jc.b bVar = (jc.b) c1516a.c.get();
            String strMExternalLink = onlinePayment.mExternalLink();
            kc.b bVar2 = ((MayaTravelHomeFragment) bVar).f14199c0;
            if (bVar2 != null) {
                MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) bVar2;
                mayaTravelActivity.n1().k0(mayaTravelActivity, strMExternalLink);
                return;
            }
            return;
        }
        jc.b bVar3 = (jc.b) c1516a.c.get();
        String strMExternalLink2 = onlinePayment.mExternalLink();
        kc.b bVar4 = ((MayaTravelHomeFragment) bVar3).f14199c0;
        if (bVar4 != null) {
            MayaTravelActivity mayaTravelActivity2 = (MayaTravelActivity) bVar4;
            mayaTravelActivity2.n1();
            i.f(mayaTravelActivity2, strMExternalLink2);
        }
    }
}
