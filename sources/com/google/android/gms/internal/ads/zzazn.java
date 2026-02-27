package com.google.android.gms.internal.ads;

import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazn {
    private final int zza;
    private final zzazk zzb = new zzazp();

    public zzazn(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb2.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split(Global.NEWLINE);
        if (strArrSplit.length == 0) {
            return "";
        }
        zzazm zzazmVar = new zzazm();
        int i4 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i4, new zzazl(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzazo.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzazr.zza(strArrZzb, i4, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzazmVar.zzb.write(this.zzb.zza(((zzazq) it.next()).zzb));
            } catch (IOException e) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzazmVar.toString();
    }
}
