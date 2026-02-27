package com.tencent.youtu.sdkkitframework.framework;

import We.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class YtSDKKitFrameworkTool {
    public static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static String huiYanVersion = "";
    public final String MD5_FILE_NAME = "files_md5";
    public final Map<String, String> moduleFileMd5Map = new ConcurrentHashMap();
    public final String TAG = "YtSDKKitFrameworkTool";

    public enum ModelValidityCode {
        VALIDITY_OK,
        NOT_FOUND_MODEL_DIR,
        NOT_FOUND_MODEL_MD5,
        READ_MD5_ERROR,
        VALIDITY_ERROR,
        TARGET_MD5_NOT_FOUND,
        CREATE_MD5_ERROR,
        MODEL_FILE_MISS
    }

    private String bytesToHexString(byte[] bArr) {
        if (bArr == null || bArr.length != 16) {
            return "";
        }
        char[] cArr = new char[32];
        int i = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            byte b8 = bArr[i4];
            int i6 = i + 1;
            char[] cArr2 = hexDigits;
            cArr[i] = cArr2[(b8 >>> 4) & 15];
            i += 2;
            cArr[i6] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.tencent.youtu.sdkkitframework.framework.YtSDKKitFrameworkTool] */
    private String getFileMD5(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        if (file != null && file.exists() && file.length() > 0) {
            ?? r22 = 0;
            BufferedInputStream bufferedInputStream2 = null;
            BufferedInputStream bufferedInputStream3 = null;
            try {
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    } catch (IOException e) {
                        String str = this.TAG;
                        YtLogger.e(str, "get file  md5 close io error:", e);
                        r22 = str;
                        return "";
                    }
                } catch (FileNotFoundException e7) {
                    e = e7;
                } catch (OutOfMemoryError e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                String inputStreamMd5 = getInputStreamMd5(bufferedInputStream);
                bufferedInputStream.close();
                return inputStreamMd5;
            } catch (FileNotFoundException e11) {
                e = e11;
                bufferedInputStream2 = bufferedInputStream;
                e.printStackTrace();
                YtLogger.e(this.TAG, "get file  md5 error ", e);
                r22 = bufferedInputStream2;
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                    r22 = bufferedInputStream2;
                }
                return "";
            } catch (OutOfMemoryError e12) {
                e = e12;
                bufferedInputStream3 = bufferedInputStream;
                YtLogger.e(this.TAG, "get file  md5 error oom", e);
                r22 = bufferedInputStream3;
                if (bufferedInputStream3 != null) {
                    bufferedInputStream3.close();
                    r22 = bufferedInputStream3;
                }
                return "";
            } catch (Throwable th3) {
                th = th3;
                r22 = bufferedInputStream;
                if (r22 != 0) {
                    try {
                        r22.close();
                    } catch (IOException e13) {
                        YtLogger.e(this.TAG, "get file  md5 close io error:", e13);
                    }
                }
                throw th;
            }
        }
        return "";
    }

    public static native String getFrameworkVersion();

    private String getInputStreamMd5(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[4196];
            int i = 0;
            while (true) {
                int i4 = inputStream.read(bArr, 0, 4196);
                if (i4 == -1) {
                    break;
                }
                if (i4 > 0) {
                    messageDigest.update(bArr, 0, i4);
                    i += i4;
                }
            }
            return i == 0 ? "" : bytesToHexString(messageDigest.digest());
        } catch (IOException e) {
            e.printStackTrace();
            YtLogger.e(this.TAG, "get input stream  md5 error ", e);
            return "";
        } catch (NoSuchAlgorithmException e7) {
            e7.printStackTrace();
            YtLogger.e(this.TAG, "get input stream  md5 error ", e7);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        return -3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        com.tencent.youtu.sdkkitframework.common.YtLogger.e(r9.TAG, "get modle md5 to map close io  error:", r10);
        r10.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        com.tencent.youtu.sdkkitframework.common.YtLogger.e(r9.TAG, "get modle md5 to map close io error:", r10);
        r10.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getModleMd5ToMap(java.io.File r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFrameworkTool.getModleMd5ToMap(java.io.File):int");
    }

    public static synchronized void openBuglyShared(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        String frameworkVersion = getFrameworkVersion();
        if (!TextUtils.isEmpty(huiYanVersion)) {
            frameworkVersion = frameworkVersion + Global.UNDERSCORE + huiYanVersion;
        }
        editorEdit.putString("63a0c81546", frameworkVersion);
        editorEdit.commit();
    }

    public static native YTImageData rotateYUVImage(byte[] bArr, int i, int i4, int i6);

    private void searchFiles(File file, List<String> list) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            YtLogger.e(this.TAG, "dir is empty", null);
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                searchFiles(file2, list);
            } else {
                String path = file2.getPath();
                if (!file2.getName().equalsIgnoreCase("files_md5")) {
                    list.add(path);
                }
            }
        }
    }

    public static void setHuiYanVersion(String str) {
        huiYanVersion = str;
    }

    private int traverseFolder(File file) throws Throwable {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList();
        searchFiles(file, copyOnWriteArrayList);
        if (copyOnWriteArrayList.size() == 0) {
            YtLogger.e(this.TAG, "dir is empty", null);
            return -1;
        }
        String name = file.getName();
        for (String str : copyOnWriteArrayList) {
            String strSubstring = str.substring(name.length() + str.indexOf(name) + 1);
            if (!this.moduleFileMd5Map.containsKey(strSubstring)) {
                YtLogger.e(this.TAG, "the file name not found md5 with md5 map：" + strSubstring, null);
                return -3;
            }
            String fileMD5 = getFileMD5(new File(str));
            if (TextUtils.isEmpty(fileMD5)) {
                YtLogger.e(this.TAG, "create md5 by file is error,md5 is null", null);
                return -4;
            }
            if (!fileMD5.equalsIgnoreCase(this.moduleFileMd5Map.get(strSubstring))) {
                YtLogger.e(this.TAG, s.q(s.w("md5 validity by dir error,file name is ", strSubstring, "   target md5 is "), this.moduleFileMd5Map.get(strSubstring), " cur md5 is ", fileMD5), null);
                return -2;
            }
            this.moduleFileMd5Map.remove(strSubstring);
        }
        if (this.moduleFileMd5Map.size() == 0) {
            return 0;
        }
        for (String str2 : this.moduleFileMd5Map.keySet()) {
            String str3 = this.TAG;
            StringBuilder sbW = s.w("module file miss:", str2, " md5:");
            sbW.append(this.moduleFileMd5Map.get(str2));
            YtLogger.e(str3, sbW.toString(), null);
        }
        return -5;
    }

    public static native YTImageData yuv2bgrImge(byte[] bArr, int i, int i4, int i6);

    public static native YTImageData yuvRotateAnd2bgrImge(byte[] bArr, int i, int i4, int i6, int i10);

    public ModelValidityCode md5ValidityByDir(String str) throws Throwable {
        YtLogger.i(this.TAG, "module path :" + str);
        File file = new File(str);
        if (!file.exists()) {
            String str2 = this.TAG;
            ModelValidityCode modelValidityCode = ModelValidityCode.VALIDITY_OK;
            YtLogger.e(str2, "md5 validity by dir error:NOT_FOUND_MODEL_DIR", null);
            return ModelValidityCode.NOT_FOUND_MODEL_DIR;
        }
        File file2 = new File(s.i(str, "files_md5"));
        if (!file2.exists()) {
            String str3 = this.TAG;
            ModelValidityCode modelValidityCode2 = ModelValidityCode.VALIDITY_OK;
            YtLogger.e(str3, "md5 validity by dir error:NOT_FOUND_MODEL_MD5", null);
            return ModelValidityCode.NOT_FOUND_MODEL_MD5;
        }
        if (getModleMd5ToMap(file2) != 0) {
            String str4 = this.TAG;
            ModelValidityCode modelValidityCode3 = ModelValidityCode.VALIDITY_OK;
            YtLogger.e(str4, "md5 validity by dir error:READ_MD5_ERROR", null);
            return ModelValidityCode.READ_MD5_ERROR;
        }
        int iTraverseFolder = traverseFolder(file);
        if (iTraverseFolder == -1) {
            String str5 = this.TAG;
            ModelValidityCode modelValidityCode4 = ModelValidityCode.VALIDITY_OK;
            YtLogger.e(str5, "md5 validity by dir error:NOT_FOUND_MODEL_DIR", null);
            return ModelValidityCode.NOT_FOUND_MODEL_DIR;
        }
        if (iTraverseFolder == -2) {
            String str6 = this.TAG;
            ModelValidityCode modelValidityCode5 = ModelValidityCode.VALIDITY_OK;
            YtLogger.e(str6, "md5 validity by dir error:VALIDITY_ERROR", null);
            return ModelValidityCode.VALIDITY_ERROR;
        }
        if (iTraverseFolder == -3) {
            String str7 = this.TAG;
            ModelValidityCode modelValidityCode6 = ModelValidityCode.VALIDITY_OK;
            YtLogger.e(str7, "md5 validity by dir error:TARGET_MD5_NOT_FOUND", null);
            return ModelValidityCode.TARGET_MD5_NOT_FOUND;
        }
        if (iTraverseFolder == -4) {
            String str8 = this.TAG;
            ModelValidityCode modelValidityCode7 = ModelValidityCode.VALIDITY_OK;
            YtLogger.e(str8, "md5 validity by dir error:CREATE_MD5_ERROR", null);
            return ModelValidityCode.CREATE_MD5_ERROR;
        }
        if (iTraverseFolder != -5) {
            YtLogger.d(this.TAG, "md5 validity by dir ok");
            return ModelValidityCode.VALIDITY_OK;
        }
        String str9 = this.TAG;
        ModelValidityCode modelValidityCode8 = ModelValidityCode.VALIDITY_OK;
        YtLogger.e(str9, "md5 validity by dir error:MODEL_FILE_MISS", null);
        return ModelValidityCode.MODEL_FILE_MISS;
    }
}
