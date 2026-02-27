package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycDocumentType implements Parcelable {
    public static final Parcelable.Creator<KycDocumentType> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public static final class Creator implements Parcelable.Creator<KycDocumentType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocumentType createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycDocumentType(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocumentType[] newArray(int i) {
            return new KycDocumentType[i];
        }
    }

    public KycDocumentType() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ KycDocumentType copy$default(KycDocumentType kycDocumentType, int i, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycDocumentType.id;
        }
        if ((i4 & 2) != 0) {
            str = kycDocumentType.type;
        }
        if ((i4 & 4) != 0) {
            str2 = kycDocumentType.description;
        }
        return kycDocumentType.copy(i, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.description;
    }

    public final KycDocumentType copy(int i, String type, String description) {
        j.g(type, "type");
        j.g(description, "description");
        return new KycDocumentType(i, type, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDocumentType)) {
            return false;
        }
        KycDocumentType kycDocumentType = (KycDocumentType) obj;
        return this.id == kycDocumentType.id && j.b(this.type, kycDocumentType.type) && j.b(this.description, kycDocumentType.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.description.hashCode() + AbstractC1414e.c(this.id * 31, 31, this.type);
    }

    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.description;
        StringBuilder sb2 = new StringBuilder("KycDocumentType(id=");
        sb2.append(i);
        sb2.append(", type=");
        sb2.append(str);
        sb2.append(", description=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.type);
        dest.writeString(this.description);
    }

    public KycDocumentType(int i, String type, String description) {
        j.g(type, "type");
        j.g(description, "description");
        this.id = i;
        this.type = type;
        this.description = description;
    }

    public /* synthetic */ KycDocumentType(int i, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2);
    }
}
