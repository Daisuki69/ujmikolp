package com.tencent.youtu.sdkkitframework.common;

import We.s;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class YTImageData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15829a = "YTImageData";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f15830b = true;
    public String checksum;
    public int height;
    public byte[] imgData;
    public String imgDataBase64;
    public long timeStamp;
    public int width;

    public YTImageData() {
    }

    public final int[] a(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i = 0;
        int i4 = length % 3 != 0 ? 1 : 0;
        int i6 = (length / 3) + i4;
        int[] iArr = new int[i6];
        if (i4 == 0) {
            while (i < i6) {
                int i10 = i * 3;
                iArr[i] = ((bArr[i10 + 2] << 16) & 16711680) | (bArr[i10] & 255) | ((bArr[i10 + 1] << 8) & 65280) | (-16777216);
                i++;
            }
            return iArr;
        }
        while (true) {
            int i11 = i6 - 1;
            if (i >= i11) {
                iArr[i11] = -16777216;
                return iArr;
            }
            int i12 = i * 3;
            iArr[i] = ((bArr[i12 + 2] << 16) & 16711680) | (bArr[i12] & 255) | ((bArr[i12 + 1] << 8) & 65280) | (-16777216);
            i++;
        }
    }

    public Bitmap bgr2Bitmap() {
        int[] iArrA = a(this.imgData);
        if (!f15830b && iArrA == null) {
            throw new AssertionError();
        }
        int i = this.width;
        return Bitmap.createBitmap(iArrA, 0, i, i, this.height, Bitmap.Config.ARGB_8888);
    }

    public byte[] bgr2JPEG() {
        return bgr2JPEG(100);
    }

    public Object clone() {
        YTImageData yTImageData = new YTImageData();
        yTImageData.imgData = (byte[]) this.imgData.clone();
        yTImageData.width = this.width;
        yTImageData.height = this.height;
        return yTImageData;
    }

    public int getHeight() {
        return this.height;
    }

    public byte[] getImgData() {
        return this.imgData;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImgData(byte[] bArr) {
        this.imgData = bArr;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("img", this.imgData);
            jSONObject.put("checksum", this.checksum);
            return jSONObject;
        } catch (JSONException e) {
            YtLogger.e(f15829a, "video data tojson error", e);
            return new JSONObject();
        }
    }

    public JSONObject toJSON64Img() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("img", this.imgDataBase64);
            jSONObject.put("checksum", this.checksum);
            return jSONObject;
        } catch (JSONException e) {
            YtLogger.e(f15829a, "video data tojson error", e);
            return new JSONObject();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImageData{imgDataSize=");
        sb2.append(this.imgData.length);
        sb2.append(", width=");
        sb2.append(this.width);
        sb2.append(", height=");
        return s.m(sb2, this.height, '}');
    }

    public void writeImg2LocalDisk(Bitmap bitmap, String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FileUtils.createFile(str, str2));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    public Bitmap yuv2Bitmap() {
        YuvImage yuvImage = new YuvImage(this.imgData, 17, this.width, this.height, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 95, byteArrayOutputStream);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        try {
            byteArrayOutputStream.close();
            return bitmapDecodeByteArray;
        } catch (IOException e) {
            YtLogger.e(f15829a, "close error", e);
            return bitmapDecodeByteArray;
        }
    }

    public YTImageData(byte[] bArr, int i, int i4) {
        this.imgData = bArr;
        this.width = i;
        this.height = i4;
    }

    public byte[] bgr2JPEG(int i) {
        int[] iArrA = a((byte[]) this.imgData.clone());
        if (!f15830b && iArrA == null) {
            throw new AssertionError();
        }
        int i4 = this.width;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArrA, 0, i4, i4, this.height, Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            YtLogger.e(f15829a, "close error", e);
            return byteArray;
        }
    }

    public YTImageData(int i, int i4, String str) {
        this.width = i;
        this.height = i4;
        this.imgDataBase64 = str;
    }
}
