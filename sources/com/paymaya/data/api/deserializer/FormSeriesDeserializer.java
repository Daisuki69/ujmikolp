package com.paymaya.data.api.deserializer;

import com.google.gson.JsonParseException;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.domain.model.FormSeries;
import java.lang.reflect.Type;
import java.util.ArrayList;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class FormSeriesDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        ArrayList arrayList = new ArrayList();
        try {
            q qVarG = oVar.g();
            for (String str : new ArrayList(qVarG.f10034a.keySet())) {
                q qVarN = qVarG.n(str);
                for (String str2 : new ArrayList(qVarN.f10034a.keySet())) {
                    l lVar = (l) qVarN.f10034a.get(str2);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < lVar.f10032a.size(); i++) {
                        arrayList2.add(lVar.k(i).j());
                    }
                    arrayList.add(FormSeries.sBuilder().mFormSeries(str).mFormType(str2).mTaxTypeList(arrayList2).build());
                }
            }
        } catch (JsonParseException e) {
            e = e;
            e.getMessage();
            a.d();
        } catch (ClassCastException e7) {
            e = e7;
            e.getMessage();
            a.d();
        } catch (IllegalStateException e10) {
            e = e10;
            e.getMessage();
            a.d();
        }
        return arrayList;
    }
}
