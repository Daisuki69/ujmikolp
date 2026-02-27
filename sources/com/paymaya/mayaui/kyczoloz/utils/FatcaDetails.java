package com.paymaya.mayaui.kyczoloz.utils;

import E8.C0222e;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FatcaDetails implements Parcelable {
    public static final Parcelable.Creator<FatcaDetails> CREATOR = new C0222e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("fatca")
    private final boolean f12429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("fatcaReason")
    private final List<String> f12430b;

    @InterfaceC1498b("updateRequestedBy")
    private final String c;

    public FatcaDetails(boolean z4, ArrayList arrayList, String str) {
        this.f12429a = z4;
        this.f12430b = arrayList;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FatcaDetails)) {
            return false;
        }
        FatcaDetails fatcaDetails = (FatcaDetails) obj;
        return this.f12429a == fatcaDetails.f12429a && j.b(this.f12430b, fatcaDetails.f12430b) && j.b(this.c, fatcaDetails.c);
    }

    public final int hashCode() {
        int i = (this.f12429a ? 1231 : 1237) * 31;
        List<String> list = this.f12430b;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        boolean z4 = this.f12429a;
        List<String> list = this.f12430b;
        String str = this.c;
        StringBuilder sb2 = new StringBuilder("FatcaDetails(fatca=");
        sb2.append(z4);
        sb2.append(", fatcaReason=");
        sb2.append(list);
        sb2.append(", updateRequestedBy=");
        return s.p(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.f12429a ? 1 : 0);
        dest.writeStringList(this.f12430b);
        dest.writeString(this.c);
    }
}
