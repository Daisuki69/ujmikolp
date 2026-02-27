package Q9;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class J implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditSummaryFragment f5307b;

    public /* synthetic */ J(NewMayaCreditSummaryFragment newMayaCreditSummaryFragment, int i) {
        this.f5306a = i;
        this.f5307b = newMayaCreditSummaryFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5306a) {
            case 0:
                NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = this.f5307b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditSummaryFragment.S1(newMayaCreditSummaryFragment);
                    return;
                } finally {
                }
            case 1:
                NewMayaCreditSummaryFragment newMayaCreditSummaryFragment2 = this.f5307b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditSummaryFragment.T1(newMayaCreditSummaryFragment2);
                    return;
                } finally {
                }
            case 2:
                NewMayaCreditSummaryFragment newMayaCreditSummaryFragment3 = this.f5307b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditSummaryFragment.U1(newMayaCreditSummaryFragment3);
                    return;
                } finally {
                }
            default:
                NewMayaCreditSummaryFragment newMayaCreditSummaryFragment4 = this.f5307b;
                Callback.onClick_enter(view);
                try {
                    newMayaCreditSummaryFragment4.Q1().q();
                    return;
                } finally {
                }
        }
    }
}
