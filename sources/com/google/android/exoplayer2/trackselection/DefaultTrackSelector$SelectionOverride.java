package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s1.C2232g;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultTrackSelector$SelectionOverride implements Parcelable {
    public static final Parcelable.Creator<DefaultTrackSelector$SelectionOverride> CREATOR = new C2232g(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9683b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9684d;

    public DefaultTrackSelector$SelectionOverride(int i, int... iArr) {
        this.f9682a = i;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f9683b = iArrCopyOf;
        this.c = 2;
        this.f9684d = 0;
        Arrays.sort(iArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DefaultTrackSelector$SelectionOverride.class == obj.getClass()) {
            DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride = (DefaultTrackSelector$SelectionOverride) obj;
            if (this.f9682a == defaultTrackSelector$SelectionOverride.f9682a && Arrays.equals(this.f9683b, defaultTrackSelector$SelectionOverride.f9683b) && this.c == defaultTrackSelector$SelectionOverride.c && this.f9684d == defaultTrackSelector$SelectionOverride.f9684d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9683b) + (this.f9682a * 31)) * 31) + this.c) * 31) + this.f9684d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9682a);
        int[] iArr = this.f9683b;
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(iArr);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f9684d);
    }

    public DefaultTrackSelector$SelectionOverride(Parcel parcel) {
        this.f9682a = parcel.readInt();
        int[] iArr = new int[parcel.readByte()];
        this.f9683b = iArr;
        parcel.readIntArray(iArr);
        this.c = parcel.readInt();
        this.f9684d = parcel.readInt();
    }
}
