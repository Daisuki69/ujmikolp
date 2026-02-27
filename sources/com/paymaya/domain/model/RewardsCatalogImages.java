package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogImages implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogImages> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("tile")
    private final String tile;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogImages> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogImages createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new RewardsCatalogImages(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogImages[] newArray(int i) {
            return new RewardsCatalogImages[i];
        }
    }

    public RewardsCatalogImages(String str) {
        this.tile = str;
    }

    public static /* synthetic */ RewardsCatalogImages copy$default(RewardsCatalogImages rewardsCatalogImages, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsCatalogImages.tile;
        }
        return rewardsCatalogImages.copy(str);
    }

    public final String component1() {
        return this.tile;
    }

    public final RewardsCatalogImages copy(String str) {
        return new RewardsCatalogImages(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsCatalogImages) && j.b(this.tile, ((RewardsCatalogImages) obj).tile);
    }

    public final String getTile() {
        return this.tile;
    }

    public int hashCode() {
        String str = this.tile;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("RewardsCatalogImages(tile=", this.tile, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.tile);
    }
}
