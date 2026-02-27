package com.clevertap.android.sdk;

import D.C0177j;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class CTInboxStyleConfig implements Parcelable {
    public static final Parcelable.Creator<CTInboxStyleConfig> CREATOR = new C0177j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9434b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9435d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9436g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f9437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f9438l;
    public String m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9435d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.c);
        parcel.writeStringArray(this.f9438l);
        parcel.writeString(this.f9433a);
        parcel.writeString(this.i);
        parcel.writeString(this.m);
        parcel.writeString(this.j);
        parcel.writeString(this.f9437k);
        parcel.writeString(this.f9436g);
        parcel.writeString(this.h);
        parcel.writeString(this.f9434b);
    }
}
