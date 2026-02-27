package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdb {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzga zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;

    @Nullable
    private zzbfl zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzco zzl;

    @Nullable
    private zzblw zzn;

    @Nullable
    private zzeli zzr;
    private Bundle zzt;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzcs zzv;
    private int zzm = 1;
    private final zzfcp zzo = new zzfcp();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();

    public final boolean zzA() {
        return this.zzp;
    }

    public final boolean zzB() {
        return this.zzq;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzm zzC() {
        return this.zza;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzD() {
        return this.zzb;
    }

    public final /* synthetic */ String zzE() {
        return this.zzc;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzga zzF() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzG() {
        return this.zze;
    }

    public final /* synthetic */ ArrayList zzH() {
        return this.zzf;
    }

    public final /* synthetic */ ArrayList zzI() {
        return this.zzg;
    }

    public final /* synthetic */ zzbfl zzJ() {
        return this.zzh;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzK() {
        return this.zzi;
    }

    public final /* synthetic */ AdManagerAdViewOptions zzL() {
        return this.zzj;
    }

    public final /* synthetic */ PublisherAdViewOptions zzM() {
        return this.zzk;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzco zzN() {
        return this.zzl;
    }

    public final /* synthetic */ int zzO() {
        return this.zzm;
    }

    public final /* synthetic */ zzblw zzP() {
        return this.zzn;
    }

    public final /* synthetic */ zzfcp zzQ() {
        return this.zzo;
    }

    public final /* synthetic */ boolean zzR() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzS() {
        return this.zzq;
    }

    public final /* synthetic */ zzeli zzT() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzU() {
        return this.zzs;
    }

    public final /* synthetic */ Bundle zzV() {
        return this.zzt;
    }

    public final /* synthetic */ AtomicLong zzW() {
        return this.zzu;
    }

    public final zzfdb zzX(@Nullable com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzv = zzcsVar;
        return this;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzcs zzY() {
        return this.zzv;
    }

    public final zzfdb zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final zzfdb zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfdb zzd(boolean z4) {
        this.zzp = z4;
        return this;
    }

    public final zzfdb zze(boolean z4) {
        this.zzq = z4;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final zzfdb zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzfdb zzi(@Nullable com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zzd = zzgaVar;
        return this;
    }

    public final zzfcp zzj() {
        return this.zzo;
    }

    public final zzfdb zzk(boolean z4) {
        this.zze = z4;
        return this;
    }

    public final zzfdb zzl(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfdb zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfdb zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfdb zzo(@Nullable zzbfl zzbflVar) {
        this.zzh = zzbflVar;
        return this;
    }

    public final zzfdb zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfdb zzq(@Nullable zzblw zzblwVar) {
        this.zzn = zzblwVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzga(false, true, false);
        return this;
    }

    public final zzfdb zzr(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzfdb zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfdb zzt(@Nullable zzeli zzeliVar) {
        this.zzr = zzeliVar;
        return this;
    }

    public final zzfdb zzu(boolean z4) {
        this.zzs = true;
        return this;
    }

    public final zzfdb zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzfdb zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzfdb zzy(zzfdc zzfdcVar) {
        this.zzo.zza(zzfdcVar.zzp.zza);
        this.zza = zzfdcVar.zzd;
        this.zzb = zzfdcVar.zzf;
        this.zzv = zzfdcVar.zzv;
        this.zzc = zzfdcVar.zzg;
        this.zzd = zzfdcVar.zza;
        this.zzf = zzfdcVar.zzh;
        this.zzg = zzfdcVar.zzi;
        this.zzh = zzfdcVar.zzj;
        this.zzi = zzfdcVar.zzk;
        zzs(zzfdcVar.zzm);
        zzr(zzfdcVar.zzn);
        this.zzp = zzfdcVar.zzq;
        this.zzq = zzfdcVar.zzr;
        this.zzr = zzfdcVar.zzc;
        this.zzs = zzfdcVar.zzs;
        this.zzt = zzfdcVar.zzt;
        this.zzu.set(zzfdcVar.zzu.get());
        return this;
    }

    public final zzfdc zzz() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfdc(this, null);
    }
}
