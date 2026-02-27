package com.paymaya.data.api.deserializer;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.LoanInstance;
import com.paymaya.domain.model.Term;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class LoanInstanceListDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        ArrayList arrayList = new ArrayList();
        l lVarF = oVar.f();
        for (int i = 0; i < lVarF.f10032a.size(); i++) {
            q qVarG = lVarF.k(i).g();
            q qVarN = qVarG.n("loan_provider_logo").n("android");
            ImageUrl imageUrlBuild = ImageUrl.sBuilder().mHdpi(qVarN.m("hdpi").j()).mMdpi(qVarN.m("mdpi").j()).mXhdpi(qVarN.m("xhdpi").j()).build();
            LoanInstance.Builder builderSBuilder = LoanInstance.sBuilder();
            LoanInstance.Builder builderMStatus = builderSBuilder.mId(qVarG.m(TtmlNode.ATTR_ID).j()).mProductKey(qVarG.m("product_key").j()).mName(qVarG.m(AppMeasurementSdk.ConditionalUserProperty.NAME).j()).mDescription(qVarG.m("description").j()).mStatus(qVarG.m("status").j());
            o oVarM = qVarG.m("principal");
            j jVar = A.f10366a;
            builderMStatus.mPrincipal((Amount) jVar.b(oVarM, Amount.class)).mNetDisbursementAmount((Amount) jVar.b(qVarG.m("net_disbursement_amount"), Amount.class)).mLoanTerm((Term) jVar.b(qVarG.m("loan_term"), Term.class)).mInterestRate(qVarG.m("interest_rate").j()).mProcessingFee((Amount) jVar.b(qVarG.m("processing_fee"), Amount.class)).mRepaymentAmount((Amount) jVar.b(qVarG.m("repayment_amount"), Amount.class)).mSubmissionDate(qVarG.m("submission_date").j()).mLoanProviderLogo(imageUrlBuild).mBillerSlug(qVarG.m("biller_slug").j());
            k kVar = qVarG.f10034a;
            if (kVar.containsKey("loan_id")) {
                builderSBuilder.mLoanId(qVarG.m("loan_id").j());
            }
            if (kVar.containsKey("payment_due_date")) {
                builderSBuilder.mPaymentDueDate(qVarG.m("payment_due_date").j());
            }
            if (kVar.containsKey("remaining_days")) {
                builderSBuilder.mRemainingDays((Term) jVar.b(qVarG.m("remaining_days"), Term.class));
            }
            arrayList.add(builderSBuilder.build());
        }
        return arrayList;
    }
}
