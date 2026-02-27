package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopPurchaseOfficialReceipt implements Parcelable {
    public static final Parcelable.Creator<ShopPurchaseOfficialReceipt> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("location")
    private final String location;

    public static final class Creator implements Parcelable.Creator<ShopPurchaseOfficialReceipt> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopPurchaseOfficialReceipt createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopPurchaseOfficialReceipt(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopPurchaseOfficialReceipt[] newArray(int i) {
            return new ShopPurchaseOfficialReceipt[i];
        }
    }

    public ShopPurchaseOfficialReceipt(String location) {
        j.g(location, "location");
        this.location = location;
    }

    public static /* synthetic */ ShopPurchaseOfficialReceipt copy$default(ShopPurchaseOfficialReceipt shopPurchaseOfficialReceipt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopPurchaseOfficialReceipt.location;
        }
        return shopPurchaseOfficialReceipt.copy(str);
    }

    public final String component1() {
        return this.location;
    }

    public final ShopPurchaseOfficialReceipt copy(String location) {
        j.g(location, "location");
        return new ShopPurchaseOfficialReceipt(location);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopPurchaseOfficialReceipt) && j.b(this.location, ((ShopPurchaseOfficialReceipt) obj).location);
    }

    public final String getLocation() {
        return this.location;
    }

    public int hashCode() {
        return this.location.hashCode();
    }

    public String toString() {
        return s.j("ShopPurchaseOfficialReceipt(location=", this.location, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.location);
    }
}
