package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerAccessToken implements Parcelable {
    public static final Parcelable.Creator<CustomerAccessToken> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(MPDbAdapter.KEY_TOKEN)
    private String token;

    public static final class Creator implements Parcelable.Creator<CustomerAccessToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccessToken createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CustomerAccessToken(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccessToken[] newArray(int i) {
            return new CustomerAccessToken[i];
        }
    }

    public CustomerAccessToken(String token) {
        j.g(token, "token");
        this.token = token;
    }

    public static /* synthetic */ CustomerAccessToken copy$default(CustomerAccessToken customerAccessToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerAccessToken.token;
        }
        return customerAccessToken.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final CustomerAccessToken copy(String token) {
        j.g(token, "token");
        return new CustomerAccessToken(token);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomerAccessToken) && j.b(this.token, ((CustomerAccessToken) obj).token);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public final void setToken(String str) {
        j.g(str, "<set-?>");
        this.token = str;
    }

    public String toString() {
        return s.j("CustomerAccessToken(token=", this.token, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.token);
    }
}
