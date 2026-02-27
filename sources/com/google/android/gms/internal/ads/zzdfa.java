package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdfa extends zzcqs {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzddd zze;
    private final zzdgp zzf;
    private final zzcrn zzg;
    private final zzfor zzh;
    private final zzcwf zzi;
    private final zzbyz zzj;
    private final zzdsm zzk;
    private boolean zzl;

    public zzdfa(zzcqr zzcqrVar, Context context, zzcek zzcekVar, zzddd zzdddVar, zzdgp zzdgpVar, zzcrn zzcrnVar, zzfor zzforVar, zzcwf zzcwfVar, zzbyz zzbyzVar, zzdsm zzdsmVar) {
        super(zzcqrVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcekVar);
        this.zze = zzdddVar;
        this.zzf = zzdgpVar;
        this.zzg = zzcrnVar;
        this.zzh = zzforVar;
        this.zzi = zzcwfVar;
        this.zzj = zzbyzVar;
        this.zzk = zzdsmVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcek zzcekVar = (zzcek) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhe)).booleanValue()) {
                if (!this.zzl && zzcekVar != null) {
                    zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdez
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(boolean r7, android.app.Activity r8) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdfa.zza(boolean, android.app.Activity):boolean");
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
