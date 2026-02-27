package Le;

import D.B;
import D.C0187u;
import D.S;
import M8.C0332a;
import M8.T2;
import android.app.Activity;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import bj.InterfaceC1031b;
import cj.L;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.i0;
import d4.AbstractC1331a;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l9.C1803a;
import pg.r;
import pg.s;
import pg.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements s, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2976b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1031b f2977d;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, InterfaceC1031b interfaceC1031b) {
        this.f2975a = obj;
        this.f2976b = obj2;
        this.c = obj3;
        this.f2977d = interfaceC1031b;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        I1.a aVar = (I1.a) this.f2975a;
        S logger = (S) this.f2976b;
        kotlin.jvm.internal.j.g(logger, "$logger");
        N9.f fVar = (N9.f) this.c;
        C0332a c0332a = (C0332a) this.f2977d;
        kotlin.jvm.internal.j.g(task, "task");
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if (C0187u.c > 0) {
                Log.d("CleverTap", "Could not launch Play Store Review flow.", exception);
            }
            fVar.invoke(task.getException());
            return;
        }
        ReviewInfo reviewInfo = (ReviewInfo) task.getResult();
        Activity activityF = B.f();
        if (activityF == null) {
            S.f("Could not launch Play Store Review flow: current Activity is null.");
            fVar.invoke(null);
        } else {
            Task taskA = ((com.google.android.play.core.review.b) aVar).a(activityF, reviewInfo);
            kotlin.jvm.internal.j.f(taskA, "launchReviewFlow(...)");
            taskA.addOnCompleteListener(new C1803a(c0332a, 4));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public void onMethodCall(r call, t result) {
        Function1 function1 = (Function1) this.f2977d;
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            FragmentActivity fragmentActivity = (FragmentActivity) this.f2976b;
            m mVar = (m) this.f2975a;
            Object obj = call.f19113b;
            switch (iHashCode) {
                case -2053916147:
                    if (str.equals("onDepositLater")) {
                        mVar.getClass();
                        m.b();
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        AbstractC1331a.t("access_token", mVar.f2979b.b(), result);
                        return;
                    }
                    break;
                case -1308658756:
                    if (str.equals("getClientId")) {
                        AbstractC1331a.t("client_id", mVar.f2979b.h(), result);
                        return;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        AbstractC1331a.t("min", mVar.f2979b.r(), result);
                        return;
                    }
                    break;
                case -1179101518:
                    if (str.equals("getShieldSessionId")) {
                        AbstractC1331a.t("shield_session_id", i0.b(), result);
                        return;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        mVar.getClass();
                        try {
                            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.String");
                            q qVarG = T2.x((String) obj).g();
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
                            C1220i c1220i = mVar.c;
                            C1219h c1219hE = C1219h.e(strJ);
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                c1219hE.h((String) entry.getKey(), (String) entry.getValue());
                            }
                            Unit unit = Unit.f18162a;
                            c1220i.c(fragmentActivity, c1219hE);
                            return;
                        } catch (Exception e) {
                            Objects.toString(obj);
                            yk.a.d();
                            e.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 827711050:
                    if (str.equals("getToggle")) {
                        String str2 = obj instanceof String ? (String) obj : null;
                        if (kotlin.jvm.internal.j.b(str2, "coreUiWidgets")) {
                            result.success(Boolean.valueOf(S5.c.b(mVar.f2980d, A5.b.D1)));
                            return;
                        } else if (kotlin.jvm.internal.j.b(str2, "mbxPhase2")) {
                            result.success(Boolean.valueOf(S5.c.b(mVar.f2980d, A5.b.f69M0)));
                            return;
                        } else {
                            result.success(Boolean.FALSE);
                            return;
                        }
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        AbstractC1331a.t("session_token", mVar.f2979b.s(), result);
                        return;
                    }
                    break;
                case 1186364269:
                    if (str.equals("getAppVersion")) {
                        AbstractC1331a.t("app_version", "2.153.0 (13435)", result);
                        return;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        mVar.f2978a.a();
                        return;
                    }
                    break;
                case 1333731827:
                    if (str.equals("openCreateSavings")) {
                        B5.i iVar = mVar.f2978a;
                        B5.i.k(fragmentActivity, "paymaya://create_savings");
                        return;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        FlutterEngineCache.getInstance().remove("securityDeposit");
                        mVar.a(fragmentActivity);
                        fragmentActivity.finishActivity(1200);
                        m.b();
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 1696872414:
                    if (str.equals("getInputData")) {
                        result.success((Map) this.c);
                        return;
                    }
                    break;
                case 1913395938:
                    if (str.equals("onSuccessfullyCreated")) {
                        mVar.getClass();
                        if (obj == null || !(obj instanceof Map)) {
                            result.error("INVALID_ARGUMENT", "Expected Map<String, String> as argument, but found null or incorrect type.", null);
                            return;
                        }
                        try {
                            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
                            int iB = L.b(cj.t.l(setEntrySet, 10));
                            if (iB < 16) {
                                iB = 16;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                            for (Map.Entry entry2 : setEntrySet) {
                                Object key = entry2.getKey();
                                Object value = entry2.getValue();
                                kotlin.jvm.internal.j.e(key, "null cannot be cast to non-null type kotlin.String");
                                kotlin.jvm.internal.j.e(value, "null cannot be cast to non-null type kotlin.String");
                                linkedHashMap2.put((String) key, (String) value);
                            }
                            function1.invoke(linkedHashMap2);
                            result.success(Boolean.TRUE);
                            Unit unit2 = Unit.f18162a;
                            return;
                        } catch (ClassCastException e7) {
                            result.error("INVALID_ARGUMENT", "Expected Map<String, String> as argument, but found incorrect key/value types.", e7);
                            return;
                        }
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
