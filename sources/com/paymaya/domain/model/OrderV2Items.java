package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OrderV2Items implements Parcelable {
    public static final Parcelable.Creator<OrderV2Items> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("product_code")
    private final String productCode;

    @InterfaceC1497a
    @InterfaceC1498b("product_description")
    private final String productDescription;

    @InterfaceC1497a
    @InterfaceC1498b("product_id")
    private final String productId;

    @InterfaceC1497a
    @InterfaceC1498b("product_name")
    private final String productName;

    @InterfaceC1497a
    @InterfaceC1498b("provider_name")
    private final String providerName;

    @InterfaceC1497a
    @InterfaceC1498b("quantity")
    private final int quantity;

    @InterfaceC1497a
    @InterfaceC1498b("recipient")
    private final String recipient;

    @InterfaceC1497a
    @InterfaceC1498b("remarks")
    private final String remarks;

    @InterfaceC1497a
    @InterfaceC1498b("unit_price")
    private final Amount unitPrice;

    public static final class Creator implements Parcelable.Creator<OrderV2Items> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderV2Items createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new OrderV2Items(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(OrderV2Items.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderV2Items[] newArray(int i) {
            return new OrderV2Items[i];
        }
    }

    public OrderV2Items(String productId, int i, String recipient, String remarks, String productName, String productCode, String productDescription, Amount unitPrice, String providerName) {
        j.g(productId, "productId");
        j.g(recipient, "recipient");
        j.g(remarks, "remarks");
        j.g(productName, "productName");
        j.g(productCode, "productCode");
        j.g(productDescription, "productDescription");
        j.g(unitPrice, "unitPrice");
        j.g(providerName, "providerName");
        this.productId = productId;
        this.quantity = i;
        this.recipient = recipient;
        this.remarks = remarks;
        this.productName = productName;
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.unitPrice = unitPrice;
        this.providerName = providerName;
    }

    public static /* synthetic */ OrderV2Items copy$default(OrderV2Items orderV2Items, String str, int i, String str2, String str3, String str4, String str5, String str6, Amount amount, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = orderV2Items.productId;
        }
        if ((i4 & 2) != 0) {
            i = orderV2Items.quantity;
        }
        if ((i4 & 4) != 0) {
            str2 = orderV2Items.recipient;
        }
        if ((i4 & 8) != 0) {
            str3 = orderV2Items.remarks;
        }
        if ((i4 & 16) != 0) {
            str4 = orderV2Items.productName;
        }
        if ((i4 & 32) != 0) {
            str5 = orderV2Items.productCode;
        }
        if ((i4 & 64) != 0) {
            str6 = orderV2Items.productDescription;
        }
        if ((i4 & 128) != 0) {
            amount = orderV2Items.unitPrice;
        }
        if ((i4 & 256) != 0) {
            str7 = orderV2Items.providerName;
        }
        Amount amount2 = amount;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str2;
        return orderV2Items.copy(str, i, str12, str3, str11, str9, str10, amount2, str8);
    }

    public final String component1() {
        return this.productId;
    }

    public final int component2() {
        return this.quantity;
    }

    public final String component3() {
        return this.recipient;
    }

    public final String component4() {
        return this.remarks;
    }

    public final String component5() {
        return this.productName;
    }

    public final String component6() {
        return this.productCode;
    }

    public final String component7() {
        return this.productDescription;
    }

    public final Amount component8() {
        return this.unitPrice;
    }

    public final String component9() {
        return this.providerName;
    }

    public final OrderV2Items copy(String productId, int i, String recipient, String remarks, String productName, String productCode, String productDescription, Amount unitPrice, String providerName) {
        j.g(productId, "productId");
        j.g(recipient, "recipient");
        j.g(remarks, "remarks");
        j.g(productName, "productName");
        j.g(productCode, "productCode");
        j.g(productDescription, "productDescription");
        j.g(unitPrice, "unitPrice");
        j.g(providerName, "providerName");
        return new OrderV2Items(productId, i, recipient, remarks, productName, productCode, productDescription, unitPrice, providerName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV2Items)) {
            return false;
        }
        OrderV2Items orderV2Items = (OrderV2Items) obj;
        return j.b(this.productId, orderV2Items.productId) && this.quantity == orderV2Items.quantity && j.b(this.recipient, orderV2Items.recipient) && j.b(this.remarks, orderV2Items.remarks) && j.b(this.productName, orderV2Items.productName) && j.b(this.productCode, orderV2Items.productCode) && j.b(this.productDescription, orderV2Items.productDescription) && j.b(this.unitPrice, orderV2Items.unitPrice) && j.b(this.providerName, orderV2Items.providerName);
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductDescription() {
        return this.productDescription;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getRecipient() {
        return this.recipient;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final Amount getUnitPrice() {
        return this.unitPrice;
    }

    public int hashCode() {
        return this.providerName.hashCode() + ((this.unitPrice.hashCode() + AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(((this.productId.hashCode() * 31) + this.quantity) * 31, 31, this.recipient), 31, this.remarks), 31, this.productName), 31, this.productCode), 31, this.productDescription)) * 31);
    }

    public String toString() {
        String str = this.productId;
        int i = this.quantity;
        String str2 = this.recipient;
        String str3 = this.remarks;
        String str4 = this.productName;
        String str5 = this.productCode;
        String str6 = this.productDescription;
        Amount amount = this.unitPrice;
        String str7 = this.providerName;
        StringBuilder sbR = a.r(i, "OrderV2Items(productId=", str, ", quantity=", ", recipient=");
        c.A(sbR, str2, ", remarks=", str3, ", productName=");
        c.A(sbR, str4, ", productCode=", str5, ", productDescription=");
        sbR.append(str6);
        sbR.append(", unitPrice=");
        sbR.append(amount);
        sbR.append(", providerName=");
        return s.p(sbR, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.productId);
        dest.writeInt(this.quantity);
        dest.writeString(this.recipient);
        dest.writeString(this.remarks);
        dest.writeString(this.productName);
        dest.writeString(this.productCode);
        dest.writeString(this.productDescription);
        dest.writeParcelable(this.unitPrice, i);
        dest.writeString(this.providerName);
    }
}
