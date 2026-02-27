package G6;

import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.BankPullListItem;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC2509a implements F6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1295y0 f1779d;
    public Pair e;

    public c(com.paymaya.data.preference.a aVar, C1295y0 c1295y0, Uh.d dVar) {
        super(dVar);
        this.f1779d = c1295y0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        Intent intent2;
        super.j();
        FragmentActivity activity = ((MayaBankPullFragment) ((K6.c) this.c.get())).getActivity();
        if (10 == C.w((activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString())) {
            MayaBankPullFragment mayaBankPullFragment = (MayaBankPullFragment) ((K6.c) this.c.get());
            C1219h c1219hM1 = mayaBankPullFragment.m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("from_deep_link", "true");
            FragmentActivity activity2 = mayaBankPullFragment.getActivity();
            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                intent.setData(null);
            }
        }
        J6.b bVar = ((MayaBankPullFragment) ((K6.c) this.c.get())).f11632s0;
        if (bVar != null) {
            bVar.e(true);
        }
    }

    public final void k(Pair paymentOptions) {
        kotlin.jvm.internal.j.g(paymentOptions, "paymentOptions");
        ((MayaBankPullFragment) ((K6.c) this.c.get())).L1();
        ArrayList arrayListL = C1110A.L(C1110A.V((Iterable) paymentOptions.f18160a), cj.r.c(new BankPullListItem.BankPullHeader("Link a new account")));
        MayaBankPullFragment mayaBankPullFragment = (MayaBankPullFragment) ((K6.c) this.c.get());
        mayaBankPullFragment.getClass();
        J6.b bVar = mayaBankPullFragment.f11632s0;
        if (bVar != null) {
            bVar.f(arrayListL);
        }
        if (((Collection) paymentOptions.f18161b).isEmpty()) {
            TextView textView = ((MayaBankPullFragment) ((K6.c) this.c.get())).w0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewLinkedAccountHeaderV2");
                throw null;
            }
            textView.setVisibility(8);
            RecyclerView recyclerView = ((MayaBankPullFragment) ((K6.c) this.c.get())).f11634x0;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mRecyclerViewLinkedAccountsV2");
                throw null;
            }
        }
        J6.b bVar2 = ((MayaBankPullFragment) ((K6.c) this.c.get())).f11632s0;
        if (bVar2 != null) {
            bVar2.e(false);
        }
        TextView textView2 = ((MayaBankPullFragment) ((K6.c) this.c.get())).w0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewLinkedAccountHeaderV2");
            throw null;
        }
        textView2.setVisibility(0);
        RecyclerView recyclerView2 = ((MayaBankPullFragment) ((K6.c) this.c.get())).f11634x0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewLinkedAccountsV2");
            throw null;
        }
        recyclerView2.setVisibility(0);
        K6.c cVar = (K6.c) this.c.get();
        List linkedAccounts = (List) paymentOptions.f18161b;
        MayaBankPullFragment mayaBankPullFragment2 = (MayaBankPullFragment) cVar;
        mayaBankPullFragment2.getClass();
        kotlin.jvm.internal.j.g(linkedAccounts, "linkedAccounts");
        J6.b bVar3 = mayaBankPullFragment2.t0;
        if (bVar3 != null) {
            bVar3.f(linkedAccounts);
        }
    }
}
