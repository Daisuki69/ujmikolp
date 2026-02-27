package ji;

import A7.f;
import D.C0176i;
import D.S;
import Ii.b;
import U8.c;
import Xh.d;
import io.split.android.client.storage.db.GeneralInfoDao;
import io.split.android.client.storage.db.GeneralInfoEntity;
import java.util.Objects;
import ki.InterfaceC1782c;
import n3.C1916a;

/* JADX INFO: renamed from: ji.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1684a implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17819a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17820b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17821d;
    public final Object e;

    public C1684a(c cVar, Ki.c cVar2, S s9, Qi.c cVar3) {
        Objects.requireNonNull(cVar);
        this.f17820b = cVar;
        Objects.requireNonNull(cVar2);
        this.f17821d = cVar2;
        this.e = s9;
        Objects.requireNonNull(cVar3);
        this.c = cVar3;
    }

    public void a() {
        for (Fi.a aVar : (Fi.a[]) this.e) {
            aVar.clear();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        f fVar = (f) ((Ji.a) this.f17821d);
        fVar.getClass();
        ((GeneralInfoDao) fVar.f210b).update(new GeneralInfoEntity("rolloutCacheLastClearTimestamp", jCurrentTimeMillis));
        Ri.a.p("Rollout definitions cache cleared");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0265 A[Catch: all -> 0x022c, LOOP:4: B:115:0x025f->B:117:0x0265, LOOP_END, TryCatch #5 {all -> 0x022c, blocks: (B:90:0x020d, B:92:0x0220, B:114:0x0259, B:115:0x025f, B:117:0x0265, B:118:0x0272), top: B:142:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d6 A[LOOP:3: B:130:0x02d0->B:132:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030a A[LOOP:2: B:76:0x01c6->B:141:0x030a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x029e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: Exception -> 0x0052, TRY_LEAVE, TryCatch #7 {Exception -> 0x0052, blocks: (B:5:0x001a, B:7:0x002a, B:9:0x0030, B:11:0x0041, B:13:0x0049, B:16:0x0054), top: B:148:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[Catch: all -> 0x00ec, LOOP:1: B:50:0x011a->B:52:0x0120, LOOP_END, TryCatch #6 {all -> 0x00ec, blocks: (B:28:0x00c9, B:30:0x00e0, B:49:0x0114, B:50:0x011a, B:52:0x0120, B:53:0x012b), top: B:144:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    @Override // ki.InterfaceC1782c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Ff.f execute() {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.C1684a.execute():Ff.f");
    }

    public C1684a(c cVar, b bVar, S s9, Qi.c cVar2) {
        Objects.requireNonNull(cVar);
        this.f17820b = cVar;
        Objects.requireNonNull(bVar);
        this.f17821d = bVar;
        this.e = s9;
        Objects.requireNonNull(cVar2);
        this.c = cVar2;
    }

    public C1684a(d dVar, C0176i c0176i, Gi.b bVar) {
        C1916a c1916a = dVar.f6635g;
        Fi.a[] aVarArr = {(io.split.android.client.storage.splits.c) c0176i.f914a, (Li.c) c0176i.f915b, (Li.c) c0176i.c, (Mi.c) c0176i.f923q};
        Ji.a aVar = (Ji.a) c0176i.f921o;
        Objects.requireNonNull(aVar);
        this.f17821d = aVar;
        this.c = bVar;
        this.e = aVarArr;
        this.f17820b = c1916a;
    }
}
