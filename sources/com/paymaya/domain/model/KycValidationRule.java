package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class KycValidationRule implements Parcelable {
    public static final Parcelable.Creator<KycValidationRule> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("validation_fields")
    private final List<KycValidationField> fields;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("message")
    private final String message;

    @InterfaceC1497a
    @InterfaceC1498b("regex")
    private final String regex;

    public static final class Creator implements Parcelable.Creator<KycValidationRule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycValidationRule createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(KycValidationField.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new KycValidationRule(numValueOf, string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycValidationRule[] newArray(int i) {
            return new KycValidationRule[i];
        }
    }

    public KycValidationRule() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycValidationRule copy$default(KycValidationRule kycValidationRule, Integer num, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycValidationRule.id;
        }
        if ((i & 2) != 0) {
            str = kycValidationRule.regex;
        }
        if ((i & 4) != 0) {
            str2 = kycValidationRule.message;
        }
        if ((i & 8) != 0) {
            list = kycValidationRule.fields;
        }
        return kycValidationRule.copy(num, str, str2, list);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.regex;
    }

    public final String component3() {
        return this.message;
    }

    public final List<KycValidationField> component4() {
        return this.fields;
    }

    public final KycValidationRule copy(Integer num, String str, String str2, List<KycValidationField> list) {
        return new KycValidationRule(num, str, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycValidationRule)) {
            return false;
        }
        KycValidationRule kycValidationRule = (KycValidationRule) obj;
        return j.b(this.id, kycValidationRule.id) && j.b(this.regex, kycValidationRule.regex) && j.b(this.message, kycValidationRule.message) && j.b(this.fields, kycValidationRule.fields);
    }

    public final List<KycValidationField> getFields() {
        return this.fields;
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

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.regex;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<KycValidationField> list = this.fields;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.regex;
        String str2 = this.message;
        List<KycValidationField> list = this.fields;
        StringBuilder sbO = AbstractC1213b.O(num, "KycValidationRule(id=", ", regex=", str, ", message=");
        sbO.append(str2);
        sbO.append(", fields=");
        sbO.append(list);
        sbO.append(")");
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.regex);
        dest.writeString(this.message);
        List<KycValidationField> list = this.fields;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((KycValidationField) itP.next()).writeToParcel(dest, i);
        }
    }

    public KycValidationRule(Integer num, String str, String str2, List<KycValidationField> list) {
        this.id = num;
        this.regex = str;
        this.message = str2;
        this.fields = list;
    }

    public KycValidationRule(Integer num, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? C1112C.f9377a : list);
    }
}
