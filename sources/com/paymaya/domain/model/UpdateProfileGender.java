package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateProfileGender implements Parcelable {
    public static final Parcelable.Creator<UpdateProfileGender> CREATOR = new Creator();
    private final String code;
    private final String name;

    public static final class Creator implements Parcelable.Creator<UpdateProfileGender> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileGender createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new UpdateProfileGender(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileGender[] newArray(int i) {
            return new UpdateProfileGender[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateProfileGender() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpdateProfileGender copy$default(UpdateProfileGender updateProfileGender, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateProfileGender.code;
        }
        if ((i & 2) != 0) {
            str2 = updateProfileGender.name;
        }
        return updateProfileGender.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final UpdateProfileGender copy(String str, String str2) {
        return new UpdateProfileGender(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProfileGender)) {
            return false;
        }
        UpdateProfileGender updateProfileGender = (UpdateProfileGender) obj;
        return j.b(this.code, updateProfileGender.code) && j.b(this.name, updateProfileGender.name);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("UpdateProfileGender(code=", this.code, ", name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
    }

    public UpdateProfileGender(String str, String str2) {
        this.code = str;
        this.name = str2;
    }

    public /* synthetic */ UpdateProfileGender(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
