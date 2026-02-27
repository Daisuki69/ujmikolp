package com.paymaya.domain.model;

import We.s;
import defpackage.AbstractC1414e;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ServicesFeatureCategoryDetails {
    private final String bgColorHex;
    private final String id;
    private final String name;
    private final List<SecondaryFeature> serviceIds;

    public ServicesFeatureCategoryDetails(String str, String name, String str2, List<SecondaryFeature> serviceIds) {
        j.g(name, "name");
        j.g(serviceIds, "serviceIds");
        this.id = str;
        this.name = name;
        this.bgColorHex = str2;
        this.serviceIds = serviceIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServicesFeatureCategoryDetails copy$default(ServicesFeatureCategoryDetails servicesFeatureCategoryDetails, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = servicesFeatureCategoryDetails.id;
        }
        if ((i & 2) != 0) {
            str2 = servicesFeatureCategoryDetails.name;
        }
        if ((i & 4) != 0) {
            str3 = servicesFeatureCategoryDetails.bgColorHex;
        }
        if ((i & 8) != 0) {
            list = servicesFeatureCategoryDetails.serviceIds;
        }
        return servicesFeatureCategoryDetails.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.bgColorHex;
    }

    public final List<SecondaryFeature> component4() {
        return this.serviceIds;
    }

    public final ServicesFeatureCategoryDetails copy(String str, String name, String str2, List<SecondaryFeature> serviceIds) {
        j.g(name, "name");
        j.g(serviceIds, "serviceIds");
        return new ServicesFeatureCategoryDetails(str, name, str2, serviceIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesFeatureCategoryDetails)) {
            return false;
        }
        ServicesFeatureCategoryDetails servicesFeatureCategoryDetails = (ServicesFeatureCategoryDetails) obj;
        return j.b(this.id, servicesFeatureCategoryDetails.id) && j.b(this.name, servicesFeatureCategoryDetails.name) && j.b(this.bgColorHex, servicesFeatureCategoryDetails.bgColorHex) && j.b(this.serviceIds, servicesFeatureCategoryDetails.serviceIds);
    }

    public final String getBgColorHex() {
        return this.bgColorHex;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<SecondaryFeature> getServiceIds() {
        return this.serviceIds;
    }

    public int hashCode() {
        String str = this.id;
        int iC = AbstractC1414e.c((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
        String str2 = this.bgColorHex;
        return this.serviceIds.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.bgColorHex;
        List<SecondaryFeature> list = this.serviceIds;
        StringBuilder sbX = s.x("ServicesFeatureCategoryDetails(id=", str, ", name=", str2, ", bgColorHex=");
        sbX.append(str3);
        sbX.append(", serviceIds=");
        sbX.append(list);
        sbX.append(")");
        return sbX.toString();
    }
}
