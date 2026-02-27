package G7;

import androidx.recyclerview.widget.RecyclerView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaTransactionsFragment f1919a;

    public s(MayaTransactionsFragment mayaTransactionsFragment) {
        this.f1919a = mayaTransactionsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        this.f1919a.f12206v0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        DashboardLayoutManager dashboardLayoutManager;
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        MayaTransactionsFragment mayaTransactionsFragment = this.f1919a;
        D7.h hVar = mayaTransactionsFragment.t0;
        int itemCount = hVar != null ? hVar.getItemCount() : 0;
        if (mayaTransactionsFragment.f12206v0 || (dashboardLayoutManager = mayaTransactionsFragment.u0) == null || dashboardLayoutManager.findLastVisibleItemPosition() != itemCount - 1) {
            return;
        }
        SpringView springView = mayaTransactionsFragment.f12202p0;
        if (springView == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        if (springView.j) {
            return;
        }
        ((A7.o) mayaTransactionsFragment.P1()).l();
    }
}
