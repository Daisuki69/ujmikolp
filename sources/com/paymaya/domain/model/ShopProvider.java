package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import com.paymaya.domain.model.ShopProviderListItem;
import com.paymaya.domain.model.ShopV3ProvidersCollectionItem;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopProvider implements Parcelable, ShopHomeCarouselListItem, ShopProviderListItem, ShopV3ProvidersCollectionItem {
    public static final Parcelable.Creator<ShopProvider> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("background_url")
    private final String backgroundUrl;

    @InterfaceC1497a
    @InterfaceC1498b("categories")
    private final List<ShopProviderCategory> categories;

    @InterfaceC1497a
    @InterfaceC1498b(MPDbAdapter.KEY_CREATED_AT)
    private final String createdAt;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("details")
    private final Details details;

    @InterfaceC1497a
    @InterfaceC1498b("display_name")
    private final String displayName;

    @InterfaceC1497a
    @InterfaceC1498b("icon_url")
    private final String iconUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("logo_url")
    private final String logoUrl;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("priority")
    private final Integer priority;

    @InterfaceC1497a
    @InterfaceC1498b("updated_at")
    private final String updatedAt;

    public static final class Creator implements Parcelable.Creator<ShopProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProvider createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Details details = (Details) parcel.readParcelable(ShopProvider.class.getClassLoader());
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(ShopProviderCategory.CREATOR, parcel, arrayList, I4, 1);
                }
            }
            return new ShopProvider(string, string2, string3, string4, details, numValueOf, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProvider[] newArray(int i) {
            return new ShopProvider[i];
        }
    }

    public ShopProvider(String id, String name, String displayName, String description, Details details, Integer num, List<ShopProviderCategory> list, String createdAt, String updatedAt, String str, String str2, String str3) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(displayName, "displayName");
        j.g(description, "description");
        j.g(createdAt, "createdAt");
        j.g(updatedAt, "updatedAt");
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.details = details;
        this.priority = num;
        this.categories = list;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.logoUrl = str;
        this.iconUrl = str2;
        this.backgroundUrl = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopProvider copy$default(ShopProvider shopProvider, String str, String str2, String str3, String str4, Details details, Integer num, List list, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopProvider.id;
        }
        if ((i & 2) != 0) {
            str2 = shopProvider.name;
        }
        if ((i & 4) != 0) {
            str3 = shopProvider.displayName;
        }
        if ((i & 8) != 0) {
            str4 = shopProvider.description;
        }
        if ((i & 16) != 0) {
            details = shopProvider.details;
        }
        if ((i & 32) != 0) {
            num = shopProvider.priority;
        }
        if ((i & 64) != 0) {
            list = shopProvider.categories;
        }
        if ((i & 128) != 0) {
            str5 = shopProvider.createdAt;
        }
        if ((i & 256) != 0) {
            str6 = shopProvider.updatedAt;
        }
        if ((i & 512) != 0) {
            str7 = shopProvider.logoUrl;
        }
        if ((i & 1024) != 0) {
            str8 = shopProvider.iconUrl;
        }
        if ((i & 2048) != 0) {
            str9 = shopProvider.backgroundUrl;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        List list2 = list;
        String str14 = str5;
        Details details2 = details;
        Integer num2 = num;
        return shopProvider.copy(str, str2, str3, str4, details2, num2, list2, str14, str12, str13, str10, str11);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.logoUrl;
    }

    public final String component11() {
        return this.iconUrl;
    }

    public final String component12() {
        return this.backgroundUrl;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.displayName;
    }

    public final String component4() {
        return this.description;
    }

    public final Details component5() {
        return this.details;
    }

    public final Integer component6() {
        return this.priority;
    }

    public final List<ShopProviderCategory> component7() {
        return this.categories;
    }

    public final String component8() {
        return this.createdAt;
    }

    public final String component9() {
        return this.updatedAt;
    }

    public final ShopProvider copy(String id, String name, String displayName, String description, Details details, Integer num, List<ShopProviderCategory> list, String createdAt, String updatedAt, String str, String str2, String str3) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(displayName, "displayName");
        j.g(description, "description");
        j.g(createdAt, "createdAt");
        j.g(updatedAt, "updatedAt");
        return new ShopProvider(id, name, displayName, description, details, num, list, createdAt, updatedAt, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopProvider)) {
            return false;
        }
        ShopProvider shopProvider = (ShopProvider) obj;
        return j.b(this.id, shopProvider.id) && j.b(this.name, shopProvider.name) && j.b(this.displayName, shopProvider.displayName) && j.b(this.description, shopProvider.description) && j.b(this.details, shopProvider.details) && j.b(this.priority, shopProvider.priority) && j.b(this.categories, shopProvider.categories) && j.b(this.createdAt, shopProvider.createdAt) && j.b(this.updatedAt, shopProvider.updatedAt) && j.b(this.logoUrl, shopProvider.logoUrl) && j.b(this.iconUrl, shopProvider.iconUrl) && j.b(this.backgroundUrl, shopProvider.backgroundUrl);
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final List<ShopProviderCategory> getCategories() {
        return this.categories;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Details getDetails() {
        return this.details;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override // com.paymaya.domain.model.ShopProviderListItem
    public ShopProviderListItem.VIEW_TYPE getViewType() {
        return ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_PROVIDER;
    }

    @Override // com.paymaya.domain.model.ShopV3ProvidersCollectionItem
    public ShopV3ProvidersCollectionItem.ViewType getViewTypeProvidersCollectionItem() {
        return ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_PROVIDER;
    }

    @Override // com.paymaya.domain.model.ShopHomeCarouselListItem
    public ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM getViewTypeShopHomeCarouselItem() {
        return ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_PROVIDER_LOGO;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.id.hashCode() * 31, 31, this.name), 31, this.displayName), 31, this.description);
        Details details = this.details;
        int iHashCode = (iC + (details == null ? 0 : details.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<ShopProviderCategory> list = this.categories;
        int iC2 = AbstractC1414e.c(AbstractC1414e.c((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.createdAt), 31, this.updatedAt);
        String str = this.logoUrl;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundUrl;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.displayName;
        String str4 = this.description;
        Details details = this.details;
        Integer num = this.priority;
        List<ShopProviderCategory> list = this.categories;
        String str5 = this.createdAt;
        String str6 = this.updatedAt;
        String str7 = this.logoUrl;
        String str8 = this.iconUrl;
        String str9 = this.backgroundUrl;
        StringBuilder sbX = s.x("ShopProvider(id=", str, ", name=", str2, ", displayName=");
        c.A(sbX, str3, ", description=", str4, ", details=");
        sbX.append(details);
        sbX.append(", priority=");
        sbX.append(num);
        sbX.append(", categories=");
        sbX.append(list);
        sbX.append(", createdAt=");
        sbX.append(str5);
        sbX.append(", updatedAt=");
        c.A(sbX, str6, ", logoUrl=", str7, ", iconUrl=");
        return a.p(sbX, str8, ", backgroundUrl=", str9, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.displayName);
        dest.writeString(this.description);
        dest.writeParcelable(this.details, i);
        Integer num = this.priority;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        List<ShopProviderCategory> list = this.categories;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((ShopProviderCategory) itP.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeString(this.logoUrl);
        dest.writeString(this.iconUrl);
        dest.writeString(this.backgroundUrl);
    }

    public /* synthetic */ ShopProvider(String str, String str2, String str3, String str4, Details details, Integer num, List list, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : details, (i & 32) != 0 ? 0 : num, (i & 64) != 0 ? null : list, str5, str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9);
    }
}
