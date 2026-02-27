package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class AlternativeLandline implements Parcelable {
    public static final Parcelable.Creator<AlternativeLandline> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("landlineNumber")
    private String landlineNumber;

    public static final class Creator implements Parcelable.Creator<AlternativeLandline> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlternativeLandline createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new AlternativeLandline(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlternativeLandline[] newArray(int i) {
            return new AlternativeLandline[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlternativeLandline() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AlternativeLandline copy$default(AlternativeLandline alternativeLandline, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alternativeLandline.landlineNumber;
        }
        return alternativeLandline.copy(str);
    }

    public final String component1() {
        return this.landlineNumber;
    }

    public final AlternativeLandline copy(String str) {
        return new AlternativeLandline(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlternativeLandline) && j.b(this.landlineNumber, ((AlternativeLandline) obj).landlineNumber);
    }

    public final String getLandlineNumber() {
        return this.landlineNumber;
    }

    public int hashCode() {
        String str = this.landlineNumber;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setLandlineNumber(String str) {
        this.landlineNumber = str;
    }

    public String toString() {
        return s.j("AlternativeLandline(landlineNumber=", this.landlineNumber, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.landlineNumber);
    }

    public AlternativeLandline(String str) {
        this.landlineNumber = str;
    }

    public /* synthetic */ AlternativeLandline(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
