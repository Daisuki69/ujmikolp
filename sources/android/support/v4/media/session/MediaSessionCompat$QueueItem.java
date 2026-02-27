package android.support.v4.media.session;

import We.s;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaDescriptionCompat f7284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7285b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f7284a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f7285b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
        sb2.append(this.f7284a);
        sb2.append(", Id=");
        return s.h(this.f7285b, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f7284a.writeToParcel(parcel, i);
        parcel.writeLong(this.f7285b);
    }
}
