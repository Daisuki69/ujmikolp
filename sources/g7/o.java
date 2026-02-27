package G7;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaAdsInternalOnlyActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaServicesV2Fragment f1916b;

    public /* synthetic */ o(MayaServicesV2Fragment mayaServicesV2Fragment, int i) {
        this.f1915a = i;
        this.f1916b = mayaServicesV2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1915a) {
            case 0:
                MayaServicesV2Fragment mayaServicesV2Fragment = this.f1916b;
                Callback.onClick_enter(view);
                try {
                    MayaServicesV2Fragment.J1(mayaServicesV2Fragment, "chat");
                    q qVar = mayaServicesV2Fragment.m0;
                    if (qVar != null) {
                        ((MayaDashboardActivity) qVar).b2(com.paymaya.common.utility.C.d("paymaya://inbox", "route", "fullscreenFlowEntrypoint"));
                    }
                    return;
                } finally {
                }
            case 1:
                MayaServicesV2Fragment mayaServicesV2Fragment2 = this.f1916b;
                Callback.onClick_enter(view);
                try {
                    MayaServicesV2Fragment.J1(mayaServicesV2Fragment2, "help_center");
                    q qVar2 = ((MayaServicesV2Fragment) ((F7.b) mayaServicesV2Fragment2.G1().c.get())).m0;
                    if (qVar2 != null) {
                        ((MayaDashboardActivity) qVar2).Y1().p();
                    }
                    return;
                } finally {
                }
            case 2:
                MayaServicesV2Fragment mayaServicesV2Fragment3 = this.f1916b;
                Callback.onClick_enter(view);
                try {
                    MayaServicesV2Fragment.J1(mayaServicesV2Fragment3, "profile_menu");
                    q qVar3 = mayaServicesV2Fragment3.m0;
                    if (qVar3 != null) {
                        MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) qVar3;
                        mayaDashboardActivity.n1();
                        B5.i.N(mayaDashboardActivity);
                    }
                    return;
                } finally {
                }
            case 3:
                MayaServicesV2Fragment mayaServicesV2Fragment4 = this.f1916b;
                Callback.onClick_enter(view);
                try {
                    MayaServicesV2Fragment.J1(mayaServicesV2Fragment4, "setting");
                    q qVar4 = mayaServicesV2Fragment4.m0;
                    if (qVar4 != null) {
                        MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) qVar4;
                        com.paymaya.common.utility.C.Q(mayaDashboardActivity2, mayaDashboardActivity2.getCurrentFocus());
                        mayaDashboardActivity2.n1();
                        B5.i.V(mayaDashboardActivity2, null);
                    }
                    return;
                } finally {
                }
            case 4:
                MayaServicesV2Fragment mayaServicesV2Fragment5 = this.f1916b;
                Callback.onClick_enter(view);
                try {
                    MayaServicesV2Fragment.J1(mayaServicesV2Fragment5, "about_maya");
                    q qVar5 = mayaServicesV2Fragment5.m0;
                    if (qVar5 != null) {
                        MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) qVar5;
                        mayaDashboardActivity3.n1().i0(mayaDashboardActivity3, "https://www.paymaya.com/about", mayaServicesV2Fragment5.getString(R.string.maya_label_about_maya));
                    }
                    return;
                } finally {
                }
            case 5:
                MayaServicesV2Fragment mayaServicesV2Fragment6 = this.f1916b;
                Callback.onClick_enter(view);
                try {
                    MayaServicesV2Fragment.J1(mayaServicesV2Fragment6, "ads_internal_only");
                    q qVar6 = mayaServicesV2Fragment6.m0;
                    if (qVar6 != null) {
                        MayaDashboardActivity mayaDashboardActivity4 = (MayaDashboardActivity) qVar6;
                        mayaDashboardActivity4.n1();
                        mayaDashboardActivity4.startActivity(new Intent(mayaDashboardActivity4.getApplicationContext(), (Class<?>) MayaAdsInternalOnlyActivity.class));
                    }
                    return;
                } finally {
                }
            case 6:
                MayaServicesV2Fragment mayaServicesV2Fragment7 = this.f1916b;
                Callback.onClick_enter(view);
                try {
                    q qVar7 = mayaServicesV2Fragment7.m0;
                    if (qVar7 != null) {
                        ((MayaDashboardActivity) qVar7).r2("Services", "Security Center Button");
                    }
                    return;
                } finally {
                }
            default:
                MayaServicesV2Fragment mayaServicesV2Fragment8 = this.f1916b;
                Callback.onClick_enter(view);
                try {
                    q qVar8 = mayaServicesV2Fragment8.m0;
                    if (qVar8 != null) {
                        MayaDashboardActivity mayaDashboardActivity5 = (MayaDashboardActivity) qVar8;
                        ImageView imageView = mayaDashboardActivity5.f12141n;
                        if (imageView == null) {
                            kotlin.jvm.internal.j.n("homeIcon");
                            throw null;
                        }
                        mayaDashboardActivity5.c2(imageView, true);
                    }
                    return;
                } finally {
                }
        }
    }
}
