package ha;

import Kh.T;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import com.paymaya.domain.store.C1273n;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import ea.C1434a;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsSearchFragment f16972a;

    public A(MayaPayBillsSearchFragment mayaPayBillsSearchFragment) {
        this.f16972a = mayaPayBillsSearchFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("bSHPZ"));
        this.f16972a.f13484g0 = i == 0;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("bSHPk"));
        ea.h hVar = this.f16972a.f13480c0;
        String strTnTj78 = numX49.tnTj78("bSHPB");
        if (hVar == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        int size = hVar.f16614d.size();
        MayaPayBillsSearchFragment mayaPayBillsSearchFragment = this.f16972a;
        if (mayaPayBillsSearchFragment.f13484g0) {
            return;
        }
        DashboardLayoutManager dashboardLayoutManager = mayaPayBillsSearchFragment.f13483f0;
        if (dashboardLayoutManager == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bSHPV"));
            throw null;
        }
        if (dashboardLayoutManager.findLastVisibleItemPosition() != size - 1 || i4 <= 4) {
            return;
        }
        A7.j jVarG1 = this.f16972a.G1();
        if (((com.paymaya.data.preference.a) jVarG1.f).e().isMayaBillsPayV3EndpointConfigEnabled() && !((MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get())).f13488k0) {
            ((MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get())).f13488k0 = true;
            ea.h hVar2 = ((MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get())).f13480c0;
            if (hVar2 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            ea.d dVar = (ea.d) C1110A.H(hVar2.f16614d);
            if (dVar == null || dVar.f16611a != -1) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) hVar2.f16614d);
                arrayList.add(C1434a.c);
                hVar2.f(arrayList);
            }
            int i6 = ((MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get())).f13487j0 + 1;
            String str = ((MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get())).f13486i0;
            kotlin.jvm.internal.j.g(str, numX49.tnTj78("bSHPu"));
            Ah.p pVarD = ((C1273n) jVarG1.e).d(i6, str);
            new Lh.d(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarD, pVarD, zh.b.a()), new ba.G(jVarG1, str, i6, 0), 2), new ba.G(jVarG1, str, i6, 1), 0), new ba.E(jVarG1, 0)), new Qd.a(jVarG1, 24), 1).e();
        }
    }
}
