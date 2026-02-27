package com.paymaya.data.api.deserializer;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.MerchantPayment;
import java.lang.reflect.Type;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class MerchantPaymentDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        q qVarG = oVar.g();
        k kVar = qVarG.f10034a;
        if (!kVar.containsKey("payment_token")) {
            a.c();
            return null;
        }
        MerchantPayment.Builder builderSBuilder = MerchantPayment.sBuilder();
        MerchantPayment.Builder builderMPaymentToken = builderSBuilder.mPaymentToken(qVarG.m("payment_token").g().m(TtmlNode.ATTR_ID).j());
        o oVarM = qVarG.m("fees");
        j jVar = A.f10366a;
        builderMPaymentToken.mPaymentFees((Amount) jVar.b(oVarM, Amount.class));
        if (kVar.containsKey("merchant")) {
            q qVarG2 = qVarG.m("merchant").g();
            builderSBuilder.mMerchant(qVarG2.m("value").j());
            builderSBuilder.mMerchantName(qVarG2.m("mername").j());
        }
        if (kVar.containsKey("balance")) {
            q qVarG3 = qVarG.m("balance").g();
            builderSBuilder.mCurrentBalance((Amount) jVar.b(qVarG3.m("current_balance"), Amount.class)).mAvailableBalance((Amount) jVar.b(qVarG3.m("available_balance"), Amount.class));
        }
        if (kVar.containsKey("amount")) {
            builderSBuilder.mAmount((Amount) jVar.b(qVarG.m("amount"), Amount.class));
        }
        if (kVar.containsKey("request_reference_no")) {
            builderSBuilder.mRequestReferenceNo(qVarG.m("request_reference_no").j());
        }
        if (kVar.containsKey("redirect_url")) {
            o oVarM2 = qVarG.m("redirect_url");
            oVarM2.getClass();
            if (!(oVarM2 instanceof p)) {
                builderSBuilder.mRedirectUrl(qVarG.m("redirect_url").j());
            }
        }
        return builderSBuilder.build();
    }
}
