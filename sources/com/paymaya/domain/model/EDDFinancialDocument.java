package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDFinancialDocument implements Parcelable {
    public static final Parcelable.Creator<EDDFinancialDocument> CREATOR = new Creator();
    private String fileUrl;
    private FinancialDocument financialDocument;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b(ImagesContract.URL)
    private String url;

    public static final class Creator implements Parcelable.Creator<EDDFinancialDocument> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EDDFinancialDocument createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new EDDFinancialDocument(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FinancialDocument.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EDDFinancialDocument[] newArray(int i) {
            return new EDDFinancialDocument[i];
        }
    }

    public EDDFinancialDocument(String type, String str, String str2, FinancialDocument financialDocument) {
        j.g(type, "type");
        this.type = type;
        this.url = str;
        this.fileUrl = str2;
        this.financialDocument = financialDocument;
    }

    public static /* synthetic */ EDDFinancialDocument copy$default(EDDFinancialDocument eDDFinancialDocument, String str, String str2, String str3, FinancialDocument financialDocument, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eDDFinancialDocument.type;
        }
        if ((i & 2) != 0) {
            str2 = eDDFinancialDocument.url;
        }
        if ((i & 4) != 0) {
            str3 = eDDFinancialDocument.fileUrl;
        }
        if ((i & 8) != 0) {
            financialDocument = eDDFinancialDocument.financialDocument;
        }
        return eDDFinancialDocument.copy(str, str2, str3, financialDocument);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.fileUrl;
    }

    public final FinancialDocument component4() {
        return this.financialDocument;
    }

    public final EDDFinancialDocument copy(String type, String str, String str2, FinancialDocument financialDocument) {
        j.g(type, "type");
        return new EDDFinancialDocument(type, str, str2, financialDocument);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDDFinancialDocument)) {
            return false;
        }
        EDDFinancialDocument eDDFinancialDocument = (EDDFinancialDocument) obj;
        return j.b(this.type, eDDFinancialDocument.type) && j.b(this.url, eDDFinancialDocument.url) && j.b(this.fileUrl, eDDFinancialDocument.fileUrl) && j.b(this.financialDocument, eDDFinancialDocument.financialDocument);
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final FinancialDocument getFinancialDocument() {
        return this.financialDocument;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FinancialDocument financialDocument = this.financialDocument;
        return iHashCode3 + (financialDocument != null ? financialDocument.hashCode() : 0);
    }

    public final void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public final void setFinancialDocument(FinancialDocument financialDocument) {
        this.financialDocument = financialDocument;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.url;
        String str3 = this.fileUrl;
        FinancialDocument financialDocument = this.financialDocument;
        StringBuilder sbX = s.x("EDDFinancialDocument(type=", str, ", url=", str2, ", fileUrl=");
        sbX.append(str3);
        sbX.append(", financialDocument=");
        sbX.append(financialDocument);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.url);
        dest.writeString(this.fileUrl);
        FinancialDocument financialDocument = this.financialDocument;
        if (financialDocument == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialDocument.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ EDDFinancialDocument(String str, String str2, String str3, FinancialDocument financialDocument, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : financialDocument);
    }
}
