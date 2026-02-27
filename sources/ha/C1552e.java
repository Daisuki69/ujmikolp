package ha;

import androidx.recyclerview.widget.RecyclerView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ha.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1552e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaBillersFragment f16995a;

    public C1552e(MayaBillersFragment mayaBillersFragment) {
        this.f16995a = mayaBillersFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("bSHPX"));
        this.f16995a.f13380z0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("bSHPG"));
        MayaBillersFragment mayaBillersFragment = this.f16995a;
        ea.l lVar = mayaBillersFragment.u0;
        if (lVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bSHPv"));
            throw null;
        }
        int itemCount = lVar.getItemCount();
        if (mayaBillersFragment.f13380z0) {
            return;
        }
        SpringView springView = mayaBillersFragment.f13374p0;
        if (springView == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bSHPy"));
            throw null;
        }
        if (springView.j) {
            return;
        }
        DashboardLayoutManager dashboardLayoutManager = mayaBillersFragment.f13372A0;
        if (dashboardLayoutManager == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bSHP3"));
            throw null;
        }
        if (dashboardLayoutManager.findLastVisibleItemPosition() == itemCount - 1) {
            mayaBillersFragment.Q1().u();
        }
    }
}
