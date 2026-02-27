package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoCashInCustomerSetup implements Parcelable {
    public static final Parcelable.Creator<AutoCashInCustomerSetup> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("amount_based")
    private final AutoCashInCustomerSetupTimeBased amountBased;

    @InterfaceC1497a
    @InterfaceC1498b("time_based")
    private final List<AutoCashInCustomerSetupTimeBased> timeBased;

    public static final class Creator implements Parcelable.Creator<AutoCashInCustomerSetup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoCashInCustomerSetup createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(AutoCashInCustomerSetupTimeBased.CREATOR, parcel, arrayList, I4, 1);
                }
            }
            return new AutoCashInCustomerSetup(arrayList, parcel.readInt() != 0 ? AutoCashInCustomerSetupTimeBased.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoCashInCustomerSetup[] newArray(int i) {
            return new AutoCashInCustomerSetup[i];
        }
    }

    public AutoCashInCustomerSetup(@Nullable List<AutoCashInCustomerSetupTimeBased> list, @Nullable AutoCashInCustomerSetupTimeBased autoCashInCustomerSetupTimeBased) {
        this.timeBased = list;
        this.amountBased = autoCashInCustomerSetupTimeBased;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoCashInCustomerSetup copy$default(AutoCashInCustomerSetup autoCashInCustomerSetup, List list, AutoCashInCustomerSetupTimeBased autoCashInCustomerSetupTimeBased, int i, Object obj) {
        if ((i & 1) != 0) {
            list = autoCashInCustomerSetup.timeBased;
        }
        if ((i & 2) != 0) {
            autoCashInCustomerSetupTimeBased = autoCashInCustomerSetup.amountBased;
        }
        return autoCashInCustomerSetup.copy(list, autoCashInCustomerSetupTimeBased);
    }

    public final List<AutoCashInCustomerSetupTimeBased> component1() {
        return this.timeBased;
    }

    public final AutoCashInCustomerSetupTimeBased component2() {
        return this.amountBased;
    }

    public final AutoCashInCustomerSetup copy(@Nullable List<AutoCashInCustomerSetupTimeBased> list, @Nullable AutoCashInCustomerSetupTimeBased autoCashInCustomerSetupTimeBased) {
        return new AutoCashInCustomerSetup(list, autoCashInCustomerSetupTimeBased);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCashInCustomerSetup)) {
            return false;
        }
        AutoCashInCustomerSetup autoCashInCustomerSetup = (AutoCashInCustomerSetup) obj;
        return j.b(this.timeBased, autoCashInCustomerSetup.timeBased) && j.b(this.amountBased, autoCashInCustomerSetup.amountBased);
    }

    public final AutoCashInCustomerSetupTimeBased getAmountBased() {
        return this.amountBased;
    }

    public final List<AutoCashInCustomerSetupTimeBased> getTimeBased() {
        return this.timeBased;
    }

    public int hashCode() {
        List<AutoCashInCustomerSetupTimeBased> list = this.timeBased;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        AutoCashInCustomerSetupTimeBased autoCashInCustomerSetupTimeBased = this.amountBased;
        return iHashCode + (autoCashInCustomerSetupTimeBased != null ? autoCashInCustomerSetupTimeBased.hashCode() : 0);
    }

    public String toString() {
        return "AutoCashInCustomerSetup(timeBased=" + this.timeBased + ", amountBased=" + this.amountBased + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<AutoCashInCustomerSetupTimeBased> list = this.timeBased;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((AutoCashInCustomerSetupTimeBased) itP.next()).writeToParcel(dest, i);
            }
        }
        AutoCashInCustomerSetupTimeBased autoCashInCustomerSetupTimeBased = this.amountBased;
        if (autoCashInCustomerSetupTimeBased == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autoCashInCustomerSetupTimeBased.writeToParcel(dest, i);
        }
    }
}
