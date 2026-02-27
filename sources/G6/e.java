package G6;

import M8.T2;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1293x0;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import y5.AbstractC2509a;
import z6.InterfaceC2553a;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1781d;
    public final S5.c e;
    public final C1293x0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1265j f1782g;
    public final /* synthetic */ int h;

    public e(com.paymaya.data.preference.a aVar, S5.c cVar, C1293x0 c1293x0, C1265j c1265j, int i) {
        this.h = i;
        this.f1781d = aVar;
        this.e = cVar;
        this.f = c1293x0;
        this.f1782g = c1265j;
    }

    public final Map k() {
        Map<String, Boolean> cardsFlutterToggles = this.f1781d.e().getCardsFlutterToggles();
        A5.b bVar = A5.b.f79T0;
        S5.c cVar = this.e;
        AbstractC1414e.k(cVar, bVar, cardsFlutterToggles, "maya_black_intro");
        AbstractC1414e.k(cVar, A5.b.f67K0, cardsFlutterToggles, "convert_to_installment");
        AbstractC1414e.k(cVar, A5.b.f68L0, cardsFlutterToggles, "maya_black_credit_card");
        AbstractC1414e.k(cVar, A5.b.N0, cardsFlutterToggles, "landers_credit_card");
        AbstractC1414e.k(cVar, A5.b.f59F0, cardsFlutterToggles, "cc_dbl");
        AbstractC1414e.k(cVar, A5.b.f145x0, cardsFlutterToggles, "landers_monthly_millionaire");
        AbstractC1414e.k(cVar, A5.b.f85W0, cardsFlutterToggles, "maya_pay");
        AbstractC1414e.k(cVar, A5.b.g1, cardsFlutterToggles, "ad_kit");
        return cardsFlutterToggles;
    }

    public final void l(String str, LinkedHashMap linkedHashMap) {
        switch (this.h) {
            case 0:
                ((T6.b) ((H6.a) this.c.get())).h2(str, linkedHashMap);
                break;
            case 1:
                ((T6.b) ((W9.a) this.c.get())).h2(str, linkedHashMap);
                break;
            default:
                ((T6.b) ((InterfaceC2553a) this.c.get())).h2(str, linkedHashMap);
                break;
        }
    }

    public final void m(pg.t tVar) {
        AbstractC1331a.t("access_token", this.f1781d.b(), tVar);
    }

    public final void n(pg.t tVar) {
        AbstractC1331a.t("min", this.f1781d.r(), tVar);
    }

    public final void o(pg.t tVar) {
        AbstractC1331a.t("session_token", this.f1781d.s(), tVar);
    }

    public final void p(pg.t tVar) {
        AbstractC1331a.t("shield_session_id", i0.b(), tVar);
    }

    public final void q(String eventArgumentsString) {
        kotlin.jvm.internal.j.g(eventArgumentsString, "eventArgumentsString");
        try {
            com.google.gson.q qVarG = T2.x(eventArgumentsString).g();
            String strJ = qVarG.m("event_name").j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            com.google.gson.o oVarM = qVarG.m("attributes");
            if (oVarM != null && !(oVarM instanceof com.google.gson.p)) {
                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                while (((com.google.gson.internal.h) it).hasNext()) {
                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                    linkedHashMap.put(jVarB.getKey(), ((com.google.gson.o) jVarB.getValue()).j());
                }
            }
            linkedHashMap.toString();
            yk.a.a();
            kotlin.jvm.internal.j.d(strJ);
            l(strJ, linkedHashMap);
        } catch (Exception unused) {
            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
            yk.a.d();
        }
    }
}
