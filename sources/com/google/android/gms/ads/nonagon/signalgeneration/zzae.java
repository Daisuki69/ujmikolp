package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzgoq;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzae implements zzgoq {
    final /* synthetic */ zzbtl zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    public zzae(zzau zzauVar, zzbtl zzbtlVar, boolean z4) {
        this.zza = zzbtlVar;
        this.zzb = z4;
        Objects.requireNonNull(zzauVar);
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        try {
            zzbtl zzbtlVar = this.zza;
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
            sb2.append("Internal error: ");
            sb2.append(message);
            zzbtlVar.zzf(sb2.toString());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.zza.zze(arrayList);
            zzau zzauVar = this.zzc;
            if (!zzauVar.zzC() && !this.zzb) {
                return;
            }
            for (Uri uri : arrayList) {
                if (zzauVar.zzc(uri)) {
                    zzauVar.zzB().zzb(zzau.zzZ(uri, zzauVar.zzM(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhT)).booleanValue()) {
                        zzauVar.zzB().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
