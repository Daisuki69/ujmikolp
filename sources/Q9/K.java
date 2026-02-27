package Q9;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class K implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditSummaryFragment f5309b;

    public /* synthetic */ K(NewMayaCreditSummaryFragment newMayaCreditSummaryFragment, int i) {
        this.f5308a = i;
        this.f5309b = newMayaCreditSummaryFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5308a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f5309b.f13306p0;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f5309b.f13306p0;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
        }
    }
}
