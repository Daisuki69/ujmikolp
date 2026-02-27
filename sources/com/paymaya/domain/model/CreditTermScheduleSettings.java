package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditTermScheduleSettings implements Parcelable {
    public static final Parcelable.Creator<CreditTermScheduleSettings> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("billing_settings")
    private final CreditBillingSettings billingSettings;

    @InterfaceC1497a
    @InterfaceC1498b("grace_period_settings")
    private final CreditGracePeriodSettings gracePeriodSettings;

    @InterfaceC1497a
    @InterfaceC1498b("user_preference")
    private final CreditUserPreference userPreference;

    public static final class Creator implements Parcelable.Creator<CreditTermScheduleSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditTermScheduleSettings createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditTermScheduleSettings(CreditGracePeriodSettings.CREATOR.createFromParcel(parcel), CreditBillingSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditUserPreference.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditTermScheduleSettings[] newArray(int i) {
            return new CreditTermScheduleSettings[i];
        }
    }

    public CreditTermScheduleSettings(CreditGracePeriodSettings gracePeriodSettings, CreditBillingSettings billingSettings, CreditUserPreference creditUserPreference) {
        j.g(gracePeriodSettings, "gracePeriodSettings");
        j.g(billingSettings, "billingSettings");
        this.gracePeriodSettings = gracePeriodSettings;
        this.billingSettings = billingSettings;
        this.userPreference = creditUserPreference;
    }

    public static /* synthetic */ CreditTermScheduleSettings copy$default(CreditTermScheduleSettings creditTermScheduleSettings, CreditGracePeriodSettings creditGracePeriodSettings, CreditBillingSettings creditBillingSettings, CreditUserPreference creditUserPreference, int i, Object obj) {
        if ((i & 1) != 0) {
            creditGracePeriodSettings = creditTermScheduleSettings.gracePeriodSettings;
        }
        if ((i & 2) != 0) {
            creditBillingSettings = creditTermScheduleSettings.billingSettings;
        }
        if ((i & 4) != 0) {
            creditUserPreference = creditTermScheduleSettings.userPreference;
        }
        return creditTermScheduleSettings.copy(creditGracePeriodSettings, creditBillingSettings, creditUserPreference);
    }

    public final CreditGracePeriodSettings component1() {
        return this.gracePeriodSettings;
    }

    public final CreditBillingSettings component2() {
        return this.billingSettings;
    }

    public final CreditUserPreference component3() {
        return this.userPreference;
    }

    public final CreditTermScheduleSettings copy(CreditGracePeriodSettings gracePeriodSettings, CreditBillingSettings billingSettings, CreditUserPreference creditUserPreference) {
        j.g(gracePeriodSettings, "gracePeriodSettings");
        j.g(billingSettings, "billingSettings");
        return new CreditTermScheduleSettings(gracePeriodSettings, billingSettings, creditUserPreference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditTermScheduleSettings)) {
            return false;
        }
        CreditTermScheduleSettings creditTermScheduleSettings = (CreditTermScheduleSettings) obj;
        return j.b(this.gracePeriodSettings, creditTermScheduleSettings.gracePeriodSettings) && j.b(this.billingSettings, creditTermScheduleSettings.billingSettings) && j.b(this.userPreference, creditTermScheduleSettings.userPreference);
    }

    public final CreditBillingSettings getBillingSettings() {
        return this.billingSettings;
    }

    public final CreditGracePeriodSettings getGracePeriodSettings() {
        return this.gracePeriodSettings;
    }

    public final CreditUserPreference getUserPreference() {
        return this.userPreference;
    }

    public int hashCode() {
        int iHashCode = (this.billingSettings.hashCode() + (this.gracePeriodSettings.hashCode() * 31)) * 31;
        CreditUserPreference creditUserPreference = this.userPreference;
        return iHashCode + (creditUserPreference == null ? 0 : creditUserPreference.hashCode());
    }

    public String toString() {
        return "CreditTermScheduleSettings(gracePeriodSettings=" + this.gracePeriodSettings + ", billingSettings=" + this.billingSettings + ", userPreference=" + this.userPreference + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.gracePeriodSettings.writeToParcel(dest, i);
        this.billingSettings.writeToParcel(dest, i);
        CreditUserPreference creditUserPreference = this.userPreference;
        if (creditUserPreference == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditUserPreference.writeToParcel(dest, i);
        }
    }
}
