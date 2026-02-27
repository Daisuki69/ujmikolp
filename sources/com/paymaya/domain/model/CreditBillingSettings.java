package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditBillingSettings implements Parcelable {
    public static final Parcelable.Creator<CreditBillingSettings> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("period_end_day_of_month")
    private final MinMaxValue periodEndDayOfMonth;

    public static final class Creator implements Parcelable.Creator<CreditBillingSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditBillingSettings createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditBillingSettings(MinMaxValue.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditBillingSettings[] newArray(int i) {
            return new CreditBillingSettings[i];
        }
    }

    public CreditBillingSettings(MinMaxValue periodEndDayOfMonth) {
        j.g(periodEndDayOfMonth, "periodEndDayOfMonth");
        this.periodEndDayOfMonth = periodEndDayOfMonth;
    }

    public static /* synthetic */ CreditBillingSettings copy$default(CreditBillingSettings creditBillingSettings, MinMaxValue minMaxValue, int i, Object obj) {
        if ((i & 1) != 0) {
            minMaxValue = creditBillingSettings.periodEndDayOfMonth;
        }
        return creditBillingSettings.copy(minMaxValue);
    }

    public final MinMaxValue component1() {
        return this.periodEndDayOfMonth;
    }

    public final CreditBillingSettings copy(MinMaxValue periodEndDayOfMonth) {
        j.g(periodEndDayOfMonth, "periodEndDayOfMonth");
        return new CreditBillingSettings(periodEndDayOfMonth);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditBillingSettings) && j.b(this.periodEndDayOfMonth, ((CreditBillingSettings) obj).periodEndDayOfMonth);
    }

    public final List<Integer> getDaysValue() {
        return this.periodEndDayOfMonth.getDays();
    }

    public final int getEndDayMaxValue() {
        return this.periodEndDayOfMonth.getMaxValue();
    }

    public final int getEndDayMinValue() {
        return this.periodEndDayOfMonth.getMinValue();
    }

    public final MinMaxValue getPeriodEndDayOfMonth() {
        return this.periodEndDayOfMonth;
    }

    public int hashCode() {
        return this.periodEndDayOfMonth.hashCode();
    }

    public String toString() {
        return "CreditBillingSettings(periodEndDayOfMonth=" + this.periodEndDayOfMonth + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.periodEndDayOfMonth.writeToParcel(dest, i);
    }
}
