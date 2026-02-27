package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcgu implements zzaup {
    private final Context zza;
    private final zzfue zzb;

    public zzcgu(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdc)).intValue();
        int i = iIntValue != 1 ? (iIntValue == 2 || iIntValue != 3) ? 3 : 4 : 2;
        zzfuw zzfuwVarZze = zzfux.zze();
        zzfuwVarZze.zza(((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdj)).floatValue());
        zzfux zzfuxVar = (zzfux) zzfuwVarZze.zzbu();
        zzfuy zzfuyVarZzg = zzfuz.zzg();
        zzfuyVarZzg.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdk)).booleanValue());
        zzfuz zzfuzVar = (zzfuz) zzfuyVarZzg.zzbu();
        zzfuh zzfuhVarZzs = zzfui.zzs();
        zzfuhVarZzs.zzi(i);
        zzfuhVarZzs.zzb(versionInfoParcel.afmaVersion);
        zzfuhVarZzs.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcG)).booleanValue());
        zzfuhVarZzs.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcZ)).intValue() == -1);
        zzfuhVarZzs.zzg(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdb)).intValue());
        zzfuhVarZzs.zze(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdl)).longValue());
        zzfuhVarZzs.zzd(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzda)).intValue());
        zzfuhVarZzs.zzc(zzfuxVar);
        zzfuhVarZzs.zzf(zzfuzVar);
        zzfue zzfueVarZza = zzfue.zza(context, zzbzh.zza, (zzfui) zzfuhVarZzs.zzbu());
        this.zzb = zzfueVarZza;
        zzfueVarZza.zzb();
    }

    public final String zza() {
        int iZzh = this.zzb.zzh() - 1;
        return iZzh != 1 ? iZzh != 2 ? "uns" : "2.0" : "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzd(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    @Deprecated
    public final void zze(int i, int i4, int i6) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        Context context = this.zza;
        float fZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i4);
        zzfue zzfueVar = this.zzb;
        long j = i6;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j, 0, fZzC, fZzC2, 0);
        zzfueVar.zzg(motionEventObtain);
        motionEventObtain.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j, 2, fZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i4), 0);
        zzfueVar.zzg(motionEventObtain2);
        motionEventObtain2.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j, 1, fZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i4), 0);
        zzfueVar.zzg(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, @Nullable String str, @Nullable View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzh(@Nullable View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, @Nullable View view, @Nullable Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
