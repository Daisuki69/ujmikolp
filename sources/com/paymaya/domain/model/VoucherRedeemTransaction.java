package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_VoucherRedeemTransaction;
import com.paymaya.domain.model.C$AutoValue_VoucherRedeemTransaction;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VoucherRedeemTransaction implements Parcelable {

    public static abstract class Builder {
        public abstract VoucherRedeemTransaction build();

        public abstract Builder mAmount(double d10);

        public abstract Builder mCampaignName(String str);

        public abstract Builder mExternalPartnerCode(@Nullable String str);

        public abstract Builder mMi3ReferenceId(@Nullable String str);

        public abstract Builder mRedeemDate(@Nullable String str);

        public abstract Builder mRedeemVoucherId(String str);

        public abstract Builder mStatus(String str);

        public abstract Builder mVoucherType(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_VoucherRedeemTransaction.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_VoucherRedeemTransaction.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("amount")
    public abstract double mAmount();

    @InterfaceC1498b(alternate = {"campaignName"}, value = "campaign_name")
    public abstract String mCampaignName();

    @Nullable
    @InterfaceC1498b("external_partner_code")
    public abstract String mExternalPartnerCode();

    @Nullable
    @InterfaceC1498b(alternate = {"mi3ReferenceId"}, value = "mi3_reference_id")
    public abstract String mMi3ReferenceId();

    @Nullable
    @InterfaceC1498b(alternate = {"redeemDate"}, value = "redeem_date")
    public abstract String mRedeemDate();

    @InterfaceC1498b(alternate = {"redeemVoucherId"}, value = "redeem_voucher_id")
    public abstract String mRedeemVoucherId();

    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b("voucher_type")
    public abstract String mVoucherType();
}
