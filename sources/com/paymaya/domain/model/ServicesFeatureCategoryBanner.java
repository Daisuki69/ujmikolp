package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ServicesFeatureCategoryBanner implements Parcelable {
    public static final Parcelable.Creator<ServicesFeatureCategoryBanner> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("index")
    private final Integer index;

    public static final class Creator implements Parcelable.Creator<ServicesFeatureCategoryBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServicesFeatureCategoryBanner createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ServicesFeatureCategoryBanner(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServicesFeatureCategoryBanner[] newArray(int i) {
            return new ServicesFeatureCategoryBanner[i];
        }
    }

    public ServicesFeatureCategoryBanner(Integer num) {
        this.index = num;
    }

    public static /* synthetic */ ServicesFeatureCategoryBanner copy$default(ServicesFeatureCategoryBanner servicesFeatureCategoryBanner, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = servicesFeatureCategoryBanner.index;
        }
        return servicesFeatureCategoryBanner.copy(num);
    }

    public final Integer component1() {
        return this.index;
    }

    public final ServicesFeatureCategoryBanner copy(Integer num) {
        return new ServicesFeatureCategoryBanner(num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServicesFeatureCategoryBanner) && j.b(this.index, ((ServicesFeatureCategoryBanner) obj).index);
    }

    public final Integer getIndex() {
        return this.index;
    }

    public int hashCode() {
        Integer num = this.index;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "ServicesFeatureCategoryBanner(index=" + this.index + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.index;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
    }
}
