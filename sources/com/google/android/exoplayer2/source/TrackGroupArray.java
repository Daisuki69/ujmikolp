package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s1.C2232g;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackGroupArray implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackGroup[] f9656b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TrackGroupArray f9654d = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C2232g(0);

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f9656b = trackGroupArr;
        this.f9655a = trackGroupArr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.f9655a == trackGroupArray.f9655a && Arrays.equals(this.f9656b, trackGroupArray.f9656b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.f9656b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i4 = this.f9655a;
        parcel.writeInt(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            parcel.writeParcelable(this.f9656b[i6], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int i = parcel.readInt();
        this.f9655a = i;
        this.f9656b = new TrackGroup[i];
        for (int i4 = 0; i4 < this.f9655a; i4++) {
            this.f9656b[i4] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
