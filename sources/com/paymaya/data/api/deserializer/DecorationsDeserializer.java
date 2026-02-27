package com.paymaya.data.api.deserializer;

import S1.r;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.paymaya.domain.model.Decoration;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class DecorationsDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o json, Type type, m mVar) {
        j.g(json, "json");
        ArrayList arrayList = new ArrayList();
        Iterator it = (json instanceof l ? json.f() : new l()).f10032a.iterator();
        j.f(it, "iterator(...)");
        while (it.hasNext()) {
            o oVar = (o) it.next();
            oVar.getClass();
            if ((oVar instanceof q) && !(oVar instanceof p)) {
                q qVarG = oVar.g();
                String strP = r.p(qVarG, MPDbAdapter.KEY_CREATED_AT);
                if (strP == null) {
                    strP = "";
                }
                String strP2 = r.p(qVarG, "updated_at");
                if (strP2 == null) {
                    strP2 = "";
                }
                String strP3 = r.p(qVarG, TtmlNode.ATTR_ID);
                if (strP3 == null) {
                    strP3 = "";
                }
                String strP4 = r.p(qVarG, "category");
                if (strP4 == null) {
                    strP4 = "";
                }
                String strP5 = r.p(qVarG, "label");
                if (strP5 == null) {
                    strP5 = "";
                }
                String strP6 = r.p(qVarG, "description");
                if (strP6 == null) {
                    strP6 = "";
                }
                String strN = r.n(qVarG, "icon");
                if (strN == null) {
                    strN = "";
                }
                String strN2 = r.n(qVarG, "image");
                String str = strN2 != null ? strN2 : "";
                Integer numO = r.o(qVarG);
                Boolean boolM = r.m(qVarG, "hidden");
                arrayList.add(new Decoration(strP, strP2, strP3, strP4, strP5, strP6, strN, str, numO, boolM != null ? boolM.booleanValue() : false));
            }
        }
        return arrayList;
    }
}
