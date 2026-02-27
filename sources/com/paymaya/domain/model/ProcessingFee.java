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
public final class ProcessingFee implements Parcelable {
    public static final Parcelable.Creator<ProcessingFee> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("currency")
    private final String currency;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    public static final class Creator implements Parcelable.Creator<ProcessingFee> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProcessingFee createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ProcessingFee(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProcessingFee[] newArray(int i) {
            return new ProcessingFee[i];
        }
    }

    public ProcessingFee(String type, String currency, String value) {
        j.g(type, "type");
        j.g(currency, "currency");
        j.g(value, "value");
        this.type = type;
        this.currency = currency;
        this.value = value;
    }

    public static /* synthetic */ ProcessingFee copy$default(ProcessingFee processingFee, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = processingFee.type;
        }
        if ((i & 2) != 0) {
            str2 = processingFee.currency;
        }
        if ((i & 4) != 0) {
            str3 = processingFee.value;
        }
        return processingFee.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.currency;
    }

    public final String component3() {
        return this.value;
    }

    public final ProcessingFee copy(String type, String currency, String value) {
        j.g(type, "type");
        j.g(currency, "currency");
        j.g(value, "value");
        return new ProcessingFee(type, currency, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessingFee)) {
            return false;
        }
        ProcessingFee processingFee = (ProcessingFee) obj;
        return j.b(this.type, processingFee.type) && j.b(this.currency, processingFee.currency) && j.b(this.value, processingFee.value);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + AbstractC1414e.c(this.type.hashCode() * 31, 31, this.currency);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.currency;
        return s.p(s.x("ProcessingFee(type=", str, ", currency=", str2, ", value="), this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.currency);
        dest.writeString(this.value);
    }
}
