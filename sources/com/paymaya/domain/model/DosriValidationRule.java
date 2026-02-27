package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DosriValidationRule implements Parcelable {
    public static final Parcelable.Creator<DosriValidationRule> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("additionalRule")
    private final String additionalRule;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("message")
    private final String message;

    @InterfaceC1497a
    @InterfaceC1498b("regex")
    private final String regex;

    @InterfaceC1497a
    @InterfaceC1498b("validation_fields")
    private final List<DosriValidationField> validationFields;

    public static final class Creator implements Parcelable.Creator<DosriValidationRule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriValidationRule createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(DosriValidationField.CREATOR, parcel, arrayList, I4, 1);
                }
            }
            return new DosriValidationRule(string, numValueOf, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriValidationRule[] newArray(int i) {
            return new DosriValidationRule[i];
        }
    }

    public DosriValidationRule() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DosriValidationRule copy$default(DosriValidationRule dosriValidationRule, String str, Integer num, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dosriValidationRule.additionalRule;
        }
        if ((i & 2) != 0) {
            num = dosriValidationRule.id;
        }
        if ((i & 4) != 0) {
            str2 = dosriValidationRule.message;
        }
        if ((i & 8) != 0) {
            str3 = dosriValidationRule.regex;
        }
        if ((i & 16) != 0) {
            list = dosriValidationRule.validationFields;
        }
        List list2 = list;
        String str4 = str2;
        return dosriValidationRule.copy(str, num, str4, str3, list2);
    }

    public final String component1() {
        return this.additionalRule;
    }

    public final Integer component2() {
        return this.id;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.regex;
    }

    public final List<DosriValidationField> component5() {
        return this.validationFields;
    }

    public final DosriValidationRule copy(String str, Integer num, String str2, String str3, List<DosriValidationField> list) {
        return new DosriValidationRule(str, num, str2, str3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DosriValidationRule)) {
            return false;
        }
        DosriValidationRule dosriValidationRule = (DosriValidationRule) obj;
        return j.b(this.additionalRule, dosriValidationRule.additionalRule) && j.b(this.id, dosriValidationRule.id) && j.b(this.message, dosriValidationRule.message) && j.b(this.regex, dosriValidationRule.regex) && j.b(this.validationFields, dosriValidationRule.validationFields);
    }

    public final String getAdditionalRule() {
        return this.additionalRule;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRegex() {
        return this.regex;
    }

    public final List<DosriValidationField> getValidationFields() {
        return this.validationFields;
    }

    public int hashCode() {
        String str = this.additionalRule;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regex;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DosriValidationField> list = this.validationFields;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.additionalRule;
        Integer num = this.id;
        String str2 = this.message;
        String str3 = this.regex;
        List<DosriValidationField> list = this.validationFields;
        StringBuilder sb2 = new StringBuilder("DosriValidationRule(additionalRule=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(num);
        sb2.append(", message=");
        c.A(sb2, str2, ", regex=", str3, ", validationFields=");
        return s.r(sb2, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.additionalRule);
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.message);
        dest.writeString(this.regex);
        List<DosriValidationField> list = this.validationFields;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((DosriValidationField) itP.next()).writeToParcel(dest, i);
        }
    }

    public DosriValidationRule(String str, Integer num, String str2, String str3, List<DosriValidationField> list) {
        this.additionalRule = str;
        this.id = num;
        this.message = str2;
        this.regex = str3;
        this.validationFields = list;
    }

    public DosriValidationRule(String str, Integer num, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? C1112C.f9377a : list);
    }
}
