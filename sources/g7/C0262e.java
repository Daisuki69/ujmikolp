package G7;

import android.content.Intent;
import cj.L;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.paymaya.domain.model.DashboardTab;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUpdateNameFlutterScreen;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.svM7M6;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: G7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0262e implements pg.s, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaDashboardFragment f1847a;

    public /* synthetic */ C0262e(MayaDashboardFragment mayaDashboardFragment) {
        this.f1847a = mayaDashboardFragment;
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        Object next;
        kotlin.jvm.internal.j.g(tab, "tab");
        MayaDashboardFragment mayaDashboardFragment = this.f1847a;
        Iterator it = mayaDashboardFragment.f12169i0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((Pair) mayaDashboardFragment.f12170j0.get(i)).f18161b, ((DashboardTab) ((IndexedValue) next).f18164b).getId())) {
                    break;
                }
            }
        }
        IndexedValue indexedValue = (IndexedValue) next;
        if (indexedValue != null) {
            DashboardTab dashboardTab = (DashboardTab) indexedValue.f18164b;
            tab.setText(dashboardTab.getName());
            tab.setTag(dashboardTab.getId());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public void onMethodCall(pg.r call, pg.t result) {
        InterfaceC0263f interfaceC0263f;
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        MayaDashboardFragment mayaDashboardFragment = this.f1847a;
        C0260c c0260c = new C0260c(mayaDashboardFragment, 0);
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            Object obj = call.f19113b;
            switch (iHashCode) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        mayaDashboardFragment.G1().r(result);
                        break;
                    }
                    break;
                case -1409322688:
                    if (str.equals("getSourcePage")) {
                        mayaDashboardFragment.G1();
                        result.success(L.c(new Pair("source_page", "Dashboard")));
                        break;
                    }
                    break;
                case -1097329270:
                    if (str.equals("logout")) {
                        A7.h hVarG1 = mayaDashboardFragment.G1();
                        hVarG1.e(new Hh.a(new Hh.f(hVarG1.i.b(), zh.b.a(), 0), new A7.c(hVarG1, 0), 1).c());
                        break;
                    }
                    break;
                case -978637609:
                    if (str.equals("goToUpdateName")) {
                        Map map = obj instanceof Map ? (Map) obj : null;
                        String strValueOf = String.valueOf(map != null ? map.get("source_page") : null);
                        String strValueOf2 = String.valueOf(map != null ? map.get(Constants.REASON) : null);
                        InterfaceC0263f interfaceC0263f2 = mayaDashboardFragment.f12175p0;
                        if (interfaceC0263f2 != null) {
                            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f2;
                            mayaDashboardActivity.n1();
                            MayaUpdateNameFlutterScreen.j = strValueOf;
                            MayaUpdateNameFlutterScreen.f12208k = strValueOf2;
                            FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("updateName");
                            if (flutterEngine == null) {
                                flutterEngine = new FlutterEngine(mayaDashboardActivity.getApplicationContext());
                            }
                            flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runUpdateName"));
                            FlutterEngineCache.getInstance().put("updateName", flutterEngine);
                            MayaUpdateNameFlutterScreen.i = c0260c;
                            Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaUpdateNameFlutterScreen.class, "updateName").backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build(mayaDashboardActivity);
                            intentBuild.putExtra("page_source", strValueOf);
                            intentBuild.putExtra(Constants.REASON, strValueOf2);
                            mayaDashboardActivity.startActivityForResult(intentBuild, 70);
                        }
                        break;
                    }
                    break;
                case -75308287:
                    if (str.equals("getName")) {
                        AbstractC1331a.t(AppMeasurementSdk.ConditionalUserProperty.NAME, mayaDashboardFragment.G1().m.a().getFullNameWithMiddleName(), result);
                        break;
                    }
                    break;
                case 74400163:
                    if (str.equals("getRestrictionCode")) {
                        AbstractC1331a.t("restriction_code", svM7M6.getString(mayaDashboardFragment.G1().f212d.f11330b, "key_restrictions", ""), result);
                        break;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        mayaDashboardFragment.G1().z(obj.toString());
                        break;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        mayaDashboardFragment.G1().x(result);
                        break;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        FlutterEngineCache.getInstance().remove("rlfFullscreen");
                        result.success(Boolean.TRUE);
                        mayaDashboardFragment.requireActivity().finishActivity(69);
                        break;
                    }
                    break;
                case 1715875100:
                    if (str.equals("toKycFlowFromRestrictedLogin") && (interfaceC0263f = mayaDashboardFragment.f12175p0) != null) {
                        MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) interfaceC0263f;
                        com.paymaya.common.utility.C.Q(mayaDashboardActivity2, mayaDashboardActivity2.getCurrentFocus());
                        mayaDashboardActivity2.n1().s(mayaDashboardActivity2, false);
                    }
                    break;
            }
        }
    }
}
