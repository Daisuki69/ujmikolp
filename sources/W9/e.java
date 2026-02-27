package w9;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20714b;
    public final /* synthetic */ MayaErrorDialogFragment c;

    public /* synthetic */ e(MayaMfaActivity mayaMfaActivity, MayaErrorDialogFragment mayaErrorDialogFragment, int i) {
        this.f20713a = i;
        this.f20714b = mayaMfaActivity;
        this.c = mayaErrorDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MayaErrorDialogFragment mayaErrorDialogFragment = this.c;
        switch (this.f20713a) {
            case 0:
                MayaMfaActivity mayaMfaActivity = this.f20714b;
                int i = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    MayaMfaActivity.m2(mayaMfaActivity, mayaErrorDialogFragment);
                    return;
                } finally {
                }
            default:
                MayaMfaActivity mayaMfaActivity2 = this.f20714b;
                int i4 = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    mayaMfaActivity2.f12931r = "retry";
                    AbstractC1236z.g(mayaMfaActivity2, R.id.fragment_container, new MayaMfaFaceAuthFragment());
                    String strM = AbstractC1213b.m(5);
                    kotlin.jvm.internal.j.f(strM, "tapped(...)");
                    String string = mayaErrorDialogFragment.getString(R.string.maya_label_face_auth_button_retry);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    mayaMfaActivity2.e2(strM, "Let’s try another take (Dialog)", "Tencent Face Auth Screen", string, null);
                    return;
                } finally {
                }
        }
    }
}
