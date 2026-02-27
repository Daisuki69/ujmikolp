package Q9;

import androidx.recyclerview.widget.RecyclerView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;

/* JADX INFO: renamed from: Q9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0576f extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaCreditTransactionListFragment f5320a;

    public C0576f(MayaCreditTransactionListFragment mayaCreditTransactionListFragment) {
        this.f5320a = mayaCreditTransactionListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        this.f5320a.f13117v0 = i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        DashboardLayoutManager dashboardLayoutManager;
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        MayaCreditTransactionListFragment mayaCreditTransactionListFragment = this.f5320a;
        O9.b bVar = mayaCreditTransactionListFragment.t0;
        int itemCount = bVar != null ? bVar.getItemCount() : 0;
        if (mayaCreditTransactionListFragment.f13117v0 || (dashboardLayoutManager = mayaCreditTransactionListFragment.u0) == null || dashboardLayoutManager.findLastVisibleItemPosition() != itemCount - 1) {
            return;
        }
        SpringView springView = mayaCreditTransactionListFragment.f13113p0;
        if (springView == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        if (springView.j) {
            return;
        }
        mayaCreditTransactionListFragment.P1().l();
    }
}
