package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends ReviewInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f9736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9737b;

    public zza(PendingIntent pendingIntent, boolean z4) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f9736a = pendingIntent;
        this.f9737b = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f9736a.equals(((zza) reviewInfo).f9736a) && this.f9737b == ((zza) reviewInfo).f9737b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9736a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f9737b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f9736a.toString() + ", isNoOp=" + this.f9737b + "}";
    }
}
