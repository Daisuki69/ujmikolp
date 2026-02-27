package org.opencv.android;

import android.util.Log;
import com.dynatrace.android.agent.Global;
import java.util.StringTokenizer;
import org.opencv.core.Core;

/* JADX INFO: loaded from: classes5.dex */
abstract class StaticHelper {
    public static boolean a() {
        String libraryList;
        boolean zB;
        Log.d("OpenCV/StaticHelper", "Trying to get library list");
        try {
            System.loadLibrary("opencv_info");
            libraryList = getLibraryList();
        } catch (UnsatisfiedLinkError unused) {
            Log.e("OpenCV/StaticHelper", "OpenCV error: Cannot load info library for OpenCV");
            libraryList = "";
        }
        Log.d("OpenCV/StaticHelper", "Library list: \"" + libraryList + "\"");
        Log.d("OpenCV/StaticHelper", "First attempt to load libs");
        Log.d("OpenCV/StaticHelper", "Trying to init OpenCV libs");
        if (libraryList == null || libraryList.length() == 0) {
            zB = b("opencv_java3");
        } else {
            Log.d("OpenCV/StaticHelper", "Trying to load libs by dependency list");
            StringTokenizer stringTokenizer = new StringTokenizer(libraryList, Global.SEMICOLON);
            zB = true;
            while (stringTokenizer.hasMoreTokens()) {
                zB &= b(stringTokenizer.nextToken());
            }
        }
        if (!zB) {
            Log.d("OpenCV/StaticHelper", "First attempt to load libs fails");
            return false;
        }
        Log.d("OpenCV/StaticHelper", "First attempt to load libs is OK");
        for (String str : Core.a().split(System.getProperty("line.separator"))) {
            Log.i("OpenCV/StaticHelper", str);
        }
        return true;
    }

    public static boolean b(String str) {
        Log.d("OpenCV/StaticHelper", "Trying to load library " + str);
        try {
            System.loadLibrary(str);
            Log.d("OpenCV/StaticHelper", "Library " + str + " loaded");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.d("OpenCV/StaticHelper", "Cannot load library \"" + str + "\"");
            e.printStackTrace();
            return false;
        }
    }

    private static native String getLibraryList();
}
