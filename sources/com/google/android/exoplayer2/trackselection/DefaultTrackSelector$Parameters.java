package com.google.android.exoplayer2.trackselection;

import O1.S;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s1.C2232g;
import v1.C2334a;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultTrackSelector$Parameters extends TrackSelectionParameters {
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f9657B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f9658K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final S f9659P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f9660Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final boolean f9661R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f9662S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final boolean f9663T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final boolean f9664U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final SparseArray f9665V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final SparseBooleanArray f9666W;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9667g;
    public final int h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9669l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f9673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f9676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final S f9677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f9680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f9681y;

    static {
        new C2334a().a();
        CREATOR = new C2232g(1);
    }

    public DefaultTrackSelector$Parameters(int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, boolean z4, boolean z5, boolean z8, int i15, int i16, boolean z9, S s9, S s10, int i17, int i18, int i19, boolean z10, boolean z11, boolean z12, boolean z13, S s11, S s12, int i20, boolean z14, int i21, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, SparseArray sparseArray, SparseBooleanArray sparseBooleanArray) {
        super(s10, i17, s12, i20, z14, i21);
        this.f9667g = i;
        this.h = i4;
        this.i = i6;
        this.j = i10;
        this.f9668k = i11;
        this.f9669l = i12;
        this.m = i13;
        this.f9670n = i14;
        this.f9671o = z4;
        this.f9672p = z5;
        this.f9673q = z8;
        this.f9674r = i15;
        this.f9675s = i16;
        this.f9676t = z9;
        this.f9677u = s9;
        this.f9678v = i18;
        this.f9679w = i19;
        this.f9680x = z10;
        this.f9681y = z11;
        this.f9657B = z12;
        this.f9658K = z13;
        this.f9659P = s11;
        this.f9660Q = z15;
        this.f9661R = z16;
        this.f9662S = z17;
        this.f9663T = z18;
        this.f9664U = z19;
        this.f9665V = sparseArray;
        this.f9666W = sparseBooleanArray;
    }

    public final boolean a(int i, TrackGroupArray trackGroupArray) {
        Map map = (Map) this.f9665V.get(i);
        return map != null && map.containsKey(trackGroupArray);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DefaultTrackSelector$Parameters.class == obj.getClass()) {
            DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
            if (super.equals(obj) && this.f9667g == defaultTrackSelector$Parameters.f9667g && this.h == defaultTrackSelector$Parameters.h && this.i == defaultTrackSelector$Parameters.i && this.j == defaultTrackSelector$Parameters.j && this.f9668k == defaultTrackSelector$Parameters.f9668k && this.f9669l == defaultTrackSelector$Parameters.f9669l && this.m == defaultTrackSelector$Parameters.m && this.f9670n == defaultTrackSelector$Parameters.f9670n && this.f9671o == defaultTrackSelector$Parameters.f9671o && this.f9672p == defaultTrackSelector$Parameters.f9672p && this.f9673q == defaultTrackSelector$Parameters.f9673q && this.f9676t == defaultTrackSelector$Parameters.f9676t && this.f9674r == defaultTrackSelector$Parameters.f9674r && this.f9675s == defaultTrackSelector$Parameters.f9675s && this.f9677u.equals(defaultTrackSelector$Parameters.f9677u) && this.f9678v == defaultTrackSelector$Parameters.f9678v && this.f9679w == defaultTrackSelector$Parameters.f9679w && this.f9680x == defaultTrackSelector$Parameters.f9680x && this.f9681y == defaultTrackSelector$Parameters.f9681y && this.f9657B == defaultTrackSelector$Parameters.f9657B && this.f9658K == defaultTrackSelector$Parameters.f9658K && this.f9659P.equals(defaultTrackSelector$Parameters.f9659P) && this.f9660Q == defaultTrackSelector$Parameters.f9660Q && this.f9661R == defaultTrackSelector$Parameters.f9661R && this.f9662S == defaultTrackSelector$Parameters.f9662S && this.f9663T == defaultTrackSelector$Parameters.f9663T && this.f9664U == defaultTrackSelector$Parameters.f9664U) {
                SparseBooleanArray sparseBooleanArray = this.f9666W;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = defaultTrackSelector$Parameters.f9666W;
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f9665V;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = defaultTrackSelector$Parameters.f9665V;
                            if (sparseArray2.size() == size2) {
                                for (int i4 = 0; i4 < size2; i4++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i4));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i4);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                                                if (!map2.containsKey(trackGroupArray) || !AbstractC2550e.a(entry.getValue(), map2.get(trackGroupArray))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
    public final int hashCode() {
        return ((((((((((this.f9659P.hashCode() + ((((((((((((((this.f9677u.hashCode() + (((((((((((((((((((((((((((((super.hashCode() * 31) + this.f9667g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.f9668k) * 31) + this.f9669l) * 31) + this.m) * 31) + this.f9670n) * 31) + (this.f9671o ? 1 : 0)) * 31) + (this.f9672p ? 1 : 0)) * 31) + (this.f9673q ? 1 : 0)) * 31) + (this.f9676t ? 1 : 0)) * 31) + this.f9674r) * 31) + this.f9675s) * 31)) * 31) + this.f9678v) * 31) + this.f9679w) * 31) + (this.f9680x ? 1 : 0)) * 31) + (this.f9681y ? 1 : 0)) * 31) + (this.f9657B ? 1 : 0)) * 31) + (this.f9658K ? 1 : 0)) * 31)) * 31) + (this.f9660Q ? 1 : 0)) * 31) + (this.f9661R ? 1 : 0)) * 31) + (this.f9662S ? 1 : 0)) * 31) + (this.f9663T ? 1 : 0)) * 31) + (this.f9664U ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9667g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.f9668k);
        parcel.writeInt(this.f9669l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.f9670n);
        int i4 = AbstractC2550e.f21351a;
        parcel.writeInt(this.f9671o ? 1 : 0);
        parcel.writeInt(this.f9672p ? 1 : 0);
        parcel.writeInt(this.f9673q ? 1 : 0);
        parcel.writeInt(this.f9674r);
        parcel.writeInt(this.f9675s);
        parcel.writeInt(this.f9676t ? 1 : 0);
        parcel.writeList(this.f9677u);
        parcel.writeInt(this.f9678v);
        parcel.writeInt(this.f9679w);
        parcel.writeInt(this.f9680x ? 1 : 0);
        parcel.writeInt(this.f9681y ? 1 : 0);
        parcel.writeInt(this.f9657B ? 1 : 0);
        parcel.writeInt(this.f9658K ? 1 : 0);
        parcel.writeList(this.f9659P);
        parcel.writeInt(this.f9660Q ? 1 : 0);
        parcel.writeInt(this.f9661R ? 1 : 0);
        parcel.writeInt(this.f9662S ? 1 : 0);
        parcel.writeInt(this.f9663T ? 1 : 0);
        parcel.writeInt(this.f9664U ? 1 : 0);
        SparseArray sparseArray = this.f9665V;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            int iKeyAt = sparseArray.keyAt(i6);
            Map map = (Map) sparseArray.valueAt(i6);
            int size2 = map.size();
            parcel.writeInt(iKeyAt);
            parcel.writeInt(size2);
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.f9666W);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        super(parcel);
        this.f9667g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.f9668k = parcel.readInt();
        this.f9669l = parcel.readInt();
        this.m = parcel.readInt();
        this.f9670n = parcel.readInt();
        int i = AbstractC2550e.f21351a;
        this.f9671o = parcel.readInt() != 0;
        this.f9672p = parcel.readInt() != 0;
        this.f9673q = parcel.readInt() != 0;
        this.f9674r = parcel.readInt();
        this.f9675s = parcel.readInt();
        this.f9676t = parcel.readInt() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f9677u = S.k(arrayList);
        this.f9678v = parcel.readInt();
        this.f9679w = parcel.readInt();
        this.f9680x = parcel.readInt() != 0;
        this.f9681y = parcel.readInt() != 0;
        this.f9657B = parcel.readInt() != 0;
        this.f9658K = parcel.readInt() != 0;
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f9659P = S.k(arrayList2);
        this.f9660Q = parcel.readInt() != 0;
        this.f9661R = parcel.readInt() != 0;
        this.f9662S = parcel.readInt() != 0;
        this.f9663T = parcel.readInt() != 0;
        this.f9664U = parcel.readInt() != 0;
        int i4 = parcel.readInt();
        SparseArray sparseArray = new SparseArray(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            HashMap map = new HashMap(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                trackGroupArray.getClass();
                map.put(trackGroupArray, (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(i10, map);
        }
        this.f9665V = sparseArray;
        this.f9666W = parcel.readSparseBooleanArray();
    }
}
