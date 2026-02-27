package zf;

import java.io.IOException;
import java.util.HashMap;
import yf.j;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f21418b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21419a;

    public f() {
        HashMap map = new HashMap();
        this.f21419a = map;
        b bVar = new b(5);
        b bVar2 = new b(4);
        b bVar3 = new b(2);
        b bVar4 = new b(6);
        b bVar5 = new b(0);
        b bVar6 = new b(1);
        b bVar7 = new b(7);
        b bVar8 = new b(3);
        map.put(j.f21240o0, bVar);
        map.put(j.f21243p0, bVar);
        map.put(j.f21204Y, bVar2);
        map.put(j.f21206Z, bVar2);
        map.put(j.f21260x, bVar3);
        map.put(j.f21263y, bVar3);
        map.put(j.f21179G0, bVar4);
        map.put(j.f21180H0, bVar4);
        map.put(j.f21232l, bVar5);
        map.put(j.m, bVar5);
        map.put(j.f21236n, bVar6);
        map.put(j.f21239o, bVar6);
        map.put(j.f21231k1, bVar7);
        map.put(j.f21234l1, bVar7);
        map.put(j.f21200W, bVar8);
    }

    public final b a(j jVar) throws IOException {
        b bVar = (b) this.f21419a.get(jVar);
        if (bVar != null) {
            return bVar;
        }
        throw new IOException("Invalid filter: " + jVar);
    }
}
