package W0;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import cj.t;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f6166b;
    public List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f6167d;
    public o e;

    public a(String id, ArrayList arrayList, ArrayList arrayList2, p pVar, o oVar, int i) {
        List phones = arrayList;
        phones = (i & 2) != 0 ? C1112C.f9377a : phones;
        List emails = arrayList2;
        emails = (i & 4) != 0 ? C1112C.f9377a : emails;
        pVar = (i & 8) != 0 ? null : pVar;
        oVar = (i & 16) != 0 ? null : oVar;
        kotlin.jvm.internal.j.g(id, "id");
        kotlin.jvm.internal.j.g(phones, "phones");
        kotlin.jvm.internal.j.g(emails, "emails");
        this.f6165a = id;
        this.f6166b = phones;
        this.c = emails;
        this.f6167d = pVar;
        this.e = oVar;
    }

    public final LinkedHashMap a(Set fields) {
        LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.j.g(fields, "fields");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(TtmlNode.ATTR_ID, this.f6165a);
        if (fields.contains(c.f6174k) || fields.contains(c.f6175l)) {
            List<e> list = this.f6166b;
            ArrayList arrayList = new ArrayList(t.l(list, 10));
            for (e eVar : list) {
                eVar.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                if (fields.contains(c.f6174k)) {
                    linkedHashMap3.put("number", eVar.f6181a);
                }
                if (fields.contains(c.f6175l)) {
                    linkedHashMap3.put("label", eVar.f6182b);
                }
                arrayList.add(linkedHashMap3);
            }
            linkedHashMap2.put("phones", arrayList);
        }
        if (fields.contains(c.m) || fields.contains(c.f6176n)) {
            List<b> list2 = this.c;
            ArrayList arrayList2 = new ArrayList(t.l(list2, 10));
            for (b bVar : list2) {
                bVar.getClass();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                if (fields.contains(c.m)) {
                    linkedHashMap4.put("address", bVar.f6168a);
                }
                if (fields.contains(c.f6176n)) {
                    linkedHashMap4.put("label", bVar.f6169b);
                }
                arrayList2.add(linkedHashMap4);
            }
            linkedHashMap2.put("emails", arrayList2);
        }
        c cVar = c.f6171b;
        LinkedHashMap linkedHashMap5 = null;
        if (fields.contains(cVar) || fields.contains(c.f) || fields.contains(c.f6172d) || fields.contains(c.e) || fields.contains(c.c) || fields.contains(c.f6173g)) {
            p pVar = this.f6167d;
            if (pVar != null) {
                linkedHashMap = new LinkedHashMap();
                if (fields.contains(cVar)) {
                    linkedHashMap.put("displayName", pVar.f6209a);
                }
                if (fields.contains(c.c)) {
                    linkedHashMap.put("namePrefix", pVar.f6210b);
                }
                if (fields.contains(c.f6172d)) {
                    linkedHashMap.put("givenName", pVar.c);
                }
                if (fields.contains(c.e)) {
                    linkedHashMap.put("middleName", pVar.f6211d);
                }
                if (fields.contains(c.f)) {
                    linkedHashMap.put("familyName", pVar.e);
                }
                if (fields.contains(c.f6173g)) {
                    linkedHashMap.put("nameSuffix", pVar.f);
                }
            } else {
                linkedHashMap = null;
            }
            linkedHashMap2.put("structuredName", linkedHashMap);
        }
        c cVar2 = c.h;
        if (!fields.contains(cVar2) && !fields.contains(c.i) && !fields.contains(c.j)) {
            return linkedHashMap2;
        }
        o oVar = this.e;
        if (oVar != null) {
            linkedHashMap5 = new LinkedHashMap();
            if (fields.contains(cVar2)) {
                linkedHashMap5.put("company", oVar.f6207a);
            }
            if (fields.contains(c.i)) {
                linkedHashMap5.put("department", oVar.f6208b);
            }
            if (fields.contains(c.j)) {
                linkedHashMap5.put("jobDescription", oVar.c);
            }
        }
        linkedHashMap2.put("organization", linkedHashMap5);
        return linkedHashMap2;
    }

    public final void b(a aVar) {
        this.f6166b = (!this.f6166b.isEmpty() || aVar.f6166b.isEmpty()) ? this.f6166b : aVar.f6166b;
        this.c = (!this.c.isEmpty() || aVar.c.isEmpty()) ? this.c : aVar.c;
        p pVar = this.f6167d;
        if (pVar == null) {
            pVar = aVar.f6167d;
        }
        this.f6167d = pVar;
        o oVar = this.e;
        if (oVar == null) {
            oVar = aVar.e;
        }
        this.e = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.j.b(this.f6165a, aVar.f6165a) && kotlin.jvm.internal.j.b(this.f6166b, aVar.f6166b) && kotlin.jvm.internal.j.b(this.c, aVar.c) && kotlin.jvm.internal.j.b(this.f6167d, aVar.f6167d) && kotlin.jvm.internal.j.b(this.e, aVar.e);
    }

    public final int hashCode() {
        int iD = AbstractC1414e.d(this.c, AbstractC1414e.d(this.f6166b, this.f6165a.hashCode() * 31, 31), 31);
        p pVar = this.f6167d;
        int iHashCode = (iD + (pVar == null ? 0 : pVar.hashCode())) * 31;
        o oVar = this.e;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "Contact(id=" + this.f6165a + ", phones=" + this.f6166b + ", emails=" + this.c + ", structuredName=" + this.f6167d + ", organization=" + this.e + ")";
    }
}
