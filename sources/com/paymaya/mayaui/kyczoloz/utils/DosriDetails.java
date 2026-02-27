package com.paymaya.mayaui.kyczoloz.utils;

import E8.C0222e;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DosriDetails implements Parcelable {
    public static final Parcelable.Creator<DosriDetails> CREATOR = new C0222e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("dosri")
    private final boolean f12426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("dosriType")
    private final String f12427b;

    @InterfaceC1498b("relatedTo")
    private final List<RelatedTo> c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC1498b("updateRequestedBy")
    private final String f12428d;

    public DosriDetails(boolean z4, String str, ArrayList arrayList, String updateRequestedBy) {
        j.g(updateRequestedBy, "updateRequestedBy");
        this.f12426a = z4;
        this.f12427b = str;
        this.c = arrayList;
        this.f12428d = updateRequestedBy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DosriDetails)) {
            return false;
        }
        DosriDetails dosriDetails = (DosriDetails) obj;
        return this.f12426a == dosriDetails.f12426a && j.b(this.f12427b, dosriDetails.f12427b) && j.b(this.c, dosriDetails.c) && j.b(this.f12428d, dosriDetails.f12428d);
    }

    public final int hashCode() {
        int i = (this.f12426a ? 1231 : 1237) * 31;
        String str = this.f12427b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<RelatedTo> list = this.c;
        return this.f12428d.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DosriDetails(dosri=" + this.f12426a + ", dosriType=" + this.f12427b + ", relatedTo=" + this.c + ", updateRequestedBy=" + this.f12428d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.f12426a ? 1 : 0);
        dest.writeString(this.f12427b);
        List<RelatedTo> list = this.c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((RelatedTo) itP.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.f12428d);
    }
}
