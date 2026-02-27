package io.split.android.client.storage.db;

import A7.f;
import D.C;
import Gi.d;
import Ki.c;
import X2.e;
import androidx.annotation.RestrictTo;
import com.google.firebase.messaging.r;
import hi.AbstractC1577b;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o1.AbstractC1955a;
import pi.C2154d;
import pi.InterfaceC2153c;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class StorageFactory {
    public static io.split.android.client.storage.attributes.a getAttributesStorage() {
        return getAttributesStorageContainerInstance();
    }

    private static io.split.android.client.storage.attributes.a getAttributesStorageContainerInstance() {
        return new io.split.android.client.storage.attributes.b(0);
    }

    public static Ii.a getEventsStorage(Ii.b bVar, boolean z4) {
        return new Ii.a(bVar, z4);
    }

    public static Ji.a getGeneralInfoStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new f(splitRoomDatabase.generalInfoDao(), dVar);
    }

    public static InterfaceC2153c getImpressionsObserverCachePersistentStorage(SplitRoomDatabase splitRoomDatabase, long j, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ImpressionsObserverCacheDao impressionsObserverCacheDao = splitRoomDatabase.impressionsObserverCacheDao();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        e eVar = new e();
        eVar.f6482d = new ConcurrentHashMap();
        Objects.requireNonNull(impressionsObserverCacheDao);
        eVar.f6481b = impressionsObserverCacheDao;
        eVar.f6480a = j;
        eVar.c = scheduledThreadPoolExecutor;
        eVar.e = atomicBoolean;
        eVar.f = new C2154d(eVar);
        return eVar;
    }

    public static Ki.a getImpressionsStorage(c cVar, boolean z4) {
        return new Ki.a(cVar, z4);
    }

    public static Li.c getMyLargeSegmentsStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return getMyLargeSegmentsStorageContainer(splitRoomDatabase, dVar);
    }

    private static Li.c getMyLargeSegmentsStorageContainer(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new Li.d(new Li.f(dVar, splitRoomDatabase.myLargeSegmentDao(), MyLargeSegmentEntity.creator()));
    }

    public static Li.c getMyLargeSegmentsStorageForWorker(SplitRoomDatabase splitRoomDatabase, String str, boolean z4) {
        return getMyLargeSegmentsStorageContainer(splitRoomDatabase, AbstractC1955a.h(str, z4));
    }

    public static Li.c getMySegmentsStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return getMySegmentsStorageContainer(splitRoomDatabase, dVar);
    }

    private static Li.c getMySegmentsStorageContainer(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new Li.d(new Li.f(dVar, splitRoomDatabase.mySegmentDao(), MySegmentEntity.creator()));
    }

    public static Li.c getMySegmentsStorageForWorker(SplitRoomDatabase splitRoomDatabase, String str, boolean z4) {
        return getMySegmentsStorageContainer(splitRoomDatabase, AbstractC1955a.h(str, z4));
    }

    public static io.split.android.client.storage.attributes.d getPersistentAttributesStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new io.split.android.client.storage.attributes.e(splitRoomDatabase.attributesDao(), dVar);
    }

    public static Ii.b getPersistentEventsStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new Ii.d(splitRoomDatabase, AbstractC1577b.f17048a, dVar, 0);
    }

    public static Ii.b getPersistentEventsStorageForWorker(SplitRoomDatabase splitRoomDatabase, String str, boolean z4) {
        return getPersistentEventsStorage(splitRoomDatabase, AbstractC1955a.h(str, z4));
    }

    public static Ki.b getPersistentImpressionsCountStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new Ii.d(splitRoomDatabase, AbstractC1577b.f17048a, dVar, 1);
    }

    public static c getPersistentImpressionsStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new Ii.d(splitRoomDatabase, AbstractC1577b.f17048a, dVar, 2);
    }

    public static c getPersistentImpressionsStorageForWorker(SplitRoomDatabase splitRoomDatabase, String str, boolean z4) {
        return getPersistentImpressionsStorage(splitRoomDatabase, AbstractC1955a.h(str, z4));
    }

    public static Ki.d getPersistentImpressionsUniqueStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new Ii.d(splitRoomDatabase, AbstractC1577b.f17049b, dVar, 3);
    }

    public static Ki.d getPersistentImpressionsUniqueStorageForWorker(SplitRoomDatabase splitRoomDatabase, String str, boolean z4) {
        return getPersistentImpressionsUniqueStorage(splitRoomDatabase, AbstractC1955a.h(str, z4));
    }

    public static Mi.a getPersistentRuleBasedSegmentStorage(SplitRoomDatabase splitRoomDatabase, d dVar, Ji.a aVar) {
        return new r(splitRoomDatabase, dVar, aVar);
    }

    public static io.split.android.client.storage.splits.a getPersistentSplitsStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new r(splitRoomDatabase, dVar);
    }

    public static Mi.d getRuleBasedSegmentStorageForWorker(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new Mi.f(new r(splitRoomDatabase, dVar, getGeneralInfoStorage(splitRoomDatabase, null)), new ConcurrentHashMap(), new AtomicLong(-1L));
    }

    public static io.split.android.client.storage.splits.c getSplitsStorage(SplitRoomDatabase splitRoomDatabase, d dVar) {
        return new io.split.android.client.storage.splits.d(getPersistentSplitsStorage(splitRoomDatabase, dVar));
    }

    public static Qi.c getTelemetryStorage(boolean z4) {
        return z4 ? new C() : new M2.b(14);
    }
}
