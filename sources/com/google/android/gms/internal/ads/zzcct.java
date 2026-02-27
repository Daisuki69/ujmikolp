package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcct extends zzccq {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcct(zzcbd zzcbdVar) {
        super(zzcbdVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqm.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfqm.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x03d9, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03e1, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03e3, code lost:
    
        r0 = r10.format(r4);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r34).length());
        r5.append(r18);
        r5.append(r0);
        r5.append(" bytes from ");
        r5.append(r34);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0415, code lost:
    
        r14.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0420, code lost:
    
        if (r7.isFile() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0422, code lost:
    
        r7.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x042e, code lost:
    
        r7.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04aa  */
    @Override // com.google.android.gms.internal.ads.zzccq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(final java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcct.zze(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        this.zzh = true;
    }
}
