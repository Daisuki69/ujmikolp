package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditInitialEligibility implements Parcelable {
    public static final Parcelable.Creator<CreditInitialEligibility> CREATOR = new Creator();

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

    public static final class Creator implements Parcelable.Creator<CreditInitialEligibility> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditInitialEligibility createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            Boolean boolValueOf = null;
            CreditTerm creditTermCreateFromParcel = parcel.readInt() == 0 ? null : CreditTerm.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CreditInitialEligibility(creditTermCreateFromParcel, string, string2, string3, string4, string5, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditInitialEligibility[] newArray(int i) {
            return new CreditInitialEligibility[i];
        }
    }

    public CreditInitialEligibility(CreditTerm creditTerm, String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.term = creditTerm;
        this.id = str;
        this.product = str2;
        this.status = str3;
        this.expiresOn = str4;
        this.riskLevel = str5;
        this.isCreditScoringDataValid = bool;
    }

    public static /* synthetic */ CreditInitialEligibility copy$default(CreditInitialEligibility creditInitialEligibility, CreditTerm creditTerm, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            creditTerm = creditInitialEligibility.term;
        }
        if ((i & 2) != 0) {
            str = creditInitialEligibility.id;
        }
        if ((i & 4) != 0) {
            str2 = creditInitialEligibility.product;
        }
        if ((i & 8) != 0) {
            str3 = creditInitialEligibility.status;
        }
        if ((i & 16) != 0) {
            str4 = creditInitialEligibility.expiresOn;
        }
        if ((i & 32) != 0) {
            str5 = creditInitialEligibility.riskLevel;
        }
        if ((i & 64) != 0) {
            bool = creditInitialEligibility.isCreditScoringDataValid;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        String str7 = str4;
        String str8 = str2;
        return creditInitialEligibility.copy(creditTerm, str, str8, str3, str7, str6, bool2);
    }

    public final CreditTerm component1() {
        return this.term;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.product;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.expiresOn;
    }

    public final String component6() {
        return this.riskLevel;
    }

    public final Boolean component7() {
        return this.isCreditScoringDataValid;
    }

    public final CreditInitialEligibility copy(CreditTerm creditTerm, String str, String str2, String str3, String str4, String str5, Boolean bool) {
        return new CreditInitialEligibility(creditTerm, str, str2, str3, str4, str5, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditInitialEligibility)) {
            return false;
        }
        CreditInitialEligibility creditInitialEligibility = (CreditInitialEligibility) obj;
        return j.b(this.term, creditInitialEligibility.term) && j.b(this.id, creditInitialEligibility.id) && j.b(this.product, creditInitialEligibility.product) && j.b(this.status, creditInitialEligibility.status) && j.b(this.expiresOn, creditInitialEligibility.expiresOn) && j.b(this.riskLevel, creditInitialEligibility.riskLevel) && j.b(this.isCreditScoringDataValid, creditInitialEligibility.isCreditScoringDataValid);
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
        CreditTerm creditTerm = this.term;
        int iHashCode = (creditTerm == null ? 0 : creditTerm.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.product;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiresOn;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.riskLevel;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isCreditScoringDataValid;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isCreditScoringDataValid() {
        return this.isCreditScoringDataValid;
    }

    public String toString() {
        CreditTerm creditTerm = this.term;
        String str = this.id;
        String str2 = this.product;
        String str3 = this.status;
        String str4 = this.expiresOn;
        String str5 = this.riskLevel;
        Boolean bool = this.isCreditScoringDataValid;
        StringBuilder sb2 = new StringBuilder("CreditInitialEligibility(term=");
        sb2.append(creditTerm);
        sb2.append(", id=");
        sb2.append(str);
        sb2.append(", product=");
        c.A(sb2, str2, ", status=", str3, ", expiresOn=");
        c.A(sb2, str4, ", riskLevel=", str5, ", isCreditScoringDataValid=");
        return AbstractC1213b.N(sb2, bool, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
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
        dest.writeString(this.riskLevel);
        Boolean bool = this.isCreditScoringDataValid;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
    }

    public /* synthetic */ CreditInitialEligibility(CreditTerm creditTerm, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(creditTerm, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? Boolean.FALSE : bool);
    }
}
