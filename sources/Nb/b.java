package Nb;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaErrorDialogFragment f4380b;
    public final /* synthetic */ MayaSettingsActivity c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PayMayaErrorAction f4381d;

    public /* synthetic */ b(MayaErrorDialogFragment mayaErrorDialogFragment, MayaSettingsActivity mayaSettingsActivity, PayMayaErrorAction payMayaErrorAction, int i) {
        this.f4379a = i;
        this.f4380b = mayaErrorDialogFragment;
        this.c = mayaSettingsActivity;
        this.f4381d = payMayaErrorAction;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PayMayaErrorAction payMayaErrorAction = this.f4381d;
        MayaSettingsActivity mayaSettingsActivity = this.c;
        MayaErrorDialogFragment mayaErrorDialogFragment = this.f4380b;
        switch (this.f4379a) {
            case 0:
                int i = MayaSettingsActivity.f13839r;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.q1().z(mayaSettingsActivity);
                    mayaErrorDialogFragment.s1(payMayaErrorAction);
                    return;
                } finally {
                }
            default:
                int i4 = MayaSettingsActivity.f13839r;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.q1().z(mayaSettingsActivity);
                    mayaErrorDialogFragment.s1(payMayaErrorAction);
                    return;
                } finally {
                }
        }
    }
}
