package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import com.paymaya.domain.model.ShopSearchListItem;
import com.paymaya.domain.model.ShopV3ListItem;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProductV3 implements ShopHomeCarouselListItem, ShopSearchListItem, ShopV3ListItem, Parcelable {
    public static final Parcelable.Creator<ProductV3> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("discounted_amount")
    private Amount amountDiscounted;

    @InterfaceC1497a
    @InterfaceC1498b("original_amount")
    private Amount amountOriginal;

    @InterfaceC1497a
    @InterfaceC1498b("category")
    private String category;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private String description;

    @InterfaceC1497a
    @InterfaceC1498b("details")
    private Details details;

    @InterfaceC1497a
    @InterfaceC1498b("icon_url")
    private String iconUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private String id;

    @InterfaceC1497a
    @InterfaceC1498b("disabled")
    private boolean isDisabled;

    @InterfaceC1497a
    @InterfaceC1498b("promo")
    private boolean isPromo;
    private boolean isRecentlyPurchased;

    @InterfaceC1497a
    @InterfaceC1498b("logo_url")
    private String logoUrl;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;
    private int page;

    @InterfaceC1497a
    @InterfaceC1498b("priority")
    private Integer priority;

    @InterfaceC1497a
    @InterfaceC1498b("product_code")
    private String productCode;

    @InterfaceC1497a
    @InterfaceC1498b("provider_details")
    private ProductProviderDetails productProviderDetails;

    @InterfaceC1497a
    @InterfaceC1498b("product_type")
    private String productType;

    @InterfaceC1497a
    @InterfaceC1498b("provider")
    private String provider;

    @InterfaceC1497a
    @InterfaceC1498b("provider_display_name")
    private String providerDisplayName;

    @InterfaceC1497a
    @InterfaceC1498b("categories")
    private List<? extends ShopCategory> shopCategories;

    public static final class Creator implements Parcelable.Creator<ProductV3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductV3 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer num;
            Amount amount;
            boolean z4;
            Integer numValueOf;
            boolean z5;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Amount amount2 = (Amount) parcel.readParcelable(ProductV3.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i4 = 0; i4 != i; i4++) {
                    arrayList.add(parcel.readParcelable(ProductV3.class.getClassLoader()));
                }
            }
            String string5 = parcel.readString();
            ArrayList arrayList2 = arrayList;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Amount amount3 = (Amount) parcel.readParcelable(ProductV3.class.getClassLoader());
            if (parcel.readInt() != 0) {
                num = null;
                amount = amount3;
                z4 = true;
            } else {
                num = null;
                amount = amount3;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                numValueOf = num;
                z5 = true;
            } else {
                numValueOf = num;
                z5 = false;
            }
            Details details = (Details) parcel.readParcelable(ProductV3.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ProductV3(string, string2, amount2, string3, string4, arrayList2, string5, string6, string7, string8, string9, amount, z4, z5, details, numValueOf, (ProductProviderDetails) parcel.readParcelable(ProductV3.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductV3[] newArray(int i) {
            return new ProductV3[i];
        }
    }

    public ProductV3(String id, String name, Amount amountOriginal, String str, String str2, List<? extends ShopCategory> list, String str3, String str4, String str5, String str6, String str7, Amount amount, boolean z4, boolean z5, Details details, Integer num, ProductProviderDetails productProviderDetails, String str8, int i, boolean z8) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(amountOriginal, "amountOriginal");
        this.id = id;
        this.name = name;
        this.amountOriginal = amountOriginal;
        this.productType = str;
        this.provider = str2;
        this.shopCategories = list;
        this.category = str3;
        this.logoUrl = str4;
        this.iconUrl = str5;
        this.description = str6;
        this.productCode = str7;
        this.amountDiscounted = amount;
        this.isPromo = z4;
        this.isDisabled = z5;
        this.details = details;
        this.priority = num;
        this.productProviderDetails = productProviderDetails;
        this.providerDisplayName = str8;
        this.page = i;
        this.isRecentlyPurchased = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductV3 copy$default(ProductV3 productV3, String str, String str2, Amount amount, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, Amount amount2, boolean z4, boolean z5, Details details, Integer num, ProductProviderDetails productProviderDetails, String str10, int i, boolean z8, int i4, Object obj) {
        boolean z9;
        int i6;
        String str11 = (i4 & 1) != 0 ? productV3.id : str;
        String str12 = (i4 & 2) != 0 ? productV3.name : str2;
        Amount amount3 = (i4 & 4) != 0 ? productV3.amountOriginal : amount;
        String str13 = (i4 & 8) != 0 ? productV3.productType : str3;
        String str14 = (i4 & 16) != 0 ? productV3.provider : str4;
        List list2 = (i4 & 32) != 0 ? productV3.shopCategories : list;
        String str15 = (i4 & 64) != 0 ? productV3.category : str5;
        String str16 = (i4 & 128) != 0 ? productV3.logoUrl : str6;
        String str17 = (i4 & 256) != 0 ? productV3.iconUrl : str7;
        String str18 = (i4 & 512) != 0 ? productV3.description : str8;
        String str19 = (i4 & 1024) != 0 ? productV3.productCode : str9;
        Amount amount4 = (i4 & 2048) != 0 ? productV3.amountDiscounted : amount2;
        boolean z10 = (i4 & 4096) != 0 ? productV3.isPromo : z4;
        boolean z11 = (i4 & 8192) != 0 ? productV3.isDisabled : z5;
        String str20 = str11;
        Details details2 = (i4 & 16384) != 0 ? productV3.details : details;
        Integer num2 = (i4 & 32768) != 0 ? productV3.priority : num;
        ProductProviderDetails productProviderDetails2 = (i4 & 65536) != 0 ? productV3.productProviderDetails : productProviderDetails;
        String str21 = (i4 & 131072) != 0 ? productV3.providerDisplayName : str10;
        int i10 = (i4 & 262144) != 0 ? productV3.page : i;
        if ((i4 & 524288) != 0) {
            i6 = i10;
            z9 = productV3.isRecentlyPurchased;
        } else {
            z9 = z8;
            i6 = i10;
        }
        return productV3.copy(str20, str12, amount3, str13, str14, list2, str15, str16, str17, str18, str19, amount4, z10, z11, details2, num2, productProviderDetails2, str21, i6, z9);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.description;
    }

    public final String component11() {
        return this.productCode;
    }

    public final Amount component12() {
        return this.amountDiscounted;
    }

    public final boolean component13() {
        return this.isPromo;
    }

    public final boolean component14() {
        return this.isDisabled;
    }

    public final Details component15() {
        return this.details;
    }

    public final Integer component16() {
        return this.priority;
    }

    public final ProductProviderDetails component17() {
        return this.productProviderDetails;
    }

    public final String component18() {
        return this.providerDisplayName;
    }

    public final int component19() {
        return this.page;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component20() {
        return this.isRecentlyPurchased;
    }

    public final Amount component3() {
        return this.amountOriginal;
    }

    public final String component4() {
        return this.productType;
    }

    public final String component5() {
        return this.provider;
    }

    public final List<ShopCategory> component6() {
        return this.shopCategories;
    }

    public final String component7() {
        return this.category;
    }

    public final String component8() {
        return this.logoUrl;
    }

    public final String component9() {
        return this.iconUrl;
    }

    public final ProductV3 copy(String id, String name, Amount amountOriginal, String str, String str2, List<? extends ShopCategory> list, String str3, String str4, String str5, String str6, String str7, Amount amount, boolean z4, boolean z5, Details details, Integer num, ProductProviderDetails productProviderDetails, String str8, int i, boolean z8) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(amountOriginal, "amountOriginal");
        return new ProductV3(id, name, amountOriginal, str, str2, list, str3, str4, str5, str6, str7, amount, z4, z5, details, num, productProviderDetails, str8, i, z8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductV3)) {
            return false;
        }
        ProductV3 productV3 = (ProductV3) obj;
        return j.b(this.id, productV3.id) && j.b(this.name, productV3.name) && j.b(this.amountOriginal, productV3.amountOriginal) && j.b(this.productType, productV3.productType) && j.b(this.provider, productV3.provider) && j.b(this.shopCategories, productV3.shopCategories) && j.b(this.category, productV3.category) && j.b(this.logoUrl, productV3.logoUrl) && j.b(this.iconUrl, productV3.iconUrl) && j.b(this.description, productV3.description) && j.b(this.productCode, productV3.productCode) && j.b(this.amountDiscounted, productV3.amountDiscounted) && this.isPromo == productV3.isPromo && this.isDisabled == productV3.isDisabled && j.b(this.details, productV3.details) && j.b(this.priority, productV3.priority) && j.b(this.productProviderDetails, productV3.productProviderDetails) && j.b(this.providerDisplayName, productV3.providerDisplayName) && this.page == productV3.page && this.isRecentlyPurchased == productV3.isRecentlyPurchased;
    }

    public final Amount getAmountDiscounted() {
        return this.amountDiscounted;
    }

    public final Amount getAmountOriginal() {
        return this.amountOriginal;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Details getDetails() {
        return this.details;
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

    public final int getPage() {
        return this.page;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final ProductProviderDetails getProductProviderDetails() {
        return this.productProviderDetails;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getProviderDisplayName() {
        return this.providerDisplayName;
    }

    public final List<ShopCategory> getShopCategories() {
        return this.shopCategories;
    }

    @Override // com.paymaya.domain.model.ShopSearchListItem
    public ShopSearchListItem.VIEW_TYPE getViewType() {
        return ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_PRODUCT;
    }

    @Override // com.paymaya.domain.model.ShopHomeCarouselListItem
    public ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM getViewTypeShopHomeCarouselItem() {
        return ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_MOST_POPULAR_PRODUCT;
    }

    @Override // com.paymaya.domain.model.ShopV3ListItem
    public ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM getViewTypeShopProductItem() {
        return ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PRODUCT;
    }

    public final boolean hasProductProviderFields() {
        ProductProviderDetails productProviderDetails = this.productProviderDetails;
        List<ProductProviderField> listMProductProviderFields = productProviderDetails != null ? productProviderDetails.mProductProviderFields() : null;
        return !(listMProductProviderFields == null || listMProductProviderFields.isEmpty());
    }

    public int hashCode() {
        int iHashCode = (this.amountOriginal.hashCode() + AbstractC1414e.c(this.id.hashCode() * 31, 31, this.name)) * 31;
        String str = this.productType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.provider;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<? extends ShopCategory> list = this.shopCategories;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.category;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logoUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productCode;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Amount amount = this.amountDiscounted;
        int iHashCode10 = (((((iHashCode9 + (amount == null ? 0 : amount.hashCode())) * 31) + (this.isPromo ? 1231 : 1237)) * 31) + (this.isDisabled ? 1231 : 1237)) * 31;
        Details details = this.details;
        int iHashCode11 = (iHashCode10 + (details == null ? 0 : details.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        ProductProviderDetails productProviderDetails = this.productProviderDetails;
        int iHashCode13 = (iHashCode12 + (productProviderDetails == null ? 0 : productProviderDetails.hashCode())) * 31;
        String str8 = this.providerDisplayName;
        return ((((iHashCode13 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.page) * 31) + (this.isRecentlyPurchased ? 1231 : 1237);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final boolean isProductBeepCard() {
        Details details = this.details;
        return "beep".equalsIgnoreCase(details != null ? details.mNetwork() : null);
    }

    public final boolean isProductCignal() {
        Details details = this.details;
        return "Cignal".equalsIgnoreCase(details != null ? details.mNetwork() : null);
    }

    public final boolean isProductShareTreats() {
        List<? extends ShopCategory> list = this.shopCategories;
        if (list != null) {
            List<? extends ShopCategory> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if ("treats".equals(((ShopCategory) it.next()).mCode())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isPromo() {
        return this.isPromo;
    }

    public final boolean isRecentlyPurchased() {
        return this.isRecentlyPurchased;
    }

    public final void setAmountDiscounted(Amount amount) {
        this.amountDiscounted = amount;
    }

    public final void setAmountOriginal(Amount amount) {
        j.g(amount, "<set-?>");
        this.amountOriginal = amount;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDetails(Details details) {
        this.details = details;
    }

    public final void setDisabled(boolean z4) {
        this.isDisabled = z4;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setId(String str) {
        j.g(str, "<set-?>");
        this.id = str;
    }

    public final void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public final void setName(String str) {
        j.g(str, "<set-?>");
        this.name = str;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setPriority(Integer num) {
        this.priority = num;
    }

    public final void setProductCode(String str) {
        this.productCode = str;
    }

    public final void setProductProviderDetails(ProductProviderDetails productProviderDetails) {
        this.productProviderDetails = productProviderDetails;
    }

    public final void setProductType(String str) {
        this.productType = str;
    }

    public final void setPromo(boolean z4) {
        this.isPromo = z4;
    }

    public final void setProvider(String str) {
        this.provider = str;
    }

    public final void setProviderDisplayName(String str) {
        this.providerDisplayName = str;
    }

    public final void setRecentlyPurchased(boolean z4) {
        this.isRecentlyPurchased = z4;
    }

    public final void setShopCategories(List<? extends ShopCategory> list) {
        this.shopCategories = list;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        Amount amount = this.amountOriginal;
        String str3 = this.productType;
        String str4 = this.provider;
        List<? extends ShopCategory> list = this.shopCategories;
        String str5 = this.category;
        String str6 = this.logoUrl;
        String str7 = this.iconUrl;
        String str8 = this.description;
        String str9 = this.productCode;
        Amount amount2 = this.amountDiscounted;
        boolean z4 = this.isPromo;
        boolean z5 = this.isDisabled;
        Details details = this.details;
        Integer num = this.priority;
        ProductProviderDetails productProviderDetails = this.productProviderDetails;
        String str10 = this.providerDisplayName;
        int i = this.page;
        boolean z8 = this.isRecentlyPurchased;
        StringBuilder sbX = s.x("ProductV3(id=", str, ", name=", str2, ", amountOriginal=");
        sbX.append(amount);
        sbX.append(", productType=");
        sbX.append(str3);
        sbX.append(", provider=");
        sbX.append(str4);
        sbX.append(", shopCategories=");
        sbX.append(list);
        sbX.append(", category=");
        c.A(sbX, str5, ", logoUrl=", str6, ", iconUrl=");
        c.A(sbX, str7, ", description=", str8, ", productCode=");
        sbX.append(str9);
        sbX.append(", amountDiscounted=");
        sbX.append(amount2);
        sbX.append(", isPromo=");
        sbX.append(z4);
        sbX.append(", isDisabled=");
        sbX.append(z5);
        sbX.append(", details=");
        sbX.append(details);
        sbX.append(", priority=");
        sbX.append(num);
        sbX.append(", productProviderDetails=");
        sbX.append(productProviderDetails);
        sbX.append(", providerDisplayName=");
        sbX.append(str10);
        sbX.append(", page=");
        sbX.append(i);
        sbX.append(", isRecentlyPurchased=");
        sbX.append(z8);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeParcelable(this.amountOriginal, i);
        dest.writeString(this.productType);
        dest.writeString(this.provider);
        List<? extends ShopCategory> list = this.shopCategories;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                dest.writeParcelable((Parcelable) itP.next(), i);
            }
        }
        dest.writeString(this.category);
        dest.writeString(this.logoUrl);
        dest.writeString(this.iconUrl);
        dest.writeString(this.description);
        dest.writeString(this.productCode);
        dest.writeParcelable(this.amountDiscounted, i);
        dest.writeInt(this.isPromo ? 1 : 0);
        dest.writeInt(this.isDisabled ? 1 : 0);
        dest.writeParcelable(this.details, i);
        Integer num = this.priority;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeParcelable(this.productProviderDetails, i);
        dest.writeString(this.providerDisplayName);
        dest.writeInt(this.page);
        dest.writeInt(this.isRecentlyPurchased ? 1 : 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProductV3(java.lang.String r25, java.lang.String r26, com.paymaya.domain.model.Amount r27, java.lang.String r28, java.lang.String r29, java.util.List r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, com.paymaya.domain.model.Amount r36, boolean r37, boolean r38, com.paymaya.domain.model.Details r39, java.lang.Integer r40, com.paymaya.domain.model.ProductProviderDetails r41, java.lang.String r42, int r43, boolean r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r28
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L11
            r8 = r2
            goto L13
        L11:
            r8 = r29
        L13:
            r1 = r0 & 32
            if (r1 == 0) goto L19
            r9 = r2
            goto L1b
        L19:
            r9 = r30
        L1b:
            r1 = r0 & 64
            if (r1 == 0) goto L21
            r10 = r2
            goto L23
        L21:
            r10 = r31
        L23:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L29
            r11 = r2
            goto L2b
        L29:
            r11 = r32
        L2b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L31
            r12 = r2
            goto L33
        L31:
            r12 = r33
        L33:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L39
            r13 = r2
            goto L3b
        L39:
            r13 = r34
        L3b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L41
            r14 = r2
            goto L43
        L41:
            r14 = r35
        L43:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L49
            r15 = r2
            goto L4b
        L49:
            r15 = r36
        L4b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r3 = 0
            if (r1 == 0) goto L53
            r16 = r3
            goto L55
        L53:
            r16 = r37
        L55:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L5c
            r17 = r3
            goto L5e
        L5c:
            r17 = r38
        L5e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L65
            r18 = r2
            goto L67
        L65:
            r18 = r39
        L67:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L70
            r19 = r2
            goto L72
        L70:
            r19 = r40
        L72:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L7a
            r20 = r2
            goto L7c
        L7a:
            r20 = r41
        L7c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L84
            r21 = r2
            goto L86
        L84:
            r21 = r42
        L86:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L8e
            r22 = r3
            goto L90
        L8e:
            r22 = r43
        L90:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto La0
            r23 = r3
            r4 = r25
            r5 = r26
            r6 = r27
            r3 = r24
            goto Laa
        La0:
            r23 = r44
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
        Laa:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.model.ProductV3.<init>(java.lang.String, java.lang.String, com.paymaya.domain.model.Amount, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paymaya.domain.model.Amount, boolean, boolean, com.paymaya.domain.model.Details, java.lang.Integer, com.paymaya.domain.model.ProductProviderDetails, java.lang.String, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
