package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.FormSeries;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FormSeries, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_FormSeries extends FormSeries {
    private final String mFormSeries;
    private final String mFormType;
    private final List<String> mTaxTypeList;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FormSeries$Builder */
    public static class Builder extends FormSeries.Builder {
        private String mFormSeries;
        private String mFormType;
        private List<String> mTaxTypeList;

        @Override // com.paymaya.domain.model.FormSeries.Builder
        public FormSeries build() {
            String strI = this.mFormType == null ? " mFormType" : "";
            if (this.mFormSeries == null) {
                strI = s.i(strI, " mFormSeries");
            }
            if (this.mTaxTypeList == null) {
                strI = s.i(strI, " mTaxTypeList");
            }
            if (strI.isEmpty()) {
                return new AutoValue_FormSeries(this.mFormType, this.mFormSeries, this.mTaxTypeList);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.FormSeries.Builder
        public FormSeries.Builder mFormSeries(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFormSeries");
            }
            this.mFormSeries = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FormSeries.Builder
        public FormSeries.Builder mFormType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFormType");
            }
            this.mFormType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FormSeries.Builder
        public FormSeries.Builder mTaxTypeList(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null mTaxTypeList");
            }
            this.mTaxTypeList = list;
            return this;
        }
    }

    public C$$AutoValue_FormSeries(String str, String str2, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null mFormType");
        }
        this.mFormType = str;
        if (str2 == null) {
            throw new NullPointerException("Null mFormSeries");
        }
        this.mFormSeries = str2;
        if (list == null) {
            throw new NullPointerException("Null mTaxTypeList");
        }
        this.mTaxTypeList = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FormSeries) {
            FormSeries formSeries = (FormSeries) obj;
            if (this.mFormType.equals(formSeries.mFormType()) && this.mFormSeries.equals(formSeries.mFormSeries()) && this.mTaxTypeList.equals(formSeries.mTaxTypeList())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mFormType.hashCode() ^ 1000003) * 1000003) ^ this.mFormSeries.hashCode()) * 1000003) ^ this.mTaxTypeList.hashCode();
    }

    @Override // com.paymaya.domain.model.FormSeries
    @InterfaceC1498b("form_series")
    public String mFormSeries() {
        return this.mFormSeries;
    }

    @Override // com.paymaya.domain.model.FormSeries
    @InterfaceC1498b("form_type")
    public String mFormType() {
        return this.mFormType;
    }

    @Override // com.paymaya.domain.model.FormSeries
    @InterfaceC1498b("tax_type")
    public List<String> mTaxTypeList() {
        return this.mTaxTypeList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FormSeries{mFormType=");
        sb2.append(this.mFormType);
        sb2.append(", mFormSeries=");
        sb2.append(this.mFormSeries);
        sb2.append(", mTaxTypeList=");
        return s.r(sb2, this.mTaxTypeList, "}");
    }
}
