package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new A1.a(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f7268b;
    public final CharSequence c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f7269d;
    public final Bitmap e;
    public final Uri f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f7270g;
    public final Uri h;
    public MediaDescription i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f7267a = str;
        this.f7268b = charSequence;
        this.c = charSequence2;
        this.f7269d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.f7270g = bundle;
        this.h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f7268b) + ", " + ((Object) this.c) + ", " + ((Object) this.f7269d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionA = this.i;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = h.b();
            h.n(builderB, this.f7267a);
            h.p(builderB, this.f7268b);
            h.o(builderB, this.c);
            h.j(builderB, this.f7269d);
            h.l(builderB, this.e);
            h.m(builderB, this.f);
            h.k(builderB, this.f7270g);
            i.b(builderB, this.h);
            mediaDescriptionA = h.a(builderB);
            this.i = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i);
    }
}
