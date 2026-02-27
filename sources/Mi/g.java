package Mi;

import D.B;
import D.C0176i;
import D.K;
import D.P;
import D.Q;
import D.S;
import D.r;
import G6.u;
import We.s;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import io.split.android.client.dtos.RuleBasedSegment;
import io.split.android.client.storage.db.GeneralInfoDao;
import io.split.android.client.storage.db.GeneralInfoEntity;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentDao;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentEntity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3417a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3418b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3419d;

    public g(RuleBasedSegmentDao ruleBasedSegmentDao, Gi.d dVar, Ji.a aVar) {
        Objects.requireNonNull(ruleBasedSegmentDao);
        this.f3418b = ruleBasedSegmentDao;
        Objects.requireNonNull(dVar);
        this.c = dVar;
        Objects.requireNonNull(aVar);
        this.f3419d = aVar;
    }

    public HashMap a(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RuleBasedSegmentEntity ruleBasedSegmentEntity = (RuleBasedSegmentEntity) it.next();
                String name = ruleBasedSegmentEntity.getName();
                Gi.d dVar = (Gi.d) this.c;
                String strR = dVar.r(name);
                String strR2 = dVar.r(ruleBasedSegmentEntity.getBody());
                if (strR != null && strR2 != null) {
                    try {
                        map.put(strR, (RuleBasedSegment) io.split.android.client.utils.b.f17635a.e(strR2, RuleBasedSegment.class));
                    } catch (Exception e) {
                        AbstractC1414e.o(e, s.w(numX49.tnTj78("bd2b"), strR, numX49.tnTj78("bd22")));
                    }
                }
            }
        }
        return map;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        int i = 0;
        switch (this.f3417a) {
            case 0:
                try {
                    GeneralInfoEntity byName = ((GeneralInfoDao) ((A7.f) ((Ji.a) this.f3419d)).f210b).getByName("rbsChangeNumber");
                    return new b(a(((RuleBasedSegmentDao) this.f3418b).getAll()), byName != null ? byName.getLongValue() : -1L);
                } catch (Exception e) {
                    Ri.a.g(String.format(numX49.tnTj78("bd2Z"), e.getLocalizedMessage()));
                    throw e;
                }
            default:
                String strTnTj78 = numX49.tnTj78("bd2L");
                try {
                    S sC = ((b0.f) this.f3419d).f.c();
                    String str = ((b0.f) this.f3419d).f.f9439a;
                    StringBuilder sb2 = new StringBuilder(strTnTj78);
                    sb2.append((HashMap) this.f3418b);
                    sb2.append(" with Cached GUID ");
                    sb2.append(((String) this.c) != null ? ((b0.f) this.f3419d).f8271a : "NULL and cleverTapID null");
                    String string = sb2.toString();
                    sC.getClass();
                    S.s(str, string);
                    ((b0.f) this.f3419d).i.l(false);
                    g0.g gVar = ((b0.f) this.f3419d).m;
                    Iterator it = gVar.f16777a.iterator();
                    while (it.hasNext()) {
                        gVar.f(null, false, (g0.h) it.next());
                    }
                    b0.f fVar = (b0.f) this.f3419d;
                    fVar.c.j(fVar.f8274g, 1, null, true);
                    b0.f fVar2 = (b0.f) this.f3419d;
                    fVar2.c.j(fVar2.f8274g, 2, null, true);
                    ((b0.f) this.f3419d).f8280q.g();
                    b0.f fVar3 = (b0.f) this.f3419d;
                    fVar3.j.n(fVar3.f8274g);
                    B.f800x = 1;
                    ((b0.f) this.f3419d).f8277n.b();
                    String str2 = (String) this.c;
                    if (str2 != null) {
                        ((b0.f) this.f3419d).f8275k.b(str2);
                        r rVar = ((b0.f) this.f3419d).e;
                        if (((String) this.c) == null) {
                            rVar.h.f();
                        }
                    } else {
                        b0.f fVar4 = (b0.f) this.f3419d;
                        if (fVar4.f.f9445n) {
                            fVar4.f8275k.a();
                        } else {
                            fVar4.f8275k.b("__" + UUID.randomUUID().toString().replace(Global.HYPHEN, ""));
                        }
                    }
                    Q q9 = ((b0.f) this.f3419d).f8276l;
                    q9.h.clear();
                    synchronized (q9.f861a) {
                        q9.f861a.clear();
                        break;
                    }
                    q9.g("LocalDataStore#inflateLocalProfileAsync", new P(i, q9, q9.c, q9.f862b.f9439a));
                    b0.f fVar5 = (b0.f) this.f3419d;
                    r rVar2 = fVar5.e;
                    if (fVar5.f8275k.f() == null) {
                        rVar2.h.f();
                    }
                    ((b0.f) this.f3419d).f8275k.k();
                    ((b0.f) this.f3419d).f8275k.l();
                    b0.f.a((b0.f) this.f3419d);
                    C0176i c0176i = ((b0.f) this.f3419d).f8272b;
                    ((B) c0176i.j).j(false);
                    c0176i.o();
                    HashMap map = (HashMap) this.f3418b;
                    if (map != null) {
                        ((b0.f) this.f3419d).f8272b.x(map);
                    }
                    g0.g gVar2 = ((b0.f) this.f3419d).m;
                    Iterator it2 = gVar2.f16777a.iterator();
                    while (it2.hasNext()) {
                        gVar2.f(null, true, (g0.h) it2.next());
                    }
                    b0.f.b((b0.f) this.f3419d);
                    b0.f.c((b0.f) this.f3419d);
                    b0.f.d((b0.f) this.f3419d);
                    ((b0.f) this.f3419d).f();
                    b0.f fVar6 = (b0.f) this.f3419d;
                    u uVar = (u) fVar6.h.c;
                    if (uVar != null) {
                        uVar.d();
                    } else {
                        CleverTapInstanceConfig cleverTapInstanceConfig = fVar6.f;
                        S sC2 = cleverTapInstanceConfig.c();
                        String str3 = cleverTapInstanceConfig.f9439a;
                        sC2.getClass();
                        S.s(str3, "DisplayUnit : Can't reset Display Units, DisplayUnitcontroller is null");
                    }
                    ((b0.f) this.f3419d).e();
                    b0.f fVar7 = (b0.f) this.f3419d;
                    K k8 = (K) fVar7.h.f791a;
                    String strF = fVar7.f8275k.f();
                    N.e eVar = k8.e;
                    ((LinkedHashMap) eVar.f).clear();
                    eVar.f3460b = 0;
                    k8.f852d = strF;
                    k8.f(strF);
                } catch (Throwable th2) {
                    S sC3 = ((b0.f) this.f3419d).f.c();
                    String str4 = ((b0.f) this.f3419d).f.f9439a;
                    String strTnTj782 = numX49.tnTj78("bd2r");
                    sC3.getClass();
                    S.t(str4, strTnTj782, th2);
                }
                return null;
        }
    }

    public g(b0.f fVar, HashMap map, String str) {
        this.f3419d = fVar;
        this.f3418b = map;
        this.c = str;
    }
}
