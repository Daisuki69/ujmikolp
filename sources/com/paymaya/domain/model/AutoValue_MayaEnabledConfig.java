package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MayaEnabledConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MayaEnabledConfig extends C$AutoValue_MayaEnabledConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MayaEnabledConfig)";
        }

        @Override // com.google.gson.y
        public MayaEnabledConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MayaEnabledConfig.Builder builderSBuilder = MayaEnabledConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "shop_receipt":
                            y yVarH = this.boolean__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH;
                            }
                            builderSBuilder.mShopReceipt((Boolean) yVarH.read(aVar));
                            break;
                        case "ekyc_zoloz_3":
                            y yVarH2 = this.boolean__adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH2;
                            }
                            builderSBuilder.ekycZoloz((Boolean) yVarH2.read(aVar));
                            break;
                        case "qr_receipt":
                            y yVarH3 = this.boolean__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH3;
                            }
                            builderSBuilder.mQRReceipt((Boolean) yVarH3.read(aVar));
                            break;
                        case "credit":
                            y yVarH4 = this.boolean__adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH4;
                            }
                            builderSBuilder.mCredit((Boolean) yVarH4.read(aVar));
                            break;
                        case "cashin_maya_savings_button":
                            y yVarH5 = this.boolean__adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH5;
                            }
                            builderSBuilder.mCashinMayaSavingsButton((Boolean) yVarH5.read(aVar));
                            break;
                        case "shop_history_receipt":
                            y yVarH6 = this.boolean__adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH6;
                            }
                            builderSBuilder.mShopHistoryReceipt((Boolean) yVarH6.read(aVar));
                            break;
                        case "pay_bills":
                            y yVarH7 = this.boolean__adapter;
                            if (yVarH7 == null) {
                                yVarH7 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH7;
                            }
                            builderSBuilder.mPayBills((Boolean) yVarH7.read(aVar));
                            break;
                        case "username":
                            y yVarH8 = this.boolean__adapter;
                            if (yVarH8 == null) {
                                yVarH8 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH8;
                            }
                            builderSBuilder.mUsername((Boolean) yVarH8.read(aVar));
                            break;
                        case "restricted_login_flow":
                            y yVarH9 = this.boolean__adapter;
                            if (yVarH9 == null) {
                                yVarH9 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH9;
                            }
                            builderSBuilder.mRestrictedLogin((Boolean) yVarH9.read(aVar));
                            break;
                        case "cashin_wallet_settings_auto_cash_in_option":
                            y yVarH10 = this.boolean__adapter;
                            if (yVarH10 == null) {
                                yVarH10 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH10;
                            }
                            builderSBuilder.mCashinWalletSettingsAutoCashInOption((Boolean) yVarH10.read(aVar));
                            break;
                        case "shop":
                            y yVarH11 = this.boolean__adapter;
                            if (yVarH11 == null) {
                                yVarH11 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH11;
                            }
                            builderSBuilder.mShop((Boolean) yVarH11.read(aVar));
                            break;
                        case "loans":
                            y yVarH12 = this.boolean__adapter;
                            if (yVarH12 == null) {
                                yVarH12 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH12;
                            }
                            builderSBuilder.mLoans((Boolean) yVarH12.read(aVar));
                            break;
                        case "qrp2p_adjustment":
                            y yVarH13 = this.boolean__adapter;
                            if (yVarH13 == null) {
                                yVarH13 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH13;
                            }
                            builderSBuilder.mQrP2pAdjustments((Boolean) yVarH13.read(aVar));
                            break;
                        case "shop_checkout":
                            y yVarH14 = this.boolean__adapter;
                            if (yVarH14 == null) {
                                yVarH14 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH14;
                            }
                            builderSBuilder.mShopCheckout((Boolean) yVarH14.read(aVar));
                            break;
                        case "qr_scan":
                            y yVarH15 = this.boolean__adapter;
                            if (yVarH15 == null) {
                                yVarH15 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH15;
                            }
                            builderSBuilder.mQRScan((Boolean) yVarH15.read(aVar));
                            break;
                        case "credit_v2":
                            y yVarH16 = this.boolean__adapter;
                            if (yVarH16 == null) {
                                yVarH16 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH16;
                            }
                            builderSBuilder.mCreditV2((Boolean) yVarH16.read(aVar));
                            break;
                        case "credit_v3":
                            y yVarH17 = this.boolean__adapter;
                            if (yVarH17 == null) {
                                yVarH17 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH17;
                            }
                            builderSBuilder.mCreditV3((Boolean) yVarH17.read(aVar));
                            break;
                        case "push_approval_2":
                            y yVarH18 = this.boolean__adapter;
                            if (yVarH18 == null) {
                                yVarH18 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH18;
                            }
                            builderSBuilder.mAuthorizeRequest((Boolean) yVarH18.read(aVar));
                            break;
                        case "checkout_on_qr":
                            y yVarH19 = this.boolean__adapter;
                            if (yVarH19 == null) {
                                yVarH19 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH19;
                            }
                            builderSBuilder.mCheckoutOnQR((Boolean) yVarH19.read(aVar));
                            break;
                        case "cashin_wallet_settings":
                            y yVarH20 = this.boolean__adapter;
                            if (yVarH20 == null) {
                                yVarH20 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH20;
                            }
                            builderSBuilder.mCashinWalletSettings((Boolean) yVarH20.read(aVar));
                            break;
                        case "request_money":
                            y yVarH21 = this.boolean__adapter;
                            if (yVarH21 == null) {
                                yVarH21 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH21;
                            }
                            builderSBuilder.mRequestMoney((Boolean) yVarH21.read(aVar));
                            break;
                        case "vouchers_receipt":
                            y yVarH22 = this.boolean__adapter;
                            if (yVarH22 == null) {
                                yVarH22 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH22;
                            }
                            builderSBuilder.mVouchersReceipt((Boolean) yVarH22.read(aVar));
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
        public void write(b bVar, MayaEnabledConfig mayaEnabledConfig) throws IOException {
            if (mayaEnabledConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("credit");
            if (mayaEnabledConfig.mCredit() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, mayaEnabledConfig.mCredit());
            }
            bVar.m("restricted_login_flow");
            if (mayaEnabledConfig.mRestrictedLogin() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, mayaEnabledConfig.mRestrictedLogin());
            }
            bVar.m("loans");
            if (mayaEnabledConfig.mLoans() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.boolean__adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH3;
                }
                yVarH3.write(bVar, mayaEnabledConfig.mLoans());
            }
            bVar.m("qr_scan");
            if (mayaEnabledConfig.mQRScan() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.boolean__adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH4;
                }
                yVarH4.write(bVar, mayaEnabledConfig.mQRScan());
            }
            bVar.m("request_money");
            if (mayaEnabledConfig.mRequestMoney() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.boolean__adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH5;
                }
                yVarH5.write(bVar, mayaEnabledConfig.mRequestMoney());
            }
            bVar.m("credit_v2");
            if (mayaEnabledConfig.mCreditV2() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.boolean__adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH6;
                }
                yVarH6.write(bVar, mayaEnabledConfig.mCreditV2());
            }
            bVar.m("pay_bills");
            if (mayaEnabledConfig.mPayBills() == null) {
                bVar.r();
            } else {
                y yVarH7 = this.boolean__adapter;
                if (yVarH7 == null) {
                    yVarH7 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH7;
                }
                yVarH7.write(bVar, mayaEnabledConfig.mPayBills());
            }
            bVar.m("qrp2p_adjustment");
            if (mayaEnabledConfig.mQrP2pAdjustments() == null) {
                bVar.r();
            } else {
                y yVarH8 = this.boolean__adapter;
                if (yVarH8 == null) {
                    yVarH8 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH8;
                }
                yVarH8.write(bVar, mayaEnabledConfig.mQrP2pAdjustments());
            }
            bVar.m("credit_v3");
            if (mayaEnabledConfig.mCreditV3() == null) {
                bVar.r();
            } else {
                y yVarH9 = this.boolean__adapter;
                if (yVarH9 == null) {
                    yVarH9 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH9;
                }
                yVarH9.write(bVar, mayaEnabledConfig.mCreditV3());
            }
            bVar.m("shop");
            if (mayaEnabledConfig.mShop() == null) {
                bVar.r();
            } else {
                y yVarH10 = this.boolean__adapter;
                if (yVarH10 == null) {
                    yVarH10 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH10;
                }
                yVarH10.write(bVar, mayaEnabledConfig.mShop());
            }
            bVar.m("shop_history_receipt");
            if (mayaEnabledConfig.mShopHistoryReceipt() == null) {
                bVar.r();
            } else {
                y yVarH11 = this.boolean__adapter;
                if (yVarH11 == null) {
                    yVarH11 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH11;
                }
                yVarH11.write(bVar, mayaEnabledConfig.mShopHistoryReceipt());
            }
            bVar.m("qr_receipt");
            if (mayaEnabledConfig.mQRReceipt() == null) {
                bVar.r();
            } else {
                y yVarH12 = this.boolean__adapter;
                if (yVarH12 == null) {
                    yVarH12 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH12;
                }
                yVarH12.write(bVar, mayaEnabledConfig.mQRReceipt());
            }
            bVar.m("vouchers_receipt");
            if (mayaEnabledConfig.mVouchersReceipt() == null) {
                bVar.r();
            } else {
                y yVarH13 = this.boolean__adapter;
                if (yVarH13 == null) {
                    yVarH13 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH13;
                }
                yVarH13.write(bVar, mayaEnabledConfig.mVouchersReceipt());
            }
            bVar.m("shop_receipt");
            if (mayaEnabledConfig.mShopReceipt() == null) {
                bVar.r();
            } else {
                y yVarH14 = this.boolean__adapter;
                if (yVarH14 == null) {
                    yVarH14 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH14;
                }
                yVarH14.write(bVar, mayaEnabledConfig.mShopReceipt());
            }
            bVar.m("shop_checkout");
            if (mayaEnabledConfig.mShopCheckout() == null) {
                bVar.r();
            } else {
                y yVarH15 = this.boolean__adapter;
                if (yVarH15 == null) {
                    yVarH15 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH15;
                }
                yVarH15.write(bVar, mayaEnabledConfig.mShopCheckout());
            }
            bVar.m("username");
            if (mayaEnabledConfig.mUsername() == null) {
                bVar.r();
            } else {
                y yVarH16 = this.boolean__adapter;
                if (yVarH16 == null) {
                    yVarH16 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH16;
                }
                yVarH16.write(bVar, mayaEnabledConfig.mUsername());
            }
            bVar.m("ekyc_zoloz_3");
            if (mayaEnabledConfig.ekycZoloz() == null) {
                bVar.r();
            } else {
                y yVarH17 = this.boolean__adapter;
                if (yVarH17 == null) {
                    yVarH17 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH17;
                }
                yVarH17.write(bVar, mayaEnabledConfig.ekycZoloz());
            }
            bVar.m("push_approval_2");
            if (mayaEnabledConfig.mAuthorizeRequest() == null) {
                bVar.r();
            } else {
                y yVarH18 = this.boolean__adapter;
                if (yVarH18 == null) {
                    yVarH18 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH18;
                }
                yVarH18.write(bVar, mayaEnabledConfig.mAuthorizeRequest());
            }
            bVar.m("cashin_maya_savings_button");
            if (mayaEnabledConfig.mCashinMayaSavingsButton() == null) {
                bVar.r();
            } else {
                y yVarH19 = this.boolean__adapter;
                if (yVarH19 == null) {
                    yVarH19 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH19;
                }
                yVarH19.write(bVar, mayaEnabledConfig.mCashinMayaSavingsButton());
            }
            bVar.m("cashin_wallet_settings");
            if (mayaEnabledConfig.mCashinWalletSettings() == null) {
                bVar.r();
            } else {
                y yVarH20 = this.boolean__adapter;
                if (yVarH20 == null) {
                    yVarH20 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH20;
                }
                yVarH20.write(bVar, mayaEnabledConfig.mCashinWalletSettings());
            }
            bVar.m("cashin_wallet_settings_auto_cash_in_option");
            if (mayaEnabledConfig.mCashinWalletSettingsAutoCashInOption() == null) {
                bVar.r();
            } else {
                y yVarH21 = this.boolean__adapter;
                if (yVarH21 == null) {
                    yVarH21 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH21;
                }
                yVarH21.write(bVar, mayaEnabledConfig.mCashinWalletSettingsAutoCashInOption());
            }
            bVar.m("checkout_on_qr");
            if (mayaEnabledConfig.mCheckoutOnQR() == null) {
                bVar.r();
            } else {
                y yVarH22 = this.boolean__adapter;
                if (yVarH22 == null) {
                    yVarH22 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH22;
                }
                yVarH22.write(bVar, mayaEnabledConfig.mCheckoutOnQR());
            }
            bVar.k();
        }
    }

    public AutoValue_MayaEnabledConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22) {
        new MayaEnabledConfig(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22) { // from class: com.paymaya.domain.model.$AutoValue_MayaEnabledConfig
            private final Boolean ekycZoloz;
            private final Boolean mAuthorizeRequest;
            private final Boolean mCashinMayaSavingsButton;
            private final Boolean mCashinWalletSettings;
            private final Boolean mCashinWalletSettingsAutoCashInOption;
            private final Boolean mCheckoutOnQR;
            private final Boolean mCredit;
            private final Boolean mCreditV2;
            private final Boolean mCreditV3;
            private final Boolean mLoans;
            private final Boolean mPayBills;
            private final Boolean mQRReceipt;
            private final Boolean mQRScan;
            private final Boolean mQrP2pAdjustments;
            private final Boolean mRequestMoney;
            private final Boolean mRestrictedLogin;
            private final Boolean mShop;
            private final Boolean mShopCheckout;
            private final Boolean mShopHistoryReceipt;
            private final Boolean mShopReceipt;
            private final Boolean mUsername;
            private final Boolean mVouchersReceipt;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MayaEnabledConfig$Builder */
            public static class Builder extends MayaEnabledConfig.Builder {
                private Boolean ekycZoloz;
                private Boolean mAuthorizeRequest;
                private Boolean mCashinMayaSavingsButton;
                private Boolean mCashinWalletSettings;
                private Boolean mCashinWalletSettingsAutoCashInOption;
                private Boolean mCheckoutOnQR;
                private Boolean mCredit;
                private Boolean mCreditV2;
                private Boolean mCreditV3;
                private Boolean mLoans;
                private Boolean mPayBills;
                private Boolean mQRReceipt;
                private Boolean mQRScan;
                private Boolean mQrP2pAdjustments;
                private Boolean mRequestMoney;
                private Boolean mRestrictedLogin;
                private Boolean mShop;
                private Boolean mShopCheckout;
                private Boolean mShopHistoryReceipt;
                private Boolean mShopReceipt;
                private Boolean mUsername;
                private Boolean mVouchersReceipt;

                public /* synthetic */ Builder(MayaEnabledConfig mayaEnabledConfig, int i) {
                    this(mayaEnabledConfig);
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig build() {
                    String strI = this.mCredit == null ? " mCredit" : "";
                    if (this.mRestrictedLogin == null) {
                        strI = s.i(strI, " mRestrictedLogin");
                    }
                    if (this.mLoans == null) {
                        strI = s.i(strI, " mLoans");
                    }
                    if (this.mQRScan == null) {
                        strI = s.i(strI, " mQRScan");
                    }
                    if (this.mRequestMoney == null) {
                        strI = s.i(strI, " mRequestMoney");
                    }
                    if (this.mCreditV2 == null) {
                        strI = s.i(strI, " mCreditV2");
                    }
                    if (this.mPayBills == null) {
                        strI = s.i(strI, " mPayBills");
                    }
                    if (this.mQrP2pAdjustments == null) {
                        strI = s.i(strI, " mQrP2pAdjustments");
                    }
                    if (this.mCreditV3 == null) {
                        strI = s.i(strI, " mCreditV3");
                    }
                    if (this.mShop == null) {
                        strI = s.i(strI, " mShop");
                    }
                    if (this.mShopHistoryReceipt == null) {
                        strI = s.i(strI, " mShopHistoryReceipt");
                    }
                    if (this.mQRReceipt == null) {
                        strI = s.i(strI, " mQRReceipt");
                    }
                    if (this.mVouchersReceipt == null) {
                        strI = s.i(strI, " mVouchersReceipt");
                    }
                    if (this.mShopReceipt == null) {
                        strI = s.i(strI, " mShopReceipt");
                    }
                    if (this.mShopCheckout == null) {
                        strI = s.i(strI, " mShopCheckout");
                    }
                    if (this.mUsername == null) {
                        strI = s.i(strI, " mUsername");
                    }
                    if (this.ekycZoloz == null) {
                        strI = s.i(strI, " ekycZoloz");
                    }
                    if (this.mAuthorizeRequest == null) {
                        strI = s.i(strI, " mAuthorizeRequest");
                    }
                    if (this.mCashinMayaSavingsButton == null) {
                        strI = s.i(strI, " mCashinMayaSavingsButton");
                    }
                    if (this.mCashinWalletSettings == null) {
                        strI = s.i(strI, " mCashinWalletSettings");
                    }
                    if (this.mCashinWalletSettingsAutoCashInOption == null) {
                        strI = s.i(strI, " mCashinWalletSettingsAutoCashInOption");
                    }
                    if (this.mCheckoutOnQR == null) {
                        strI = s.i(strI, " mCheckoutOnQR");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_MayaEnabledConfig(this.mCredit, this.mRestrictedLogin, this.mLoans, this.mQRScan, this.mRequestMoney, this.mCreditV2, this.mPayBills, this.mQrP2pAdjustments, this.mCreditV3, this.mShop, this.mShopHistoryReceipt, this.mQRReceipt, this.mVouchersReceipt, this.mShopReceipt, this.mShopCheckout, this.mUsername, this.ekycZoloz, this.mAuthorizeRequest, this.mCashinMayaSavingsButton, this.mCashinWalletSettings, this.mCashinWalletSettingsAutoCashInOption, this.mCheckoutOnQR);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder ekycZoloz(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null ekycZoloz");
                    }
                    this.ekycZoloz = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mAuthorizeRequest(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mAuthorizeRequest");
                    }
                    this.mAuthorizeRequest = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mCashinMayaSavingsButton(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mCashinMayaSavingsButton");
                    }
                    this.mCashinMayaSavingsButton = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mCashinWalletSettings(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mCashinWalletSettings");
                    }
                    this.mCashinWalletSettings = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mCashinWalletSettingsAutoCashInOption(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mCashinWalletSettingsAutoCashInOption");
                    }
                    this.mCashinWalletSettingsAutoCashInOption = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mCheckoutOnQR(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mCheckoutOnQR");
                    }
                    this.mCheckoutOnQR = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mCredit(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mCredit");
                    }
                    this.mCredit = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mCreditV2(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mCreditV2");
                    }
                    this.mCreditV2 = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mCreditV3(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mCreditV3");
                    }
                    this.mCreditV3 = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mLoans(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mLoans");
                    }
                    this.mLoans = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mPayBills(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mPayBills");
                    }
                    this.mPayBills = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mQRReceipt(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mQRReceipt");
                    }
                    this.mQRReceipt = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mQRScan(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mQRScan");
                    }
                    this.mQRScan = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mQrP2pAdjustments(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mQrP2pAdjustments");
                    }
                    this.mQrP2pAdjustments = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mRequestMoney(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mRequestMoney");
                    }
                    this.mRequestMoney = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mRestrictedLogin(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mRestrictedLogin");
                    }
                    this.mRestrictedLogin = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mShop(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mShop");
                    }
                    this.mShop = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mShopCheckout(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mShopCheckout");
                    }
                    this.mShopCheckout = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mShopHistoryReceipt(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mShopHistoryReceipt");
                    }
                    this.mShopHistoryReceipt = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mShopReceipt(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mShopReceipt");
                    }
                    this.mShopReceipt = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mUsername(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mUsername");
                    }
                    this.mUsername = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEnabledConfig.Builder
                public MayaEnabledConfig.Builder mVouchersReceipt(Boolean bool) {
                    if (bool == null) {
                        throw new NullPointerException("Null mVouchersReceipt");
                    }
                    this.mVouchersReceipt = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(MayaEnabledConfig mayaEnabledConfig) {
                    this.mCredit = mayaEnabledConfig.mCredit();
                    this.mRestrictedLogin = mayaEnabledConfig.mRestrictedLogin();
                    this.mLoans = mayaEnabledConfig.mLoans();
                    this.mQRScan = mayaEnabledConfig.mQRScan();
                    this.mRequestMoney = mayaEnabledConfig.mRequestMoney();
                    this.mCreditV2 = mayaEnabledConfig.mCreditV2();
                    this.mPayBills = mayaEnabledConfig.mPayBills();
                    this.mQrP2pAdjustments = mayaEnabledConfig.mQrP2pAdjustments();
                    this.mCreditV3 = mayaEnabledConfig.mCreditV3();
                    this.mShop = mayaEnabledConfig.mShop();
                    this.mShopHistoryReceipt = mayaEnabledConfig.mShopHistoryReceipt();
                    this.mQRReceipt = mayaEnabledConfig.mQRReceipt();
                    this.mVouchersReceipt = mayaEnabledConfig.mVouchersReceipt();
                    this.mShopReceipt = mayaEnabledConfig.mShopReceipt();
                    this.mShopCheckout = mayaEnabledConfig.mShopCheckout();
                    this.mUsername = mayaEnabledConfig.mUsername();
                    this.ekycZoloz = mayaEnabledConfig.ekycZoloz();
                    this.mAuthorizeRequest = mayaEnabledConfig.mAuthorizeRequest();
                    this.mCashinMayaSavingsButton = mayaEnabledConfig.mCashinMayaSavingsButton();
                    this.mCashinWalletSettings = mayaEnabledConfig.mCashinWalletSettings();
                    this.mCashinWalletSettingsAutoCashInOption = mayaEnabledConfig.mCashinWalletSettingsAutoCashInOption();
                    this.mCheckoutOnQR = mayaEnabledConfig.mCheckoutOnQR();
                }
            }

            {
                if (bool == null) {
                    throw new NullPointerException("Null mCredit");
                }
                this.mCredit = bool;
                if (bool2 == null) {
                    throw new NullPointerException("Null mRestrictedLogin");
                }
                this.mRestrictedLogin = bool2;
                if (bool3 == null) {
                    throw new NullPointerException("Null mLoans");
                }
                this.mLoans = bool3;
                if (bool4 == null) {
                    throw new NullPointerException("Null mQRScan");
                }
                this.mQRScan = bool4;
                if (bool5 == null) {
                    throw new NullPointerException("Null mRequestMoney");
                }
                this.mRequestMoney = bool5;
                if (bool6 == null) {
                    throw new NullPointerException("Null mCreditV2");
                }
                this.mCreditV2 = bool6;
                if (bool7 == null) {
                    throw new NullPointerException("Null mPayBills");
                }
                this.mPayBills = bool7;
                if (bool8 == null) {
                    throw new NullPointerException("Null mQrP2pAdjustments");
                }
                this.mQrP2pAdjustments = bool8;
                if (bool9 == null) {
                    throw new NullPointerException("Null mCreditV3");
                }
                this.mCreditV3 = bool9;
                if (bool10 == null) {
                    throw new NullPointerException("Null mShop");
                }
                this.mShop = bool10;
                if (bool11 == null) {
                    throw new NullPointerException("Null mShopHistoryReceipt");
                }
                this.mShopHistoryReceipt = bool11;
                if (bool12 == null) {
                    throw new NullPointerException("Null mQRReceipt");
                }
                this.mQRReceipt = bool12;
                if (bool13 == null) {
                    throw new NullPointerException("Null mVouchersReceipt");
                }
                this.mVouchersReceipt = bool13;
                if (bool14 == null) {
                    throw new NullPointerException("Null mShopReceipt");
                }
                this.mShopReceipt = bool14;
                if (bool15 == null) {
                    throw new NullPointerException("Null mShopCheckout");
                }
                this.mShopCheckout = bool15;
                if (bool16 == null) {
                    throw new NullPointerException("Null mUsername");
                }
                this.mUsername = bool16;
                if (bool17 == null) {
                    throw new NullPointerException("Null ekycZoloz");
                }
                this.ekycZoloz = bool17;
                if (bool18 == null) {
                    throw new NullPointerException("Null mAuthorizeRequest");
                }
                this.mAuthorizeRequest = bool18;
                if (bool19 == null) {
                    throw new NullPointerException("Null mCashinMayaSavingsButton");
                }
                this.mCashinMayaSavingsButton = bool19;
                if (bool20 == null) {
                    throw new NullPointerException("Null mCashinWalletSettings");
                }
                this.mCashinWalletSettings = bool20;
                if (bool21 == null) {
                    throw new NullPointerException("Null mCashinWalletSettingsAutoCashInOption");
                }
                this.mCashinWalletSettingsAutoCashInOption = bool21;
                if (bool22 == null) {
                    throw new NullPointerException("Null mCheckoutOnQR");
                }
                this.mCheckoutOnQR = bool22;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("ekyc_zoloz_3")
            public Boolean ekycZoloz() {
                return this.ekycZoloz;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MayaEnabledConfig) {
                    MayaEnabledConfig mayaEnabledConfig = (MayaEnabledConfig) obj;
                    if (this.mCredit.equals(mayaEnabledConfig.mCredit()) && this.mRestrictedLogin.equals(mayaEnabledConfig.mRestrictedLogin()) && this.mLoans.equals(mayaEnabledConfig.mLoans()) && this.mQRScan.equals(mayaEnabledConfig.mQRScan()) && this.mRequestMoney.equals(mayaEnabledConfig.mRequestMoney()) && this.mCreditV2.equals(mayaEnabledConfig.mCreditV2()) && this.mPayBills.equals(mayaEnabledConfig.mPayBills()) && this.mQrP2pAdjustments.equals(mayaEnabledConfig.mQrP2pAdjustments()) && this.mCreditV3.equals(mayaEnabledConfig.mCreditV3()) && this.mShop.equals(mayaEnabledConfig.mShop()) && this.mShopHistoryReceipt.equals(mayaEnabledConfig.mShopHistoryReceipt()) && this.mQRReceipt.equals(mayaEnabledConfig.mQRReceipt()) && this.mVouchersReceipt.equals(mayaEnabledConfig.mVouchersReceipt()) && this.mShopReceipt.equals(mayaEnabledConfig.mShopReceipt()) && this.mShopCheckout.equals(mayaEnabledConfig.mShopCheckout()) && this.mUsername.equals(mayaEnabledConfig.mUsername()) && this.ekycZoloz.equals(mayaEnabledConfig.ekycZoloz()) && this.mAuthorizeRequest.equals(mayaEnabledConfig.mAuthorizeRequest()) && this.mCashinMayaSavingsButton.equals(mayaEnabledConfig.mCashinMayaSavingsButton()) && this.mCashinWalletSettings.equals(mayaEnabledConfig.mCashinWalletSettings()) && this.mCashinWalletSettingsAutoCashInOption.equals(mayaEnabledConfig.mCashinWalletSettingsAutoCashInOption()) && this.mCheckoutOnQR.equals(mayaEnabledConfig.mCheckoutOnQR())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((((((((((((((((((((((((((((((((((((((this.mCredit.hashCode() ^ 1000003) * 1000003) ^ this.mRestrictedLogin.hashCode()) * 1000003) ^ this.mLoans.hashCode()) * 1000003) ^ this.mQRScan.hashCode()) * 1000003) ^ this.mRequestMoney.hashCode()) * 1000003) ^ this.mCreditV2.hashCode()) * 1000003) ^ this.mPayBills.hashCode()) * 1000003) ^ this.mQrP2pAdjustments.hashCode()) * 1000003) ^ this.mCreditV3.hashCode()) * 1000003) ^ this.mShop.hashCode()) * 1000003) ^ this.mShopHistoryReceipt.hashCode()) * 1000003) ^ this.mQRReceipt.hashCode()) * 1000003) ^ this.mVouchersReceipt.hashCode()) * 1000003) ^ this.mShopReceipt.hashCode()) * 1000003) ^ this.mShopCheckout.hashCode()) * 1000003) ^ this.mUsername.hashCode()) * 1000003) ^ this.ekycZoloz.hashCode()) * 1000003) ^ this.mAuthorizeRequest.hashCode()) * 1000003) ^ this.mCashinMayaSavingsButton.hashCode()) * 1000003) ^ this.mCashinWalletSettings.hashCode()) * 1000003) ^ this.mCashinWalletSettingsAutoCashInOption.hashCode()) * 1000003) ^ this.mCheckoutOnQR.hashCode();
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("push_approval_2")
            public Boolean mAuthorizeRequest() {
                return this.mAuthorizeRequest;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("cashin_maya_savings_button")
            public Boolean mCashinMayaSavingsButton() {
                return this.mCashinMayaSavingsButton;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("cashin_wallet_settings")
            public Boolean mCashinWalletSettings() {
                return this.mCashinWalletSettings;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("cashin_wallet_settings_auto_cash_in_option")
            public Boolean mCashinWalletSettingsAutoCashInOption() {
                return this.mCashinWalletSettingsAutoCashInOption;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("checkout_on_qr")
            public Boolean mCheckoutOnQR() {
                return this.mCheckoutOnQR;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("credit")
            public Boolean mCredit() {
                return this.mCredit;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("credit_v2")
            public Boolean mCreditV2() {
                return this.mCreditV2;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("credit_v3")
            public Boolean mCreditV3() {
                return this.mCreditV3;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("loans")
            public Boolean mLoans() {
                return this.mLoans;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("pay_bills")
            public Boolean mPayBills() {
                return this.mPayBills;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("qr_receipt")
            public Boolean mQRReceipt() {
                return this.mQRReceipt;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("qr_scan")
            public Boolean mQRScan() {
                return this.mQRScan;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("qrp2p_adjustment")
            public Boolean mQrP2pAdjustments() {
                return this.mQrP2pAdjustments;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("request_money")
            public Boolean mRequestMoney() {
                return this.mRequestMoney;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("restricted_login_flow")
            public Boolean mRestrictedLogin() {
                return this.mRestrictedLogin;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("shop")
            public Boolean mShop() {
                return this.mShop;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("shop_checkout")
            public Boolean mShopCheckout() {
                return this.mShopCheckout;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("shop_history_receipt")
            public Boolean mShopHistoryReceipt() {
                return this.mShopHistoryReceipt;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("shop_receipt")
            public Boolean mShopReceipt() {
                return this.mShopReceipt;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("username")
            public Boolean mUsername() {
                return this.mUsername;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            @InterfaceC1498b("vouchers_receipt")
            public Boolean mVouchersReceipt() {
                return this.mVouchersReceipt;
            }

            @Override // com.paymaya.domain.model.MayaEnabledConfig
            public MayaEnabledConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("MayaEnabledConfig{mCredit=");
                sb2.append(this.mCredit);
                sb2.append(", mRestrictedLogin=");
                sb2.append(this.mRestrictedLogin);
                sb2.append(", mLoans=");
                sb2.append(this.mLoans);
                sb2.append(", mQRScan=");
                sb2.append(this.mQRScan);
                sb2.append(", mRequestMoney=");
                sb2.append(this.mRequestMoney);
                sb2.append(", mCreditV2=");
                sb2.append(this.mCreditV2);
                sb2.append(", mPayBills=");
                sb2.append(this.mPayBills);
                sb2.append(", mQrP2pAdjustments=");
                sb2.append(this.mQrP2pAdjustments);
                sb2.append(", mCreditV3=");
                sb2.append(this.mCreditV3);
                sb2.append(", mShop=");
                sb2.append(this.mShop);
                sb2.append(", mShopHistoryReceipt=");
                sb2.append(this.mShopHistoryReceipt);
                sb2.append(", mQRReceipt=");
                sb2.append(this.mQRReceipt);
                sb2.append(", mVouchersReceipt=");
                sb2.append(this.mVouchersReceipt);
                sb2.append(", mShopReceipt=");
                sb2.append(this.mShopReceipt);
                sb2.append(", mShopCheckout=");
                sb2.append(this.mShopCheckout);
                sb2.append(", mUsername=");
                sb2.append(this.mUsername);
                sb2.append(", ekycZoloz=");
                sb2.append(this.ekycZoloz);
                sb2.append(", mAuthorizeRequest=");
                sb2.append(this.mAuthorizeRequest);
                sb2.append(", mCashinMayaSavingsButton=");
                sb2.append(this.mCashinMayaSavingsButton);
                sb2.append(", mCashinWalletSettings=");
                sb2.append(this.mCashinWalletSettings);
                sb2.append(", mCashinWalletSettingsAutoCashInOption=");
                sb2.append(this.mCashinWalletSettingsAutoCashInOption);
                sb2.append(", mCheckoutOnQR=");
                return AbstractC1213b.N(sb2, this.mCheckoutOnQR, "}");
            }
        };
    }
}
