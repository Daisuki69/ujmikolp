package M7;

import A5.f;
import M8.D0;
import N5.F;
import Uh.d;
import a7.C0657r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.DataPrivacyProvision;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAppMaintenanceFragment;
import com.paymaya.mayaui.creatorstore.view.activity.impl.MayaCreatorStoreActivity;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaAutoProvisionDataPrivacyPolicyFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaWelcomeV2Fragment;
import com.paymaya.mayaui.score.view.activity.impl.MayaScoreActivity;
import eb.g;
import eb.q;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import m7.InterfaceC1853a;
import pg.u;
import wb.InterfaceC2389a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3127d;
    public final com.paymaya.data.preference.a e;
    public final S5.c f;

    public /* synthetic */ a(com.paymaya.data.preference.a aVar, S5.c cVar, int i) {
        this.f3127d = i;
        this.e = aVar;
        this.f = cVar;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        ArrayList<DataPrivacyProvision> arrayList;
        DartExecutor dartExecutor;
        int i = 1;
        switch (this.f3127d) {
            case 0:
                super.j();
                LinearLayout linearLayout = ((MayaAutoProvisionDataPrivacyPolicyFragment) ((R7.a) this.c.get())).f12273Y;
                if (linearLayout == null) {
                    j.n("mAutoProvisionsContainerLinearLayout");
                    throw null;
                }
                linearLayout.removeAllViews();
                com.paymaya.data.preference.a preference = this.e;
                j.g(preference, "preference");
                preference.M();
                preference.N();
                boolean zB = S5.c.b(this.f, A5.b.f55C1);
                Bundle arguments = ((MayaAutoProvisionDataPrivacyPolicyFragment) ((R7.a) this.c.get())).getArguments();
                if (arguments == null || (arrayList = arguments.getParcelableArrayList("data_privacy_provisions")) == null) {
                    arrayList = new ArrayList();
                }
                for (DataPrivacyProvision dataPrivacyProvision : arrayList) {
                    MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = (MayaAutoProvisionDataPrivacyPolicyFragment) ((R7.a) this.c.get());
                    mayaAutoProvisionDataPrivacyPolicyFragment.getClass();
                    j.g(dataPrivacyProvision, "dataPrivacyProvision");
                    Context contextRequireContext = mayaAutoProvisionDataPrivacyPolicyFragment.requireContext();
                    j.f(contextRequireContext, "requireContext(...)");
                    C0657r c0657r = new C0657r(contextRequireContext);
                    c0657r.b(dataPrivacyProvision.getIcon(), dataPrivacyProvision.getBgColor());
                    c0657r.setProvisionItemName(dataPrivacyProvision.getName());
                    c0657r.setProvisionItemSpiel(dataPrivacyProvision.getDescription());
                    c0657r.setProvisionCheckBoxChecked(dataPrivacyProvision.isChecked());
                    c0657r.setProvisionCheckboxEnabled(dataPrivacyProvision.isEditable());
                    c0657r.setProvisionCheckboxHidden(zB);
                    c0657r.setProvisionOnCheckedListener(new D0(i, mayaAutoProvisionDataPrivacyPolicyFragment, dataPrivacyProvision));
                    LinearLayout linearLayout2 = mayaAutoProvisionDataPrivacyPolicyFragment.f12273Y;
                    if (linearLayout2 == null) {
                        j.n("mAutoProvisionsContainerLinearLayout");
                        throw null;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, mayaAutoProvisionDataPrivacyPolicyFragment.getResources().getDimensionPixelSize(R.dimen.pma_margin_medium), 0, 0);
                    linearLayout2.addView(c0657r, layoutParams);
                }
                if (S5.c.b(this.f, A5.b.f55C1)) {
                    F f = ((MayaAutoProvisionDataPrivacyPolicyFragment) ((R7.a) this.c.get())).f12270V;
                    j.d(f);
                    ((TextView) f.e).setVisibility(0);
                    return;
                } else {
                    F f3 = ((MayaAutoProvisionDataPrivacyPolicyFragment) ((R7.a) this.c.get())).f12270V;
                    j.d(f3);
                    ((TextView) f3.e).setVisibility(8);
                    return;
                }
            case 1:
                super.j();
                MayaMaintenanceActivity mayaMaintenanceActivity = (MayaMaintenanceActivity) ((S6.c) this.c.get());
                mayaMaintenanceActivity.getClass();
                AbstractC1236z.a(mayaMaintenanceActivity, R.id.frame_layout_fragment_container, new MayaAppMaintenanceFragment());
                return;
            case 6:
                super.j();
                MayaScoreActivity mayaScoreActivity = (MayaScoreActivity) ((InterfaceC2389a) this.c.get());
                mayaScoreActivity.getClass();
                C.i("MayaScoreActivity", "showMayaScoreFlutterFragment");
                FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("mayaScoreActivity");
                if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                    dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runXPFullScreen"));
                }
                Map mapH = M.h(new Pair("source", mayaScoreActivity.getIntent().getStringExtra("source")), new Pair("route", mayaScoreActivity.getIntent().getStringExtra("route")));
                u uVar = mayaScoreActivity.f13735o;
                if (uVar != null) {
                    uVar.a("requestFullscreen", mapH, null);
                }
                AbstractC1236z.g(mayaScoreActivity, R.id.constraint_layout_score, FlutterFragment.withCachedEngine("mayaScoreActivity").renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build());
                return;
            default:
                super.j();
                return;
        }
    }

    public void k() {
        Object objA;
        if (this.e.J()) {
            String strD = this.f.d(f.f158d);
            try {
                C1037h.a aVar = C1037h.f9166b;
                objA = (MaintenanceDynamicConfig) A.f10366a.e(strD, MaintenanceDynamicConfig.class);
            } catch (Throwable th2) {
                C1037h.a aVar2 = C1037h.f9166b;
                objA = AbstractC1039j.a(th2);
            }
            if (objA instanceof C1038i) {
                objA = null;
            }
            MaintenanceDynamicConfig maintenanceDynamicConfig = (MaintenanceDynamicConfig) objA;
            if (maintenanceDynamicConfig == null) {
                maintenanceDynamicConfig = new MaintenanceDynamicConfig(false, null, 3, null);
            }
            if (maintenanceDynamicConfig.isAppMaintenance()) {
                return;
            }
            if (this.e.G()) {
                this.e.r0(true);
                ((MayaMaintenanceActivity) ((S6.c) this.c.get())).n1().a();
            } else {
                MayaMaintenanceActivity mayaMaintenanceActivity = (MayaMaintenanceActivity) ((S6.c) this.c.get());
                mayaMaintenanceActivity.n1().z(mayaMaintenanceActivity);
            }
        }
    }

    public void l(String str) {
        com.paymaya.data.preference.a aVar = this.e;
        aVar.getClass();
        if (aVar.f11330b.getStringSet("key_creator_store_introduction_shown", new HashSet()).contains(str)) {
            ((MayaCreatorStoreActivity) ((InterfaceC1853a) this.c.get())).X1(str);
        } else {
            ((MayaCreatorStoreActivity) ((InterfaceC1853a) this.c.get())).W1(str);
        }
    }

    public void m() {
        if (!this.e.E()) {
            MayaWelcomeV2Fragment mayaWelcomeV2Fragment = (MayaWelcomeV2Fragment) ((db.c) this.c.get());
            q qVar = mayaWelcomeV2Fragment.f13697X;
            if (qVar != null) {
                ((MayaWelcomeActivity) qVar).V1(new g(1, mayaWelcomeV2Fragment, MayaWelcomeV2Fragment.class, "handleLogin", "handleLogin(Landroidx/activity/result/ActivityResult;)V", 0, 7));
                return;
            }
            return;
        }
        MayaWelcomeV2Fragment mayaWelcomeV2Fragment2 = (MayaWelcomeV2Fragment) ((db.c) this.c.get());
        q qVar2 = mayaWelcomeV2Fragment2.f13697X;
        if (qVar2 != null) {
            MayaWelcomeActivity mayaWelcomeActivity = (MayaWelcomeActivity) qVar2;
            mayaWelcomeActivity.f12737o = new g(1, mayaWelcomeV2Fragment2, MayaWelcomeV2Fragment.class, "handleLogin", "handleLogin(Landroidx/activity/result/ActivityResult;)V", 0, 6);
            mayaWelcomeActivity.n1();
            mayaWelcomeActivity.f12739q.launch(new Intent(mayaWelcomeActivity.getApplicationContext(), (Class<?>) MayaLoginActivity.class));
        }
    }

    public a(com.paymaya.data.preference.a preference, S5.c flagConfigurationService) {
        this.f3127d = 1;
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.e = preference;
        this.f = flagConfigurationService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(S5.c cVar, d dVar, com.paymaya.data.preference.a aVar) {
        super(dVar);
        this.f3127d = 0;
        this.e = aVar;
        this.f = cVar;
    }

    public a(com.paymaya.data.preference.a aVar, S5.c cVar, Z0 z02) {
        this.f3127d = 2;
        this.e = aVar;
        this.f = cVar;
    }
}
