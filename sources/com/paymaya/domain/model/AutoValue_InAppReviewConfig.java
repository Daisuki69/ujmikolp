package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.InAppReviewConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_InAppReviewConfig extends C$AutoValue_InAppReviewConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(InAppReviewConfig)";
        }

        @Override // com.google.gson.y
        public InAppReviewConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            InAppReviewConfig.Builder builderSBuilder = InAppReviewConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "purchase_history":
                            y yVarH = this.boolean__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH;
                            }
                            builderSBuilder.mPurchaseHistory((Boolean) yVarH.read(aVar));
                            break;
                        case "shop_purchase":
                            y yVarH2 = this.boolean__adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH2;
                            }
                            builderSBuilder.mShopPurchase((Boolean) yVarH2.read(aVar));
                            break;
                        case "send_money":
                            y yVarH3 = this.boolean__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH3;
                            }
                            builderSBuilder.mSendMoney((Boolean) yVarH3.read(aVar));
                            break;
                        case "qr_payment":
                            y yVarH4 = this.boolean__adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH4;
                            }
                            builderSBuilder.mQrPayment((Boolean) yVarH4.read(aVar));
                            break;
                        case "default":
                            y yVarH5 = this.boolean__adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH5;
                            }
                            builderSBuilder.mDefault((Boolean) yVarH5.read(aVar));
                            break;
                        case "bills_pay":
                            y yVarH6 = this.boolean__adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH6;
                            }
                            builderSBuilder.mBillsPay((Boolean) yVarH6.read(aVar));
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
        public void write(b bVar, InAppReviewConfig inAppReviewConfig) throws IOException {
            if (inAppReviewConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("default");
            if (inAppReviewConfig.mDefault() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, inAppReviewConfig.mDefault());
            }
            bVar.m("send_money");
            if (inAppReviewConfig.mSendMoney() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, inAppReviewConfig.mSendMoney());
            }
            bVar.m("bills_pay");
            if (inAppReviewConfig.mBillsPay() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.boolean__adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH3;
                }
                yVarH3.write(bVar, inAppReviewConfig.mBillsPay());
            }
            bVar.m("qr_payment");
            if (inAppReviewConfig.mQrPayment() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.boolean__adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH4;
                }
                yVarH4.write(bVar, inAppReviewConfig.mQrPayment());
            }
            bVar.m("shop_purchase");
            if (inAppReviewConfig.mShopPurchase() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.boolean__adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH5;
                }
                yVarH5.write(bVar, inAppReviewConfig.mShopPurchase());
            }
            bVar.m("purchase_history");
            if (inAppReviewConfig.mPurchaseHistory() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.boolean__adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH6;
                }
                yVarH6.write(bVar, inAppReviewConfig.mPurchaseHistory());
            }
            bVar.k();
        }
    }

    public AutoValue_InAppReviewConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        new InAppReviewConfig(bool, bool2, bool3, bool4, bool5, bool6) { // from class: com.paymaya.domain.model.$AutoValue_InAppReviewConfig
            private final Boolean mBillsPay;
            private final Boolean mDefault;
            private final Boolean mPurchaseHistory;
            private final Boolean mQrPayment;
            private final Boolean mSendMoney;
            private final Boolean mShopPurchase;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_InAppReviewConfig$Builder */
            public static class Builder extends InAppReviewConfig.Builder {
                private Boolean mBillsPay;
                private Boolean mDefault;
                private Boolean mPurchaseHistory;
                private Boolean mQrPayment;
                private Boolean mSendMoney;
                private Boolean mShopPurchase;

                public /* synthetic */ Builder(InAppReviewConfig inAppReviewConfig, int i) {
                    this(inAppReviewConfig);
                }

                @Override // com.paymaya.domain.model.InAppReviewConfig.Builder
                public InAppReviewConfig build() {
                    return new AutoValue_InAppReviewConfig(this.mDefault, this.mSendMoney, this.mBillsPay, this.mQrPayment, this.mShopPurchase, this.mPurchaseHistory);
                }

                @Override // com.paymaya.domain.model.InAppReviewConfig.Builder
                public InAppReviewConfig.Builder mBillsPay(Boolean bool) {
                    this.mBillsPay = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.InAppReviewConfig.Builder
                public InAppReviewConfig.Builder mDefault(Boolean bool) {
                    this.mDefault = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.InAppReviewConfig.Builder
                public InAppReviewConfig.Builder mPurchaseHistory(Boolean bool) {
                    this.mPurchaseHistory = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.InAppReviewConfig.Builder
                public InAppReviewConfig.Builder mQrPayment(Boolean bool) {
                    this.mQrPayment = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.InAppReviewConfig.Builder
                public InAppReviewConfig.Builder mSendMoney(Boolean bool) {
                    this.mSendMoney = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.InAppReviewConfig.Builder
                public InAppReviewConfig.Builder mShopPurchase(Boolean bool) {
                    this.mShopPurchase = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(InAppReviewConfig inAppReviewConfig) {
                    this.mDefault = inAppReviewConfig.mDefault();
                    this.mSendMoney = inAppReviewConfig.mSendMoney();
                    this.mBillsPay = inAppReviewConfig.mBillsPay();
                    this.mQrPayment = inAppReviewConfig.mQrPayment();
                    this.mShopPurchase = inAppReviewConfig.mShopPurchase();
                    this.mPurchaseHistory = inAppReviewConfig.mPurchaseHistory();
                }
            }

            {
                this.mDefault = bool;
                this.mSendMoney = bool2;
                this.mBillsPay = bool3;
                this.mQrPayment = bool4;
                this.mShopPurchase = bool5;
                this.mPurchaseHistory = bool6;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof InAppReviewConfig) {
                    InAppReviewConfig inAppReviewConfig = (InAppReviewConfig) obj;
                    Boolean bool7 = this.mDefault;
                    if (bool7 != null ? bool7.equals(inAppReviewConfig.mDefault()) : inAppReviewConfig.mDefault() == null) {
                        Boolean bool8 = this.mSendMoney;
                        if (bool8 != null ? bool8.equals(inAppReviewConfig.mSendMoney()) : inAppReviewConfig.mSendMoney() == null) {
                            Boolean bool9 = this.mBillsPay;
                            if (bool9 != null ? bool9.equals(inAppReviewConfig.mBillsPay()) : inAppReviewConfig.mBillsPay() == null) {
                                Boolean bool10 = this.mQrPayment;
                                if (bool10 != null ? bool10.equals(inAppReviewConfig.mQrPayment()) : inAppReviewConfig.mQrPayment() == null) {
                                    Boolean bool11 = this.mShopPurchase;
                                    if (bool11 != null ? bool11.equals(inAppReviewConfig.mShopPurchase()) : inAppReviewConfig.mShopPurchase() == null) {
                                        Boolean bool12 = this.mPurchaseHistory;
                                        if (bool12 != null ? bool12.equals(inAppReviewConfig.mPurchaseHistory()) : inAppReviewConfig.mPurchaseHistory() == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Boolean bool7 = this.mDefault;
                int iHashCode = ((bool7 == null ? 0 : bool7.hashCode()) ^ 1000003) * 1000003;
                Boolean bool8 = this.mSendMoney;
                int iHashCode2 = (iHashCode ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
                Boolean bool9 = this.mBillsPay;
                int iHashCode3 = (iHashCode2 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
                Boolean bool10 = this.mQrPayment;
                int iHashCode4 = (iHashCode3 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
                Boolean bool11 = this.mShopPurchase;
                int iHashCode5 = (iHashCode4 ^ (bool11 == null ? 0 : bool11.hashCode())) * 1000003;
                Boolean bool12 = this.mPurchaseHistory;
                return iHashCode5 ^ (bool12 != null ? bool12.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.InAppReviewConfig
            @InterfaceC1498b("bills_pay")
            public Boolean mBillsPay() {
                return this.mBillsPay;
            }

            @Override // com.paymaya.domain.model.InAppReviewConfig
            @InterfaceC1498b("default")
            public Boolean mDefault() {
                return this.mDefault;
            }

            @Override // com.paymaya.domain.model.InAppReviewConfig
            @InterfaceC1498b("purchase_history")
            public Boolean mPurchaseHistory() {
                return this.mPurchaseHistory;
            }

            @Override // com.paymaya.domain.model.InAppReviewConfig
            @InterfaceC1498b("qr_payment")
            public Boolean mQrPayment() {
                return this.mQrPayment;
            }

            @Override // com.paymaya.domain.model.InAppReviewConfig
            @InterfaceC1498b("send_money")
            public Boolean mSendMoney() {
                return this.mSendMoney;
            }

            @Override // com.paymaya.domain.model.InAppReviewConfig
            @InterfaceC1498b("shop_purchase")
            public Boolean mShopPurchase() {
                return this.mShopPurchase;
            }

            @Override // com.paymaya.domain.model.InAppReviewConfig
            public InAppReviewConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("InAppReviewConfig{mDefault=");
                sb2.append(this.mDefault);
                sb2.append(", mSendMoney=");
                sb2.append(this.mSendMoney);
                sb2.append(", mBillsPay=");
                sb2.append(this.mBillsPay);
                sb2.append(", mQrPayment=");
                sb2.append(this.mQrPayment);
                sb2.append(", mShopPurchase=");
                sb2.append(this.mShopPurchase);
                sb2.append(", mPurchaseHistory=");
                return AbstractC1213b.N(sb2, this.mPurchaseHistory, "}");
            }
        };
    }
}
