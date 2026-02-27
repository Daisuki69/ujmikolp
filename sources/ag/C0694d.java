package ag;

import cj.M;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.B;

/* JADX INFO: renamed from: ag.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0694d implements Xf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xf.b f7199a;

    public C0694d(Xf.b bVar) {
        this.f7199a = bVar;
    }

    @Override // Xf.b
    public final void a(String str, LinkedHashMap linkedHashMap, Pair... pairArr) {
        kotlin.jvm.internal.j.h(str, numX49.tnTj78("buew"));
        kotlin.jvm.internal.j.h(pairArr, numX49.tnTj78("buec"));
        B b8 = new B(0);
        b8.a(pairArr);
        Pair pair = new Pair(numX49.tnTj78("buem"), numX49.tnTj78("bueD"));
        ArrayList arrayList = b8.f18173a;
        arrayList.add(pair);
        this.f7199a.a(str, linkedHashMap, (Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
    }

    @Override // Xf.b
    public final void b(String str, Exception exc, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.j.h(exc, numX49.tnTj78("bueh"));
        LinkedHashMap linkedHashMapI = M.i(new Pair(numX49.tnTj78("bueM"), numX49.tnTj78("bueN")));
        if (linkedHashMap != null) {
            linkedHashMapI.putAll(linkedHashMap);
        }
        Unit unit = Unit.f18162a;
        this.f7199a.b(str, exc, linkedHashMapI);
    }
}
