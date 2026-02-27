package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogMetadata implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogMetadata> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("account")
    private final RewardsCatalogAccount account;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogMetadata createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new RewardsCatalogMetadata(parcel.readInt() == 0 ? null : RewardsCatalogAccount.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogMetadata[] newArray(int i) {
            return new RewardsCatalogMetadata[i];
        }
    }

    public RewardsCatalogMetadata(RewardsCatalogAccount rewardsCatalogAccount) {
        this.account = rewardsCatalogAccount;
    }

    public static /* synthetic */ RewardsCatalogMetadata copy$default(RewardsCatalogMetadata rewardsCatalogMetadata, RewardsCatalogAccount rewardsCatalogAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsCatalogAccount = rewardsCatalogMetadata.account;
        }
        return rewardsCatalogMetadata.copy(rewardsCatalogAccount);
    }

    public final RewardsCatalogAccount component1() {
        return this.account;
    }

    public final RewardsCatalogMetadata copy(RewardsCatalogAccount rewardsCatalogAccount) {
        return new RewardsCatalogMetadata(rewardsCatalogAccount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsCatalogMetadata) && j.b(this.account, ((RewardsCatalogMetadata) obj).account);
    }

    public final RewardsCatalogAccount getAccount() {
        return this.account;
    }

    public int hashCode() {
        RewardsCatalogAccount rewardsCatalogAccount = this.account;
        if (rewardsCatalogAccount == null) {
            return 0;
        }
        return rewardsCatalogAccount.hashCode();
    }

    public String toString() {
        return "RewardsCatalogMetadata(account=" + this.account + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        RewardsCatalogAccount rewardsCatalogAccount = this.account;
        if (rewardsCatalogAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsCatalogAccount.writeToParcel(dest, i);
        }
    }
}
