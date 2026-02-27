package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdom extends zzcqs {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgp zze;
    private final zzddd zzf;
    private final zzcwf zzg;
    private final zzcxm zzh;
    private final zzcrn zzi;
    private final zzbvx zzj;
    private final zzfor zzk;
    private final zzfcw zzl;
    private final zzdsm zzm;
    private boolean zzn;

    public zzdom(zzcqr zzcqrVar, Context context, @Nullable zzcek zzcekVar, zzdgp zzdgpVar, zzddd zzdddVar, zzcwf zzcwfVar, zzcxm zzcxmVar, zzcrn zzcrnVar, zzfcj zzfcjVar, zzfor zzforVar, zzfcw zzfcwVar, zzdsm zzdsmVar) {
        super(zzcqrVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdgpVar;
        this.zzd = new WeakReference(zzcekVar);
        this.zzf = zzdddVar;
        this.zzg = zzcwfVar;
        this.zzh = zzcxmVar;
        this.zzi = zzcrnVar;
        this.zzk = zzforVar;
        zzbvt zzbvtVar = zzfcjVar.zzl;
        this.zzj = new zzbwr(zzbvtVar != null ? zzbvtVar.zza : "", zzbvtVar != null ? zzbvtVar.zzb : 1);
        this.zzl = zzfcwVar;
        this.zzm = zzdsmVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcek zzcekVar = (zzcek) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhe)).booleanValue()) {
                if (!this.zzn && zzcekVar != null) {
                    zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdol
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcekVar.destroy();
                        }
                    });
                }
            } else if (zzcekVar != null) {
                zzcekVar.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zza(boolean z4, @Nullable Activity activity) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdgp zzdgpVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzS(zzdgpVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzom)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzR(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaR)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaS)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(zzfee.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzddd zzdddVar = this.zzf;
        zzdddVar.zza();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            zzdgpVar.zza(z4, context, this.zzg);
            zzdddVar.zzb();
            return true;
        } catch (zzdgo e) {
            this.zzg.zzd(e);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzbvx zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzcek zzcekVar = (zzcek) this.zzd.get();
        return (zzcekVar == null || zzcekVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzfcw zzh() {
        return this.zzl;
    }
}
