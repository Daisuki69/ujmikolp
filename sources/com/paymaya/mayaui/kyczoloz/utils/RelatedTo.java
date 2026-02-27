package com.paymaya.mayaui.kyczoloz.utils;

import E8.C0222e;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RelatedTo implements Parcelable {
    public static final Parcelable.Creator<RelatedTo> CREATOR = new C0222e(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final Name f12438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("entityName")
    private final String f12439b;

    @InterfaceC1498b("relationship")
    private final String c;

    public RelatedTo(Name name, String str, String str2) {
        this.f12438a = name;
        this.f12439b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedTo)) {
            return false;
        }
        RelatedTo relatedTo = (RelatedTo) obj;
        return j.b(this.f12438a, relatedTo.f12438a) && j.b(this.f12439b, relatedTo.f12439b) && j.b(this.c, relatedTo.c);
    }

    public final int hashCode() {
        Name name = this.f12438a;
        int iHashCode = (name == null ? 0 : name.hashCode()) * 31;
        String str = this.f12439b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Name name = this.f12438a;
        String str = this.f12439b;
        String str2 = this.c;
        StringBuilder sb2 = new StringBuilder("RelatedTo(name=");
        sb2.append(name);
        sb2.append(", entityName=");
        sb2.append(str);
        sb2.append(", relationship=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Name name = this.f12438a;
        if (name == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            name.writeToParcel(dest, i);
        }
        dest.writeString(this.f12439b);
        dest.writeString(this.c);
    }
}
