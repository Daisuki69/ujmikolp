package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.utility.C;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class TotalAmount implements Parcelable {
    public static final Parcelable.Creator<TotalAmount> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("currency")
    private final String currency;

    @InterfaceC1497a
    @InterfaceC1498b("display")
    private final String display;

    @InterfaceC1497a
    @InterfaceC1498b("label")
    private final String label;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    public static final class Creator implements Parcelable.Creator<TotalAmount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TotalAmount createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new TotalAmount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TotalAmount[] newArray(int i) {
            return new TotalAmount[i];
        }
    }

    public TotalAmount(String str, String str2, String str3, String str4) {
        this.currency = str;
        this.value = str2;
        this.display = str3;
        this.label = str4;
    }

    public static /* synthetic */ TotalAmount copy$default(TotalAmount totalAmount, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = totalAmount.currency;
        }
        if ((i & 2) != 0) {
            str2 = totalAmount.value;
        }
        if ((i & 4) != 0) {
            str3 = totalAmount.display;
        }
        if ((i & 8) != 0) {
            str4 = totalAmount.label;
        }
        return totalAmount.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.currency;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.display;
    }

    public final String component4() {
        return this.label;
    }

    public final TotalAmount copy(String str, String str2, String str3, String str4) {
        return new TotalAmount(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalAmount)) {
            return false;
        }
        TotalAmount totalAmount = (TotalAmount) obj;
        return j.b(this.currency, totalAmount.currency) && j.b(this.value, totalAmount.value) && j.b(this.display, totalAmount.display) && j.b(this.label, totalAmount.label);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCurrencyFormattedValue() {
        return a.j(this.currency, Global.BLANK, C.v(this.value));
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getFormattedValue() {
        return C.v(this.value);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.display;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.currency;
        String str2 = this.value;
        return a.p(s.x("TotalAmount(currency=", str, ", value=", str2, ", display="), this.display, ", label=", this.label, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.value);
        dest.writeString(this.display);
        dest.writeString(this.label);
    }
}
