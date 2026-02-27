package com.tencent.could.component.common.ai.utils;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ImageCompressUtils {
    public static final int DEFAULT_LEVEL = 1;
    public static final int MINIMUM_LEVEL = 2;

    public static byte[] compressBitmap(Bitmap bitmap, int i, int i4) {
        int i6;
        int i10;
        if (i4 == 2) {
            i10 = i;
            i6 = 5;
        } else {
            i6 = 10;
            i10 = 1024;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                int i11 = 85;
                bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                while (byteArrayOutputStream.toByteArray().length / 1024 > i10 && i11 > 5) {
                    byteArrayOutputStream.reset();
                    i11 -= i6;
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            Log.e("ImageCompressUtils", "compressBitmap io error: " + e.getLocalizedMessage());
            return null;
        }
    }

    public static Bitmap createBitMapByUri(Context context, Uri uri, int i, Point point) {
        int iMin;
        if (i != 2 || point == null) {
            iMin = 2;
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inDither = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
                int i4 = options.outWidth;
                int i6 = options.outHeight;
                int i10 = point.x;
                iMin = Math.min(i4 / i10, i6 / i10);
            } catch (FileNotFoundException e) {
                Log.e("ImageCompressUtils", "getCurrentSampleSize e: " + e.getLocalizedMessage());
                iMin = 2;
            }
            if (iMin > 5) {
                iMin = 5;
            }
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inPreferredConfig = Bitmap.Config.RGB_565;
        if (i == 2) {
            options2.inSampleSize = iMin;
        }
        return BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options2);
    }

    public static byte[] doCompressYuvImage(YuvImage yuvImage, int i) {
        int width = yuvImage.getWidth();
        int height = yuvImage.getHeight();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (i == 1) {
                    yuvImage.compressToJpeg(new Rect(0, 0, width, height), 85, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                if (i != 2) {
                    byteArrayOutputStream.close();
                    return null;
                }
                yuvImage.compressToJpeg(new Rect(0, 0, width, height), 85, byteArrayOutputStream);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inSampleSize = 2;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size(), options);
                byteArrayOutputStream.reset();
                bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray2;
            } finally {
            }
        } catch (IOException unused) {
            Log.e("ImageCompressUtils", "Compress error");
            return null;
        }
    }

    public static int getBitmapDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            Log.e("ImageCompressUtils", "getBitmapDegree error : " + e.getLocalizedMessage());
            return 0;
        }
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th2;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(Global.COLON);
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (isMediaDocument(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(Global.COLON);
                    String str = strArrSplit2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return getDataColumn(context, uri, null, null);
            }
            if (Constants.FILE.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static Bitmap rotateBitmapByDegree(Bitmap bitmap, int i) {
        Bitmap bitmap2;
        Bitmap bitmapCreateBitmap;
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            bitmap2 = bitmap;
        } catch (OutOfMemoryError unused) {
            bitmap2 = bitmap;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused2) {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = bitmap2;
        }
        if (bitmap2 != bitmapCreateBitmap) {
            bitmap2.recycle();
        }
        return bitmapCreateBitmap;
    }
}
