package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_QRMerchant;
import com.paymaya.domain.model.C$AutoValue_QRMerchant;

/* JADX INFO: loaded from: classes4.dex */
public abstract class QRMerchant implements Parcelable {

    public static abstract class Builder {
        public abstract QRMerchant build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mMerchantId(String str);

        public abstract Builder mName(String str);

        public abstract Builder mPaymentId(String str);

        public abstract Builder mQrPayload(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_QRMerchant.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_QRMerchant.GsonTypeAdapter(jVar);
    }

    @Nullable
    public abstract Amount mAmount();

    @Nullable
    public abstract String mMerchantId();

    @Nullable
    public abstract String mName();

    @Nullable
    public abstract String mPaymentId();

    @Nullable
    public abstract String mQrPayload();

    @Nullable
    public abstract String mType();

    public abstract Builder toBuilder();
}
