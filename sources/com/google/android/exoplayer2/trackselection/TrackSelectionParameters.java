package com.google.android.exoplayer2.trackselection;

import O1.P;
import O1.S;
import O1.t0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s1.C2232g;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f9685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9686b;
    public final S c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9687d;
    public final boolean e;
    public final int f;

    static {
        P p10 = S.f4555b;
        t0 t0Var = t0.e;
        CREATOR = new C2232g(3);
    }

    public TrackSelectionParameters(S s9, int i, S s10, int i4, boolean z4, int i6) {
        this.f9685a = s9;
        this.f9686b = i;
        this.c = s10;
        this.f9687d = i4;
        this.e = z4;
        this.f = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
            if (this.f9685a.equals(trackSelectionParameters.f9685a) && this.f9686b == trackSelectionParameters.f9686b && this.c.equals(trackSelectionParameters.c) && this.f9687d == trackSelectionParameters.f9687d && this.e == trackSelectionParameters.e && this.f == trackSelectionParameters.f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.c.hashCode() + ((((this.f9685a.hashCode() + 31) * 31) + this.f9686b) * 31)) * 31) + this.f9687d) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f9685a);
        parcel.writeInt(this.f9686b);
        parcel.writeList(this.c);
        parcel.writeInt(this.f9687d);
        int i4 = AbstractC2550e.f21351a;
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f9685a = S.k(arrayList);
        this.f9686b = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.c = S.k(arrayList2);
        this.f9687d = parcel.readInt();
        int i = AbstractC2550e.f21351a;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
    }
}
