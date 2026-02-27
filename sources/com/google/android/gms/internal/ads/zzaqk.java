package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.agent.Global;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zzaqk extends zzaph {
    private final Object zza;

    @Nullable
    @GuardedBy("mLock")
    private final zzapm zzb;

    public zzaqk(int i, String str, zzapm zzapmVar, @Nullable zzapl zzaplVar) {
        super(i, str, zzaplVar);
        this.zza = new Object();
        this.zzb = zzapmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final zzapn zzr(zzapd zzapdVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapdVar.zzb;
            Map map = zzapdVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(RtspHeaders.CONTENT_TYPE)) != null) {
                String[] strArrSplit = str2.split(Global.SEMICOLON, 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapdVar.zzb);
        }
        return zzapn.zza(str, zzaqe.zza(zzapdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzapm zzapmVar;
        synchronized (this.zza) {
            zzapmVar = this.zzb;
        }
        zzapmVar.zza(str);
    }
}
