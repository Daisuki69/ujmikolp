package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import cj.C1112C;
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
public final class ServicesFeatureCoreAndCategories implements Parcelable {
    public static final Parcelable.Creator<ServicesFeatureCoreAndCategories> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("banner")
    private final int banner;

    @InterfaceC1497a
    @InterfaceC1498b("categories")
    private final List<ServicesFeatureCategoryV2> categories;

    @InterfaceC1497a
    @InterfaceC1498b("core_tiles")
    private final List<String> coreItems;

    public static final class Creator implements Parcelable.Creator<ServicesFeatureCoreAndCategories> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServicesFeatureCoreAndCategories createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(ServicesFeatureCategoryV2.CREATOR, parcel, arrayList, I4, 1);
            }
            return new ServicesFeatureCoreAndCategories(arrayListCreateStringArrayList, arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServicesFeatureCoreAndCategories[] newArray(int i) {
            return new ServicesFeatureCoreAndCategories[i];
        }
    }

    public ServicesFeatureCoreAndCategories() {
        this(null, null, 0, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServicesFeatureCoreAndCategories copy$default(ServicesFeatureCoreAndCategories servicesFeatureCoreAndCategories, List list, List list2, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = servicesFeatureCoreAndCategories.coreItems;
        }
        if ((i4 & 2) != 0) {
            list2 = servicesFeatureCoreAndCategories.categories;
        }
        if ((i4 & 4) != 0) {
            i = servicesFeatureCoreAndCategories.banner;
        }
        return servicesFeatureCoreAndCategories.copy(list, list2, i);
    }

    public final List<String> component1() {
        return this.coreItems;
    }

    public final List<ServicesFeatureCategoryV2> component2() {
        return this.categories;
    }

    public final int component3() {
        return this.banner;
    }

    public final ServicesFeatureCoreAndCategories copy(List<String> coreItems, List<ServicesFeatureCategoryV2> categories, int i) {
        j.g(coreItems, "coreItems");
        j.g(categories, "categories");
        return new ServicesFeatureCoreAndCategories(coreItems, categories, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesFeatureCoreAndCategories)) {
            return false;
        }
        ServicesFeatureCoreAndCategories servicesFeatureCoreAndCategories = (ServicesFeatureCoreAndCategories) obj;
        return j.b(this.coreItems, servicesFeatureCoreAndCategories.coreItems) && j.b(this.categories, servicesFeatureCoreAndCategories.categories) && this.banner == servicesFeatureCoreAndCategories.banner;
    }

    public final int getBanner() {
        return this.banner;
    }

    public final List<ServicesFeatureCategoryV2> getCategories() {
        return this.categories;
    }

    public final List<String> getCoreItems() {
        return this.coreItems;
    }

    public int hashCode() {
        return AbstractC1414e.d(this.categories, this.coreItems.hashCode() * 31, 31) + this.banner;
    }

    public String toString() {
        List<String> list = this.coreItems;
        List<ServicesFeatureCategoryV2> list2 = this.categories;
        int i = this.banner;
        StringBuilder sb2 = new StringBuilder("ServicesFeatureCoreAndCategories(coreItems=");
        sb2.append(list);
        sb2.append(", categories=");
        sb2.append(list2);
        sb2.append(", banner=");
        return s.o(sb2, ")", i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeStringList(this.coreItems);
        Iterator itQ = AbstractC1213b.Q(this.categories, dest);
        while (itQ.hasNext()) {
            ((ServicesFeatureCategoryV2) itQ.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.banner);
    }

    public ServicesFeatureCoreAndCategories(List<String> coreItems, List<ServicesFeatureCategoryV2> categories, int i) {
        j.g(coreItems, "coreItems");
        j.g(categories, "categories");
        this.coreItems = coreItems;
        this.categories = categories;
        this.banner = i;
    }

    public ServicesFeatureCoreAndCategories(List list, List list2, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C1112C.f9377a : list, (i4 & 2) != 0 ? C1112C.f9377a : list2, (i4 & 4) != 0 ? -1 : i);
    }
}
