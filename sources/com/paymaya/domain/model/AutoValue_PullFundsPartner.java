package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PullFundsPartner;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PullFundsPartner extends C$AutoValue_PullFundsPartner {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;
        private volatile y int__adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(PullFundsPartner)";
        }

        @Override // com.google.gson.y
        public PullFundsPartner read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            PullFundsPartner.Builder builderSBuilder = PullFundsPartner.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "enabled":
                            y yVarH = this.boolean__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH;
                            }
                            builderSBuilder.mIsEnabled(((Boolean) yVarH.read(aVar)).booleanValue());
                            break;
                        case "currency":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mCurrency((String) yVarH2.read(aVar));
                            break;
                        case "limit_max":
                            y yVarH3 = this.int__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Integer.class);
                                this.int__adapter = yVarH3;
                            }
                            builderSBuilder.mLimitMax(((Integer) yVarH3.read(aVar)).intValue());
                            break;
                        case "limit_min":
                            y yVarH4 = this.int__adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(Integer.class);
                                this.int__adapter = yVarH4;
                            }
                            builderSBuilder.mLimitMin(((Integer) yVarH4.read(aVar)).intValue());
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
        public void write(b bVar, PullFundsPartner pullFundsPartner) throws IOException {
            if (pullFundsPartner == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(Constants.ENABLED);
            y yVarH = this.boolean__adapter;
            if (yVarH == null) {
                yVarH = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH;
            }
            yVarH.write(bVar, Boolean.valueOf(pullFundsPartner.mIsEnabled()));
            bVar.m("currency");
            if (pullFundsPartner.mCurrency() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, pullFundsPartner.mCurrency());
            }
            bVar.m("limit_min");
            y yVarH3 = this.int__adapter;
            if (yVarH3 == null) {
                yVarH3 = this.gson.h(Integer.class);
                this.int__adapter = yVarH3;
            }
            yVarH3.write(bVar, Integer.valueOf(pullFundsPartner.mLimitMin()));
            bVar.m("limit_max");
            y yVarH4 = this.int__adapter;
            if (yVarH4 == null) {
                yVarH4 = this.gson.h(Integer.class);
                this.int__adapter = yVarH4;
            }
            yVarH4.write(bVar, Integer.valueOf(pullFundsPartner.mLimitMax()));
            bVar.k();
        }
    }

    public AutoValue_PullFundsPartner(boolean z4, String str, int i, int i4) {
        new PullFundsPartner(z4, str, i, i4) { // from class: com.paymaya.domain.model.$AutoValue_PullFundsPartner
            private final String mCurrency;
            private final boolean mIsEnabled;
            private final int mLimitMax;
            private final int mLimitMin;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PullFundsPartner$Builder */
            public static class Builder extends PullFundsPartner.Builder {
                private String mCurrency;
                private Boolean mIsEnabled;
                private Integer mLimitMax;
                private Integer mLimitMin;

                public /* synthetic */ Builder(PullFundsPartner pullFundsPartner, int i) {
                    this(pullFundsPartner);
                }

                @Override // com.paymaya.domain.model.PullFundsPartner.Builder
                public PullFundsPartner build() {
                    String strI = this.mIsEnabled == null ? " mIsEnabled" : "";
                    if (this.mCurrency == null) {
                        strI = s.i(strI, " mCurrency");
                    }
                    if (this.mLimitMin == null) {
                        strI = s.i(strI, " mLimitMin");
                    }
                    if (this.mLimitMax == null) {
                        strI = s.i(strI, " mLimitMax");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_PullFundsPartner(this.mIsEnabled.booleanValue(), this.mCurrency, this.mLimitMin.intValue(), this.mLimitMax.intValue());
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.PullFundsPartner.Builder
                public PullFundsPartner.Builder mCurrency(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mCurrency");
                    }
                    this.mCurrency = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.PullFundsPartner.Builder
                public PullFundsPartner.Builder mIsEnabled(boolean z4) {
                    this.mIsEnabled = Boolean.valueOf(z4);
                    return this;
                }

                @Override // com.paymaya.domain.model.PullFundsPartner.Builder
                public PullFundsPartner.Builder mLimitMax(int i) {
                    this.mLimitMax = Integer.valueOf(i);
                    return this;
                }

                @Override // com.paymaya.domain.model.PullFundsPartner.Builder
                public PullFundsPartner.Builder mLimitMin(int i) {
                    this.mLimitMin = Integer.valueOf(i);
                    return this;
                }

                public Builder() {
                }

                private Builder(PullFundsPartner pullFundsPartner) {
                    this.mIsEnabled = Boolean.valueOf(pullFundsPartner.mIsEnabled());
                    this.mCurrency = pullFundsPartner.mCurrency();
                    this.mLimitMin = Integer.valueOf(pullFundsPartner.mLimitMin());
                    this.mLimitMax = Integer.valueOf(pullFundsPartner.mLimitMax());
                }
            }

            {
                this.mIsEnabled = z4;
                if (str == null) {
                    throw new NullPointerException("Null mCurrency");
                }
                this.mCurrency = str;
                this.mLimitMin = i;
                this.mLimitMax = i4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof PullFundsPartner) {
                    PullFundsPartner pullFundsPartner = (PullFundsPartner) obj;
                    if (this.mIsEnabled == pullFundsPartner.mIsEnabled() && this.mCurrency.equals(pullFundsPartner.mCurrency()) && this.mLimitMin == pullFundsPartner.mLimitMin() && this.mLimitMax == pullFundsPartner.mLimitMax()) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return (((((((this.mIsEnabled ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.mCurrency.hashCode()) * 1000003) ^ this.mLimitMin) * 1000003) ^ this.mLimitMax;
            }

            @Override // com.paymaya.domain.model.PullFundsPartner
            @InterfaceC1498b("currency")
            public String mCurrency() {
                return this.mCurrency;
            }

            @Override // com.paymaya.domain.model.PullFundsPartner
            @InterfaceC1498b(Constants.ENABLED)
            public boolean mIsEnabled() {
                return this.mIsEnabled;
            }

            @Override // com.paymaya.domain.model.PullFundsPartner
            @InterfaceC1498b("limit_max")
            public int mLimitMax() {
                return this.mLimitMax;
            }

            @Override // com.paymaya.domain.model.PullFundsPartner
            @InterfaceC1498b("limit_min")
            public int mLimitMin() {
                return this.mLimitMin;
            }

            @Override // com.paymaya.domain.model.PullFundsPartner
            public PullFundsPartner.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("PullFundsPartner{mIsEnabled=");
                sb2.append(this.mIsEnabled);
                sb2.append(", mCurrency=");
                sb2.append(this.mCurrency);
                sb2.append(", mLimitMin=");
                sb2.append(this.mLimitMin);
                sb2.append(", mLimitMax=");
                return s.o(sb2, "}", this.mLimitMax);
            }
        };
    }
}
