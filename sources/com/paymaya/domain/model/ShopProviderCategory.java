package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopProviderCategory implements Parcelable {
    public static final Parcelable.Creator<ShopProviderCategory> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("priority")
    private final Integer priority;

    public static final class Creator implements Parcelable.Creator<ShopProviderCategory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderCategory createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopProviderCategory(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderCategory[] newArray(int i) {
            return new ShopProviderCategory[i];
        }
    }

    public ShopProviderCategory(Integer num, String str, String str2, Integer num2) {
        this.id = num;
        this.name = str;
        this.code = str2;
        this.priority = num2;
    }

    public static /* synthetic */ ShopProviderCategory copy$default(ShopProviderCategory shopProviderCategory, Integer num, String str, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shopProviderCategory.id;
        }
        if ((i & 2) != 0) {
            str = shopProviderCategory.name;
        }
        if ((i & 4) != 0) {
            str2 = shopProviderCategory.code;
        }
        if ((i & 8) != 0) {
            num2 = shopProviderCategory.priority;
        }
        return shopProviderCategory.copy(num, str, str2, num2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.code;
    }

    public final Integer component4() {
        return this.priority;
    }

    public final ShopProviderCategory copy(Integer num, String str, String str2, Integer num2) {
        return new ShopProviderCategory(num, str, str2, num2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopProviderCategory)) {
            return false;
        }
        ShopProviderCategory shopProviderCategory = (ShopProviderCategory) obj;
        return j.b(this.id, shopProviderCategory.id) && j.b(this.name, shopProviderCategory.name) && j.b(this.code, shopProviderCategory.code) && j.b(this.priority, shopProviderCategory.priority);
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.priority;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.name;
        String str2 = this.code;
        Integer num2 = this.priority;
        StringBuilder sbO = AbstractC1213b.O(num, "ShopProviderCategory(id=", ", name=", str, ", code=");
        sbO.append(str2);
        sbO.append(", priority=");
        sbO.append(num2);
        sbO.append(")");
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.name);
        dest.writeString(this.code);
        Integer num2 = this.priority;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num2);
        }
    }
}
