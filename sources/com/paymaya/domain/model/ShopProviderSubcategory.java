package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopProviderSubcategory implements Parcelable {
    public static final Parcelable.Creator<ShopProviderSubcategory> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("priority")
    private final Integer priority;

    @InterfaceC1497a
    @InterfaceC1498b("provider_name")
    private String providerName;

    public static final class Creator implements Parcelable.Creator<ShopProviderSubcategory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderSubcategory createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopProviderSubcategory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderSubcategory[] newArray(int i) {
            return new ShopProviderSubcategory[i];
        }
    }

    public ShopProviderSubcategory(String str, String str2, String str3, String str4, Integer num) {
        this.providerName = str;
        this.id = str2;
        this.name = str3;
        this.code = str4;
        this.priority = num;
    }

    public static /* synthetic */ ShopProviderSubcategory copy$default(ShopProviderSubcategory shopProviderSubcategory, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopProviderSubcategory.providerName;
        }
        if ((i & 2) != 0) {
            str2 = shopProviderSubcategory.id;
        }
        if ((i & 4) != 0) {
            str3 = shopProviderSubcategory.name;
        }
        if ((i & 8) != 0) {
            str4 = shopProviderSubcategory.code;
        }
        if ((i & 16) != 0) {
            num = shopProviderSubcategory.priority;
        }
        Integer num2 = num;
        String str5 = str3;
        return shopProviderSubcategory.copy(str, str2, str5, str4, num2);
    }

    public final String component1() {
        return this.providerName;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.code;
    }

    public final Integer component5() {
        return this.priority;
    }

    public final ShopProviderSubcategory copy(String str, String str2, String str3, String str4, Integer num) {
        return new ShopProviderSubcategory(str, str2, str3, str4, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopProviderSubcategory)) {
            return false;
        }
        ShopProviderSubcategory shopProviderSubcategory = (ShopProviderSubcategory) obj;
        return j.b(this.providerName, shopProviderSubcategory.providerName) && j.b(this.id, shopProviderSubcategory.id) && j.b(this.name, shopProviderSubcategory.name) && j.b(this.code, shopProviderSubcategory.code) && j.b(this.priority, shopProviderSubcategory.priority);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public int hashCode() {
        String str = this.providerName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.code;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.priority;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isNotEmpty() {
        String str;
        String str2;
        String str3 = this.id;
        return str3 != null && str3.length() > 0 && (str = this.name) != null && str.length() > 0 && (str2 = this.code) != null && str2.length() > 0;
    }

    public final void setProviderName(String str) {
        this.providerName = str;
    }

    public String toString() {
        String str = this.providerName;
        String str2 = this.id;
        String str3 = this.name;
        String str4 = this.code;
        Integer num = this.priority;
        StringBuilder sbX = s.x("ShopProviderSubcategory(providerName=", str, ", id=", str2, ", name=");
        c.A(sbX, str3, ", code=", str4, ", priority=");
        sbX.append(num);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.providerName);
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.code);
        Integer num = this.priority;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
    }
}
