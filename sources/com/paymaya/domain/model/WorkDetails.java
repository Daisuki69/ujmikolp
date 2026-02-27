package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class WorkDetails implements Parcelable {
    public static final Parcelable.Creator<WorkDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("employmentDetails")
    private String employmentDetails;

    @InterfaceC1497a
    @InterfaceC1498b("incomeSource")
    private String incomeSource;

    @InterfaceC1497a
    @InterfaceC1498b("jobTitle")
    private String jobTitle;

    @InterfaceC1497a
    @InterfaceC1498b("monthlyIncome")
    private String monthlyIncome;

    @InterfaceC1497a
    @InterfaceC1498b("workNature")
    private String workNature;

    public static final class Creator implements Parcelable.Creator<WorkDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WorkDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new WorkDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WorkDetails[] newArray(int i) {
            return new WorkDetails[i];
        }
    }

    public WorkDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WorkDetails copy$default(WorkDetails workDetails, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workDetails.employmentDetails;
        }
        if ((i & 2) != 0) {
            str2 = workDetails.incomeSource;
        }
        if ((i & 4) != 0) {
            str3 = workDetails.jobTitle;
        }
        if ((i & 8) != 0) {
            str4 = workDetails.monthlyIncome;
        }
        if ((i & 16) != 0) {
            str5 = workDetails.workNature;
        }
        String str6 = str5;
        String str7 = str3;
        return workDetails.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.employmentDetails;
    }

    public final String component2() {
        return this.incomeSource;
    }

    public final String component3() {
        return this.jobTitle;
    }

    public final String component4() {
        return this.monthlyIncome;
    }

    public final String component5() {
        return this.workNature;
    }

    public final WorkDetails copy(String str, String str2, String str3, String str4, String str5) {
        return new WorkDetails(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkDetails)) {
            return false;
        }
        WorkDetails workDetails = (WorkDetails) obj;
        return j.b(this.employmentDetails, workDetails.employmentDetails) && j.b(this.incomeSource, workDetails.incomeSource) && j.b(this.jobTitle, workDetails.jobTitle) && j.b(this.monthlyIncome, workDetails.monthlyIncome) && j.b(this.workNature, workDetails.workNature);
    }

    public final String getEmploymentDetails() {
        return this.employmentDetails;
    }

    public final String getIncomeSource() {
        return this.incomeSource;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getMonthlyIncome() {
        return this.monthlyIncome;
    }

    public final String getWorkNature() {
        return this.workNature;
    }

    public int hashCode() {
        String str = this.employmentDetails;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.incomeSource;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jobTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.monthlyIncome;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.workNature;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setEmploymentDetails(String str) {
        this.employmentDetails = str;
    }

    public final void setIncomeSource(String str) {
        this.incomeSource = str;
    }

    public final void setJobTitle(String str) {
        this.jobTitle = str;
    }

    public final void setMonthlyIncome(String str) {
        this.monthlyIncome = str;
    }

    public final void setWorkNature(String str) {
        this.workNature = str;
    }

    public String toString() {
        String str = this.employmentDetails;
        String str2 = this.incomeSource;
        String str3 = this.jobTitle;
        String str4 = this.monthlyIncome;
        String str5 = this.workNature;
        StringBuilder sbX = s.x("WorkDetails(employmentDetails=", str, ", incomeSource=", str2, ", jobTitle=");
        c.A(sbX, str3, ", monthlyIncome=", str4, ", workNature=");
        return s.p(sbX, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.employmentDetails);
        dest.writeString(this.incomeSource);
        dest.writeString(this.jobTitle);
        dest.writeString(this.monthlyIncome);
        dest.writeString(this.workNature);
    }

    public WorkDetails(String str, String str2, String str3, String str4, String str5) {
        this.employmentDetails = str;
        this.incomeSource = str2;
        this.jobTitle = str3;
        this.monthlyIncome = str4;
        this.workNature = str5;
    }

    public /* synthetic */ WorkDetails(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
