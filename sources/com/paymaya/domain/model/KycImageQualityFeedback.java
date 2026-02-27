package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycImageQualityFeedback implements Parcelable {
    public static final Parcelable.Creator<KycImageQualityFeedback> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    public static final class Creator implements Parcelable.Creator<KycImageQualityFeedback> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycImageQualityFeedback createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycImageQualityFeedback(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycImageQualityFeedback[] newArray(int i) {
            return new KycImageQualityFeedback[i];
        }
    }

    public KycImageQualityFeedback(int i, String key) {
        j.g(key, "key");
        this.id = i;
        this.key = key;
    }

    public static /* synthetic */ KycImageQualityFeedback copy$default(KycImageQualityFeedback kycImageQualityFeedback, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycImageQualityFeedback.id;
        }
        if ((i4 & 2) != 0) {
            str = kycImageQualityFeedback.key;
        }
        return kycImageQualityFeedback.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.key;
    }

    public final KycImageQualityFeedback copy(int i, String key) {
        j.g(key, "key");
        return new KycImageQualityFeedback(i, key);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycImageQualityFeedback)) {
            return false;
        }
        KycImageQualityFeedback kycImageQualityFeedback = (KycImageQualityFeedback) obj;
        return this.id == kycImageQualityFeedback.id && j.b(this.key, kycImageQualityFeedback.key);
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

    public final boolean isQualityFeedbackGoodQuality() {
        return j.b(this.key, "GOOD_QUALITY");
    }

    public final boolean isQualityFeedbackPaper() {
        return j.b(this.key, "PAPER");
    }

    public String toString() {
        return "KycImageQualityFeedback(id=" + this.id + ", key=" + this.key + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.key);
    }
}
