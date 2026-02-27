package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EkycAccountTypeHeaderAdapterItem extends C$AutoValue_EkycAccountTypeHeaderAdapterItem {
    public static final Parcelable.Creator<AutoValue_EkycAccountTypeHeaderAdapterItem> CREATOR = new Parcelable.Creator<AutoValue_EkycAccountTypeHeaderAdapterItem>() { // from class: com.paymaya.domain.model.AutoValue_EkycAccountTypeHeaderAdapterItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EkycAccountTypeHeaderAdapterItem createFromParcel(Parcel parcel) {
            return new AutoValue_EkycAccountTypeHeaderAdapterItem(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EkycAccountTypeHeaderAdapterItem[] newArray(int i) {
            return new AutoValue_EkycAccountTypeHeaderAdapterItem[i];
        }
    };

    public AutoValue_EkycAccountTypeHeaderAdapterItem(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mHeaderType());
    }
}
