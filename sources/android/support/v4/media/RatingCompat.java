package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new A1.a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7273b;

    public RatingCompat(int i, float f) {
        this.f7272a = i;
        this.f7273b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f7272a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f7272a);
        sb2.append(" rating=");
        float f = this.f7273b;
        sb2.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7272a);
        parcel.writeFloat(this.f7273b);
    }
}
