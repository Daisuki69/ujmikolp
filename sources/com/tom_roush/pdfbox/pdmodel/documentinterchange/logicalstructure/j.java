package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yf.C2531a;

/* JADX INFO: loaded from: classes4.dex */
public class j extends a {
    public static final String c = "UserProperties";

    public j() {
        l(c);
    }

    public void n(k kVar) {
        ((C2531a) c().q(yf.j.f21195T0)).f21151a.add(kVar.c());
        j();
    }

    public List<k> o() {
        C2531a c2531a = (C2531a) c().q(yf.j.f21195T0);
        ArrayList arrayList = new ArrayList(c2531a.f21151a.size());
        for (int i = 0; i < c2531a.f21151a.size(); i++) {
            arrayList.add(new k((yf.d) c2531a.k(i), this));
        }
        return arrayList;
    }

    public void p(k kVar) {
        if (kVar == null) {
            return;
        }
        ((C2531a) c().q(yf.j.f21195T0)).q(kVar.c());
        j();
    }

    public void q(List<k> list) {
        C2531a c2531a = new C2531a();
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            c2531a.f21151a.add(it.next().c());
        }
        c().F(yf.j.f21195T0, c2531a);
    }

    public void r(k kVar) {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        return super.toString() + ", userProperties=" + o();
    }

    public j(yf.d dVar) {
        super(dVar);
    }
}
