package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.VoucherBase;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VoucherBase, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_VoucherBase extends VoucherBase {
    private final List<Voucher> mData;
    private final Meta mMeta;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VoucherBase$Builder */
    public static class Builder extends VoucherBase.Builder {
        private List<Voucher> mData;
        private Meta mMeta;

        @Override // com.paymaya.domain.model.VoucherBase.Builder
        public VoucherBase build() {
            String strI = this.mData == null ? " mData" : "";
            if (this.mMeta == null) {
                strI = s.i(strI, " mMeta");
            }
            if (strI.isEmpty()) {
                return new AutoValue_VoucherBase(this.mData, this.mMeta);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.VoucherBase.Builder
        public VoucherBase.Builder mData(List<Voucher> list) {
            if (list == null) {
                throw new NullPointerException("Null mData");
            }
            this.mData = list;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherBase.Builder
        public VoucherBase.Builder mMeta(Meta meta) {
            if (meta == null) {
                throw new NullPointerException("Null mMeta");
            }
            this.mMeta = meta;
            return this;
        }
    }

    public C$$AutoValue_VoucherBase(List<Voucher> list, Meta meta) {
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
        if (obj instanceof VoucherBase) {
            VoucherBase voucherBase = (VoucherBase) obj;
            if (this.mData.equals(voucherBase.mData()) && this.mMeta.equals(voucherBase.mMeta())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mData.hashCode() ^ 1000003) * 1000003) ^ this.mMeta.hashCode();
    }

    @Override // com.paymaya.domain.model.VoucherBase
    @InterfaceC1498b("data")
    public List<Voucher> mData() {
        return this.mData;
    }

    @Override // com.paymaya.domain.model.VoucherBase
    @InterfaceC1498b("meta")
    public Meta mMeta() {
        return this.mMeta;
    }

    public String toString() {
        return "VoucherBase{mData=" + this.mData + ", mMeta=" + this.mMeta + "}";
    }
}
