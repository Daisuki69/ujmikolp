package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzu;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzazd;
import com.google.android.gms.internal.ads.zzbap;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbos;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzccj;
import com.google.android.gms.internal.ads.zzcfa;
import com.google.android.gms.internal.ads.zzedo;
import com.google.android.gms.internal.ads.zzedp;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbbe zzA;
    private final zzbxr zzB;
    private final zzcg zzC;
    private final zzccj zzD;
    private final zzbzu zzE;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcfa zze;
    private final zzbzc zzf;
    private final zzz zzg;
    private final zzazd zzh;
    private final zzbyv zzi;
    private final zzaa zzj;
    private final zzbap zzk;
    private final Clock zzl;
    private final zzf zzm;
    private final zzbco zzn;
    private final zzbdh zzo;
    private final zzax zzp;
    private final zzbvc zzq;
    private final zzbzn zzr;
    private final zzbnu zzs;
    private final zzy zzt;
    private final zzbq zzu;
    private final zzad zzv;
    private final zzae zzw;
    private final zzbos zzx;
    private final zzbr zzy;
    private final zzedp zzz;

    public zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcfa zzcfaVar = new zzcfa();
        zzbzc zzbzcVar = new zzbzc();
        int i = Build.VERSION.SDK_INT;
        zzz zzyVar = i >= 30 ? new com.google.android.gms.ads.internal.util.zzy() : i >= 28 ? new zzx() : i >= 26 ? new zzv() : i >= 24 ? new zzu() : new com.google.android.gms.ads.internal.util.zzt();
        zzazd zzazdVar = new zzazd();
        zzbyv zzbyvVar = new zzbyv();
        zzaa zzaaVar = new zzaa();
        zzbap zzbapVar = new zzbap();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbco zzbcoVar = new zzbco();
        zzbdh zzbdhVar = new zzbdh();
        zzax zzaxVar = new zzax();
        zzbvc zzbvcVar = new zzbvc();
        zzbzn zzbznVar = new zzbzn();
        zzbnu zzbnuVar = new zzbnu();
        zzy zzyVar2 = new zzy();
        zzbq zzbqVar = new zzbq();
        zzad zzadVar = new zzad();
        zzae zzaeVar = new zzae();
        zzbos zzbosVar = new zzbos();
        zzbr zzbrVar = new zzbr();
        zzedo zzedoVar = new zzedo();
        zzbbe zzbbeVar = new zzbbe();
        zzbxr zzbxrVar = new zzbxr();
        zzcg zzcgVar = new zzcg();
        zzccj zzccjVar = new zzccj();
        zzbzu zzbzuVar = new zzbzu();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = zzcfaVar;
        this.zzf = zzbzcVar;
        this.zzg = zzyVar;
        this.zzh = zzazdVar;
        this.zzi = zzbyvVar;
        this.zzj = zzaaVar;
        this.zzk = zzbapVar;
        this.zzl = defaultClock;
        this.zzm = zzfVar;
        this.zzn = zzbcoVar;
        this.zzo = zzbdhVar;
        this.zzp = zzaxVar;
        this.zzq = zzbvcVar;
        this.zzr = zzbznVar;
        this.zzs = zzbnuVar;
        this.zzu = zzbqVar;
        this.zzt = zzyVar2;
        this.zzv = zzadVar;
        this.zzw = zzaeVar;
        this.zzx = zzbosVar;
        this.zzy = zzbrVar;
        this.zzz = zzedoVar;
        this.zzA = zzbbeVar;
        this.zzB = zzbxrVar;
        this.zzC = zzcgVar;
        this.zzD = zzccjVar;
        this.zzE = zzbzuVar;
    }

    public static zzcg zzA() {
        return zza.zzC;
    }

    public static zzccj zzB() {
        return zza.zzD;
    }

    public static zzbzu zzC() {
        return zza.zzE;
    }

    public static zzbxr zzD() {
        return zza.zzB;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zza() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return zza.zzc;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzc() {
        return zza.zzd;
    }

    public static zzcfa zzd() {
        return zza.zze;
    }

    public static zzbzc zze() {
        return zza.zzf;
    }

    public static zzz zzf() {
        return zza.zzg;
    }

    public static zzazd zzg() {
        return zza.zzh;
    }

    public static zzbyv zzh() {
        return zza.zzi;
    }

    public static zzaa zzi() {
        return zza.zzj;
    }

    public static zzbap zzj() {
        return zza.zzk;
    }

    public static Clock zzk() {
        return zza.zzl;
    }

    public static zzf zzl() {
        return zza.zzm;
    }

    public static zzbco zzm() {
        return zza.zzn;
    }

    public static zzbdh zzn() {
        return zza.zzo;
    }

    public static zzax zzo() {
        return zza.zzp;
    }

    public static zzbvc zzp() {
        return zza.zzq;
    }

    public static zzbzn zzq() {
        return zza.zzr;
    }

    public static zzbnu zzr() {
        return zza.zzs;
    }

    public static zzbq zzs() {
        return zza.zzu;
    }

    public static zzy zzt() {
        return zza.zzt;
    }

    public static zzedp zzu() {
        return zza.zzz;
    }

    public static zzad zzv() {
        return zza.zzv;
    }

    public static zzae zzw() {
        return zza.zzw;
    }

    public static zzbos zzx() {
        return zza.zzx;
    }

    public static zzbr zzy() {
        return zza.zzy;
    }

    public static zzbbe zzz() {
        return zza.zzA;
    }
}
