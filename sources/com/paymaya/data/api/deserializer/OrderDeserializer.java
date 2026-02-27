package com.paymaya.data.api.deserializer;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Order;
import java.lang.reflect.Type;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class OrderDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        q qVarG = oVar.g();
        k kVar = qVarG.f10034a;
        if (!kVar.containsKey("order_token")) {
            a.c();
            return null;
        }
        q qVarG2 = qVarG.m("order_token").g();
        Order.Builder builderMStatus = Order.sBuilder().mId(qVarG2.m(TtmlNode.ATTR_ID).j()).mStatus(qVarG2.m("status").j());
        if (kVar.containsKey("balance")) {
            q qVarG3 = qVarG.m("balance").g();
            o oVarM = qVarG3.m("current_balance");
            j jVar = A.f10366a;
            builderMStatus.mCurrentBalance((Amount) jVar.b(oVarM, Amount.class)).mAvailableBalance((Amount) jVar.b(qVarG3.m("available_balance"), Amount.class));
        }
        if (kVar.containsKey("payment_id")) {
            builderMStatus.mPaymentId(qVarG.m("payment_id").j());
        }
        if (kVar.containsKey("code")) {
            builderMStatus.mCode(qVarG.m("code").j());
        }
        return builderMStatus.build();
    }
}
