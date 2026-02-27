package com.google.android.gms.internal.vision;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbh {
    public static zzcy<zzbe> zza(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
            return zzcy.zzc();
        }
        if (zzas.zza() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        zzcy<File> zzcyVarZzb = zzb(context);
        return zzcyVarZzb.zza() ? zzcy.zza(zza(zzcyVarZzb.zzb())) : zzcy.zzc();
    }

    private static zzcy<File> zzb(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                zzcy<File> zzcyVarZza = file.exists() ? zzcy.zza(file) : zzcy.zzc();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return zzcyVarZza;
            } catch (RuntimeException e) {
                Log.e("HermeticFileOverrides", "no data dir", e);
                zzcy<File> zzcyVarZzc = zzcy.zzc();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return zzcyVarZzc;
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    private static zzbe zza(File file) {
        BufferedReader bufferedReader;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                map = new HashMap();
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                String[] strArrSplit = line.split(Global.BLANK, 3);
                if (strArrSplit.length != 3) {
                    Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                } else {
                    String str = strArrSplit[0];
                    String strDecode = Uri.decode(strArrSplit[1]);
                    String strDecode2 = Uri.decode(strArrSplit[2]);
                    if (!map.containsKey(str)) {
                        map.put(str, new HashMap());
                    }
                    ((Map) map.get(str)).put(strDecode, strDecode2);
                }
            } else {
                String strValueOf = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 7);
                sb2.append("Parsed ");
                sb2.append(strValueOf);
                Log.i("HermeticFileOverrides", sb2.toString());
                zzbe zzbeVar = new zzbe(map);
                bufferedReader.close();
                return zzbeVar;
            }
            throw new RuntimeException(e);
        }
    }
}
