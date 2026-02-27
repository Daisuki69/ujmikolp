package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "InitializationParamsCreator")
@SafeParcelable.Reserved({4, 5, 6})
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    @SafeParcelable.Field(id = 1)
    public final long zza;

    @SafeParcelable.Field(id = 2)
    public final long zzb;

    @SafeParcelable.Field(id = 3)
    public final boolean zzc;

    @Nullable
    @SafeParcelable.Field(id = 7)
    public final Bundle zzd;

    @Nullable
    @SafeParcelable.Field(id = 8)
    public final String zze;

    @SafeParcelable.Constructor
    public zzdd(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j6, @SafeParcelable.Param(id = 3) boolean z4, @Nullable @SafeParcelable.Param(id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(id = 8) String str) {
        this.zza = j;
        this.zzb = j6;
        this.zzc = z4;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 8, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
