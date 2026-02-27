package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.ShopCategoryBase;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ShopCategoryBase, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ShopCategoryBase extends ShopCategoryBase {
    private final List<ShopCategory> mData;
    private final Meta mMeta;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ShopCategoryBase$Builder */
    public static class Builder extends ShopCategoryBase.Builder {
        private List<ShopCategory> mData;
        private Meta mMeta;

        @Override // com.paymaya.domain.model.ShopCategoryBase.Builder
        public ShopCategoryBase build() {
            String strI = this.mData == null ? " mData" : "";
            if (this.mMeta == null) {
                strI = s.i(strI, " mMeta");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ShopCategoryBase(this.mData, this.mMeta);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ShopCategoryBase.Builder
        public ShopCategoryBase.Builder mData(List<ShopCategory> list) {
            if (list == null) {
                throw new NullPointerException("Null mData");
            }
            this.mData = list;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopCategoryBase.Builder
        public ShopCategoryBase.Builder mMeta(Meta meta) {
            if (meta == null) {
                throw new NullPointerException("Null mMeta");
            }
            this.mMeta = meta;
            return this;
        }
    }

    public C$$AutoValue_ShopCategoryBase(List<ShopCategory> list, Meta meta) {
        if (list == null) {
            throw new NullPointerException("Null mData");
        }
        this.mData = list;
        if (meta == null) {
            throw new NullPointerException("Null mMeta");
        }
        this.mMeta = meta;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShopCategoryBase) {
            ShopCategoryBase shopCategoryBase = (ShopCategoryBase) obj;
            if (this.mData.equals(shopCategoryBase.mData()) && this.mMeta.equals(shopCategoryBase.mMeta())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mData.hashCode() ^ 1000003) * 1000003) ^ this.mMeta.hashCode();
    }

    @Override // com.paymaya.domain.model.ShopCategoryBase
    @InterfaceC1498b("data")
    public List<ShopCategory> mData() {
        return this.mData;
    }

    @Override // com.paymaya.domain.model.ShopCategoryBase
    @InterfaceC1498b("meta")
    public Meta mMeta() {
        return this.mMeta;
    }

    public String toString() {
        return "ShopCategoryBase{mData=" + this.mData + ", mMeta=" + this.mMeta + "}";
    }
}
