package kc;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelOperatorSelectionFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaTravelOperatorSelectionFragment f18117b;

    public /* synthetic */ c(MayaTravelOperatorSelectionFragment mayaTravelOperatorSelectionFragment, int i) {
        this.f18116a = i;
        this.f18117b = mayaTravelOperatorSelectionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f18116a) {
            case 0:
                MayaTravelOperatorSelectionFragment mayaTravelOperatorSelectionFragment = this.f18117b;
                Callback.onClick_enter(view);
                try {
                    MayaTravelOperatorSelectionFragment.R1(mayaTravelOperatorSelectionFragment);
                    return;
                } finally {
                }
            case 1:
                MayaTravelOperatorSelectionFragment mayaTravelOperatorSelectionFragment2 = this.f18117b;
                Callback.onClick_enter(view);
                try {
                    mayaTravelOperatorSelectionFragment2.P1().A();
                    return;
                } finally {
                }
            default:
                MayaTravelOperatorSelectionFragment mayaTravelOperatorSelectionFragment3 = this.f18117b;
                Callback.onClick_enter(view);
                try {
                    mayaTravelOperatorSelectionFragment3.P1().A();
                    return;
                } finally {
                }
        }
    }
}
