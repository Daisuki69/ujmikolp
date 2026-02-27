package dOYHB6;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.EditText;
import androidx.media3.extractor.ts.TsExtractor;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ewaEX1 {
    private static Set<WeakReference<Activity>> activitiesWithPromptForPassphrase = null;

    private static String a7T4x8() {
        TelephonyManager telephonyManager = (TelephonyManager) nm8AQ4.get().getSystemService(numX49.tnTj78("bHM4"));
        String strTnTj78 = numX49.tnTj78("bHMo");
        if (telephonyManager == null) {
            return strTnTj78;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return TextUtils.isEmpty(networkOperator) ? strTnTj78 : networkOperator;
    }

    private static String azFlu0() {
        return numX49.tnTj78("bHMC");
    }

    private static String bIqg96() {
        return Base64.encodeToString(numX49.tnTj78("bHML").getBytes(), 0);
    }

    public static String cKQiF2(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            } catch (JSONException e) {
            }
        }
        return jSONObject.toString();
    }

    public static boolean cbUh06(String str) {
        PackageManager packageManager = nm8AQ4.get().getPackageManager();
        if (str == null) {
            return false;
        }
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static void copyFile(File file, File file2) throws IOException {
        file2.delete();
        file2.getParentFile().mkdirs();
        copyStreams(new FileInputStream(file), new FileOutputStream(file2));
    }

    public static void copyStreams(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        if (fileInputStream == null || fileOutputStream == null) {
            return;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i = fileInputStream.read(bArr, 0, 2048);
                if (i == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i);
                }
            }
            fileOutputStream.flush();
            try {
                fileInputStream.close();
            } catch (Exception e) {
            }
            try {
                fileOutputStream.close();
            } catch (Exception e7) {
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Exception e10) {
            }
            try {
                fileOutputStream.close();
                throw th2;
            } catch (Exception e11) {
                throw th2;
            }
        }
    }

    private static String d9fzo9() {
        Context context = nm8AQ4.get();
        TelephonyManager telephonyManager = context == null ? null : (TelephonyManager) context.getSystemService(numX49.tnTj78("bHMr"));
        if (telephonyManager == null) {
            return azFlu0();
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        return TextUtils.isEmpty(networkOperatorName) ? azFlu0() : networkOperatorName;
    }

    public static boolean eRmeH3(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                eRmeH3(file2);
            }
        }
        return file.delete();
    }

    public static String getDeviceInfo() {
        return (((((((((((((numX49.tnTj78("bHMB") + numX49.tnTj78("bHMu") + fChUQ4.getDeviceManufacturer()) + numX49.tnTj78("bHMV") + fChUQ4.v9Oi27()) + numX49.tnTj78("bHMS") + fChUQ4.getDeviceModel()) + numX49.tnTj78("bHMj") + fChUQ4.dZhpq4()) + numX49.tnTj78("bHMd") + fChUQ4.gl5fe5() + numX49.tnTj78("bHMi") + fChUQ4.inENc6()) + numX49.tnTj78("bHME") + fChUQ4.ei9uk4()) + numX49.tnTj78("bHMF") + fChUQ4.lu9GF4()) + numX49.tnTj78("bHMH") + fChUQ4.umb288()) + numX49.tnTj78("bHMO") + fChUQ4.eoxVg5()) + numX49.tnTj78("bHMQ") + fChUQ4.mYR398()) + numX49.tnTj78("bHMt") + fChUQ4.sbl6Y7()) + numX49.tnTj78("bHMU") + fChUQ4.eq4lX7()) + numX49.tnTj78("bHMe") + a7T4x8()) + numX49.tnTj78("bHM8");
    }

    public static List<String> h3AjI4() {
        List<ApplicationInfo> installedApplications = nm8AQ4.get().getPackageManager().getInstalledApplications(128);
        ArrayList arrayList = new ArrayList();
        Iterator<ApplicationInfo> it = installedApplications.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().packageName);
        }
        return arrayList;
    }

    public static boolean hDYQe3(final String str, final long j) {
        if (str.length() <= 0) {
            str = numX49.tnTj78("bHMK");
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dOYHB6.ewaEX1.1
            @Override // java.lang.Runnable
            public void run() {
                Activity activityJqldq5 = iKNpI8.jqldq5();
                if (activityJqldq5 == null) {
                    return;
                }
                final WeakReference weakReference = new WeakReference(activityJqldq5);
                if (ewaEX1.activitiesWithPromptForPassphrase == null) {
                    ewaEX1.activitiesWithPromptForPassphrase = new HashSet();
                } else {
                    Iterator it = ewaEX1.activitiesWithPromptForPassphrase.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference2 = (WeakReference) it.next();
                        if (weakReference2.get() == null) {
                            it.remove();
                        } else if (weakReference2.get() == weakReference.get()) {
                            fChUQ4.pQeZJ6(false, numX49.tnTj78("bHMa"), j);
                            return;
                        }
                    }
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activityJqldq5);
                builder.setTitle(numX49.tnTj78("bHMX"));
                builder.setMessage(str + numX49.tnTj78("bHMG"));
                final EditText editText = new EditText(activityJqldq5);
                editText.setInputType(TsExtractor.TS_STREAM_TYPE_AC3);
                builder.setView(editText);
                builder.setPositiveButton(numX49.tnTj78("bHM3"), new DialogInterface.OnClickListener() { // from class: dOYHB6.ewaEX1.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (ewaEX1.activitiesWithPromptForPassphrase.contains(weakReference)) {
                            fChUQ4.pQeZJ6(true, editText.getText().toString(), j);
                            ewaEX1.activitiesWithPromptForPassphrase.remove(weakReference);
                        }
                    }
                });
                builder.setNegativeButton(numX49.tnTj78("bHMy"), new DialogInterface.OnClickListener() { // from class: dOYHB6.ewaEX1.1.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (ewaEX1.activitiesWithPromptForPassphrase.contains(weakReference)) {
                            fChUQ4.pQeZJ6(false, numX49.tnTj78("bHMg"), j);
                            ewaEX1.activitiesWithPromptForPassphrase.remove(weakReference);
                        }
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: dOYHB6.ewaEX1.1.3
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        if (ewaEX1.activitiesWithPromptForPassphrase.contains(weakReference)) {
                            fChUQ4.pQeZJ6(false, numX49.tnTj78("bHM0"), j);
                            ewaEX1.activitiesWithPromptForPassphrase.remove(weakReference);
                        }
                    }
                });
                alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dOYHB6.ewaEX1.1.4
                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        if (ewaEX1.activitiesWithPromptForPassphrase.contains(weakReference)) {
                            fChUQ4.pQeZJ6(false, numX49.tnTj78("bHMP"), j);
                            ewaEX1.activitiesWithPromptForPassphrase.remove(weakReference);
                        }
                    }
                });
                ewaEX1.activitiesWithPromptForPassphrase.add(weakReference);
                alertDialogCreate.show();
            }
        });
        return true;
    }

    public static byte[] iCK6L8(String str) {
        Context context = nm8AQ4.get();
        return Base64.decode(context == null ? bIqg96() : PreferenceManager.getDefaultSharedPreferences(context).getString(str, bIqg96()), 0);
    }

    public static int iNkEd3() {
        try {
            return nm8AQ4.get().getPackageManager().getPackageInfo("com.google.android.art", 1073741824).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return 0;
        }
    }

    public static void kBBkG9(String str, byte[] bArr) {
        Context context = nm8AQ4.get();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString(str, Base64.encodeToString(bArr, 0));
        editorEdit.apply();
    }

    public static boolean sFgB72() {
        Context context = nm8AQ4.get();
        if (!yOE3B8()) {
            return !numX49.tnTj78("bHMc").equalsIgnoreCase(Build.MANUFACTURER) && Settings.Global.getInt(context.getContentResolver(), numX49.tnTj78("bHMm"), 0) == 1;
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("canRequestPackageInstalls", new Class[0]).invoke(context.getPackageManager(), new Object[0])).booleanValue();
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
            return false;
        }
    }

    public static void sU3gU0(String str, Activity activity, String[] strArr) {
        try {
            Class.forName(str + "android.support.v4.app.ActivityCompat").getMethod("requestPermissions", Activity.class, String[].class, Integer.TYPE).invoke(null, activity, strArr, 6547);
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
        }
    }

    public static boolean t9YKe0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static String u1tSR2(String str) {
        try {
            return nm8AQ4.get().getPackageManager().getApplicationInfo(str, 128).sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            return numX49.tnTj78("bHM2");
        }
    }

    public static void ufEdW9(JSONObject jSONObject, Context context) {
        ufEdW9(jSONObject, context, numX49.tnTj78("bHMw"));
    }

    public static void ufEdW9(JSONObject jSONObject, Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                String str2 = str + next;
                if (obj instanceof String) {
                    editorEdit.putString(str2, (String) obj);
                    if (defaultSharedPreferences.getString(next, null) == null) {
                        editorEdit.putString(next, (String) obj);
                    }
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(str2, ((Boolean) obj).booleanValue());
                    if (!defaultSharedPreferences.getBoolean(next, false)) {
                        editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                    }
                } else if (obj instanceof Integer) {
                    editorEdit.putInt(str2, ((Integer) obj).intValue());
                    if (defaultSharedPreferences.getInt(next, -1) == -1) {
                        editorEdit.putInt(next, ((Integer) obj).intValue());
                    }
                } else if (obj instanceof Float) {
                    editorEdit.putFloat(str2, ((Float) obj).floatValue());
                    if (defaultSharedPreferences.getFloat(next, -1.0f) == -1.0f) {
                        editorEdit.putFloat(next, ((Float) obj).floatValue());
                    }
                } else {
                    editorEdit.putString(str2, obj.toString());
                    if (defaultSharedPreferences.getString(next, null) == null) {
                        editorEdit.putString(next, obj.toString());
                    }
                }
            } catch (JSONException e) {
                cYHhs8.gWQKs2(e, false);
            }
        }
        editorEdit.apply();
    }

    public static String utYh22() {
        Context context = nm8AQ4.get();
        String strTnTj78 = numX49.tnTj78("bHMZ");
        String string = context != null ? Settings.Secure.getString(context.getContentResolver(), numX49.tnTj78("bHMk")) : strTnTj78;
        return string == null ? strTnTj78 : string;
    }

    public static void v9NrJ7(FileInputStream fileInputStream, File file) throws IOException {
        copyStreams(fileInputStream, new FileOutputStream(file));
    }

    public static void vma4u7() {
        fChUQ4.setDeviceId(utYh22());
    }

    public static Intent wtvry9(Activity activity, String str) {
        Intent intent = activity.getIntent();
        String name = activity.getClass().getName();
        if (name.endsWith(str)) {
            name = name.substring(0, name.length() - str.length());
        }
        Intent intent2 = null;
        try {
            Intent intent3 = new Intent(activity, Class.forName(name));
            if (intent == null) {
                return intent3;
            }
            try {
                Uri data = intent.getData();
                if (data != null) {
                    intent3.setData(data);
                } else {
                    intent3.setType(intent.getType());
                }
                intent3.putExtras(intent);
                intent3.setClipData(intent.getClipData());
                intent3.setAction(intent.getAction());
                intent3.setSourceBounds(intent.getSourceBounds());
                if (intent.getPackage() != null) {
                    intent3.setPackage(intent.getPackage());
                }
                if (intent.getSelector() != null) {
                    intent3.setSelector(intent.getSelector());
                }
                Set<String> categories = intent.getCategories();
                if (categories != null && categories.contains("android.intent.category.LAUNCHER")) {
                    intent3.setFlags(R.id.background);
                    return intent3;
                }
                intent3.setFlags(intent.getFlags());
                return intent3;
            } catch (ClassNotFoundException e) {
                intent2 = intent3;
                return intent2;
            }
        } catch (ClassNotFoundException e7) {
        }
    }

    public static <T, U> String x7vBq2(Map<T, U> map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<T, U>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<T, U> next = it.next();
            sb2.append(next.getKey());
            sb2.append('=').append('\"');
            sb2.append(next.getValue());
            sb2.append('\"');
            if (it.hasNext()) {
                sb2.append(',').append(' ');
            }
        }
        return sb2.toString();
    }

    public static Bundle yHEsR2(Bundle bundle, String str) {
        if (bundle == null) {
            return bundle;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
        }
        return bundle;
    }

    public static boolean yOE3B8() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private static String zXLA81() {
        return Build.SERIAL;
    }

    public static boolean zeCO79() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
