package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class EDD implements Parcelable {
    public static final Parcelable.Creator<EDD> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("alternative_income_sources")
    private List<String> alternativeIncomeSources;

    @InterfaceC1497a
    @InterfaceC1498b("banks")
    private List<String> banks;

    @InterfaceC1497a
    @InterfaceC1498b("financial_docs")
    private List<EDDFinancialDocument> financialDocuments;

    @InterfaceC1497a
    @InterfaceC1498b("msisdn")
    private String msisdn;

    @InterfaceC1497a
    @InterfaceC1498b("related_companies")
    private List<String> relatedCompanies;

    @InterfaceC1497a
    @InterfaceC1498b("usage")
    private EDDUsage usage;

    public static final class Creator implements Parcelable.Creator<EDD> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EDD createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            ArrayList arrayList = null;
            EDDUsage eDDUsageCreateFromParcel = parcel.readInt() == 0 ? null : EDDUsage.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(EDDFinancialDocument.CREATOR, parcel, arrayList, I4, 1);
                }
            }
            return new EDD(string, eDDUsageCreateFromParcel, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EDD[] newArray(int i) {
            return new EDD[i];
        }
    }

    public EDD() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EDD copy$default(EDD edd, String str, EDDUsage eDDUsage, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = edd.msisdn;
        }
        if ((i & 2) != 0) {
            eDDUsage = edd.usage;
        }
        if ((i & 4) != 0) {
            list = edd.alternativeIncomeSources;
        }
        if ((i & 8) != 0) {
            list2 = edd.relatedCompanies;
        }
        if ((i & 16) != 0) {
            list3 = edd.banks;
        }
        if ((i & 32) != 0) {
            list4 = edd.financialDocuments;
        }
        List list5 = list3;
        List list6 = list4;
        return edd.copy(str, eDDUsage, list, list2, list5, list6);
    }

    public final String component1() {
        return this.msisdn;
    }

    public final EDDUsage component2() {
        return this.usage;
    }

    public final List<String> component3() {
        return this.alternativeIncomeSources;
    }

    public final List<String> component4() {
        return this.relatedCompanies;
    }

    public final List<String> component5() {
        return this.banks;
    }

    public final List<EDDFinancialDocument> component6() {
        return this.financialDocuments;
    }

    public final EDD copy(String str, EDDUsage eDDUsage, List<String> list, List<String> list2, List<String> list3, List<EDDFinancialDocument> list4) {
        return new EDD(str, eDDUsage, list, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDD)) {
            return false;
        }
        EDD edd = (EDD) obj;
        return j.b(this.msisdn, edd.msisdn) && j.b(this.usage, edd.usage) && j.b(this.alternativeIncomeSources, edd.alternativeIncomeSources) && j.b(this.relatedCompanies, edd.relatedCompanies) && j.b(this.banks, edd.banks) && j.b(this.financialDocuments, edd.financialDocuments);
    }

    public final List<String> getAlternativeIncomeSources() {
        return this.alternativeIncomeSources;
    }

    public final List<String> getBanks() {
        return this.banks;
    }

    public final List<EDDFinancialDocument> getFinancialDocuments() {
        return this.financialDocuments;
    }

    public final String getMsisdn() {
        return this.msisdn;
    }

    public final List<String> getRelatedCompanies() {
        return this.relatedCompanies;
    }

    public final EDDUsage getUsage() {
        return this.usage;
    }

    public int hashCode() {
        String str = this.msisdn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EDDUsage eDDUsage = this.usage;
        int iHashCode2 = (iHashCode + (eDDUsage == null ? 0 : eDDUsage.hashCode())) * 31;
        List<String> list = this.alternativeIncomeSources;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.relatedCompanies;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.banks;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<EDDFinancialDocument> list4 = this.financialDocuments;
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public final void reset() {
        this.usage = null;
        this.alternativeIncomeSources = null;
        this.relatedCompanies = null;
        this.banks = null;
        this.financialDocuments = null;
    }

    public final void setAlternativeIncomeSources(List<String> list) {
        this.alternativeIncomeSources = list;
    }

    public final void setBanks(List<String> list) {
        this.banks = list;
    }

    public final void setFinancialDocuments(List<EDDFinancialDocument> list) {
        this.financialDocuments = list;
    }

    public final void setMsisdn(String str) {
        this.msisdn = str;
    }

    public final void setRelatedCompanies(List<String> list) {
        this.relatedCompanies = list;
    }

    public final void setUsage(EDDUsage eDDUsage) {
        this.usage = eDDUsage;
    }

    public String toString() {
        return "EDD(msisdn=" + this.msisdn + ", usage=" + this.usage + ", alternativeIncomeSources=" + this.alternativeIncomeSources + ", relatedCompanies=" + this.relatedCompanies + ", banks=" + this.banks + ", financialDocuments=" + this.financialDocuments + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.msisdn);
        EDDUsage eDDUsage = this.usage;
        if (eDDUsage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eDDUsage.writeToParcel(dest, i);
        }
        dest.writeStringList(this.alternativeIncomeSources);
        dest.writeStringList(this.relatedCompanies);
        dest.writeStringList(this.banks);
        List<EDDFinancialDocument> list = this.financialDocuments;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((EDDFinancialDocument) itP.next()).writeToParcel(dest, i);
        }
    }

    public EDD(String str, EDDUsage eDDUsage, List<String> list, List<String> list2, List<String> list3, List<EDDFinancialDocument> list4) {
        this.msisdn = str;
        this.usage = eDDUsage;
        this.alternativeIncomeSources = list;
        this.relatedCompanies = list2;
        this.banks = list3;
        this.financialDocuments = list4;
    }

    public /* synthetic */ EDD(String str, EDDUsage eDDUsage, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : eDDUsage, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4);
    }
}
