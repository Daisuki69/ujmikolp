package com.google.android.gms.internal.phenotype;

import We.s;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class zzf {
    private static HashMap<String, String> zzbi;
    private static Object zzbn;
    private static boolean zzbo;
    private static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri zzbe = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final Pattern zzbf = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final Pattern zzbg = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzbh = new AtomicBoolean();
    private static final HashMap<String, Boolean> zzbj = new HashMap<>();
    private static final HashMap<String, Integer> zzbk = new HashMap<>();
    private static final HashMap<String, Long> zzbl = new HashMap<>();
    private static final HashMap<String, Float> zzbm = new HashMap<>();
    private static String[] zzbp = new String[0];

    private static <T> T zza(HashMap<String, T> map, String str, T t5) {
        synchronized (zzf.class) {
            try {
                if (!map.containsKey(str)) {
                    return null;
                }
                T t10 = map.get(str);
                if (t10 != null) {
                    t5 = t10;
                }
                return t5;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzf.class) {
            zza(contentResolver);
            obj = zzbn;
        }
        return obj;
    }

    /* JADX WARN: Finally extract failed */
    public static String zza(ContentResolver contentResolver, String str, String str2) {
        String str3;
        synchronized (zzf.class) {
            try {
                zza(contentResolver);
                Object obj = zzbn;
                if (!zzbi.containsKey(str)) {
                    for (String str4 : zzbp) {
                        if (str.startsWith(str4)) {
                            if (!zzbo || zzbi.isEmpty()) {
                                zzbi.putAll(zza(contentResolver, zzbp));
                                zzbo = true;
                                if (zzbi.containsKey(str) && (str3 = zzbi.get(str)) != null) {
                                    str = str3;
                                }
                            }
                        }
                    }
                    Cursor cursorQuery = contentResolver.query(CONTENT_URI, null, null, new String[]{str}, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(1);
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                zza(obj, str, string);
                                str = string != null ? string : null;
                                cursorQuery.close();
                                return str;
                            }
                        } catch (Throwable th2) {
                            if (cursorQuery == null) {
                                throw th2;
                            }
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                    zza(obj, str, (String) null);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                String str5 = zzbi.get(str);
                if (str5 != null) {
                    str = str5;
                }
                return str;
            } finally {
            }
        }
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(zzbe, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return treeMap;
    }

    private static void zza(ContentResolver contentResolver) {
        if (zzbi == null) {
            zzbh.set(false);
            zzbi = new HashMap<>();
            zzbn = new Object();
            zzbo = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzg(null));
            return;
        }
        if (zzbh.getAndSet(false)) {
            zzbi.clear();
            zzbj.clear();
            zzbk.clear();
            zzbl.clear();
            zzbm.clear();
            zzbn = new Object();
            zzbo = false;
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzf.class) {
            try {
                if (obj == zzbn) {
                    zzbi.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z4) {
        Object objZzb = zzb(contentResolver);
        HashMap<String, Boolean> map = zzbj;
        Boolean bool = (Boolean) zza(map, str, Boolean.valueOf(z4));
        if (bool != null) {
            return bool.booleanValue();
        }
        String strZza = zza(contentResolver, str, (String) null);
        if (strZza != null && !strZza.equals("")) {
            if (zzbf.matcher(strZza).matches()) {
                bool = Boolean.TRUE;
                z4 = true;
            } else if (zzbg.matcher(strZza).matches()) {
                bool = Boolean.FALSE;
                z4 = false;
            } else {
                Log.w("Gservices", s.l("attempt to read gservices key ", str, " (value \"", strZza, "\") as boolean"));
            }
        }
        synchronized (zzf.class) {
            try {
                if (objZzb == zzbn) {
                    map.put(str, bool);
                    zzbi.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z4;
    }
}
