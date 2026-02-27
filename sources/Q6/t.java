package Q6;

import G6.w;
import android.widget.ProgressBar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.PlayMayaWebViewParameters;
import com.paymaya.domain.model.Success;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.d1;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import d4.AbstractC1331a;
import java.util.HashMap;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S0 f5294d;
    public final d1 e;
    public final S5.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5295g;
    public boolean h;
    public boolean i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(S0 s02, d1 d1Var, com.paymaya.data.preference.a mPreference, S5.c flagConfigurationService, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        this.f5294d = s02;
        this.e = d1Var;
        this.f = flagConfigurationService;
        this.j = TypedValues.AttributesType.S_TARGET;
    }

    public final AttributionSource k(String str) {
        return (str == null || !z.w(str, 2, C2576A.N("https://playmaya.paymaya.com/", "/"), false)) ? (str == null || !z.w(str, 2, C2576A.N("https://mall.paymaya.com/", "/"), false)) ? AttributionSource.j : AttributionSource.i : AttributionSource.h;
    }

    public final void l(String str) {
        ((MayaWebFragment) ((X6.h) this.c.get())).S1(0);
        ((MayaWebFragment) ((X6.h) this.c.get())).R1(str);
        ProgressBar progressBar = ((MayaWebFragment) ((X6.h) this.c.get())).f11961q0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mWebPageProgressBar");
            throw null;
        }
    }

    public final void m(String str) {
        ((MayaWebFragment) ((X6.h) this.c.get())).O1();
        Ah.p<Success> pVarRefreshToken = this.f5294d.f11388d.refreshToken();
        e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarRefreshToken, pVarRefreshToken, zh.b.a()), new q(this, str, 1), 2), new w(this, 27), 0).e());
    }

    public final void n(String str, boolean z4, boolean z5, boolean z8) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        j();
        this.f5295g = z4;
        this.i = z8;
        if (str != null && !C2576A.H(str) && z.w(str, 2, "https://playmaya.paymaya.com/", false)) {
            HashMap mapB = C.B(str, false);
            CharSequence charSequence4 = (CharSequence) mapB.get(PlayMayaWebViewParameters.PARAMETER_EXTERNAL_PROFILE_ID);
            if (charSequence4 == null || C2576A.H(charSequence4) || (charSequence = (CharSequence) mapB.get(PlayMayaWebViewParameters.PARAMETER_USER_TOKEN)) == null || C2576A.H(charSequence) || (charSequence2 = (CharSequence) mapB.get(PlayMayaWebViewParameters.PARAMETER_ACCESS_TOKEN)) == null || C2576A.H(charSequence2) || (charSequence3 = (CharSequence) mapB.get("timestamp")) == null || C2576A.H(charSequence3)) {
                Ah.p<PlayMayaWebViewParameters> playMayaWebViewParameters = this.e.f11435b.getPlayMayaWebViewParameters();
                kotlin.jvm.internal.j.f(playMayaWebViewParameters, "getPlayMayaWebViewParameters(...)");
                new Lh.d(new Lh.d(new Lh.h(playMayaWebViewParameters, zh.b.a(), 0), new q(this, str, 0), 2), new Gc.h(this, 28), 0).e();
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
        ((MayaWebFragment) ((X6.h) this.c.get())).T1();
        ProgressBar progressBar = ((MayaWebFragment) ((X6.h) this.c.get())).f11961q0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mWebPageProgressBar");
            throw null;
        }
    }
}
