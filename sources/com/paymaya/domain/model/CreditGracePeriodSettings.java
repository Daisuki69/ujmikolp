package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditGracePeriodSettings implements Parcelable {
    public static final Parcelable.Creator<CreditGracePeriodSettings> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("unit")
    private final String unit;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    public static final class Creator implements Parcelable.Creator<CreditGracePeriodSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditGracePeriodSettings createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditGracePeriodSettings(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditGracePeriodSettings[] newArray(int i) {
            return new CreditGracePeriodSettings[i];
        }
    }

    public CreditGracePeriodSettings(String type, String unit, String value) {
        j.g(type, "type");
        j.g(unit, "unit");
        j.g(value, "value");
        this.type = type;
        this.unit = unit;
        this.value = value;
    }

    public static /* synthetic */ CreditGracePeriodSettings copy$default(CreditGracePeriodSettings creditGracePeriodSettings, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditGracePeriodSettings.type;
        }
        if ((i & 2) != 0) {
            str2 = creditGracePeriodSettings.unit;
        }
        if ((i & 4) != 0) {
            str3 = creditGracePeriodSettings.value;
        }
        return creditGracePeriodSettings.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.unit;
    }

    public final String component3() {
        return this.value;
    }

    public final CreditGracePeriodSettings copy(String type, String unit, String value) {
        j.g(type, "type");
        j.g(unit, "unit");
        j.g(value, "value");
        return new CreditGracePeriodSettings(type, unit, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditGracePeriodSettings)) {
            return false;
        }
        CreditGracePeriodSettings creditGracePeriodSettings = (CreditGracePeriodSettings) obj;
        return j.b(this.type, creditGracePeriodSettings.type) && j.b(this.unit, creditGracePeriodSettings.unit) && j.b(this.value, creditGracePeriodSettings.value);
    }

    public final String getType() {
        return this.type;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + AbstractC1414e.c(this.type.hashCode() * 31, 31, this.unit);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.unit;
        return s.p(s.x("CreditGracePeriodSettings(type=", str, ", unit=", str2, ", value="), this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.unit);
        dest.writeString(this.value);
    }
}
