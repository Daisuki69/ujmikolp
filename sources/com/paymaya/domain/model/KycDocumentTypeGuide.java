package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycDocumentTypeGuide implements Parcelable {
    public static final Parcelable.Creator<KycDocumentTypeGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    public static final class Creator implements Parcelable.Creator<KycDocumentTypeGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocumentTypeGuide createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycDocumentTypeGuide(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocumentTypeGuide[] newArray(int i) {
            return new KycDocumentTypeGuide[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycDocumentTypeGuide() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycDocumentTypeGuide copy$default(KycDocumentTypeGuide kycDocumentTypeGuide, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycDocumentTypeGuide.id;
        }
        if ((i4 & 2) != 0) {
            str = kycDocumentTypeGuide.key;
        }
        return kycDocumentTypeGuide.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.key;
    }

    public final KycDocumentTypeGuide copy(int i, String key) {
        j.g(key, "key");
        return new KycDocumentTypeGuide(i, key);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDocumentTypeGuide)) {
            return false;
        }
        KycDocumentTypeGuide kycDocumentTypeGuide = (KycDocumentTypeGuide) obj;
        return this.id == kycDocumentTypeGuide.id && j.b(this.key, kycDocumentTypeGuide.key);
    }

    public final int getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode() + (this.id * 31);
    }

    public String toString() {
        return "KycDocumentTypeGuide(id=" + this.id + ", key=" + this.key + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.key);
    }

    public KycDocumentTypeGuide(int i, String key) {
        j.g(key, "key");
        this.id = i;
        this.key = key;
    }

    public /* synthetic */ KycDocumentTypeGuide(int i, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str);
    }
}
