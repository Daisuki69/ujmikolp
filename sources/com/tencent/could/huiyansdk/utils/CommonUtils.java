package com.tencent.could.huiyansdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.tencent.could.component.common.ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.LiveDataCheckResult;
import com.tencent.could.huiyansdk.enums.HuiYanAction;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.manager.a;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.a;
import com.tencent.could.huiyansdk.utils.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtils {

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15725a;

        public a(String str) {
            this.f15725a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.f15725a);
            if (file.exists() && !file.delete()) {
                e.a.f15688a.a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "delete file error， path:" + this.f15725a);
            }
        }
    }

    public static boolean a(boolean z4, String[] strArr) {
        e.a.f15688a.a(1, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "contain action or not: " + z4);
        if (!z4) {
            return true;
        }
        for (String str : strArr) {
            String[] strArrSplit = str.split("=");
            if (strArrSplit.length == 2 && "action_data".equals(strArrSplit[0])) {
                for (String str2 : strArrSplit[1].split(",")) {
                    if (!"5".equals(str2.trim())) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static String base64DecodeToString(String str) {
        return new String(Base64.decode(str, 2));
    }

    public static String base64EncodeToString(String str) {
        return new String(Base64.encode(str.getBytes(), 2));
    }

    public static TwoTuple calculateTuringErrorCode(long j) {
        int i = (int) (j / (-100000));
        return new TwoTuple(Integer.valueOf(i), Integer.valueOf((int) (j % ((long) ((-100000) * i)))));
    }

    public static int[] changeActions(HuiYanAction[] huiYanActionArr) {
        if (huiYanActionArr == null || huiYanActionArr.length == 0) {
            return null;
        }
        int[] iArr = new int[huiYanActionArr.length];
        for (int i = 0; i < huiYanActionArr.length; i++) {
            int iOrdinal = huiYanActionArr[i].ordinal();
            int i4 = 2;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i4 = 4;
                    if (iOrdinal != 3) {
                        i4 = iOrdinal != 4 ? 1 : 5;
                    }
                } else {
                    i4 = 3;
                }
            }
            iArr[i] = i4;
        }
        return iArr;
    }

    public static LiveDataCheckResult checkHaveColorData(String str) {
        LiveDataCheckResult liveDataCheckResult = new LiveDataCheckResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("select_data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("select_data");
                if (jSONObject2.has("config")) {
                    String[] strArrSplit = jSONObject2.getString("config").split("&");
                    boolean z4 = false;
                    for (String str2 : strArrSplit) {
                        String[] strArrSplit2 = str2.split("=");
                        if (strArrSplit2.length == 2 && "actref_ux_mode".equals(strArrSplit2[0])) {
                            if ("0".equals(strArrSplit2[1]) || IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strArrSplit2[1])) {
                                liveDataCheckResult.setHaveColorData(true);
                            } else {
                                liveDataCheckResult.setHaveColorData(false);
                            }
                            z4 = !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strArrSplit2[1]);
                        }
                    }
                    liveDataCheckResult.setNoAction(a(z4, strArrSplit));
                    return liveDataCheckResult;
                }
            }
        } catch (NullPointerException e) {
            e = e;
            e.a.f15688a.a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "check have color data json exception: " + e.getLocalizedMessage());
            e.printStackTrace();
        } catch (JSONException e7) {
            e = e7;
            e.a.f15688a.a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "check have color data json exception: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
        return liveDataCheckResult;
    }

    public static byte[] clipNV21(byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12) {
        if (i6 % 2 == 1) {
            i6--;
        }
        if (i10 % 2 == 1) {
            i10--;
        }
        int i13 = i10 + i12;
        int i14 = ((i11 * i12) * 3) / 2;
        byte[] bArrA = a.C0086a.f15727a.a();
        if (bArrA == null) {
            bArrA = new byte[i14];
        }
        for (int i15 = i10; i15 < i13; i15++) {
            System.arraycopy(bArr, (i15 * i) + i6, bArrA, (i15 - i10) * i11, i11);
        }
        int i16 = (i10 / 2) + i4;
        int i17 = (i13 / 2) + i4;
        for (int i18 = i16; i18 < i17; i18++) {
            System.arraycopy(bArr, (i18 * i) + i6, bArrA, ((i18 - i16) + i12) * i11, i11);
        }
        return bArrA;
    }

    public static void closeCurrentFragment() {
        try {
            BaseFragment baseFragmentA = a.C0083a.f15662a.a();
            if (baseFragmentA != null) {
                baseFragmentA.runOnUiThread(new vf.b(baseFragmentA, 0));
            }
        } catch (Exception e) {
            e.a.f15688a.a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "close current fragment error! e" + e.getLocalizedMessage());
        }
    }

    public static boolean copyFile(String str, String str2) {
        FileOutputStream fileOutputStream;
        byte[] bArr;
        if (!new File(str).exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    bArr = new byte[1024];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Exception unused) {
            e.a.f15688a.a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "copy video error.");
            return false;
        }
    }

    public static void deleteFileByPath(String str) {
        i.a.f15743a.a(new a(str));
    }

    public static int dpToPx(View view, float f) {
        return Math.round(view.getResources().getDisplayMetrics().density * f);
    }

    public static Context getContext() {
        Context contextA = j.a.f15618a.a();
        return contextA == null ? HuiYanBaseApi.a.f15622a.a() : contextA;
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(null)) {
            return "";
        }
        throw null;
    }

    public static void saveDataToFile(final byte[] bArr, final int i, final int i4, final String str) {
        i.a.f15743a.a(new Runnable() { // from class: vf.a
            @Override // java.lang.Runnable
            public final void run() {
                CommonUtils.a(bArr, i, i4, str);
            }
        });
    }

    public static void sendErrorAndExitAuth(int i, String str) {
        BaseFragment baseFragmentA = a.C0083a.f15662a.a();
        if (baseFragmentA != null) {
            baseFragmentA.runOnUiThread(new vf.b(baseFragmentA, 1));
        }
        j.a.f15618a.a(i, str);
    }

    public static void a(byte[] bArr, int i, int i4, String str) {
        File file = new File("/mnt/sdcard/Camera");
        if (!file.exists()) {
            file.mkdir();
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i4, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i4), 50, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap bitmapDecodeByteArray = byteArray != null ? BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArray.length) : null;
        try {
            if (bitmapDecodeByteArray == null) {
                e.a.f15688a.a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "bmp is null!");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(String.format("/mnt/sdcard/Camera/%s_%d_%s_%s.jpg", str, Long.valueOf(System.currentTimeMillis()), String.valueOf(i), String.valueOf(i4)));
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
