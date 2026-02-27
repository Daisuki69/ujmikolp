package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzuj extends zzui {
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzui
    public final void zza(Object obj) {
        ((zzus) obj).zzb.zzh();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzui
    public final void zzb(zzxi zzxiVar, Map.Entry entry) throws IOException {
        zzut zzutVar = (zzut) entry.getKey();
        zzxg zzxgVar = zzxg.zza;
        switch (zzutVar.zzb.ordinal()) {
            case 0:
                zzwj.zzs(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 1:
                zzwj.zzw(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 2:
                zzwj.zzz(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 3:
                zzwj.zzH(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 4:
                zzwj.zzy(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 5:
                zzwj.zzv(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 6:
                zzwj.zzu(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 7:
                zzwj.zzq(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 8:
                zzwj.zzF(202056002, (List) entry.getValue(), zzxiVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzwj.zzx(202056002, (List) entry.getValue(), zzxiVar, zzwe.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzwj.zzA(202056002, (List) entry.getValue(), zzxiVar, zzwe.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzwj.zzr(202056002, (List) entry.getValue(), zzxiVar);
                break;
            case 12:
                zzwj.zzG(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 13:
                zzwj.zzy(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 14:
                zzwj.zzB(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 15:
                zzwj.zzC(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 16:
                zzwj.zzD(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
            case 17:
                zzwj.zzE(202056002, (List) entry.getValue(), zzxiVar, false);
                break;
        }
    }
}
