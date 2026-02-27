package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.CreditCard;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CreditCard extends C$AutoValue_CreditCard {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(CreditCard)";
        }

        @Override // com.google.gson.y
        public CreditCard read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            CreditCard.Builder builderSBuilder = CreditCard.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "month_expiry":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mExpiryMonth((String) yVarH.read(aVar));
                            break;
                        case "year_expiry":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mExpiryYear((String) yVarH2.read(aVar));
                            break;
                        case "number":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mCardNumber((String) yVarH3.read(aVar));
                            break;
                        case "csc":
                            y yVarH4 = this.string_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(String.class);
                                this.string_adapter = yVarH4;
                            }
                            builderSBuilder.mCsc((String) yVarH4.read(aVar));
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
        public void write(b bVar, CreditCard creditCard) throws IOException {
            if (creditCard == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("number");
            if (creditCard.mCardNumber() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, creditCard.mCardNumber());
            }
            bVar.m("month_expiry");
            if (creditCard.mExpiryMonth() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, creditCard.mExpiryMonth());
            }
            bVar.m("year_expiry");
            if (creditCard.mExpiryYear() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, creditCard.mExpiryYear());
            }
            bVar.m("csc");
            if (creditCard.mCsc() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.string_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(String.class);
                    this.string_adapter = yVarH4;
                }
                yVarH4.write(bVar, creditCard.mCsc());
            }
            bVar.k();
        }
    }

    public AutoValue_CreditCard(String str, String str2, String str3, String str4) {
        new CreditCard(str, str2, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_CreditCard
            private final String mCardNumber;
            private final String mCsc;
            private final String mExpiryMonth;
            private final String mExpiryYear;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_CreditCard$Builder */
            public static class Builder extends CreditCard.Builder {
                private String mCardNumber;
                private String mCsc;
                private String mExpiryMonth;
                private String mExpiryYear;

                @Override // com.paymaya.domain.model.CreditCard.Builder
                public CreditCard build() {
                    String strI = this.mCardNumber == null ? " mCardNumber" : "";
                    if (this.mExpiryMonth == null) {
                        strI = s.i(strI, " mExpiryMonth");
                    }
                    if (this.mExpiryYear == null) {
                        strI = s.i(strI, " mExpiryYear");
                    }
                    if (this.mCsc == null) {
                        strI = s.i(strI, " mCsc");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_CreditCard(this.mCardNumber, this.mExpiryMonth, this.mExpiryYear, this.mCsc);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.CreditCard.Builder
                public CreditCard.Builder mCardNumber(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mCardNumber");
                    }
                    this.mCardNumber = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.CreditCard.Builder
                public CreditCard.Builder mCsc(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mCsc");
                    }
                    this.mCsc = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.CreditCard.Builder
                public CreditCard.Builder mExpiryMonth(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mExpiryMonth");
                    }
                    this.mExpiryMonth = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.CreditCard.Builder
                public CreditCard.Builder mExpiryYear(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mExpiryYear");
                    }
                    this.mExpiryYear = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mCardNumber");
                }
                this.mCardNumber = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mExpiryMonth");
                }
                this.mExpiryMonth = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mExpiryYear");
                }
                this.mExpiryYear = str3;
                if (str4 == null) {
                    throw new NullPointerException("Null mCsc");
                }
                this.mCsc = str4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof CreditCard) {
                    CreditCard creditCard = (CreditCard) obj;
                    if (this.mCardNumber.equals(creditCard.mCardNumber()) && this.mExpiryMonth.equals(creditCard.mExpiryMonth()) && this.mExpiryYear.equals(creditCard.mExpiryYear()) && this.mCsc.equals(creditCard.mCsc())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((this.mCardNumber.hashCode() ^ 1000003) * 1000003) ^ this.mExpiryMonth.hashCode()) * 1000003) ^ this.mExpiryYear.hashCode()) * 1000003) ^ this.mCsc.hashCode();
            }

            @Override // com.paymaya.domain.model.CreditCard
            @InterfaceC1498b("number")
            public String mCardNumber() {
                return this.mCardNumber;
            }

            @Override // com.paymaya.domain.model.CreditCard
            @InterfaceC1498b("csc")
            public String mCsc() {
                return this.mCsc;
            }

            @Override // com.paymaya.domain.model.CreditCard
            @InterfaceC1498b("month_expiry")
            public String mExpiryMonth() {
                return this.mExpiryMonth;
            }

            @Override // com.paymaya.domain.model.CreditCard
            @InterfaceC1498b("year_expiry")
            public String mExpiryYear() {
                return this.mExpiryYear;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("CreditCard{mCardNumber=");
                sb2.append(this.mCardNumber);
                sb2.append(", mExpiryMonth=");
                sb2.append(this.mExpiryMonth);
                sb2.append(", mExpiryYear=");
                sb2.append(this.mExpiryYear);
                sb2.append(", mCsc=");
                return s.p(sb2, this.mCsc, "}");
            }
        };
    }
}
