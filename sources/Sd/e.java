package sd;

import Bd.j;
import G5.l;
import cj.t;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.store.N;
import com.paymaya.domain.store.U;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import rd.InterfaceC2200a;
import td.InterfaceC2283a;
import zj.C2576A;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends AbstractC2252a implements InterfaceC2200a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f20041d;
    public final U e;

    public e(N n7, U u3) {
        this.f20041d = n7;
        this.e = u3;
    }

    @Override // rd.InterfaceC2200a
    public final void a() {
        boolean zR1;
        String strTnTj78;
        if (((AbstractBaseEDDFormFragmentImpl) ((yd.f) this.c.get())).f14506T == -1) {
            ((AbstractBaseEDDFormFragmentImpl) ((yd.f) this.c.get())).y1();
            zR1 = false;
        } else {
            zR1 = ((AbstractBaseEDDFormFragmentImpl) ((yd.f) this.c.get())).f14506T == 1 ? true : ((AbstractBaseEDDFormFragmentImpl) ((yd.f) this.c.get())).r1();
        }
        if (zR1) {
            yd.f fVar = (yd.f) this.c.get();
            ArrayList arrayList = ((EDDFinancialDocumentsFragment) ((yd.f) this.c.get())).f14508V;
            ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                strTnTj78 = numX49.tnTj78("bFGw");
                if (!zHasNext) {
                    break;
                }
                j jVar = (j) it.next();
                kotlin.jvm.internal.j.e(jVar, strTnTj78);
                arrayList2.add(((EDDInputFinancialDocument) jVar).getEDDFinancialDocument());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!C2576A.H(((EDDFinancialDocument) obj).getType())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                String fileUrl = ((EDDFinancialDocument) obj2).getFileUrl();
                if (fileUrl != null && !C2576A.H(fileUrl)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(arrayList4);
            EDDFinancialDocumentsFragment eDDFinancialDocumentsFragment = (EDDFinancialDocumentsFragment) fVar;
            eDDFinancialDocumentsFragment.getClass();
            for (j jVar2 : eDDFinancialDocumentsFragment.f14508V) {
                kotlin.jvm.internal.j.e(jVar2, strTnTj78);
                l.a(((EDDInputFinancialDocument) jVar2).getMTextInputLayout());
            }
            zd.l lVar = eDDFinancialDocumentsFragment.f14534Z;
            if (lVar != null) {
                C2254c c2254cT1 = ((EDDActivity) lVar).t1();
                if (arrayList5.isEmpty()) {
                    EDD edd = c2254cT1.i;
                    if (edd != null) {
                        edd.setFinancialDocuments(null);
                    }
                } else {
                    EDD edd2 = c2254cT1.i;
                    if (edd2 != null) {
                        edd2.setFinancialDocuments(arrayList5);
                    }
                }
                ((EDDActivity) ((InterfaceC2283a) c2254cT1.c.get())).w1();
            }
        }
    }
}
