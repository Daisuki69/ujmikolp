package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerAccountOwner implements Parcelable {
    public static final Parcelable.Creator<CustomerAccountOwner> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("customer_id")
    private String customerId;

    @InterfaceC1497a
    @InterfaceC1498b("default")
    private boolean isDefault;

    public static final class Creator implements Parcelable.Creator<CustomerAccountOwner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccountOwner createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CustomerAccountOwner(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccountOwner[] newArray(int i) {
            return new CustomerAccountOwner[i];
        }
    }

    public CustomerAccountOwner(String customerId, boolean z4) {
        j.g(customerId, "customerId");
        this.customerId = customerId;
        this.isDefault = z4;
    }

    public static /* synthetic */ CustomerAccountOwner copy$default(CustomerAccountOwner customerAccountOwner, String str, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerAccountOwner.customerId;
        }
        if ((i & 2) != 0) {
            z4 = customerAccountOwner.isDefault;
        }
        return customerAccountOwner.copy(str, z4);
    }

    public final String component1() {
        return this.customerId;
    }

    public final boolean component2() {
        return this.isDefault;
    }

    public final CustomerAccountOwner copy(String customerId, boolean z4) {
        j.g(customerId, "customerId");
        return new CustomerAccountOwner(customerId, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerAccountOwner)) {
            return false;
        }
        CustomerAccountOwner customerAccountOwner = (CustomerAccountOwner) obj;
        return j.b(this.customerId, customerAccountOwner.customerId) && this.isDefault == customerAccountOwner.isDefault;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public int hashCode() {
        return (this.customerId.hashCode() * 31) + (this.isDefault ? 1231 : 1237);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final void setCustomerId(String str) {
        j.g(str, "<set-?>");
        this.customerId = str;
    }

    public final void setDefault(boolean z4) {
        this.isDefault = z4;
    }

    public String toString() {
        return "CustomerAccountOwner(customerId=" + this.customerId + ", isDefault=" + this.isDefault + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.customerId);
        dest.writeInt(this.isDefault ? 1 : 0);
    }

    public /* synthetic */ CustomerAccountOwner(String str, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z4);
    }
}
