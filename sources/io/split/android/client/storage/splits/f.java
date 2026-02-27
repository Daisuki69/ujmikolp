package io.split.android.client.storage.splits;

import io.split.android.client.dtos.Split;
import io.split.android.client.dtos.Status;
import io.split.android.client.storage.db.GeneralInfoEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitRoomDatabase f17631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f17632b = -1L;
    public Long c = 0L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17633d = "";
    public String e = "";
    public Map f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f17634g = new ConcurrentHashMap();
    public final List h;
    public final Gi.d i;

    public f(SplitRoomDatabase splitRoomDatabase, List list, Gi.d dVar) {
        this.f17631a = splitRoomDatabase;
        this.h = list;
        this.i = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GeneralInfoEntity byName = this.f17631a.generalInfoDao().getByName(GeneralInfoEntity.SPLITS_UPDATE_TIMESTAMP);
        GeneralInfoEntity byName2 = this.f17631a.generalInfoDao().getByName(GeneralInfoEntity.CHANGE_NUMBER_INFO);
        GeneralInfoEntity byName3 = this.f17631a.generalInfoDao().getByName(GeneralInfoEntity.SPLITS_FILTER_QUERY_STRING);
        GeneralInfoEntity byName4 = this.f17631a.generalInfoDao().getByName(GeneralInfoEntity.FLAGS_SPEC);
        GeneralInfoEntity byName5 = this.f17631a.generalInfoDao().getByName(GeneralInfoEntity.TRAFFIC_TYPES_MAP);
        GeneralInfoEntity byName6 = this.f17631a.generalInfoDao().getByName(GeneralInfoEntity.FLAG_SETS_MAP);
        if (byName2 != null) {
            this.f17632b = Long.valueOf(byName2.getLongValue());
        }
        if (byName != null) {
            this.c = Long.valueOf(byName.getLongValue());
        }
        if (byName3 != null) {
            this.f17633d = byName3.getStringValue();
        }
        if (byName4 != null) {
            this.e = byName4.getStringValue();
        }
        boolean zIsEmpty = this.h.isEmpty();
        boolean z4 = byName5 == null || byName5.getStringValue().isEmpty();
        boolean z5 = byName6 == null || byName6.getStringValue().isEmpty();
        if (!zIsEmpty && (z4 || z5)) {
            Ri.a.k("Migration required for cached traffic types and flag sets. Migrating now.");
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    Split split = (Split) io.split.android.client.utils.b.f17635a.e(((Split) it.next()).json, Split.class);
                    if (split != null) {
                        if (split.status == Status.ACTIVE) {
                            String str = split.trafficTypeName;
                            Map map = this.f;
                            if (str != null) {
                                String lowerCase = str.toLowerCase();
                                Integer num = (Integer) map.get(lowerCase);
                                map.put(lowerCase, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                            }
                            X5.f.f(split, this.f17634g);
                        } else {
                            X5.f.j(split.trafficTypeName, this.f);
                            X5.f.k(split, this.f17634g);
                        }
                    }
                }
                Map map2 = this.f;
                SplitRoomDatabase splitRoomDatabase = this.f17631a;
                Gi.d dVar = this.i;
                if (map2 != null && !map2.isEmpty()) {
                    splitRoomDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.TRAFFIC_TYPES_MAP, dVar.a(io.split.android.client.utils.b.f17635a.k(this.f))));
                }
                Map map3 = this.f17634g;
                if (map3 != null && !map3.isEmpty()) {
                    splitRoomDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.FLAG_SETS_MAP, dVar.a(io.split.android.client.utils.b.f17635a.k(this.f17634g))));
                }
            } catch (Exception e) {
                Ri.a.h("Failed to migrate traffic types and flag sets", e);
            }
        }
        synchronized (this) {
            try {
                Ri.a.p("Parsing traffic types and sets");
                if (byName5 != null && !byName5.getStringValue().isEmpty()) {
                    this.f = (Map) io.split.android.client.utils.b.f17635a.f(this.i.r(byName5.getStringValue()), new SqLitePersistentSplitsStorage$SplitsSnapshotLoader$1().getType());
                }
                if (byName6 != null && !byName6.getStringValue().isEmpty()) {
                    this.f17634g = (Map) io.split.android.client.utils.b.f17635a.f(this.i.r(byName6.getStringValue()), new SqLitePersistentSplitsStorage$SplitsSnapshotLoader$2().getType());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
