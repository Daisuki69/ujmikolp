package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AppEventsV2;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AppEventsV2 extends C$AutoValue_AppEventsV2 {

    public static final class GsonTypeAdapter extends y {
        private volatile y enabledConfig_adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AppEventsV2)";
        }

        @Override // com.google.gson.y
        public AppEventsV2 read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AppEventsV2.Builder builderSBuilder = AppEventsV2.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "bank_transfer":
                            y yVarH = this.enabledConfig_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(EnabledConfig.class);
                                this.enabledConfig_adapter = yVarH;
                            }
                            builderSBuilder.mBankTransferEnabled((EnabledConfig) yVarH.read(aVar));
                            break;
                        case "cash_in":
                            y yVarH2 = this.enabledConfig_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(EnabledConfig.class);
                                this.enabledConfig_adapter = yVarH2;
                            }
                            builderSBuilder.mCashInEnabled((EnabledConfig) yVarH2.read(aVar));
                            break;
                        case "send_money":
                            y yVarH3 = this.enabledConfig_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(EnabledConfig.class);
                                this.enabledConfig_adapter = yVarH3;
                            }
                            builderSBuilder.mSendMoneyEnabled((EnabledConfig) yVarH3.read(aVar));
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
        public void write(b bVar, AppEventsV2 appEventsV2) throws IOException {
            if (appEventsV2 == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("bank_transfer");
            if (appEventsV2.mBankTransferEnabled() == null) {
                bVar.r();
            } else {
                y yVarH = this.enabledConfig_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(EnabledConfig.class);
                    this.enabledConfig_adapter = yVarH;
                }
                yVarH.write(bVar, appEventsV2.mBankTransferEnabled());
            }
            bVar.m("send_money");
            if (appEventsV2.mSendMoneyEnabled() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.enabledConfig_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(EnabledConfig.class);
                    this.enabledConfig_adapter = yVarH2;
                }
                yVarH2.write(bVar, appEventsV2.mSendMoneyEnabled());
            }
            bVar.m("cash_in");
            if (appEventsV2.mCashInEnabled() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.enabledConfig_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(EnabledConfig.class);
                    this.enabledConfig_adapter = yVarH3;
                }
                yVarH3.write(bVar, appEventsV2.mCashInEnabled());
            }
            bVar.k();
        }
    }

    public AutoValue_AppEventsV2(EnabledConfig enabledConfig, EnabledConfig enabledConfig2, EnabledConfig enabledConfig3) {
        new AppEventsV2(enabledConfig, enabledConfig2, enabledConfig3) { // from class: com.paymaya.domain.model.$AutoValue_AppEventsV2
            private final EnabledConfig mBankTransferEnabled;
            private final EnabledConfig mCashInEnabled;
            private final EnabledConfig mSendMoneyEnabled;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AppEventsV2$Builder */
            public static class Builder extends AppEventsV2.Builder {
                private EnabledConfig mBankTransferEnabled;
                private EnabledConfig mCashInEnabled;
                private EnabledConfig mSendMoneyEnabled;

                public /* synthetic */ Builder(AppEventsV2 appEventsV2, int i) {
                    this(appEventsV2);
                }

                @Override // com.paymaya.domain.model.AppEventsV2.Builder
                public AppEventsV2 build() {
                    return new AutoValue_AppEventsV2(this.mBankTransferEnabled, this.mSendMoneyEnabled, this.mCashInEnabled);
                }

                @Override // com.paymaya.domain.model.AppEventsV2.Builder
                public AppEventsV2.Builder mBankTransferEnabled(EnabledConfig enabledConfig) {
                    this.mBankTransferEnabled = enabledConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.AppEventsV2.Builder
                public AppEventsV2.Builder mCashInEnabled(EnabledConfig enabledConfig) {
                    this.mCashInEnabled = enabledConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.AppEventsV2.Builder
                public AppEventsV2.Builder mSendMoneyEnabled(EnabledConfig enabledConfig) {
                    this.mSendMoneyEnabled = enabledConfig;
                    return this;
                }

                public Builder() {
                }

                private Builder(AppEventsV2 appEventsV2) {
                    this.mBankTransferEnabled = appEventsV2.mBankTransferEnabled();
                    this.mSendMoneyEnabled = appEventsV2.mSendMoneyEnabled();
                    this.mCashInEnabled = appEventsV2.mCashInEnabled();
                }
            }

            {
                this.mBankTransferEnabled = enabledConfig;
                this.mSendMoneyEnabled = enabledConfig2;
                this.mCashInEnabled = enabledConfig3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AppEventsV2) {
                    AppEventsV2 appEventsV2 = (AppEventsV2) obj;
                    EnabledConfig enabledConfig4 = this.mBankTransferEnabled;
                    if (enabledConfig4 != null ? enabledConfig4.equals(appEventsV2.mBankTransferEnabled()) : appEventsV2.mBankTransferEnabled() == null) {
                        EnabledConfig enabledConfig5 = this.mSendMoneyEnabled;
                        if (enabledConfig5 != null ? enabledConfig5.equals(appEventsV2.mSendMoneyEnabled()) : appEventsV2.mSendMoneyEnabled() == null) {
                            EnabledConfig enabledConfig6 = this.mCashInEnabled;
                            if (enabledConfig6 != null ? enabledConfig6.equals(appEventsV2.mCashInEnabled()) : appEventsV2.mCashInEnabled() == null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                EnabledConfig enabledConfig4 = this.mBankTransferEnabled;
                int iHashCode = ((enabledConfig4 == null ? 0 : enabledConfig4.hashCode()) ^ 1000003) * 1000003;
                EnabledConfig enabledConfig5 = this.mSendMoneyEnabled;
                int iHashCode2 = (iHashCode ^ (enabledConfig5 == null ? 0 : enabledConfig5.hashCode())) * 1000003;
                EnabledConfig enabledConfig6 = this.mCashInEnabled;
                return iHashCode2 ^ (enabledConfig6 != null ? enabledConfig6.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.AppEventsV2
            @InterfaceC1498b("bank_transfer")
            public EnabledConfig mBankTransferEnabled() {
                return this.mBankTransferEnabled;
            }

            @Override // com.paymaya.domain.model.AppEventsV2
            @InterfaceC1498b("cash_in")
            public EnabledConfig mCashInEnabled() {
                return this.mCashInEnabled;
            }

            @Override // com.paymaya.domain.model.AppEventsV2
            @InterfaceC1498b("send_money")
            public EnabledConfig mSendMoneyEnabled() {
                return this.mSendMoneyEnabled;
            }

            @Override // com.paymaya.domain.model.AppEventsV2
            public AppEventsV2.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return "AppEventsV2{mBankTransferEnabled=" + this.mBankTransferEnabled + ", mSendMoneyEnabled=" + this.mSendMoneyEnabled + ", mCashInEnabled=" + this.mCashInEnabled + "}";
            }
        };
    }
}
