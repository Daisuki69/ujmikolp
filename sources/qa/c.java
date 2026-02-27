package qa;

import M8.T2;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.google.gson.internal.h;
import com.google.gson.internal.i;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import d4.AbstractC1331a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import ma.C1859a;
import pg.r;
import pg.s;
import pg.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements ActivityResultCallback, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMayaProfileFragment f19759b;

    public /* synthetic */ c(BaseMayaProfileFragment baseMayaProfileFragment, int i) {
        this.f19758a = i;
        this.f19759b = baseMayaProfileFragment;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        switch (this.f19758a) {
            case 0:
                j.g(activityResult, "<unused var>");
                BaseMayaProfileFragment baseMayaProfileFragment = this.f19759b;
                baseMayaProfileFragment.H1().n();
                baseMayaProfileFragment.H1().m();
                break;
            default:
                j.g(activityResult, "<unused var>");
                this.f19759b.H1().l();
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public void onMethodCall(r rVar, t result) {
        BaseMayaProfileFragment baseMayaProfileFragment = this.f19759b;
        baseMayaProfileFragment.getClass();
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        C1859a c1859aH1 = baseMayaProfileFragment.H1();
                        j.g(result, "result");
                        AbstractC1331a.t("access_token", c1859aH1.j.b(), result);
                        break;
                    }
                    break;
                case -1249356004:
                    if (str.equals("getMin")) {
                        C1859a c1859aH12 = baseMayaProfileFragment.H1();
                        j.g(result, "result");
                        AbstractC1331a.t("min", c1859aH12.j.r(), result);
                        break;
                    }
                    break;
                case -476469337:
                    if (str.equals("finishCurrentModuleForCard")) {
                        result.success(Boolean.TRUE);
                        break;
                    }
                    break;
                case -67833007:
                    if (str.equals("getPinningFingerprint")) {
                        result.success("");
                        break;
                    }
                    break;
                case 200708888:
                    if (str.equals("logAnalyticsEvent")) {
                        C1859a c1859aH13 = baseMayaProfileFragment.H1();
                        String eventArgumentsString = rVar.f19113b.toString();
                        j.g(eventArgumentsString, "eventArgumentsString");
                        try {
                            q qVarG = T2.x(eventArgumentsString).g();
                            String strJ = qVarG.m("event_name").j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o oVarM = qVarG.m("attributes");
                            if (oVarM != null && !(oVarM instanceof p)) {
                                Iterator it = ((i) oVarM.g().f10034a.entrySet()).iterator();
                                while (((h) it).hasNext()) {
                                    com.google.gson.internal.j jVarB = ((h) it).b();
                                    linkedHashMap.put(jVarB.getKey(), ((o) jVarB.getValue()).j());
                                }
                            }
                            linkedHashMap.toString();
                            yk.a.a();
                            pa.a aVar = (pa.a) c1859aH13.c.get();
                            j.d(strJ);
                            ((BaseMayaProfileFragment) aVar).R1(strJ, linkedHashMap);
                        } catch (Exception e) {
                            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
                            yk.a.d();
                            e.printStackTrace();
                            return;
                        }
                        break;
                    }
                    break;
                case 929957753:
                    if (str.equals("getSessionToken")) {
                        C1859a c1859aH14 = baseMayaProfileFragment.H1();
                        j.g(result, "result");
                        AbstractC1331a.t("session_token", c1859aH14.j.s(), result);
                        break;
                    }
                    break;
                case 1243551146:
                    if (str.equals("onSessionTimeout")) {
                        baseMayaProfileFragment.f13500F0 = result;
                        d dVar = baseMayaProfileFragment.f13505L0;
                        if (dVar != null) {
                            ((MayaProfileActivity) dVar).n1().a();
                        }
                        break;
                    }
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        baseMayaProfileFragment.M1();
                        break;
                    }
                    break;
            }
        }
    }
}
