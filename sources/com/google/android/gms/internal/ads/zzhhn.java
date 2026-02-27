package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzhhn implements zzhlk {
    private final zzhhm zza;

    private zzhhn(zzhhm zzhhmVar) {
        zzhiu.zza(zzhhmVar, "output");
        this.zza = zzhhmVar;
        zzhhmVar.zze = this;
    }

    public static zzhhn zza(zzhhm zzhhmVar) {
        Object obj = zzhhmVar.zze;
        return obj != null ? (zzhhn) obj : new zzhhn(zzhhmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzA(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i6 += 8;
            }
            zzhhmVar.zzs(i6);
            while (i4 < list.size()) {
                zzhhmVar.zzv(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z4) {
            while (i4 < zzhjgVar.size()) {
                this.zza.zzh(i, zzhjgVar.zzc(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhjgVar.size(); i12++) {
            zzhjgVar.zzc(i12);
            i11 += 8;
        }
        zzhhmVar2.zzs(i11);
        while (i4 < zzhjgVar.size()) {
            zzhhmVar2.zzv(zzhjgVar.zzc(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzB(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhhy)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzM(i, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i6 += 4;
            }
            zzhhmVar.zzs(i6);
            while (i4 < list.size()) {
                zzhhmVar.zzt(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        zzhhy zzhhyVar = (zzhhy) list;
        if (!z4) {
            while (i4 < zzhhyVar.size()) {
                this.zza.zzM(i, Float.floatToRawIntBits(zzhhyVar.zzf(i4)));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhhyVar.size(); i12++) {
            zzhhyVar.zzf(i12);
            i11 += 4;
        }
        zzhhmVar2.zzs(i11);
        while (i4 < zzhhyVar.size()) {
            zzhhmVar2.zzt(Float.floatToRawIntBits(zzhhyVar.zzf(i4)));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzC(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhho)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i6 += 8;
            }
            zzhhmVar.zzs(i6);
            while (i4 < list.size()) {
                zzhhmVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        zzhho zzhhoVar = (zzhho) list;
        if (!z4) {
            while (i4 < zzhhoVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzhhoVar.zzf(i4)));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhhoVar.size(); i12++) {
            zzhhoVar.zzf(i12);
            i11 += 8;
        }
        zzhhmVar2.zzs(i11);
        while (i4 < zzhhoVar.size()) {
            zzhhmVar2.zzv(Double.doubleToRawLongBits(zzhhoVar.zzf(i4)));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzD(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhii)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzhhm.zzB(((Integer) list.get(i6)).intValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i4 < list.size()) {
                zzhhmVar.zzr(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z4) {
            while (i4 < zzhiiVar.size()) {
                this.zza.zzK(i, zzhiiVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhiiVar.size(); i10++) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i10));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i4 < zzhiiVar.size()) {
            zzhhmVar2.zzr(zzhiiVar.zzf(i4));
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
    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzE(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhgr)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzi(i, ((Boolean) list.get(i4)).booleanValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i6++;
            }
            zzhhmVar.zzs(i6);
            while (i4 < list.size()) {
                zzhhmVar.zzq(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                i4++;
            }
            return;
        }
        zzhgr zzhgrVar = (zzhgr) list;
        if (!z4) {
            while (i4 < zzhgrVar.size()) {
                this.zza.zzi(i, zzhgrVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhgrVar.size(); i12++) {
            zzhgrVar.zzf(i12);
            i11++;
        }
        zzhhmVar2.zzs(i11);
        while (i4 < zzhgrVar.size()) {
            zzhhmVar2.zzq(zzhgrVar.zzf(i4) ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzF(int i, List list) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhjd)) {
            while (i4 < list.size()) {
                this.zza.zzj(i, (String) list.get(i4));
                i4++;
            }
            return;
        }
        zzhjd zzhjdVar = (zzhjd) list;
        while (i4 < list.size()) {
            Object objZzc = zzhjdVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzj(i, (String) objZzc);
            } else {
                this.zza.zzk(i, (zzhhb) objZzc);
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzG(int i, List list) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.zza.zzk(i, (zzhhb) list.get(i4));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzH(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhii)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzL(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzA += zzhhm.zzA(((Integer) list.get(i6)).intValue());
            }
            zzhhmVar.zzs(iZzA);
            while (i4 < list.size()) {
                zzhhmVar.zzs(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z4) {
            while (i4 < zzhiiVar.size()) {
                this.zza.zzL(i, zzhiiVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzhiiVar.size(); i10++) {
            iZzA2 += zzhhm.zzA(zzhiiVar.zzf(i10));
        }
        zzhhmVar2.zzs(iZzA2);
        while (i4 < zzhiiVar.size()) {
            zzhhmVar2.zzs(zzhiiVar.zzf(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzI(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhii)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzM(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i6 += 4;
            }
            zzhhmVar.zzs(i6);
            while (i4 < list.size()) {
                zzhhmVar.zzt(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z4) {
            while (i4 < zzhiiVar.size()) {
                this.zza.zzM(i, zzhiiVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhiiVar.size(); i12++) {
            zzhiiVar.zzf(i12);
            i11 += 4;
        }
        zzhhmVar2.zzs(i11);
        while (i4 < zzhiiVar.size()) {
            zzhhmVar2.zzt(zzhiiVar.zzf(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzJ(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i6 += 8;
            }
            zzhhmVar.zzs(i6);
            while (i4 < list.size()) {
                zzhhmVar.zzv(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z4) {
            while (i4 < zzhjgVar.size()) {
                this.zza.zzh(i, zzhjgVar.zzc(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhjgVar.size(); i12++) {
            zzhjgVar.zzc(i12);
            i11 += 8;
        }
        zzhhmVar2.zzs(i11);
        while (i4 < zzhjgVar.size()) {
            zzhhmVar2.zzv(zzhjgVar.zzc(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzK(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhii)) {
            if (!z4) {
                while (i4 < list.size()) {
                    zzhhm zzhhmVar = this.zza;
                    int iIntValue = ((Integer) list.get(i4)).intValue();
                    zzhhmVar.zzL(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar2 = this.zza;
            zzhhmVar2.zzJ(i, 2);
            int iZzA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int iIntValue2 = ((Integer) list.get(i6)).intValue();
                iZzA += zzhhm.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzhhmVar2.zzs(iZzA);
            while (i4 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i4)).intValue();
                zzhhmVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i4++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z4) {
            while (i4 < zzhiiVar.size()) {
                zzhhm zzhhmVar3 = this.zza;
                int iZzf = zzhiiVar.zzf(i4);
                zzhhmVar3.zzL(i, (iZzf >> 31) ^ (iZzf + iZzf));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar4 = this.zza;
        zzhhmVar4.zzJ(i, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzhiiVar.size(); i10++) {
            int iZzf2 = zzhiiVar.zzf(i10);
            iZzA2 += zzhhm.zzA((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzhhmVar4.zzs(iZzA2);
        while (i4 < zzhiiVar.size()) {
            int iZzf3 = zzhiiVar.zzf(i4);
            zzhhmVar4.zzs((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzL(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    zzhhm zzhhmVar = this.zza;
                    long jLongValue = ((Long) list.get(i4)).longValue();
                    zzhhmVar.zzN(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar2 = this.zza;
            zzhhmVar2.zzJ(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long jLongValue2 = ((Long) list.get(i6)).longValue();
                iZzB += zzhhm.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzhhmVar2.zzs(iZzB);
            while (i4 < list.size()) {
                long jLongValue3 = ((Long) list.get(i4)).longValue();
                zzhhmVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i4++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z4) {
            while (i4 < zzhjgVar.size()) {
                zzhhm zzhhmVar3 = this.zza;
                long jZzc = zzhjgVar.zzc(i4);
                zzhhmVar3.zzN(i, (jZzc >> 63) ^ (jZzc + jZzc));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar4 = this.zza;
        zzhhmVar4.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhjgVar.size(); i10++) {
            long jZzc2 = zzhjgVar.zzc(i10);
            iZzB2 += zzhhm.zzB((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzhhmVar4.zzs(iZzB2);
        while (i4 < zzhjgVar.size()) {
            long jZzc3 = zzhjgVar.zzc(i4);
            zzhhmVar4.zzu((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzM(int i, zzhjk zzhjkVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            zzhhmVar.zzs(zzhjl.zzc(zzhjkVar, entry.getKey(), entry.getValue()));
            zzhjl.zzb(zzhhmVar, zzhjkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzb(int i, int i4) throws IOException {
        this.zza.zzM(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzN(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zze(int i, float f) throws IOException {
        this.zza.zzM(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzg(int i, int i4) throws IOException {
        this.zza.zzK(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzh(int i, long j) throws IOException {
        this.zza.zzN(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzi(int i, int i4) throws IOException {
        this.zza.zzK(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzk(int i, int i4) throws IOException {
        this.zza.zzM(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzl(int i, boolean z4) throws IOException {
        this.zza.zzi(i, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzj(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzn(int i, zzhhb zzhhbVar) throws IOException {
        this.zza.zzk(i, zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzo(int i, int i4) throws IOException {
        this.zza.zzL(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzp(int i, int i4) throws IOException {
        this.zza.zzL(i, (i4 >> 31) ^ (i4 + i4));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzq(int i, long j) throws IOException {
        this.zza.zzN(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzr(int i, Object obj, zzhkk zzhkkVar) throws IOException {
        zzhhm zzhhmVar = this.zza;
        zzhgk zzhgkVar = (zzhgk) obj;
        zzhhmVar.zzJ(i, 2);
        zzhhmVar.zzs(zzhgkVar.zzaT(zzhkkVar));
        zzhkkVar.zzf(zzhgkVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzs(int i, Object obj, zzhkk zzhkkVar) throws IOException {
        zzhhm zzhhmVar = this.zza;
        zzhhmVar.zzJ(i, 3);
        zzhkkVar.zzf((zzhgk) obj, this);
        zzhhmVar.zzJ(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zzJ(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zzJ(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zzhhb) {
            this.zza.zzo(i, (zzhhb) obj);
        } else {
            this.zza.zzn(i, (zzhjs) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzw(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhii)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzhhm.zzB(((Integer) list.get(i6)).intValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i4 < list.size()) {
                zzhhmVar.zzr(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z4) {
            while (i4 < zzhiiVar.size()) {
                this.zza.zzK(i, zzhiiVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhiiVar.size(); i10++) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i10));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i4 < zzhiiVar.size()) {
            zzhhmVar2.zzr(zzhiiVar.zzf(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzx(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhii)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzM(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i6 += 4;
            }
            zzhhmVar.zzs(i6);
            while (i4 < list.size()) {
                zzhhmVar.zzt(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z4) {
            while (i4 < zzhiiVar.size()) {
                this.zza.zzM(i, zzhiiVar.zzf(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhiiVar.size(); i12++) {
            zzhiiVar.zzf(i12);
            i11 += 4;
        }
        zzhhmVar2.zzs(i11);
        while (i4 < zzhiiVar.size()) {
            zzhhmVar2.zzt(zzhiiVar.zzf(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzy(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzN(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzhhm.zzB(((Long) list.get(i6)).longValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i4 < list.size()) {
                zzhhmVar.zzu(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z4) {
            while (i4 < zzhjgVar.size()) {
                this.zza.zzN(i, zzhjgVar.zzc(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhjgVar.size(); i10++) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i10));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i4 < zzhjgVar.size()) {
            zzhhmVar2.zzu(zzhjgVar.zzc(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzz(int i, List list, boolean z4) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z4) {
                while (i4 < list.size()) {
                    this.zza.zzN(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int iZzB = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzB += zzhhm.zzB(((Long) list.get(i6)).longValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i4 < list.size()) {
                zzhhmVar.zzu(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z4) {
            while (i4 < zzhjgVar.size()) {
                this.zza.zzN(i, zzhjgVar.zzc(i4));
                i4++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhjgVar.size(); i10++) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i10));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i4 < zzhjgVar.size()) {
            zzhhmVar2.zzu(zzhjgVar.zzc(i4));
            i4++;
        }
    }
}
