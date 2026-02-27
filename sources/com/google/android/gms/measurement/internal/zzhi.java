package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzhi implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbq zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzhj zzc;

    public zzhi(zzhj zzhjVar, com.google.android.gms.internal.measurement.zzbq zzbqVar, ServiceConnection serviceConnection) {
        this.zza = zzbqVar;
        this.zzb = serviceConnection;
        Objects.requireNonNull(zzhjVar);
        this.zzc = zzhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZze;
        zzhj zzhjVar = this.zzc;
        zzhk zzhkVar = zzhjVar.zza;
        zzic zzicVar = zzhkVar.zza;
        zzicVar.zzaW().zzg();
        Bundle bundle = new Bundle();
        String strZza = zzhjVar.zza();
        bundle.putString("package_name", strZza);
        try {
            bundleZze = this.zza.zze(bundle);
        } catch (Exception e) {
            zzhkVar.zza.zzaV().zzb().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        if (bundleZze == null) {
            zzicVar.zzaV().zzb().zza("Install Referrer Service returned a null response");
            bundleZze = null;
        }
        zzic zzicVar2 = zzhkVar.zza;
        zzicVar2.zzaW().zzg();
        zzic.zzL();
        if (bundleZze != null) {
            long j = bundleZze.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                AbstractC1173g.B(zzicVar2, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleZze.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    AbstractC1173g.v(zzicVar2, "No referrer defined in Install Referrer response");
                } else {
                    zzicVar2.zzaV().zzk().zzb("InstallReferrer API result", string);
                    Bundle bundleZzi = zzicVar2.zzk().zzi(Uri.parse(Global.QUESTION.concat(string)));
                    if (bundleZzi == null) {
                        AbstractC1173g.v(zzicVar2, "No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) zzfy.zzbg.zzb(null)).split(","));
                        Iterator<String> it = bundleZzi.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (listAsList.contains(it.next())) {
                                long j6 = bundleZze.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j6 > 0) {
                                    bundleZzi.putLong("click_timestamp", j6);
                                }
                            }
                        }
                        if (j == zzicVar2.zzd().zzd.zza()) {
                            zzicVar2.zzaV().zzk().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzicVar2.zzB()) {
                            zzicVar2.zzd().zzd.zzb(j);
                            zzicVar2.zzaV().zzk().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleZzi.putString("_cis", "referrer API v2");
                            zzicVar2.zzj().zzI(TtmlNode.TEXT_EMPHASIS_AUTO, "_cmp", bundleZzi, strZza);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzicVar2.zzaY(), this.zzb);
    }
}
