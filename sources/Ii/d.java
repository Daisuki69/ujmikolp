package Ii;

import bg.AbstractC0983W;
import com.google.gson.JsonParseException;
import io.split.android.client.dtos.DeprecatedKeyImpression;
import io.split.android.client.dtos.Event;
import io.split.android.client.dtos.Identifiable;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.storage.db.EventDao;
import io.split.android.client.storage.db.EventEntity;
import io.split.android.client.storage.db.ImpressionDao;
import io.split.android.client.storage.db.ImpressionEntity;
import io.split.android.client.storage.db.ImpressionsCountDao;
import io.split.android.client.storage.db.ImpressionsCountEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.db.impressions.unique.UniqueKeyEntity;
import io.split.android.client.storage.db.impressions.unique.UniqueKeysDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import oi.C1985c;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements b, Ki.b, Ki.c, Ki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2348b;
    public final SplitRoomDatabase c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gi.d f2349d;
    public final Object e;

    public d(long j) {
        this.f2347a = j;
    }

    public static List e(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Identifiable) it.next()).getId()));
        }
        return AbstractC0983W.v(100, arrayList);
    }

    public final void a(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        for (List<Long> list : e(arrayList)) {
            switch (this.f2348b) {
                case 0:
                    ((EventDao) this.e).delete(list);
                    break;
                case 1:
                    ((ImpressionsCountDao) this.e).delete(list);
                    break;
                case 2:
                    ((ImpressionDao) this.e).delete(list);
                    break;
                default:
                    ((UniqueKeysDao) this.e).deleteById(list);
                    break;
            }
        }
    }

    public final void b(long j) {
        int iDeleteByStatus = 1;
        while (iDeleteByStatus > 0) {
            switch (this.f2348b) {
                case 0:
                    iDeleteByStatus = ((EventDao) this.e).deleteByStatus(1, j, 100);
                    break;
                case 1:
                    iDeleteByStatus = ((ImpressionsCountDao) this.e).deleteByStatus(1, j, 100);
                    break;
                case 2:
                    iDeleteByStatus = ((ImpressionDao) this.e).deleteByStatus(1, j, 100);
                    break;
                default:
                    iDeleteByStatus = ((UniqueKeysDao) this.e).deleteByStatus(1, j, 100);
                    break;
            }
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - this.f2347a;
        switch (this.f2348b) {
            case 0:
                ((EventDao) this.e).deleteOutdated(jCurrentTimeMillis);
                break;
            case 1:
                ((ImpressionsCountDao) this.e).deleteOutdated(jCurrentTimeMillis);
                break;
            case 2:
                ((ImpressionDao) this.e).deleteOutdated(jCurrentTimeMillis);
                break;
            default:
                ((UniqueKeysDao) this.e).deleteOutdated(jCurrentTimeMillis);
                break;
        }
    }

    public final Identifiable c(Identifiable identifiable) {
        switch (this.f2348b) {
            case 0:
                String strA = this.f2349d.a(io.split.android.client.utils.b.f17635a.k((Event) identifiable));
                if (strA == null) {
                    Ri.a.g("Error encrypting event");
                    return null;
                }
                EventEntity eventEntity = new EventEntity();
                eventEntity.setBody(strA);
                eventEntity.setStatus(0);
                eventEntity.setCreatedAt(System.currentTimeMillis() / 1000);
                return eventEntity;
            case 1:
                String strA2 = this.f2349d.a(io.split.android.client.utils.b.f17635a.k((C1985c) identifiable));
                if (strA2 == null) {
                    Ri.a.g("Error encrypting impression count");
                    return null;
                }
                ImpressionsCountEntity impressionsCountEntity = new ImpressionsCountEntity();
                impressionsCountEntity.setBody(strA2);
                impressionsCountEntity.setStatus(0);
                impressionsCountEntity.setCreatedAt(System.currentTimeMillis() / 1000);
                return impressionsCountEntity;
            case 2:
                KeyImpression keyImpression = (KeyImpression) identifiable;
                Gi.d dVar = this.f2349d;
                ImpressionEntity impressionEntity = new ImpressionEntity();
                try {
                    String strA3 = dVar.a(io.split.android.client.utils.b.f17635a.k(keyImpression));
                    String strA4 = dVar.a(keyImpression.feature);
                    if (strA4 != null && strA3 != null) {
                        impressionEntity.setStatus(0);
                        impressionEntity.setBody(strA3);
                        impressionEntity.setTestName(strA4);
                        impressionEntity.setCreatedAt(System.currentTimeMillis() / 1000);
                        return impressionEntity;
                    }
                    Ri.a.g("Error encrypting impression");
                } catch (JsonParseException e) {
                    Ri.a.g("Error parsing impression: " + e.getMessage());
                }
                return null;
            default:
                ri.b bVar = (ri.b) identifiable;
                String strB = bVar.b();
                Gi.d dVar2 = this.f2349d;
                String strA5 = dVar2.a(strB);
                String strA6 = dVar2.a(io.split.android.client.utils.b.f17635a.k(bVar.a()));
                if (strA5 != null && strA6 != null) {
                    return new UniqueKeyEntity(strA5, strA6, System.currentTimeMillis() / 1000, 0);
                }
                Ri.a.g("Error encrypting unique key");
                return null;
        }
    }

    public final Identifiable d(Identifiable identifiable) {
        KeyImpression keyImpression;
        switch (this.f2348b) {
            case 0:
                EventEntity eventEntity = (EventEntity) identifiable;
                Event event = (Event) io.split.android.client.utils.b.f17635a.e(this.f2349d.r(eventEntity.getBody()), Event.class);
                event.storageId = eventEntity.getId();
                return event;
            case 1:
                ImpressionsCountEntity impressionsCountEntity = (ImpressionsCountEntity) identifiable;
                C1985c c1985c = (C1985c) io.split.android.client.utils.b.f17635a.e(this.f2349d.r(impressionsCountEntity.getBody()), C1985c.class);
                c1985c.f18894a = impressionsCountEntity.getId();
                return c1985c;
            case 2:
                ImpressionEntity impressionEntity = (ImpressionEntity) identifiable;
                Gi.d dVar = this.f2349d;
                try {
                    String testName = impressionEntity.getTestName();
                    String body = impressionEntity.getBody();
                    String strR = dVar.r(testName);
                    String strR2 = dVar.r(body);
                    if (strR == null || strR2 == null) {
                        keyImpression = null;
                    } else {
                        keyImpression = (KeyImpression) io.split.android.client.utils.b.f17635a.e(strR2, KeyImpression.class);
                        keyImpression.feature = strR;
                    }
                    break;
                } catch (JsonParseException unused) {
                    String testName2 = impressionEntity.getTestName();
                    String body2 = impressionEntity.getBody();
                    String strR3 = dVar.r(testName2);
                    DeprecatedKeyImpression deprecatedKeyImpression = (DeprecatedKeyImpression) io.split.android.client.utils.b.f17635a.e(dVar.r(body2), DeprecatedKeyImpression.class);
                    deprecatedKeyImpression.feature = strR3;
                    keyImpression = new KeyImpression();
                    keyImpression.feature = deprecatedKeyImpression.feature;
                    keyImpression.bucketingKey = deprecatedKeyImpression.bucketingKey;
                    keyImpression.changeNumber = deprecatedKeyImpression.changeNumber;
                    keyImpression.keyName = deprecatedKeyImpression.keyName;
                    keyImpression.label = deprecatedKeyImpression.label;
                    keyImpression.time = deprecatedKeyImpression.time;
                    keyImpression.treatment = deprecatedKeyImpression.treatment;
                }
                if (keyImpression == null) {
                    throw new JsonParseException("Error parsing stored impression");
                }
                keyImpression.storageId = impressionEntity.getId();
                return keyImpression;
            default:
                UniqueKeyEntity uniqueKeyEntity = (UniqueKeyEntity) identifiable;
                String featureList = uniqueKeyEntity.getFeatureList();
                Gi.d dVar2 = this.f2349d;
                ri.b bVar = new ri.b(dVar2.r(uniqueKeyEntity.getUserKey()), (Set) io.split.android.client.utils.b.f17635a.e(dVar2.r(featureList), Set.class));
                bVar.f19958a = uniqueKeyEntity.getId();
                return bVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f(int r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            r1 = 100
            int r5 = java.lang.Math.min(r1, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            long r6 = r9.f2347a
            int r1 = r9.f2348b
            switch(r1) {
                case 0: goto L4a;
                case 1: goto L39;
                case 2: goto L28;
                default: goto L17;
            }
        L17:
            Ii.c r2 = new Ii.c
            java.lang.Object r1 = r9.e
            r3 = r1
            io.split.android.client.storage.db.impressions.unique.UniqueKeysDao r3 = (io.split.android.client.storage.db.impressions.unique.UniqueKeysDao) r3
            r8 = 3
            r2.<init>(r3, r4, r5, r6, r8)
            io.split.android.client.storage.db.SplitRoomDatabase r1 = r9.c
            r1.runInTransaction(r2)
            goto L5a
        L28:
            Ii.c r2 = new Ii.c
            java.lang.Object r1 = r9.e
            r3 = r1
            io.split.android.client.storage.db.ImpressionDao r3 = (io.split.android.client.storage.db.ImpressionDao) r3
            r8 = 2
            r2.<init>(r3, r4, r5, r6, r8)
            io.split.android.client.storage.db.SplitRoomDatabase r1 = r9.c
            r1.runInTransaction(r2)
            goto L5a
        L39:
            Ii.c r2 = new Ii.c
            java.lang.Object r1 = r9.e
            r3 = r1
            io.split.android.client.storage.db.ImpressionsCountDao r3 = (io.split.android.client.storage.db.ImpressionsCountDao) r3
            r8 = 1
            r2.<init>(r3, r4, r5, r6, r8)
            io.split.android.client.storage.db.SplitRoomDatabase r1 = r9.c
            r1.runInTransaction(r2)
            goto L5a
        L4a:
            Ii.c r2 = new Ii.c
            java.lang.Object r1 = r9.e
            r3 = r1
            io.split.android.client.storage.db.EventDao r3 = (io.split.android.client.storage.db.EventDao) r3
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            io.split.android.client.storage.db.SplitRoomDatabase r1 = r9.c
            r1.runInTransaction(r2)
        L5a:
            int r1 = r4.size()
            int r10 = r10 - r1
            r0.addAll(r4)
            if (r1 <= 0) goto L66
            if (r10 > 0) goto L5
        L66:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r0.iterator()
        L6f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r1.next()
            io.split.android.client.dtos.Identifiable r0 = (io.split.android.client.dtos.Identifiable) r0
            io.split.android.client.dtos.Identifiable r0 = r9.d(r0)     // Catch: java.lang.Exception -> L83 com.google.gson.JsonParseException -> L85
            r10.add(r0)     // Catch: java.lang.Exception -> L83 com.google.gson.JsonParseException -> L85
            goto L6f
        L83:
            r0 = move-exception
            goto L87
        L85:
            r0 = move-exception
            goto L92
        L87:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown error parsing stored entity: "
            r2.<init>(r3)
            defpackage.AbstractC1414e.o(r0, r2)
            goto L6f
        L92:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error parsing stored entity: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            Ri.a.g(r0)
            goto L6f
        La8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.d.f(int):java.util.ArrayList");
    }

    @Override // Hi.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void push(Identifiable identifiable) {
        Identifiable identifiableC;
        if (identifiable == null || (identifiableC = c(identifiable)) == null) {
            return;
        }
        switch (this.f2348b) {
            case 0:
                ((EventDao) this.e).insert((EventEntity) identifiableC);
                break;
            case 1:
                ((ImpressionsCountDao) this.e).insert((ImpressionsCountEntity) identifiableC);
                break;
            case 2:
                ((ImpressionDao) this.e).insert((ImpressionEntity) identifiableC);
                break;
            default:
                ((UniqueKeysDao) this.e).insert((UniqueKeyEntity) identifiableC);
                break;
        }
    }

    public final void h(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Identifiable identifiableC = c((Identifiable) it.next());
            if (identifiableC != null) {
                arrayList2.add(identifiableC);
            }
        }
        switch (this.f2348b) {
            case 0:
                ((EventDao) this.e).insert(arrayList2);
                break;
            case 1:
                ((ImpressionsCountDao) this.e).insert(arrayList2);
                break;
            case 2:
                ((ImpressionDao) this.e).insert(arrayList2);
                break;
            default:
                ((UniqueKeysDao) this.e).insert(arrayList2);
                break;
        }
    }

    public final void i(List list) {
        Objects.requireNonNull(list);
        if (list.size() == 0) {
            return;
        }
        for (List<Long> list2 : e(list)) {
            switch (this.f2348b) {
                case 0:
                    ((EventDao) this.e).updateStatus(list2, 0);
                    break;
                case 1:
                    ((ImpressionsCountDao) this.e).updateStatus(list2, 0);
                    break;
                case 2:
                    ((ImpressionDao) this.e).updateStatus(list2, 0);
                    break;
                default:
                    ((UniqueKeysDao) this.e).updateStatus(list2, 0);
                    break;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(SplitRoomDatabase splitRoomDatabase, long j, Gi.d dVar, int i) {
        this(j);
        this.f2348b = i;
        switch (i) {
            case 1:
                this(j);
                Objects.requireNonNull(splitRoomDatabase);
                this.c = splitRoomDatabase;
                this.e = splitRoomDatabase.impressionsCountDao();
                Objects.requireNonNull(dVar);
                this.f2349d = dVar;
                break;
            case 2:
                this(j);
                Objects.requireNonNull(splitRoomDatabase);
                this.c = splitRoomDatabase;
                this.e = splitRoomDatabase.impressionDao();
                Objects.requireNonNull(dVar);
                this.f2349d = dVar;
                break;
            case 3:
                this(j);
                Objects.requireNonNull(splitRoomDatabase);
                this.c = splitRoomDatabase;
                this.e = splitRoomDatabase.uniqueKeysDao();
                Objects.requireNonNull(dVar);
                this.f2349d = dVar;
                break;
            default:
                Objects.requireNonNull(splitRoomDatabase);
                this.c = splitRoomDatabase;
                this.e = splitRoomDatabase.eventDao();
                Objects.requireNonNull(dVar);
                this.f2349d = dVar;
                break;
        }
    }
}
