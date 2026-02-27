package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditEligibility implements Parcelable {
    public static final Parcelable.Creator<CreditEligibility> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("consents")
    private final List<CreditConsent> consents;

    @InterfaceC1497a
    @InterfaceC1498b("creditScore")
    private final Integer creditScore;

    @InterfaceC1497a
    @InterfaceC1498b("expiresOn")
    private final String expiresOn;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("isCreditScoringDataValid")
    private final Boolean isCreditScoringDataValid;

    @InterfaceC1497a
    @InterfaceC1498b("product")
    private final String product;

    @InterfaceC1497a
    @InterfaceC1498b("riskLevel")
    private final String riskLevel;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    @InterfaceC1497a
    @InterfaceC1498b("term")
    private final CreditTerm term;

    public static final class Creator implements Parcelable.Creator<CreditEligibility> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditEligibility createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(CreditConsent.CREATOR, parcel, arrayList, I4, 1);
            }
            Boolean boolValueOf = null;
            CreditTerm creditTermCreateFromParcel = parcel.readInt() == 0 ? null : CreditTerm.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CreditEligibility(arrayList, creditTermCreateFromParcel, string, string2, string3, string4, numValueOf, string5, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditEligibility[] newArray(int i) {
            return new CreditEligibility[i];
        }
    }

    public CreditEligibility(List<CreditConsent> consents, CreditTerm creditTerm, String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool) {
        j.g(consents, "consents");
        this.consents = consents;
        this.term = creditTerm;
        this.id = str;
        this.product = str2;
        this.status = str3;
        this.expiresOn = str4;
        this.creditScore = num;
        this.riskLevel = str5;
        this.isCreditScoringDataValid = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditEligibility copy$default(CreditEligibility creditEligibility, List list, CreditTerm creditTerm, String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = creditEligibility.consents;
        }
        if ((i & 2) != 0) {
            creditTerm = creditEligibility.term;
        }
        if ((i & 4) != 0) {
            str = creditEligibility.id;
        }
        if ((i & 8) != 0) {
            str2 = creditEligibility.product;
        }
        if ((i & 16) != 0) {
            str3 = creditEligibility.status;
        }
        if ((i & 32) != 0) {
            str4 = creditEligibility.expiresOn;
        }
        if ((i & 64) != 0) {
            num = creditEligibility.creditScore;
        }
        if ((i & 128) != 0) {
            str5 = creditEligibility.riskLevel;
        }
        if ((i & 256) != 0) {
            bool = creditEligibility.isCreditScoringDataValid;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        String str7 = str4;
        Integer num2 = num;
        String str8 = str3;
        String str9 = str;
        return creditEligibility.copy(list, creditTerm, str9, str2, str8, str7, num2, str6, bool2);
    }

    public final List<CreditConsent> component1() {
        return this.consents;
    }

    public final CreditTerm component2() {
        return this.term;
    }

    public final String component3() {
        return this.id;
    }

    public final String component4() {
        return this.product;
    }

    public final String component5() {
        return this.status;
    }

    public final String component6() {
        return this.expiresOn;
    }

    public final Integer component7() {
        return this.creditScore;
    }

    public final String component8() {
        return this.riskLevel;
    }

    public final Boolean component9() {
        return this.isCreditScoringDataValid;
    }

    public final CreditEligibility copy(List<CreditConsent> consents, CreditTerm creditTerm, String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool) {
        j.g(consents, "consents");
        return new CreditEligibility(consents, creditTerm, str, str2, str3, str4, num, str5, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditEligibility)) {
            return false;
        }
        CreditEligibility creditEligibility = (CreditEligibility) obj;
        return j.b(this.consents, creditEligibility.consents) && j.b(this.term, creditEligibility.term) && j.b(this.id, creditEligibility.id) && j.b(this.product, creditEligibility.product) && j.b(this.status, creditEligibility.status) && j.b(this.expiresOn, creditEligibility.expiresOn) && j.b(this.creditScore, creditEligibility.creditScore) && j.b(this.riskLevel, creditEligibility.riskLevel) && j.b(this.isCreditScoringDataValid, creditEligibility.isCreditScoringDataValid);
    }

    public final List<CreditConsent> getConsents() {
        return this.consents;
    }

    public final Integer getCreditScore() {
        return this.creditScore;
    }

    public final String getExpiresOn() {
        return this.expiresOn;
    }

    public final String getId() {
        return this.id;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getRiskLevel() {
        return this.riskLevel;
    }

    public final String getStatus() {
        return this.status;
    }

    public final CreditTerm getTerm() {
        return this.term;
    }

    public int hashCode() {
        int iHashCode = this.consents.hashCode() * 31;
        CreditTerm creditTerm = this.term;
        int iHashCode2 = (iHashCode + (creditTerm == null ? 0 : creditTerm.hashCode())) * 31;
        String str = this.id;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.product;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiresOn;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.creditScore;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.riskLevel;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isCreditScoringDataValid;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isCreditScoringDataValid() {
        return this.isCreditScoringDataValid;
    }

    public String toString() {
        List<CreditConsent> list = this.consents;
        CreditTerm creditTerm = this.term;
        String str = this.id;
        String str2 = this.product;
        String str3 = this.status;
        String str4 = this.expiresOn;
        Integer num = this.creditScore;
        String str5 = this.riskLevel;
        Boolean bool = this.isCreditScoringDataValid;
        StringBuilder sb2 = new StringBuilder("CreditEligibility(consents=");
        sb2.append(list);
        sb2.append(", term=");
        sb2.append(creditTerm);
        sb2.append(", id=");
        c.A(sb2, str, ", product=", str2, ", status=");
        c.A(sb2, str3, ", expiresOn=", str4, ", creditScore=");
        sb2.append(num);
        sb2.append(", riskLevel=");
        sb2.append(str5);
        sb2.append(", isCreditScoringDataValid=");
        return AbstractC1213b.N(sb2, bool, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.consents, dest);
        while (itQ.hasNext()) {
            ((CreditConsent) itQ.next()).writeToParcel(dest, i);
        }
        CreditTerm creditTerm = this.term;
        if (creditTerm == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditTerm.writeToParcel(dest, i);
        }
        dest.writeString(this.id);
        dest.writeString(this.product);
        dest.writeString(this.status);
        dest.writeString(this.expiresOn);
        Integer num = this.creditScore;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.riskLevel);
        Boolean bool = this.isCreditScoringDataValid;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
    }

    public /* synthetic */ CreditEligibility(List list, CreditTerm creditTerm, String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, creditTerm, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bool);
    }
}
