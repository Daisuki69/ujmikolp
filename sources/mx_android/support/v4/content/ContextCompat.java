package mx_android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class ContextCompat {
    private static final String DIR_ANDROID = "Android";
    private static final String DIR_CACHE = "cache";
    private static final String DIR_DATA = "data";
    private static final String DIR_FILES = "files";
    private static final String DIR_OBB = "obb";
    private static final String TAG = "ContextCompat";

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            ContextCompatJellybean.startActivities(context, intentArr, bundle);
            return true;
        }
        if (i < 11) {
            return false;
        }
        ContextCompatHoneycomb.startActivities(context, intentArr);
        return true;
    }

    public static File[] getObbDirs(Context context) {
        File fileBuildPath;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return ContextCompatKitKat.getObbDirs(context);
        }
        if (i >= 11) {
            fileBuildPath = ContextCompatHoneycomb.getObbDir(context);
        } else {
            fileBuildPath = buildPath(Environment.getExternalStorageDirectory(), "Android", DIR_OBB, context.getPackageName());
        }
        return new File[]{fileBuildPath};
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        File fileBuildPath;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return ContextCompatKitKat.getExternalFilesDirs(context, str);
        }
        if (i >= 8) {
            fileBuildPath = ContextCompatFroyo.getExternalFilesDir(context, str);
        } else {
            fileBuildPath = buildPath(Environment.getExternalStorageDirectory(), "Android", "data", context.getPackageName(), DIR_FILES, str);
        }
        return new File[]{fileBuildPath};
    }

    public static File[] getExternalCacheDirs(Context context) {
        File fileBuildPath;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return ContextCompatKitKat.getExternalCacheDirs(context);
        }
        if (i >= 8) {
            fileBuildPath = ContextCompatFroyo.getExternalCacheDir(context);
        } else {
            fileBuildPath = buildPath(Environment.getExternalStorageDirectory(), "Android", "data", context.getPackageName(), DIR_CACHE);
        }
        return new File[]{fileBuildPath};
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static final Drawable getDrawable(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ContextCompatApi21.getDrawable(context, i);
        }
        return context.getResources().getDrawable(i);
    }

    public final File getNoBackupFilesDir(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ContextCompatApi21.getNoBackupFilesDir(context);
        }
        return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public final File getCodeCacheDir(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ContextCompatApi21.getCodeCacheDir(context);
        }
        return createFilesDir(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    private static synchronized File createFilesDir(File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        if (file.exists()) {
            return file;
        }
        Log.w(TAG, "Unable to create files subdir " + file.getPath());
        return null;
    }
}
