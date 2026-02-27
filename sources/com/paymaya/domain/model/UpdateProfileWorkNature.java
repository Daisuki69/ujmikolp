package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateProfileWorkNature implements Parcelable {
    public static final Parcelable.Creator<UpdateProfileWorkNature> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("prohibited_income_sources")
    private final List<ProhibitedIncomeSource> prohibitedIncomeSources;

    @InterfaceC1497a
    @InterfaceC1498b("prohibited_job_titles")
    private final List<ProhibitedJobTitle> prohibitedJobTitles;

    @InterfaceC1497a
    @InterfaceC1498b("requires_employment_details")
    private final boolean requiresEmploymentDetails;

    public static final class Creator implements Parcelable.Creator<UpdateProfileWorkNature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileWorkNature createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(ProhibitedIncomeSource.CREATOR, parcel, arrayList, I4, 1);
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            int I9 = 0;
            while (I9 != i4) {
                I9 = AbstractC1213b.I(ProhibitedJobTitle.CREATOR, parcel, arrayList2, I9, 1);
            }
            return new UpdateProfileWorkNature(string, string2, arrayList, arrayList2, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileWorkNature[] newArray(int i) {
            return new UpdateProfileWorkNature[i];
        }
    }

    public UpdateProfileWorkNature(String code, String name, List<ProhibitedIncomeSource> prohibitedIncomeSources, List<ProhibitedJobTitle> prohibitedJobTitles, boolean z4) {
        j.g(code, "code");
        j.g(name, "name");
        j.g(prohibitedIncomeSources, "prohibitedIncomeSources");
        j.g(prohibitedJobTitles, "prohibitedJobTitles");
        this.code = code;
        this.name = name;
        this.prohibitedIncomeSources = prohibitedIncomeSources;
        this.prohibitedJobTitles = prohibitedJobTitles;
        this.requiresEmploymentDetails = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateProfileWorkNature copy$default(UpdateProfileWorkNature updateProfileWorkNature, String str, String str2, List list, List list2, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateProfileWorkNature.code;
        }
        if ((i & 2) != 0) {
            str2 = updateProfileWorkNature.name;
        }
        if ((i & 4) != 0) {
            list = updateProfileWorkNature.prohibitedIncomeSources;
        }
        if ((i & 8) != 0) {
            list2 = updateProfileWorkNature.prohibitedJobTitles;
        }
        if ((i & 16) != 0) {
            z4 = updateProfileWorkNature.requiresEmploymentDetails;
        }
        boolean z5 = z4;
        List list3 = list;
        return updateProfileWorkNature.copy(str, str2, list3, list2, z5);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final List<ProhibitedIncomeSource> component3() {
        return this.prohibitedIncomeSources;
    }

    public final List<ProhibitedJobTitle> component4() {
        return this.prohibitedJobTitles;
    }

    public final boolean component5() {
        return this.requiresEmploymentDetails;
    }

    public final UpdateProfileWorkNature copy(String code, String name, List<ProhibitedIncomeSource> prohibitedIncomeSources, List<ProhibitedJobTitle> prohibitedJobTitles, boolean z4) {
        j.g(code, "code");
        j.g(name, "name");
        j.g(prohibitedIncomeSources, "prohibitedIncomeSources");
        j.g(prohibitedJobTitles, "prohibitedJobTitles");
        return new UpdateProfileWorkNature(code, name, prohibitedIncomeSources, prohibitedJobTitles, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProfileWorkNature)) {
            return false;
        }
        UpdateProfileWorkNature updateProfileWorkNature = (UpdateProfileWorkNature) obj;
        return j.b(this.code, updateProfileWorkNature.code) && j.b(this.name, updateProfileWorkNature.name) && j.b(this.prohibitedIncomeSources, updateProfileWorkNature.prohibitedIncomeSources) && j.b(this.prohibitedJobTitles, updateProfileWorkNature.prohibitedJobTitles) && this.requiresEmploymentDetails == updateProfileWorkNature.requiresEmploymentDetails;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ProhibitedIncomeSource> getProhibitedIncomeSources() {
        return this.prohibitedIncomeSources;
    }

    public final List<ProhibitedJobTitle> getProhibitedJobTitles() {
        return this.prohibitedJobTitles;
    }

    public final boolean getRequiresEmploymentDetails() {
        return this.requiresEmploymentDetails;
    }

    public int hashCode() {
        return AbstractC1414e.d(this.prohibitedJobTitles, AbstractC1414e.d(this.prohibitedIncomeSources, AbstractC1414e.c(this.code.hashCode() * 31, 31, this.name), 31), 31) + (this.requiresEmploymentDetails ? 1231 : 1237);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.name;
        List<ProhibitedIncomeSource> list = this.prohibitedIncomeSources;
        List<ProhibitedJobTitle> list2 = this.prohibitedJobTitles;
        boolean z4 = this.requiresEmploymentDetails;
        StringBuilder sbX = s.x("UpdateProfileWorkNature(code=", str, ", name=", str2, ", prohibitedIncomeSources=");
        sbX.append(list);
        sbX.append(", prohibitedJobTitles=");
        sbX.append(list2);
        sbX.append(", requiresEmploymentDetails=");
        return s.s(sbX, z4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
        Iterator itQ = AbstractC1213b.Q(this.prohibitedIncomeSources, dest);
        while (itQ.hasNext()) {
            ((ProhibitedIncomeSource) itQ.next()).writeToParcel(dest, i);
        }
        Iterator itQ2 = AbstractC1213b.Q(this.prohibitedJobTitles, dest);
        while (itQ2.hasNext()) {
            ((ProhibitedJobTitle) itQ2.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.requiresEmploymentDetails ? 1 : 0);
    }
}
