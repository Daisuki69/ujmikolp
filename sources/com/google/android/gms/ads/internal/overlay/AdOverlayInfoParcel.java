package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcwf;
import com.google.android.gms.internal.ads.zzddz;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    private static final AtomicLong zzy = new AtomicLong(0);
    private static final ConcurrentHashMap zzz = new ConcurrentHashMap();

    @SafeParcelable.Field(id = 2)
    public final zzc zza;

    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.client.zza zzb;

    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzq zzc;

    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzcek zzd;

    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbid zze;

    @NonNull
    @SafeParcelable.Field(id = 7)
    public final String zzf;

    @SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @NonNull
    @SafeParcelable.Field(id = 9)
    public final String zzh;

    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzac zzi;

    @SafeParcelable.Field(id = 11)
    public final int zzj;

    @SafeParcelable.Field(id = 12)
    public final int zzk;

    @NonNull
    @SafeParcelable.Field(id = 13)
    public final String zzl;

    @NonNull
    @SafeParcelable.Field(id = 14)
    public final VersionInfoParcel zzm;

    @NonNull
    @SafeParcelable.Field(id = 16)
    public final String zzn;

    @SafeParcelable.Field(id = 17)
    public final com.google.android.gms.ads.internal.zzl zzo;

    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbib zzp;

    @NonNull
    @SafeParcelable.Field(id = 19)
    public final String zzq;

    @NonNull
    @SafeParcelable.Field(id = 24)
    public final String zzr;

    @NonNull
    @SafeParcelable.Field(id = 25)
    public final String zzs;

    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final zzcwf zzt;

    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzddz zzu;

    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final zzbsp zzv;

    @SafeParcelable.Field(id = 29)
    public final boolean zzw;

    @SafeParcelable.Field(id = 30)
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzbib zzbibVar, zzbid zzbidVar, zzac zzacVar, zzcek zzcekVar, boolean z4, int i, String str, VersionInfoParcel versionInfoParcel, zzddz zzddzVar, zzbsp zzbspVar, boolean z5) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = zzbibVar;
        this.zze = zzbidVar;
        this.zzf = null;
        this.zzg = z4;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddzVar;
        this.zzv = zzbspVar;
        this.zzw = z5;
        this.zzx = zzy.getAndIncrement();
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) zzbd.zzc().zzd(zzbci.zznL)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    @Nullable
    private static final IBinder zzc(Object obj) {
        if (((Boolean) zzbd.zzc().zzd(zzbci.zznL)).booleanValue()) {
            return null;
        }
        return ObjectWrapper.wrap(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 3, zzc(zzaVar), false);
        zzq zzqVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 4, zzc(zzqVar), false);
        zzcek zzcekVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, zzc(zzcekVar), false);
        zzbid zzbidVar = this.zze;
        SafeParcelWriter.writeIBinder(parcel, 6, zzc(zzbidVar), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        zzac zzacVar = this.zzi;
        SafeParcelWriter.writeIBinder(parcel, 10, zzc(zzacVar), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        zzbib zzbibVar = this.zzp;
        SafeParcelWriter.writeIBinder(parcel, 18, zzc(zzbibVar), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        zzcwf zzcwfVar = this.zzt;
        SafeParcelWriter.writeIBinder(parcel, 26, zzc(zzcwfVar), false);
        zzddz zzddzVar = this.zzu;
        SafeParcelWriter.writeIBinder(parcel, 27, zzc(zzddzVar), false);
        zzbsp zzbspVar = this.zzv;
        SafeParcelWriter.writeIBinder(parcel, 28, zzc(zzbspVar), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        long j = this.zzx;
        SafeParcelWriter.writeLong(parcel, 30, j);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if (((Boolean) zzbd.zzc().zzd(zzbci.zznL)).booleanValue()) {
            zzz.put(Long.valueOf(j), new zzo(zzaVar, zzqVar, zzcekVar, zzbibVar, zzbidVar, zzacVar, zzcwfVar, zzddzVar, zzbspVar, zzbzh.zzd.schedule(new zzp(j), ((Integer) zzbd.zzc().zzd(zzbci.zznN)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzbib zzbibVar, zzbid zzbidVar, zzac zzacVar, zzcek zzcekVar, boolean z4, int i, String str, String str2, VersionInfoParcel versionInfoParcel, zzddz zzddzVar, zzbsp zzbspVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = zzbibVar;
        this.zze = zzbidVar;
        this.zzf = str2;
        this.zzg = z4;
        this.zzh = str;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddzVar;
        this.zzv = zzbspVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzac zzacVar, zzcek zzcekVar, int i, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzcwf zzcwfVar, zzbsp zzbspVar, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzaY)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcwfVar;
        this.zzu = null;
        this.zzv = zzbspVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzac zzacVar, zzcek zzcekVar, boolean z4, int i, VersionInfoParcel versionInfoParcel, zzddz zzddzVar, zzbsp zzbspVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z4;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddzVar;
        this.zzv = zzbspVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzc zzcVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i, @SafeParcelable.Param(id = 12) int i4, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) com.google.android.gms.ads.internal.zzl zzlVar, @SafeParcelable.Param(id = 18) IBinder iBinder6, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 24) String str6, @SafeParcelable.Param(id = 25) String str7, @SafeParcelable.Param(id = 26) IBinder iBinder7, @SafeParcelable.Param(id = 27) IBinder iBinder8, @SafeParcelable.Param(id = 28) IBinder iBinder9, @SafeParcelable.Param(id = 29) boolean z5, @SafeParcelable.Param(id = 30) long j) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z4;
        this.zzh = str2;
        this.zzj = i;
        this.zzk = i4;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z5;
        this.zzx = j;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zznL)).booleanValue()) {
            zzo zzoVar = (zzo) zzz.remove(Long.valueOf(j));
            if (zzoVar != null) {
                this.zzb = zzoVar.zza();
                this.zzc = zzoVar.zzb();
                this.zzd = zzoVar.zzc();
                this.zzp = zzoVar.zzd();
                this.zze = zzoVar.zze();
                this.zzt = zzoVar.zzg();
                this.zzu = zzoVar.zzh();
                this.zzv = zzoVar.zzi();
                this.zzi = zzoVar.zzf();
                zzoVar.zzj().cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzq) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcek) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbib) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbid) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzi = (zzac) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzt = (zzcwf) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzddz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbsp) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzac zzacVar, VersionInfoParcel versionInfoParcel, zzcek zzcekVar, zzddz zzddzVar, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddzVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzq zzqVar, zzcek zzcekVar, int i, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcek zzcekVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i, zzbsp zzbspVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcekVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbspVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
