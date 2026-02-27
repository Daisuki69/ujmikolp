package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a {
    public b() {
    }

    public List<String> n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = c().f21154a.entrySet().iterator();
        while (it.hasNext()) {
            yf.j jVar = (yf.j) ((Map.Entry) it.next()).getKey();
            if (!yf.j.N0.equals(jVar)) {
                arrayList.add(jVar.f21267a);
            }
        }
        return arrayList;
    }

    public yf.b o(String str) {
        return c().m(str);
    }

    public yf.b p(String str, yf.b bVar) {
        yf.b bVarM = c().m(str);
        return bVarM == null ? bVar : bVarM;
    }

    public void q(String str, yf.b bVar) {
        yf.b bVarO = o(str);
        c().F(yf.j.f(str), bVar);
        k(bVarO, bVar);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", attributes={");
        Iterator<String> it = n().iterator();
        while (it.hasNext()) {
            String next = it.next();
            sb2.append(next);
            sb2.append('=');
            sb2.append(o(next));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(yf.d dVar) {
        super(dVar);
    }
}
