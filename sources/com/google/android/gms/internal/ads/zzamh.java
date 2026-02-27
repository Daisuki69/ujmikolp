package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzamh {
    private final zzaeb zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzamh(zzaeb zzaebVar) {
        this.zza = zzaebVar;
    }

    public final void zza() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }

    public final void zzb(int i, long j) {
        boolean z4;
        this.zze = i;
        this.zzd = false;
        if (i == 182) {
            z4 = true;
        } else if (i == 179) {
            i = 179;
            z4 = true;
        } else {
            z4 = false;
        }
        this.zzb = z4;
        this.zzc = i == 182;
        this.zzf = 0;
        this.zzh = j;
    }

    public final void zzc(byte[] bArr, int i, int i4) {
        if (this.zzc) {
            int i6 = this.zzf;
            int i10 = (i + 1) - i6;
            if (i10 >= i4) {
                this.zzf = (i4 - i) + i6;
            } else {
                this.zzd = ((bArr[i10] & 192) >> 6) == 0;
                this.zzc = false;
            }
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
    public final void zzd(long j, int i, boolean z4) {
        zzghc.zzh(this.zzh != androidx.media3.common.C.TIME_UNSET);
        if (this.zze == 182 && z4 && this.zzb) {
            this.zza.zzx(this.zzh, this.zzd ? 1 : 0, (int) (j - this.zzg), i, null);
        }
        if (this.zze != 179) {
            this.zzg = j;
        }
    }
}
