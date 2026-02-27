package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "FaceDetectorOptionsParcelCreator")
public final class zzst extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzst> CREATOR = new zzsu();

    @SafeParcelable.Field(getter = "getPerformanceMode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getLandmarkMode", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getClassificationMode", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getContourMode", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "isTrackingEnabled", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getProportionalMinFaceSize", id = 6)
    private final float zzf;

    @SafeParcelable.Constructor
    public zzst(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) int i6, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) boolean z4, @SafeParcelable.Param(id = 6) float f) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
        this.zzd = i10;
        this.zze = z4;
        this.zzf = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zza;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
