package L6;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;

/* JADX INFO: renamed from: L6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0321g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBankPullV2Fragment f2830b;

    public /* synthetic */ ViewOnClickListenerC0321g(MayaBankPullV2Fragment mayaBankPullV2Fragment, int i) {
        this.f2829a = i;
        this.f2830b = mayaBankPullV2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2829a) {
            case 0:
                MayaBankPullV2Fragment mayaBankPullV2Fragment = this.f2830b;
                Callback.onClick_enter(view);
                try {
                    MayaBankPullV2Fragment.R1(mayaBankPullV2Fragment);
                    return;
                } finally {
                }
            case 1:
                MayaBankPullV2Fragment mayaBankPullV2Fragment2 = this.f2830b;
                Callback.onClick_enter(view);
                try {
                    mayaBankPullV2Fragment2.S1();
                    return;
                } finally {
                }
            default:
                MayaBankPullV2Fragment mayaBankPullV2Fragment3 = this.f2830b;
                Callback.onClick_enter(view);
                try {
                    mayaBankPullV2Fragment3.S1();
                    return;
                } finally {
                }
        }
    }
}
