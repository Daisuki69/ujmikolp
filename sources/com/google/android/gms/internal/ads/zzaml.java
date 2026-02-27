package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaml {
    private final zzaeb zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzaml(zzaeb zzaebVar) {
        this.zza = zzaebVar;
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
    private final void zze(int i) {
        long j = this.zzl;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            long j6 = this.zzb;
            long j7 = this.zzk;
            if (j6 == j7) {
                return;
            }
            int i4 = (int) (j6 - j7);
            this.zza.zzx(j, this.zzm ? 1 : 0, i4, i, null);
        }
    }

    public final void zza() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzb(long j, int i, int i4, long j6, boolean z4) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j6;
        this.zzd = 0;
        this.zzb = j;
        if (i4 >= 32 && i4 != 40) {
            if (this.zzi && !this.zzj) {
                if (z4) {
                    zze(i);
                }
                this.zzi = false;
            }
            if (i4 <= 35 || i4 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z5 = i4 >= 16 && i4 <= 21;
        this.zzc = z5;
        this.zzf = z5 || i4 <= 9;
    }

    public final void zzc(byte[] bArr, int i, int i4) {
        if (this.zzf) {
            int i6 = this.zzd;
            int i10 = (i + 2) - i6;
            if (i10 >= i4) {
                this.zzd = (i4 - i) + i6;
            } else {
                this.zzg = (bArr[i10] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd(long j, int i, boolean z4) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z4 && this.zzi) {
                zze(i + ((int) (j - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }
}
