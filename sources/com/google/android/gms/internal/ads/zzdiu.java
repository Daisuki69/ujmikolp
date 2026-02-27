package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdiu {
    private int zza;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzed zzb;

    @Nullable
    private zzbfp zzc;

    @Nullable
    private View zzd;

    @Nullable
    private List zze;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzez zzg;

    @Nullable
    private Bundle zzh;

    @Nullable
    private zzcek zzi;

    @Nullable
    private zzcek zzj;

    @Nullable
    private zzcek zzk;

    @Nullable
    private zzedu zzl;

    @Nullable
    private S1.y zzm;

    @Nullable
    private zzbzm zzn;

    @Nullable
    private View zzo;

    @Nullable
    private View zzp;

    @Nullable
    private IObjectWrapper zzq;
    private double zzr;

    @Nullable
    private zzbfw zzs;

    @Nullable
    private zzbfw zzt;

    @Nullable
    private String zzu;
    private float zzx;

    @Nullable
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.EMPTY_LIST;

    @Nullable
    public static zzdiu zzaf(zzbpm zzbpmVar) {
        try {
            return zzak(zzam(zzbpmVar.zzn(), zzbpmVar), zzbpmVar.zzo(), (View) zzal(zzbpmVar.zzp()), zzbpmVar.zze(), zzbpmVar.zzf(), zzbpmVar.zzg(), zzbpmVar.zzs(), zzbpmVar.zzi(), (View) zzal(zzbpmVar.zzq()), zzbpmVar.zzr(), zzbpmVar.zzl(), zzbpmVar.zzm(), zzbpmVar.zzk(), zzbpmVar.zzh(), zzbpmVar.zzj(), zzbpmVar.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdiu zzag(zzbpj zzbpjVar) {
        try {
            zzdit zzditVarZzam = zzam(zzbpjVar.zzs(), null);
            zzbfp zzbfpVarZzt = zzbpjVar.zzt();
            View view = (View) zzal(zzbpjVar.zzr());
            String strZze = zzbpjVar.zze();
            List listZzf = zzbpjVar.zzf();
            String strZzg = zzbpjVar.zzg();
            Bundle bundleZzp = zzbpjVar.zzp();
            String strZzi = zzbpjVar.zzi();
            View view2 = (View) zzal(zzbpjVar.zzu());
            IObjectWrapper iObjectWrapperZzv = zzbpjVar.zzv();
            String strZzj = zzbpjVar.zzj();
            zzbfw zzbfwVarZzh = zzbpjVar.zzh();
            zzdiu zzdiuVar = new zzdiu();
            zzdiuVar.zza = 1;
            zzdiuVar.zzb = zzditVarZzam;
            zzdiuVar.zzc = zzbfpVarZzt;
            zzdiuVar.zzd = view;
            zzdiuVar.zzs("headline", strZze);
            zzdiuVar.zze = listZzf;
            zzdiuVar.zzs(TtmlNode.TAG_BODY, strZzg);
            zzdiuVar.zzh = bundleZzp;
            zzdiuVar.zzs("call_to_action", strZzi);
            zzdiuVar.zzo = view2;
            zzdiuVar.zzq = iObjectWrapperZzv;
            zzdiuVar.zzs("advertiser", strZzj);
            zzdiuVar.zzt = zzbfwVarZzh;
            return zzdiuVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdiu zzah(zzbpi zzbpiVar) {
        zzdiu zzdiuVar;
        try {
            zzdit zzditVarZzam = zzam(zzbpiVar.zzt(), null);
            zzbfp zzbfpVarZzv = zzbpiVar.zzv();
            View view = (View) zzal(zzbpiVar.zzu());
            String strZze = zzbpiVar.zze();
            List listZzf = zzbpiVar.zzf();
            String strZzg = zzbpiVar.zzg();
            Bundle bundleZzr = zzbpiVar.zzr();
            String strZzi = zzbpiVar.zzi();
            View view2 = (View) zzal(zzbpiVar.zzw());
            IObjectWrapper iObjectWrapperZzx = zzbpiVar.zzx();
            String strZzk = zzbpiVar.zzk();
            String strZzl = zzbpiVar.zzl();
            double dZzj = zzbpiVar.zzj();
            zzbfw zzbfwVarZzh = zzbpiVar.zzh();
            zzdiuVar = null;
            try {
                zzdiu zzdiuVar2 = new zzdiu();
                zzdiuVar2.zza = 2;
                zzdiuVar2.zzb = zzditVarZzam;
                zzdiuVar2.zzc = zzbfpVarZzv;
                zzdiuVar2.zzd = view;
                zzdiuVar2.zzs("headline", strZze);
                zzdiuVar2.zze = listZzf;
                zzdiuVar2.zzs(TtmlNode.TAG_BODY, strZzg);
                zzdiuVar2.zzh = bundleZzr;
                zzdiuVar2.zzs("call_to_action", strZzi);
                zzdiuVar2.zzo = view2;
                zzdiuVar2.zzq = iObjectWrapperZzx;
                zzdiuVar2.zzs("store", strZzk);
                zzdiuVar2.zzs("price", strZzl);
                zzdiuVar2.zzr = dZzj;
                zzdiuVar2.zzs = zzbfwVarZzh;
                return zzdiuVar2;
            } catch (RemoteException e) {
                e = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return zzdiuVar;
            }
        } catch (RemoteException e7) {
            e = e7;
            zzdiuVar = null;
        }
    }

    @Nullable
    public static zzdiu zzai(zzbpi zzbpiVar) {
        try {
            return zzak(zzam(zzbpiVar.zzt(), null), zzbpiVar.zzv(), (View) zzal(zzbpiVar.zzu()), zzbpiVar.zze(), zzbpiVar.zzf(), zzbpiVar.zzg(), zzbpiVar.zzr(), zzbpiVar.zzi(), (View) zzal(zzbpiVar.zzw()), zzbpiVar.zzx(), zzbpiVar.zzk(), zzbpiVar.zzl(), zzbpiVar.zzj(), zzbpiVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdiu zzaj(zzbpj zzbpjVar) {
        try {
            return zzak(zzam(zzbpjVar.zzs(), null), zzbpjVar.zzt(), (View) zzal(zzbpjVar.zzr()), zzbpjVar.zze(), zzbpjVar.zzf(), zzbpjVar.zzg(), zzbpjVar.zzp(), zzbpjVar.zzi(), (View) zzal(zzbpjVar.zzu()), zzbpjVar.zzv(), null, null, -1.0d, zzbpjVar.zzh(), zzbpjVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdiu zzak(@Nullable com.google.android.gms.ads.internal.client.zzed zzedVar, zzbfp zzbfpVar, @Nullable View view, String str, List list, String str2, Bundle bundle, String str3, @Nullable View view2, IObjectWrapper iObjectWrapper, @Nullable String str4, @Nullable String str5, double d10, zzbfw zzbfwVar, @Nullable String str6, float f) {
        zzdiu zzdiuVar = new zzdiu();
        zzdiuVar.zza = 6;
        zzdiuVar.zzb = zzedVar;
        zzdiuVar.zzc = zzbfpVar;
        zzdiuVar.zzd = view;
        zzdiuVar.zzs("headline", str);
        zzdiuVar.zze = list;
        zzdiuVar.zzs(TtmlNode.TAG_BODY, str2);
        zzdiuVar.zzh = bundle;
        zzdiuVar.zzs("call_to_action", str3);
        zzdiuVar.zzo = view2;
        zzdiuVar.zzq = iObjectWrapper;
        zzdiuVar.zzs("store", str4);
        zzdiuVar.zzs("price", str5);
        zzdiuVar.zzr = d10;
        zzdiuVar.zzs = zzbfwVar;
        zzdiuVar.zzs("advertiser", str6);
        zzdiuVar.zzu(f);
        return zzdiuVar;
    }

    @Nullable
    private static Object zzal(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    private static zzdit zzam(@Nullable com.google.android.gms.ads.internal.client.zzed zzedVar, @Nullable zzbpm zzbpmVar) {
        if (zzedVar == null) {
            return null;
        }
        return new zzdit(zzedVar, zzbpmVar);
    }

    @Nullable
    public final synchronized View zzA() {
        return this.zzd;
    }

    @Nullable
    public final synchronized String zzB() {
        return zzw("headline");
    }

    @Nullable
    public final synchronized List zzC() {
        return this.zze;
    }

    @Nullable
    public final zzbfw zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbfv.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzez zzF() {
        return this.zzg;
    }

    @Nullable
    public final synchronized String zzG() {
        return zzw(TtmlNode.TAG_BODY);
    }

    public final synchronized Bundle zzH() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzh;
    }

    @Nullable
    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    @Nullable
    public final synchronized View zzJ() {
        return this.zzo;
    }

    @Nullable
    public final synchronized View zzK() {
        return this.zzp;
    }

    @Nullable
    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    @Nullable
    public final synchronized String zzM() {
        return zzw("store");
    }

    @Nullable
    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    @Nullable
    public final synchronized zzbfw zzP() {
        return this.zzs;
    }

    @Nullable
    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    @Nullable
    public final synchronized zzbfw zzR() {
        return this.zzt;
    }

    @Nullable
    public final synchronized String zzS() {
        return this.zzu;
    }

    @Nullable
    public final synchronized zzcek zzT() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzcek zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    @Nullable
    public final synchronized zzcek zzW() {
        return this.zzk;
    }

    @Nullable
    public final synchronized S1.y zzX() {
        return this.zzm;
    }

    @Nullable
    public final synchronized zzbzm zzY() {
        return this.zzn;
    }

    @Nullable
    public final synchronized zzedu zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    @Nullable
    public final synchronized SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    @Nullable
    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        try {
            zzcek zzcekVar = this.zzi;
            if (zzcekVar != null) {
                zzcekVar.destroy();
                this.zzi = null;
            }
            zzcek zzcekVar2 = this.zzj;
            if (zzcekVar2 != null) {
                zzcekVar2.destroy();
                this.zzj = null;
            }
            zzcek zzcekVar3 = this.zzk;
            if (zzcekVar3 != null) {
                zzcekVar3.destroy();
                this.zzk = null;
            }
            S1.y yVar = this.zzm;
            if (yVar != null) {
                yVar.cancel(false);
                this.zzm = null;
            }
            zzbzm zzbzmVar = this.zzn;
            if (zzbzmVar != null) {
                zzbzmVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        this.zzb = zzedVar;
    }

    public final synchronized void zzc(zzbfp zzbfpVar) {
        this.zzc = zzbfpVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(@Nullable com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzj(zzbfw zzbfwVar) {
        this.zzs = zzbfwVar;
    }

    public final synchronized void zzk(zzbfw zzbfwVar) {
        this.zzt = zzbfwVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcek zzcekVar) {
        this.zzi = zzcekVar;
    }

    public final synchronized void zzn(zzcek zzcekVar) {
        this.zzj = zzcekVar;
    }

    public final synchronized void zzo(zzcek zzcekVar) {
        this.zzk = zzcekVar;
    }

    public final synchronized void zzp(S1.y yVar) {
        this.zzm = yVar;
    }

    public final synchronized void zzq(zzedu zzeduVar) {
        this.zzl = zzeduVar;
    }

    public final synchronized void zzr(zzbzm zzbzmVar) {
        this.zzn = zzbzmVar;
    }

    public final synchronized void zzs(String str, @Nullable String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzbfh zzbfhVar) {
        if (zzbfhVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfhVar);
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(@Nullable String str) {
        this.zzy = str;
    }

    @Nullable
    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzed zzy() {
        return this.zzb;
    }

    @Nullable
    public final synchronized zzbfp zzz() {
        return this.zzc;
    }
}
