package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgl extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgj zzb;
    private boolean zzc;

    public zzgl(zzic zzicVar) {
        super(zzicVar);
        Context contextZzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgj(this, contextZzaY, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6 A[Catch: all -> 0x0098, SQLiteException -> 0x009b, SQLiteDatabaseLockedException -> 0x00a2, SQLiteFullException -> 0x00a6, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:30:0x008d, B:32:0x0093, B:45:0x00b6, B:47:0x00da, B:49:0x00e4, B:51:0x00ec, B:61:0x0106, B:75:0x012e, B:77:0x0134, B:78:0x0137, B:93:0x016c, B:85:0x0157), top: B:109:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:30:0x008d, B:32:0x0093, B:45:0x00b6, B:47:0x00da, B:49:0x00e4, B:51:0x00ec, B:61:0x0106, B:75:0x012e, B:77:0x0134, B:78:0x0137, B:93:0x016c, B:85:0x0157), top: B:109:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163 A[PHI: r8 r10 r17
  0x0163: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
  0x0163: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
  0x0163: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzs(int r19, byte[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgl.zzs(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    @WorkerThread
    public final void zzh() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzp = zzp();
            if (sQLiteDatabaseZzp == null || (iDelete = sQLiteDatabaseZzp.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzi(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbh.zza(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(zzpl zzplVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzpm.zza(zzplVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzk(zzah zzahVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzahVar);
        if (bArrZzae.length <= 131072) {
            return zzs(2, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbe zzbeVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzbeVar);
        if (bArrZzae == null) {
            zzicVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzae.length <= 131072) {
            return zzs(4, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0369 A[PHI: r6 r11 r13 r17 r19 r21
  0x0369: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x038f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.zzal] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzm(int r30) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgl.zzm(int):java.util.List");
    }

    @WorkerThread
    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[PHI: r4
  0x006b: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:34:0x007e, B:31:0x0069, B:28:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzo() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.zzg()
            boolean r1 = r10.zzc
            r2 = 0
            if (r1 == 0) goto Lc
            goto L91
        Lc:
            boolean r1 = r10.zzq()
            if (r1 == 0) goto L91
            r1 = 5
            r4 = r1
            r3 = r2
        L15:
            if (r3 >= r1) goto L8a
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.zzp()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            if (r5 != 0) goto L29
            r10.zzc = r6     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            goto L91
        L23:
            r0 = move-exception
            goto L84
        L25:
            r7 = move-exception
            goto L46
        L27:
            r7 = move-exception
            goto L6f
        L29:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.endTransaction()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.close()
            return r6
        L46:
            if (r5 == 0) goto L51
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L23
            if (r8 == 0) goto L51
            r5.endTransaction()     // Catch: java.lang.Throwable -> L23
        L51:
            com.google.android.gms.measurement.internal.zzic r8 = r10.zzu     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.measurement.internal.zzgu r8 = r8.zzaV()     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.measurement.internal.zzgs r8 = r8.zzb()     // Catch: java.lang.Throwable -> L23
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L23
            r10.zzc = r6     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L81
            goto L6b
        L63:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L23
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L23
            int r4 = r4 + 20
            if (r5 == 0) goto L81
        L6b:
            r5.close()
            goto L81
        L6f:
            com.google.android.gms.measurement.internal.zzic r8 = r10.zzu     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.measurement.internal.zzgu r8 = r8.zzaV()     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.measurement.internal.zzgs r8 = r8.zzb()     // Catch: java.lang.Throwable -> L23
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L23
            r10.zzc = r6     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L81
            goto L6b
        L81:
            int r3 = r3 + 1
            goto L15
        L84:
            if (r5 == 0) goto L89
            r5.close()
        L89:
            throw r0
        L8a:
            com.google.android.gms.measurement.internal.zzic r0 = r10.zzu
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            com.google.android.gms.internal.ads.AbstractC1173g.B(r0, r1)
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgl.zzo():boolean");
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzp() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    @VisibleForTesting
    public final boolean zzq() {
        zzic zzicVar = this.zzu;
        Context contextZzaY = zzicVar.zzaY();
        zzicVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
