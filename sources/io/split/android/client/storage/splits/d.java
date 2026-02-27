package io.split.android.client.storage.splits;

import C.h;
import D.CallableC0170c;
import D.CallableC0192z;
import Z.n;
import bg.AbstractC0983W;
import com.google.firebase.messaging.r;
import com.google.gson.JsonSyntaxException;
import e2.C1421c;
import io.split.android.client.dtos.Split;
import io.split.android.client.storage.db.GeneralInfoEntity;
import io.split.android.client.storage.db.SplitDao;
import io.split.android.client.storage.db.SplitRoomDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f17624b;
    public final ConcurrentHashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17625d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f17626g;
    public final AtomicBoolean h = new AtomicBoolean(false);

    public d(a aVar) {
        Objects.requireNonNull(aVar);
        this.f17623a = aVar;
        this.f17624b = new ConcurrentHashMap();
        this.f17626g = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
    }

    @Override // io.split.android.client.storage.splits.c
    public final void b(String str) {
        ((SplitRoomDatabase) ((r) this.f17623a).f9804d).generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.FLAGS_SPEC, str));
        this.f = str;
    }

    @Override // Fi.a
    public final void clear() {
        this.f17624b.clear();
        this.f17625d = -1L;
        r rVar = (r) this.f17623a;
        rVar.getClass();
        ((SplitRoomDatabase) rVar.f9804d).runInTransaction(new h(rVar, 22));
        this.c.clear();
        this.f17626g.clear();
    }

    @Override // io.split.android.client.storage.splits.c
    public final void e(Split split) {
        ArrayList arrayList;
        this.f17624b.put(split.name, split);
        r rVar = (r) this.f17623a;
        rVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(split);
        SplitDao splitDao = ((SplitRoomDatabase) rVar.f9804d).splitDao();
        C1421c c1421c = (C1421c) rVar.c;
        c1421c.getClass();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        Ri.a aVar = (Ri.a) c1421c.f16555b;
        int i = aVar.f5558b;
        if (size > i) {
            List listV = AbstractC0983W.v(size / i, arrayList2);
            ArrayList arrayList4 = new ArrayList(listV.size());
            Iterator it = listV.iterator();
            while (it.hasNext()) {
                arrayList4.add(new CallableC0192z(new n(5, c1421c, (List) it.next()), 5));
            }
            try {
                List listInvokeAll = ((ExecutorService) aVar.c).invokeAll(arrayList4, 60, TimeUnit.SECONDS);
                arrayList = new ArrayList();
                Iterator it2 = listInvokeAll.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Future) it2.next()).get());
                }
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                Ri.a.g(e.getLocalizedMessage());
                arrayList = new ArrayList();
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.addAll((List) it3.next());
            }
        } else {
            arrayList3 = C1421c.h(arrayList2, (Gi.d) c1421c.c);
        }
        splitDao.insert(arrayList3);
        ConcurrentHashMap concurrentHashMap = this.c;
        Iterator it4 = concurrentHashMap.keySet().iterator();
        while (it4.hasNext()) {
            Set set = (Set) concurrentHashMap.get((String) it4.next());
            if (set != null) {
                set.remove(split.name);
            }
        }
    }

    @Override // io.split.android.client.storage.splits.c
    public final String f() {
        return this.e;
    }

    @Override // io.split.android.client.storage.splits.c
    public final void g(String str) {
        ((SplitRoomDatabase) ((r) this.f17623a).f9804d).generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.SPLITS_FILTER_QUERY_STRING, str));
        this.e = str;
    }

    @Override // io.split.android.client.storage.splits.c
    public final Split get(String str) {
        ConcurrentHashMap concurrentHashMap = this.f17624b;
        Split split = (Split) concurrentHashMap.get(str);
        if (split != null) {
            String str2 = split.json;
            if (str2 == null) {
                return split;
            }
            try {
                Split split2 = (Split) io.split.android.client.utils.b.f17635a.e(str2, Split.class);
                split2.json = null;
                concurrentHashMap.put(str, split2);
                return (Split) concurrentHashMap.get(str);
            } catch (JsonSyntaxException unused) {
            }
        }
        return null;
    }

    @Override // io.split.android.client.storage.splits.c
    public final HashMap getAll() {
        HashMap map = new HashMap();
        for (String str : this.f17624b.keySet()) {
            map.put(str, get(str));
        }
        return map;
    }

    @Override // io.split.android.client.storage.splits.c
    public final long getTill() {
        return this.f17625d;
    }

    @Override // io.split.android.client.storage.splits.c
    public final boolean h(b bVar, ExecutorService executorService) {
        String str;
        ConcurrentHashMap concurrentHashMap = this.f17624b;
        ConcurrentHashMap concurrentHashMap2 = this.c;
        ConcurrentHashMap concurrentHashMap3 = this.f17626g;
        ArrayList<Split> arrayList = bVar.f17620a;
        boolean z4 = !arrayList.isEmpty();
        for (Split split : arrayList) {
            Split split2 = get(split.name);
            if (split2 != null && (str = split2.trafficTypeName) != null) {
                X5.f.j(str, concurrentHashMap3);
            }
            String str2 = split.trafficTypeName;
            if (str2 != null) {
                String lowerCase = str2.toLowerCase();
                Integer num = (Integer) concurrentHashMap3.get(lowerCase);
                concurrentHashMap3.put(lowerCase, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
            concurrentHashMap.put(split.name, split);
            X5.f.f(split, concurrentHashMap2);
        }
        ArrayList<Split> arrayList2 = bVar.f17621b;
        for (Split split3 : arrayList2) {
            if (concurrentHashMap.remove(split3.name) != null) {
                X5.f.j(split3.trafficTypeName, concurrentHashMap3);
                X5.f.k(split3, concurrentHashMap2);
                z4 = true;
            }
        }
        this.f17625d = bVar.c;
        if ((arrayList.size() > 50 || arrayList2.size() > 50) && executorService != null) {
            executorService.submit(new CallableC0170c(15, this, bVar));
            return z4;
        }
        ((r) this.f17623a).N(bVar, concurrentHashMap3, concurrentHashMap2);
        return z4;
    }

    @Override // io.split.android.client.storage.splits.c
    public final String i() {
        return this.f;
    }

    @Override // io.split.android.client.storage.splits.c
    public final boolean k(String str) {
        return (str == null || this.f17626g.get(str.toLowerCase()) == null) ? false : true;
    }

    @Override // Fi.a
    public final synchronized void m() {
        if (this.h.get()) {
            return;
        }
        try {
            System.currentTimeMillis();
            X2.e eVarZ = ((r) this.f17623a).z();
            List<Split> arrayList = (List) eVarZ.f6481b;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            this.f17625d = eVarZ.f6480a;
            this.e = (String) eVarZ.c;
            this.f = (String) eVarZ.f6482d;
            this.f17626g.putAll((Map) eVarZ.e);
            for (Map.Entry entry : ((Map) eVarZ.f).entrySet()) {
                this.c.put((String) entry.getKey(), new HashSet((Collection) entry.getValue()));
            }
            for (Split split : arrayList) {
                this.f17624b.put(split.name, split);
            }
            this.h.compareAndSet(false, true);
        } catch (Throwable th2) {
            this.h.compareAndSet(false, true);
            throw th2;
        }
    }
}
