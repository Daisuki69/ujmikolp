package com.paymaya.domain.store;

import M8.T2;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.DecoratedActivity;
import com.paymaya.domain.model.Decoration;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11345b;
    public final com.paymaya.data.database.repository.n c;

    static {
        new Decoration("2019-05-28T07:02:16.232Z", "2019-05-28T07:02:16.232Z", "0", "DEFAULT", "DEFAULT", "DEFAULT", "", "", 0, false);
    }

    public E(PayMayaClientApi mPayMayaClientApi, com.paymaya.data.database.repository.n mDecorationRepository) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mDecorationRepository, "mDecorationRepository");
        this.f11345b = mPayMayaClientApi;
        this.c = mDecorationRepository;
    }

    public final Ah.p a(String str, String str2) {
        HashMap mapS = T2.s();
        mapS.put("identifier_type", str);
        mapS.put("identifier_value", str2);
        Ah.p<DecoratedActivity> decoratedActivityV2 = this.f11345b.getDecoratedActivityV2(mapS);
        kotlin.jvm.internal.j.f(decoratedActivityV2, "getDecoratedActivityV2(...)");
        return decoratedActivityV2;
    }

    public final Decoration b(String id) {
        kotlin.jvm.internal.j.g(id, "id");
        Gj.t tVar = new Gj.t(id, 1);
        com.paymaya.data.database.repository.n nVar = this.c;
        nVar.getClass();
        if (nVar.b(tVar).isEmpty()) {
            return null;
        }
        return (Decoration) nVar.b(tVar).get(0);
    }

    public final Lh.d c() {
        HashMap mapS = T2.s();
        mapS.put("sort", "priority,updated_at");
        mapS.put("hidden", "false");
        Ah.p<List<Decoration>> decorations = this.f11345b.getDecorations(mapS);
        T3.l lVar = new T3.l(this, 28);
        decorations.getClass();
        return new Lh.d(new Lh.d(decorations, lVar, 2), new Q6.r(this, 29), 0);
    }
}
