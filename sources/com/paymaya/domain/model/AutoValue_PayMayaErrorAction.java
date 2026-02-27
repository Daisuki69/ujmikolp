package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PayMayaErrorAction extends C$AutoValue_PayMayaErrorAction {
    public static final Parcelable.Creator<AutoValue_PayMayaErrorAction> CREATOR = new Parcelable.Creator<AutoValue_PayMayaErrorAction>() { // from class: com.paymaya.domain.model.AutoValue_PayMayaErrorAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PayMayaErrorAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf = null;
            }
            return new AutoValue_PayMayaErrorAction(string, string2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PayMayaErrorAction[] newArray(int i) {
            return new AutoValue_PayMayaErrorAction[i];
        }
    };

    public AutoValue_PayMayaErrorAction(String str, String str2, Boolean bool) {
        super(str, str2, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mTitle());
        parcel.writeString(mUrl());
        if (isExternal() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(isExternal().booleanValue() ? 1 : 0);
        }
    }
}
