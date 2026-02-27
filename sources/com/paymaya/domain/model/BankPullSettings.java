package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BankPullSettings implements Parcelable {
    public static final Parcelable.Creator<BankPullSettings> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("currency")
    private final String currency;

    @InterfaceC1497a
    @InterfaceC1498b("note")
    private final String note;

    @InterfaceC1497a
    @InterfaceC1498b("payment_options")
    private final List<BankPullPaymentOption> paymentOptions;

    public static final class Creator implements Parcelable.Creator<BankPullSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankPullSettings createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(BankPullPaymentOption.CREATOR, parcel, arrayList, I4, 1);
            }
            return new BankPullSettings(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankPullSettings[] newArray(int i) {
            return new BankPullSettings[i];
        }
    }

    public BankPullSettings(String note, String currency, List<BankPullPaymentOption> paymentOptions) {
        j.g(note, "note");
        j.g(currency, "currency");
        j.g(paymentOptions, "paymentOptions");
        this.note = note;
        this.currency = currency;
        this.paymentOptions = paymentOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankPullSettings copy$default(BankPullSettings bankPullSettings, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankPullSettings.note;
        }
        if ((i & 2) != 0) {
            str2 = bankPullSettings.currency;
        }
        if ((i & 4) != 0) {
            list = bankPullSettings.paymentOptions;
        }
        return bankPullSettings.copy(str, str2, list);
    }

    public final String component1() {
        return this.note;
    }

    public final String component2() {
        return this.currency;
    }

    public final List<BankPullPaymentOption> component3() {
        return this.paymentOptions;
    }

    public final BankPullSettings copy(String note, String currency, List<BankPullPaymentOption> paymentOptions) {
        j.g(note, "note");
        j.g(currency, "currency");
        j.g(paymentOptions, "paymentOptions");
        return new BankPullSettings(note, currency, paymentOptions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankPullSettings)) {
            return false;
        }
        BankPullSettings bankPullSettings = (BankPullSettings) obj;
        return j.b(this.note, bankPullSettings.note) && j.b(this.currency, bankPullSettings.currency) && j.b(this.paymentOptions, bankPullSettings.paymentOptions);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getNote() {
        return this.note;
    }

    public final List<BankPullPaymentOption> getPaymentOptions() {
        return this.paymentOptions;
    }

    public int hashCode() {
        return this.paymentOptions.hashCode() + AbstractC1414e.c(this.note.hashCode() * 31, 31, this.currency);
    }

    public String toString() {
        String str = this.note;
        String str2 = this.currency;
        return s.r(s.x("BankPullSettings(note=", str, ", currency=", str2, ", paymentOptions="), this.paymentOptions, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.note);
        dest.writeString(this.currency);
        Iterator itQ = AbstractC1213b.Q(this.paymentOptions, dest);
        while (itQ.hasNext()) {
            ((BankPullPaymentOption) itQ.next()).writeToParcel(dest, i);
        }
    }
}
