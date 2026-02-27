package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateProfileIncomeSource implements Parcelable {
    public static final Parcelable.Creator<UpdateProfileIncomeSource> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<UpdateProfileIncomeSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileIncomeSource createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new UpdateProfileIncomeSource(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileIncomeSource[] newArray(int i) {
            return new UpdateProfileIncomeSource[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateProfileIncomeSource() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpdateProfileIncomeSource copy$default(UpdateProfileIncomeSource updateProfileIncomeSource, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateProfileIncomeSource.code;
        }
        if ((i & 2) != 0) {
            str2 = updateProfileIncomeSource.name;
        }
        return updateProfileIncomeSource.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final UpdateProfileIncomeSource copy(String str, String str2) {
        return new UpdateProfileIncomeSource(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProfileIncomeSource)) {
            return false;
        }
        UpdateProfileIncomeSource updateProfileIncomeSource = (UpdateProfileIncomeSource) obj;
        return j.b(this.code, updateProfileIncomeSource.code) && j.b(this.name, updateProfileIncomeSource.name);
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
        return s.l("UpdateProfileIncomeSource(code=", this.code, ", name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
    }

    public UpdateProfileIncomeSource(String str, String str2) {
        this.code = str;
        this.name = str2;
    }

    public /* synthetic */ UpdateProfileIncomeSource(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
