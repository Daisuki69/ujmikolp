package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "RtbVersionInfoParcelCreator")
public final class zzbrl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrl> CREATOR = new zzbrm();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Field(id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zzbrl(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) int i6) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
    }

    public static zzbrl zza(VersionInfo versionInfo) {
        return new zzbrl(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbrl)) {
            zzbrl zzbrlVar = (zzbrl) obj;
            if (zzbrlVar.zzc == this.zzc && zzbrlVar.zzb == this.zzb && zzbrlVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i4 = this.zzb;
        int length2 = String.valueOf(i4).length();
        int i6 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i6).length());
        sb2.append(i);
        sb2.append(".");
        sb2.append(i4);
        sb2.append(".");
        sb2.append(i6);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i4 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i4);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
