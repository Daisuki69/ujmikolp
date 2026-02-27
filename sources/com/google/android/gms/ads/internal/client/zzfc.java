package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "LiteSdkVersionsParcelCreator")
public final class zzfc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfc> CREATOR = new zzfd();

    @SafeParcelable.Field(getter = "getAdsDynamiteVersion", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getSdkVersionLite", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getGranularVersion", id = 3)
    private final String zzc;

    public zzfc() {
        this(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.6.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzfc(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) String str) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = str;
    }
}
