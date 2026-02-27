package com.google.android.gms.ads.internal.util.client;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
public final class VersionInfoParcel extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();

    @NonNull
    @SafeParcelable.Field(id = 2)
    public String afmaVersion;

    @SafeParcelable.Field(id = 3)
    public int buddyApkVersion;

    @SafeParcelable.Field(id = 4)
    public int clientJarVersion;

    @SafeParcelable.Field(id = 5)
    public boolean isClientJar;

    @SafeParcelable.Field(id = 6)
    public boolean isLiteSdk;

    public VersionInfoParcel(int i, int i4, boolean z4) {
        this(i, i4, z4, false, false);
    }

    @NonNull
    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.afmaVersion, false);
        SafeParcelWriter.writeInt(parcel, 3, this.buddyApkVersion);
        SafeParcelWriter.writeInt(parcel, 4, this.clientJarVersion);
        SafeParcelWriter.writeBoolean(parcel, 5, this.isClientJar);
        SafeParcelWriter.writeBoolean(parcel, 6, this.isLiteSdk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public VersionInfoParcel(int i, int i4, boolean z4, boolean z5) {
        this(i, i4, z4, false, z5);
    }

    public VersionInfoParcel(int i, int i4, boolean z4, boolean z5, boolean z8) {
        String str;
        if (z4) {
            str = "0";
        } else {
            str = z5 ? ExifInterface.GPS_MEASUREMENT_2D : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(str.length() + String.valueOf(i4).length() + length + 13 + 1);
        c.y(sb2, "afma-sdk-a-v", i, ".", i4);
        this(s.p(sb2, ".", str), i, i4, z4, z8);
    }

    @SafeParcelable.Constructor
    public VersionInfoParcel(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) boolean z4, @SafeParcelable.Param(id = 6) boolean z5) {
        this.afmaVersion = str;
        this.buddyApkVersion = i;
        this.clientJarVersion = i4;
        this.isClientJar = z4;
        this.isLiteSdk = z5;
    }
}
