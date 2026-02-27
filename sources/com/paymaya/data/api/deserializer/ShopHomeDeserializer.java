package com.paymaya.data.api.deserializer;

import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import com.paymaya.domain.model.ShopHome;
import java.lang.reflect.Type;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class ShopHomeDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o json, Type typeOfT, m deserializationContext) {
        j.g(json, "json");
        j.g(typeOfT, "typeOfT");
        j.g(deserializationContext, "deserializationContext");
        q qVarG = json.g();
        ShopHome.Builder builderSBuilder = ShopHome.sBuilder();
        if (qVarG.f10034a.containsKey("sections")) {
            o oVarM = qVarG.m("sections");
            oVarM.getClass();
            String strJ = oVarM instanceof r ? oVarM.j() : oVarM instanceof l ? oVarM.f().toString() : null;
            if (strJ == null) {
                builderSBuilder.mSections(strJ);
            }
        }
        ShopHome shopHomeBuild = builderSBuilder.build();
        j.f(shopHomeBuild, "build(...)");
        return shopHomeBuild;
    }
}
