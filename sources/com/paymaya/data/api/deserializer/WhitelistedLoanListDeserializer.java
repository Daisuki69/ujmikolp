package com.paymaya.data.api.deserializer;

import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.Term;
import com.paymaya.domain.model.WhitelistedLoan;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class WhitelistedLoanListDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        ArrayList arrayList = new ArrayList();
        l lVarF = oVar.f();
        for (int i = 0; i < lVarF.f10032a.size(); i++) {
            q qVarG = lVarF.k(i).g();
            q qVarN = qVarG.n("loan_provider_logo").n("android");
            ImageUrl imageUrlBuild = ImageUrl.sBuilder().mHdpi(qVarN.m("hdpi").j()).mMdpi(qVarN.m("mdpi").j()).mXhdpi(qVarN.m("xhdpi").j()).build();
            WhitelistedLoan.Builder builderMExpiry = WhitelistedLoan.sBuilder().mProductKey(qVarG.m("product_key").j()).mExpiry(qVarG.m("expiry").j());
            o oVarM = qVarG.m("validity");
            j jVar = A.f10366a;
            arrayList.add(builderMExpiry.mValidityTerm((Term) jVar.b(oVarM, Term.class)).mPrincipal((Amount) jVar.b(qVarG.m("principal"), Amount.class)).mLoanTerm((Term) jVar.b(qVarG.m("loan_term"), Term.class)).mInterestRate(qVarG.m("interest_rate").j()).mLoanProviderLogo(imageUrlBuild).build());
        }
        return arrayList;
    }
}
