package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfq extends com.google.android.gms.ads.internal.client.zzec {
    private final zzcbd zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzeg zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbhe zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcfq(zzcbd zzcbdVar, float f, boolean z4, boolean z5) {
        this.zza = zzcbdVar;
        this.zzi = f;
        this.zzc = z4;
        this.zzd = z5;
    }

    private final void zzw(String str, @Nullable Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzt(map2);
            }
        });
    }

    private final void zzx(final int i, final int i4, final boolean z4, final boolean z5) {
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(i, i4, z4, z5);
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        Object obj = this.zzb;
        boolean z4 = zzgaVar.zzb;
        boolean z5 = zzgaVar.zzc;
        synchronized (obj) {
            this.zzl = z4;
            this.zzm = z5;
        }
        boolean z8 = zzgaVar.zza;
        zzw("initialState", CollectionUtils.mapOf("muteStart", true != z8 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "customControlsRequested", true != z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "clickToExpandRequested", true != z5 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
    }

    public final void zzd(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z4) {
        zzw(true != z4 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() {
        boolean z4;
        synchronized (this.zzb) {
            z4 = this.zzh;
        }
        return z4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(@Nullable com.google.android.gms.ads.internal.client.zzeg zzegVar) {
        synchronized (this.zzb) {
            this.zzf = zzegVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() {
        boolean z4;
        synchronized (this.zzb) {
            try {
                z4 = false;
                if (this.zzc && this.zzl) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeg zzo() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        synchronized (this.zzb) {
            zzegVar = this.zzf;
        }
        return zzegVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() {
        boolean z4;
        Object obj = this.zzb;
        boolean zZzn = zzn();
        synchronized (obj) {
            z4 = false;
            if (!zZzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z4 = true;
                    }
                } finally {
                }
            }
        }
        return z4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z4;
        int i;
        synchronized (this.zzb) {
            z4 = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzx(i, 3, z4, z4);
    }

    public final void zzs(float f, float f3, int i, boolean z4, float f7) {
        boolean z5;
        boolean z8;
        int i4;
        synchronized (this.zzb) {
            try {
                z5 = true;
                if (f3 == this.zzi && f7 == this.zzk) {
                    z5 = false;
                }
                this.zzi = f3;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznD)).booleanValue()) {
                    this.zzj = f;
                }
                z8 = this.zzh;
                this.zzh = z4;
                i4 = this.zze;
                this.zze = i;
                float f10 = this.zzk;
                this.zzk = f7;
                if (Math.abs(f7 - f10) > 1.0E-4f) {
                    this.zza.zzE().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            try {
                zzbhe zzbheVar = this.zzn;
                if (zzbheVar != null) {
                    zzbheVar.zze();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzx(i4, i, z8, z4);
    }

    public final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final /* synthetic */ void zzu(int i, int i4, boolean z4, boolean z5) {
        int i6;
        boolean z8;
        boolean z9;
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        com.google.android.gms.ads.internal.client.zzeg zzegVar2;
        com.google.android.gms.ads.internal.client.zzeg zzegVar3;
        synchronized (this.zzb) {
            try {
                boolean z10 = this.zzg;
                if (z10 || i4 != 1) {
                    i6 = i4;
                    z8 = false;
                } else {
                    i4 = 1;
                    i6 = 1;
                    z8 = true;
                }
                boolean z11 = i != i4;
                if (z11 && i6 == 1) {
                    z9 = true;
                    i6 = 1;
                } else {
                    z9 = false;
                }
                boolean z12 = z11 && i6 == 2;
                boolean z13 = z11 && i6 == 3;
                this.zzg = z10 || z8;
                if (z8) {
                    try {
                        com.google.android.gms.ads.internal.client.zzeg zzegVar4 = this.zzf;
                        if (zzegVar4 != null) {
                            zzegVar4.zze();
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (z9 && (zzegVar3 = this.zzf) != null) {
                    zzegVar3.zzf();
                }
                if (z12 && (zzegVar2 = this.zzf) != null) {
                    zzegVar2.zzg();
                }
                if (z13) {
                    com.google.android.gms.ads.internal.client.zzeg zzegVar5 = this.zzf;
                    if (zzegVar5 != null) {
                        zzegVar5.zzh();
                    }
                    this.zza.zzz();
                }
                if (z4 != z5 && (zzegVar = this.zzf) != null) {
                    zzegVar.zzi(z5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzv(zzbhe zzbheVar) {
        synchronized (this.zzb) {
            this.zzn = zzbheVar;
        }
    }
}
