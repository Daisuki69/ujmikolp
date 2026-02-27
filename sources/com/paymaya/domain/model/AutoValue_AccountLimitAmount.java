package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AccountLimitAmount;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccountLimitAmount extends C$AutoValue_AccountLimitAmount {

    public static final class GsonTypeAdapter extends y {
        private volatile y double__adapter;
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AccountLimitAmount)";
        }

        @Override // com.google.gson.y
        public AccountLimitAmount read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AccountLimitAmount.Builder builderSBuilder = AccountLimitAmount.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "limit":
                            y yVarH = this.double__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Double.class);
                                this.double__adapter = yVarH;
                            }
                            builderSBuilder.mLimit(((Double) yVarH.read(aVar)).doubleValue());
                            break;
                        case "currency":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mCurrency((String) yVarH2.read(aVar));
                            break;
                        case "remaining":
                            y yVarH3 = this.double__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Double.class);
                                this.double__adapter = yVarH3;
                            }
                            builderSBuilder.mRemaining(((Double) yVarH3.read(aVar)).doubleValue());
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
        public void write(b bVar, AccountLimitAmount accountLimitAmount) throws IOException {
            if (accountLimitAmount == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("limit");
            y yVarH = this.double__adapter;
            if (yVarH == null) {
                yVarH = this.gson.h(Double.class);
                this.double__adapter = yVarH;
            }
            yVarH.write(bVar, Double.valueOf(accountLimitAmount.mLimit()));
            bVar.m("remaining");
            y yVarH2 = this.double__adapter;
            if (yVarH2 == null) {
                yVarH2 = this.gson.h(Double.class);
                this.double__adapter = yVarH2;
            }
            yVarH2.write(bVar, Double.valueOf(accountLimitAmount.mRemaining()));
            bVar.m("currency");
            if (accountLimitAmount.mCurrency() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, accountLimitAmount.mCurrency());
            }
            bVar.k();
        }
    }

    public AutoValue_AccountLimitAmount(final double d10, final double d11, final String str) {
        new AccountLimitAmount(d10, d11, str) { // from class: com.paymaya.domain.model.$AutoValue_AccountLimitAmount
            private final String mCurrency;
            private final double mLimit;
            private final double mRemaining;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AccountLimitAmount$Builder */
            public static class Builder extends AccountLimitAmount.Builder {
                private String mCurrency;
                private Double mLimit;
                private Double mRemaining;

                @Override // com.paymaya.domain.model.AccountLimitAmount.Builder
                public AccountLimitAmount build() {
                    String strI = this.mLimit == null ? " mLimit" : "";
                    if (this.mRemaining == null) {
                        strI = s.i(strI, " mRemaining");
                    }
                    if (this.mCurrency == null) {
                        strI = s.i(strI, " mCurrency");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_AccountLimitAmount(this.mLimit.doubleValue(), this.mRemaining.doubleValue(), this.mCurrency);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.AccountLimitAmount.Builder
                public AccountLimitAmount.Builder mCurrency(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mCurrency");
                    }
                    this.mCurrency = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimitAmount.Builder
                public AccountLimitAmount.Builder mLimit(double d10) {
                    this.mLimit = Double.valueOf(d10);
                    return this;
                }

                @Override // com.paymaya.domain.model.AccountLimitAmount.Builder
                public AccountLimitAmount.Builder mRemaining(double d10) {
                    this.mRemaining = Double.valueOf(d10);
                    return this;
                }
            }

            {
                this.mLimit = d10;
                this.mRemaining = d11;
                if (str == null) {
                    throw new NullPointerException("Null mCurrency");
                }
                this.mCurrency = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AccountLimitAmount) {
                    AccountLimitAmount accountLimitAmount = (AccountLimitAmount) obj;
                    if (Double.doubleToLongBits(this.mLimit) == Double.doubleToLongBits(accountLimitAmount.mLimit()) && Double.doubleToLongBits(this.mRemaining) == Double.doubleToLongBits(accountLimitAmount.mRemaining()) && this.mCurrency.equals(accountLimitAmount.mCurrency())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((int) ((Double.doubleToLongBits(this.mLimit) >>> 32) ^ Double.doubleToLongBits(this.mLimit))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.mRemaining) >>> 32) ^ Double.doubleToLongBits(this.mRemaining)))) * 1000003) ^ this.mCurrency.hashCode();
            }

            @Override // com.paymaya.domain.model.AccountLimitAmount
            @InterfaceC1498b("currency")
            public String mCurrency() {
                return this.mCurrency;
            }

            @Override // com.paymaya.domain.model.AccountLimitAmount
            @InterfaceC1498b("limit")
            public double mLimit() {
                return this.mLimit;
            }

            @Override // com.paymaya.domain.model.AccountLimitAmount
            @InterfaceC1498b("remaining")
            public double mRemaining() {
                return this.mRemaining;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("AccountLimitAmount{mLimit=");
                sb2.append(this.mLimit);
                sb2.append(", mRemaining=");
                sb2.append(this.mRemaining);
                sb2.append(", mCurrency=");
                return s.p(sb2, this.mCurrency, "}");
            }
        };
    }
}
