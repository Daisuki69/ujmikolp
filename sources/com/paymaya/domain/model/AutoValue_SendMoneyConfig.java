package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.SendMoneyConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_SendMoneyConfig extends C$AutoValue_SendMoneyConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(SendMoneyConfig)";
        }

        @Override // com.google.gson.y
        public SendMoneyConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            SendMoneyConfig.Builder builderSBuilder = SendMoneyConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("smart_money")) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mIsSmartMoneyEnabled(((Boolean) yVarH.read(aVar)).booleanValue());
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, SendMoneyConfig sendMoneyConfig) throws IOException {
            if (sendMoneyConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("smart_money");
            y yVarH = this.boolean__adapter;
            if (yVarH == null) {
                yVarH = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH;
            }
            yVarH.write(bVar, Boolean.valueOf(sendMoneyConfig.mIsSmartMoneyEnabled()));
            bVar.k();
        }
    }

    public AutoValue_SendMoneyConfig(boolean z4) {
        new SendMoneyConfig(z4) { // from class: com.paymaya.domain.model.$AutoValue_SendMoneyConfig
            private final boolean mIsSmartMoneyEnabled;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_SendMoneyConfig$Builder */
            public static class Builder extends SendMoneyConfig.Builder {
                private Boolean mIsSmartMoneyEnabled;

                public /* synthetic */ Builder(SendMoneyConfig sendMoneyConfig, int i) {
                    this(sendMoneyConfig);
                }

                @Override // com.paymaya.domain.model.SendMoneyConfig.Builder
                public SendMoneyConfig build() {
                    String str = this.mIsSmartMoneyEnabled == null ? " mIsSmartMoneyEnabled" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_SendMoneyConfig(this.mIsSmartMoneyEnabled.booleanValue());
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.SendMoneyConfig.Builder
                public SendMoneyConfig.Builder mIsSmartMoneyEnabled(boolean z4) {
                    this.mIsSmartMoneyEnabled = Boolean.valueOf(z4);
                    return this;
                }

                public Builder() {
                }

                private Builder(SendMoneyConfig sendMoneyConfig) {
                    this.mIsSmartMoneyEnabled = Boolean.valueOf(sendMoneyConfig.mIsSmartMoneyEnabled());
                }
            }

            {
                this.mIsSmartMoneyEnabled = z4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof SendMoneyConfig) && this.mIsSmartMoneyEnabled == ((SendMoneyConfig) obj).mIsSmartMoneyEnabled();
            }

            public int hashCode() {
                return (this.mIsSmartMoneyEnabled ? 1231 : 1237) ^ 1000003;
            }

            @Override // com.paymaya.domain.model.SendMoneyConfig
            @InterfaceC1498b("smart_money")
            public boolean mIsSmartMoneyEnabled() {
                return this.mIsSmartMoneyEnabled;
            }

            @Override // com.paymaya.domain.model.SendMoneyConfig
            public SendMoneyConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return s.s(new StringBuilder("SendMoneyConfig{mIsSmartMoneyEnabled="), this.mIsSmartMoneyEnabled, "}");
            }
        };
    }
}
