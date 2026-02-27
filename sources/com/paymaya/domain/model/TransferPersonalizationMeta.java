package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class TransferPersonalizationMeta implements Parcelable {
    public static final Parcelable.Creator<TransferPersonalizationMeta> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("giphy")
    private final PersonalizationGiphy gifDecoration;

    @InterfaceC1497a
    @InterfaceC1498b("paymaya")
    private final PersonalizationPayMaya mayaDecoration;

    public static final class Creator implements Parcelable.Creator<TransferPersonalizationMeta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferPersonalizationMeta createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new TransferPersonalizationMeta(parcel.readInt() == 0 ? null : PersonalizationPayMaya.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PersonalizationGiphy.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferPersonalizationMeta[] newArray(int i) {
            return new TransferPersonalizationMeta[i];
        }
    }

    public TransferPersonalizationMeta(PersonalizationPayMaya personalizationPayMaya, PersonalizationGiphy personalizationGiphy) {
        this.mayaDecoration = personalizationPayMaya;
        this.gifDecoration = personalizationGiphy;
    }

    public static /* synthetic */ TransferPersonalizationMeta copy$default(TransferPersonalizationMeta transferPersonalizationMeta, PersonalizationPayMaya personalizationPayMaya, PersonalizationGiphy personalizationGiphy, int i, Object obj) {
        if ((i & 1) != 0) {
            personalizationPayMaya = transferPersonalizationMeta.mayaDecoration;
        }
        if ((i & 2) != 0) {
            personalizationGiphy = transferPersonalizationMeta.gifDecoration;
        }
        return transferPersonalizationMeta.copy(personalizationPayMaya, personalizationGiphy);
    }

    public final PersonalizationPayMaya component1() {
        return this.mayaDecoration;
    }

    public final PersonalizationGiphy component2() {
        return this.gifDecoration;
    }

    public final TransferPersonalizationMeta copy(PersonalizationPayMaya personalizationPayMaya, PersonalizationGiphy personalizationGiphy) {
        return new TransferPersonalizationMeta(personalizationPayMaya, personalizationGiphy);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferPersonalizationMeta)) {
            return false;
        }
        TransferPersonalizationMeta transferPersonalizationMeta = (TransferPersonalizationMeta) obj;
        return j.b(this.mayaDecoration, transferPersonalizationMeta.mayaDecoration) && j.b(this.gifDecoration, transferPersonalizationMeta.gifDecoration);
    }

    public final PersonalizationGiphy getGifDecoration() {
        return this.gifDecoration;
    }

    public final PersonalizationPayMaya getMayaDecoration() {
        return this.mayaDecoration;
    }

    public int hashCode() {
        PersonalizationPayMaya personalizationPayMaya = this.mayaDecoration;
        int iHashCode = (personalizationPayMaya == null ? 0 : personalizationPayMaya.hashCode()) * 31;
        PersonalizationGiphy personalizationGiphy = this.gifDecoration;
        return iHashCode + (personalizationGiphy != null ? personalizationGiphy.hashCode() : 0);
    }

    public String toString() {
        return "TransferPersonalizationMeta(mayaDecoration=" + this.mayaDecoration + ", gifDecoration=" + this.gifDecoration + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        PersonalizationPayMaya personalizationPayMaya = this.mayaDecoration;
        if (personalizationPayMaya == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            personalizationPayMaya.writeToParcel(dest, i);
        }
        PersonalizationGiphy personalizationGiphy = this.gifDecoration;
        if (personalizationGiphy == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            personalizationGiphy.writeToParcel(dest, i);
        }
    }
}
