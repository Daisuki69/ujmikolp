package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzaiq {
    private static final zzghq zza = zzghq.zza(zzggo.zzc(':'));
    private static final zzghq zzb = zzghq.zza(zzggo.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int zzb(zzacv zzacvVar, zzads zzadsVar, List list) throws IOException {
        int i;
        byte b8;
        char c;
        int i4 = this.zzd;
        if (i4 == 0) {
            long jZzo = zzacvVar.zzo();
            zzadsVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i6 = 2;
        if (i4 != 1) {
            short s9 = 2817;
            short s10 = 2816;
            short s11 = 2192;
            if (i4 != 2) {
                long jZzn = zzacvVar.zzn();
                int iZzo = (int) ((zzacvVar.zzo() - zzacvVar.zzn()) - ((long) this.zze));
                zzef zzefVar = new zzef(iZzo);
                zzacvVar.zzc(zzefVar.zzi(), 0, iZzo);
                int i10 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i10 >= list2.size()) {
                        zzadsVar.zza = 0L;
                        return 1;
                    }
                    zzaip zzaipVar = (zzaip) list2.get(i10);
                    zzefVar.zzh((int) (zzaipVar.zza - jZzn));
                    zzefVar.zzk(4);
                    int iZzC = zzefVar.zzC();
                    Charset charset = StandardCharsets.UTF_8;
                    String strZzK = zzefVar.zzK(iZzC, charset);
                    switch (strZzK.hashCode()) {
                        case -1711564334:
                            b8 = strZzK.equals("SlowMotion_Data") ? (byte) 0 : (byte) -1;
                            break;
                        case -1332107749:
                            b8 = strZzK.equals("Super_SlowMotion_Edit_Data") ? (byte) 3 : (byte) -1;
                            break;
                        case -1251387154:
                            b8 = strZzK.equals("Super_SlowMotion_Data") ? (byte) 1 : (byte) -1;
                            break;
                        case -830665521:
                            b8 = strZzK.equals("Super_SlowMotion_Deflickering_On") ? (byte) 4 : (byte) -1;
                            break;
                        case 1760745220:
                            b8 = strZzK.equals("Super_SlowMotion_BGM") ? (byte) 2 : (byte) -1;
                            break;
                        default:
                            b8 = -1;
                            break;
                    }
                    if (b8 == 0) {
                        c = 2192;
                    } else if (b8 == 1) {
                        c = 2816;
                    } else if (b8 == 2) {
                        c = 2817;
                    } else if (b8 == 3) {
                        c = 2819;
                    } else {
                        if (b8 != 4) {
                            throw zzas.zzb("Invalid SEF name", null);
                        }
                        c = 2820;
                    }
                    int i11 = zzaipVar.zzb - (iZzC + 8);
                    if (c == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZze = zzb.zze(zzefVar.zzK(i11, charset));
                        for (int i12 = 0; i12 < listZze.size(); i12++) {
                            List listZze2 = zza.zze((CharSequence) listZze.get(i12));
                            if (listZze2.size() != 3) {
                                throw zzas.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzagp(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzas.zzb(null, e);
                            }
                        }
                        list.add(new zzagq(arrayList));
                    } else if (c != 2816 && c != 2817 && c != 2819 && c != 2820) {
                        throw new IllegalStateException();
                    }
                    i10++;
                }
            } else {
                long jZzo2 = zzacvVar.zzo();
                int i13 = this.zze - 20;
                zzef zzefVar2 = new zzef(i13);
                zzacvVar.zzc(zzefVar2.zzi(), 0, i13);
                int i14 = 0;
                while (i14 < i13 / 12) {
                    zzefVar2.zzk(i6);
                    short sZzw = zzefVar2.zzw();
                    if (sZzw == s11 || sZzw == s10 || sZzw == s9 || sZzw == 2819 || sZzw == 2820) {
                        i = i13;
                        this.zzc.add(new zzaip(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzefVar2.zzC()), zzefVar2.zzC()));
                    } else {
                        zzefVar2.zzk(8);
                        i = i13;
                    }
                    i14++;
                    i13 = i;
                    i6 = 2;
                    s9 = 2817;
                    s10 = 2816;
                    s11 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzadsVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzadsVar.zza = ((zzaip) list3.get(0)).zza;
                }
            }
        } else {
            zzef zzefVar3 = new zzef(8);
            zzacvVar.zzc(zzefVar3.zzi(), 0, 8);
            this.zze = zzefVar3.zzC() + 8;
            if (zzefVar3.zzB() != 1397048916) {
                zzadsVar.zza = 0L;
            } else {
                zzadsVar.zza = zzacvVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
