package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.Term;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Term, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Term extends Term {
    private final String mUnit;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Term$Builder */
    public static class Builder extends Term.Builder {
        private String mUnit;
        private String mValue;

        @Override // com.paymaya.domain.model.Term.Builder
        public Term build() {
            String strI = this.mValue == null ? " mValue" : "";
            if (this.mUnit == null) {
                strI = s.i(strI, " mUnit");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Term(this.mValue, this.mUnit);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Term.Builder
        public Term.Builder mUnit(String str) {
            if (str == null) {
                throw new NullPointerException("Null mUnit");
            }
            this.mUnit = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Term.Builder
        public Term.Builder mValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null mValue");
            }
            this.mValue = str;
            return this;
        }
    }

    public C$$AutoValue_Term(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mValue");
        }
        this.mValue = str;
        if (str2 == null) {
            throw new NullPointerException("Null mUnit");
        }
        this.mUnit = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Term) {
            Term term = (Term) obj;
            if (this.mValue.equals(term.mValue()) && this.mUnit.equals(term.mUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mValue.hashCode() ^ 1000003) * 1000003) ^ this.mUnit.hashCode();
    }

    @Override // com.paymaya.domain.model.Term
    @InterfaceC1498b("unit")
    public String mUnit() {
        return this.mUnit;
    }

    @Override // com.paymaya.domain.model.Term
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Term{mValue=");
        sb2.append(this.mValue);
        sb2.append(", mUnit=");
        return s.p(sb2, this.mUnit, "}");
    }
}
