package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
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
public final class KycUploadOsGuide implements Parcelable {
    public static final Parcelable.Creator<KycUploadOsGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("error_spiels")
    private final List<KycUploadGuideError> errorSpiels;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("mime_types")
    private final List<String> mimeTypes;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("upload_description")
    private final String uploadDescription;

    public static final class Creator implements Parcelable.Creator<KycUploadOsGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUploadOsGuide createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int I4 = 0;
                while (I4 != i4) {
                    I4 = AbstractC1213b.I(KycUploadGuideError.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new KycUploadOsGuide(i, string, string2, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUploadOsGuide[] newArray(int i) {
            return new KycUploadOsGuide[i];
        }
    }

    public KycUploadOsGuide(int i, String str, String str2, List<String> list, List<KycUploadGuideError> list2) {
        this.id = i;
        this.type = str;
        this.uploadDescription = str2;
        this.mimeTypes = list;
        this.errorSpiels = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycUploadOsGuide copy$default(KycUploadOsGuide kycUploadOsGuide, int i, String str, String str2, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycUploadOsGuide.id;
        }
        if ((i4 & 2) != 0) {
            str = kycUploadOsGuide.type;
        }
        if ((i4 & 4) != 0) {
            str2 = kycUploadOsGuide.uploadDescription;
        }
        if ((i4 & 8) != 0) {
            list = kycUploadOsGuide.mimeTypes;
        }
        if ((i4 & 16) != 0) {
            list2 = kycUploadOsGuide.errorSpiels;
        }
        List list3 = list2;
        String str3 = str2;
        return kycUploadOsGuide.copy(i, str, str3, list, list3);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.uploadDescription;
    }

    public final List<String> component4() {
        return this.mimeTypes;
    }

    public final List<KycUploadGuideError> component5() {
        return this.errorSpiels;
    }

    public final KycUploadOsGuide copy(int i, String str, String str2, List<String> list, List<KycUploadGuideError> list2) {
        return new KycUploadOsGuide(i, str, str2, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycUploadOsGuide)) {
            return false;
        }
        KycUploadOsGuide kycUploadOsGuide = (KycUploadOsGuide) obj;
        return this.id == kycUploadOsGuide.id && j.b(this.type, kycUploadOsGuide.type) && j.b(this.uploadDescription, kycUploadOsGuide.uploadDescription) && j.b(this.mimeTypes, kycUploadOsGuide.mimeTypes) && j.b(this.errorSpiels, kycUploadOsGuide.errorSpiels);
    }

    public final List<KycUploadGuideError> getErrorSpiels() {
        return this.errorSpiels;
    }

    public final int getId() {
        return this.id;
    }

    public final List<String> getMimeTypes() {
        return this.mimeTypes;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUploadDescription() {
        return this.uploadDescription;
    }

    public int hashCode() {
        int i = this.id * 31;
        String str = this.type;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uploadDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.mimeTypes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<KycUploadGuideError> list2 = this.errorSpiels;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.uploadDescription;
        List<String> list = this.mimeTypes;
        List<KycUploadGuideError> list2 = this.errorSpiels;
        StringBuilder sb2 = new StringBuilder("KycUploadOsGuide(id=");
        sb2.append(i);
        sb2.append(", type=");
        sb2.append(str);
        sb2.append(", uploadDescription=");
        sb2.append(str2);
        sb2.append(", mimeTypes=");
        sb2.append(list);
        sb2.append(", errorSpiels=");
        return s.r(sb2, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.type);
        dest.writeString(this.uploadDescription);
        dest.writeStringList(this.mimeTypes);
        List<KycUploadGuideError> list = this.errorSpiels;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((KycUploadGuideError) itP.next()).writeToParcel(dest, i);
        }
    }

    public KycUploadOsGuide(int i, String str, String str2, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? C1112C.f9377a : list, (i4 & 16) != 0 ? C1112C.f9377a : list2);
    }
}
