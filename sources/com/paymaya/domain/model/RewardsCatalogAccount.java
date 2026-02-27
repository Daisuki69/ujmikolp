package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogAccount implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogAccount> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("balance")
    private final RewardsCatalogAccountBalance balance;

    @InterfaceC1497a
    @InterfaceC1498b("cardStatus")
    private final String cardStatus;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogAccount createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new RewardsCatalogAccount(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RewardsCatalogAccountBalance.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogAccount[] newArray(int i) {
            return new RewardsCatalogAccount[i];
        }
    }

    public RewardsCatalogAccount(String str, String str2, RewardsCatalogAccountBalance rewardsCatalogAccountBalance) {
        this.status = str;
        this.cardStatus = str2;
        this.balance = rewardsCatalogAccountBalance;
    }

    public static /* synthetic */ RewardsCatalogAccount copy$default(RewardsCatalogAccount rewardsCatalogAccount, String str, String str2, RewardsCatalogAccountBalance rewardsCatalogAccountBalance, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsCatalogAccount.status;
        }
        if ((i & 2) != 0) {
            str2 = rewardsCatalogAccount.cardStatus;
        }
        if ((i & 4) != 0) {
            rewardsCatalogAccountBalance = rewardsCatalogAccount.balance;
        }
        return rewardsCatalogAccount.copy(str, str2, rewardsCatalogAccountBalance);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.cardStatus;
    }

    public final RewardsCatalogAccountBalance component3() {
        return this.balance;
    }

    public final RewardsCatalogAccount copy(String str, String str2, RewardsCatalogAccountBalance rewardsCatalogAccountBalance) {
        return new RewardsCatalogAccount(str, str2, rewardsCatalogAccountBalance);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCatalogAccount)) {
            return false;
        }
        RewardsCatalogAccount rewardsCatalogAccount = (RewardsCatalogAccount) obj;
        return j.b(this.status, rewardsCatalogAccount.status) && j.b(this.cardStatus, rewardsCatalogAccount.cardStatus) && j.b(this.balance, rewardsCatalogAccount.balance);
    }

    public final RewardsCatalogAccountBalance getBalance() {
        return this.balance;
    }

    public final String getCardStatus() {
        return this.cardStatus;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RewardsCatalogAccountBalance rewardsCatalogAccountBalance = this.balance;
        return iHashCode2 + (rewardsCatalogAccountBalance != null ? rewardsCatalogAccountBalance.hashCode() : 0);
    }

    public String toString() {
        String str = this.status;
        String str2 = this.cardStatus;
        RewardsCatalogAccountBalance rewardsCatalogAccountBalance = this.balance;
        StringBuilder sbX = s.x("RewardsCatalogAccount(status=", str, ", cardStatus=", str2, ", balance=");
        sbX.append(rewardsCatalogAccountBalance);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.status);
        dest.writeString(this.cardStatus);
        RewardsCatalogAccountBalance rewardsCatalogAccountBalance = this.balance;
        if (rewardsCatalogAccountBalance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsCatalogAccountBalance.writeToParcel(dest, i);
        }
    }
}
