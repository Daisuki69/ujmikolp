package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogResult implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogResult> CREATOR = new Creator();
    private final String accountStatus;
    private final boolean hasMayaBlack;
    private final Double milesBalance;
    private final List<RewardsCatalog> rewards;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogResult createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(RewardsCatalog.CREATOR, parcel, arrayList, I4, 1);
            }
            return new RewardsCatalogResult(arrayList, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogResult[] newArray(int i) {
            return new RewardsCatalogResult[i];
        }
    }

    public RewardsCatalogResult(List<RewardsCatalog> rewards, Double d10, boolean z4, String str) {
        j.g(rewards, "rewards");
        this.rewards = rewards;
        this.milesBalance = d10;
        this.hasMayaBlack = z4;
        this.accountStatus = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardsCatalogResult copy$default(RewardsCatalogResult rewardsCatalogResult, List list, Double d10, boolean z4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rewardsCatalogResult.rewards;
        }
        if ((i & 2) != 0) {
            d10 = rewardsCatalogResult.milesBalance;
        }
        if ((i & 4) != 0) {
            z4 = rewardsCatalogResult.hasMayaBlack;
        }
        if ((i & 8) != 0) {
            str = rewardsCatalogResult.accountStatus;
        }
        return rewardsCatalogResult.copy(list, d10, z4, str);
    }

    public final List<RewardsCatalog> component1() {
        return this.rewards;
    }

    public final Double component2() {
        return this.milesBalance;
    }

    public final boolean component3() {
        return this.hasMayaBlack;
    }

    public final String component4() {
        return this.accountStatus;
    }

    public final RewardsCatalogResult copy(List<RewardsCatalog> rewards, Double d10, boolean z4, String str) {
        j.g(rewards, "rewards");
        return new RewardsCatalogResult(rewards, d10, z4, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCatalogResult)) {
            return false;
        }
        RewardsCatalogResult rewardsCatalogResult = (RewardsCatalogResult) obj;
        return j.b(this.rewards, rewardsCatalogResult.rewards) && j.b(this.milesBalance, rewardsCatalogResult.milesBalance) && this.hasMayaBlack == rewardsCatalogResult.hasMayaBlack && j.b(this.accountStatus, rewardsCatalogResult.accountStatus);
    }

    public final String getAccountStatus() {
        return this.accountStatus;
    }

    public final boolean getHasMayaBlack() {
        return this.hasMayaBlack;
    }

    public final Double getMilesBalance() {
        return this.milesBalance;
    }

    public final List<RewardsCatalog> getRewards() {
        return this.rewards;
    }

    public int hashCode() {
        int iHashCode = this.rewards.hashCode() * 31;
        Double d10 = this.milesBalance;
        int iHashCode2 = (((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + (this.hasMayaBlack ? 1231 : 1237)) * 31;
        String str = this.accountStatus;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RewardsCatalogResult(rewards=" + this.rewards + ", milesBalance=" + this.milesBalance + ", hasMayaBlack=" + this.hasMayaBlack + ", accountStatus=" + this.accountStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.rewards, dest);
        while (itQ.hasNext()) {
            ((RewardsCatalog) itQ.next()).writeToParcel(dest, i);
        }
        Double d10 = this.milesBalance;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        dest.writeInt(this.hasMayaBlack ? 1 : 0);
        dest.writeString(this.accountStatus);
    }
}
