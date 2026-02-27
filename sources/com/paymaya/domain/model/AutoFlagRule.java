package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class AutoFlagRule implements Parcelable {
    public static final Parcelable.Creator<AutoFlagRule> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("fatca_reason")
    private final FatcaReason fatcaReason;

    @InterfaceC1497a
    @InterfaceC1498b("flag_fields")
    private final List<FlagField> flagFields;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    public static final class Creator implements Parcelable.Creator<AutoFlagRule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoFlagRule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            FatcaReason fatcaReasonCreateFromParcel = parcel.readInt() == 0 ? null : FatcaReason.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(FlagField.CREATOR, parcel, arrayList, I4, 1);
                }
            }
            return new AutoFlagRule(fatcaReasonCreateFromParcel, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoFlagRule[] newArray(int i) {
            return new AutoFlagRule[i];
        }
    }

    public AutoFlagRule() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoFlagRule copy$default(AutoFlagRule autoFlagRule, FatcaReason fatcaReason, List list, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            fatcaReason = autoFlagRule.fatcaReason;
        }
        if ((i & 2) != 0) {
            list = autoFlagRule.flagFields;
        }
        if ((i & 4) != 0) {
            num = autoFlagRule.id;
        }
        if ((i & 8) != 0) {
            str = autoFlagRule.value;
        }
        return autoFlagRule.copy(fatcaReason, list, num, str);
    }

    public final FatcaReason component1() {
        return this.fatcaReason;
    }

    public final List<FlagField> component2() {
        return this.flagFields;
    }

    public final Integer component3() {
        return this.id;
    }

    public final String component4() {
        return this.value;
    }

    public final AutoFlagRule copy(FatcaReason fatcaReason, List<FlagField> list, Integer num, String str) {
        return new AutoFlagRule(fatcaReason, list, num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoFlagRule)) {
            return false;
        }
        AutoFlagRule autoFlagRule = (AutoFlagRule) obj;
        return j.b(this.fatcaReason, autoFlagRule.fatcaReason) && j.b(this.flagFields, autoFlagRule.flagFields) && j.b(this.id, autoFlagRule.id) && j.b(this.value, autoFlagRule.value);
    }

    public final FatcaReason getFatcaReason() {
        return this.fatcaReason;
    }

    public final List<FlagField> getFlagFields() {
        return this.flagFields;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        FatcaReason fatcaReason = this.fatcaReason;
        int iHashCode = (fatcaReason == null ? 0 : fatcaReason.hashCode()) * 31;
        List<FlagField> list = this.flagFields;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.value;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AutoFlagRule(fatcaReason=" + this.fatcaReason + ", flagFields=" + this.flagFields + ", id=" + this.id + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        FatcaReason fatcaReason = this.fatcaReason;
        if (fatcaReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fatcaReason.writeToParcel(dest, i);
        }
        List<FlagField> list = this.flagFields;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((FlagField) itP.next()).writeToParcel(dest, i);
            }
        }
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.value);
    }

    public AutoFlagRule(FatcaReason fatcaReason, List<FlagField> list, Integer num, String str) {
        this.fatcaReason = fatcaReason;
        this.flagFields = list;
        this.id = num;
        this.value = str;
    }

    public /* synthetic */ AutoFlagRule(FatcaReason fatcaReason, List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fatcaReason, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
