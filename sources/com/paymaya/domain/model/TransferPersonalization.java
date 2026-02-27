package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class TransferPersonalization implements Parcelable {
    public static final Parcelable.Creator<TransferPersonalization> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("meta")
    private final TransferPersonalizationMeta meta;

    @InterfaceC1497a
    @InterfaceC1498b("provider")
    private final String provider;

    public static final class Creator implements Parcelable.Creator<TransferPersonalization> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferPersonalization createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new TransferPersonalization(parcel.readString(), parcel.readInt() == 0 ? null : TransferPersonalizationMeta.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferPersonalization[] newArray(int i) {
            return new TransferPersonalization[i];
        }
    }

    public TransferPersonalization(String str, TransferPersonalizationMeta transferPersonalizationMeta) {
        this.provider = str;
        this.meta = transferPersonalizationMeta;
    }

    public static /* synthetic */ TransferPersonalization copy$default(TransferPersonalization transferPersonalization, String str, TransferPersonalizationMeta transferPersonalizationMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferPersonalization.provider;
        }
        if ((i & 2) != 0) {
            transferPersonalizationMeta = transferPersonalization.meta;
        }
        return transferPersonalization.copy(str, transferPersonalizationMeta);
    }

    public final String component1() {
        return this.provider;
    }

    public final TransferPersonalizationMeta component2() {
        return this.meta;
    }

    public final TransferPersonalization copy(String str, TransferPersonalizationMeta transferPersonalizationMeta) {
        return new TransferPersonalization(str, transferPersonalizationMeta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferPersonalization)) {
            return false;
        }
        TransferPersonalization transferPersonalization = (TransferPersonalization) obj;
        return j.b(this.provider, transferPersonalization.provider) && j.b(this.meta, transferPersonalization.meta);
    }

    public final String getGifId() {
        PersonalizationGiphy gifDecoration;
        TransferPersonalizationMeta transferPersonalizationMeta = this.meta;
        if (transferPersonalizationMeta == null || (gifDecoration = transferPersonalizationMeta.getGifDecoration()) == null) {
            return null;
        }
        return gifDecoration.getGifId();
    }

    public final TransferPersonalizationMeta getMeta() {
        return this.meta;
    }

    public final String getPayMayaDecorationId() {
        PersonalizationPayMaya mayaDecoration;
        TransferPersonalizationMeta transferPersonalizationMeta = this.meta;
        if (transferPersonalizationMeta == null || (mayaDecoration = transferPersonalizationMeta.getMayaDecoration()) == null) {
            return null;
        }
        return mayaDecoration.getDecorationId();
    }

    public final String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        String str = this.provider;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TransferPersonalizationMeta transferPersonalizationMeta = this.meta;
        return iHashCode + (transferPersonalizationMeta != null ? transferPersonalizationMeta.hashCode() : 0);
    }

    public final boolean isGifDecoration() {
        return j.b(this.provider, "giphy");
    }

    public final boolean isPayMayaDecoration() {
        return j.b(this.provider, "paymaya");
    }

    public String toString() {
        return "TransferPersonalization(provider=" + this.provider + ", meta=" + this.meta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.provider);
        TransferPersonalizationMeta transferPersonalizationMeta = this.meta;
        if (transferPersonalizationMeta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferPersonalizationMeta.writeToParcel(dest, i);
        }
    }
}
