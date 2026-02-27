package oi;

import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: oi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1984b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("pf")
    public final List<C1985c> f18893a;

    public C1984b(ArrayList arrayList) {
        this.f18893a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArrayList<C1985c> arrayList = new ArrayList(((C1984b) obj).f18893a);
        ArrayList<C1985c> arrayList2 = new ArrayList(this.f18893a);
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        HashMap map = new HashMap();
        for (C1985c c1985c : arrayList) {
            map.put(c1985c.f18895b, c1985c);
        }
        for (C1985c c1985c2 : arrayList2) {
            C1985c c1985c3 = (C1985c) map.get(c1985c2.f18895b);
            if (c1985c3 == null || c1985c2.f18896d != c1985c3.f18896d || c1985c2.c != c1985c3.c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f18893a.hashCode();
    }
}
