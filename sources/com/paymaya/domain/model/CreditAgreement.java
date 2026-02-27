package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditAgreement implements Parcelable {
    public static final Parcelable.Creator<CreditAgreement> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("contents")
    private final String contents;

    @InterfaceC1497a
    @InterfaceC1498b("heading")
    private final String heading;
    private Boolean isBlockShowAgreement;
    private Boolean isItemChecked;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    @InterfaceC1497a
    @InterfaceC1498b("mandatory")
    private final boolean mandatory;

    @InterfaceC1497a
    @InterfaceC1498b("subheading")
    private final String subheading;
    private String title;

    public static final class Creator implements Parcelable.Creator<CreditAgreement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditAgreement createFromParcel(Parcel parcel) {
            boolean z4;
            boolean z5;
            Boolean boolValueOf;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z8 = false;
            if (parcel.readInt() != 0) {
                z4 = false;
                z8 = true;
                z5 = true;
            } else {
                z4 = false;
                z5 = true;
            }
            String string4 = parcel.readString();
            boolean z9 = z5;
            String string5 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z9 : z4);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z4 = z9;
                }
                boolValueOf2 = Boolean.valueOf(z4);
            }
            return new CreditAgreement(string, string2, string3, z8, string4, string5, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditAgreement[] newArray(int i) {
            return new CreditAgreement[i];
        }
    }

    public CreditAgreement(String heading, String subheading, String contents, boolean z4, String key, String str, Boolean bool, Boolean bool2) {
        j.g(heading, "heading");
        j.g(subheading, "subheading");
        j.g(contents, "contents");
        j.g(key, "key");
        this.heading = heading;
        this.subheading = subheading;
        this.contents = contents;
        this.mandatory = z4;
        this.key = key;
        this.title = str;
        this.isItemChecked = bool;
        this.isBlockShowAgreement = bool2;
    }

    public static /* synthetic */ CreditAgreement copy$default(CreditAgreement creditAgreement, String str, String str2, String str3, boolean z4, String str4, String str5, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditAgreement.heading;
        }
        if ((i & 2) != 0) {
            str2 = creditAgreement.subheading;
        }
        if ((i & 4) != 0) {
            str3 = creditAgreement.contents;
        }
        if ((i & 8) != 0) {
            z4 = creditAgreement.mandatory;
        }
        if ((i & 16) != 0) {
            str4 = creditAgreement.key;
        }
        if ((i & 32) != 0) {
            str5 = creditAgreement.title;
        }
        if ((i & 64) != 0) {
            bool = creditAgreement.isItemChecked;
        }
        if ((i & 128) != 0) {
            bool2 = creditAgreement.isBlockShowAgreement;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str6 = str4;
        String str7 = str5;
        return creditAgreement.copy(str, str2, str3, z4, str6, str7, bool3, bool4);
    }

    public final String component1() {
        return this.heading;
    }

    public final String component2() {
        return this.subheading;
    }

    public final String component3() {
        return this.contents;
    }

    public final boolean component4() {
        return this.mandatory;
    }

    public final String component5() {
        return this.key;
    }

    public final String component6() {
        return this.title;
    }

    public final Boolean component7() {
        return this.isItemChecked;
    }

    public final Boolean component8() {
        return this.isBlockShowAgreement;
    }

    public final CreditAgreement copy(String heading, String subheading, String contents, boolean z4, String key, String str, Boolean bool, Boolean bool2) {
        j.g(heading, "heading");
        j.g(subheading, "subheading");
        j.g(contents, "contents");
        j.g(key, "key");
        return new CreditAgreement(heading, subheading, contents, z4, key, str, bool, bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditAgreement)) {
            return false;
        }
        CreditAgreement creditAgreement = (CreditAgreement) obj;
        return j.b(this.heading, creditAgreement.heading) && j.b(this.subheading, creditAgreement.subheading) && j.b(this.contents, creditAgreement.contents) && this.mandatory == creditAgreement.mandatory && j.b(this.key, creditAgreement.key) && j.b(this.title, creditAgreement.title) && j.b(this.isItemChecked, creditAgreement.isItemChecked) && j.b(this.isBlockShowAgreement, creditAgreement.isBlockShowAgreement);
    }

    public final String getContents() {
        return this.contents;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c((AbstractC1414e.c(AbstractC1414e.c(this.heading.hashCode() * 31, 31, this.subheading), 31, this.contents) + (this.mandatory ? 1231 : 1237)) * 31, 31, this.key);
        String str = this.title;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isItemChecked;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBlockShowAgreement;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isBlockShowAgreement() {
        return this.isBlockShowAgreement;
    }

    public final Boolean isItemChecked() {
        return this.isItemChecked;
    }

    public final boolean isValid() {
        if (!this.mandatory) {
            return true;
        }
        Boolean bool = this.isItemChecked;
        return bool != null && j.b(bool, Boolean.TRUE);
    }

    public final void setBlockShowAgreement(Boolean bool) {
        this.isBlockShowAgreement = bool;
    }

    public final void setItemChecked(Boolean bool) {
        this.isItemChecked = bool;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        String str = this.heading;
        String str2 = this.subheading;
        String str3 = this.contents;
        boolean z4 = this.mandatory;
        String str4 = this.key;
        String str5 = this.title;
        Boolean bool = this.isItemChecked;
        Boolean bool2 = this.isBlockShowAgreement;
        StringBuilder sbX = s.x("CreditAgreement(heading=", str, ", subheading=", str2, ", contents=");
        sbX.append(str3);
        sbX.append(", mandatory=");
        sbX.append(z4);
        sbX.append(", key=");
        c.A(sbX, str4, ", title=", str5, ", isItemChecked=");
        sbX.append(bool);
        sbX.append(", isBlockShowAgreement=");
        sbX.append(bool2);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.heading);
        dest.writeString(this.subheading);
        dest.writeString(this.contents);
        dest.writeInt(this.mandatory ? 1 : 0);
        dest.writeString(this.key);
        dest.writeString(this.title);
        Boolean bool = this.isItemChecked;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
        Boolean bool2 = this.isBlockShowAgreement;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool2);
        }
    }

    public /* synthetic */ CreditAgreement(String str, String str2, String str3, boolean z4, String str4, String str5, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z4, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? Boolean.FALSE : bool2);
    }
}
