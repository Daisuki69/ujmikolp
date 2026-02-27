package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class TransferCard implements Parcelable {
    public static final Parcelable.Creator<TransferCard> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("color")
    private final String color;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    public static final class Creator implements Parcelable.Creator<TransferCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferCard createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new TransferCard(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferCard[] newArray(int i) {
            return new TransferCard[i];
        }
    }

    public TransferCard(String id, String color) {
        j.g(id, "id");
        j.g(color, "color");
        this.id = id;
        this.color = color;
    }

    public static /* synthetic */ TransferCard copy$default(TransferCard transferCard, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferCard.id;
        }
        if ((i & 2) != 0) {
            str2 = transferCard.color;
        }
        return transferCard.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.color;
    }

    public final TransferCard copy(String id, String color) {
        j.g(id, "id");
        j.g(color, "color");
        return new TransferCard(id, color);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferCard)) {
            return false;
        }
        TransferCard transferCard = (TransferCard) obj;
        return j.b(this.id, transferCard.id) && j.b(this.color, transferCard.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.color.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return s.l("TransferCard(id=", this.id, ", color=", this.color, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.color);
    }
}
