package com.paymaya.data.api.deserializer;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.LoanProductDetails;
import com.paymaya.domain.model.Term;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class LoanProductDetailsDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        q qVarG = oVar.g();
        q qVarN = qVarG.n("loan_provider_logo").n("android");
        ImageUrl imageUrlBuild = ImageUrl.sBuilder().mHdpi(qVarN.m("hdpi").j()).mMdpi(qVarN.m("mdpi").j()).mXhdpi(qVarN.m("xhdpi").j()).build();
        LoanProductDetails.Builder builderMProductKey = LoanProductDetails.sBuilder().mProductKey(qVarG.m("product_key").j());
        o oVarM = qVarG.m("principal");
        j jVar = A.f10366a;
        return builderMProductKey.mPrincipal((Amount) jVar.b(oVarM, Amount.class)).mInterestRate(qVarG.m("interest_rate").j()).mLoanTerm((Term) jVar.b(qVarG.m("loan_term"), Term.class)).mNetDisbursementAmount((Amount) jVar.b(qVarG.m("net_disbursement_amount"), Amount.class)).mProcessingFee((Amount) jVar.b(qVarG.m("processing_fee"), Amount.class)).mRepaymentAmount((Amount) jVar.b(qVarG.m("repayment_amount"), Amount.class)).mOrganization(qVarG.m("organization").j()).mLoanProviderLogo(imageUrlBuild).mName(qVarG.m(AppMeasurementSdk.ConditionalUserProperty.NAME).j()).mDescription(qVarG.m("description").j()).mMinLoanAmount((Amount) jVar.b(qVarG.m("min_loan_amount"), Amount.class)).mMaxLoanAmount((Amount) jVar.b(qVarG.m("max_loan_amount"), Amount.class)).mAmortizationFrequency(qVarG.m("amortization_frequency").j()).mTermsAndConditions(qVarG.m("terms_and_conditions").j()).build();
    }
}
