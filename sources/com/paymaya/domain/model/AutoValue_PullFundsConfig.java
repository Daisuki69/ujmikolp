package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PullFundsConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PullFundsConfig extends C$AutoValue_PullFundsConfig {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y pullFundsPartner_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(PullFundsConfig)";
        }

        @Override // com.google.gson.y
        public PullFundsConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            PullFundsConfig.Builder builderSBuilder = PullFundsConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("bpi")) {
                        y yVarH = this.pullFundsPartner_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(PullFundsPartner.class);
                            this.pullFundsPartner_adapter = yVarH;
                        }
                        builderSBuilder.mBPIPullFundsPartner((PullFundsPartner) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, PullFundsConfig pullFundsConfig) throws IOException {
            if (pullFundsConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("bpi");
            if (pullFundsConfig.mBPIPullFundsPartner() == null) {
                bVar.r();
            } else {
                y yVarH = this.pullFundsPartner_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(PullFundsPartner.class);
                    this.pullFundsPartner_adapter = yVarH;
                }
                yVarH.write(bVar, pullFundsConfig.mBPIPullFundsPartner());
            }
            bVar.k();
        }
    }

    public AutoValue_PullFundsConfig(PullFundsPartner pullFundsPartner) {
        new PullFundsConfig(pullFundsPartner) { // from class: com.paymaya.domain.model.$AutoValue_PullFundsConfig
            private final PullFundsPartner mBPIPullFundsPartner;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PullFundsConfig$Builder */
            public static class Builder extends PullFundsConfig.Builder {
                private PullFundsPartner mBPIPullFundsPartner;

                public /* synthetic */ Builder(PullFundsConfig pullFundsConfig, int i) {
                    this(pullFundsConfig);
                }

                @Override // com.paymaya.domain.model.PullFundsConfig.Builder
                public PullFundsConfig build() {
                    String str = this.mBPIPullFundsPartner == null ? " mBPIPullFundsPartner" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_PullFundsConfig(this.mBPIPullFundsPartner);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.PullFundsConfig.Builder
                public PullFundsConfig.Builder mBPIPullFundsPartner(PullFundsPartner pullFundsPartner) {
                    if (pullFundsPartner == null) {
                        throw new NullPointerException("Null mBPIPullFundsPartner");
                    }
                    this.mBPIPullFundsPartner = pullFundsPartner;
                    return this;
                }

                public Builder() {
                }

                private Builder(PullFundsConfig pullFundsConfig) {
                    this.mBPIPullFundsPartner = pullFundsConfig.mBPIPullFundsPartner();
                }
            }

            {
                if (pullFundsPartner == null) {
                    throw new NullPointerException("Null mBPIPullFundsPartner");
                }
                this.mBPIPullFundsPartner = pullFundsPartner;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof PullFundsConfig) {
                    return this.mBPIPullFundsPartner.equals(((PullFundsConfig) obj).mBPIPullFundsPartner());
                }
                return false;
            }

            public int hashCode() {
                return this.mBPIPullFundsPartner.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.PullFundsConfig
            @InterfaceC1498b("bpi")
            public PullFundsPartner mBPIPullFundsPartner() {
                return this.mBPIPullFundsPartner;
            }

            @Override // com.paymaya.domain.model.PullFundsConfig
            public PullFundsConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return "PullFundsConfig{mBPIPullFundsPartner=" + this.mBPIPullFundsPartner + "}";
            }
        };
    }
}
