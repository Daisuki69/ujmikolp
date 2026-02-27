package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new g(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f7288b;
    public c c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7287a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VersionedParcelable f7289d = null;

    public MediaSessionCompat$Token(Parcelable parcelable, c cVar) {
        this.f7288b = parcelable;
        this.c = cVar;
    }

    public static MediaSessionCompat$Token a(Parcelable parcelable, c cVar) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof MediaSession.Token) {
            return new MediaSessionCompat$Token(parcelable, cVar);
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    public final c b() {
        c cVar;
        synchronized (this.f7287a) {
            cVar = this.c;
        }
        return cVar;
    }

    public final void c(c cVar) {
        synchronized (this.f7287a) {
            this.c = cVar;
        }
    }

    public final void d(VersionedParcelable versionedParcelable) {
        synchronized (this.f7287a) {
            this.f7289d = versionedParcelable;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Parcelable parcelable = this.f7288b;
        if (parcelable == null) {
            return mediaSessionCompat$Token.f7288b == null;
        }
        Parcelable parcelable2 = mediaSessionCompat$Token.f7288b;
        if (parcelable2 == null) {
            return false;
        }
        return parcelable.equals(parcelable2);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f7288b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7288b, i);
    }
}
