package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RegulatoryProfileCMSMeta implements Parcelable {
    public static final Parcelable.Creator<RegulatoryProfileCMSMeta> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RegulatoryProfileCMSMeta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegulatoryProfileCMSMeta createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            parcel.readInt();
            return new RegulatoryProfileCMSMeta();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegulatoryProfileCMSMeta[] newArray(int i) {
            return new RegulatoryProfileCMSMeta[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(1);
    }
}
