package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class zzwt {
    public static String zza(zztu zztuVar) {
        StringBuilder sb2 = new StringBuilder(zztuVar.zzd());
        for (int i = 0; i < zztuVar.zzd(); i++) {
            byte bZza = zztuVar.zza(i);
            if (bZza == 34) {
                sb2.append("\\\"");
            } else if (bZza == 39) {
                sb2.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bZza >>> 6) & 3) + 48));
                            sb2.append((char) (((bZza >>> 3) & 7) + 48));
                            sb2.append((char) ((bZza & 7) + 48));
                        } else {
                            sb2.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
