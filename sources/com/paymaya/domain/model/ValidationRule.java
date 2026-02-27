package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
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
public final class ValidationRule implements Parcelable {
    public static final Parcelable.Creator<ValidationRule> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("additionalRule")
    private final String additionalRule;

    @InterfaceC1497a
    @InterfaceC1498b("message")
    private final String message;

    @InterfaceC1497a
    @InterfaceC1498b("regex")
    private final String regex;

    @InterfaceC1497a
    @InterfaceC1498b("validation_fields")
    private final List<ValidationField> validationFields;

    public static final class Creator implements Parcelable.Creator<ValidationRule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidationRule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(ValidationField.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new ValidationRule(string, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidationRule[] newArray(int i) {
            return new ValidationRule[i];
        }
    }

    public ValidationRule() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidationRule copy$default(ValidationRule validationRule, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validationRule.additionalRule;
        }
        if ((i & 2) != 0) {
            str2 = validationRule.message;
        }
        if ((i & 4) != 0) {
            str3 = validationRule.regex;
        }
        if ((i & 8) != 0) {
            list = validationRule.validationFields;
        }
        return validationRule.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.additionalRule;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.regex;
    }

    public final List<ValidationField> component4() {
        return this.validationFields;
    }

    public final ValidationRule copy(String str, String str2, String str3, List<ValidationField> list) {
        return new ValidationRule(str, str2, str3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationRule)) {
            return false;
        }
        ValidationRule validationRule = (ValidationRule) obj;
        return j.b(this.additionalRule, validationRule.additionalRule) && j.b(this.message, validationRule.message) && j.b(this.regex, validationRule.regex) && j.b(this.validationFields, validationRule.validationFields);
    }

    public final String getAdditionalRule() {
        return this.additionalRule;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRegex() {
        return this.regex;
    }

    public final List<ValidationField> getValidationFields() {
        return this.validationFields;
    }

    public int hashCode() {
        String str = this.additionalRule;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regex;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ValidationField> list = this.validationFields;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.additionalRule;
        String str2 = this.message;
        String str3 = this.regex;
        List<ValidationField> list = this.validationFields;
        StringBuilder sbX = s.x("ValidationRule(additionalRule=", str, ", message=", str2, ", regex=");
        sbX.append(str3);
        sbX.append(", validationFields=");
        sbX.append(list);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.additionalRule);
        dest.writeString(this.message);
        dest.writeString(this.regex);
        List<ValidationField> list = this.validationFields;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((ValidationField) itP.next()).writeToParcel(dest, i);
        }
    }

    public ValidationRule(String str, String str2, String str3, List<ValidationField> list) {
        this.additionalRule = str;
        this.message = str2;
        this.regex = str3;
        this.validationFields = list;
    }

    public ValidationRule(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C1112C.f9377a : list);
    }
}
