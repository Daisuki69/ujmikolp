package com.google.android.exoplayer2;

import A1.a;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import o1.AbstractC1955a;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a(24);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f9611B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f9612K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f9613P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f9614Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f9615R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Class f9616S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f9617T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9619b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9620d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9621g;
    public final int h;
    public final String i;
    public final Metadata j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f9622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9623l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DrmInitData f9625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f9629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f9631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f9632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ColorInfo f9634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9635y;

    public Format(Parcel parcel) {
        this.f9618a = parcel.readString();
        this.f9619b = parcel.readString();
        this.c = parcel.readString();
        this.f9620d = parcel.readInt();
        this.e = parcel.readInt();
        int i = parcel.readInt();
        this.f = i;
        int i4 = parcel.readInt();
        this.f9621g = i4;
        this.h = i4 != -1 ? i4 : i;
        this.i = parcel.readString();
        this.j = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f9622k = parcel.readString();
        this.f9623l = parcel.readString();
        this.m = parcel.readInt();
        int i6 = parcel.readInt();
        this.f9624n = new ArrayList(i6);
        for (int i10 = 0; i10 < i6; i10++) {
            ArrayList arrayList = this.f9624n;
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bArrCreateByteArray.getClass();
            arrayList.add(bArrCreateByteArray);
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f9625o = drmInitData;
        this.f9626p = parcel.readLong();
        this.f9627q = parcel.readInt();
        this.f9628r = parcel.readInt();
        this.f9629s = parcel.readFloat();
        this.f9630t = parcel.readInt();
        this.f9631u = parcel.readFloat();
        int i11 = AbstractC2550e.f21351a;
        this.f9632v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f9633w = parcel.readInt();
        this.f9634x = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f9635y = parcel.readInt();
        this.f9611B = parcel.readInt();
        this.f9612K = parcel.readInt();
        this.f9613P = parcel.readInt();
        this.f9614Q = parcel.readInt();
        this.f9615R = parcel.readInt();
        this.f9616S = drmInitData != null ? AbstractC1955a.class : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            int i4 = this.f9617T;
            if ((i4 == 0 || (i = format.f9617T) == 0 || i4 == i) && this.f9620d == format.f9620d && this.e == format.e && this.f == format.f && this.f9621g == format.f9621g && this.m == format.m && this.f9626p == format.f9626p && this.f9627q == format.f9627q && this.f9628r == format.f9628r && this.f9630t == format.f9630t && this.f9633w == format.f9633w && this.f9635y == format.f9635y && this.f9611B == format.f9611B && this.f9612K == format.f9612K && this.f9613P == format.f9613P && this.f9614Q == format.f9614Q && this.f9615R == format.f9615R && Float.compare(this.f9629s, format.f9629s) == 0 && Float.compare(this.f9631u, format.f9631u) == 0 && AbstractC2550e.a(this.f9616S, format.f9616S) && AbstractC2550e.a(this.f9618a, format.f9618a) && AbstractC2550e.a(this.f9619b, format.f9619b) && AbstractC2550e.a(this.i, format.i) && AbstractC2550e.a(this.f9622k, format.f9622k) && AbstractC2550e.a(this.f9623l, format.f9623l) && AbstractC2550e.a(this.c, format.c) && Arrays.equals(this.f9632v, format.f9632v) && AbstractC2550e.a(this.j, format.j) && AbstractC2550e.a(this.f9634x, format.f9634x) && AbstractC2550e.a(this.f9625o, format.f9625o)) {
                ArrayList arrayList = this.f9624n;
                int size = arrayList.size();
                ArrayList arrayList2 = format.f9624n;
                if (size == arrayList2.size()) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        if (Arrays.equals((byte[]) arrayList.get(i6), (byte[]) arrayList2.get(i6))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9617T == 0) {
            String str = this.f9618a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f9619b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f9620d) * 31) + this.e) * 31) + this.f) * 31) + this.f9621g) * 31;
            String str4 = this.i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.j;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : Arrays.hashCode(metadata.f9644a))) * 31;
            String str5 = this.f9622k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f9623l;
            int iFloatToIntBits = (((((((((((((((Float.floatToIntBits(this.f9631u) + ((((Float.floatToIntBits(this.f9629s) + ((((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.m) * 31) + ((int) this.f9626p)) * 31) + this.f9627q) * 31) + this.f9628r) * 31)) * 31) + this.f9630t) * 31)) * 31) + this.f9633w) * 31) + this.f9635y) * 31) + this.f9611B) * 31) + this.f9612K) * 31) + this.f9613P) * 31) + this.f9614Q) * 31) + this.f9615R) * 31;
            Class cls = this.f9616S;
            this.f9617T = iFloatToIntBits + (cls != null ? cls.hashCode() : 0);
        }
        return this.f9617T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f9618a);
        sb2.append(", ");
        sb2.append(this.f9619b);
        sb2.append(", ");
        sb2.append(this.f9622k);
        sb2.append(", ");
        sb2.append(this.f9623l);
        sb2.append(", ");
        sb2.append(this.i);
        sb2.append(", ");
        sb2.append(this.h);
        sb2.append(", ");
        sb2.append(this.c);
        sb2.append(", [");
        sb2.append(this.f9627q);
        sb2.append(", ");
        sb2.append(this.f9628r);
        sb2.append(", ");
        sb2.append(this.f9629s);
        sb2.append("], [");
        sb2.append(this.f9635y);
        sb2.append(", ");
        return s.o(sb2, "])", this.f9611B);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9618a);
        parcel.writeString(this.f9619b);
        parcel.writeString(this.c);
        parcel.writeInt(this.f9620d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f9621g);
        parcel.writeString(this.i);
        parcel.writeParcelable(this.j, 0);
        parcel.writeString(this.f9622k);
        parcel.writeString(this.f9623l);
        parcel.writeInt(this.m);
        ArrayList arrayList = this.f9624n;
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeByteArray((byte[]) arrayList.get(i4));
        }
        parcel.writeParcelable(this.f9625o, 0);
        parcel.writeLong(this.f9626p);
        parcel.writeInt(this.f9627q);
        parcel.writeInt(this.f9628r);
        parcel.writeFloat(this.f9629s);
        parcel.writeInt(this.f9630t);
        parcel.writeFloat(this.f9631u);
        byte[] bArr = this.f9632v;
        int i6 = bArr == null ? 0 : 1;
        int i10 = AbstractC2550e.f21351a;
        parcel.writeInt(i6);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f9633w);
        parcel.writeParcelable(this.f9634x, i);
        parcel.writeInt(this.f9635y);
        parcel.writeInt(this.f9611B);
        parcel.writeInt(this.f9612K);
        parcel.writeInt(this.f9613P);
        parcel.writeInt(this.f9614Q);
        parcel.writeInt(this.f9615R);
    }
}
