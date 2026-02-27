package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessingFees implements Parcelable {
    public static final Parcelable.Creator<ProcessingFees> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("fees")
    private final List<ProcessingFee> fees;

    @InterfaceC1497a
    @InterfaceC1498b("taxes")
    private final List<ProcessingFee> taxes;

    public static final class Creator implements Parcelable.Creator<ProcessingFees> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProcessingFees createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            int I9 = 0;
            while (I9 != i) {
                I9 = AbstractC1213b.I(ProcessingFee.CREATOR, parcel, arrayList, I9, 1);
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            while (I4 != i4) {
                I4 = AbstractC1213b.I(ProcessingFee.CREATOR, parcel, arrayList2, I4, 1);
            }
            return new ProcessingFees(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProcessingFees[] newArray(int i) {
            return new ProcessingFees[i];
        }
    }

    public ProcessingFees(List<ProcessingFee> fees, List<ProcessingFee> taxes) {
        j.g(fees, "fees");
        j.g(taxes, "taxes");
        this.fees = fees;
        this.taxes = taxes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProcessingFees copy$default(ProcessingFees processingFees, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = processingFees.fees;
        }
        if ((i & 2) != 0) {
            list2 = processingFees.taxes;
        }
        return processingFees.copy(list, list2);
    }

    public final List<ProcessingFee> component1() {
        return this.fees;
    }

    public final List<ProcessingFee> component2() {
        return this.taxes;
    }

    public final ProcessingFees copy(List<ProcessingFee> fees, List<ProcessingFee> taxes) {
        j.g(fees, "fees");
        j.g(taxes, "taxes");
        return new ProcessingFees(fees, taxes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessingFees)) {
            return false;
        }
        ProcessingFees processingFees = (ProcessingFees) obj;
        return j.b(this.fees, processingFees.fees) && j.b(this.taxes, processingFees.taxes);
    }

    public final List<ProcessingFee> getFees() {
        return this.fees;
    }

    public final List<ProcessingFee> getTaxes() {
        return this.taxes;
    }

    public int hashCode() {
        return this.taxes.hashCode() + (this.fees.hashCode() * 31);
    }

    public String toString() {
        return "ProcessingFees(fees=" + this.fees + ", taxes=" + this.taxes + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.fees, dest);
        while (itQ.hasNext()) {
            ((ProcessingFee) itQ.next()).writeToParcel(dest, i);
        }
        Iterator itQ2 = AbstractC1213b.Q(this.taxes, dest);
        while (itQ2.hasNext()) {
            ((ProcessingFee) itQ2.next()).writeToParcel(dest, i);
        }
    }
}
