package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i, int i4) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x0948, code lost:
    
        r0 = r12.zzaV().zze();
        r2 = com.google.android.gms.measurement.internal.zzgu.zzl(r36.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x095a, code lost:
    
        if (r11.zza() == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x095c, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0965, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0966, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r2, java.lang.String.valueOf(r8));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x067b A[PHI: r0 r7 r20 r22
  0x067b: PHI (r0v94 java.util.Map) = (r0v96 java.util.Map), (r0v102 java.util.Map) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
  0x067b: PHI (r7v22 android.database.Cursor) = (r7v23 android.database.Cursor), (r7v24 android.database.Cursor) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
  0x067b: PHI (r20v8 long) = (r20v9 long), (r20v12 long) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
  0x067b: PHI (r22v12 com.google.android.gms.measurement.internal.zzbc) = (r22v13 com.google.android.gms.measurement.internal.zzbc), (r22v15 com.google.android.gms.measurement.internal.zzbc) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0833 A[PHI: r0 r13 r18 r38
  0x0833: PHI (r0v154 java.util.Map) = (r0v156 java.util.Map), (r0v162 java.util.Map) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
  0x0833: PHI (r13v11 android.database.Cursor) = (r13v12 android.database.Cursor), (r13v13 android.database.Cursor) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
  0x0833: PHI (r18v7 java.lang.String) = (r18v8 java.lang.String), (r18v13 java.lang.String) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
  0x0833: PHI (r38v7 java.util.Iterator) = (r38v8 java.util.Iterator), (r38v11 java.util.Iterator) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #8 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:443:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #8 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:443:0x019c }] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(java.lang.String r37, java.util.List r38, java.util.List r39, java.lang.Long r40, java.lang.Long r41, boolean r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzad.zzb(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }
}
