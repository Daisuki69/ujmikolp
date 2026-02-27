package N9;

import android.os.Parcelable;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import eb.k;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaErrorDialogFragment f4349b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4350d;

    public /* synthetic */ g(MayaErrorDialogFragment mayaErrorDialogFragment, Object obj, Object obj2, int i) {
        this.f4348a = i;
        this.f4349b = mayaErrorDialogFragment;
        this.c = obj;
        this.f4350d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f4350d;
        MayaErrorDialogFragment mayaErrorDialogFragment = this.f4349b;
        Object obj2 = this.c;
        switch (this.f4348a) {
            case 0:
                NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) obj2;
                String str = (String) obj;
                int i = NewMayaCreditActivity.f13081x;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditActivity.i2(mayaErrorDialogFragment, newMayaCreditActivity, str);
                    return;
                } finally {
                }
            case 1:
                int i4 = MayaRegistrationV2Activity.f13663v;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.s1(((PayMayaError) obj2).mAction());
                    ((k) obj).invoke(mayaErrorDialogFragment.r1());
                    return;
                } finally {
                }
            case 2:
                int i6 = MayaRegistrationActivity.f12730r;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.s1(((PayMayaError) obj2).mAction());
                    ((S7.e) obj).invoke(mayaErrorDialogFragment.r1());
                    return;
                } finally {
                }
            case 3:
                MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) obj2;
                PayMayaErrorAction payMayaErrorAction = (PayMayaErrorAction) obj;
                int i10 = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    mayaMfaActivity.f12931r = "catch_all_error";
                    mayaErrorDialogFragment.s1(payMayaErrorAction);
                    mayaMfaActivity.setResult(1013);
                    mayaMfaActivity.finish();
                    return;
                } finally {
                }
            default:
                MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) obj2;
                MfaTencentErrorResult mfaTencentErrorResult = (MfaTencentErrorResult) obj;
                int i11 = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    mayaMfaActivity2.setResult(1013);
                    mayaMfaActivity2.finish();
                    MfaMeta mfaMeta = mayaMfaActivity2.f12930q;
                    String sourceScreen = mfaMeta != null ? mfaMeta.getSourceScreen() : null;
                    if (sourceScreen == null) {
                        sourceScreen = "";
                    }
                    String string = mayaErrorDialogFragment.getString(R.string.maya_label_face_auth_button_got_it);
                    j.f(string, "getString(...)");
                    mayaMfaActivity2.e2("MFA_FACE_SCREEN_TENCENT_ERROR_TAPPED", "Tencent Error (Dialog)", sourceScreen, string, String.valueOf(mfaTencentErrorResult.getErrorCode()));
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ g(MayaMfaActivity mayaMfaActivity, MayaErrorDialogFragment mayaErrorDialogFragment, Parcelable parcelable, int i) {
        this.f4348a = i;
        this.c = mayaMfaActivity;
        this.f4349b = mayaErrorDialogFragment;
        this.f4350d = parcelable;
    }
}
