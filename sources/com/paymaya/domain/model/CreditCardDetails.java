package com.paymaya.domain.model;

import com.google.android.gms.common.Scopes;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_CreditCardDetails;
import com.paymaya.domain.model.C$AutoValue_CreditCardDetails;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CreditCardDetails {

    public static abstract class Builder {
        public abstract CreditCardDetails build();

        public abstract Builder mCanLinkCard(boolean z4);

        public abstract Builder mCreditCard(CreditCard creditCard);

        public abstract Builder mFundSource(FundSource fundSource);

        public abstract Builder mUser(User user);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_CreditCardDetails.Builder().mCanLinkCard(false);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_CreditCardDetails.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("can_link_card")
    public abstract boolean mCanLinkCard();

    @InterfaceC1498b("card")
    public abstract CreditCard mCreditCard();

    @InterfaceC1498b("fund_source")
    public abstract FundSource mFundSource();

    @InterfaceC1498b(Scopes.PROFILE)
    public abstract User mUser();
}
