package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BillsPayAccountNumberConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillsPayAccountNumberConfig extends C$AutoValue_BillsPayAccountNumberConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(BillsPayAccountNumberConfig)";
        }

        @Override // com.google.gson.y
        public BillsPayAccountNumberConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            BillsPayAccountNumberConfig.Builder builderSBuilder = BillsPayAccountNumberConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("share_account_number")) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mIsShareEnabled(((Boolean) yVarH.read(aVar)).booleanValue());
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, BillsPayAccountNumberConfig billsPayAccountNumberConfig) throws IOException {
            if (billsPayAccountNumberConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("share_account_number");
            y yVarH = this.boolean__adapter;
            if (yVarH == null) {
                yVarH = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH;
            }
            yVarH.write(bVar, Boolean.valueOf(billsPayAccountNumberConfig.mIsShareEnabled()));
            bVar.k();
        }
    }

    public AutoValue_BillsPayAccountNumberConfig(boolean z4) {
        new BillsPayAccountNumberConfig(z4) { // from class: com.paymaya.domain.model.$AutoValue_BillsPayAccountNumberConfig
            private final boolean mIsShareEnabled;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillsPayAccountNumberConfig$Builder */
            public static class Builder extends BillsPayAccountNumberConfig.Builder {
                private Boolean mIsShareEnabled;

                public /* synthetic */ Builder(BillsPayAccountNumberConfig billsPayAccountNumberConfig, int i) {
                    this(billsPayAccountNumberConfig);
                }

                @Override // com.paymaya.domain.model.BillsPayAccountNumberConfig.Builder
                public BillsPayAccountNumberConfig build() {
                    String str = this.mIsShareEnabled == null ? " mIsShareEnabled" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_BillsPayAccountNumberConfig(this.mIsShareEnabled.booleanValue());
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.BillsPayAccountNumberConfig.Builder
                public BillsPayAccountNumberConfig.Builder mIsShareEnabled(boolean z4) {
                    this.mIsShareEnabled = Boolean.valueOf(z4);
                    return this;
                }

                public Builder() {
                }

                private Builder(BillsPayAccountNumberConfig billsPayAccountNumberConfig) {
                    this.mIsShareEnabled = Boolean.valueOf(billsPayAccountNumberConfig.mIsShareEnabled());
                }
            }

            {
                this.mIsShareEnabled = z4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof BillsPayAccountNumberConfig) && this.mIsShareEnabled == ((BillsPayAccountNumberConfig) obj).mIsShareEnabled();
            }

            public int hashCode() {
                return (this.mIsShareEnabled ? 1231 : 1237) ^ 1000003;
            }

            @Override // com.paymaya.domain.model.BillsPayAccountNumberConfig
            @InterfaceC1498b("share_account_number")
            public boolean mIsShareEnabled() {
                return this.mIsShareEnabled;
            }

            @Override // com.paymaya.domain.model.BillsPayAccountNumberConfig
            public BillsPayAccountNumberConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return s.s(new StringBuilder("BillsPayAccountNumberConfig{mIsShareEnabled="), this.mIsShareEnabled, "}");
            }
        };
    }
}
