package ba;

import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A7.j f8566b;
    public final /* synthetic */ String c;

    public /* synthetic */ F(A7.j jVar, String str, int i) {
        this.f8565a = i;
        this.f8566b = jVar;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8565a) {
            case 0:
                List list = (List) obj;
                kotlin.jvm.internal.j.g(list, numX49.tnTj78("bucbf"));
                A7.j jVar = this.f8566b;
                String str = this.c;
                jVar.getClass();
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bucb1"));
                jVar.H(1, list.size(), str);
                boolean zIsEmpty = list.isEmpty();
                String strTnTj78 = numX49.tnTj78("bucbn");
                String strTnTj782 = numX49.tnTj78("bucbx");
                String strTnTj783 = numX49.tnTj78("bucbs");
                String strTnTj784 = numX49.tnTj78("bucb5");
                if (zIsEmpty) {
                    MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) ((ga.g) jVar.c.get());
                    LottieAnimationView lottieAnimationView = mayaPayBillsSearchFragment.f13476Y;
                    if (lottieAnimationView == null) {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                    lottieAnimationView.setVisibility(8);
                    RecyclerView recyclerView = mayaPayBillsSearchFragment.f13475X;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n(strTnTj782);
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                    Group group = mayaPayBillsSearchFragment.f13477Z;
                    if (group == null) {
                        kotlin.jvm.internal.j.n(strTnTj783);
                        throw null;
                    }
                    group.setVisibility(0);
                    Group group2 = mayaPayBillsSearchFragment.f13478a0;
                    if (group2 != null) {
                        group2.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n(strTnTj784);
                        throw null;
                    }
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(cj.t.l(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ea.c((Biller) it.next()));
                }
                MayaPayBillsSearchFragment mayaPayBillsSearchFragment2 = (MayaPayBillsSearchFragment) ((ga.g) jVar.c.get());
                mayaPayBillsSearchFragment2.getClass();
                mayaPayBillsSearchFragment2.G1().Q(mayaPayBillsSearchFragment2.f13489l0);
                ea.h hVar = mayaPayBillsSearchFragment2.f13480c0;
                if (hVar == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucbJ"));
                    throw null;
                }
                hVar.e(arrayList);
                MayaPayBillsSearchFragment mayaPayBillsSearchFragment3 = (MayaPayBillsSearchFragment) ((ga.g) jVar.c.get());
                LottieAnimationView lottieAnimationView2 = mayaPayBillsSearchFragment3.f13476Y;
                if (lottieAnimationView2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                lottieAnimationView2.setVisibility(8);
                RecyclerView recyclerView2 = mayaPayBillsSearchFragment3.f13475X;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                recyclerView2.setVisibility(0);
                Group group3 = mayaPayBillsSearchFragment3.f13477Z;
                if (group3 == null) {
                    kotlin.jvm.internal.j.n(strTnTj783);
                    throw null;
                }
                group3.setVisibility(8);
                Group group4 = mayaPayBillsSearchFragment3.f13478a0;
                if (group4 != null) {
                    group4.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(strTnTj784);
                    throw null;
                }
            default:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucbA"));
                A7.j jVar2 = this.f8566b;
                PayMayaError payMayaErrorF = jVar2.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, numX49.tnTj78("bucbY"));
                String str2 = this.c;
                kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bucbT"));
                jVar2.G(1, payMayaErrorF, str2);
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                MayaPayBillsSearchFragment mayaPayBillsSearchFragment4 = (MayaPayBillsSearchFragment) ((ga.g) jVar2.c.get());
                LottieAnimationView lottieAnimationView3 = mayaPayBillsSearchFragment4.f13476Y;
                if (lottieAnimationView3 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucbg"));
                    throw null;
                }
                lottieAnimationView3.setVisibility(8);
                RecyclerView recyclerView3 = mayaPayBillsSearchFragment4.f13475X;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucb0"));
                    throw null;
                }
                recyclerView3.setVisibility(8);
                Group group5 = mayaPayBillsSearchFragment4.f13477Z;
                if (group5 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucbp"));
                    throw null;
                }
                group5.setVisibility(8);
                Group group6 = mayaPayBillsSearchFragment4.f13478a0;
                if (group6 != null) {
                    group6.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucbR"));
                    throw null;
                }
        }
    }
}
