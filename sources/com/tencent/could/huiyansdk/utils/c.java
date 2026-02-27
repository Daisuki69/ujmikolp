package com.tencent.could.huiyansdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.paymaya.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.HostEntity;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, HostEntity> f15730a = new a();

    public static class a extends HashMap<String, HostEntity> {
        public a() {
            put("00", new HostEntity.Builder().mainHost("liveness-hk.faceid.qq.com").secondHost("liveness-hk.faceid.qq.com").backupIp("").build());
            put("01", new HostEntity.Builder().mainHost("liveness-sg.faceid.qq.com").secondHost("ekyc-sg.faceid.qcloud.com").backupIp("").build());
            put("02", new HostEntity.Builder().mainHost("liveness-id.faceid.qq.com").secondHost("liveness-id.faceid.qq.com").backupIp("").build());
            put("03", new HostEntity.Builder().mainHost("liveness-tha.faceid.qq.com").secondHost("liveness-tha.faceid.qq.com").backupIp("").build());
            put("04", new HostEntity.Builder().mainHost("liveness-bom.faceid.qq.com").secondHost("liveness-bom.faceid.qq.com").backupIp("").build());
            put("05", new HostEntity.Builder().mainHost("liveness-sel.faceid.qq.com").secondHost("liveness-sel.faceid.qq.com").backupIp("").build());
            put("06", new HostEntity.Builder().mainHost("liveness-tyo.faceid.qq.com").secondHost("liveness-tyo.faceid.qq.com").backupIp("").build());
            put("07", new HostEntity.Builder().mainHost("liveness-fra.faceid.qq.com").secondHost("liveness-fra.faceid.qq.com").backupIp("").build());
            put("08", new HostEntity.Builder().mainHost("liveness-mow.faceid.qq.com").secondHost("liveness-mow.faceid.qq.com").backupIp("").build());
            put("09", new HostEntity.Builder().mainHost("liveness-asb.faceid.qq.com").secondHost("liveness-asb.faceid.qq.com").backupIp("").build());
            put("10", new HostEntity.Builder().mainHost("liveness-sv.faceid.qq.com").secondHost("liveness-sv.faceid.qq.com").backupIp("").build());
            put("11", new HostEntity.Builder().mainHost("liveness-yyz.faceid.qq.com").secondHost("liveness-yyz.faceid.qq.com").backupIp("").build());
            put("12", new HostEntity.Builder().mainHost("liveness-sao.faceid.qq.com").secondHost("liveness-sao.faceid.qq.com").backupIp("").build());
            put("13", new HostEntity.Builder().mainHost("liveness-mys.faceid.qq.com").secondHost("liveness-mys.faceid.qq.com").backupIp("").build());
        }
    }

    public static String a(int i) {
        Context contextA = j.a.f15618a.a();
        if (contextA == null) {
            contextA = HuiYanBaseApi.a.f15622a.a();
        }
        return contextA.getResources().getString(i);
    }

    public static String b(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        if (TextUtils.isEmpty(str)) {
            e.a.f15688a.a(2, "HYOConstUtils", "file path is empty!");
            return "";
        }
        File file = new File(str);
        if (!file.exists()) {
            e.a.f15688a.a(2, "HYOConstUtils", "file is not exists!");
            return "";
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
                try {
                    bArr = new byte[1024];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i = bufferedInputStream.read(bArr, 0, 1024);
                if (-1 == i) {
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return strEncodeToString;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            e.a.f15688a.a(2, "HYOConstUtils", "create video base64 error: " + e.getLocalizedMessage());
            return "";
        }
    }

    public static String a(String str) {
        String currentToken = HuiYanOsApiImp.getInstance().getCurrentToken();
        return !TextUtils.isEmpty(currentToken) ? androidx.camera.core.impl.a.j(str, "?token=", currentToken) : str;
    }

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo.State state;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || !e.a(context, new String[]{"android.permission.READ_PHONE_STATE"}) || !e.a(context, new String[]{"android.permission.ACCESS_NETWORK_STATE"})) {
            return "";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTING || state == NetworkInfo.State.CONNECTED)) {
            return "WI-FI";
        }
        try {
            int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
            if (networkType == 20) {
                return "5G";
            }
            switch (networkType) {
            }
            return "";
        }
    }

    public static AnimationDrawable a(Resources resources) {
        if (resources == null) {
            return null;
        }
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_00, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_01, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_02, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_03, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_04, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_05, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_06, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_07, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_08, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_09, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_10, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_11, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_12, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_13, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_14, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_15, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_16, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_17, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_18, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_19, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_20, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_21, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_22, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_23, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_24, null), 120);
        animationDrawable.addFrame(VectorDrawableCompat.create(resources, R.drawable.txy_huiyan_loading_result_25, null), 120);
        return animationDrawable;
    }
}
