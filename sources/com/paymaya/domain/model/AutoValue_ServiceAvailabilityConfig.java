package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ServiceAvailabilityConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ServiceAvailabilityConfig extends C$AutoValue_ServiceAvailabilityConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y availabilityConfig_adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ServiceAvailabilityConfig)";
        }

        @Override // com.google.gson.y
        public ServiceAvailabilityConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ServiceAvailabilityConfig.Builder builderSBuilder = ServiceAvailabilityConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "add_money_via_card_service":
                            y yVarH = this.availabilityConfig_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH;
                            }
                            builderSBuilder.mAddMoneyViaCardService((AvailabilityConfig) yVarH.read(aVar));
                            break;
                        case "vouchers_service":
                            y yVarH2 = this.availabilityConfig_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH2;
                            }
                            builderSBuilder.mVouchersAvailability((AvailabilityConfig) yVarH2.read(aVar));
                            break;
                        case "crypto":
                            y yVarH3 = this.availabilityConfig_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH3;
                            }
                            builderSBuilder.mCryptoAvailability((AvailabilityConfig) yVarH3.read(aVar));
                            break;
                        case "maya_credit":
                            y yVarH4 = this.availabilityConfig_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH4;
                            }
                            builderSBuilder.mMayaCreditAvailability((AvailabilityConfig) yVarH4.read(aVar));
                            break;
                        case "missions":
                            y yVarH5 = this.availabilityConfig_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH5;
                            }
                            builderSBuilder.mMissionsAvailability((AvailabilityConfig) yVarH5.read(aVar));
                            break;
                        case "shop_service":
                            y yVarH6 = this.availabilityConfig_adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH6;
                            }
                            builderSBuilder.mShopServiceAvailability((AvailabilityConfig) yVarH6.read(aVar));
                            break;
                        case "pay_bills":
                            y yVarH7 = this.availabilityConfig_adapter;
                            if (yVarH7 == null) {
                                yVarH7 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH7;
                            }
                            builderSBuilder.mPayBillsAvailability((AvailabilityConfig) yVarH7.read(aVar));
                            break;
                        case "my_favorites":
                            y yVarH8 = this.availabilityConfig_adapter;
                            if (yVarH8 == null) {
                                yVarH8 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH8;
                            }
                            builderSBuilder.mFavoritesAvailability((AvailabilityConfig) yVarH8.read(aVar));
                            break;
                        case "bank_pull_service":
                            y yVarH9 = this.availabilityConfig_adapter;
                            if (yVarH9 == null) {
                                yVarH9 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH9;
                            }
                            builderSBuilder.mCashInViaBankServiceAvailability((AvailabilityConfig) yVarH9.read(aVar));
                            break;
                        case "shop_purchase_history":
                            y yVarH10 = this.availabilityConfig_adapter;
                            if (yVarH10 == null) {
                                yVarH10 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH10;
                            }
                            builderSBuilder.mShopPurchaseHistoryAvailability((AvailabilityConfig) yVarH10.read(aVar));
                            break;
                        case "load":
                            y yVarH11 = this.availabilityConfig_adapter;
                            if (yVarH11 == null) {
                                yVarH11 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH11;
                            }
                            builderSBuilder.mLoadAvailability((AvailabilityConfig) yVarH11.read(aVar));
                            break;
                        case "cards":
                            y yVarH12 = this.availabilityConfig_adapter;
                            if (yVarH12 == null) {
                                yVarH12 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH12;
                            }
                            builderSBuilder.mCardsAvailability((AvailabilityConfig) yVarH12.read(aVar));
                            break;
                        case "funds":
                            y yVarH13 = this.availabilityConfig_adapter;
                            if (yVarH13 == null) {
                                yVarH13 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH13;
                            }
                            builderSBuilder.mFundsAvailability((AvailabilityConfig) yVarH13.read(aVar));
                            break;
                        case "inbox":
                            y yVarH14 = this.availabilityConfig_adapter;
                            if (yVarH14 == null) {
                                yVarH14 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH14;
                            }
                            builderSBuilder.mInboxAvailability((AvailabilityConfig) yVarH14.read(aVar));
                            break;
                        case "loan_service":
                            y yVarH15 = this.availabilityConfig_adapter;
                            if (yVarH15 == null) {
                                yVarH15 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH15;
                            }
                            builderSBuilder.mLoanAvailability((AvailabilityConfig) yVarH15.read(aVar));
                            break;
                        case "qr_off_us":
                            y yVarH16 = this.availabilityConfig_adapter;
                            if (yVarH16 == null) {
                                yVarH16 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH16;
                            }
                            builderSBuilder.mQROffUsAvailability((AvailabilityConfig) yVarH16.read(aVar));
                            break;
                        case "account_limits":
                            y yVarH17 = this.availabilityConfig_adapter;
                            if (yVarH17 == null) {
                                yVarH17 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH17;
                            }
                            builderSBuilder.mAccountLimitsAvailability((AvailabilityConfig) yVarH17.read(aVar));
                            break;
                        case "send_money":
                            y yVarH18 = this.availabilityConfig_adapter;
                            if (yVarH18 == null) {
                                yVarH18 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH18;
                            }
                            builderSBuilder.mSendMoneyAvailability((AvailabilityConfig) yVarH18.read(aVar));
                            break;
                        case "transport":
                            y yVarH19 = this.availabilityConfig_adapter;
                            if (yVarH19 == null) {
                                yVarH19 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH19;
                            }
                            builderSBuilder.mTravelAvailability((AvailabilityConfig) yVarH19.read(aVar));
                            break;
                        case "purchase_service":
                            y yVarH20 = this.availabilityConfig_adapter;
                            if (yVarH20 == null) {
                                yVarH20 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH20;
                            }
                            builderSBuilder.mMerchantPaymentAvailability((AvailabilityConfig) yVarH20.read(aVar));
                            break;
                        case "crypto_v2":
                            y yVarH21 = this.availabilityConfig_adapter;
                            if (yVarH21 == null) {
                                yVarH21 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH21;
                            }
                            builderSBuilder.mCryptoV2Availability((AvailabilityConfig) yVarH21.read(aVar));
                            break;
                        case "send_money_via_bank":
                            y yVarH22 = this.availabilityConfig_adapter;
                            if (yVarH22 == null) {
                                yVarH22 = this.gson.h(AvailabilityConfig.class);
                                this.availabilityConfig_adapter = yVarH22;
                            }
                            builderSBuilder.mBankTransferAvailability((AvailabilityConfig) yVarH22.read(aVar));
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
        public void write(b bVar, ServiceAvailabilityConfig serviceAvailabilityConfig) throws IOException {
            if (serviceAvailabilityConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("send_money");
            if (serviceAvailabilityConfig.mSendMoneyAvailability() == null) {
                bVar.r();
            } else {
                y yVarH = this.availabilityConfig_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH;
                }
                yVarH.write(bVar, serviceAvailabilityConfig.mSendMoneyAvailability());
            }
            bVar.m("pay_bills");
            if (serviceAvailabilityConfig.mPayBillsAvailability() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.availabilityConfig_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH2;
                }
                yVarH2.write(bVar, serviceAvailabilityConfig.mPayBillsAvailability());
            }
            bVar.m("shop_service");
            if (serviceAvailabilityConfig.mShopServiceAvailability() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.availabilityConfig_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH3;
                }
                yVarH3.write(bVar, serviceAvailabilityConfig.mShopServiceAvailability());
            }
            bVar.m("shop_purchase_history");
            if (serviceAvailabilityConfig.mShopPurchaseHistoryAvailability() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.availabilityConfig_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH4;
                }
                yVarH4.write(bVar, serviceAvailabilityConfig.mShopPurchaseHistoryAvailability());
            }
            bVar.m("purchase_service");
            if (serviceAvailabilityConfig.mMerchantPaymentAvailability() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.availabilityConfig_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH5;
                }
                yVarH5.write(bVar, serviceAvailabilityConfig.mMerchantPaymentAvailability());
            }
            bVar.m("add_money_via_card_service");
            if (serviceAvailabilityConfig.mAddMoneyViaCardService() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.availabilityConfig_adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH6;
                }
                yVarH6.write(bVar, serviceAvailabilityConfig.mAddMoneyViaCardService());
            }
            bVar.m("send_money_via_bank");
            if (serviceAvailabilityConfig.mBankTransferAvailability() == null) {
                bVar.r();
            } else {
                y yVarH7 = this.availabilityConfig_adapter;
                if (yVarH7 == null) {
                    yVarH7 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH7;
                }
                yVarH7.write(bVar, serviceAvailabilityConfig.mBankTransferAvailability());
            }
            bVar.m("loan_service");
            if (serviceAvailabilityConfig.mLoanAvailability() == null) {
                bVar.r();
            } else {
                y yVarH8 = this.availabilityConfig_adapter;
                if (yVarH8 == null) {
                    yVarH8 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH8;
                }
                yVarH8.write(bVar, serviceAvailabilityConfig.mLoanAvailability());
            }
            bVar.m("vouchers_service");
            if (serviceAvailabilityConfig.mVouchersAvailability() == null) {
                bVar.r();
            } else {
                y yVarH9 = this.availabilityConfig_adapter;
                if (yVarH9 == null) {
                    yVarH9 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH9;
                }
                yVarH9.write(bVar, serviceAvailabilityConfig.mVouchersAvailability());
            }
            bVar.m("my_favorites");
            if (serviceAvailabilityConfig.mFavoritesAvailability() == null) {
                bVar.r();
            } else {
                y yVarH10 = this.availabilityConfig_adapter;
                if (yVarH10 == null) {
                    yVarH10 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH10;
                }
                yVarH10.write(bVar, serviceAvailabilityConfig.mFavoritesAvailability());
            }
            bVar.m("inbox");
            if (serviceAvailabilityConfig.mInboxAvailability() == null) {
                bVar.r();
            } else {
                y yVarH11 = this.availabilityConfig_adapter;
                if (yVarH11 == null) {
                    yVarH11 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH11;
                }
                yVarH11.write(bVar, serviceAvailabilityConfig.mInboxAvailability());
            }
            bVar.m("account_limits");
            if (serviceAvailabilityConfig.mAccountLimitsAvailability() == null) {
                bVar.r();
            } else {
                y yVarH12 = this.availabilityConfig_adapter;
                if (yVarH12 == null) {
                    yVarH12 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH12;
                }
                yVarH12.write(bVar, serviceAvailabilityConfig.mAccountLimitsAvailability());
            }
            bVar.m("transport");
            if (serviceAvailabilityConfig.mTravelAvailability() == null) {
                bVar.r();
            } else {
                y yVarH13 = this.availabilityConfig_adapter;
                if (yVarH13 == null) {
                    yVarH13 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH13;
                }
                yVarH13.write(bVar, serviceAvailabilityConfig.mTravelAvailability());
            }
            bVar.m("missions");
            if (serviceAvailabilityConfig.mMissionsAvailability() == null) {
                bVar.r();
            } else {
                y yVarH14 = this.availabilityConfig_adapter;
                if (yVarH14 == null) {
                    yVarH14 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH14;
                }
                yVarH14.write(bVar, serviceAvailabilityConfig.mMissionsAvailability());
            }
            bVar.m("maya_credit");
            if (serviceAvailabilityConfig.mMayaCreditAvailability() == null) {
                bVar.r();
            } else {
                y yVarH15 = this.availabilityConfig_adapter;
                if (yVarH15 == null) {
                    yVarH15 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH15;
                }
                yVarH15.write(bVar, serviceAvailabilityConfig.mMayaCreditAvailability());
            }
            bVar.m("funds");
            if (serviceAvailabilityConfig.mFundsAvailability() == null) {
                bVar.r();
            } else {
                y yVarH16 = this.availabilityConfig_adapter;
                if (yVarH16 == null) {
                    yVarH16 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH16;
                }
                yVarH16.write(bVar, serviceAvailabilityConfig.mFundsAvailability());
            }
            bVar.m("crypto");
            if (serviceAvailabilityConfig.mCryptoAvailability() == null) {
                bVar.r();
            } else {
                y yVarH17 = this.availabilityConfig_adapter;
                if (yVarH17 == null) {
                    yVarH17 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH17;
                }
                yVarH17.write(bVar, serviceAvailabilityConfig.mCryptoAvailability());
            }
            bVar.m("crypto_v2");
            if (serviceAvailabilityConfig.mCryptoV2Availability() == null) {
                bVar.r();
            } else {
                y yVarH18 = this.availabilityConfig_adapter;
                if (yVarH18 == null) {
                    yVarH18 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH18;
                }
                yVarH18.write(bVar, serviceAvailabilityConfig.mCryptoV2Availability());
            }
            bVar.m("bank_pull_service");
            if (serviceAvailabilityConfig.mCashInViaBankServiceAvailability() == null) {
                bVar.r();
            } else {
                y yVarH19 = this.availabilityConfig_adapter;
                if (yVarH19 == null) {
                    yVarH19 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH19;
                }
                yVarH19.write(bVar, serviceAvailabilityConfig.mCashInViaBankServiceAvailability());
            }
            bVar.m("load");
            if (serviceAvailabilityConfig.mLoadAvailability() == null) {
                bVar.r();
            } else {
                y yVarH20 = this.availabilityConfig_adapter;
                if (yVarH20 == null) {
                    yVarH20 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH20;
                }
                yVarH20.write(bVar, serviceAvailabilityConfig.mLoadAvailability());
            }
            bVar.m("cards");
            if (serviceAvailabilityConfig.mCardsAvailability() == null) {
                bVar.r();
            } else {
                y yVarH21 = this.availabilityConfig_adapter;
                if (yVarH21 == null) {
                    yVarH21 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH21;
                }
                yVarH21.write(bVar, serviceAvailabilityConfig.mCardsAvailability());
            }
            bVar.m("qr_off_us");
            if (serviceAvailabilityConfig.mQROffUsAvailability() == null) {
                bVar.r();
            } else {
                y yVarH22 = this.availabilityConfig_adapter;
                if (yVarH22 == null) {
                    yVarH22 = this.gson.h(AvailabilityConfig.class);
                    this.availabilityConfig_adapter = yVarH22;
                }
                yVarH22.write(bVar, serviceAvailabilityConfig.mQROffUsAvailability());
            }
            bVar.k();
        }
    }

    public AutoValue_ServiceAvailabilityConfig(AvailabilityConfig availabilityConfig, AvailabilityConfig availabilityConfig2, AvailabilityConfig availabilityConfig3, AvailabilityConfig availabilityConfig4, AvailabilityConfig availabilityConfig5, AvailabilityConfig availabilityConfig6, AvailabilityConfig availabilityConfig7, AvailabilityConfig availabilityConfig8, AvailabilityConfig availabilityConfig9, AvailabilityConfig availabilityConfig10, AvailabilityConfig availabilityConfig11, AvailabilityConfig availabilityConfig12, AvailabilityConfig availabilityConfig13, AvailabilityConfig availabilityConfig14, @Nullable AvailabilityConfig availabilityConfig15, @Nullable AvailabilityConfig availabilityConfig16, @Nullable AvailabilityConfig availabilityConfig17, @Nullable AvailabilityConfig availabilityConfig18, @Nullable AvailabilityConfig availabilityConfig19, @Nullable AvailabilityConfig availabilityConfig20, @Nullable AvailabilityConfig availabilityConfig21, @Nullable AvailabilityConfig availabilityConfig22) {
        new ServiceAvailabilityConfig(availabilityConfig, availabilityConfig2, availabilityConfig3, availabilityConfig4, availabilityConfig5, availabilityConfig6, availabilityConfig7, availabilityConfig8, availabilityConfig9, availabilityConfig10, availabilityConfig11, availabilityConfig12, availabilityConfig13, availabilityConfig14, availabilityConfig15, availabilityConfig16, availabilityConfig17, availabilityConfig18, availabilityConfig19, availabilityConfig20, availabilityConfig21, availabilityConfig22) { // from class: com.paymaya.domain.model.$AutoValue_ServiceAvailabilityConfig
            private final AvailabilityConfig mAccountLimitsAvailability;
            private final AvailabilityConfig mAddMoneyViaCardService;
            private final AvailabilityConfig mBankTransferAvailability;
            private final AvailabilityConfig mCardsAvailability;
            private final AvailabilityConfig mCashInViaBankServiceAvailability;
            private final AvailabilityConfig mCryptoAvailability;
            private final AvailabilityConfig mCryptoV2Availability;
            private final AvailabilityConfig mFavoritesAvailability;
            private final AvailabilityConfig mFundsAvailability;
            private final AvailabilityConfig mInboxAvailability;
            private final AvailabilityConfig mLoadAvailability;
            private final AvailabilityConfig mLoanAvailability;
            private final AvailabilityConfig mMayaCreditAvailability;
            private final AvailabilityConfig mMerchantPaymentAvailability;
            private final AvailabilityConfig mMissionsAvailability;
            private final AvailabilityConfig mPayBillsAvailability;
            private final AvailabilityConfig mQROffUsAvailability;
            private final AvailabilityConfig mSendMoneyAvailability;
            private final AvailabilityConfig mShopPurchaseHistoryAvailability;
            private final AvailabilityConfig mShopServiceAvailability;
            private final AvailabilityConfig mTravelAvailability;
            private final AvailabilityConfig mVouchersAvailability;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ServiceAvailabilityConfig$Builder */
            public static class Builder extends ServiceAvailabilityConfig.Builder {
                private AvailabilityConfig mAccountLimitsAvailability;
                private AvailabilityConfig mAddMoneyViaCardService;
                private AvailabilityConfig mBankTransferAvailability;
                private AvailabilityConfig mCardsAvailability;
                private AvailabilityConfig mCashInViaBankServiceAvailability;
                private AvailabilityConfig mCryptoAvailability;
                private AvailabilityConfig mCryptoV2Availability;
                private AvailabilityConfig mFavoritesAvailability;
                private AvailabilityConfig mFundsAvailability;
                private AvailabilityConfig mInboxAvailability;
                private AvailabilityConfig mLoadAvailability;
                private AvailabilityConfig mLoanAvailability;
                private AvailabilityConfig mMayaCreditAvailability;
                private AvailabilityConfig mMerchantPaymentAvailability;
                private AvailabilityConfig mMissionsAvailability;
                private AvailabilityConfig mPayBillsAvailability;
                private AvailabilityConfig mQROffUsAvailability;
                private AvailabilityConfig mSendMoneyAvailability;
                private AvailabilityConfig mShopPurchaseHistoryAvailability;
                private AvailabilityConfig mShopServiceAvailability;
                private AvailabilityConfig mTravelAvailability;
                private AvailabilityConfig mVouchersAvailability;

                public /* synthetic */ Builder(ServiceAvailabilityConfig serviceAvailabilityConfig, int i) {
                    this(serviceAvailabilityConfig);
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig build() {
                    String strI = this.mSendMoneyAvailability == null ? " mSendMoneyAvailability" : "";
                    if (this.mPayBillsAvailability == null) {
                        strI = s.i(strI, " mPayBillsAvailability");
                    }
                    if (this.mShopServiceAvailability == null) {
                        strI = s.i(strI, " mShopServiceAvailability");
                    }
                    if (this.mShopPurchaseHistoryAvailability == null) {
                        strI = s.i(strI, " mShopPurchaseHistoryAvailability");
                    }
                    if (this.mMerchantPaymentAvailability == null) {
                        strI = s.i(strI, " mMerchantPaymentAvailability");
                    }
                    if (this.mAddMoneyViaCardService == null) {
                        strI = s.i(strI, " mAddMoneyViaCardService");
                    }
                    if (this.mBankTransferAvailability == null) {
                        strI = s.i(strI, " mBankTransferAvailability");
                    }
                    if (this.mLoanAvailability == null) {
                        strI = s.i(strI, " mLoanAvailability");
                    }
                    if (this.mVouchersAvailability == null) {
                        strI = s.i(strI, " mVouchersAvailability");
                    }
                    if (this.mFavoritesAvailability == null) {
                        strI = s.i(strI, " mFavoritesAvailability");
                    }
                    if (this.mInboxAvailability == null) {
                        strI = s.i(strI, " mInboxAvailability");
                    }
                    if (this.mAccountLimitsAvailability == null) {
                        strI = s.i(strI, " mAccountLimitsAvailability");
                    }
                    if (this.mTravelAvailability == null) {
                        strI = s.i(strI, " mTravelAvailability");
                    }
                    if (this.mMissionsAvailability == null) {
                        strI = s.i(strI, " mMissionsAvailability");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_ServiceAvailabilityConfig(this.mSendMoneyAvailability, this.mPayBillsAvailability, this.mShopServiceAvailability, this.mShopPurchaseHistoryAvailability, this.mMerchantPaymentAvailability, this.mAddMoneyViaCardService, this.mBankTransferAvailability, this.mLoanAvailability, this.mVouchersAvailability, this.mFavoritesAvailability, this.mInboxAvailability, this.mAccountLimitsAvailability, this.mTravelAvailability, this.mMissionsAvailability, this.mMayaCreditAvailability, this.mFundsAvailability, this.mCryptoAvailability, this.mCryptoV2Availability, this.mCashInViaBankServiceAvailability, this.mLoadAvailability, this.mCardsAvailability, this.mQROffUsAvailability);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mAccountLimitsAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mAccountLimitsAvailability");
                    }
                    this.mAccountLimitsAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mAddMoneyViaCardService(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mAddMoneyViaCardService");
                    }
                    this.mAddMoneyViaCardService = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mBankTransferAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mBankTransferAvailability");
                    }
                    this.mBankTransferAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mCardsAvailability(AvailabilityConfig availabilityConfig) {
                    this.mCardsAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mCashInViaBankServiceAvailability(AvailabilityConfig availabilityConfig) {
                    this.mCashInViaBankServiceAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mCryptoAvailability(AvailabilityConfig availabilityConfig) {
                    this.mCryptoAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mCryptoV2Availability(AvailabilityConfig availabilityConfig) {
                    this.mCryptoV2Availability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mFavoritesAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mFavoritesAvailability");
                    }
                    this.mFavoritesAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mFundsAvailability(AvailabilityConfig availabilityConfig) {
                    this.mFundsAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mInboxAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mInboxAvailability");
                    }
                    this.mInboxAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mLoadAvailability(AvailabilityConfig availabilityConfig) {
                    this.mLoadAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mLoanAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mLoanAvailability");
                    }
                    this.mLoanAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mMayaCreditAvailability(AvailabilityConfig availabilityConfig) {
                    this.mMayaCreditAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mMerchantPaymentAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mMerchantPaymentAvailability");
                    }
                    this.mMerchantPaymentAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mMissionsAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mMissionsAvailability");
                    }
                    this.mMissionsAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mPayBillsAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mPayBillsAvailability");
                    }
                    this.mPayBillsAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mQROffUsAvailability(AvailabilityConfig availabilityConfig) {
                    this.mQROffUsAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mSendMoneyAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mSendMoneyAvailability");
                    }
                    this.mSendMoneyAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mShopPurchaseHistoryAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mShopPurchaseHistoryAvailability");
                    }
                    this.mShopPurchaseHistoryAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mShopServiceAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mShopServiceAvailability");
                    }
                    this.mShopServiceAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mTravelAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mTravelAvailability");
                    }
                    this.mTravelAvailability = availabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.ServiceAvailabilityConfig.Builder
                public ServiceAvailabilityConfig.Builder mVouchersAvailability(AvailabilityConfig availabilityConfig) {
                    if (availabilityConfig == null) {
                        throw new NullPointerException("Null mVouchersAvailability");
                    }
                    this.mVouchersAvailability = availabilityConfig;
                    return this;
                }

                public Builder() {
                }

                private Builder(ServiceAvailabilityConfig serviceAvailabilityConfig) {
                    this.mSendMoneyAvailability = serviceAvailabilityConfig.mSendMoneyAvailability();
                    this.mPayBillsAvailability = serviceAvailabilityConfig.mPayBillsAvailability();
                    this.mShopServiceAvailability = serviceAvailabilityConfig.mShopServiceAvailability();
                    this.mShopPurchaseHistoryAvailability = serviceAvailabilityConfig.mShopPurchaseHistoryAvailability();
                    this.mMerchantPaymentAvailability = serviceAvailabilityConfig.mMerchantPaymentAvailability();
                    this.mAddMoneyViaCardService = serviceAvailabilityConfig.mAddMoneyViaCardService();
                    this.mBankTransferAvailability = serviceAvailabilityConfig.mBankTransferAvailability();
                    this.mLoanAvailability = serviceAvailabilityConfig.mLoanAvailability();
                    this.mVouchersAvailability = serviceAvailabilityConfig.mVouchersAvailability();
                    this.mFavoritesAvailability = serviceAvailabilityConfig.mFavoritesAvailability();
                    this.mInboxAvailability = serviceAvailabilityConfig.mInboxAvailability();
                    this.mAccountLimitsAvailability = serviceAvailabilityConfig.mAccountLimitsAvailability();
                    this.mTravelAvailability = serviceAvailabilityConfig.mTravelAvailability();
                    this.mMissionsAvailability = serviceAvailabilityConfig.mMissionsAvailability();
                    this.mMayaCreditAvailability = serviceAvailabilityConfig.mMayaCreditAvailability();
                    this.mFundsAvailability = serviceAvailabilityConfig.mFundsAvailability();
                    this.mCryptoAvailability = serviceAvailabilityConfig.mCryptoAvailability();
                    this.mCryptoV2Availability = serviceAvailabilityConfig.mCryptoV2Availability();
                    this.mCashInViaBankServiceAvailability = serviceAvailabilityConfig.mCashInViaBankServiceAvailability();
                    this.mLoadAvailability = serviceAvailabilityConfig.mLoadAvailability();
                    this.mCardsAvailability = serviceAvailabilityConfig.mCardsAvailability();
                    this.mQROffUsAvailability = serviceAvailabilityConfig.mQROffUsAvailability();
                }
            }

            {
                if (availabilityConfig == null) {
                    throw new NullPointerException("Null mSendMoneyAvailability");
                }
                this.mSendMoneyAvailability = availabilityConfig;
                if (availabilityConfig2 == null) {
                    throw new NullPointerException("Null mPayBillsAvailability");
                }
                this.mPayBillsAvailability = availabilityConfig2;
                if (availabilityConfig3 == null) {
                    throw new NullPointerException("Null mShopServiceAvailability");
                }
                this.mShopServiceAvailability = availabilityConfig3;
                if (availabilityConfig4 == null) {
                    throw new NullPointerException("Null mShopPurchaseHistoryAvailability");
                }
                this.mShopPurchaseHistoryAvailability = availabilityConfig4;
                if (availabilityConfig5 == null) {
                    throw new NullPointerException("Null mMerchantPaymentAvailability");
                }
                this.mMerchantPaymentAvailability = availabilityConfig5;
                if (availabilityConfig6 == null) {
                    throw new NullPointerException("Null mAddMoneyViaCardService");
                }
                this.mAddMoneyViaCardService = availabilityConfig6;
                if (availabilityConfig7 == null) {
                    throw new NullPointerException("Null mBankTransferAvailability");
                }
                this.mBankTransferAvailability = availabilityConfig7;
                if (availabilityConfig8 == null) {
                    throw new NullPointerException("Null mLoanAvailability");
                }
                this.mLoanAvailability = availabilityConfig8;
                if (availabilityConfig9 == null) {
                    throw new NullPointerException("Null mVouchersAvailability");
                }
                this.mVouchersAvailability = availabilityConfig9;
                if (availabilityConfig10 == null) {
                    throw new NullPointerException("Null mFavoritesAvailability");
                }
                this.mFavoritesAvailability = availabilityConfig10;
                if (availabilityConfig11 == null) {
                    throw new NullPointerException("Null mInboxAvailability");
                }
                this.mInboxAvailability = availabilityConfig11;
                if (availabilityConfig12 == null) {
                    throw new NullPointerException("Null mAccountLimitsAvailability");
                }
                this.mAccountLimitsAvailability = availabilityConfig12;
                if (availabilityConfig13 == null) {
                    throw new NullPointerException("Null mTravelAvailability");
                }
                this.mTravelAvailability = availabilityConfig13;
                if (availabilityConfig14 == null) {
                    throw new NullPointerException("Null mMissionsAvailability");
                }
                this.mMissionsAvailability = availabilityConfig14;
                this.mMayaCreditAvailability = availabilityConfig15;
                this.mFundsAvailability = availabilityConfig16;
                this.mCryptoAvailability = availabilityConfig17;
                this.mCryptoV2Availability = availabilityConfig18;
                this.mCashInViaBankServiceAvailability = availabilityConfig19;
                this.mLoadAvailability = availabilityConfig20;
                this.mCardsAvailability = availabilityConfig21;
                this.mQROffUsAvailability = availabilityConfig22;
            }

            public boolean equals(Object obj) {
                AvailabilityConfig availabilityConfig23;
                AvailabilityConfig availabilityConfig24;
                AvailabilityConfig availabilityConfig25;
                AvailabilityConfig availabilityConfig26;
                AvailabilityConfig availabilityConfig27;
                AvailabilityConfig availabilityConfig28;
                AvailabilityConfig availabilityConfig29;
                AvailabilityConfig availabilityConfig30;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ServiceAvailabilityConfig) {
                    ServiceAvailabilityConfig serviceAvailabilityConfig = (ServiceAvailabilityConfig) obj;
                    if (this.mSendMoneyAvailability.equals(serviceAvailabilityConfig.mSendMoneyAvailability()) && this.mPayBillsAvailability.equals(serviceAvailabilityConfig.mPayBillsAvailability()) && this.mShopServiceAvailability.equals(serviceAvailabilityConfig.mShopServiceAvailability()) && this.mShopPurchaseHistoryAvailability.equals(serviceAvailabilityConfig.mShopPurchaseHistoryAvailability()) && this.mMerchantPaymentAvailability.equals(serviceAvailabilityConfig.mMerchantPaymentAvailability()) && this.mAddMoneyViaCardService.equals(serviceAvailabilityConfig.mAddMoneyViaCardService()) && this.mBankTransferAvailability.equals(serviceAvailabilityConfig.mBankTransferAvailability()) && this.mLoanAvailability.equals(serviceAvailabilityConfig.mLoanAvailability()) && this.mVouchersAvailability.equals(serviceAvailabilityConfig.mVouchersAvailability()) && this.mFavoritesAvailability.equals(serviceAvailabilityConfig.mFavoritesAvailability()) && this.mInboxAvailability.equals(serviceAvailabilityConfig.mInboxAvailability()) && this.mAccountLimitsAvailability.equals(serviceAvailabilityConfig.mAccountLimitsAvailability()) && this.mTravelAvailability.equals(serviceAvailabilityConfig.mTravelAvailability()) && this.mMissionsAvailability.equals(serviceAvailabilityConfig.mMissionsAvailability()) && ((availabilityConfig23 = this.mMayaCreditAvailability) != null ? availabilityConfig23.equals(serviceAvailabilityConfig.mMayaCreditAvailability()) : serviceAvailabilityConfig.mMayaCreditAvailability() == null) && ((availabilityConfig24 = this.mFundsAvailability) != null ? availabilityConfig24.equals(serviceAvailabilityConfig.mFundsAvailability()) : serviceAvailabilityConfig.mFundsAvailability() == null) && ((availabilityConfig25 = this.mCryptoAvailability) != null ? availabilityConfig25.equals(serviceAvailabilityConfig.mCryptoAvailability()) : serviceAvailabilityConfig.mCryptoAvailability() == null) && ((availabilityConfig26 = this.mCryptoV2Availability) != null ? availabilityConfig26.equals(serviceAvailabilityConfig.mCryptoV2Availability()) : serviceAvailabilityConfig.mCryptoV2Availability() == null) && ((availabilityConfig27 = this.mCashInViaBankServiceAvailability) != null ? availabilityConfig27.equals(serviceAvailabilityConfig.mCashInViaBankServiceAvailability()) : serviceAvailabilityConfig.mCashInViaBankServiceAvailability() == null) && ((availabilityConfig28 = this.mLoadAvailability) != null ? availabilityConfig28.equals(serviceAvailabilityConfig.mLoadAvailability()) : serviceAvailabilityConfig.mLoadAvailability() == null) && ((availabilityConfig29 = this.mCardsAvailability) != null ? availabilityConfig29.equals(serviceAvailabilityConfig.mCardsAvailability()) : serviceAvailabilityConfig.mCardsAvailability() == null) && ((availabilityConfig30 = this.mQROffUsAvailability) != null ? availabilityConfig30.equals(serviceAvailabilityConfig.mQROffUsAvailability()) : serviceAvailabilityConfig.mQROffUsAvailability() == null)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode = (((((((((((((((((((((((((((this.mSendMoneyAvailability.hashCode() ^ 1000003) * 1000003) ^ this.mPayBillsAvailability.hashCode()) * 1000003) ^ this.mShopServiceAvailability.hashCode()) * 1000003) ^ this.mShopPurchaseHistoryAvailability.hashCode()) * 1000003) ^ this.mMerchantPaymentAvailability.hashCode()) * 1000003) ^ this.mAddMoneyViaCardService.hashCode()) * 1000003) ^ this.mBankTransferAvailability.hashCode()) * 1000003) ^ this.mLoanAvailability.hashCode()) * 1000003) ^ this.mVouchersAvailability.hashCode()) * 1000003) ^ this.mFavoritesAvailability.hashCode()) * 1000003) ^ this.mInboxAvailability.hashCode()) * 1000003) ^ this.mAccountLimitsAvailability.hashCode()) * 1000003) ^ this.mTravelAvailability.hashCode()) * 1000003) ^ this.mMissionsAvailability.hashCode()) * 1000003;
                AvailabilityConfig availabilityConfig23 = this.mMayaCreditAvailability;
                int iHashCode2 = (iHashCode ^ (availabilityConfig23 == null ? 0 : availabilityConfig23.hashCode())) * 1000003;
                AvailabilityConfig availabilityConfig24 = this.mFundsAvailability;
                int iHashCode3 = (iHashCode2 ^ (availabilityConfig24 == null ? 0 : availabilityConfig24.hashCode())) * 1000003;
                AvailabilityConfig availabilityConfig25 = this.mCryptoAvailability;
                int iHashCode4 = (iHashCode3 ^ (availabilityConfig25 == null ? 0 : availabilityConfig25.hashCode())) * 1000003;
                AvailabilityConfig availabilityConfig26 = this.mCryptoV2Availability;
                int iHashCode5 = (iHashCode4 ^ (availabilityConfig26 == null ? 0 : availabilityConfig26.hashCode())) * 1000003;
                AvailabilityConfig availabilityConfig27 = this.mCashInViaBankServiceAvailability;
                int iHashCode6 = (iHashCode5 ^ (availabilityConfig27 == null ? 0 : availabilityConfig27.hashCode())) * 1000003;
                AvailabilityConfig availabilityConfig28 = this.mLoadAvailability;
                int iHashCode7 = (iHashCode6 ^ (availabilityConfig28 == null ? 0 : availabilityConfig28.hashCode())) * 1000003;
                AvailabilityConfig availabilityConfig29 = this.mCardsAvailability;
                int iHashCode8 = (iHashCode7 ^ (availabilityConfig29 == null ? 0 : availabilityConfig29.hashCode())) * 1000003;
                AvailabilityConfig availabilityConfig30 = this.mQROffUsAvailability;
                return iHashCode8 ^ (availabilityConfig30 != null ? availabilityConfig30.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("account_limits")
            public AvailabilityConfig mAccountLimitsAvailability() {
                return this.mAccountLimitsAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("add_money_via_card_service")
            public AvailabilityConfig mAddMoneyViaCardService() {
                return this.mAddMoneyViaCardService;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("send_money_via_bank")
            public AvailabilityConfig mBankTransferAvailability() {
                return this.mBankTransferAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @Nullable
            @InterfaceC1498b("cards")
            public AvailabilityConfig mCardsAvailability() {
                return this.mCardsAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @Nullable
            @InterfaceC1498b("bank_pull_service")
            public AvailabilityConfig mCashInViaBankServiceAvailability() {
                return this.mCashInViaBankServiceAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @Nullable
            @InterfaceC1498b("crypto")
            public AvailabilityConfig mCryptoAvailability() {
                return this.mCryptoAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @Nullable
            @InterfaceC1498b("crypto_v2")
            public AvailabilityConfig mCryptoV2Availability() {
                return this.mCryptoV2Availability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("my_favorites")
            public AvailabilityConfig mFavoritesAvailability() {
                return this.mFavoritesAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @Nullable
            @InterfaceC1498b("funds")
            public AvailabilityConfig mFundsAvailability() {
                return this.mFundsAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("inbox")
            public AvailabilityConfig mInboxAvailability() {
                return this.mInboxAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @Nullable
            @InterfaceC1498b("load")
            public AvailabilityConfig mLoadAvailability() {
                return this.mLoadAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("loan_service")
            public AvailabilityConfig mLoanAvailability() {
                return this.mLoanAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @Nullable
            @InterfaceC1498b("maya_credit")
            public AvailabilityConfig mMayaCreditAvailability() {
                return this.mMayaCreditAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("purchase_service")
            public AvailabilityConfig mMerchantPaymentAvailability() {
                return this.mMerchantPaymentAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("missions")
            public AvailabilityConfig mMissionsAvailability() {
                return this.mMissionsAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("pay_bills")
            public AvailabilityConfig mPayBillsAvailability() {
                return this.mPayBillsAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @Nullable
            @InterfaceC1498b("qr_off_us")
            public AvailabilityConfig mQROffUsAvailability() {
                return this.mQROffUsAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("send_money")
            public AvailabilityConfig mSendMoneyAvailability() {
                return this.mSendMoneyAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("shop_purchase_history")
            public AvailabilityConfig mShopPurchaseHistoryAvailability() {
                return this.mShopPurchaseHistoryAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("shop_service")
            public AvailabilityConfig mShopServiceAvailability() {
                return this.mShopServiceAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("transport")
            public AvailabilityConfig mTravelAvailability() {
                return this.mTravelAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            @InterfaceC1498b("vouchers_service")
            public AvailabilityConfig mVouchersAvailability() {
                return this.mVouchersAvailability;
            }

            @Override // com.paymaya.domain.model.ServiceAvailabilityConfig
            public ServiceAvailabilityConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return "ServiceAvailabilityConfig{mSendMoneyAvailability=" + this.mSendMoneyAvailability + ", mPayBillsAvailability=" + this.mPayBillsAvailability + ", mShopServiceAvailability=" + this.mShopServiceAvailability + ", mShopPurchaseHistoryAvailability=" + this.mShopPurchaseHistoryAvailability + ", mMerchantPaymentAvailability=" + this.mMerchantPaymentAvailability + ", mAddMoneyViaCardService=" + this.mAddMoneyViaCardService + ", mBankTransferAvailability=" + this.mBankTransferAvailability + ", mLoanAvailability=" + this.mLoanAvailability + ", mVouchersAvailability=" + this.mVouchersAvailability + ", mFavoritesAvailability=" + this.mFavoritesAvailability + ", mInboxAvailability=" + this.mInboxAvailability + ", mAccountLimitsAvailability=" + this.mAccountLimitsAvailability + ", mTravelAvailability=" + this.mTravelAvailability + ", mMissionsAvailability=" + this.mMissionsAvailability + ", mMayaCreditAvailability=" + this.mMayaCreditAvailability + ", mFundsAvailability=" + this.mFundsAvailability + ", mCryptoAvailability=" + this.mCryptoAvailability + ", mCryptoV2Availability=" + this.mCryptoV2Availability + ", mCashInViaBankServiceAvailability=" + this.mCashInViaBankServiceAvailability + ", mLoadAvailability=" + this.mLoadAvailability + ", mCardsAvailability=" + this.mCardsAvailability + ", mQROffUsAvailability=" + this.mQROffUsAvailability + "}";
            }
        };
    }
}
