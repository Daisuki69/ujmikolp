package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzfey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfey> CREATOR = new zzfez();
    public final Context zza;
    public final zzfev zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfev[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfey(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) int i6, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i11, @SafeParcelable.Param(id = 7) int i12) {
        zzfev[] zzfevVarArrValues = zzfev.values();
        this.zzh = zzfevVarArrValues;
        int[] iArrZza = zzfew.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfex.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfevVarArrValues[i];
        this.zzc = i4;
        this.zzd = i6;
        this.zze = i10;
        this.zzf = str;
        this.zzj = i11;
        this.zzg = iArrZza[i11];
        this.zzk = i12;
        int i13 = iArrZza2[i12];
    }

    public static zzfey zza(zzfev zzfevVar, Context context) {
        if (zzfevVar == zzfev.Rewarded) {
            return new zzfey(context, zzfevVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgM)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgS)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgU)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgW), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgO), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgQ));
        }
        if (zzfevVar == zzfev.Interstitial) {
            return new zzfey(context, zzfevVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgN)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgT)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgV)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgX), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgP), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgR));
        }
        if (zzfevVar != zzfev.AppOpen) {
            return null;
        }
        return new zzfey(context, zzfevVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzha)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhc)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhd)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgY), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgZ), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i4 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i4);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfey(Context context, zzfev zzfevVar, int i, int i4, int i6, String str, String str2, String str3) {
        int i10;
        this.zzh = zzfev.values();
        this.zzl = zzfew.zza();
        this.zzm = zzfex.zza();
        this.zza = context;
        this.zzi = zzfevVar.ordinal();
        this.zzb = zzfevVar;
        this.zzc = i;
        this.zzd = i4;
        this.zze = i6;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i10 = 1;
        } else {
            i10 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i10;
        this.zzj = i10 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
