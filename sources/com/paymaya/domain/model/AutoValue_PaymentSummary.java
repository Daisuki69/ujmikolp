package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PaymentSummary extends C$AutoValue_PaymentSummary {
    public static final Parcelable.Creator<AutoValue_PaymentSummary> CREATOR = new Parcelable.Creator<AutoValue_PaymentSummary>() { // from class: com.paymaya.domain.model.AutoValue_PaymentSummary.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PaymentSummary createFromParcel(Parcel parcel) {
            String string;
            String string2;
            String str;
            String str2;
            String str3;
            if (parcel.readInt() == 0) {
                string = parcel.readString();
                string2 = null;
            } else {
                string = null;
                string2 = null;
            }
            String string3 = parcel.readString();
            String string4 = parcel.readInt() == 0 ? parcel.readString() : string2;
            String string5 = parcel.readInt() == 0 ? parcel.readString() : string2;
            if (parcel.readInt() == 0) {
                string2 = parcel.readString();
            }
            HashMap hashMap = parcel.readHashMap(PaymentSummary.class.getClassLoader());
            boolean z4 = false;
            boolean z5 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                String str4 = string5;
                str = string2;
                str2 = string4;
                str3 = str4;
                z4 = true;
            } else {
                String str5 = string5;
                str = string2;
                str2 = string4;
                str3 = str5;
            }
            return new AutoValue_PaymentSummary(string, string3, str2, str3, str, hashMap, z5, z4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PaymentSummary[] newArray(int i) {
            return new AutoValue_PaymentSummary[i];
        }
    };

    public AutoValue_PaymentSummary(@Nullable String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map, boolean z4, boolean z5) {
        super(str, str2, str3, str4, str5, map, z4, z5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (mFundSourceId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mFundSourceId());
        }
        parcel.writeString(mProductId());
        if (mRecipient() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRecipient());
        }
        if (mMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMessage());
        }
        if (mTargetNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTargetNumber());
        }
        parcel.writeMap(mOtherFields());
        parcel.writeInt(mIsIncludeSignatureEnabled() ? 1 : 0);
        parcel.writeInt(mIsGifted() ? 1 : 0);
    }
}
