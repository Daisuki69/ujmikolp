package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcoe extends zzcqs {

    @Nullable
    private final zzcek zzc;
    private final int zzd;
    private final Context zze;
    private final zzcns zzf;
    private final zzdgp zzg;
    private final zzddd zzh;
    private final zzcwf zzi;
    private final boolean zzj;
    private final zzbyz zzk;
    private final zzdsm zzl;
    private boolean zzm;

    public zzcoe(zzcqr zzcqrVar, Context context, @Nullable zzcek zzcekVar, int i, zzcns zzcnsVar, zzdgp zzdgpVar, zzddd zzdddVar, zzcwf zzcwfVar, zzbyz zzbyzVar, zzdsm zzdsmVar) {
        super(zzcqrVar);
        this.zzm = false;
        this.zzc = zzcekVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcnsVar;
        this.zzg = zzdgpVar;
        this.zzh = zzdddVar;
        this.zzi = zzcwfVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfU)).booleanValue();
        this.zzk = zzbyzVar;
        this.zzl = zzdsmVar;
    }

    public final void zza(zzazv zzazvVar) {
        zzcek zzcekVar = this.zzc;
        if (zzcekVar != null) {
            zzcekVar.zzay(zzazvVar);
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
    public final void zzb(Activity activity, zzbai zzbaiVar, boolean z4) throws RemoteException {
        zzcek zzcekVar;
        zzfcj zzfcjVarZzC;
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        boolean z5 = this.zzj;
        if (z5) {
            this.zzh.zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdgp zzdgpVar = this.zzg;
        if (!com.google.android.gms.ads.internal.util.zzs.zzS(zzdgpVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzom)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzR(context, this.zzb, this.zzl);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaR)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzK(context)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaS)).booleanValue()) {
                        new zzfor(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmI)).booleanValue() && (zzcekVar = this.zzc) != null && (zzfcjVarZzC = zzcekVar.zzC()) != null && zzfcjVarZzC.zzar && zzfcjVarZzC.zzas != this.zzk.zzj()) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The app open consent form has been shown.");
            this.zzi.zzc(zzfee.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfee.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdgpVar.zza(z4, context, this.zzi);
            if (z5) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdgo e) {
            this.zzi.zzd(e);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final void zzd() {
        super.zzd();
        zzcek zzcekVar = this.zzc;
        if (zzcekVar != null) {
            zzcekVar.destroy();
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
