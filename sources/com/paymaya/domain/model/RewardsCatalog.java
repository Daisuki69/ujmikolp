package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalog implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalog> CREATOR = new Creator();
    private final String points;
    private final String productId;
    private final String thumbnail;
    private final String title;

    public static final class Creator implements Parcelable.Creator<RewardsCatalog> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalog createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new RewardsCatalog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalog[] newArray(int i) {
            return new RewardsCatalog[i];
        }
    }

    public RewardsCatalog(String productId, String title, String str, String points) {
        j.g(productId, "productId");
        j.g(title, "title");
        j.g(points, "points");
        this.productId = productId;
        this.title = title;
        this.thumbnail = str;
        this.points = points;
    }

    public static /* synthetic */ RewardsCatalog copy$default(RewardsCatalog rewardsCatalog, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsCatalog.productId;
        }
        if ((i & 2) != 0) {
            str2 = rewardsCatalog.title;
        }
        if ((i & 4) != 0) {
            str3 = rewardsCatalog.thumbnail;
        }
        if ((i & 8) != 0) {
            str4 = rewardsCatalog.points;
        }
        return rewardsCatalog.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.thumbnail;
    }

    public final String component4() {
        return this.points;
    }

    public final RewardsCatalog copy(String productId, String title, String str, String points) {
        j.g(productId, "productId");
        j.g(title, "title");
        j.g(points, "points");
        return new RewardsCatalog(productId, title, str, points);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCatalog)) {
            return false;
        }
        RewardsCatalog rewardsCatalog = (RewardsCatalog) obj;
        return j.b(this.productId, rewardsCatalog.productId) && j.b(this.title, rewardsCatalog.title) && j.b(this.thumbnail, rewardsCatalog.thumbnail) && j.b(this.points, rewardsCatalog.points);
    }

    public final String getPoints() {
        return this.points;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(this.productId.hashCode() * 31, 31, this.title);
        String str = this.thumbnail;
        return this.points.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.title;
        return a.p(s.x("RewardsCatalog(productId=", str, ", title=", str2, ", thumbnail="), this.thumbnail, ", points=", this.points, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.productId);
        dest.writeString(this.title);
        dest.writeString(this.thumbnail);
        dest.writeString(this.points);
    }
}
