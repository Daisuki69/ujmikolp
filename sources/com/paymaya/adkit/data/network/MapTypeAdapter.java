package com.paymaya.adkit.data.network;

import cj.t;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.d;
import com.google.gson.internal.h;
import com.google.gson.internal.i;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class MapTypeAdapter implements n {
    public static Object a(r rVar) {
        Serializable serializable = rVar.f10035a;
        if (!(serializable instanceof Number)) {
            return serializable instanceof String ? rVar.j() : serializable instanceof Boolean ? Boolean.valueOf(rVar.c()) : rVar.j();
        }
        Number numberL = rVar.l();
        return numberL.doubleValue() == ((double) numberL.longValue()) ? String.valueOf(numberL.longValue()) : numberL.toString();
    }

    @Override // com.google.gson.n
    public final Object deserialize(o json, Type typeOfT, m context) {
        Object objC;
        j.g(json, "json");
        j.g(typeOfT, "typeOfT");
        j.g(context, "context");
        q qVarG = json.g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((i) qVarG.f10034a.entrySet()).iterator();
        while (((h) it).hasNext()) {
            com.google.gson.internal.j jVarB = ((h) it).b();
            o oVar = (o) jVarB.getValue();
            oVar.getClass();
            if (oVar instanceof r) {
                linkedHashMap.put(jVarB.getKey(), a(oVar.h()));
            } else if (oVar instanceof l) {
                Object key = jVarB.getKey();
                l lVarF = oVar.f();
                ArrayList arrayList = new ArrayList(t.l(lVarF, 10));
                for (o oVar2 : lVarF.f10032a) {
                    oVar2.getClass();
                    if (oVar2 instanceof r) {
                        objC = a(oVar2.h());
                    } else {
                        com.google.gson.j jVar = ((TreeTypeAdapter) ((T3.l) context).f5786b).c;
                        jVar.getClass();
                        objC = jVar.c(new d(oVar2), TypeToken.get((Type) Object.class));
                        j.d(objC);
                    }
                    arrayList.add(objC);
                }
                linkedHashMap.put(key, arrayList);
            } else {
                Object key2 = jVarB.getKey();
                com.google.gson.j jVar2 = ((TreeTypeAdapter) ((T3.l) context).f5786b).c;
                jVar2.getClass();
                linkedHashMap.put(key2, jVar2.c(new d(oVar), TypeToken.get((Type) Object.class)));
            }
        }
        return linkedHashMap;
    }
}
