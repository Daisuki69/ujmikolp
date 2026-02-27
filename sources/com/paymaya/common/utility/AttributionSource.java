package com.paymaya.common.utility;

import android.os.Parcel;
import android.os.Parcelable;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AttributionSource implements Parcelable {
    public static final Parcelable.Creator<AttributionSource> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f10367b;
    public static final AttributionSource c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AttributionSource f10368d;
    public static final AttributionSource e;
    public static final AttributionSource f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AttributionSource f10369g;
    public static final AttributionSource h;
    public static final AttributionSource i;
    public static final AttributionSource j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AttributionSource[] f10370k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10371a;

    static {
        AttributionSource attributionSource = new AttributionSource("ORGANIC", 0, "organic");
        c = attributionSource;
        AttributionSource attributionSource2 = new AttributionSource("CT_NATIVE_DASHBOARD", 1, "ct_nativead_dashboard");
        f10368d = attributionSource2;
        AttributionSource attributionSource3 = new AttributionSource("CT_INTERSTITIAL", 2, "ct_interstitial");
        e = attributionSource3;
        AttributionSource attributionSource4 = new AttributionSource("CT_INBOX", 3, "ct_inbox");
        f = attributionSource4;
        AttributionSource attributionSource5 = new AttributionSource("PUSH", 4, "push");
        f10369g = attributionSource5;
        AttributionSource attributionSource6 = new AttributionSource("PLAY", 5, "play");
        h = attributionSource6;
        AttributionSource attributionSource7 = new AttributionSource("MALL", 6, "mall");
        i = attributionSource7;
        AttributionSource attributionSource8 = new AttributionSource("EXTERNAL", 7, "external");
        j = attributionSource8;
        AttributionSource[] attributionSourceArr = {attributionSource, attributionSource2, attributionSource3, attributionSource4, attributionSource5, attributionSource6, attributionSource7, attributionSource8};
        f10370k = attributionSourceArr;
        v0.h(attributionSourceArr);
        f10367b = new b0();
        CREATOR = new r();
    }

    public AttributionSource(String str, int i4, String str2) {
        this.f10371a = str2;
    }

    public static AttributionSource valueOf(String str) {
        return (AttributionSource) Enum.valueOf(AttributionSource.class, str);
    }

    public static AttributionSource[] values() {
        return (AttributionSource[]) f10370k.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i4) {
        kotlin.jvm.internal.j.g(dest, "dest");
        dest.writeString(name());
    }
}
