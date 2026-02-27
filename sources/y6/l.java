package Y6;

import Q6.t;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaWebFragment f6768b;

    public /* synthetic */ l(MayaWebFragment mayaWebFragment, int i) {
        this.f6767a = i;
        this.f6768b = mayaWebFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6767a) {
            case 0:
                MayaWebFragment mayaWebFragment = this.f6768b;
                Callback.onClick_enter(view);
                try {
                    mayaWebFragment.L1();
                    t tVarP1 = mayaWebFragment.P1();
                    String str = mayaWebFragment.f11964v0;
                    boolean z4 = mayaWebFragment.y0;
                    FragmentActivity activity = mayaWebFragment.getActivity();
                    tVarP1.n(str, z4, activity != null ? v0.s(activity) : false, mayaWebFragment.f11949B0);
                    return;
                } finally {
                }
            default:
                MayaWebFragment mayaWebFragment2 = this.f6768b;
                Callback.onClick_enter(view);
                try {
                    mayaWebFragment2.L1();
                    t tVarP12 = mayaWebFragment2.P1();
                    String str2 = mayaWebFragment2.f11964v0;
                    boolean z5 = mayaWebFragment2.y0;
                    FragmentActivity activity2 = mayaWebFragment2.getActivity();
                    tVarP12.n(str2, z5, activity2 != null ? v0.s(activity2) : false, mayaWebFragment2.f11949B0);
                    return;
                } finally {
                }
        }
    }
}
