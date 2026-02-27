package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RepaymentSettings implements Parcelable {
    public static final Parcelable.Creator<RepaymentSettings> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("biller")
    private final String biller;

    public static final class Creator implements Parcelable.Creator<RepaymentSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepaymentSettings createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new RepaymentSettings(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepaymentSettings[] newArray(int i) {
            return new RepaymentSettings[i];
        }
    }

    public RepaymentSettings(String biller) {
        j.g(biller, "biller");
        this.biller = biller;
    }

    public static /* synthetic */ RepaymentSettings copy$default(RepaymentSettings repaymentSettings, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repaymentSettings.biller;
        }
        return repaymentSettings.copy(str);
    }

    public final String component1() {
        return this.biller;
    }

    public final RepaymentSettings copy(String biller) {
        j.g(biller, "biller");
        return new RepaymentSettings(biller);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RepaymentSettings) && j.b(this.biller, ((RepaymentSettings) obj).biller);
    }

    public final String getBiller() {
        return this.biller;
    }

    public int hashCode() {
        return this.biller.hashCode();
    }

    public String toString() {
        return s.j("RepaymentSettings(biller=", this.biller, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.biller);
    }
}
