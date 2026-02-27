package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class ProviderInstaller {

    @NonNull
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();

    @Nullable
    @GuardedBy("ProviderInstaller.lock")
    private static Method zzc = null;

    @GuardedBy("ProviderInstaller.lock")
    private static boolean zzd = false;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, @Nullable Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x0027, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x0027, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:37:0x0015, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void installIfNeeded(@androidx.annotation.NonNull android.content.Context r11) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            r0 = 1
            java.lang.String r1 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11, r1)
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.security.ProviderInstaller.zza
            r2 = 11925000(0xb5f608, float:1.6710484E-38)
            r1.verifyGooglePlayServicesIsAvailable(r11, r2)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r3 = com.google.android.gms.security.ProviderInstaller.zzb
            monitor-enter(r3)
            boolean r4 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> L27
            r5 = 0
            if (r4 != 0) goto L48
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r4 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: java.lang.Throwable -> L27 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2a
            java.lang.String r6 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r4 = com.google.android.gms.dynamite.DynamiteModule.load(r11, r4, r6)     // Catch: java.lang.Throwable -> L27 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2a
            android.content.Context r4 = r4.getModuleContext()     // Catch: java.lang.Throwable -> L27 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2a
            goto L3f
        L27:
            r11 = move-exception
            goto La7
        L2a:
            r4 = move-exception
            java.lang.String r6 = "ProviderInstaller"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = "Failed to load providerinstaller module: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r7.concat(r4)     // Catch: java.lang.Throwable -> L27
            android.util.Log.w(r6, r4)     // Catch: java.lang.Throwable -> L27
            r4 = r5
        L3f:
            if (r4 == 0) goto L48
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            zzb(r4, r11, r0)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            goto L97
        L48:
            boolean r4 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> L27
            android.content.Context r6 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r11)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L51
            goto L8f
        L51:
            com.google.android.gms.security.ProviderInstaller.zzd = r0     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L8e
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            java.lang.String r7 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r8 = "reportRequestStats2"
            java.lang.ClassLoader r9 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            com.google.android.gms.internal.common.zzj r10 = com.google.android.gms.internal.common.zzj.zzb(r10, r11)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            com.google.android.gms.internal.common.zzi r1 = com.google.android.gms.internal.common.zzi.zza(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            com.google.android.gms.internal.common.zzi r2 = com.google.android.gms.internal.common.zzi.zza(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            r4 = 3
            com.google.android.gms.internal.common.zzj[] r4 = new com.google.android.gms.internal.common.zzj[r4]     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            r5 = 0
            r4[r5] = r10     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            r4[r0] = r1     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            r0 = 2
            r4[r0] = r2     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            com.google.android.gms.internal.common.zzl.zzb(r7, r8, r9, r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L7e
            goto L8e
        L7e:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "Failed to report request stats: "
            java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L27
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L27
        L8e:
            r5 = r6
        L8f:
            if (r5 == 0) goto L98
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            zzb(r5, r11, r0)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
        L97:
            return
        L98:
            java.lang.String r11 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r11, r0)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r11 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L27
            r0 = 8
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L27
            throw r11     // Catch: java.lang.Throwable -> L27
        La7:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.ProviderInstaller.installIfNeeded(android.content.Context):void");
    }

    public static void installIfNeededAsync(@NonNull Context context, @NonNull ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    @GuardedBy("ProviderInstaller.lock")
    private static void zzb(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
