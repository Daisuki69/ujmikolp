package com.google.android.exoplayer2.source;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format[] f9653b;
    public int c;

    public TrackGroup(Parcel parcel) {
        int i = parcel.readInt();
        this.f9652a = i;
        this.f9653b = new Format[i];
        for (int i4 = 0; i4 < this.f9652a; i4++) {
            this.f9653b[i4] = (Format) parcel.readParcelable(Format.class.getClassLoader());
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
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.f9652a == trackGroup.f9652a && Arrays.equals(this.f9653b, trackGroup.f9653b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.f9653b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i4 = this.f9652a;
        parcel.writeInt(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            parcel.writeParcelable(this.f9653b[i6], 0);
        }
    }
}
