package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.media.utils.MediaConstants;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f7271a;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("android.media.metadata.TITLE", 1);
        arrayMap.put("android.media.metadata.ARTIST", 1);
        arrayMap.put("android.media.metadata.DURATION", 0);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_ALBUM, 1);
        arrayMap.put("android.media.metadata.AUTHOR", 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_WRITER, 1);
        arrayMap.put("android.media.metadata.COMPOSER", 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_COMPILATION, 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_DATE, 1);
        arrayMap.put("android.media.metadata.YEAR", 0);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_GENRE, 1);
        arrayMap.put("android.media.metadata.TRACK_NUMBER", 0);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0);
        arrayMap.put("android.media.metadata.DISC_NUMBER", 0);
        arrayMap.put("android.media.metadata.ALBUM_ARTIST", 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_ART, 2);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_ART_URI, 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_ALBUM_ART, 2);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_USER_RATING, 3);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_RATING, 3);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 2);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, 1);
        arrayMap.put(mx_android.support.v4.media.MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 1);
        arrayMap.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        arrayMap.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap.put(MediaConstants.METADATA_KEY_IS_ADVERTISEMENT, 0);
        arrayMap.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new A1.a(19);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f7271a = parcel.readBundle(android.support.v4.media.session.h.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f7271a);
    }
}
