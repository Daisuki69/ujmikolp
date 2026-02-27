package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditApplication implements Parcelable {
    public static final Parcelable.Creator<CreditApplication> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("application_number")
    private final String applicationNumber;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("loan_account_id")
    private final String loanAccountId;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    @InterfaceC1497a
    @InterfaceC1498b("term")
    private final CreditTerm term;

    public static final class Creator implements Parcelable.Creator<CreditApplication> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditApplication createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditApplication(parcel.readString(), parcel.readString(), CreditTerm.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditApplication[] newArray(int i) {
            return new CreditApplication[i];
        }
    }

    public CreditApplication(String id, String applicationNumber, CreditTerm term, String str, String status) {
        j.g(id, "id");
        j.g(applicationNumber, "applicationNumber");
        j.g(term, "term");
        j.g(status, "status");
        this.id = id;
        this.applicationNumber = applicationNumber;
        this.term = term;
        this.loanAccountId = str;
        this.status = status;
    }

    public static /* synthetic */ CreditApplication copy$default(CreditApplication creditApplication, String str, String str2, CreditTerm creditTerm, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditApplication.id;
        }
        if ((i & 2) != 0) {
            str2 = creditApplication.applicationNumber;
        }
        if ((i & 4) != 0) {
            creditTerm = creditApplication.term;
        }
        if ((i & 8) != 0) {
            str3 = creditApplication.loanAccountId;
        }
        if ((i & 16) != 0) {
            str4 = creditApplication.status;
        }
        String str5 = str4;
        CreditTerm creditTerm2 = creditTerm;
        return creditApplication.copy(str, str2, creditTerm2, str3, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.applicationNumber;
    }

    public final CreditTerm component3() {
        return this.term;
    }

    public final String component4() {
        return this.loanAccountId;
    }

    public final String component5() {
        return this.status;
    }

    public final CreditApplication copy(String id, String applicationNumber, CreditTerm term, String str, String status) {
        j.g(id, "id");
        j.g(applicationNumber, "applicationNumber");
        j.g(term, "term");
        j.g(status, "status");
        return new CreditApplication(id, applicationNumber, term, str, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditApplication)) {
            return false;
        }
        CreditApplication creditApplication = (CreditApplication) obj;
        return j.b(this.id, creditApplication.id) && j.b(this.applicationNumber, creditApplication.applicationNumber) && j.b(this.term, creditApplication.term) && j.b(this.loanAccountId, creditApplication.loanAccountId) && j.b(this.status, creditApplication.status);
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLoanAccountId() {
        return this.loanAccountId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final CreditTerm getTerm() {
        return this.term;
    }

    public int hashCode() {
        int iHashCode = (this.term.hashCode() + AbstractC1414e.c(this.id.hashCode() * 31, 31, this.applicationNumber)) * 31;
        String str = this.loanAccountId;
        return this.status.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.applicationNumber;
        CreditTerm creditTerm = this.term;
        String str3 = this.loanAccountId;
        String str4 = this.status;
        StringBuilder sbX = s.x("CreditApplication(id=", str, ", applicationNumber=", str2, ", term=");
        sbX.append(creditTerm);
        sbX.append(", loanAccountId=");
        sbX.append(str3);
        sbX.append(", status=");
        return s.p(sbX, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.applicationNumber);
        this.term.writeToParcel(dest, i);
        dest.writeString(this.loanAccountId);
        dest.writeString(this.status);
    }
}
