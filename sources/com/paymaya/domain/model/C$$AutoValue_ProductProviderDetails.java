package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.ProductProviderDetails;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ProductProviderDetails, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ProductProviderDetails extends ProductProviderDetails {
    private final List<ProductProviderField> mProductProviderFields;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ProductProviderDetails$Builder */
    public static class Builder extends ProductProviderDetails.Builder {
        private List<ProductProviderField> mProductProviderFields;

        public /* synthetic */ Builder(ProductProviderDetails productProviderDetails, int i) {
            this(productProviderDetails);
        }

        @Override // com.paymaya.domain.model.ProductProviderDetails.Builder
        public ProductProviderDetails build() {
            return new AutoValue_ProductProviderDetails(this.mProductProviderFields);
        }

        @Override // com.paymaya.domain.model.ProductProviderDetails.Builder
        public ProductProviderDetails.Builder mProductProviderFields(List<ProductProviderField> list) {
            this.mProductProviderFields = list;
            return this;
        }

        public Builder() {
        }

        private Builder(ProductProviderDetails productProviderDetails) {
            this.mProductProviderFields = productProviderDetails.mProductProviderFields();
        }
    }

    public C$$AutoValue_ProductProviderDetails(@Nullable List<ProductProviderField> list) {
        this.mProductProviderFields = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductProviderDetails)) {
            return false;
        }
        List<ProductProviderField> list = this.mProductProviderFields;
        List<ProductProviderField> listMProductProviderFields = ((ProductProviderDetails) obj).mProductProviderFields();
        return list == null ? listMProductProviderFields == null : list.equals(listMProductProviderFields);
    }

    public int hashCode() {
        List<ProductProviderField> list = this.mProductProviderFields;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }

    @Override // com.paymaya.domain.model.ProductProviderDetails
    @Nullable
    @InterfaceC1498b("fields")
    public List<ProductProviderField> mProductProviderFields() {
        return this.mProductProviderFields;
    }

    @Override // com.paymaya.domain.model.ProductProviderDetails
    public ProductProviderDetails.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return s.r(new StringBuilder("ProductProviderDetails{mProductProviderFields="), this.mProductProviderFields, "}");
    }
}
