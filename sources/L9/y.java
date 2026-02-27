package L9;

import N5.C0466m;
import N5.G0;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import com.paymaya.domain.model.CreditTransaction;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f2936b;

    public /* synthetic */ y(B b8, int i) {
        this.f2935a = i;
        this.f2936b = b8;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f2935a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                B b8 = this.f2936b;
                PayMayaError payMayaErrorF = b8.f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (payMayaErrorF.mErrorCode() == -6 && payMayaErrorF.mStatusCode() == 404) {
                    b8.v();
                } else if (!payMayaErrorF.isSessionTimeout()) {
                    b8.z();
                }
                if (payMayaErrorF.mErrorCode() == -6 && payMayaErrorF.mStatusCode() == 404) {
                    return;
                }
                b8.q(payMayaErrorF, it);
                return;
            default:
                CreditTransaction creditTransaction = (CreditTransaction) obj;
                kotlin.jvm.internal.j.g(creditTransaction, "creditTransaction");
                B b10 = this.f2936b;
                b10.getClass();
                NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) b10.c.get());
                TextView textView = newMayaCreditFragment.f13258b1;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
                    throw null;
                }
                textView.setVisibility(8);
                G0 g02 = newMayaCreditFragment.g1;
                if (g02 == null) {
                    kotlin.jvm.internal.j.n("mViewLoadingActivityList");
                    throw null;
                }
                g02.f3627b.setVisibility(8);
                NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) ((P9.k) b10.c.get());
                TextView textView2 = newMayaCreditFragment2.f13258b1;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
                    throw null;
                }
                textView2.setVisibility(8);
                G0 g03 = newMayaCreditFragment2.f13263h1;
                if (g03 == null) {
                    kotlin.jvm.internal.j.n("mViewLoadingActivityListV2");
                    throw null;
                }
                g03.f3627b.setVisibility(8);
                NewMayaCreditFragment newMayaCreditFragment3 = (NewMayaCreditFragment) ((P9.k) b10.c.get());
                TextView textView3 = newMayaCreditFragment3.f13258b1;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
                    throw null;
                }
                textView3.setVisibility(8);
                Group group = newMayaCreditFragment3.f13262f1;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mGroupNoActivityList");
                    throw null;
                }
                group.setVisibility(8);
                NewMayaCreditFragment newMayaCreditFragment4 = (NewMayaCreditFragment) ((P9.k) b10.c.get());
                newMayaCreditFragment4.f13227A1 = new DashboardLayoutManager(newMayaCreditFragment4.getActivity(), 1, false);
                Context contextRequireContext = newMayaCreditFragment4.requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                newMayaCreditFragment4.f13286z1 = new O9.a(contextRequireContext, newMayaCreditFragment4, newMayaCreditFragment4.P1().f2857d.f11330b.getBoolean("key_is_show_credit_balance", true));
                RecyclerView recyclerView = newMayaCreditFragment4.f13261e1;
                if (recyclerView == null) {
                    kotlin.jvm.internal.j.n("mRecyclerViewActivityList");
                    throw null;
                }
                recyclerView.setLayoutManager(newMayaCreditFragment4.f13227A1);
                RecyclerView recyclerView2 = newMayaCreditFragment4.f13261e1;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.j.n("mRecyclerViewActivityList");
                    throw null;
                }
                ViewCompat.setNestedScrollingEnabled(recyclerView2, true);
                RecyclerView recyclerView3 = newMayaCreditFragment4.f13261e1;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.j.n("mRecyclerViewActivityList");
                    throw null;
                }
                recyclerView3.setAdapter(newMayaCreditFragment4.f13286z1);
                ArrayList arrayList = new ArrayList();
                if (creditTransaction.getItems().isEmpty()) {
                    NewMayaCreditFragment newMayaCreditFragment5 = (NewMayaCreditFragment) ((P9.k) b10.c.get());
                    C0466m c0466m = newMayaCreditFragment5.f13256Z0;
                    if (c0466m == null) {
                        kotlin.jvm.internal.j.n("mTransactionListCard");
                        throw null;
                    }
                    ((ConstraintLayout) c0466m.f4150b).setVisibility(0);
                    RecyclerView recyclerView4 = newMayaCreditFragment5.f13257a1;
                    if (recyclerView4 == null) {
                        kotlin.jvm.internal.j.n("mTransactionList");
                        throw null;
                    }
                    recyclerView4.setVisibility(8);
                    TextView textView4 = newMayaCreditFragment5.f13260d1;
                    if (textView4 == null) {
                        kotlin.jvm.internal.j.n("mTextViewNoTransactions");
                        throw null;
                    }
                    textView4.setVisibility(0);
                    TextView textView5 = ((NewMayaCreditFragment) ((P9.k) b10.c.get())).f13259c1;
                    if (textView5 == null) {
                        kotlin.jvm.internal.j.n("mTextViewSeeAll");
                        throw null;
                    }
                    textView5.setVisibility(8);
                } else if (creditTransaction.getTotalPages() > 1) {
                    ((NewMayaCreditFragment) ((P9.k) b10.c.get())).j2();
                    arrayList.addAll(C1110A.R(creditTransaction.getItems(), 5));
                    TextView textView6 = ((NewMayaCreditFragment) ((P9.k) b10.c.get())).f13259c1;
                    if (textView6 == null) {
                        kotlin.jvm.internal.j.n("mTextViewSeeAll");
                        throw null;
                    }
                    textView6.setVisibility(0);
                } else {
                    ((NewMayaCreditFragment) ((P9.k) b10.c.get())).j2();
                    arrayList.addAll(creditTransaction.getItems());
                    TextView textView7 = ((NewMayaCreditFragment) ((P9.k) b10.c.get())).f13259c1;
                    if (textView7 == null) {
                        kotlin.jvm.internal.j.n("mTextViewSeeAll");
                        throw null;
                    }
                    textView7.setVisibility(8);
                }
                NewMayaCreditFragment newMayaCreditFragment6 = (NewMayaCreditFragment) ((P9.k) b10.c.get());
                newMayaCreditFragment6.getClass();
                O9.a aVar = newMayaCreditFragment6.f13286z1;
                if (aVar != null) {
                    ArrayList arrayList2 = aVar.c;
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new ed.b(arrayList2, arrayList));
                    kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    diffResultCalculateDiff.dispatchUpdatesTo(aVar);
                }
                NewMayaCreditFragment newMayaCreditFragment7 = (NewMayaCreditFragment) ((P9.k) b10.c.get());
                TextView textView8 = newMayaCreditFragment7.f13258b1;
                if (textView8 == null) {
                    kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
                    throw null;
                }
                textView8.setVisibility(0);
                RecyclerView recyclerView5 = newMayaCreditFragment7.f13261e1;
                if (recyclerView5 != null) {
                    recyclerView5.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mRecyclerViewActivityList");
                    throw null;
                }
        }
    }
}
