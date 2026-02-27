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
public final class FatcaGuides implements Parcelable {
    public static final Parcelable.Creator<FatcaGuides> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("auto_flag_rules")
    private final List<AutoFlagRule> autoFlagRules;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.TAG_BODY)
    private final String body;

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    @InterfaceC1497a
    @InterfaceC1498b("icon_url")
    private final String iconUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    public static final class Creator implements Parcelable.Creator<FatcaGuides> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FatcaGuides createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(AutoFlagRule.CREATOR, parcel, arrayList, I4, 1);
            }
            return new FatcaGuides(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FatcaGuides[] newArray(int i) {
            return new FatcaGuides[i];
        }
    }

    public FatcaGuides(List<AutoFlagRule> autoFlagRules, String str, String str2, String str3, Integer num) {
        j.g(autoFlagRules, "autoFlagRules");
        this.autoFlagRules = autoFlagRules;
        this.body = str;
        this.header = str2;
        this.iconUrl = str3;
        this.id = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FatcaGuides copy$default(FatcaGuides fatcaGuides, List list, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fatcaGuides.autoFlagRules;
        }
        if ((i & 2) != 0) {
            str = fatcaGuides.body;
        }
        if ((i & 4) != 0) {
            str2 = fatcaGuides.header;
        }
        if ((i & 8) != 0) {
            str3 = fatcaGuides.iconUrl;
        }
        if ((i & 16) != 0) {
            num = fatcaGuides.id;
        }
        Integer num2 = num;
        String str4 = str2;
        return fatcaGuides.copy(list, str, str4, str3, num2);
    }

    public final List<AutoFlagRule> component1() {
        return this.autoFlagRules;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.header;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final Integer component5() {
        return this.id;
    }

    public final FatcaGuides copy(List<AutoFlagRule> autoFlagRules, String str, String str2, String str3, Integer num) {
        j.g(autoFlagRules, "autoFlagRules");
        return new FatcaGuides(autoFlagRules, str, str2, str3, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FatcaGuides)) {
            return false;
        }
        FatcaGuides fatcaGuides = (FatcaGuides) obj;
        return j.b(this.autoFlagRules, fatcaGuides.autoFlagRules) && j.b(this.body, fatcaGuides.body) && j.b(this.header, fatcaGuides.header) && j.b(this.iconUrl, fatcaGuides.iconUrl) && j.b(this.id, fatcaGuides.id);
    }

    public final List<AutoFlagRule> getAutoFlagRules() {
        return this.autoFlagRules;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.autoFlagRules.hashCode() * 31;
        String str = this.body;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.header;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.id;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        List<AutoFlagRule> list = this.autoFlagRules;
        String str = this.body;
        String str2 = this.header;
        String str3 = this.iconUrl;
        Integer num = this.id;
        StringBuilder sb2 = new StringBuilder("FatcaGuides(autoFlagRules=");
        sb2.append(list);
        sb2.append(", body=");
        sb2.append(str);
        sb2.append(", header=");
        c.A(sb2, str2, ", iconUrl=", str3, ", id=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.autoFlagRules, dest);
        while (itQ.hasNext()) {
            ((AutoFlagRule) itQ.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.body);
        dest.writeString(this.header);
        dest.writeString(this.iconUrl);
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
    }

    public /* synthetic */ FatcaGuides(List list, String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num);
    }
}
