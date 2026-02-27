package com.paymaya.data.api.deserializer;

import com.google.gson.internal.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.Product;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ProductListDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        q qVarG = oVar.g();
        ArrayList arrayList = new ArrayList();
        k kVar = qVarG.f10034a;
        if (kVar.containsKey("records")) {
            l lVar = (l) kVar.get("records");
            int size = lVar.f10032a.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((Product) A.f10366a.b(lVar.k(i), Product.class)).toBuilder().mPage(qVarG.m("page").e()).build());
            }
        }
        return arrayList;
    }
}
