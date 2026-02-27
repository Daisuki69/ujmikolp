package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.C$AutoValue_QRBankTransferRecipient;

/* JADX INFO: loaded from: classes4.dex */
public abstract class QRBankTransferRecipient implements Parcelable {

    public static abstract class Builder {
        public abstract QRBankTransferRecipient build();

        public abstract Builder mAccountName(String str);

        public abstract Builder mAccountNumber(String str);

        public abstract Builder mAmount(Double d10);

        public abstract Builder mBankBic(String str);

        public abstract Builder mBankName(String str);

        public abstract Builder mQRPHAdditionalData(QRPHAdditionalData qRPHAdditionalData);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_QRBankTransferRecipient.Builder();
    }

    @Nullable
    public abstract String mAccountName();

    public abstract String mAccountNumber();

    @Nullable
    public abstract Double mAmount();

    @Nullable
    public abstract String mBankBic();

    @Nullable
    public abstract String mBankName();

    @Nullable
    public abstract QRPHAdditionalData mQRPHAdditionalData();

    public abstract Builder toBuilder();
}
