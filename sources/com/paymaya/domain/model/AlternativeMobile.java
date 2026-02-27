package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class AlternativeMobile implements Parcelable {
    public static final Parcelable.Creator<AlternativeMobile> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("mobileNumber")
    private String mobileNumber;

    public static final class Creator implements Parcelable.Creator<AlternativeMobile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlternativeMobile createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new AlternativeMobile(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlternativeMobile[] newArray(int i) {
            return new AlternativeMobile[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlternativeMobile() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AlternativeMobile copy$default(AlternativeMobile alternativeMobile, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alternativeMobile.mobileNumber;
        }
        return alternativeMobile.copy(str);
    }

    public final String component1() {
        return this.mobileNumber;
    }

    public final AlternativeMobile copy(String str) {
        return new AlternativeMobile(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlternativeMobile) && j.b(this.mobileNumber, ((AlternativeMobile) obj).mobileNumber);
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public int hashCode() {
        String str = this.mobileNumber;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public String toString() {
        return s.j("AlternativeMobile(mobileNumber=", this.mobileNumber, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.mobileNumber);
    }

    public AlternativeMobile(String str) {
        this.mobileNumber = str;
    }

    public /* synthetic */ AlternativeMobile(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
