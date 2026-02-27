package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OrderV2 implements Parcelable {
    public static final Parcelable.Creator<OrderV2> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("created_date")
    private final String createdDate;

    @InterfaceC1497a
    @InterfaceC1498b("customer")
    private final String customer;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("items")
    private final List<OrderV2Items> items;

    @InterfaceC1497a
    @InterfaceC1498b("payment_id")
    private String paymentId;

    @InterfaceC1497a
    @InterfaceC1498b("payment_method_redirect_url")
    private final String paymentMethodRedirectUrl;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    @InterfaceC1497a
    @InterfaceC1498b("total_amount")
    private final Amount totalAmount;

    @InterfaceC1497a
    @InterfaceC1498b("updated_date")
    private final String updatedDate;

    public static final class Creator implements Parcelable.Creator<OrderV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderV2 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(OrderV2Items.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new OrderV2(string, string2, arrayList, (Amount) parcel.readParcelable(OrderV2.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderV2[] newArray(int i) {
            return new OrderV2[i];
        }
    }

    public OrderV2(String id, String customer, List<OrderV2Items> list, Amount totalAmount, String status, String createdDate, String updatedDate, String str, String str2) {
        j.g(id, "id");
        j.g(customer, "customer");
        j.g(totalAmount, "totalAmount");
        j.g(status, "status");
        j.g(createdDate, "createdDate");
        j.g(updatedDate, "updatedDate");
        this.id = id;
        this.customer = customer;
        this.items = list;
        this.totalAmount = totalAmount;
        this.status = status;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.paymentId = str;
        this.paymentMethodRedirectUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderV2 copy$default(OrderV2 orderV2, String str, String str2, List list, Amount amount, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderV2.id;
        }
        if ((i & 2) != 0) {
            str2 = orderV2.customer;
        }
        if ((i & 4) != 0) {
            list = orderV2.items;
        }
        if ((i & 8) != 0) {
            amount = orderV2.totalAmount;
        }
        if ((i & 16) != 0) {
            str3 = orderV2.status;
        }
        if ((i & 32) != 0) {
            str4 = orderV2.createdDate;
        }
        if ((i & 64) != 0) {
            str5 = orderV2.updatedDate;
        }
        if ((i & 128) != 0) {
            str6 = orderV2.paymentId;
        }
        if ((i & 256) != 0) {
            str7 = orderV2.paymentMethodRedirectUrl;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        List list2 = list;
        return orderV2.copy(str, str2, list2, amount, str12, str10, str11, str8, str9);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.customer;
    }

    public final List<OrderV2Items> component3() {
        return this.items;
    }

    public final Amount component4() {
        return this.totalAmount;
    }

    public final String component5() {
        return this.status;
    }

    public final String component6() {
        return this.createdDate;
    }

    public final String component7() {
        return this.updatedDate;
    }

    public final String component8() {
        return this.paymentId;
    }

    public final String component9() {
        return this.paymentMethodRedirectUrl;
    }

    public final OrderV2 copy(String id, String customer, List<OrderV2Items> list, Amount totalAmount, String status, String createdDate, String updatedDate, String str, String str2) {
        j.g(id, "id");
        j.g(customer, "customer");
        j.g(totalAmount, "totalAmount");
        j.g(status, "status");
        j.g(createdDate, "createdDate");
        j.g(updatedDate, "updatedDate");
        return new OrderV2(id, customer, list, totalAmount, status, createdDate, updatedDate, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV2)) {
            return false;
        }
        OrderV2 orderV2 = (OrderV2) obj;
        return j.b(this.id, orderV2.id) && j.b(this.customer, orderV2.customer) && j.b(this.items, orderV2.items) && j.b(this.totalAmount, orderV2.totalAmount) && j.b(this.status, orderV2.status) && j.b(this.createdDate, orderV2.createdDate) && j.b(this.updatedDate, orderV2.updatedDate) && j.b(this.paymentId, orderV2.paymentId) && j.b(this.paymentMethodRedirectUrl, orderV2.paymentMethodRedirectUrl);
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final String getId() {
        return this.id;
    }

    public final List<OrderV2Items> getItems() {
        return this.items;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentMethodRedirectUrl() {
        return this.paymentMethodRedirectUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(this.id.hashCode() * 31, 31, this.customer);
        List<OrderV2Items> list = this.items;
        int iC2 = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c((this.totalAmount.hashCode() + ((iC + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.status), 31, this.createdDate), 31, this.updatedDate);
        String str = this.paymentId;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentMethodRedirectUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPaymentId(String str) {
        this.paymentId = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.customer;
        List<OrderV2Items> list = this.items;
        Amount amount = this.totalAmount;
        String str3 = this.status;
        String str4 = this.createdDate;
        String str5 = this.updatedDate;
        String str6 = this.paymentId;
        String str7 = this.paymentMethodRedirectUrl;
        StringBuilder sbX = s.x("OrderV2(id=", str, ", customer=", str2, ", items=");
        sbX.append(list);
        sbX.append(", totalAmount=");
        sbX.append(amount);
        sbX.append(", status=");
        c.A(sbX, str3, ", createdDate=", str4, ", updatedDate=");
        c.A(sbX, str5, ", paymentId=", str6, ", paymentMethodRedirectUrl=");
        return s.p(sbX, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.customer);
        List<OrderV2Items> list = this.items;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((OrderV2Items) itP.next()).writeToParcel(dest, i);
            }
        }
        dest.writeParcelable(this.totalAmount, i);
        dest.writeString(this.status);
        dest.writeString(this.createdDate);
        dest.writeString(this.updatedDate);
        dest.writeString(this.paymentId);
        dest.writeString(this.paymentMethodRedirectUrl);
    }

    public /* synthetic */ OrderV2(String str, String str2, List list, Amount amount, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, amount, str3, str4, str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }
}
