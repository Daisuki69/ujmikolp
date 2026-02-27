package ba;

import cj.C1110A;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A7.j f8568b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8569d;

    public /* synthetic */ G(A7.j jVar, String str, int i, int i4) {
        this.f8567a = i4;
        this.f8568b = jVar;
        this.c = str;
        this.f8569d = i;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8567a) {
            case 0:
                List list = (List) obj;
                kotlin.jvm.internal.j.g(list, numX49.tnTj78("bucZi"));
                A7.j jVar = this.f8568b;
                String str = this.c;
                int i = this.f8569d;
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bucZE"));
                jVar.H(i, list.size(), str);
                if (!list.isEmpty()) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(cj.t.l(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ea.c((Biller) it.next()));
                    }
                    MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) ((ga.g) jVar.c.get());
                    mayaPayBillsSearchFragment.getClass();
                    ea.h hVar = mayaPayBillsSearchFragment.f13480c0;
                    if (hVar == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucZF"));
                        throw null;
                    }
                    hVar.e(C1110A.L(arrayList, (Collection) hVar.e));
                    ((MayaPayBillsSearchFragment) ((ga.g) jVar.c.get())).f13487j0 = i;
                }
                ((MayaPayBillsSearchFragment) ((ga.g) jVar.c.get())).I1();
                return;
            default:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucZS"));
                A7.j jVar2 = this.f8568b;
                PayMayaError payMayaErrorF = jVar2.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, numX49.tnTj78("bucZj"));
                String str2 = this.c;
                int i4 = this.f8569d;
                kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bucZd"));
                jVar2.G(i4, payMayaErrorF, str2);
                ((MayaPayBillsSearchFragment) ((ga.g) jVar2.c.get())).I1();
                return;
        }
    }
}
