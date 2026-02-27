package N9;

import A7.j;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditInterstitialActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCreditInterstitialActivity f4342b;

    public /* synthetic */ c(MayaCreditInterstitialActivity mayaCreditInterstitialActivity, int i) {
        this.f4341a = i;
        this.f4342b = mayaCreditInterstitialActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4341a) {
            case 0:
                MayaCreditInterstitialActivity mayaCreditInterstitialActivity = this.f4342b;
                int i = MayaCreditInterstitialActivity.f13073r;
                Callback.onClick_enter(view);
                try {
                    mayaCreditInterstitialActivity.V1().z();
                    return;
                } finally {
                }
            default:
                MayaCreditInterstitialActivity mayaCreditInterstitialActivity2 = this.f4342b;
                int i4 = MayaCreditInterstitialActivity.f13073r;
                Callback.onClick_enter(view);
                try {
                    j jVarV1 = mayaCreditInterstitialActivity2.V1();
                    ((MayaCreditInterstitialActivity) ((M9.b) jVarV1.c.get())).Y1();
                    jVarV1.p();
                    return;
                } finally {
                }
        }
    }
}
