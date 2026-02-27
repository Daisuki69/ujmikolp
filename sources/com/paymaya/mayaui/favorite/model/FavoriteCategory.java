package com.paymaya.mayaui.favorite.model;

import A1.a;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FavoriteCategory implements Parcelable {
    public static final Parcelable.Creator<FavoriteCategory> CREATOR = new a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12315b;

    public FavoriteCategory(String categoryName, String str) {
        j.g(categoryName, "categoryName");
        this.f12314a = categoryName;
        this.f12315b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteCategory)) {
            return false;
        }
        FavoriteCategory favoriteCategory = (FavoriteCategory) obj;
        return j.b(this.f12314a, favoriteCategory.f12314a) && j.b(this.f12315b, favoriteCategory.f12315b);
    }

    public final int hashCode() {
        int iHashCode = this.f12314a.hashCode() * 31;
        String str = this.f12315b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteCategory(categoryName=");
        sb2.append(this.f12314a);
        sb2.append(", categoryType=");
        return s.p(sb2, this.f12315b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f12314a);
        dest.writeString(this.f12315b);
    }
}
