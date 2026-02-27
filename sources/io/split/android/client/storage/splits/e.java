package io.split.android.client.storage.splits;

import Kh.I;
import We.s;
import com.google.firebase.messaging.r;
import io.split.android.client.storage.db.GeneralInfoDao;
import io.split.android.client.storage.db.GeneralInfoEntity;
import io.split.android.client.storage.db.SplitEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17628b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f17629d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17630g;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Serializable serializable2, int i) {
        this.f17627a = i;
        this.f17630g = obj;
        this.f17628b = obj2;
        this.c = obj3;
        this.f17629d = serializable;
        this.e = obj4;
        this.f = serializable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17627a) {
            case 0:
                r rVar = (r) this.f17630g;
                SplitRoomDatabase splitRoomDatabase = (SplitRoomDatabase) rVar.f9804d;
                GeneralInfoDao generalInfoDao = splitRoomDatabase.generalInfoDao();
                b bVar = (b) this.f17628b;
                generalInfoDao.update(new GeneralInfoEntity(GeneralInfoEntity.CHANGE_NUMBER_INFO, bVar.c));
                List<SplitEntity> list = (List) this.c;
                if (!list.isEmpty()) {
                    splitRoomDatabase.splitDao().insert(list);
                }
                ArrayList arrayList = (ArrayList) this.f17629d;
                if (!arrayList.isEmpty()) {
                    splitRoomDatabase.splitDao().delete(arrayList);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.e;
                boolean zIsEmpty = concurrentHashMap.isEmpty();
                Gi.d dVar = (Gi.d) rVar.e;
                if (!zIsEmpty) {
                    splitRoomDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.TRAFFIC_TYPES_MAP, dVar.a(io.split.android.client.utils.b.f17635a.k(concurrentHashMap))));
                }
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f;
                if (!concurrentHashMap2.isEmpty()) {
                    splitRoomDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.FLAG_SETS_MAP, dVar.a(io.split.android.client.utils.b.f17635a.k(concurrentHashMap2))));
                }
                splitRoomDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.SPLITS_UPDATE_TIMESTAMP, bVar.f17622d));
                break;
            default:
                boolean zBooleanValue = ((Boolean) this.f17628b).booleanValue();
                I i = (I) this.e;
                String s9 = (String) this.f17629d;
                if (!zBooleanValue) {
                    i.getClass();
                    j.g(s9, "s");
                    p4.b error = (p4.b) this.f;
                    j.g(error, "error");
                    error.toString();
                    yk.a.a();
                } else {
                    Locale locale = Locale.US;
                    ((p4.c) this.f17630g).b(this.c, s.j("(", s9, ") Collector completed successfully."));
                    i.getClass();
                    j.g(s9, "s");
                    yk.a.a();
                }
                break;
        }
    }
}
