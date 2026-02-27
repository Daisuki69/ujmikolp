package com.paymaya.mayaui.kyczoloz.utils;

import E8.C0222e;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ComplianceRequest implements Parcelable {
    public static final Parcelable.Creator<ComplianceRequest> CREATOR = new C0222e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("dosriDetails")
    private final DosriDetails f12424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("fatcaDetails")
    private final FatcaDetails f12425b;

    public ComplianceRequest(DosriDetails dosriDetails, FatcaDetails fatcaDetails) {
        this.f12424a = dosriDetails;
        this.f12425b = fatcaDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplianceRequest)) {
            return false;
        }
        ComplianceRequest complianceRequest = (ComplianceRequest) obj;
        return j.b(this.f12424a, complianceRequest.f12424a) && j.b(this.f12425b, complianceRequest.f12425b);
    }

    public final int hashCode() {
        DosriDetails dosriDetails = this.f12424a;
        int iHashCode = (dosriDetails == null ? 0 : dosriDetails.hashCode()) * 31;
        FatcaDetails fatcaDetails = this.f12425b;
        return iHashCode + (fatcaDetails != null ? fatcaDetails.hashCode() : 0);
    }

    public final String toString() {
        return "ComplianceRequest(dosriDetails=" + this.f12424a + ", fatcaDetails=" + this.f12425b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        DosriDetails dosriDetails = this.f12424a;
        if (dosriDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dosriDetails.writeToParcel(dest, i);
        }
        FatcaDetails fatcaDetails = this.f12425b;
        if (fatcaDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fatcaDetails.writeToParcel(dest, i);
        }
    }
}
