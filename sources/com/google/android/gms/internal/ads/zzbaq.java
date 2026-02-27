package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbaq> CREATOR = new zzbar();

    @Nullable
    @SafeParcelable.Field(getter = "getContentFileDescriptor", id = 2)
    private ParcelFileDescriptor zza;

    @SafeParcelable.Field(getter = "hasAdditionalMetadataFromReadV2", id = 3)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isDownloaded", id = 4)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCachedBytes", id = 5)
    private final long zzd;

    @SafeParcelable.Field(getter = "isGcacheHit", id = 6)
    private final boolean zze;

    public zzbaq() {
        this(null, false, false, 0L, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzc(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, zzd());
        SafeParcelWriter.writeBoolean(parcel, 4, zze());
        SafeParcelWriter.writeLong(parcel, 5, zzf());
        SafeParcelWriter.writeBoolean(parcel, 6, zzg());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final synchronized boolean zza() {
        return this.zza != null;
    }

    @Nullable
    public final synchronized InputStream zzb() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized ParcelFileDescriptor zzc() {
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final synchronized long zzf() {
        return this.zzd;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public zzbaq(@Nullable @SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) boolean z4, @SafeParcelable.Param(id = 4) boolean z5, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) boolean z8) {
        this.zza = parcelFileDescriptor;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = j;
        this.zze = z8;
    }
}
