package com.google.firebase.perf.util;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new a(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9859b;

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new Timer().f9859b - this.f9859b;
    }

    public final long b(Timer timer) {
        return timer.f9859b - this.f9859b;
    }

    public final void c() {
        this.f9858a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f9859b = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9858a);
        parcel.writeLong(this.f9859b);
    }

    public Timer(long j, long j6) {
        this.f9858a = j;
        this.f9859b = j6;
    }
}
