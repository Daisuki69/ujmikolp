package Sb;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.settings.view.activity.impl.MayaDeviceManagementActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementMainFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDeviceManagementMainFragment f5711b;

    public /* synthetic */ r(MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment, int i) {
        this.f5710a = i;
        this.f5711b = mayaDeviceManagementMainFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5710a) {
            case 0:
                MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment = this.f5711b;
                Callback.onClick_enter(view);
                try {
                    s sVar = mayaDeviceManagementMainFragment.f13975z0;
                    if (sVar != null) {
                        ((MayaDeviceManagementActivity) sVar).V1("update_email", null);
                    }
                    s sVar2 = mayaDeviceManagementMainFragment.f13975z0;
                    if (sVar2 != null) {
                        MayaDeviceManagementActivity mayaDeviceManagementActivity = (MayaDeviceManagementActivity) sVar2;
                        mayaDeviceManagementActivity.n1();
                        B5.i.V(mayaDeviceManagementActivity, "account_recovery");
                    }
                    return;
                } finally {
                }
            case 1:
                MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment2 = this.f5711b;
                Callback.onClick_enter(view);
                try {
                    mayaDeviceManagementMainFragment2.P1();
                    return;
                } finally {
                }
            case 2:
                MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment3 = this.f5711b;
                Callback.onClick_enter(view);
                try {
                    mayaDeviceManagementMainFragment3.P1();
                    return;
                } finally {
                }
            default:
                MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment4 = this.f5711b;
                Callback.onClick_enter(view);
                try {
                    mayaDeviceManagementMainFragment4.P1();
                    return;
                } finally {
                }
        }
    }
}
