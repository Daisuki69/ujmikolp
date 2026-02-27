package Bi;

import androidx.work.Data;
import b1.t;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.service.workmanager.MySegmentsSyncWorker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.InterfaceC1782c;
import yi.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f570a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f571b;
    public final Object c;

    public a(zi.f fVar, HashSet hashSet) {
        Objects.requireNonNull(fVar);
        this.f571b = fVar;
        this.c = hashSet;
    }

    @Override // ki.InterfaceC1782c
    public final Ff.f execute() {
        switch (this.f570a) {
            case 0:
                zi.f fVar = (zi.f) this.f571b;
                fVar.getClass();
                Data.Builder builder = new Data.Builder();
                HashSet hashSet = (HashSet) this.c;
                String[] strArr = new String[hashSet.size()];
                hashSet.toArray(strArr);
                Xh.d dVar = fVar.f21465d;
                dVar.getClass();
                builder.putString(numX49.tnTj78("bVbb"), numX49.tnTj78("bVb2"));
                builder.putStringArray(numX49.tnTj78("bVbL"), strArr);
                builder.putBoolean(numX49.tnTj78("bVbr"), dVar.f6634d);
                fVar.b(numX49.tnTj78("bVbZ"), MySegmentsSyncWorker.class, fVar.a(builder.build()));
                break;
            case 1:
                ((Ii.d) ((Ki.b) this.f571b)).h((ArrayList) this.c);
                break;
            case 2:
                Map map = (Map) this.c;
                if (!map.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new ri.b((String) entry.getKey(), (Set) entry.getValue()));
                    }
                    ((Ii.d) ((Ki.d) this.f571b)).h(arrayList);
                }
                break;
            case 3:
                Ri.a.d(numX49.tnTj78("bVbP"));
                t tVar = (t) this.f571b;
                if (!((AtomicBoolean) tVar.e).getAndSet(true)) {
                    tVar.c();
                }
                j jVar = (j) this.c;
                jVar.f21307a.k(jVar.c);
                break;
            default:
                ((zi.b) this.c).f21447a.push(this.f571b);
                break;
        }
        return Ff.f.k(10);
    }

    public a(Ki.b bVar, ArrayList arrayList) {
        Objects.requireNonNull(bVar);
        this.f571b = bVar;
        this.c = arrayList;
    }

    public a(Ki.d dVar, HashMap map) {
        Objects.requireNonNull(dVar);
        this.f571b = dVar;
        this.c = map;
    }

    public a(zi.b bVar, Hi.a aVar) {
        this.c = bVar;
        this.f571b = aVar;
    }

    public a(t tVar, j jVar) {
        this.f571b = tVar;
        this.c = jVar;
    }
}
