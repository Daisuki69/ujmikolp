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
public final class KycUploadGuide implements Parcelable {
    public static final Parcelable.Creator<KycUploadGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("maximum_byte_size")
    private final Integer maxUploadByteSize;

    @InterfaceC1497a
    @InterfaceC1498b("maximum_byte_size_allowed")
    private final Integer maxUploadByteSizeAllowed;

    @InterfaceC1497a
    @InterfaceC1498b("sub_header")
    private final String subHeader;

    @InterfaceC1497a
    @InterfaceC1498b("os_types")
    private final List<KycUploadOsGuide> uploadOsTypes;

    public static final class Creator implements Parcelable.Creator<KycUploadGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUploadGuide createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                int I4 = 0;
                while (I4 != i4) {
                    I4 = AbstractC1213b.I(KycUploadOsGuide.CREATOR, parcel, arrayList, I4, 1);
                }
            }
            return new KycUploadGuide(i, string, string2, numValueOf, numValueOf2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUploadGuide[] newArray(int i) {
            return new KycUploadGuide[i];
        }
    }

    public KycUploadGuide(int i, String str, String str2, Integer num, Integer num2, List<KycUploadOsGuide> list) {
        this.id = i;
        this.header = str;
        this.subHeader = str2;
        this.maxUploadByteSize = num;
        this.maxUploadByteSizeAllowed = num2;
        this.uploadOsTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycUploadGuide copy$default(KycUploadGuide kycUploadGuide, int i, String str, String str2, Integer num, Integer num2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycUploadGuide.id;
        }
        if ((i4 & 2) != 0) {
            str = kycUploadGuide.header;
        }
        if ((i4 & 4) != 0) {
            str2 = kycUploadGuide.subHeader;
        }
        if ((i4 & 8) != 0) {
            num = kycUploadGuide.maxUploadByteSize;
        }
        if ((i4 & 16) != 0) {
            num2 = kycUploadGuide.maxUploadByteSizeAllowed;
        }
        if ((i4 & 32) != 0) {
            list = kycUploadGuide.uploadOsTypes;
        }
        Integer num3 = num2;
        List list2 = list;
        return kycUploadGuide.copy(i, str, str2, num, num3, list2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.subHeader;
    }

    public final Integer component4() {
        return this.maxUploadByteSize;
    }

    public final Integer component5() {
        return this.maxUploadByteSizeAllowed;
    }

    public final List<KycUploadOsGuide> component6() {
        return this.uploadOsTypes;
    }

    public final KycUploadGuide copy(int i, String str, String str2, Integer num, Integer num2, List<KycUploadOsGuide> list) {
        return new KycUploadGuide(i, str, str2, num, num2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycUploadGuide)) {
            return false;
        }
        KycUploadGuide kycUploadGuide = (KycUploadGuide) obj;
        return this.id == kycUploadGuide.id && j.b(this.header, kycUploadGuide.header) && j.b(this.subHeader, kycUploadGuide.subHeader) && j.b(this.maxUploadByteSize, kycUploadGuide.maxUploadByteSize) && j.b(this.maxUploadByteSizeAllowed, kycUploadGuide.maxUploadByteSizeAllowed) && j.b(this.uploadOsTypes, kycUploadGuide.uploadOsTypes);
    }

    public final String getHeader() {
        return this.header;
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getMaxUploadByteSize() {
        return this.maxUploadByteSize;
    }

    public final Integer getMaxUploadByteSizeAllowed() {
        return this.maxUploadByteSizeAllowed;
    }

    public final String getSubHeader() {
        return this.subHeader;
    }

    public final List<KycUploadOsGuide> getUploadOsTypes() {
        return this.uploadOsTypes;
    }

    public int hashCode() {
        int i = this.id * 31;
        String str = this.header;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subHeader;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.maxUploadByteSize;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxUploadByteSizeAllowed;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<KycUploadOsGuide> list = this.uploadOsTypes;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "KycUploadGuide(id=" + this.id + ", header=" + this.header + ", subHeader=" + this.subHeader + ", maxUploadByteSize=" + this.maxUploadByteSize + ", maxUploadByteSizeAllowed=" + this.maxUploadByteSizeAllowed + ", uploadOsTypes=" + this.uploadOsTypes + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.header);
        dest.writeString(this.subHeader);
        Integer num = this.maxUploadByteSize;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        Integer num2 = this.maxUploadByteSizeAllowed;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num2);
        }
        List<KycUploadOsGuide> list = this.uploadOsTypes;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((KycUploadOsGuide) itP.next()).writeToParcel(dest, i);
        }
    }

    public KycUploadGuide(int i, String str, String str2, Integer num, Integer num2, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : num, (i4 & 16) != 0 ? 0 : num2, (i4 & 32) != 0 ? C1112C.f9377a : list);
    }
}
