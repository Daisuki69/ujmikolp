package com.paymaya.domain.store;

import com.paymaya.data.api.ConfigApi;
import com.paymaya.domain.model.FormSeries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConfigApi f11401b;
    public com.paymaya.data.database.repository.r c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.preference.a f11402d;

    public final ArrayList a() {
        List listB = this.c.b(new mg.c(7));
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((FormSeries) it.next()).mFormSeries());
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final ArrayList b(String str) {
        M5.a aVar = new M5.a(1);
        aVar.f3080b = str;
        List listB = this.c.b(aVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((FormSeries) it.next()).mFormType());
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final List c(String str, String str2) {
        M5.e eVar = new M5.e(1);
        eVar.f3087b = str2;
        eVar.c = str;
        List listB = this.c.b(eVar);
        if (listB.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Collections.sort(((FormSeries) listB.get(0)).mTaxTypeList());
        return ((FormSeries) listB.get(0)).mTaxTypeList();
    }
}
