package com.paymaya.data.api.deserializer;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.internal.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.QRMerchant;
import java.lang.reflect.Type;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class QRMerchantDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        QRMerchant.Builder builderSBuilder = QRMerchant.sBuilder();
        try {
            q qVarG = oVar.g();
            k kVar = qVarG.f10034a;
            if (kVar.containsKey("m")) {
                q qVarN = qVarG.n("m");
                k kVar2 = qVarN.f10034a;
                if (kVar2.containsKey("v")) {
                    builderSBuilder.mMerchantId(qVarN.m("v").j());
                }
                if (kVar2.containsKey("n")) {
                    builderSBuilder.mName(qVarN.m("n").j());
                }
                if (kVar2.containsKey("t")) {
                    builderSBuilder.mType(qVarN.m("t").j());
                }
            }
            if (kVar.containsKey("t")) {
                q qVarN2 = qVarG.n("t");
                if (qVarN2.f10034a.containsKey(TtmlNode.TAG_P)) {
                    builderSBuilder.mPaymentId(qVarN2.m(TtmlNode.TAG_P).j());
                }
                if (qVarN2.f10034a.containsKey(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)) {
                    builderSBuilder.mAmount(Amount.sBuilder().mCurrency("PHP").mValue(C.F(qVarN2.m(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY).j()).toString()).build());
                }
            }
        } catch (Exception unused) {
            a.b();
        }
        return builderSBuilder.build();
    }
}
