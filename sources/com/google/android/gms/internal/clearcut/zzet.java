package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class zzet {
    public static String zzc(zzbb zzbbVar) {
        String str;
        zzeu zzeuVar = new zzeu(zzbbVar);
        StringBuilder sb2 = new StringBuilder(zzeuVar.size());
        for (int i = 0; i < zzeuVar.size(); i++) {
            int iZzj = zzeuVar.zzj(i);
            if (iZzj == 34) {
                str = "\\\"";
            } else if (iZzj == 39) {
                str = "\\'";
            } else if (iZzj != 92) {
                switch (iZzj) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iZzj < 32 || iZzj > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((iZzj >>> 6) & 3) + 48));
                            sb2.append((char) (((iZzj >>> 3) & 7) + 48));
                            iZzj = (iZzj & 7) + 48;
                        }
                        sb2.append((char) iZzj);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
