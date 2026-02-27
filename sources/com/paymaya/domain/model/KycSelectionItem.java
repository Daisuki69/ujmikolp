package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycSelectionItem implements Parcelable {
    private static final int UNDEFINED_ID = -1;
    private final int id;
    private final String key;
    private final boolean showWarning;
    private final String text;
    private final String warningMessage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KycSelectionItem> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ KycSelectionItem toSelectionItem$default(Companion companion, KycWorkNature kycWorkNature, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.toSelectionItem(kycWorkNature, str);
        }

        public final KycSelectionItem toSelectionItem(KycWorkNature kycWorkNature, String str) {
            j.g(kycWorkNature, "<this>");
            Integer id = kycWorkNature.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String description = kycWorkNature.getDescription();
            if (description == null) {
                description = "";
            }
            return new KycSelectionItem(iIntValue, description, null, str, !(str == null || str.length() == 0), 4, null);
        }

        private Companion() {
        }

        public static /* synthetic */ KycSelectionItem toSelectionItem$default(Companion companion, KycIncomeSource kycIncomeSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.toSelectionItem(kycIncomeSource, str);
        }

        public static /* synthetic */ KycSelectionItem toSelectionItem$default(Companion companion, KycJobTitle kycJobTitle, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.toSelectionItem(kycJobTitle, str);
        }

        public final KycSelectionItem toSelectionItem(KycIncomeSource kycIncomeSource, String str) {
            j.g(kycIncomeSource, "<this>");
            Integer id = kycIncomeSource.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String description = kycIncomeSource.getDescription();
            if (description == null) {
                description = "";
            }
            return new KycSelectionItem(iIntValue, description, null, str, !(str == null || str.length() == 0), 4, null);
        }

        public final KycSelectionItem toSelectionItem(KycNationality kycNationality) {
            j.g(kycNationality, "<this>");
            Integer id = kycNationality.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String name = kycNationality.getName();
            if (name == null) {
                name = "";
            }
            return new KycSelectionItem(iIntValue, name, null, null, false, 28, null);
        }

        public final KycSelectionItem toSelectionItem(KycCountry kycCountry) {
            j.g(kycCountry, "<this>");
            Integer id = kycCountry.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String name = kycCountry.getName();
            if (name == null) {
                name = "";
            }
            return new KycSelectionItem(iIntValue, name, null, null, false, 28, null);
        }

        public final KycSelectionItem toSelectionItem(KycCmsAddressProvince kycCmsAddressProvince) {
            j.g(kycCmsAddressProvince, "<this>");
            Integer id = kycCmsAddressProvince.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String name = kycCmsAddressProvince.getName();
            if (name == null) {
                name = "";
            }
            return new KycSelectionItem(iIntValue, name, null, null, false, 28, null);
        }

        public final KycSelectionItem toSelectionItem(KycCmsAddressCity kycCmsAddressCity) {
            j.g(kycCmsAddressCity, "<this>");
            Integer id = kycCmsAddressCity.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String name = kycCmsAddressCity.getName();
            if (name == null) {
                name = "";
            }
            return new KycSelectionItem(iIntValue, name, null, null, false, 28, null);
        }

        public final KycSelectionItem toSelectionItem(KycCmsAddressLocality kycCmsAddressLocality) {
            j.g(kycCmsAddressLocality, "<this>");
            Integer id = kycCmsAddressLocality.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String name = kycCmsAddressLocality.getName();
            if (name == null) {
                name = "";
            }
            return new KycSelectionItem(iIntValue, name, null, null, false, 28, null);
        }

        public final KycSelectionItem toSelectionItem(KycCmsAddressZipCode kycCmsAddressZipCode) {
            j.g(kycCmsAddressZipCode, "<this>");
            Integer id = kycCmsAddressZipCode.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String code = kycCmsAddressZipCode.getCode();
            if (code == null) {
                code = "";
            }
            return new KycSelectionItem(iIntValue, code, null, null, false, 28, null);
        }

        public final KycSelectionItem toSelectionItem(KycJobTitle kycJobTitle, String str) {
            j.g(kycJobTitle, "<this>");
            Integer id = kycJobTitle.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String name = kycJobTitle.getName();
            if (name == null) {
                name = "";
            }
            return new KycSelectionItem(iIntValue, name, null, str, !(str == null || str.length() == 0), 4, null);
        }

        public final KycSelectionItem toSelectionItem(DosriRelationship dosriRelationship) {
            j.g(dosriRelationship, "<this>");
            Integer id = dosriRelationship.getId();
            int iIntValue = id != null ? id.intValue() : -1;
            String description = dosriRelationship.getDescription();
            if (description == null) {
                description = "";
            }
            return new KycSelectionItem(iIntValue, description, dosriRelationship.getKey(), null, false, 24, null);
        }
    }

    public static final class Creator implements Parcelable.Creator<KycSelectionItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSelectionItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycSelectionItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSelectionItem[] newArray(int i) {
            return new KycSelectionItem[i];
        }
    }

    public KycSelectionItem(int i, String text, String str, String str2, boolean z4) {
        j.g(text, "text");
        this.id = i;
        this.text = text;
        this.key = str;
        this.warningMessage = str2;
        this.showWarning = z4;
    }

    public static /* synthetic */ KycSelectionItem copy$default(KycSelectionItem kycSelectionItem, int i, String str, String str2, String str3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycSelectionItem.id;
        }
        if ((i4 & 2) != 0) {
            str = kycSelectionItem.text;
        }
        if ((i4 & 4) != 0) {
            str2 = kycSelectionItem.key;
        }
        if ((i4 & 8) != 0) {
            str3 = kycSelectionItem.warningMessage;
        }
        if ((i4 & 16) != 0) {
            z4 = kycSelectionItem.showWarning;
        }
        boolean z5 = z4;
        String str4 = str2;
        return kycSelectionItem.copy(i, str, str4, str3, z5);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.key;
    }

    public final String component4() {
        return this.warningMessage;
    }

    public final boolean component5() {
        return this.showWarning;
    }

    public final KycSelectionItem copy(int i, String text, String str, String str2, boolean z4) {
        j.g(text, "text");
        return new KycSelectionItem(i, text, str, str2, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycSelectionItem)) {
            return false;
        }
        KycSelectionItem kycSelectionItem = (KycSelectionItem) obj;
        return this.id == kycSelectionItem.id && j.b(this.text, kycSelectionItem.text) && j.b(this.key, kycSelectionItem.key) && j.b(this.warningMessage, kycSelectionItem.warningMessage) && this.showWarning == kycSelectionItem.showWarning;
    }

    public final int getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getShowWarning() {
        return this.showWarning;
    }

    public final String getText() {
        return this.text;
    }

    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(this.id * 31, 31, this.text);
        String str = this.key;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.warningMessage;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.showWarning ? 1231 : 1237);
    }

    public String toString() {
        int i = this.id;
        String str = this.text;
        String str2 = this.key;
        String str3 = this.warningMessage;
        boolean z4 = this.showWarning;
        StringBuilder sb2 = new StringBuilder("KycSelectionItem(id=");
        sb2.append(i);
        sb2.append(", text=");
        sb2.append(str);
        sb2.append(", key=");
        c.A(sb2, str2, ", warningMessage=", str3, ", showWarning=");
        return s.s(sb2, z4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.text);
        dest.writeString(this.key);
        dest.writeString(this.warningMessage);
        dest.writeInt(this.showWarning ? 1 : 0);
    }

    public /* synthetic */ KycSelectionItem(int i, String str, String str2, String str3, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? false : z4);
    }
}
