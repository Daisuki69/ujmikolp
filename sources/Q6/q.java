package Q6;

import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.PlayMayaWebViewParameters;
import com.paymaya.domain.model.Success;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f5289b;
    public final /* synthetic */ String c;

    public /* synthetic */ q(t tVar, String str, int i) {
        this.f5288a = i;
        this.f5289b = tVar;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f5288a) {
            case 0:
                PlayMayaWebViewParameters parameters = (PlayMayaWebViewParameters) obj;
                kotlin.jvm.internal.j.g(parameters, "parameters");
                t tVar = this.f5289b;
                String targetUrl = this.c;
                tVar.getClass();
                kotlin.jvm.internal.j.g(targetUrl, "targetUrl");
                String strZ = C.z(targetUrl, parameters.getExternalProfileId(), parameters.getUserToken(), parameters.getAccessToken(), parameters.getTimestamp());
                ((MayaWebFragment) ((X6.h) tVar.c.get())).setHasOptionsMenu(true);
                X6.h hVar = (X6.h) tVar.c.get();
                kotlin.jvm.internal.j.d(strZ);
                MayaWebFragment mayaWebFragment = (MayaWebFragment) hVar;
                mayaWebFragment.getClass();
                mayaWebFragment.f11965x0 = "";
                mayaWebFragment.f11964v0 = strZ;
                t tVarP1 = mayaWebFragment.P1();
                String str = mayaWebFragment.f11964v0;
                boolean z4 = mayaWebFragment.y0;
                FragmentActivity activity = mayaWebFragment.getActivity();
                tVarP1.n(str, z4, activity != null ? v0.s(activity) : false, mayaWebFragment.f11949B0);
                return;
            default:
                Success it = (Success) obj;
                kotlin.jvm.internal.j.g(it, "it");
                t tVar2 = this.f5289b;
                String str2 = this.c;
                ((MayaWebFragment) ((X6.h) tVar2.c.get())).L1();
                B5.m mVar = ((MayaWebFragment) ((X6.h) tVar2.c.get())).t0;
                if (mVar == null) {
                    kotlin.jvm.internal.j.n("mSuspendSessionController");
                    throw null;
                }
                mVar.b();
                tVar2.l(str2);
                return;
        }
    }
}
