package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogProduct implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogProduct> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("amounts")
    private final List<RewardsCatalogAmount> amounts;

    @InterfaceC1497a
    @InterfaceC1498b("categories")
    private final List<String> categories;

    @InterfaceC1497a
    @InterfaceC1498b("images")
    private final RewardsCatalogImages images;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("product_id")
    private final String productId;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogProduct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogProduct createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(RewardsCatalogAmount.CREATOR, parcel, arrayList, I4, 1);
            }
            return new RewardsCatalogProduct(string, string2, arrayListCreateStringArrayList, arrayList, RewardsCatalogImages.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogProduct[] newArray(int i) {
            return new RewardsCatalogProduct[i];
        }
    }

    public RewardsCatalogProduct(String productId, String name, List<String> categories, List<RewardsCatalogAmount> amounts, RewardsCatalogImages images) {
        j.g(productId, "productId");
        j.g(name, "name");
        j.g(categories, "categories");
        j.g(amounts, "amounts");
        j.g(images, "images");
        this.productId = productId;
        this.name = name;
        this.categories = categories;
        this.amounts = amounts;
        this.images = images;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardsCatalogProduct copy$default(RewardsCatalogProduct rewardsCatalogProduct, String str, String str2, List list, List list2, RewardsCatalogImages rewardsCatalogImages, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsCatalogProduct.productId;
        }
        if ((i & 2) != 0) {
            str2 = rewardsCatalogProduct.name;
        }
        if ((i & 4) != 0) {
            list = rewardsCatalogProduct.categories;
        }
        if ((i & 8) != 0) {
            list2 = rewardsCatalogProduct.amounts;
        }
        if ((i & 16) != 0) {
            rewardsCatalogImages = rewardsCatalogProduct.images;
        }
        RewardsCatalogImages rewardsCatalogImages2 = rewardsCatalogImages;
        List list3 = list;
        return rewardsCatalogProduct.copy(str, str2, list3, list2, rewardsCatalogImages2);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.name;
    }

    public final List<String> component3() {
        return this.categories;
    }

    public final List<RewardsCatalogAmount> component4() {
        return this.amounts;
    }

    public final RewardsCatalogImages component5() {
        return this.images;
    }

    public final RewardsCatalogProduct copy(String productId, String name, List<String> categories, List<RewardsCatalogAmount> amounts, RewardsCatalogImages images) {
        j.g(productId, "productId");
        j.g(name, "name");
        j.g(categories, "categories");
        j.g(amounts, "amounts");
        j.g(images, "images");
        return new RewardsCatalogProduct(productId, name, categories, amounts, images);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCatalogProduct)) {
            return false;
        }
        RewardsCatalogProduct rewardsCatalogProduct = (RewardsCatalogProduct) obj;
        return j.b(this.productId, rewardsCatalogProduct.productId) && j.b(this.name, rewardsCatalogProduct.name) && j.b(this.categories, rewardsCatalogProduct.categories) && j.b(this.amounts, rewardsCatalogProduct.amounts) && j.b(this.images, rewardsCatalogProduct.images);
    }

    public final List<RewardsCatalogAmount> getAmounts() {
        return this.amounts;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final RewardsCatalogImages getImages() {
        return this.images;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return this.images.hashCode() + AbstractC1414e.d(this.amounts, AbstractC1414e.d(this.categories, AbstractC1414e.c(this.productId.hashCode() * 31, 31, this.name), 31), 31);
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.name;
        List<String> list = this.categories;
        List<RewardsCatalogAmount> list2 = this.amounts;
        RewardsCatalogImages rewardsCatalogImages = this.images;
        StringBuilder sbX = s.x("RewardsCatalogProduct(productId=", str, ", name=", str2, ", categories=");
        sbX.append(list);
        sbX.append(", amounts=");
        sbX.append(list2);
        sbX.append(", images=");
        sbX.append(rewardsCatalogImages);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.productId);
        dest.writeString(this.name);
        dest.writeStringList(this.categories);
        Iterator itQ = AbstractC1213b.Q(this.amounts, dest);
        while (itQ.hasNext()) {
            ((RewardsCatalogAmount) itQ.next()).writeToParcel(dest, i);
        }
        this.images.writeToParcel(dest, i);
    }
}
