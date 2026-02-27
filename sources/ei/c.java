package Ei;

import A3.i;
import D.C0176i;
import D.S;
import P5.N;
import Xh.d;
import Xh.g;
import Xh.m;
import Xh.n;
import b1.t;
import bi.C1026d;
import bi.EnumC1028f;
import bi.h;
import com.google.firebase.messaging.r;
import com.paymaya.domain.store.M;
import e2.C1421c;
import io.split.android.client.service.sseclient.notifications.MySegmentsV2PayloadDecoder;
import io.split.android.client.service.sseclient.notifications.NotificationProcessor;
import io.split.android.client.service.sseclient.notifications.mysegments.MembershipsNotificationProcessorFactoryImpl;
import io.split.android.client.service.sseclient.notifications.mysegments.MySegmentsNotificationProcessorConfiguration;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import p3.C2011b;
import pg.C2038a;
import si.C2260b;
import xi.C2482a;
import yi.e;
import zi.f;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f1374a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1375b = new Object();
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f1376d;
    public final p8.a e;
    public final t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0176i f1377g;
    public final d h;
    public final a i;
    public final e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f1379l;
    public final AtomicBoolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1781b f1380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f1381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f1382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f1383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1781b f1384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f1385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f1386t;

    public c(String str, n nVar, d dVar, Ni.a aVar, C0176i c0176i, C1781b c1781b, t tVar, Si.d dVar2, S s9, fi.c cVar, e eVar, a aVar2, f fVar, m mVar, i iVar, R4.i iVar2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f1379l = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.m = atomicBoolean2;
        this.f1385s = null;
        this.f1386t = null;
        this.c = str;
        this.j = eVar;
        this.f1378k = true;
        this.e = new p8.a((Qi.c) c0176i.f919l);
        this.f = tVar;
        this.f1377g = c0176i;
        this.h = dVar;
        g gVar = new g();
        Objects.requireNonNull(nVar);
        gVar.f6640a = nVar;
        gVar.f6641b = this;
        gVar.c = dVar;
        gVar.e = c0176i;
        gVar.f6642d = aVar;
        gVar.i = cVar;
        gVar.j = mVar;
        gVar.f6643g = new r(new Si.d(), dVar2, (io.split.android.client.storage.attributes.d) c0176i.f918k, c1781b, 9);
        gVar.f = iVar2;
        gVar.h = new Si.b(s9, new Si.d(), cVar, new mg.c(20), (Qi.c) c0176i.f919l, iVar2, iVar, (io.split.android.client.storage.splits.c) c0176i.f914a);
        this.f1376d = gVar;
        this.i = aVar2;
        this.f1380n = c1781b;
        this.f1382p = new b(atomicBoolean2, 1);
        this.f1383q = fVar;
        this.f1384r = new C1781b(0);
        this.f1381o = new b(atomicBoolean, 0);
    }

    public final void a(Yh.a aVar) {
        URI uriCreate;
        h hVar = new h(this.f1384r, this.h.f6633b);
        String str = aVar.f6788a;
        r rVar = (r) this.f.f8334b;
        rVar.getClass();
        try {
            ((C2011b) rVar.e).getClass();
            uriCreate = io.split.android.client.network.b.f("https://sdk.split.io/api", str);
        } catch (URISyntaxException e) {
            Ri.a.g(e.getMessage());
            uriCreate = URI.create((String) rVar.f9803b);
        }
        U8.c cVar = new U8.c((io.split.android.client.network.d) rVar.c, uriCreate, (C2260b) rVar.f9804d);
        C0176i c0176i = this.f1377g;
        Li.c cVar2 = (Li.c) c0176i.f915b;
        String str2 = aVar.f6788a;
        C2038a c2038a = new C2038a(new N(cVar, cVar2.d(str2), ((Li.c) c0176i.c).d(str2), hVar), (Qi.c) this.e.f19074b);
        boolean zEquals = this.c.equals(str2);
        g gVar = this.f1376d;
        gVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0176i c0176i2 = (C0176i) gVar.e;
        io.split.android.client.storage.attributes.c cVarK = c0176i2.k(str2);
        Xh.b bVarA = ((m) gVar.j).a();
        r rVar2 = (r) gVar.f6643g;
        Xh.b bVarW = rVar2.w(str2, cVarK);
        Xh.b bVarW2 = rVar2.w(str2, cVarK);
        Si.b bVar = (Si.b) gVar.h;
        bVar.getClass();
        Si.c cVar3 = new Si.c(str2, (U8.c) bVar.f5731g, (S) bVar.f5729b, (Si.d) bVar.c, (fi.c) bVar.f5730d, bVar.f5728a, hVar, bVarW2, (mg.c) bVar.e, (Qi.c) bVar.f, (i) bVar.h, (io.split.android.client.storage.splits.c) bVar.i, (Si.d) bVar.j, (Si.d) bVar.f5732k, (Xh.c) bVar.f5733l, (M) bVar.m);
        Xh.h hVar2 = new Xh.h((n) gVar.f6640a, (c) gVar.f6641b, aVar, (R4.i) gVar.f, (fi.c) gVar.i, (d) gVar.c, hVar, bVarA, bVarW, cVar3);
        Qd.a aVar2 = hVar.f9154d;
        aVar2.getClass();
        aVar2.f5354b = hVar2;
        if (zEquals && ((d) gVar.c).f6634d) {
            EnumC1028f enumC1028f = EnumC1028f.f9152b;
            Qi.c cVar4 = (Qi.c) c0176i2.f919l;
            hVar.e(enumC1028f, new Xh.e(cVar4, jCurrentTimeMillis));
            hVar.e(EnumC1028f.f9151a, new Xh.f(cVar4, jCurrentTimeMillis, (Ni.a) gVar.f6642d));
        }
        ConcurrentHashMap concurrentHashMap = this.f1374a;
        concurrentHashMap.put(aVar, hVar2);
        a aVar3 = this.i;
        C1026d c1026d = (C1026d) aVar3.i;
        c1026d.c.put(aVar, hVar);
        synchronized (c1026d.f9150d) {
            try {
                Iterator it = c1026d.f9149b.iterator();
                while (it.hasNext()) {
                    hVar.a((bi.i) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        A7.f fVar = (A7.f) aVar3.f1367a;
        C1781b c1781b = (C1781b) fVar.c;
        ((mg.c) fVar.f210b).getClass();
        Bi.d dVar = new Bi.d(new yi.f(c1781b, new Ff.f(5, (byte) 0), -1), (C1781b) fVar.c, hVar, c2038a);
        ((Bi.e) aVar3.f).f(aVar, dVar);
        C1421c c1421c = new C1421c(11, str2, ((C0176i) aVar3.c).k(str2));
        A7.f fVar2 = (A7.f) aVar3.f1369d;
        ((Ai.c) aVar3.e).c(str2, new Ai.b((C1781b) fVar2.f210b, hVar, c1421c, (io.split.android.client.storage.attributes.d) fVar2.c));
        ((Set) ((r) aVar3.j).f9804d).add(str2);
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        ((NotificationProcessor) aVar3.h).registerMembershipsNotificationProcessor(str2, ((MembershipsNotificationProcessorFactoryImpl) aVar3.f1368b).getProcessor(new MySegmentsNotificationProcessorConfiguration(c2038a, linkedBlockingDeque, str2, ((MySegmentsV2PayloadDecoder) aVar3.f1371k).hashKey(str2))));
        ((zi.c) aVar3.f1370g).f21454g.j(str2, new C2482a(dVar, linkedBlockingDeque));
        boolean z4 = this.f1378k;
        C1781b c1781b2 = this.f1380n;
        if (z4 && !this.f1379l.getAndSet(true)) {
            this.f1385s = c1781b2.i(new ki.i(this.j, 3), 5L, this.f1381o);
        }
        if (this.m.getAndSet(true)) {
            return;
        }
        Set setKeySet = concurrentHashMap.keySet();
        HashSet hashSet = new HashSet();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            hashSet.add(((Yh.a) it2.next()).f6788a);
        }
        this.f1386t = c1781b2.i(new Bi.a(this.f1383q, hashSet), 5L, this.f1382p);
    }

    public final Xh.h b(Yh.a aVar) {
        synchronized (this.f1375b) {
            try {
                if (this.f1374a.get(aVar) != null) {
                    return (Xh.h) this.f1374a.get(aVar);
                }
                a(aVar);
                return (Xh.h) this.f1374a.get(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
