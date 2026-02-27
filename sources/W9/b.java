package w9;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20707b;

    public /* synthetic */ b(MayaMfaActivity mayaMfaActivity, int i) {
        this.f20706a = i;
        this.f20707b = mayaMfaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MayaMfaActivity mayaMfaActivity = this.f20707b;
        switch (this.f20706a) {
            case 0:
                int i = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    mayaMfaActivity.setResult(1013);
                    mayaMfaActivity.finish();
                    return;
                } finally {
                }
            default:
                int i4 = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    mayaMfaActivity.setResult(1013);
                    mayaMfaActivity.finish();
                    return;
                } finally {
                }
        }
    }
}
