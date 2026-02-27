package com.google.android.gms.internal.measurement;

import androidx.camera.video.AudioStats;
import defpackage.AbstractC1414e;
import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzh {
    public static void zza(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void zzb(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void zzc(String str, int i, List list) {
        if (list.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + list.size());
    }

    public static boolean zzd(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double dZzd = zzaoVar.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= AudioStats.AUDIO_AMPLITUDE_NONE && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static zzbk zze(String str) {
        zzbk zzbkVarZza = null;
        if (str != null && !str.isEmpty()) {
            zzbkVarZza = zzbk.zza(Integer.parseInt(str));
        }
        if (zzbkVarZza != null) {
            return zzbkVarZza;
        }
        throw new IllegalArgumentException(AbstractC1414e.h("Unsupported commandId ", str));
    }

    public static boolean zzf(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (!(zzaoVar instanceof zzah)) {
            return zzaoVar instanceof zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
            return false;
        }
        return zzaoVar.zzd().equals(zzaoVar2.zzd());
    }

    public static int zzg(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 0;
        }
        return (int) ((((double) (d10 > AudioStats.AUDIO_AMPLITUDE_NONE ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long zzh(double d10) {
        return ((long) zzg(d10)) & KeyboardMap.kValueMask;
    }

    public static double zzi(double d10) {
        if (Double.isNaN(d10)) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        if (Double.isInfinite(d10) || d10 == AudioStats.AUDIO_AMPLITUDE_NONE || d10 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return d10;
        }
        return ((double) (d10 > AudioStats.AUDIO_AMPLITUDE_NONE ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object zzj(zzao zzaoVar) {
        if (zzao.zzg.equals(zzaoVar)) {
            return null;
        }
        if (zzao.zzf.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof zzal) {
            return zzk((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzae) zzaoVar).iterator();
        while (it.hasNext()) {
            Object objZzj = zzj((zzao) it.next());
            if (objZzj != null) {
                arrayList.add(objZzj);
            }
        }
        return arrayList;
    }

    public static Map zzk(zzal zzalVar) {
        HashMap map = new HashMap();
        for (String str : zzalVar.zzb()) {
            Object objZzj = zzj(zzalVar.zzk(str));
            if (objZzj != null) {
                map.put(str, objZzj);
            }
        }
        return map;
    }

    public static int zzl(zzg zzgVar) {
        int iZzg = zzg(zzgVar.zzh("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iZzg > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzgVar.zze("runtime.counter", new zzah(Double.valueOf(iZzg)));
        return iZzg;
    }
}
