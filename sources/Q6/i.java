package Q6;

import G6.v;
import Kh.C0305j;
import Kh.C0310o;
import Kh.z;
import N5.C0450f;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import com.paymaya.common.utility.A;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.UpdaterConfigDetails;
import com.paymaya.mayaui.common.view.activity.impl.MayaUpdaterActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAppMaintenanceFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaUpdaterFragment;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5277d = 1;
    public final S5.c e;

    public i(S5.c flagConfigurationService) {
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        this.e = flagConfigurationService;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Object objA;
        switch (this.f5277d) {
            case 0:
                super.j();
                String strD = this.e.d(A5.f.f158d);
                try {
                    C1037h.a aVar = C1037h.f9166b;
                    objA = (MaintenanceDynamicConfig) A.f10366a.e(strD, MaintenanceDynamicConfig.class);
                    break;
                } catch (Throwable th2) {
                    C1037h.a aVar2 = C1037h.f9166b;
                    objA = AbstractC1039j.a(th2);
                }
                if (objA instanceof C1038i) {
                    objA = null;
                }
                MaintenanceDynamicConfig maintenanceDynamicConfig = (MaintenanceDynamicConfig) objA;
                if (maintenanceDynamicConfig == null) {
                    maintenanceDynamicConfig = new MaintenanceDynamicConfig(false, null, 3, null);
                }
                X6.b bVar = (X6.b) this.c.get();
                String description = maintenanceDynamicConfig.getMessage();
                MayaAppMaintenanceFragment mayaAppMaintenanceFragment = (MayaAppMaintenanceFragment) bVar;
                mayaAppMaintenanceFragment.getClass();
                kotlin.jvm.internal.j.g(description, "description");
                HtmlTextView htmlTextView = mayaAppMaintenanceFragment.f11905X;
                if (htmlTextView == null) {
                    kotlin.jvm.internal.j.n("mTextViewDescription");
                    throw null;
                }
                htmlTextView.setTextHTML(description.toString());
                new C0305j(new C0310o(new z(new z(S5.c.f(this.e, A5.f.f158d).e(zh.b.a()), e.h, 0), e.i, 1), new Gb.d(this, 26), Eh.d.c, Eh.d.f1365b), new v(this, 28), 1).f();
                return;
            default:
                super.j();
                m();
                k();
                return;
        }
    }

    public void k() {
        Y6.k kVar;
        UpdaterConfigDetails updaterConfigDetailsL = l();
        C0450f c0450f = ((MayaUpdaterFragment) ((X6.g) this.c.get())).f11942U;
        kotlin.jvm.internal.j.d(c0450f);
        Context applicationContext = ((ConstraintLayout) c0450f.c).getContext().getApplicationContext();
        kotlin.jvm.internal.j.f(applicationContext, "getApplicationContext(...)");
        boolean z4 = qk.i.A(applicationContext) >= updaterConfigDetailsL.getBuildNumber();
        if ((!updaterConfigDetailsL.isMandatory() || z4) && (kVar = ((MayaUpdaterFragment) ((X6.g) this.c.get())).f11946Y) != null) {
            MayaUpdaterActivity mayaUpdaterActivity = (MayaUpdaterActivity) kVar;
            mayaUpdaterActivity.n1();
            Intent intent = new Intent(mayaUpdaterActivity.getApplicationContext(), (Class<?>) LauncherActivity.class);
            intent.setFlags(268468224);
            mayaUpdaterActivity.startActivity(intent);
            mayaUpdaterActivity.finish();
        }
    }

    public UpdaterConfigDetails l() {
        Object objA;
        String strD = this.e.d(A5.f.f);
        Object updaterConfigDetails = new UpdaterConfigDetails(0, false, null, 7, null);
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = A.f10366a.e(strD, UpdaterConfigDetails.class);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        if (objA != null) {
            updaterConfigDetails = objA;
        }
        return (UpdaterConfigDetails) updaterConfigDetails;
    }

    public void m() {
        String storeLink = l().getStoreLink();
        if (C2576A.H(storeLink)) {
            MayaUpdaterFragment mayaUpdaterFragment = (MayaUpdaterFragment) ((X6.g) this.c.get());
            Button button = mayaUpdaterFragment.f11944W;
            if (button != null) {
                button.setOnClickListener(new S.b(mayaUpdaterFragment, 29));
                return;
            } else {
                kotlin.jvm.internal.j.n("mButtonUpdate");
                throw null;
            }
        }
        MayaUpdaterFragment mayaUpdaterFragment2 = (MayaUpdaterFragment) ((X6.g) this.c.get());
        mayaUpdaterFragment2.getClass();
        Button button2 = mayaUpdaterFragment2.f11944W;
        if (button2 != null) {
            button2.setOnClickListener(new Ad.a(26, mayaUpdaterFragment2, storeLink));
        } else {
            kotlin.jvm.internal.j.n("mButtonUpdate");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(S5.c flagConfigurationService, Uh.d sessionSubject) {
        super(sessionSubject);
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.e = flagConfigurationService;
    }
}
