package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogAmount implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogAmount> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("denomination")
    private final RewardsCatalogMoney denomination;

    @InterfaceC1497a
    @InterfaceC1498b("points")
    private final RewardsCatalogMoney points;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogAmount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogAmount createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            Parcelable.Creator<RewardsCatalogMoney> creator = RewardsCatalogMoney.CREATOR;
            return new RewardsCatalogAmount(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogAmount[] newArray(int i) {
            return new RewardsCatalogAmount[i];
        }
    }

    public RewardsCatalogAmount(RewardsCatalogMoney points, RewardsCatalogMoney denomination) {
        j.g(points, "points");
        j.g(denomination, "denomination");
        this.points = points;
        this.denomination = denomination;
    }

    public static /* synthetic */ RewardsCatalogAmount copy$default(RewardsCatalogAmount rewardsCatalogAmount, RewardsCatalogMoney rewardsCatalogMoney, RewardsCatalogMoney rewardsCatalogMoney2, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsCatalogMoney = rewardsCatalogAmount.points;
        }
        if ((i & 2) != 0) {
            rewardsCatalogMoney2 = rewardsCatalogAmount.denomination;
        }
        return rewardsCatalogAmount.copy(rewardsCatalogMoney, rewardsCatalogMoney2);
    }

    public final RewardsCatalogMoney component1() {
        return this.points;
    }

    public final RewardsCatalogMoney component2() {
        return this.denomination;
    }

    public final RewardsCatalogAmount copy(RewardsCatalogMoney points, RewardsCatalogMoney denomination) {
        j.g(points, "points");
        j.g(denomination, "denomination");
        return new RewardsCatalogAmount(points, denomination);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCatalogAmount)) {
            return false;
        }
        RewardsCatalogAmount rewardsCatalogAmount = (RewardsCatalogAmount) obj;
        return j.b(this.points, rewardsCatalogAmount.points) && j.b(this.denomination, rewardsCatalogAmount.denomination);
    }

    public final RewardsCatalogMoney getDenomination() {
        return this.denomination;
    }

    public final RewardsCatalogMoney getPoints() {
        return this.points;
    }

    public int hashCode() {
        return this.denomination.hashCode() + (this.points.hashCode() * 31);
    }

    public String toString() {
        return "RewardsCatalogAmount(points=" + this.points + ", denomination=" + this.denomination + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.points.writeToParcel(dest, i);
        this.denomination.writeToParcel(dest, i);
    }
}
