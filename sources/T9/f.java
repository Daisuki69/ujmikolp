package t9;

import A7.j;
import android.content.Intent;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MFAChallengeInformationV2;
import com.paymaya.domain.model.MFAChallengeVerificationResultV2;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f20196b;

    public /* synthetic */ f(j jVar, int i) {
        this.f20195a = i;
        this.f20196b = jVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20195a) {
            case 0:
                kotlin.jvm.internal.j.g((MFAChallengeInformationV2) obj, "it");
                ((MayaMultiTypeOtpFragment) ((x9.c) this.f20196b.c.get())).N1();
                break;
            default:
                MFAChallengeVerificationResultV2 it = (MFAChallengeVerificationResultV2) obj;
                kotlin.jvm.internal.j.g(it, "it");
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) ((x9.c) this.f20196b.c.get());
                mayaMultiTypeOtpFragment.getClass();
                y9.f fVar = mayaMultiTypeOtpFragment.f12943W;
                if (fVar != null) {
                    MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) fVar;
                    String strI = AbstractC1213b.i(15);
                    kotlin.jvm.internal.j.f(strI, "success(...)");
                    mayaMfaActivity.d2(strI);
                    Intent intent = new Intent();
                    intent.putExtra("mfa_success_verification_result", it);
                    mayaMfaActivity.setResult(1011, intent);
                    mayaMfaActivity.finish();
                }
                break;
        }
    }
}
