package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
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
public final class KycDocument implements Parcelable {
    public static final Parcelable.Creator<KycDocument> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("additionalDescription")
    private final String additionalDescription;

    @InterfaceC1497a
    @InterfaceC1498b("category")
    private final String category;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("expiryDate")
    private final boolean expiryDate;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    @InterfaceC1497a
    @InterfaceC1498b("order")
    private final Integer order;

    @InterfaceC1497a
    @InterfaceC1498b("showOnList")
    private final boolean showOnList;

    @InterfaceC1497a
    @InterfaceC1498b("subDescription")
    private final String subDescription;

    @InterfaceC1497a
    @InterfaceC1498b("types")
    private final List<KycDocumentType> types;

    public static final class Creator implements Parcelable.Creator<KycDocument> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocument createFromParcel(Parcel parcel) {
            boolean z4;
            j.g(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int I4 = 0;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = true;
                z5 = false;
            }
            boolean z8 = parcel.readInt() != 0 ? z4 : false;
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (I4 != i) {
                I4 = AbstractC1213b.I(KycDocumentType.CREATOR, parcel, arrayList, I4, 1);
            }
            return new KycDocument(numValueOf, string, string2, string3, string4, string5, z5, z8, numValueOf2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocument[] newArray(int i) {
            return new KycDocument[i];
        }
    }

    public KycDocument() {
        this(null, null, null, null, null, null, false, false, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycDocument copy$default(KycDocument kycDocument, Integer num, String str, String str2, String str3, String str4, String str5, boolean z4, boolean z5, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycDocument.id;
        }
        if ((i & 2) != 0) {
            str = kycDocument.key;
        }
        if ((i & 4) != 0) {
            str2 = kycDocument.description;
        }
        if ((i & 8) != 0) {
            str3 = kycDocument.subDescription;
        }
        if ((i & 16) != 0) {
            str4 = kycDocument.additionalDescription;
        }
        if ((i & 32) != 0) {
            str5 = kycDocument.category;
        }
        if ((i & 64) != 0) {
            z4 = kycDocument.expiryDate;
        }
        if ((i & 128) != 0) {
            z5 = kycDocument.showOnList;
        }
        if ((i & 256) != 0) {
            num2 = kycDocument.order;
        }
        if ((i & 512) != 0) {
            list = kycDocument.types;
        }
        Integer num3 = num2;
        List list2 = list;
        boolean z8 = z4;
        boolean z9 = z5;
        String str6 = str4;
        String str7 = str5;
        return kycDocument.copy(num, str, str2, str3, str6, str7, z8, z9, num3, list2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final List<KycDocumentType> component10() {
        return this.types;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.subDescription;
    }

    public final String component5() {
        return this.additionalDescription;
    }

    public final String component6() {
        return this.category;
    }

    public final boolean component7() {
        return this.expiryDate;
    }

    public final boolean component8() {
        return this.showOnList;
    }

    public final Integer component9() {
        return this.order;
    }

    public final KycDocument copy(Integer num, String str, String str2, String str3, String str4, String str5, boolean z4, boolean z5, Integer num2, List<KycDocumentType> types) {
        j.g(types, "types");
        return new KycDocument(num, str, str2, str3, str4, str5, z4, z5, num2, types);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDocument)) {
            return false;
        }
        KycDocument kycDocument = (KycDocument) obj;
        return j.b(this.id, kycDocument.id) && j.b(this.key, kycDocument.key) && j.b(this.description, kycDocument.description) && j.b(this.subDescription, kycDocument.subDescription) && j.b(this.additionalDescription, kycDocument.additionalDescription) && j.b(this.category, kycDocument.category) && this.expiryDate == kycDocument.expiryDate && this.showOnList == kycDocument.showOnList && j.b(this.order, kycDocument.order) && j.b(this.types, kycDocument.types);
    }

    public final String getAdditionalDescription() {
        return this.additionalDescription;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getExpiryDate() {
        return this.expiryDate;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final boolean getShowOnList() {
        return this.showOnList;
    }

    public final String getSubDescription() {
        return this.subDescription;
    }

    public final List<KycDocumentType> getTypes() {
        return this.types;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subDescription;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.additionalDescription;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.category;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + (this.expiryDate ? 1231 : 1237)) * 31) + (this.showOnList ? 1231 : 1237)) * 31;
        Integer num2 = this.order;
        return this.types.hashCode() + ((iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.key;
        String str2 = this.description;
        String str3 = this.subDescription;
        String str4 = this.additionalDescription;
        String str5 = this.category;
        boolean z4 = this.expiryDate;
        boolean z5 = this.showOnList;
        Integer num2 = this.order;
        List<KycDocumentType> list = this.types;
        StringBuilder sbO = AbstractC1213b.O(num, "KycDocument(id=", ", key=", str, ", description=");
        c.A(sbO, str2, ", subDescription=", str3, ", additionalDescription=");
        c.A(sbO, str4, ", category=", str5, ", expiryDate=");
        sbO.append(z4);
        sbO.append(", showOnList=");
        sbO.append(z5);
        sbO.append(", order=");
        sbO.append(num2);
        sbO.append(", types=");
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
        dest.writeString(this.key);
        dest.writeString(this.description);
        dest.writeString(this.subDescription);
        dest.writeString(this.additionalDescription);
        dest.writeString(this.category);
        dest.writeInt(this.expiryDate ? 1 : 0);
        dest.writeInt(this.showOnList ? 1 : 0);
        Integer num2 = this.order;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num2);
        }
        Iterator itQ = AbstractC1213b.Q(this.types, dest);
        while (itQ.hasNext()) {
            ((KycDocumentType) itQ.next()).writeToParcel(dest, i);
        }
    }

    public KycDocument(Integer num, String str, String str2, String str3, String str4, String str5, boolean z4, boolean z5, Integer num2, List<KycDocumentType> types) {
        j.g(types, "types");
        this.id = num;
        this.key = str;
        this.description = str2;
        this.subDescription = str3;
        this.additionalDescription = str4;
        this.category = str5;
        this.expiryDate = z4;
        this.showOnList = z5;
        this.order = num2;
        this.types = types;
    }

    public KycDocument(Integer num, String str, String str2, String str3, String str4, String str5, boolean z4, boolean z5, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? 0 : num2, (i & 512) != 0 ? C1112C.f9377a : list);
    }
}
