package Ld;

import A5.f;
import A5.m;
import Ag.l;
import B5.i;
import S5.c;
import android.content.Intent;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.UpdaterConfigDetails;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.activity.impl.MayaAnimatedFullScreenActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLocationPermissionBottomSheetDialogFragment;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import o1.AbstractC1955a;
import ph.C2070f1;
import u5.AbstractC2302a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0 f2957d;
    public final com.paymaya.data.preference.a e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f2958g;
    public final K h;
    public boolean i;
    public boolean j;

    public a(Z0 z02, com.paymaya.data.preference.a aVar, c cVar, m mVar, K k8) {
        this.f2957d = z02;
        this.e = aVar;
        this.f = cVar;
        this.f2958g = mVar;
        this.h = k8;
    }

    public final void k() {
        if (this.j && this.e.F() && !this.i) {
            this.i = true;
            this.h.c(null, "base-app", "app-launch", null);
        }
    }

    public final void l() {
        if (this.e.E()) {
            ((DeepLinkActivity) ((Md.a) this.c.get())).e.a();
            return;
        }
        DeepLinkActivity deepLinkActivity = (DeepLinkActivity) ((Md.a) this.c.get());
        i iVar = deepLinkActivity.e;
        String name = MayaSessionExpiredActivity.class.getName();
        iVar.getClass();
        Intent intent = new Intent(deepLinkActivity, (Class<?>) MayaAnimatedFullScreenActivity.class);
        intent.putExtra("extra_next_activity", name);
        deepLinkActivity.startActivity(intent);
        deepLinkActivity.finish();
    }

    public final void m() {
        if (qk.i.c) {
            return;
        }
        boolean zA = this.f.a(A5.b.f66K);
        yk.a.g("Maya-Dynatrace").getClass();
        C2070f1.b();
        if (zA) {
            qk.i.B(((DeepLinkActivity) ((Md.a) this.c.get())).getApplication());
        } else {
            yk.a.g("Maya-Dynatrace").getClass();
            C2070f1.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ld.a.n(java.lang.String):void");
    }

    public final void o(String str) {
        DeepLinkActivity deepLinkActivity = (DeepLinkActivity) ((Md.a) this.c.get());
        deepLinkActivity.getClass();
        boolean z4 = AbstractC2302a.f20265a;
        AbstractC2302a.b(deepLinkActivity.getApplicationContext());
        m();
        k();
        DeepLinkActivity deepLinkActivity2 = (DeepLinkActivity) ((Md.a) this.c.get());
        deepLinkActivity2.getClass();
        if (AbstractC1955a.u(deepLinkActivity2, "android.permission.ACCESS_FINE_LOCATION") || AbstractC1955a.u(deepLinkActivity2, "android.permission.ACCESS_COARSE_LOCATION") || this.e.f11330b.getBoolean("key_is_location_permission_shown", false) || this.f.a(A5.b.f53B1)) {
            n(str);
            return;
        }
        DeepLinkActivity deepLinkActivity3 = (DeepLinkActivity) ((Md.a) this.c.get());
        deepLinkActivity3.getClass();
        new MayaLocationPermissionBottomSheetDialogFragment().show(deepLinkActivity3.getSupportFragmentManager(), "location");
    }

    public final void p(String str) {
        Object objA;
        String strD = this.f.d(f.f);
        Object updaterConfigDetails = new UpdaterConfigDetails();
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
        UpdaterConfigDetails updaterConfigDetails2 = (UpdaterConfigDetails) updaterConfigDetails;
        boolean z4 = qk.i.A(((DeepLinkActivity) ((Md.a) this.c.get())).getApplicationContext()) < updaterConfigDetails2.getBuildNumber();
        if (updaterConfigDetails2.isMandatory() && z4) {
            ((DeepLinkActivity) ((Md.a) this.c.get())).f14618k.getClass();
            B5.c.c();
        } else {
            m mVar = this.f2958g;
            l lVar = new l(6, this, str);
            mVar.getClass();
            m.c(lVar);
        }
    }
}
