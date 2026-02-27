package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new A1.a(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDescriptionCompat f7266b;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f7265a = parcel.readInt();
        this.f7266b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f7265a + ", mDescription=" + this.f7266b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7265a);
        this.f7266b.writeToParcel(parcel, i);
    }
}
