package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzln implements zzov {
    private final zzlm zza;

    private zzln(zzlm zzlmVar) {
        byte[] bArr = zzmp.zzb;
        this.zza = zzlmVar;
        zzlmVar.zza = this;
    }

    public static zzln zza(zzlm zzlmVar) {
        zzln zzlnVar = zzlmVar.zza;
        return zzlnVar != null ? zzlnVar : new zzln(zzlmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzA(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzna)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i6 += 8;
            }
            zzlmVar.zzr(i6);
            while (i4 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z4) {
            while (i4 < zznaVar.size()) {
                this.zza.zzf(i, zznaVar.zzc(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznaVar.size(); i12++) {
            zznaVar.zzc(i12);
            i11 += 8;
        }
        zzlmVar2.zzr(i11);
        while (i4 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzB(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzly)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzd(i, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i6 += 4;
            }
            zzlmVar.zzr(i6);
            while (i4 < list.size()) {
                zzlmVar.zzs(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        zzly zzlyVar = (zzly) list;
        if (!z4) {
            while (i4 < zzlyVar.size()) {
                this.zza.zzd(i, Float.floatToRawIntBits(zzlyVar.zze(i4)));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzlyVar.size(); i12++) {
            zzlyVar.zze(i12);
            i11 += 4;
        }
        zzlmVar2.zzr(i11);
        while (i4 < zzlyVar.size()) {
            zzlmVar2.zzs(Float.floatToRawIntBits(zzlyVar.zze(i4)));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzC(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzlo)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzf(i, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i6 += 8;
            }
            zzlmVar.zzr(i6);
            while (i4 < list.size()) {
                zzlmVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        zzlo zzloVar = (zzlo) list;
        if (!z4) {
            while (i4 < zzloVar.size()) {
                this.zza.zzf(i, Double.doubleToRawLongBits(zzloVar.zze(i4)));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzloVar.size(); i12++) {
            zzloVar.zze(i12);
            i11 += 8;
        }
        zzlmVar2.zzr(i11);
        while (i4 < zzloVar.size()) {
            zzlmVar2.zzu(Double.doubleToRawLongBits(zzloVar.zze(i4)));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzD(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzmg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzb(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzlm.zzA(((Integer) list.get(i6)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i4 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z4) {
            while (i4 < zzmgVar.size()) {
                this.zza.zzb(i, zzmgVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzmgVar.size(); i10++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i10));
        }
        zzlmVar2.zzr(iZzA2);
        while (i4 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i4));
            i4++;
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
    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzE(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzky)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzg(i, ((Boolean) list.get(i4)).booleanValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i6++;
            }
            zzlmVar.zzr(i6);
            while (i4 < list.size()) {
                zzlmVar.zzp(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                i4++;
            }
            return;
        }
        zzky zzkyVar = (zzky) list;
        if (!z4) {
            while (i4 < zzkyVar.size()) {
                this.zza.zzg(i, zzkyVar.zze(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzkyVar.size(); i12++) {
            zzkyVar.zze(i12);
            i11++;
        }
        zzlmVar2.zzr(i11);
        while (i4 < zzkyVar.size()) {
            zzlmVar2.zzp(zzkyVar.zze(i4) ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzF(int i, List list) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzmx)) {
            while (i4 < list.size()) {
                this.zza.zzh(i, (String) list.get(i4));
                i4++;
            }
            return;
        }
        zzmx zzmxVar = (zzmx) list;
        while (i4 < list.size()) {
            Object objZzc = zzmxVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzh(i, (String) objZzc);
            } else {
                this.zza.zzi(i, (zzlh) objZzc);
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzG(int i, List list) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.zza.zzi(i, (zzlh) list.get(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzH(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzmg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int iZzz = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzz += zzlm.zzz(((Integer) list.get(i6)).intValue());
            }
            zzlmVar.zzr(iZzz);
            while (i4 < list.size()) {
                zzlmVar.zzr(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z4) {
            while (i4 < zzmgVar.size()) {
                this.zza.zzc(i, zzmgVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int iZzz2 = 0;
        for (int i10 = 0; i10 < zzmgVar.size(); i10++) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i10));
        }
        zzlmVar2.zzr(iZzz2);
        while (i4 < zzmgVar.size()) {
            zzlmVar2.zzr(zzmgVar.zzf(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzI(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzmg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzd(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i6 += 4;
            }
            zzlmVar.zzr(i6);
            while (i4 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z4) {
            while (i4 < zzmgVar.size()) {
                this.zza.zzd(i, zzmgVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmgVar.size(); i12++) {
            zzmgVar.zzf(i12);
            i11 += 4;
        }
        zzlmVar2.zzr(i11);
        while (i4 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzJ(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzna)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i6 += 8;
            }
            zzlmVar.zzr(i6);
            while (i4 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z4) {
            while (i4 < zznaVar.size()) {
                this.zza.zzf(i, zznaVar.zzc(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznaVar.size(); i12++) {
            zznaVar.zzc(i12);
            i11 += 8;
        }
        zzlmVar2.zzr(i11);
        while (i4 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzK(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzmg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    int iIntValue = ((Integer) list.get(i4)).intValue();
                    zzlmVar.zzc(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i4++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i, 2);
            int iZzz = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int iIntValue2 = ((Integer) list.get(i6)).intValue();
                iZzz += zzlm.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzlmVar2.zzr(iZzz);
            while (i4 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i4)).intValue();
                zzlmVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i4++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z4) {
            while (i4 < zzmgVar.size()) {
                zzlm zzlmVar3 = this.zza;
                int iZzf = zzmgVar.zzf(i4);
                zzlmVar3.zzc(i, (iZzf >> 31) ^ (iZzf + iZzf));
                i4++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i, 2);
        int iZzz2 = 0;
        for (int i10 = 0; i10 < zzmgVar.size(); i10++) {
            int iZzf2 = zzmgVar.zzf(i10);
            iZzz2 += zzlm.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzlmVar4.zzr(iZzz2);
        while (i4 < zzmgVar.size()) {
            int iZzf3 = zzmgVar.zzf(i4);
            zzlmVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzL(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzna)) {
            if (!z4) {
                while (i4 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    long jLongValue = ((Long) list.get(i4)).longValue();
                    zzlmVar.zze(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i4++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long jLongValue2 = ((Long) list.get(i6)).longValue();
                iZzA += zzlm.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzlmVar2.zzr(iZzA);
            while (i4 < list.size()) {
                long jLongValue3 = ((Long) list.get(i4)).longValue();
                zzlmVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i4++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z4) {
            while (i4 < zznaVar.size()) {
                zzlm zzlmVar3 = this.zza;
                long jZzc = zznaVar.zzc(i4);
                zzlmVar3.zze(i, (jZzc >> 63) ^ (jZzc + jZzc));
                i4++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zznaVar.size(); i10++) {
            long jZzc2 = zznaVar.zzc(i10);
            iZzA2 += zzlm.zzA((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzlmVar4.zzr(iZzA2);
        while (i4 < zznaVar.size()) {
            long jZzc3 = zznaVar.zzc(i4);
            zzlmVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzM(int i, zzne zzneVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            zzlmVar.zzr(zznf.zzc(zzneVar, entry.getKey(), entry.getValue()));
            zznf.zzb(zzlmVar, zzneVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzb(int i, int i4) throws IOException {
        this.zza.zzd(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzc(int i, long j) throws IOException {
        this.zza.zze(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zze(int i, float f) throws IOException {
        this.zza.zzd(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzf(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzg(int i, int i4) throws IOException {
        this.zza.zzb(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzh(int i, long j) throws IOException {
        this.zza.zze(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzi(int i, int i4) throws IOException {
        this.zza.zzb(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzk(int i, int i4) throws IOException {
        this.zza.zzd(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzl(int i, boolean z4) throws IOException {
        this.zza.zzg(i, z4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzh(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzn(int i, zzlh zzlhVar) throws IOException {
        this.zza.zzi(i, zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzo(int i, int i4) throws IOException {
        this.zza.zzc(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzp(int i, int i4) throws IOException {
        this.zza.zzc(i, (i4 >> 31) ^ (i4 + i4));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzq(int i, long j) throws IOException {
        this.zza.zze(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzr(int i, Object obj, zznx zznxVar) throws IOException {
        this.zza.zzl(i, (zznm) obj, zznxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzs(int i, Object obj, zznx zznxVar) throws IOException {
        zzlm zzlmVar = this.zza;
        zzlmVar.zza(i, 3);
        zznxVar.zzf((zznm) obj, zzlmVar.zza);
        zzlmVar.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zza(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zzlh) {
            this.zza.zzn(i, (zzlh) obj);
        } else {
            this.zza.zzm(i, (zznm) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzw(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzmg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzb(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzlm.zzA(((Integer) list.get(i6)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i4 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z4) {
            while (i4 < zzmgVar.size()) {
                this.zza.zzb(i, zzmgVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzmgVar.size(); i10++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i10));
        }
        zzlmVar2.zzr(iZzA2);
        while (i4 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzx(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzmg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzd(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i6 += 4;
            }
            zzlmVar.zzr(i6);
            while (i4 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z4) {
            while (i4 < zzmgVar.size()) {
                this.zza.zzd(i, zzmgVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmgVar.size(); i12++) {
            zzmgVar.zzf(i12);
            i11 += 4;
        }
        zzlmVar2.zzr(i11);
        while (i4 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzy(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzna)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zze(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzlm.zzA(((Long) list.get(i6)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i4 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z4) {
            while (i4 < zznaVar.size()) {
                this.zza.zze(i, zznaVar.zzc(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zznaVar.size(); i10++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i10));
        }
        zzlmVar2.zzr(iZzA2);
        while (i4 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzz(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzna)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zze(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzlm.zzA(((Long) list.get(i6)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i4 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z4) {
            while (i4 < zznaVar.size()) {
                this.zza.zze(i, zznaVar.zzc(i4));
                i4++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zznaVar.size(); i10++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i10));
        }
        zzlmVar2.zzr(iZzA2);
        while (i4 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i4));
            i4++;
        }
    }
}
