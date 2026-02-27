package C7;

import android.content.Intent;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.inboxsupport.view.activity.impl.MayaInboxSupportActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDashboardActivity f746b;

    public /* synthetic */ c(MayaDashboardActivity mayaDashboardActivity, int i) {
        this.f745a = i;
        this.f746b = mayaDashboardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MayaDashboardActivity mayaDashboardActivity = this.f746b;
        switch (this.f745a) {
            case 0:
                int i = MayaDashboardActivity.f12133U;
                Callback.onClick_enter(view);
                try {
                    mayaDashboardActivity.X1("Background", "Dashboard");
                    return;
                } finally {
                }
            case 1:
                int i4 = MayaDashboardActivity.f12133U;
                Callback.onClick_enter(view);
                try {
                    mayaDashboardActivity.X1("Close", "Dashboard");
                    return;
                } finally {
                }
            case 2:
                int i6 = MayaDashboardActivity.f12133U;
                Callback.onClick_enter(view);
                try {
                    mayaDashboardActivity.X1("Tooltip", "Pay screen");
                    mayaDashboardActivity.o2("pay");
                    return;
                } finally {
                }
            case 3:
                int i10 = MayaDashboardActivity.f12133U;
                Callback.onClick_enter(view);
                try {
                    mayaDashboardActivity.X1("Tooltip", "Pay screen");
                    mayaDashboardActivity.o2("pay");
                    return;
                } finally {
                }
            case 4:
                int i11 = MayaDashboardActivity.f12133U;
                Callback.onClick_enter(view);
                try {
                    mayaDashboardActivity.g2("wallet_tab");
                    j.d(view);
                    mayaDashboardActivity.c2(view, true);
                    return;
                } finally {
                }
            case 5:
                int i12 = MayaDashboardActivity.f12133U;
                Callback.onClick_enter(view);
                try {
                    mayaDashboardActivity.g2("scan_qr");
                    j.d(view);
                    mayaDashboardActivity.c2(view, true);
                    return;
                } finally {
                }
            case 6:
                int i13 = MayaDashboardActivity.f12133U;
                Callback.onClick_enter(view);
                try {
                    mayaDashboardActivity.g2("more");
                    mayaDashboardActivity.f12139S = "nav_tapped";
                    j.d(view);
                    mayaDashboardActivity.c2(view, true);
                    return;
                } finally {
                }
            default:
                int i14 = MayaDashboardActivity.f12133U;
                Callback.onClick_enter(view);
                try {
                    if (S5.c.b(mayaDashboardActivity.m1(), A5.b.f123o)) {
                        mayaDashboardActivity.n1();
                        Intent intent = new Intent(mayaDashboardActivity, (Class<?>) MayaInboxSupportActivity.class);
                        intent.putExtra("intent", "dedup");
                        mayaDashboardActivity.startActivity(intent);
                    } else {
                        mayaDashboardActivity.n1().w(mayaDashboardActivity, "https://cares.paymaya.com/s/article/What-do-I-do-if-my-PayMaya-account-is-tagged-as-a-duplicate-one");
                    }
                    return;
                } finally {
                }
        }
    }
}
