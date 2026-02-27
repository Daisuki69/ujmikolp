package com.google.android.exoplayer2.metadata.flac;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.AbstractC1414e;
import java.util.Arrays;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9646b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9647d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9648g;
    public final byte[] h;

    public PictureFrame(Parcel parcel) {
        this.f9645a = parcel.readInt();
        String string = parcel.readString();
        int i = AbstractC2550e.f21351a;
        this.f9646b = string;
        this.c = parcel.readString();
        this.f9647d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.f9648g = parcel.readInt();
        this.h = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.f9645a == pictureFrame.f9645a && this.f9646b.equals(pictureFrame.f9646b) && this.c.equals(pictureFrame.c) && this.f9647d == pictureFrame.f9647d && this.e == pictureFrame.e && this.f == pictureFrame.f && this.f9648g == pictureFrame.f9648g && Arrays.equals(this.h, pictureFrame.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((AbstractC1414e.c(AbstractC1414e.c((527 + this.f9645a) * 31, 31, this.f9646b), 31, this.c) + this.f9647d) * 31) + this.e) * 31) + this.f) * 31) + this.f9648g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f9646b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9645a);
        parcel.writeString(this.f9646b);
        parcel.writeString(this.c);
        parcel.writeInt(this.f9647d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f9648g);
        parcel.writeByteArray(this.h);
    }
}
