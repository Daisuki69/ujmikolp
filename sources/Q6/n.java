package Q6;

import Bj.C0151l;
import We.InterfaceC0604h;
import a7.InterfaceC0658s;
import b3.C0874N;
import bj.AbstractC1039j;
import bj.C1037h;
import cc.w;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.tasks.OnFailureListener;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import d3.InterfaceC1330b;
import dc.C1352c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Ch.c, OnFailureListener, t4.j, Ui.k, InterfaceC0658s, InterfaceC1330b, Ch.f, InterfaceC0604h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5284b;

    public /* synthetic */ n(Object obj, int i) {
        this.f5283a = i;
        this.f5284b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ce  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.paymaya.domain.model.FavoriteDetails] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity] */
    @Override // Ch.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.n.accept(java.lang.Object):void");
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        BillerTransaction it = (BillerTransaction) obj;
        kotlin.jvm.internal.j.g(it, "it");
        ba.o oVar = (ba.o) this.f5284b;
        oVar.getClass();
        return new Lh.f(new Lh.h(oVar.e.c(it.getBillerSlug()), zh.b.a(), 0), new s(it, 24), 0);
    }

    @Override // Ui.k
    public boolean c(Object obj, HashMap map, U8.c cVar) {
        Wi.a aVarA;
        Wi.a aVar = (Wi.a) this.f5284b;
        if (aVar == null || !(obj instanceof String) || (aVarA = Wi.a.a((String) obj)) == null) {
            return false;
        }
        boolean z4 = aVarA.b(aVar) <= 0;
        Ri.a.d(aVarA.f6451g + " <= " + aVar.f6451g + " | Result: " + z4);
        return z4;
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        U1.g firebaseApp = (U1.g) ((d3.d) this.f5284b).get();
        kotlin.jvm.internal.j.g(firebaseApp, "firebaseApp");
        C0874N c0874n = C0874N.f8398a;
        return C0874N.a(firebaseApp);
    }

    @Override // t4.j
    public void i() {
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception exc) {
        w wVar = (w) this.f5284b;
        wVar.f9360g.setVisibility(0);
        wVar.e.setVisibility(8);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        kotlin.jvm.internal.j.g(exception, "exception");
        C1037h.a aVar = C1037h.f9166b;
        ((C0151l) this.f5284b).resumeWith(AbstractC1039j.a(exception));
    }

    @Override // t4.j
    public void onRefresh() {
        int i = 13;
        int i4 = 0;
        A7.j jVarG1 = ((MayaAccountRecoveryFragment) this.f5284b).G1();
        SpringView springView = ((MayaAccountRecoveryFragment) ((Rb.b) jVarG1.c.get())).f13916V;
        if (springView == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.c();
        jVarG1.e(new Lh.d(new Lh.d(new Lh.h(((C1293x0) jVarG1.e).g(), zh.b.a(), i4), new Gc.h(jVarG1, i), 2), new G6.w(jVarG1, i), i4).e());
        LottieAnimationView lottieAnimationView = ((MayaAccountRecoveryFragment) this.f5284b).f13922b0;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        } else {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        w wVar = (w) this.f5284b;
        wVar.f9360g.setVisibility(8);
        wVar.e.setVisibility(0);
    }

    public n(C1352c mIRecipientViewHolder) {
        this.f5283a = 9;
        kotlin.jvm.internal.j.g(mIRecipientViewHolder, "mIRecipientViewHolder");
        this.f5284b = mIRecipientViewHolder;
    }

    public n(com.paymaya.data.preference.a mPreference, dc.p pVar) {
        this.f5283a = 14;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f5284b = pVar;
    }

    public n(String str) {
        this.f5283a = 7;
        this.f5284b = Wi.a.a(str);
    }
}
