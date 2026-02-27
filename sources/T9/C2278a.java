package t9;

import A7.j;
import android.content.Intent;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.MFAChallengeInformationV2;
import com.paymaya.domain.model.MFAChallengeVerificationResultV2;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import ph.C2070f1;

/* JADX INFO: renamed from: t9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2278a implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20185a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f20186b;

    public C2278a(j jVar) {
        this.f20186b = jVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20185a) {
            case 0:
                MFAChallengeInformation mfaChallengeInfo = (MFAChallengeInformation) obj;
                kotlin.jvm.internal.j.g(mfaChallengeInfo, "mfaChallengeInfo");
                x9.a aVar = (x9.a) this.f20186b.c.get();
                MFAChallengeInformationV2 mFAChallengeInformationV2TransformToMfaChallengeInformationV2 = mfaChallengeInfo.transformToMfaChallengeInformationV2();
                y9.b bVar = ((MayaMfaFaceAuthFragment) aVar).f12936X;
                if (bVar != null) {
                    ((MayaMfaActivity) bVar).f12929p = mFAChallengeInformationV2TransformToMfaChallengeInformationV2;
                }
                j jVar = this.f20186b;
                jVar.getClass();
                String tencentToken = mfaChallengeInfo.getTencentToken();
                if (tencentToken == null) {
                    j.s(jVar, null, 3);
                } else {
                    MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) ((x9.a) jVar.c.get());
                    mayaMfaFaceAuthFragment.getClass();
                    C2070f1 c2070f1 = new C2070f1(mayaMfaFaceAuthFragment, 17);
                    mayaMfaFaceAuthFragment.K1();
                    HuiYanOsApi.startHuiYanAuth(tencentToken, mayaMfaFaceAuthFragment.f14176W, c2070f1);
                }
                break;
            default:
                MFAChallengeVerificationResultV2 result = (MFAChallengeVerificationResultV2) obj;
                kotlin.jvm.internal.j.g(result, "result");
                ((MayaBaseFragment) ((x9.a) this.f20186b.c.get())).w1();
                MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment2 = (MayaMfaFaceAuthFragment) ((x9.a) this.f20186b.c.get());
                mayaMfaFaceAuthFragment2.getClass();
                y9.b bVar2 = mayaMfaFaceAuthFragment2.f12936X;
                if (bVar2 != null) {
                    MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) bVar2;
                    String strI = AbstractC1213b.i(14);
                    kotlin.jvm.internal.j.f(strI, "success(...)");
                    mayaMfaActivity.d2(strI);
                    Intent intent = new Intent();
                    intent.putExtra("mfa_success_verification_result", result);
                    mayaMfaActivity.setResult(1011, intent);
                    mayaMfaActivity.finish();
                }
                break;
        }
    }

    public C2278a(j jVar, MfaMeta mfaMeta) {
        this.f20186b = jVar;
    }
}
