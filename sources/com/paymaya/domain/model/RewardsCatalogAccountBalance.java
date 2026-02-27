package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogAccountBalance implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogAccountBalance> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("fiat")
    private final RewardsCatalogMoney fiat;

    @InterfaceC1497a
    @InterfaceC1498b("points")
    private final RewardsCatalogMoney points;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogAccountBalance createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new RewardsCatalogAccountBalance(parcel.readInt() == 0 ? null : RewardsCatalogMoney.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RewardsCatalogMoney.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogAccountBalance[] newArray(int i) {
            return new RewardsCatalogAccountBalance[i];
        }
    }

    public RewardsCatalogAccountBalance(RewardsCatalogMoney rewardsCatalogMoney, RewardsCatalogMoney rewardsCatalogMoney2) {
        this.fiat = rewardsCatalogMoney;
        this.points = rewardsCatalogMoney2;
    }

    public static /* synthetic */ RewardsCatalogAccountBalance copy$default(RewardsCatalogAccountBalance rewardsCatalogAccountBalance, RewardsCatalogMoney rewardsCatalogMoney, RewardsCatalogMoney rewardsCatalogMoney2, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsCatalogMoney = rewardsCatalogAccountBalance.fiat;
        }
        if ((i & 2) != 0) {
            rewardsCatalogMoney2 = rewardsCatalogAccountBalance.points;
        }
        return rewardsCatalogAccountBalance.copy(rewardsCatalogMoney, rewardsCatalogMoney2);
    }

    public final RewardsCatalogMoney component1() {
        return this.fiat;
    }

    public final RewardsCatalogMoney component2() {
        return this.points;
    }

    public final RewardsCatalogAccountBalance copy(RewardsCatalogMoney rewardsCatalogMoney, RewardsCatalogMoney rewardsCatalogMoney2) {
        return new RewardsCatalogAccountBalance(rewardsCatalogMoney, rewardsCatalogMoney2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCatalogAccountBalance)) {
            return false;
        }
        RewardsCatalogAccountBalance rewardsCatalogAccountBalance = (RewardsCatalogAccountBalance) obj;
        return j.b(this.fiat, rewardsCatalogAccountBalance.fiat) && j.b(this.points, rewardsCatalogAccountBalance.points);
    }

    public final RewardsCatalogMoney getFiat() {
        return this.fiat;
    }

    public final RewardsCatalogMoney getPoints() {
        return this.points;
    }

    public int hashCode() {
        RewardsCatalogMoney rewardsCatalogMoney = this.fiat;
        int iHashCode = (rewardsCatalogMoney == null ? 0 : rewardsCatalogMoney.hashCode()) * 31;
        RewardsCatalogMoney rewardsCatalogMoney2 = this.points;
        return iHashCode + (rewardsCatalogMoney2 != null ? rewardsCatalogMoney2.hashCode() : 0);
    }

    public String toString() {
        return "RewardsCatalogAccountBalance(fiat=" + this.fiat + ", points=" + this.points + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        RewardsCatalogMoney rewardsCatalogMoney = this.fiat;
        if (rewardsCatalogMoney == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsCatalogMoney.writeToParcel(dest, i);
        }
        RewardsCatalogMoney rewardsCatalogMoney2 = this.points;
        if (rewardsCatalogMoney2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsCatalogMoney2.writeToParcel(dest, i);
        }
    }
}
