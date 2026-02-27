package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.TsExtractor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzama implements zzanq {
    private final List zza;

    public zzama(int i, List list) {
        this.zza = list;
    }

    private final zzang zzc(zzanp zzanpVar) {
        return new zzang(zze(zzanpVar), MimeTypes.VIDEO_MP2T);
    }

    private final zzanv zzd(zzanp zzanpVar) {
        return new zzanv(zze(zzanpVar), MimeTypes.VIDEO_MP2T);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzanp zzanpVar) {
        String str;
        int i;
        List listSingletonList;
        zzef zzefVar = new zzef(zzanpVar.zze);
        ArrayList arrayList = this.zza;
        while (zzefVar.zzd() > 0) {
            int iZzs = zzefVar.zzs();
            int iZzg = zzefVar.zzg() + zzefVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzefVar.zzs() & 31;
                for (int i4 = 0; i4 < iZzs2; i4++) {
                    String strZzK = zzefVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzefVar.zzs();
                    boolean z4 = (iZzs3 & 128) != 0;
                    if (z4) {
                        i = iZzs3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte bZzs = (byte) zzefVar.zzs();
                    zzefVar.zzk(1);
                    if (z4) {
                        int i6 = bZzs & 64;
                        int i10 = zzdc.zza;
                        listSingletonList = Collections.singletonList(i6 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzs zzsVar = new zzs();
                    zzsVar.zzm(str);
                    zzsVar.zze(strZzK);
                    zzsVar.zzJ(i);
                    zzsVar.zzp(listSingletonList);
                    arrayList.add(zzsVar.zzM());
                }
            }
            zzefVar.zzh(iZzg);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    @Nullable
    public final zzans zzb(int i, zzanp zzanpVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzamw(new zzamp(zzanpVar.zzb, zzanpVar.zza(), MimeTypes.VIDEO_MP2T));
            }
            if (i == 21) {
                return new zzamw(new zzamn(MimeTypes.VIDEO_MP2T));
            }
            if (i == 27) {
                return new zzamw(new zzamk(zzc(zzanpVar), false, false, MimeTypes.VIDEO_MP2T));
            }
            if (i == 36) {
                return new zzamw(new zzamm(zzc(zzanpVar), MimeTypes.VIDEO_MP2T));
            }
            if (i == 45) {
                return new zzamw(new zzamq(MimeTypes.VIDEO_MP2T));
            }
            if (i == 89) {
                return new zzamw(new zzamc(zzanpVar.zzd, MimeTypes.VIDEO_MP2T));
            }
            if (i == 172) {
                return new zzamw(new zzalw(zzanpVar.zzb, zzanpVar.zza(), MimeTypes.VIDEO_MP2T));
            }
            if (i == 257) {
                return new zzane(new zzamv(MimeTypes.APPLICATION_AIT, MimeTypes.VIDEO_MP2T));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzamw(new zzamb(zzanpVar.zzb, zzanpVar.zza(), 5408, MimeTypes.VIDEO_MP2T));
                        }
                        switch (i) {
                            case 15:
                                return new zzamw(new zzalz(false, zzanpVar.zzb, zzanpVar.zza(), MimeTypes.VIDEO_MP2T));
                            case 16:
                                return new zzamw(new zzami(zzd(zzanpVar), MimeTypes.VIDEO_MP2T));
                            case 17:
                                return new zzamw(new zzamo(zzanpVar.zzb, zzanpVar.zza(), MimeTypes.VIDEO_MP2T));
                            default:
                                switch (i) {
                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                        return new zzane(new zzamv(MimeTypes.APPLICATION_SCTE35, MimeTypes.VIDEO_MP2T));
                                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                        break;
                                    case TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzamw(new zzamb(zzanpVar.zzb, zzanpVar.zza(), 4096, MimeTypes.VIDEO_MP2T));
                }
                return new zzamw(new zzalt(zzanpVar.zzb, zzanpVar.zza(), MimeTypes.VIDEO_MP2T));
            }
        }
        return new zzamw(new zzamf(zzd(zzanpVar), MimeTypes.VIDEO_MP2T));
    }

    public zzama() {
        this(0);
    }

    public zzama(int i) {
        this.zza = zzgjz.zzi();
    }
}
