package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ShopPurchaseHistoryBase, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ShopPurchaseHistoryBase extends ShopPurchaseHistoryBase {
    private final List<ShopPurchaseHistory> mData;
    private final Meta mMeta;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ShopPurchaseHistoryBase$Builder */
    public static class Builder extends ShopPurchaseHistoryBase.Builder {
        private List<ShopPurchaseHistory> mData;
        private Meta mMeta;

        @Override // com.paymaya.domain.model.ShopPurchaseHistoryBase.Builder
        public ShopPurchaseHistoryBase build() {
            String strI = this.mData == null ? " mData" : "";
            if (this.mMeta == null) {
                strI = s.i(strI, " mMeta");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ShopPurchaseHistoryBase(this.mData, this.mMeta);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistoryBase.Builder
        public ShopPurchaseHistoryBase.Builder mData(List<ShopPurchaseHistory> list) {
            if (list == null) {
                throw new NullPointerException("Null mData");
            }
            this.mData = list;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopPurchaseHistoryBase.Builder
        public ShopPurchaseHistoryBase.Builder mMeta(Meta meta) {
            if (meta == null) {
                throw new NullPointerException("Null mMeta");
            }
            this.mMeta = meta;
            return this;
        }
    }

    public C$$AutoValue_ShopPurchaseHistoryBase(List<ShopPurchaseHistory> list, Meta meta) {
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
        if (obj instanceof ShopPurchaseHistoryBase) {
            ShopPurchaseHistoryBase shopPurchaseHistoryBase = (ShopPurchaseHistoryBase) obj;
            if (this.mData.equals(shopPurchaseHistoryBase.mData()) && this.mMeta.equals(shopPurchaseHistoryBase.mMeta())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mData.hashCode() ^ 1000003) * 1000003) ^ this.mMeta.hashCode();
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistoryBase
    @InterfaceC1498b("data")
    public List<ShopPurchaseHistory> mData() {
        return this.mData;
    }

    @Override // com.paymaya.domain.model.ShopPurchaseHistoryBase
    @InterfaceC1498b("meta")
    public Meta mMeta() {
        return this.mMeta;
    }

    public String toString() {
        return "ShopPurchaseHistoryBase{mData=" + this.mData + ", mMeta=" + this.mMeta + "}";
    }
}
