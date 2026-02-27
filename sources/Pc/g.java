package Pc;

import Ah.p;
import G6.r;
import G6.u;
import Lh.h;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.PlayMayaWebViewParameters;
import com.paymaya.domain.model.Success;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.d1;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;
import d4.AbstractC1331a;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S0 f5156d;
    public final d1 e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5157g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(S0 s02, d1 d1Var, com.paymaya.data.preference.a mPreference, Uh.d dVar) {
        super(dVar);
        j.g(mPreference, "mPreference");
        this.f5156d = s02;
        this.e = d1Var;
    }

    public final AttributionSource k(String str) {
        return (str == null || !z.w(str, 2, C2576A.N("https://playmaya.paymaya.com/", "/"), false)) ? (str == null || !z.w(str, 2, C2576A.N("https://mall.paymaya.com/", "/"), false)) ? AttributionSource.j : AttributionSource.i : AttributionSource.h;
    }

    public final void l(String str) {
        ((WebFragment) ((Vc.c) this.c.get())).B1(0);
        WebFragment webFragment = (WebFragment) ((Vc.c) this.c.get());
        if (str != null) {
            WebView webView = webFragment.f14420a0;
            if (webView == null) {
                j.n("mWebView");
                throw null;
            }
            webView.loadUrl(str);
        } else {
            webFragment.getClass();
        }
        ProgressBar progressBar = ((WebFragment) ((Vc.c) this.c.get())).f14422c0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        } else {
            j.n("mWebPageProgressBar");
            throw null;
        }
    }

    public final void m(String str) {
        ((WebFragment) ((Vc.c) this.c.get())).z1();
        p<Success> pVarRefreshToken = this.f5156d.f11388d.refreshToken();
        e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarRefreshToken, pVarRefreshToken, zh.b.a()), new f(this, str, 1), 2), new u(this, 25), 0).e());
    }

    public final void n(String str, boolean z4, boolean z5, boolean z8) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        j();
        this.f = z4;
        this.h = z8;
        if (str != null && !C2576A.H(str) && z.w(str, 2, "https://playmaya.paymaya.com/", false)) {
            HashMap mapB = C.B(str, false);
            CharSequence charSequence4 = (CharSequence) mapB.get(PlayMayaWebViewParameters.PARAMETER_EXTERNAL_PROFILE_ID);
            if (charSequence4 == null || C2576A.H(charSequence4) || (charSequence = (CharSequence) mapB.get(PlayMayaWebViewParameters.PARAMETER_USER_TOKEN)) == null || C2576A.H(charSequence) || (charSequence2 = (CharSequence) mapB.get(PlayMayaWebViewParameters.PARAMETER_ACCESS_TOKEN)) == null || C2576A.H(charSequence2) || (charSequence3 = (CharSequence) mapB.get("timestamp")) == null || C2576A.H(charSequence3)) {
                p<PlayMayaWebViewParameters> playMayaWebViewParameters = this.e.f11435b.getPlayMayaWebViewParameters();
                j.f(playMayaWebViewParameters, "getPlayMayaWebViewParameters(...)");
                new Lh.d(new Lh.d(new h(playMayaWebViewParameters, zh.b.a(), 0), new f(this, str, 0), 2), new r(this, 26), 0).e();
                return;
            }
        }
        if (z5) {
            if (z8) {
                m(str);
                return;
            } else {
                l(str);
                return;
            }
        }
        WebFragment webFragment = (WebFragment) ((Vc.c) this.c.get());
        webFragment.y1(100, webFragment.getString(R.string.pma_dialog_error_server_default_message_web), new Wc.d(webFragment, 0));
        ProgressBar progressBar = ((WebFragment) ((Vc.c) this.c.get())).f14422c0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            j.n("mWebPageProgressBar");
            throw null;
        }
    }
}
