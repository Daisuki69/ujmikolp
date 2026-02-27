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
public final class CreditAgreements implements Parcelable {
    public static final Parcelable.Creator<CreditAgreements> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("agreements")
    private final List<CreditAgreement> agreements;

    public static final class Creator implements Parcelable.Creator<CreditAgreements> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditAgreements createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(CreditAgreement.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new CreditAgreements(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditAgreements[] newArray(int i) {
            return new CreditAgreements[i];
        }
    }

    public CreditAgreements(List<CreditAgreement> list) {
        this.agreements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditAgreements copy$default(CreditAgreements creditAgreements, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = creditAgreements.agreements;
        }
        return creditAgreements.copy(list);
    }

    public final List<CreditAgreement> component1() {
        return this.agreements;
    }

    public final CreditAgreements copy(List<CreditAgreement> list) {
        return new CreditAgreements(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditAgreements) && j.b(this.agreements, ((CreditAgreements) obj).agreements);
    }

    public final List<CreditAgreement> getAgreements() {
        return this.agreements;
    }

    public int hashCode() {
        List<CreditAgreement> list = this.agreements;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "CreditAgreements(agreements=" + this.agreements + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<CreditAgreement> list = this.agreements;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((CreditAgreement) itP.next()).writeToParcel(dest, i);
        }
    }
}
