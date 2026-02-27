package Ii;

import io.split.android.client.dtos.Identifiable;
import io.split.android.client.storage.db.EventDao;
import io.split.android.client.storage.db.ImpressionDao;
import io.split.android.client.storage.db.ImpressionsCountDao;
import io.split.android.client.storage.db.impressions.unique.UniqueKeysDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2345b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2346d;
    public final Object e;

    public c(Object obj, ArrayList arrayList, int i, long j, int i4) {
        this.f2346d = i4;
        this.f2345b = arrayList;
        this.f2344a = i;
        this.c = j;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection by;
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - this.c;
        int i = this.f2344a;
        switch (this.f2346d) {
            case 0:
                by = ((EventDao) this.e).getBy(jCurrentTimeMillis, 0, i);
                break;
            case 1:
                by = ((ImpressionsCountDao) this.e).getBy(jCurrentTimeMillis, 0, i);
                break;
            case 2:
                by = ((ImpressionDao) this.e).getBy(jCurrentTimeMillis, 0, i);
                break;
            default:
                by = ((UniqueKeysDao) this.e).getBy(jCurrentTimeMillis, 0, i);
                break;
        }
        ArrayList arrayList = this.f2345b;
        arrayList.addAll(by);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((Identifiable) it.next()).getId()));
        }
        switch (this.f2346d) {
            case 0:
                ((EventDao) this.e).updateStatus(arrayList2, 1);
                break;
            case 1:
                ((ImpressionsCountDao) this.e).updateStatus(arrayList2, 1);
                break;
            case 2:
                ((ImpressionDao) this.e).updateStatus(arrayList2, 1);
                break;
            default:
                ((UniqueKeysDao) this.e).updateStatus(arrayList2, 1);
                break;
        }
    }
}
