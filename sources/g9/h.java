package G9;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsHomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMissionsHomeFragment f1932b;

    public /* synthetic */ h(MayaMissionsHomeFragment mayaMissionsHomeFragment, int i) {
        this.f1931a = i;
        this.f1932b = mayaMissionsHomeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1931a) {
            case 0:
                MayaMissionsHomeFragment mayaMissionsHomeFragment = this.f1932b;
                Callback.onClick_enter(view);
                try {
                    MayaMissionsHomeFragment.Q1(mayaMissionsHomeFragment);
                    return;
                } finally {
                }
            case 1:
                MayaMissionsHomeFragment mayaMissionsHomeFragment2 = this.f1932b;
                Callback.onClick_enter(view);
                try {
                    mayaMissionsHomeFragment2.O1();
                    ((B9.d) mayaMissionsHomeFragment2.P1()).k();
                    return;
                } finally {
                }
            default:
                MayaMissionsHomeFragment mayaMissionsHomeFragment3 = this.f1932b;
                Callback.onClick_enter(view);
                try {
                    mayaMissionsHomeFragment3.O1();
                    ((B9.d) mayaMissionsHomeFragment3.P1()).k();
                    return;
                } finally {
                }
        }
    }
}
