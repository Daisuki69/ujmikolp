package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class IdOcr implements Parcelable {
    public static final Parcelable.Creator<IdOcr> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("reference_no")
    private final String referenceNumber;

    @InterfaceC1497a
    @InterfaceC1498b("result")
    private final IdOcrResult result;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b(ImagesContract.URL)
    private final String url;

    public static final class Creator implements Parcelable.Creator<IdOcr> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdOcr createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new IdOcr(parcel.readString(), parcel.readString(), parcel.readString(), IdOcrResult.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdOcr[] newArray(int i) {
            return new IdOcr[i];
        }
    }

    public IdOcr(String id, String url, String type, IdOcrResult result, String referenceNumber) {
        j.g(id, "id");
        j.g(url, "url");
        j.g(type, "type");
        j.g(result, "result");
        j.g(referenceNumber, "referenceNumber");
        this.id = id;
        this.url = url;
        this.type = type;
        this.result = result;
        this.referenceNumber = referenceNumber;
    }

    public static /* synthetic */ IdOcr copy$default(IdOcr idOcr, String str, String str2, String str3, IdOcrResult idOcrResult, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idOcr.id;
        }
        if ((i & 2) != 0) {
            str2 = idOcr.url;
        }
        if ((i & 4) != 0) {
            str3 = idOcr.type;
        }
        if ((i & 8) != 0) {
            idOcrResult = idOcr.result;
        }
        if ((i & 16) != 0) {
            str4 = idOcr.referenceNumber;
        }
        String str5 = str4;
        String str6 = str3;
        return idOcr.copy(str, str2, str6, idOcrResult, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.type;
    }

    public final IdOcrResult component4() {
        return this.result;
    }

    public final String component5() {
        return this.referenceNumber;
    }

    public final IdOcr copy(String id, String url, String type, IdOcrResult result, String referenceNumber) {
        j.g(id, "id");
        j.g(url, "url");
        j.g(type, "type");
        j.g(result, "result");
        j.g(referenceNumber, "referenceNumber");
        return new IdOcr(id, url, type, result, referenceNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdOcr)) {
            return false;
        }
        IdOcr idOcr = (IdOcr) obj;
        return j.b(this.id, idOcr.id) && j.b(this.url, idOcr.url) && j.b(this.type, idOcr.type) && j.b(this.result, idOcr.result) && j.b(this.referenceNumber, idOcr.referenceNumber);
    }

    public final String getId() {
        return this.id;
    }

    public final String getReferenceNumber() {
        return this.referenceNumber;
    }

    public final IdOcrResult getResult() {
        return this.result;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.referenceNumber.hashCode() + ((this.result.hashCode() + AbstractC1414e.c(AbstractC1414e.c(this.id.hashCode() * 31, 31, this.url), 31, this.type)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.url;
        String str3 = this.type;
        IdOcrResult idOcrResult = this.result;
        String str4 = this.referenceNumber;
        StringBuilder sbX = s.x("IdOcr(id=", str, ", url=", str2, ", type=");
        sbX.append(str3);
        sbX.append(", result=");
        sbX.append(idOcrResult);
        sbX.append(", referenceNumber=");
        return s.p(sbX, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.url);
        dest.writeString(this.type);
        this.result.writeToParcel(dest, i);
        dest.writeString(this.referenceNumber);
    }
}
