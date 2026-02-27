package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_QRBankTransferRecipient extends C$AutoValue_QRBankTransferRecipient {
    public static final Parcelable.Creator<AutoValue_QRBankTransferRecipient> CREATOR = new Parcelable.Creator<AutoValue_QRBankTransferRecipient>() { // from class: com.paymaya.domain.model.AutoValue_QRBankTransferRecipient.1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public AutoValue_QRBankTransferRecipient createFromParcel(Parcel parcel) {
            String string;
            String string2;
            if (parcel.readInt() == 0) {
                string = parcel.readString();
                string2 = null;
            } else {
                string = null;
                string2 = null;
            }
            String string3 = parcel.readString();
            String string4 = parcel.readInt() == 0 ? parcel.readString() : string2;
            Object objValueOf = parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : string2;
            if (parcel.readInt() == 0) {
                string2 = parcel.readString();
            }
            return new AutoValue_QRBankTransferRecipient(string, string3, string4, objValueOf, string2, (QRPHAdditionalData) parcel.readParcelable(QRBankTransferRecipient.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_QRBankTransferRecipient[] newArray(int i) {
            return new AutoValue_QRBankTransferRecipient[i];
        }
    };

    public AutoValue_QRBankTransferRecipient(@Nullable String str, String str2, @Nullable String str3, @Nullable Double d10, @Nullable String str4, @Nullable QRPHAdditionalData qRPHAdditionalData) {
        super(str, str2, str3, d10, str4, qRPHAdditionalData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (mBankName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBankName());
        }
        parcel.writeString(mAccountNumber());
        if (mAccountName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAccountName());
        }
        if (mAmount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(mAmount().doubleValue());
        }
        if (mBankBic() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBankBic());
        }
        parcel.writeParcelable(mQRPHAdditionalData(), i);
    }
}
