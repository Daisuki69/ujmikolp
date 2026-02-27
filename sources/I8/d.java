package I8;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycActivity f2265b;

    public /* synthetic */ d(MayaKycActivity mayaKycActivity, int i) {
        this.f2264a = i;
        this.f2265b = mayaKycActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MayaKycActivity mayaKycActivity = this.f2265b;
        switch (this.f2264a) {
            case 0:
                MayaDashboardActivity mayaDashboardActivity = MayaKycActivity.f12445B;
                Callback.onClick_enter(view);
                try {
                    mayaKycActivity.i2(true);
                    return;
                } finally {
                }
            default:
                MayaDashboardActivity mayaDashboardActivity2 = MayaKycActivity.f12445B;
                Callback.onClick_enter(view);
                try {
                    mayaKycActivity.finish();
                    return;
                } finally {
                }
        }
    }
}
