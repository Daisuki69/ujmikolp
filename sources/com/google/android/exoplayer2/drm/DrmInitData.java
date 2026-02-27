package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import n1.AbstractC1895a;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new A1.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchemeData[] f9639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9640b;
    public final String c;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f9642b;
        public final String c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f9643d;
        public final byte[] e;

        public SchemeData(Parcel parcel) {
            this.f9642b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            String string = parcel.readString();
            int i = AbstractC2550e.f21351a;
            this.f9643d = string;
            this.e = parcel.createByteArray();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return AbstractC2550e.a(this.c, schemeData.c) && AbstractC2550e.a(this.f9643d, schemeData.f9643d) && AbstractC2550e.a(this.f9642b, schemeData.f9642b) && Arrays.equals(this.e, schemeData.e);
        }

        public final int hashCode() {
            if (this.f9641a == 0) {
                int iHashCode = this.f9642b.hashCode() * 31;
                String str = this.c;
                this.f9641a = Arrays.hashCode(this.e) + AbstractC1414e.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f9643d);
            }
            return this.f9641a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.f9642b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.f9643d);
            parcel.writeByteArray(this.e);
        }
    }

    public DrmInitData(Parcel parcel) {
        this.c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = AbstractC2550e.f21351a;
        this.f9639a = schemeDataArr;
        int length = schemeDataArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = AbstractC1895a.f18561a;
        return uuid.equals(schemeData3.f9642b) ? uuid.equals(schemeData4.f9642b) ? 0 : 1 : schemeData3.f9642b.compareTo(schemeData4.f9642b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (AbstractC2550e.a(this.c, drmInitData.c) && Arrays.equals(this.f9639a, drmInitData.f9639a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9640b == 0) {
            String str = this.c;
            this.f9640b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f9639a);
        }
        return this.f9640b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.f9639a, 0);
    }
}
