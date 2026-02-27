package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmu implements zzbjl {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbno zzb;
    final /* synthetic */ zzbmk zzc;
    final /* synthetic */ zzbnp zzd;

    public zzbmu(zzbnp zzbnpVar, long j, zzbno zzbnoVar, zzbmk zzbmkVar) {
        this.zza = j;
        this.zzb = zzbnoVar;
        this.zzc = zzbmkVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzd = zzbnpVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb2.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbnp zzbnpVar = this.zzd;
        synchronized (zzbnpVar.zzf()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbno zzbnoVar = this.zzb;
            if (zzbnoVar.zzi() != -1 && zzbnoVar.zzi() != 1) {
                zzbnpVar.zzk(0);
                zzbmk zzbmkVar = this.zzc;
                zzbmkVar.zzm("/log", zzbjk.zzg);
                zzbmkVar.zzm("/result", zzbjk.zzo);
                zzbnoVar.zzf(zzbmkVar);
                zzbnpVar.zzi(zzbnoVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
