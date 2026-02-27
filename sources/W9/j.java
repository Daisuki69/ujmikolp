package w9;

import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements W6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20724b;
    public final /* synthetic */ MayaErrorDialogFragment c;

    public /* synthetic */ j(MayaMfaActivity mayaMfaActivity, MayaErrorDialogFragment mayaErrorDialogFragment, int i) {
        this.f20723a = i;
        this.f20724b = mayaMfaActivity;
        this.c = mayaErrorDialogFragment;
    }

    @Override // W6.d
    public final void onClose() {
        switch (this.f20723a) {
            case 0:
                MayaMfaActivity mayaMfaActivity = this.f20724b;
                mayaMfaActivity.a2();
                String strM = AbstractC1213b.m(6);
                kotlin.jvm.internal.j.f(strM, "tapped(...)");
                MfaMeta mfaMeta = mayaMfaActivity.f12930q;
                String sourceScreen = mfaMeta != null ? mfaMeta.getSourceScreen() : null;
                if (sourceScreen == null) {
                    sourceScreen = "";
                }
                String string = this.c.getString(R.string.maya_label_face_auth_button_got_it);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                mayaMfaActivity.e2(strM, "Tencent Face Auth Screen", sourceScreen, string, null);
                break;
            case 1:
                MayaMfaActivity mayaMfaActivity2 = this.f20724b;
                mayaMfaActivity2.setResult(1012);
                mayaMfaActivity2.finish();
                String strM2 = AbstractC1213b.m(4);
                kotlin.jvm.internal.j.f(strM2, "tapped(...)");
                String string2 = this.c.getString(R.string.maya_label_close);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                mayaMfaActivity2.e2(strM2, "No face data - OTP fallback (Dialog)", "Enter your number", string2, null);
                break;
            default:
                MayaMfaActivity mayaMfaActivity3 = this.f20724b;
                mayaMfaActivity3.a2();
                String strM3 = AbstractC1213b.m(5);
                kotlin.jvm.internal.j.f(strM3, "tapped(...)");
                MfaMeta mfaMeta2 = mayaMfaActivity3.f12930q;
                String sourceScreen2 = mfaMeta2 != null ? mfaMeta2.getSourceScreen() : null;
                if (sourceScreen2 == null) {
                    sourceScreen2 = "";
                }
                String string3 = this.c.getString(R.string.maya_label_close);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                mayaMfaActivity3.e2(strM3, "Let’s try another take (Dialog)", sourceScreen2, string3, null);
                break;
        }
    }
}
