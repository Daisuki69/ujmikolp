package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7291b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7292d;
    public int e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7290a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f7292d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f7291b);
    }
}
