package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class zzamj {
    private final zzaeb zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzamj(zzaeb zzaebVar, boolean z4, boolean z5) {
        this.zza = zzaebVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzfm(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(zzfk zzfkVar) {
        this.zzb.append(zzfkVar.zzd, zzfkVar);
    }

    public final void zzb(zzfj zzfjVar) {
        this.zzc.append(zzfjVar.zza, zzfjVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j, int i, long j6, boolean z4) {
        this.zze = i;
        this.zzg = j6;
        this.zzf = j;
        this.zzl = z4;
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
    public final boolean zze(long j, int i, boolean z4) {
        boolean z5 = false;
        if (this.zze == 9) {
            if (z4 && this.zzh) {
                long j6 = this.zzf;
                int i4 = i + ((int) (j - j6));
                long j7 = this.zzj;
                if (j7 != androidx.media3.common.C.TIME_UNSET) {
                    long j9 = this.zzi;
                    if (j6 != j9) {
                        this.zza.zzx(j7, this.zzk ? 1 : 0, (int) (j6 - j9), i4, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z8 = this.zzl;
        boolean z9 = this.zzk;
        int i6 = this.zze;
        if (i6 == 5 || (z8 && i6 == 1)) {
            z5 = true;
        }
        boolean z10 = z9 | z5;
        this.zzk = z10;
        this.zze = 24;
        return z10;
    }
}
