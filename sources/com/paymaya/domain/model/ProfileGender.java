package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileGender implements Parcelable {
    public static final Parcelable.Creator<ProfileGender> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("sex")
    private String genderCode;

    public static final class Creator implements Parcelable.Creator<ProfileGender> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileGender createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ProfileGender(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileGender[] newArray(int i) {
            return new ProfileGender[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileGender() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ProfileGender copy$default(ProfileGender profileGender, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileGender.genderCode;
        }
        return profileGender.copy(str);
    }

    public final String component1() {
        return this.genderCode;
    }

    public final ProfileGender copy(String str) {
        return new ProfileGender(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileGender) && j.b(this.genderCode, ((ProfileGender) obj).genderCode);
    }

    public final String getGenderCode() {
        return this.genderCode;
    }

    public int hashCode() {
        String str = this.genderCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setGenderCode(String str) {
        this.genderCode = str;
    }

    public String toString() {
        return s.j("ProfileGender(genderCode=", this.genderCode, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.genderCode);
    }

    public ProfileGender(String str) {
        this.genderCode = str;
    }

    public /* synthetic */ ProfileGender(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
