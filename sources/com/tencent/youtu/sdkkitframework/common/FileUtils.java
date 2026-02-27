package com.tencent.youtu.sdkkitframework.common;

import We.s;
import android.content.res.AssetManager;
import android.os.Environment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FileUtils {
    public static String TAG = "FileUtils";
    public static Map<String, String> mLoadedLibrary = new HashMap();

    public FileUtils() {
        throw new AssertionError();
    }

    public static boolean copyAsset(AssetManager assetManager, String str, String str2) {
        try {
            InputStream inputStreamOpen = assetManager.open(str);
            new File(str2).createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            copyFile(inputStreamOpen, fileOutputStream);
            inputStreamOpen.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static File createFile(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory());
        String str3 = File.separator;
        File file = new File(s.q(sb2, str3, str2, str3));
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file.getPath() + str3 + str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file2;
    }

    public static void loadLibrary(String str) {
        if (mLoadedLibrary.get(str) == null) {
            YtLogger.i(TAG, "[YTUtils.loadLibrary] " + System.getProperty("java.library.path"));
            System.loadLibrary(str);
            mLoadedLibrary.put(str, "loaded");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.StringBuilder readAssetFile(android.content.Context r5, java.lang.String r6) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "IOException occurred. "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r1.<init>(r2)
            r3 = 0
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.io.InputStream r5 = r5.open(r6)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
        L20:
            java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            if (r6 == 0) goto L3f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            if (r3 != 0) goto L3b
            java.lang.String r3 = "\r\n"
            r1.append(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            goto L3b
        L36:
            r6 = move-exception
            r3 = r5
            goto L57
        L39:
            r6 = move-exception
            goto L4a
        L3b:
            r1.append(r6)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            goto L20
        L3f:
            r5.close()     // Catch: java.io.IOException -> L43
            return r1
        L43:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r0, r5)
            throw r6
        L4a:
            r3 = r5
            goto L50
        L4c:
            r5 = move-exception
            goto L58
        L4e:
            r5 = move-exception
            r6 = r5
        L50:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L56
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L56
            throw r5     // Catch: java.lang.Throwable -> L56
        L56:
            r6 = move-exception
        L57:
            r5 = r6
        L58:
            if (r3 == 0) goto L65
            r3.close()     // Catch: java.io.IOException -> L5e
            goto L65
        L5e:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r0, r5)
            throw r6
        L65:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.FileUtils.readAssetFile(android.content.Context, java.lang.String):java.lang.StringBuilder");
    }

    public static StringBuilder readFile(String str) throws Throwable {
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder("");
        BufferedReader bufferedReader = null;
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            try {
                                bufferedReader2.close();
                                return sb2;
                            } catch (IOException e) {
                                throw new RuntimeException("IOException occurred. ", e);
                            }
                        }
                        if (!sb2.toString().equals("")) {
                            sb2.append("\r\n");
                        }
                        sb2.append(line);
                    } catch (IOException e7) {
                        e = e7;
                        throw new RuntimeException("IOException occurred. ", e);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e10) {
                                throw new RuntimeException("IOException occurred. ", e10);
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void writeFile(File file, String str) throws Throwable {
        PrintWriter printWriter;
        PrintWriter printWriter2 = null;
        try {
            try {
                printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            printWriter.println(str);
            printWriter.flush();
            printWriter.close();
        } catch (Exception e7) {
            e = e7;
            printWriter2 = printWriter;
            e.printStackTrace();
            if (printWriter2 != null) {
                printWriter2.close();
            }
        } catch (Throwable th3) {
            th = th3;
            printWriter2 = printWriter;
            if (printWriter2 != null) {
                printWriter2.close();
            }
            throw th;
        }
    }
}
