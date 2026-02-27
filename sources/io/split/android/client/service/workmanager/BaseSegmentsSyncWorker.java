package io.split.android.client.service.workmanager;

import U8.c;
import io.split.android.client.network.b;
import io.split.android.client.network.d;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.db.StorageFactory;
import java.util.HashSet;
import si.C2260b;
import si.C2262d;

/* JADX INFO: loaded from: classes4.dex */
abstract class BaseSegmentsSyncWorker extends SplitWorker {
    public static HashSet b(String[] strArr, boolean z4, d dVar, String str, SplitRoomDatabase splitRoomDatabase, String str2, boolean z5) {
        HashSet hashSet = new HashSet();
        for (String str3 : strArr) {
            hashSet.add(new C2262d(new c(dVar, b.f(str, str3), new C2260b()), StorageFactory.getMySegmentsStorageForWorker(splitRoomDatabase, str2, z5).d(str3), StorageFactory.getMyLargeSegmentsStorageForWorker(splitRoomDatabase, str2, z5).d(str3), false, null, StorageFactory.getTelemetryStorage(z4), C2260b.f20120b, null, null));
        }
        return hashSet;
    }
}
