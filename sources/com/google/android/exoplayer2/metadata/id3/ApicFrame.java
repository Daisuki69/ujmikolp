package com.google.android.exoplayer2.metadata.id3;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9650b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9651d;

    public ApicFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC2550e.f21351a;
        this.f9649a = string;
        this.f9650b = parcel.readString();
        this.c = parcel.readInt();
        this.f9651d = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.c == apicFrame.c && AbstractC2550e.a(this.f9649a, apicFrame.f9649a) && AbstractC2550e.a(this.f9650b, apicFrame.f9650b) && Arrays.equals(this.f9651d, apicFrame.f9651d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.c) * 31;
        String str = this.f9649a;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9650b;
        return Arrays.hashCode(this.f9651d) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "APIC: mimeType=" + this.f9649a + ", description=" + this.f9650b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9649a);
        parcel.writeString(this.f9650b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.f9651d);
    }
}
