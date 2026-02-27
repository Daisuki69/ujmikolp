package G7;

import android.content.Intent;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaWalletFragment f1825b;

    public /* synthetic */ E(MayaWalletFragment mayaWalletFragment, int i) {
        this.f1824a = i;
        this.f1825b = mayaWalletFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1824a) {
            case 0:
                MayaWalletFragment mayaWalletFragment = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    G g8 = mayaWalletFragment.f12245k1;
                    if (g8 != null) {
                        ((MayaDashboardActivity) g8).j2();
                    }
                    v0.F(mayaWalletFragment, "cash_in", null, 30);
                    return;
                } finally {
                }
            case 1:
                MayaWalletFragment mayaWalletFragment2 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    MayaWalletFragment.W1(mayaWalletFragment2);
                    return;
                } finally {
                }
            case 2:
                MayaWalletFragment mayaWalletFragment3 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    MayaWalletFragment.Y1(mayaWalletFragment3);
                    return;
                } finally {
                }
            case 3:
                MayaWalletFragment mayaWalletFragment4 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    v0.F(mayaWalletFragment4, "auto_cash_in", null, 30);
                    G g10 = mayaWalletFragment4.f12245k1;
                    if (g10 != null) {
                        MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g10;
                        mayaDashboardActivity.n1();
                        B5.i.h0(mayaDashboardActivity);
                    }
                    return;
                } finally {
                }
            case 4:
                MayaWalletFragment mayaWalletFragment5 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    v0.F(mayaWalletFragment5, "see_all_transactions", null, 30);
                    G g11 = mayaWalletFragment5.f12245k1;
                    if (g11 != null) {
                        MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) g11;
                        mayaDashboardActivity2.n1();
                        mayaDashboardActivity2.startActivity(new Intent(mayaDashboardActivity2, (Class<?>) MayaTransactionsActivity.class));
                    }
                    return;
                } finally {
                }
            case 5:
                MayaWalletFragment mayaWalletFragment6 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    v0.F(mayaWalletFragment6, "cash_in", null, 30);
                    G g12 = mayaWalletFragment6.f12245k1;
                    if (g12 != null) {
                        ((MayaDashboardActivity) g12).j2();
                    }
                    return;
                } finally {
                }
            case 6:
                MayaWalletFragment mayaWalletFragment7 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    v0.F(mayaWalletFragment7, "missions", null, 14);
                    G g13 = mayaWalletFragment7.f12245k1;
                    if (g13 != null) {
                        MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) g13;
                        com.paymaya.common.utility.C.Q(mayaDashboardActivity3, mayaDashboardActivity3.getCurrentFocus());
                        mayaDashboardActivity3.n1();
                        Intent intent = new Intent(mayaDashboardActivity3, (Class<?>) MayaMissionsActivity.class);
                        intent.setData(mayaDashboardActivity3.getIntent().getData());
                        B5.i.v0(mayaDashboardActivity3, intent);
                        mayaDashboardActivity3.startActivity(intent);
                    }
                    return;
                } finally {
                }
            case 7:
                MayaWalletFragment mayaWalletFragment8 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    v0.F(mayaWalletFragment8, "rewards", null, 14);
                    G g14 = mayaWalletFragment8.f12245k1;
                    if (g14 != null) {
                        MayaDashboardActivity mayaDashboardActivity4 = (MayaDashboardActivity) g14;
                        com.paymaya.common.utility.C.Q(mayaDashboardActivity4, mayaDashboardActivity4.getCurrentFocus());
                        mayaDashboardActivity4.n1();
                        B5.i.g0(mayaDashboardActivity4, null);
                    }
                    return;
                } finally {
                }
            case 8:
                MayaWalletFragment mayaWalletFragment9 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    MayaWalletFragment.d2(mayaWalletFragment9);
                    return;
                } finally {
                }
            case 9:
                MayaWalletFragment mayaWalletFragment10 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    ((A7.A) mayaWalletFragment10.P1()).l();
                    return;
                } finally {
                }
            default:
                MayaWalletFragment mayaWalletFragment11 = this.f1825b;
                Callback.onClick_enter(view);
                try {
                    ((A7.A) mayaWalletFragment11.P1()).l();
                    return;
                } finally {
                }
        }
    }
}
