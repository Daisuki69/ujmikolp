package Ci;

import Gi.d;
import bi.C1026d;
import io.split.android.client.dtos.Split;
import io.split.android.client.storage.db.MyLargeSegmentEntity;
import io.split.android.client.storage.db.SegmentDao;
import io.split.android.client.storage.db.SegmentEntity;
import io.split.android.client.storage.splits.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ki.InterfaceC1782c;
import ri.C2209a;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f781b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f782d;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.f780a = i;
        this.f781b = obj;
        this.f782d = obj2;
        this.c = obj3;
    }

    public static C2209a a(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ri.b bVar = (ri.b) it.next();
            String strB = bVar.b();
            if (!map.containsKey(strB)) {
                map.put(strB, new ri.b(strB, new HashSet()));
            }
            ri.b bVar2 = (ri.b) map.get(strB);
            if (bVar2 != null) {
                Set setA = bVar2.a();
                Set setA2 = bVar.a();
                setA2.addAll(setA);
                map.put(strB, new ri.b(strB, setA2));
            }
        }
        return new C2209a(new ArrayList(map.values()));
    }

    public void b(SegmentDao segmentDao, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SegmentEntity segmentEntity = (SegmentEntity) it.next();
            String userKey = segmentEntity.getUserKey();
            d dVar = (d) this.f782d;
            String strR = dVar.r(userKey);
            String strR2 = dVar.r(segmentEntity.getSegmentList());
            d dVar2 = (d) this.c;
            String strA = dVar2.a(strR);
            String strA2 = dVar2.a(strR2);
            if (strA == null || strA2 == null) {
                StringBuilder sb2 = new StringBuilder("Error applying cipher to my ");
                sb2.append(segmentEntity instanceof MyLargeSegmentEntity ? "large" : "");
                sb2.append(" segment");
                Ri.a.g(sb2.toString());
            } else {
                segmentDao.update(userKey, strA, strA2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x047e A[SYNTHETIC] */
    @Override // ki.InterfaceC1782c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Ff.f execute() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ci.a.execute():Ff.f");
    }

    public a(String str, io.split.android.client.storage.attributes.d dVar, ConcurrentHashMap concurrentHashMap) {
        this.f780a = 4;
        this.f781b = str;
        Objects.requireNonNull(dVar);
        this.f782d = dVar;
        this.c = concurrentHashMap;
    }

    public a(c cVar, Split split, C1026d c1026d) {
        this.f780a = 9;
        Objects.requireNonNull(cVar);
        this.f782d = cVar;
        this.f781b = split;
        this.c = c1026d;
    }

    public a(c cVar, String str, String str2) {
        this.f780a = 8;
        Objects.requireNonNull(cVar);
        this.f781b = cVar;
        this.f782d = str == null ? "" : str;
        this.c = str2 == null ? "" : str2;
    }

    public a(U8.c cVar, Q3.b bVar, Qi.c cVar2) {
        this.f780a = 0;
        Objects.requireNonNull(cVar);
        this.f781b = cVar;
        Objects.requireNonNull(bVar);
        this.f782d = bVar;
        Objects.requireNonNull(cVar2);
        this.c = cVar2;
    }

    public a(U8.c cVar, Qi.b bVar, Qi.c cVar2) {
        this.f780a = 1;
        Objects.requireNonNull(cVar);
        this.f781b = cVar;
        Objects.requireNonNull(bVar);
        this.f782d = bVar;
        Objects.requireNonNull(cVar2);
        this.c = cVar2;
    }

    public a(io.split.android.client.storage.splits.a aVar, ArrayList arrayList, String str) {
        this.f780a = 7;
        Objects.requireNonNull(aVar);
        this.f781b = aVar;
        Objects.requireNonNull(arrayList);
        this.f782d = arrayList;
        this.c = str;
    }

    public a(U8.c cVar, Ki.d dVar, ri.c cVar2) {
        this.f780a = 6;
        Objects.requireNonNull(cVar);
        this.f781b = cVar;
        Objects.requireNonNull(dVar);
        this.f782d = dVar;
        this.c = cVar2;
    }

    public a(U8.c cVar, Ki.b bVar, Qi.c cVar2) {
        this.f780a = 5;
        Objects.requireNonNull(cVar);
        this.f781b = cVar;
        Objects.requireNonNull(bVar);
        this.f782d = bVar;
        Objects.requireNonNull(cVar2);
        this.c = cVar2;
    }
}
