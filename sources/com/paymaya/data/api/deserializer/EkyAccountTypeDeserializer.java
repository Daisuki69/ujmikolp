package com.paymaya.data.api.deserializer;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonParseException;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.domain.model.EkycAccountType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class EkyAccountTypeDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        ArrayList arrayList = new ArrayList();
        try {
            q qVarG = oVar.g();
            for (String str : new ArrayList(qVarG.f10034a.keySet())) {
                q qVarN = qVarG.n(str);
                for (String str2 : new ArrayList(qVarN.f10034a.keySet())) {
                    o oVarM = qVarN.m(str2);
                    oVarM.getClass();
                    if (oVarM instanceof l) {
                        l lVar = (l) qVarN.f10034a.get(str2);
                        for (int i = 0; i < lVar.f10032a.size(); i++) {
                            q qVarG2 = lVar.k(i).g();
                            arrayList.add(EkycAccountType.sBuilder().mAccountType(str).mClassification(str2).mName(qVarG2.m(AppMeasurementSdk.ConditionalUserProperty.NAME).j()).mType(qVarG2.m(SessionDescription.ATTR_TYPE).j()).build());
                        }
                    }
                }
            }
        } catch (JsonParseException | ClassCastException | IllegalStateException e) {
            e.getMessage();
            a.d();
        }
        return arrayList;
    }
}
