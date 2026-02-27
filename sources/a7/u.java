package A7;

import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import java.util.ArrayList;
import java.util.List;
import v5.C2342a;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f240b;

    public /* synthetic */ u(A a8, int i) {
        this.f239a = i;
        this.f240b = a8;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f239a) {
            case 1:
                C2342a optionalResponse = (C2342a) obj;
                kotlin.jvm.internal.j.g(optionalResponse, "optionalResponse");
                this.f240b.f191r = (CreditResponse) optionalResponse.f20476a;
                return;
            default:
                List userActivityList = (List) obj;
                kotlin.jvm.internal.j.g(userActivityList, "userActivityList");
                A a8 = this.f240b;
                a8.getClass();
                ((MayaWalletFragment) ((F7.s) a8.c.get())).R1();
                ((MayaWalletFragment) ((F7.s) a8.c.get())).U1();
                ArrayList arrayList = new ArrayList();
                if (userActivityList.size() >= 6) {
                    arrayList.addAll(userActivityList.subList(0, 5));
                    TextView textView = ((MayaWalletFragment) ((F7.s) a8.c.get())).f12215C0;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mTextViewSeeAll");
                        throw null;
                    }
                    textView.setVisibility(0);
                } else {
                    arrayList.addAll(userActivityList);
                    ((MayaWalletFragment) ((F7.s) a8.c.get())).V1();
                }
                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) a8.c.get());
                mayaWalletFragment.getClass();
                D7.a aVar = mayaWalletFragment.f12246l1;
                if (aVar != null) {
                    ArrayList arrayList2 = aVar.f987b;
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new D7.e(arrayList, arrayList2));
                    kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    diffResultCalculateDiff.dispatchUpdatesTo(aVar);
                }
                MayaWalletFragment mayaWalletFragment2 = (MayaWalletFragment) ((F7.s) a8.c.get());
                TextView textView2 = mayaWalletFragment2.f12214B0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
                    throw null;
                }
                textView2.setVisibility(0);
                RecyclerView recyclerView = mayaWalletFragment2.f12216D0;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mRecyclerViewActivityList");
                    throw null;
                }
        }
    }
}
