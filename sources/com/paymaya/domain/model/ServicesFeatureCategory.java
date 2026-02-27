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
public final class ServicesFeatureCategory implements Parcelable {
    public static final Parcelable.Creator<ServicesFeatureCategory> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("service_ids")
    private final List<String> serviceIds;

    public static final class Creator implements Parcelable.Creator<ServicesFeatureCategory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServicesFeatureCategory createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ServicesFeatureCategory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServicesFeatureCategory[] newArray(int i) {
            return new ServicesFeatureCategory[i];
        }
    }

    public ServicesFeatureCategory(String id, String name, String description, List<String> serviceIds) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(description, "description");
        j.g(serviceIds, "serviceIds");
        this.id = id;
        this.name = name;
        this.description = description;
        this.serviceIds = serviceIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServicesFeatureCategory copy$default(ServicesFeatureCategory servicesFeatureCategory, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = servicesFeatureCategory.id;
        }
        if ((i & 2) != 0) {
            str2 = servicesFeatureCategory.name;
        }
        if ((i & 4) != 0) {
            str3 = servicesFeatureCategory.description;
        }
        if ((i & 8) != 0) {
            list = servicesFeatureCategory.serviceIds;
        }
        return servicesFeatureCategory.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final List<String> component4() {
        return this.serviceIds;
    }

    public final ServicesFeatureCategory copy(String id, String name, String description, List<String> serviceIds) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(description, "description");
        j.g(serviceIds, "serviceIds");
        return new ServicesFeatureCategory(id, name, description, serviceIds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesFeatureCategory)) {
            return false;
        }
        ServicesFeatureCategory servicesFeatureCategory = (ServicesFeatureCategory) obj;
        return j.b(this.id, servicesFeatureCategory.id) && j.b(this.name, servicesFeatureCategory.name) && j.b(this.description, servicesFeatureCategory.description) && j.b(this.serviceIds, servicesFeatureCategory.serviceIds);
    }

    public final String getDescription() {
        return this.description;
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
        return this.serviceIds.hashCode() + AbstractC1414e.c(AbstractC1414e.c(this.id.hashCode() * 31, 31, this.name), 31, this.description);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        List<String> list = this.serviceIds;
        StringBuilder sbX = s.x("ServicesFeatureCategory(id=", str, ", name=", str2, ", description=");
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
        dest.writeString(this.description);
        dest.writeStringList(this.serviceIds);
    }
}
