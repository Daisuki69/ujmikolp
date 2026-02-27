package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_PayId;
import com.paymaya.domain.model.C$AutoValue_PayId;
import g3.InterfaceC1498b;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PayId implements Parcelable {

    public static abstract class Builder {
        public abstract PayId build();

        public abstract Builder mAmount(BigDecimal bigDecimal);

        public abstract Builder mExpiryDate(String str);

        public abstract Builder mFee(String str);

        public abstract Builder mMerchantRef(String str);

        public abstract Builder mOriginalAmount(String str);

        public abstract Builder mSevenConnectId(String str);

        public abstract Builder mTotalAmount(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_PayId.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_PayId.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("amount")
    public abstract BigDecimal mAmount();

    @InterfaceC1498b("expiry_date")
    public abstract String mExpiryDate();

    @Nullable
    @InterfaceC1498b("fee")
    public abstract String mFee();

    @InterfaceC1498b("merchant_ref")
    public abstract String mMerchantRef();

    @Nullable
    @InterfaceC1498b("original_amount")
    public abstract String mOriginalAmount();

    @InterfaceC1498b("seven_connect_id")
    public abstract String mSevenConnectId();

    @Nullable
    @InterfaceC1498b("total_amount")
    public abstract String mTotalAmount();

    public abstract Builder toBuilder();
}
