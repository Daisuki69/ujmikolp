package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileTin implements Parcelable {
    public static final Parcelable.Creator<ProfileTin> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("number")
    private String number;

    public static final class Creator implements Parcelable.Creator<ProfileTin> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileTin createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ProfileTin(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileTin[] newArray(int i) {
            return new ProfileTin[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileTin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ProfileTin copy$default(ProfileTin profileTin, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileTin.number;
        }
        return profileTin.copy(str);
    }

    public final String component1() {
        return this.number;
    }

    public final ProfileTin copy(String str) {
        return new ProfileTin(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileTin) && j.b(this.number, ((ProfileTin) obj).number);
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        String str = this.number;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public String toString() {
        return s.j("ProfileTin(number=", this.number, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.number);
    }

    public ProfileTin(String str) {
        this.number = str;
    }

    public /* synthetic */ ProfileTin(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
