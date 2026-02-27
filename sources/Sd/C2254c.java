package sd;

import Ah.p;
import Kh.I;
import android.widget.FrameLayout;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.store.C1252c0;
import com.paymaya.domain.store.C1254d0;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.N;
import com.paymaya.domain.store.T;
import com.paymaya.domain.store.U;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationStatusFragment;
import com.paymaya.ui.travel.view.widget.StepProgressBar;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import kotlin.jvm.internal.j;
import retrofit2.Response;
import td.InterfaceC2283a;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: sd.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2254c extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f20038d;
    public final C1254d0 e;
    public final C1269l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U f20039g;
    public final com.paymaya.data.preference.a h;
    public EDD i;

    public C2254c(N n7, C1254d0 c1254d0, C1269l c1269l, U u3, com.paymaya.data.preference.a aVar) {
        j.g(aVar, numX49.tnTj78("bFGW"));
        this.f20038d = n7;
        this.e = c1254d0;
        this.f = c1269l;
        this.f20039g = u3;
        this.h = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        com.paymaya.data.preference.a aVar = this.h;
        if (numX49.tnTj78("bFGP9").equals(aVar.l())) {
            if (numX49.tnTj78("bFGP2").equals(svM7M6.getString(aVar.f11330b, numX49.tnTj78("bFGPb"), numX49.tnTj78("bFGPP")))) {
                EDDActivity eDDActivity = (EDDActivity) ((InterfaceC2283a) this.c.get());
                eDDActivity.u1().setVisibility(8);
                StepProgressBar stepProgressBar = eDDActivity.mStepProgressBar;
                if (stepProgressBar == null) {
                    j.n(numX49.tnTj78("bFGPr"));
                    throw null;
                }
                stepProgressBar.setVisibility(8);
                FrameLayout frameLayout = eDDActivity.mFrameLayout;
                if (frameLayout == null) {
                    j.n(numX49.tnTj78("bFGPL"));
                    throw null;
                }
                frameLayout.setVisibility(0);
                AbstractC1236z.g(eDDActivity, R.id.fragment_container_frame_layout_pma_activity_edd, new EDDApplicationStatusFragment());
                return;
            }
        }
        this.i = new EDD(null, null, null, null, null, null, 63, null);
        N n7 = this.f20038d;
        p<Response<Void>> kYCSettingsHead = n7.c.getKYCSettingsHead();
        com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p(n7, 2);
        I i = Eh.d.f1366d;
        kYCSettingsHead.getClass();
        kYCSettingsHead.f(new Gh.d(1, pVar, i));
        C1254d0 c1254d0 = this.e;
        p<Response<Void>> incomeSourceV2Head = c1254d0.c.getIncomeSourceV2Head();
        C1252c0 c1252c0 = new C1252c0(c1254d0, 0);
        incomeSourceV2Head.getClass();
        incomeSourceV2Head.f(new Gh.d(1, c1252c0, i));
        this.f.c().e();
        U u3 = this.f20039g;
        p<Response<Void>> financialDocumentsHead = u3.c.getFinancialDocumentsHead();
        T t5 = new T(u3, 0);
        financialDocumentsHead.getClass();
        financialDocumentsHead.f(new Gh.d(1, t5, i));
        ((EDDActivity) ((InterfaceC2283a) this.c.get())).v1();
    }
}
