package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.common.Scopes;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.CreditCardDetails;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CreditCardDetails extends C$AutoValue_CreditCardDetails {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private volatile y creditCard_adapter;
        private volatile y fundSource_adapter;
        private final j gson;
        private volatile y user_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(CreditCardDetails)";
        }

        @Override // com.google.gson.y
        public CreditCardDetails read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            CreditCardDetails.Builder builderSBuilder = CreditCardDetails.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "fund_source":
                            y yVarH = this.fundSource_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(FundSource.class);
                                this.fundSource_adapter = yVarH;
                            }
                            builderSBuilder.mFundSource((FundSource) yVarH.read(aVar));
                            break;
                        case "profile":
                            y yVarH2 = this.user_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(User.class);
                                this.user_adapter = yVarH2;
                            }
                            builderSBuilder.mUser((User) yVarH2.read(aVar));
                            break;
                        case "card":
                            y yVarH3 = this.creditCard_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(CreditCard.class);
                                this.creditCard_adapter = yVarH3;
                            }
                            builderSBuilder.mCreditCard((CreditCard) yVarH3.read(aVar));
                            break;
                        case "can_link_card":
                            y yVarH4 = this.boolean__adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH4;
                            }
                            builderSBuilder.mCanLinkCard(((Boolean) yVarH4.read(aVar)).booleanValue());
                            break;
                        default:
                            aVar.Q();
                            break;
                    }
                } else {
                    aVar.G();
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, CreditCardDetails creditCardDetails) throws IOException {
            if (creditCardDetails == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(Scopes.PROFILE);
            if (creditCardDetails.mUser() == null) {
                bVar.r();
            } else {
                y yVarH = this.user_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(User.class);
                    this.user_adapter = yVarH;
                }
                yVarH.write(bVar, creditCardDetails.mUser());
            }
            bVar.m("fund_source");
            if (creditCardDetails.mFundSource() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.fundSource_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(FundSource.class);
                    this.fundSource_adapter = yVarH2;
                }
                yVarH2.write(bVar, creditCardDetails.mFundSource());
            }
            bVar.m("card");
            if (creditCardDetails.mCreditCard() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.creditCard_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(CreditCard.class);
                    this.creditCard_adapter = yVarH3;
                }
                yVarH3.write(bVar, creditCardDetails.mCreditCard());
            }
            bVar.m("can_link_card");
            y yVarH4 = this.boolean__adapter;
            if (yVarH4 == null) {
                yVarH4 = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH4;
            }
            yVarH4.write(bVar, Boolean.valueOf(creditCardDetails.mCanLinkCard()));
            bVar.k();
        }
    }

    public AutoValue_CreditCardDetails(final User user, final FundSource fundSource, final CreditCard creditCard, final boolean z4) {
        new CreditCardDetails(user, fundSource, creditCard, z4) { // from class: com.paymaya.domain.model.$AutoValue_CreditCardDetails
            private final boolean mCanLinkCard;
            private final CreditCard mCreditCard;
            private final FundSource mFundSource;
            private final User mUser;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_CreditCardDetails$Builder */
            public static class Builder extends CreditCardDetails.Builder {
                private Boolean mCanLinkCard;
                private CreditCard mCreditCard;
                private FundSource mFundSource;
                private User mUser;

                @Override // com.paymaya.domain.model.CreditCardDetails.Builder
                public CreditCardDetails build() {
                    String strI = this.mUser == null ? " mUser" : "";
                    if (this.mFundSource == null) {
                        strI = s.i(strI, " mFundSource");
                    }
                    if (this.mCreditCard == null) {
                        strI = s.i(strI, " mCreditCard");
                    }
                    if (this.mCanLinkCard == null) {
                        strI = s.i(strI, " mCanLinkCard");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_CreditCardDetails(this.mUser, this.mFundSource, this.mCreditCard, this.mCanLinkCard.booleanValue());
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.CreditCardDetails.Builder
                public CreditCardDetails.Builder mCanLinkCard(boolean z4) {
                    this.mCanLinkCard = Boolean.valueOf(z4);
                    return this;
                }

                @Override // com.paymaya.domain.model.CreditCardDetails.Builder
                public CreditCardDetails.Builder mCreditCard(CreditCard creditCard) {
                    if (creditCard == null) {
                        throw new NullPointerException("Null mCreditCard");
                    }
                    this.mCreditCard = creditCard;
                    return this;
                }

                @Override // com.paymaya.domain.model.CreditCardDetails.Builder
                public CreditCardDetails.Builder mFundSource(FundSource fundSource) {
                    if (fundSource == null) {
                        throw new NullPointerException("Null mFundSource");
                    }
                    this.mFundSource = fundSource;
                    return this;
                }

                @Override // com.paymaya.domain.model.CreditCardDetails.Builder
                public CreditCardDetails.Builder mUser(User user) {
                    if (user == null) {
                        throw new NullPointerException("Null mUser");
                    }
                    this.mUser = user;
                    return this;
                }
            }

            {
                if (user == null) {
                    throw new NullPointerException("Null mUser");
                }
                this.mUser = user;
                if (fundSource == null) {
                    throw new NullPointerException("Null mFundSource");
                }
                this.mFundSource = fundSource;
                if (creditCard == null) {
                    throw new NullPointerException("Null mCreditCard");
                }
                this.mCreditCard = creditCard;
                this.mCanLinkCard = z4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof CreditCardDetails) {
                    CreditCardDetails creditCardDetails = (CreditCardDetails) obj;
                    if (this.mUser.equals(creditCardDetails.mUser()) && this.mFundSource.equals(creditCardDetails.mFundSource()) && this.mCreditCard.equals(creditCardDetails.mCreditCard()) && this.mCanLinkCard == creditCardDetails.mCanLinkCard()) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((this.mUser.hashCode() ^ 1000003) * 1000003) ^ this.mFundSource.hashCode()) * 1000003) ^ this.mCreditCard.hashCode()) * 1000003) ^ (this.mCanLinkCard ? 1231 : 1237);
            }

            @Override // com.paymaya.domain.model.CreditCardDetails
            @InterfaceC1498b("can_link_card")
            public boolean mCanLinkCard() {
                return this.mCanLinkCard;
            }

            @Override // com.paymaya.domain.model.CreditCardDetails
            @InterfaceC1498b("card")
            public CreditCard mCreditCard() {
                return this.mCreditCard;
            }

            @Override // com.paymaya.domain.model.CreditCardDetails
            @InterfaceC1498b("fund_source")
            public FundSource mFundSource() {
                return this.mFundSource;
            }

            @Override // com.paymaya.domain.model.CreditCardDetails
            @InterfaceC1498b(Scopes.PROFILE)
            public User mUser() {
                return this.mUser;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("CreditCardDetails{mUser=");
                sb2.append(this.mUser);
                sb2.append(", mFundSource=");
                sb2.append(this.mFundSource);
                sb2.append(", mCreditCard=");
                sb2.append(this.mCreditCard);
                sb2.append(", mCanLinkCard=");
                return s.s(sb2, this.mCanLinkCard, "}");
            }
        };
    }
}
