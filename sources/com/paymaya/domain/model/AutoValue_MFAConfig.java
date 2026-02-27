package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MFAConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MFAConfig extends C$AutoValue_MFAConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y enabledConfig_adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MFAConfig)";
        }

        @Override // com.google.gson.y
        public MFAConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MFAConfig.Builder builderSBuilder = MFAConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("instapay")) {
                        y yVarH = this.enabledConfig_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(EnabledConfig.class);
                            this.enabledConfig_adapter = yVarH;
                        }
                        builderSBuilder.mInstapayEnabledConfig((EnabledConfig) yVarH.read(aVar));
                    } else if (strE.equals("send_money")) {
                        y yVarH2 = this.enabledConfig_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(EnabledConfig.class);
                            this.enabledConfig_adapter = yVarH2;
                        }
                        builderSBuilder.mSendMoneyEnabledConfig((EnabledConfig) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, MFAConfig mFAConfig) throws IOException {
            if (mFAConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("instapay");
            if (mFAConfig.mInstapayEnabledConfig() == null) {
                bVar.r();
            } else {
                y yVarH = this.enabledConfig_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(EnabledConfig.class);
                    this.enabledConfig_adapter = yVarH;
                }
                yVarH.write(bVar, mFAConfig.mInstapayEnabledConfig());
            }
            bVar.m("send_money");
            if (mFAConfig.mSendMoneyEnabledConfig() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.enabledConfig_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(EnabledConfig.class);
                    this.enabledConfig_adapter = yVarH2;
                }
                yVarH2.write(bVar, mFAConfig.mSendMoneyEnabledConfig());
            }
            bVar.k();
        }
    }

    public AutoValue_MFAConfig(EnabledConfig enabledConfig, EnabledConfig enabledConfig2) {
        new MFAConfig(enabledConfig, enabledConfig2) { // from class: com.paymaya.domain.model.$AutoValue_MFAConfig
            private final EnabledConfig mInstapayEnabledConfig;
            private final EnabledConfig mSendMoneyEnabledConfig;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MFAConfig$Builder */
            public static class Builder extends MFAConfig.Builder {
                private EnabledConfig mInstapayEnabledConfig;
                private EnabledConfig mSendMoneyEnabledConfig;

                public /* synthetic */ Builder(MFAConfig mFAConfig, int i) {
                    this(mFAConfig);
                }

                @Override // com.paymaya.domain.model.MFAConfig.Builder
                public MFAConfig build() {
                    String strI = this.mInstapayEnabledConfig == null ? " mInstapayEnabledConfig" : "";
                    if (this.mSendMoneyEnabledConfig == null) {
                        strI = s.i(strI, " mSendMoneyEnabledConfig");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_MFAConfig(this.mInstapayEnabledConfig, this.mSendMoneyEnabledConfig);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.MFAConfig.Builder
                public MFAConfig.Builder mInstapayEnabledConfig(EnabledConfig enabledConfig) {
                    if (enabledConfig == null) {
                        throw new NullPointerException("Null mInstapayEnabledConfig");
                    }
                    this.mInstapayEnabledConfig = enabledConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.MFAConfig.Builder
                public MFAConfig.Builder mSendMoneyEnabledConfig(EnabledConfig enabledConfig) {
                    if (enabledConfig == null) {
                        throw new NullPointerException("Null mSendMoneyEnabledConfig");
                    }
                    this.mSendMoneyEnabledConfig = enabledConfig;
                    return this;
                }

                public Builder() {
                }

                private Builder(MFAConfig mFAConfig) {
                    this.mInstapayEnabledConfig = mFAConfig.mInstapayEnabledConfig();
                    this.mSendMoneyEnabledConfig = mFAConfig.mSendMoneyEnabledConfig();
                }
            }

            {
                if (enabledConfig == null) {
                    throw new NullPointerException("Null mInstapayEnabledConfig");
                }
                this.mInstapayEnabledConfig = enabledConfig;
                if (enabledConfig2 == null) {
                    throw new NullPointerException("Null mSendMoneyEnabledConfig");
                }
                this.mSendMoneyEnabledConfig = enabledConfig2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MFAConfig) {
                    MFAConfig mFAConfig = (MFAConfig) obj;
                    if (this.mInstapayEnabledConfig.equals(mFAConfig.mInstapayEnabledConfig()) && this.mSendMoneyEnabledConfig.equals(mFAConfig.mSendMoneyEnabledConfig())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mInstapayEnabledConfig.hashCode() ^ 1000003) * 1000003) ^ this.mSendMoneyEnabledConfig.hashCode();
            }

            @Override // com.paymaya.domain.model.MFAConfig
            @InterfaceC1498b("instapay")
            public EnabledConfig mInstapayEnabledConfig() {
                return this.mInstapayEnabledConfig;
            }

            @Override // com.paymaya.domain.model.MFAConfig
            @InterfaceC1498b("send_money")
            public EnabledConfig mSendMoneyEnabledConfig() {
                return this.mSendMoneyEnabledConfig;
            }

            @Override // com.paymaya.domain.model.MFAConfig
            public MFAConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return "MFAConfig{mInstapayEnabledConfig=" + this.mInstapayEnabledConfig + ", mSendMoneyEnabledConfig=" + this.mSendMoneyEnabledConfig + "}";
            }
        };
    }
}
