package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ServicesFeatureCategoryV2 implements Parcelable {
    public static final Parcelable.Creator<ServicesFeatureCategoryV2> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("bg_color")
    private final String bgColor;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("service_ids")
    private final List<String> serviceIds;

    public static final class Creator implements Parcelable.Creator<ServicesFeatureCategoryV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServicesFeatureCategoryV2 createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ServicesFeatureCategoryV2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServicesFeatureCategoryV2[] newArray(int i) {
            return new ServicesFeatureCategoryV2[i];
        }
    }

    public ServicesFeatureCategoryV2(String str, String name, String str2, List<String> list) {
        j.g(name, "name");
        this.id = str;
        this.name = name;
        this.bgColor = str2;
        this.serviceIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServicesFeatureCategoryV2 copy$default(ServicesFeatureCategoryV2 servicesFeatureCategoryV2, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = servicesFeatureCategoryV2.id;
        }
        if ((i & 2) != 0) {
            str2 = servicesFeatureCategoryV2.name;
        }
        if ((i & 4) != 0) {
            str3 = servicesFeatureCategoryV2.bgColor;
        }
        if ((i & 8) != 0) {
            list = servicesFeatureCategoryV2.serviceIds;
        }
        return servicesFeatureCategoryV2.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.bgColor;
    }

    public final List<String> component4() {
        return this.serviceIds;
    }

    public final ServicesFeatureCategoryV2 copy(String str, String name, String str2, List<String> list) {
        j.g(name, "name");
        return new ServicesFeatureCategoryV2(str, name, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesFeatureCategoryV2)) {
            return false;
        }
        ServicesFeatureCategoryV2 servicesFeatureCategoryV2 = (ServicesFeatureCategoryV2) obj;
        return j.b(this.id, servicesFeatureCategoryV2.id) && j.b(this.name, servicesFeatureCategoryV2.name) && j.b(this.bgColor, servicesFeatureCategoryV2.bgColor) && j.b(this.serviceIds, servicesFeatureCategoryV2.serviceIds);
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getServiceIds() {
        return this.serviceIds;
    }

    public int hashCode() {
        String str = this.id;
        int iC = AbstractC1414e.c((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
        String str2 = this.bgColor;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.serviceIds;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.bgColor;
        List<String> list = this.serviceIds;
        StringBuilder sbX = s.x("ServicesFeatureCategoryV2(id=", str, ", name=", str2, ", bgColor=");
        sbX.append(str3);
        sbX.append(", serviceIds=");
        sbX.append(list);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.bgColor);
        dest.writeStringList(this.serviceIds);
    }
}
