package android.support.v4.media.session;

import We.s;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7294b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7295d;
    public final long e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f7296g;
    public final long h;
    public final ArrayList i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f7297k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new i();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f7299b;
        public final int c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f7300d;

        public CustomAction(Parcel parcel) {
            this.f7298a = parcel.readString();
            this.f7299b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.f7300d = parcel.readBundle(h.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f7299b) + ", mIcon=" + this.c + ", mExtras=" + this.f7300d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f7298a);
            TextUtils.writeToParcel(this.f7299b, parcel, i);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.f7300d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f7293a = parcel.readInt();
        this.f7294b = parcel.readLong();
        this.f7295d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.f7296g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.f7297k = parcel.readBundle(h.class.getClassLoader());
        this.f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f7293a);
        sb2.append(", position=");
        sb2.append(this.f7294b);
        sb2.append(", buffered position=");
        sb2.append(this.c);
        sb2.append(", speed=");
        sb2.append(this.f7295d);
        sb2.append(", updated=");
        sb2.append(this.h);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f);
        sb2.append(", error message=");
        sb2.append(this.f7296g);
        sb2.append(", custom actions=");
        sb2.append(this.i);
        sb2.append(", active item id=");
        return s.h(this.j, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7293a);
        parcel.writeLong(this.f7294b);
        parcel.writeFloat(this.f7295d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.f7296g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.f7297k);
        parcel.writeInt(this.f);
    }
}
