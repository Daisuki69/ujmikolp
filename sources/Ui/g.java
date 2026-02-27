package Ui;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f5994b;

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f5994b.contains((String) cVar.p((String) obj, this.f5993a, map).f3485b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            String str = gVar.f5993a;
            String str2 = this.f5993a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            List list = gVar.f5994b;
            List list2 = this.f5994b;
            if (list2 != null) {
                return list2.equals(list);
            }
            if (list == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5993a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f5994b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "in split \"" + this.f5993a + "\" treatment " + this.f5994b;
    }
}
