package com.google.firebase.perf.metrics;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f9849b;

    public Counter(String str) {
        this.f9848a = str;
        this.f9849b = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9848a);
        parcel.writeLong(this.f9849b.get());
    }

    public Counter(Parcel parcel) {
        this.f9848a = parcel.readString();
        this.f9849b = new AtomicLong(parcel.readLong());
    }
}
