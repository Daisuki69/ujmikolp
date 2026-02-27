package com.google.android.exoplayer2.video;

import A1.a;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9699b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9700d;
    public int e;

    public ColorInfo(Parcel parcel) {
        this.f9698a = parcel.readInt();
        this.f9699b = parcel.readInt();
        this.c = parcel.readInt();
        int i = AbstractC2550e.f21351a;
        this.f9700d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.f9698a == colorInfo.f9698a && this.f9699b == colorInfo.f9699b && this.c == colorInfo.c && Arrays.equals(this.f9700d, colorInfo.f9700d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.f9700d) + ((((((527 + this.f9698a) * 31) + this.f9699b) * 31) + this.c) * 31);
        }
        return this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f9698a);
        sb2.append(", ");
        sb2.append(this.f9699b);
        sb2.append(", ");
        sb2.append(this.c);
        sb2.append(", ");
        return s.s(sb2, this.f9700d != null, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9698a);
        parcel.writeInt(this.f9699b);
        parcel.writeInt(this.c);
        byte[] bArr = this.f9700d;
        int i4 = bArr != null ? 1 : 0;
        int i6 = AbstractC2550e.f21351a;
        parcel.writeInt(i4);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
