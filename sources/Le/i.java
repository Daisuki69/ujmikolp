package Le;

import M8.T2;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import cj.L;
import cj.M;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.common.view.activity.impl.MayaFullScreenFlutterFragmentActivity;
import d4.AbstractC1331a;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B5.i f2973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2974b;
    public final C1220i c;

    public i(B5.i iVar, com.paymaya.data.preference.a aVar, C1220i c1220i) {
        this.f2973a = iVar;
        this.f2974b = aVar;
        this.c = c1220i;
    }

    public final void a(FragmentActivity fragmentActivity) {
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("incomeDocumentation");
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(fragmentActivity.getApplicationContext());
        }
        FlutterEngineCache.getInstance().put("incomeDocumentation", flutterEngine);
    }

    public final void b(final FragmentActivity fragmentActivity, final String str, final String str2, final String str3, final String str4, final String str5, final Function1 function1) {
        DartExecutor dartExecutor;
        DartExecutor dartExecutor2;
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("incomeDocumentation");
        if (flutterEngine != null && (dartExecutor2 = flutterEngine.getDartExecutor()) != null) {
            dartExecutor2.executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runIncomeDocumentation"));
        }
        if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
            new u(dartExecutor.getBinaryMessenger(), "packages/income_documentation").b(new s() { // from class: Le.h
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // pg.s
                public final void onMethodCall(r call, t result) {
                    kotlin.jvm.internal.j.g(call, "call");
                    kotlin.jvm.internal.j.g(result, "result");
                    String str6 = call.f19112a;
                    if (str6 != null) {
                        int iHashCode = str6.hashCode();
                        FragmentActivity fragmentActivity2 = fragmentActivity;
                        i iVar = this.f2969a;
                        Object obj = call.f19113b;
                        switch (iHashCode) {
                            case -1682957889:
                                if (str6.equals("getAccessToken")) {
                                    AbstractC1331a.t("access_token", iVar.f2974b.b(), result);
                                    break;
                                }
                                break;
                            case -1465789726:
                                if (str6.equals("getCMSAccessToken")) {
                                    AbstractC1331a.t("access_token", "102a957b38ccaf3b7a38e990f75941d726378296d8433278cccebecca83ea6b8323de7817d42343808997119b36261aa92246d1addcb5b94de090118b124862b1b6817b97b7b68cb4f347aa920faab6148dd615788ab3fa7bb5e1523faf5f8b80a847bddde72c0a80d4bb0c4b11850e7e62c7f06e1e72ddcebeaac3e8ac5ec84", result);
                                    break;
                                }
                                break;
                            case -1259032276:
                                if (str6.equals("onSubmitSuccess")) {
                                    String strK = A.f10366a.k(obj);
                                    kotlin.jvm.internal.j.d(strK);
                                    function1.invoke(strK);
                                    break;
                                }
                                break;
                            case 200708888:
                                if (str6.equals("logAnalyticsEvent")) {
                                    iVar.getClass();
                                    try {
                                        q qVarG = T2.x(obj.toString()).g();
                                        String strJ = qVarG.m("event_name").j();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        o oVarM = qVarG.m("attributes");
                                        if (oVarM != null && !(oVarM instanceof p)) {
                                            Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                                            while (((com.google.gson.internal.h) it).hasNext()) {
                                                com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                                                linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                            }
                                        }
                                        linkedHashMap.toString();
                                        yk.a.a();
                                        C1220i c1220i = iVar.c;
                                        C1219h c1219hE = C1219h.e(strJ);
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
                                        }
                                        Unit unit = Unit.f18162a;
                                        c1220i.c(fragmentActivity2, c1219hE);
                                    } catch (Exception e) {
                                        yk.a.d();
                                        e.printStackTrace();
                                        return;
                                    }
                                    break;
                                }
                                break;
                            case 791891280:
                                if (str6.equals("getIncomeDocsScreenData")) {
                                    result.success(L.c(new Pair("data", M.h(new Pair("title", str), new Pair("subtitle", str2), new Pair("source_page", str3), new Pair("source_button", str4), new Pair("product_type", str5)))));
                                    break;
                                }
                                break;
                            case 929957753:
                                if (str6.equals("getSessionToken")) {
                                    AbstractC1331a.t("session_token", iVar.f2974b.s(), result);
                                    break;
                                }
                                break;
                            case 1243551146:
                                if (str6.equals("onSessionTimeout")) {
                                    iVar.f2973a.a();
                                    break;
                                }
                                break;
                            case 1671672458:
                                if (str6.equals("dismiss")) {
                                    FlutterEngineCache.getInstance().remove("incomeDocumentation");
                                    iVar.a(fragmentActivity2);
                                    fragmentActivity2.finishActivity(300);
                                    result.success(Boolean.TRUE);
                                    break;
                                }
                                break;
                        }
                    }
                }
            });
        }
        Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaFullScreenFlutterFragmentActivity.class, "incomeDocumentation").build(fragmentActivity.getApplicationContext());
        kotlin.jvm.internal.j.f(intentBuild, "build(...)");
        intentBuild.putExtra("engineId", "incomeDocumentation");
        fragmentActivity.startActivityForResult(intentBuild, 300);
    }
}
