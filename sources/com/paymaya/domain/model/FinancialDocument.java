package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FinancialDocument implements Parcelable {
    public static final Parcelable.Creator<FinancialDocument> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public static final class Creator implements Parcelable.Creator<FinancialDocument> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialDocument createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new FinancialDocument(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialDocument[] newArray(int i) {
            return new FinancialDocument[i];
        }
    }

    public FinancialDocument(String type, String name) {
        j.g(type, "type");
        j.g(name, "name");
        this.type = type;
        this.name = name;
    }

    public static /* synthetic */ FinancialDocument copy$default(FinancialDocument financialDocument, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = financialDocument.type;
        }
        if ((i & 2) != 0) {
            str2 = financialDocument.name;
        }
        return financialDocument.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.name;
    }

    public final FinancialDocument copy(String type, String name) {
        j.g(type, "type");
        j.g(name, "name");
        return new FinancialDocument(type, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialDocument)) {
            return false;
        }
        FinancialDocument financialDocument = (FinancialDocument) obj;
        return j.b(this.type, financialDocument.type) && j.b(this.name, financialDocument.name);
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return s.l("FinancialDocument(type=", this.type, ", name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.name);
    }
}
