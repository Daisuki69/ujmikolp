package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountUsage implements Parcelable {
    public static final Parcelable.Creator<AccountUsage> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("requires_details")
    private final boolean requiresDetails;

    public static final class Creator implements Parcelable.Creator<AccountUsage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountUsage createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new AccountUsage(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountUsage[] newArray(int i) {
            return new AccountUsage[i];
        }
    }

    public AccountUsage(String name, boolean z4) {
        j.g(name, "name");
        this.name = name;
        this.requiresDetails = z4;
    }

    public static /* synthetic */ AccountUsage copy$default(AccountUsage accountUsage, String str, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountUsage.name;
        }
        if ((i & 2) != 0) {
            z4 = accountUsage.requiresDetails;
        }
        return accountUsage.copy(str, z4);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.requiresDetails;
    }

    public final AccountUsage copy(String name, boolean z4) {
        j.g(name, "name");
        return new AccountUsage(name, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUsage)) {
            return false;
        }
        AccountUsage accountUsage = (AccountUsage) obj;
        return j.b(this.name, accountUsage.name) && this.requiresDetails == accountUsage.requiresDetails;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getRequiresDetails() {
        return this.requiresDetails;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.requiresDetails ? 1231 : 1237);
    }

    public String toString() {
        return "AccountUsage(name=" + this.name + ", requiresDetails=" + this.requiresDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeInt(this.requiresDetails ? 1 : 0);
    }
}
