package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerAccountStatus implements Parcelable {
    public static final Parcelable.Creator<CustomerAccountStatus> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private String value;

    public static final class Creator implements Parcelable.Creator<CustomerAccountStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccountStatus createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CustomerAccountStatus(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccountStatus[] newArray(int i) {
            return new CustomerAccountStatus[i];
        }
    }

    public CustomerAccountStatus(String value) {
        j.g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ CustomerAccountStatus copy$default(CustomerAccountStatus customerAccountStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerAccountStatus.value;
        }
        return customerAccountStatus.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final CustomerAccountStatus copy(String value) {
        j.g(value, "value");
        return new CustomerAccountStatus(value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomerAccountStatus) && j.b(this.value, ((CustomerAccountStatus) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final void setValue(String str) {
        j.g(str, "<set-?>");
        this.value = str;
    }

    public String toString() {
        return s.j("CustomerAccountStatus(value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.value);
    }
}
