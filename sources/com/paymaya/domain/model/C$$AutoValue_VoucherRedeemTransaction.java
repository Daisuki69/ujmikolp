package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.VoucherRedeemTransaction;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VoucherRedeemTransaction, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_VoucherRedeemTransaction extends VoucherRedeemTransaction {
    private final double mAmount;
    private final String mCampaignName;
    private final String mExternalPartnerCode;
    private final String mMi3ReferenceId;
    private final String mRedeemDate;
    private final String mRedeemVoucherId;
    private final String mStatus;
    private final String mVoucherType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VoucherRedeemTransaction$Builder */
    public static class Builder extends VoucherRedeemTransaction.Builder {
        private Double mAmount;
        private String mCampaignName;
        private String mExternalPartnerCode;
        private String mMi3ReferenceId;
        private String mRedeemDate;
        private String mRedeemVoucherId;
        private String mStatus;
        private String mVoucherType;

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction build() {
            String strI = this.mRedeemVoucherId == null ? " mRedeemVoucherId" : "";
            if (this.mCampaignName == null) {
                strI = s.i(strI, " mCampaignName");
            }
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
            }
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_VoucherRedeemTransaction(this.mRedeemVoucherId, this.mCampaignName, this.mStatus, this.mMi3ReferenceId, this.mRedeemDate, this.mExternalPartnerCode, this.mVoucherType, this.mAmount.doubleValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction.Builder mAmount(double d10) {
            this.mAmount = Double.valueOf(d10);
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction.Builder mCampaignName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCampaignName");
            }
            this.mCampaignName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction.Builder mExternalPartnerCode(@Nullable String str) {
            this.mExternalPartnerCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction.Builder mMi3ReferenceId(@Nullable String str) {
            this.mMi3ReferenceId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction.Builder mRedeemDate(@Nullable String str) {
            this.mRedeemDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction.Builder mRedeemVoucherId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mRedeemVoucherId");
            }
            this.mRedeemVoucherId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherRedeemTransaction.Builder
        public VoucherRedeemTransaction.Builder mVoucherType(@Nullable String str) {
            this.mVoucherType = str;
            return this;
        }
    }

    public C$$AutoValue_VoucherRedeemTransaction(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, double d10) {
        if (str == null) {
            throw new NullPointerException("Null mRedeemVoucherId");
        }
        this.mRedeemVoucherId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mCampaignName");
        }
        this.mCampaignName = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str3;
        this.mMi3ReferenceId = str4;
        this.mRedeemDate = str5;
        this.mExternalPartnerCode = str6;
        this.mVoucherType = str7;
        this.mAmount = d10;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoucherRedeemTransaction) {
            VoucherRedeemTransaction voucherRedeemTransaction = (VoucherRedeemTransaction) obj;
            if (this.mRedeemVoucherId.equals(voucherRedeemTransaction.mRedeemVoucherId()) && this.mCampaignName.equals(voucherRedeemTransaction.mCampaignName()) && this.mStatus.equals(voucherRedeemTransaction.mStatus()) && ((str = this.mMi3ReferenceId) != null ? str.equals(voucherRedeemTransaction.mMi3ReferenceId()) : voucherRedeemTransaction.mMi3ReferenceId() == null) && ((str2 = this.mRedeemDate) != null ? str2.equals(voucherRedeemTransaction.mRedeemDate()) : voucherRedeemTransaction.mRedeemDate() == null) && ((str3 = this.mExternalPartnerCode) != null ? str3.equals(voucherRedeemTransaction.mExternalPartnerCode()) : voucherRedeemTransaction.mExternalPartnerCode() == null) && ((str4 = this.mVoucherType) != null ? str4.equals(voucherRedeemTransaction.mVoucherType()) : voucherRedeemTransaction.mVoucherType() == null) && Double.doubleToLongBits(this.mAmount) == Double.doubleToLongBits(voucherRedeemTransaction.mAmount())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.mRedeemVoucherId.hashCode() ^ 1000003) * 1000003) ^ this.mCampaignName.hashCode()) * 1000003) ^ this.mStatus.hashCode()) * 1000003;
        String str = this.mMi3ReferenceId;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mRedeemDate;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mExternalPartnerCode;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mVoucherType;
        return ((iHashCode4 ^ (str4 != null ? str4.hashCode() : 0)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.mAmount) >>> 32) ^ Double.doubleToLongBits(this.mAmount)));
    }

    @Override // com.paymaya.domain.model.VoucherRedeemTransaction
    @InterfaceC1498b("amount")
    public double mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.VoucherRedeemTransaction
    @InterfaceC1498b(alternate = {"campaignName"}, value = "campaign_name")
    public String mCampaignName() {
        return this.mCampaignName;
    }

    @Override // com.paymaya.domain.model.VoucherRedeemTransaction
    @Nullable
    @InterfaceC1498b("external_partner_code")
    public String mExternalPartnerCode() {
        return this.mExternalPartnerCode;
    }

    @Override // com.paymaya.domain.model.VoucherRedeemTransaction
    @Nullable
    @InterfaceC1498b(alternate = {"mi3ReferenceId"}, value = "mi3_reference_id")
    public String mMi3ReferenceId() {
        return this.mMi3ReferenceId;
    }

    @Override // com.paymaya.domain.model.VoucherRedeemTransaction
    @Nullable
    @InterfaceC1498b(alternate = {"redeemDate"}, value = "redeem_date")
    public String mRedeemDate() {
        return this.mRedeemDate;
    }

    @Override // com.paymaya.domain.model.VoucherRedeemTransaction
    @InterfaceC1498b(alternate = {"redeemVoucherId"}, value = "redeem_voucher_id")
    public String mRedeemVoucherId() {
        return this.mRedeemVoucherId;
    }

    @Override // com.paymaya.domain.model.VoucherRedeemTransaction
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.VoucherRedeemTransaction
    @Nullable
    @InterfaceC1498b("voucher_type")
    public String mVoucherType() {
        return this.mVoucherType;
    }

    public String toString() {
        return "VoucherRedeemTransaction{mRedeemVoucherId=" + this.mRedeemVoucherId + ", mCampaignName=" + this.mCampaignName + ", mStatus=" + this.mStatus + ", mMi3ReferenceId=" + this.mMi3ReferenceId + ", mRedeemDate=" + this.mRedeemDate + ", mExternalPartnerCode=" + this.mExternalPartnerCode + ", mVoucherType=" + this.mVoucherType + ", mAmount=" + this.mAmount + "}";
    }
}
