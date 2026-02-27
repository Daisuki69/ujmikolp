package Pc;

import B5.m;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.PlayMayaWebViewParameters;
import com.paymaya.domain.model.Success;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5155b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(g gVar, String str, int i) {
        this.f5154a = i;
        this.f5155b = gVar;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f5154a) {
            case 0:
                PlayMayaWebViewParameters parameters = (PlayMayaWebViewParameters) obj;
                j.g(parameters, "parameters");
                g gVar = this.f5155b;
                String targetUrl = this.c;
                gVar.getClass();
                j.g(targetUrl, "targetUrl");
                String updatedUrl = C.z(targetUrl, parameters.getExternalProfileId(), parameters.getUserToken(), parameters.getAccessToken(), parameters.getTimestamp());
                ((WebFragment) ((Vc.c) gVar.c.get())).setHasOptionsMenu(true);
                WebFragment webFragment = (WebFragment) ((Vc.c) gVar.c.get());
                webFragment.getClass();
                j.g(updatedUrl, "updatedUrl");
                webFragment.f14427h0 = updatedUrl;
                webFragment.A1().n(webFragment.f14427h0, webFragment.f14428i0, C.W(webFragment.getActivity()), webFragment.f14431l0);
                return;
            default:
                Success it = (Success) obj;
                j.g(it, "it");
                g gVar2 = this.f5155b;
                String str = this.c;
                ((WebFragment) ((Vc.c) gVar2.c.get())).w1();
                m mVar = ((WebFragment) ((Vc.c) gVar2.c.get())).f14425f0;
                if (mVar == null) {
                    j.n("mSuspendSessionController");
                    throw null;
                }
                mVar.b();
                gVar2.l(str);
                return;
        }
    }
}
