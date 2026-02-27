package Gc;

import A5.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersPageFragment;
import w.C2360b;
import w.C2361c;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaVouchersPageFragment f1966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f1967b;

    public i(MayaVouchersPageFragment mayaVouchersPageFragment, LinearLayoutManager linearLayoutManager) {
        this.f1966a = mayaVouchersPageFragment;
        this.f1967b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        this.f1966a.f14312B0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        if (this.f1966a.f14312B0) {
            return;
        }
        int iFindLastVisibleItemPosition = this.f1967b.findLastVisibleItemPosition();
        Ac.c cVar = this.f1966a.f14320z0;
        if (cVar == null) {
            kotlin.jvm.internal.j.n("mVoucherItemAdapter");
            throw null;
        }
        if (iFindLastVisibleItemPosition == cVar.getItemCount() - 1) {
            Dc.d dVar = (Dc.d) this.f1966a.P1();
            if (dVar.f1121g) {
                return;
            }
            Ac.c cVar2 = ((MayaVouchersPageFragment) ((Fc.d) dVar.c.get())).f14320z0;
            if (cVar2 == null) {
                kotlin.jvm.internal.j.n("mVoucherItemAdapter");
                throw null;
            }
            if (!cVar2.f254d) {
                cVar2.g(true);
            }
            dVar.f1121g = true;
            new Lh.d(new Lh.d(new Lh.d(new Lh.h(dVar.f1120d.b(dVar.h + 1, dVar.f), zh.b.a(), 0), new l(dVar, 15), 2), new C2360b(dVar, 17), 0), new C2361c(dVar, 17), 1).e();
        }
    }
}
