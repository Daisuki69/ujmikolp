package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaXPScore implements Parcelable {
    public static final Parcelable.Creator<MayaXPScore> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("score")
    private final int score;

    @InterfaceC1497a
    @InterfaceC1498b("tier")
    private final String tier;

    @InterfaceC1497a
    @InterfaceC1498b("tiers")
    private final List<MayaXPTier> tiers;

    public static final class Creator implements Parcelable.Creator<MayaXPScore> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPScore createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int I4 = 0;
            while (I4 != i4) {
                I4 = AbstractC1213b.I(MayaXPTier.CREATOR, parcel, arrayList, I4, 1);
            }
            return new MayaXPScore(i, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPScore[] newArray(int i) {
            return new MayaXPScore[i];
        }
    }

    public MayaXPScore(int i, String tier, List<MayaXPTier> tiers) {
        j.g(tier, "tier");
        j.g(tiers, "tiers");
        this.score = i;
        this.tier = tier;
        this.tiers = tiers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MayaXPScore copy$default(MayaXPScore mayaXPScore, int i, String str, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mayaXPScore.score;
        }
        if ((i4 & 2) != 0) {
            str = mayaXPScore.tier;
        }
        if ((i4 & 4) != 0) {
            list = mayaXPScore.tiers;
        }
        return mayaXPScore.copy(i, str, list);
    }

    public final int component1() {
        return this.score;
    }

    public final String component2() {
        return this.tier;
    }

    public final List<MayaXPTier> component3() {
        return this.tiers;
    }

    public final MayaXPScore copy(int i, String tier, List<MayaXPTier> tiers) {
        j.g(tier, "tier");
        j.g(tiers, "tiers");
        return new MayaXPScore(i, tier, tiers);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MayaXPScore)) {
            return false;
        }
        MayaXPScore mayaXPScore = (MayaXPScore) obj;
        return this.score == mayaXPScore.score && j.b(this.tier, mayaXPScore.tier) && j.b(this.tiers, mayaXPScore.tiers);
    }

    public final int getScore() {
        return this.score;
    }

    public final String getTier() {
        return this.tier;
    }

    public final List<MayaXPTier> getTiers() {
        return this.tiers;
    }

    public int hashCode() {
        return this.tiers.hashCode() + AbstractC1414e.c(this.score * 31, 31, this.tier);
    }

    public String toString() {
        int i = this.score;
        String str = this.tier;
        List<MayaXPTier> list = this.tiers;
        StringBuilder sb2 = new StringBuilder("MayaXPScore(score=");
        sb2.append(i);
        sb2.append(", tier=");
        sb2.append(str);
        sb2.append(", tiers=");
        return s.r(sb2, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.score);
        dest.writeString(this.tier);
        Iterator itQ = AbstractC1213b.Q(this.tiers, dest);
        while (itQ.hasNext()) {
            ((MayaXPTier) itQ.next()).writeToParcel(dest, i);
        }
    }
}
