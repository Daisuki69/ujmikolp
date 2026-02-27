package com.tencent.could.component.common.ai.clipphoto;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.tencent.could.component.common.ai.utils.ImageCompressUtils;
import com.tencent.could.component.common.ai.utils.ThreadPoolUtil;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ClipPhotoHolder {
    public static final int COMPASS_IMAGE_MAX_SIZE = 1024;
    public static final int REQUEST_CODE_CLIP_PHOTO = 3000;
    public static final int REQUEST_CODE_SELECT_PHOTO = 2000;
    public static final String TAG = "ClipPhotoHolder";
    public File cacheCropFile;
    public boolean isNeedClip;
    public ClipPhotoEventListener listener;
    public Uri uriTempFile;
    public boolean isReturnOnlyUri = false;
    public int compassImageSize = 1024;
    public int compressLevel = 1;
    public Point minPhotoSize = null;

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] compressFromBitMapCheckDegree(Activity activity) {
        String path = ImageCompressUtils.getPath(activity, this.uriTempFile);
        int bitmapDegree = !TextUtils.isEmpty(path) ? ImageCompressUtils.getBitmapDegree(path) : 0;
        Point point = this.minPhotoSize;
        if (point != null && (bitmapDegree == 90 || bitmapDegree == 270)) {
            Point point2 = this.minPhotoSize;
            point = new Point(point2.y, point2.x);
        }
        Bitmap bitmapRotateBitmapByDegree = ImageCompressUtils.rotateBitmapByDegree(ImageCompressUtils.createBitMapByUri(activity, this.uriTempFile, this.compressLevel, point), bitmapDegree);
        byte[] bArrCompressBitmap = ImageCompressUtils.compressBitmap(bitmapRotateBitmapByDegree, this.compassImageSize, this.compressLevel);
        if (bitmapRotateBitmapByDegree != null) {
            bitmapRotateBitmapByDegree.recycle();
        }
        return bArrCompressBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] compressFromBitMapDoNotNeedCheckDegree(Activity activity) {
        Bitmap bitmapCreateBitMapByUri = ImageCompressUtils.createBitMapByUri(activity, this.uriTempFile, this.compressLevel, this.minPhotoSize);
        byte[] bArrCompressBitmap = ImageCompressUtils.compressBitmap(bitmapCreateBitMapByUri, this.compassImageSize, this.compressLevel);
        if (bitmapCreateBitMapByUri != null) {
            bitmapCreateBitMapByUri.recycle();
        }
        return bArrCompressBitmap;
    }

    private void dealWithAfterClipPhoto(final Activity activity, final boolean z4) {
        ClipPhotoEventListener clipPhotoEventListener = this.listener;
        if (clipPhotoEventListener != null) {
            clipPhotoEventListener.doStartCompressImage();
        }
        ThreadPoolUtil.getInstance().addWork(new Runnable() { // from class: com.tencent.could.component.common.ai.clipphoto.ClipPhotoHolder.1
            @Override // java.lang.Runnable
            public void run() {
                byte[] bArrCompressFromBitMapDoNotNeedCheckDegree;
                try {
                    if (ClipPhotoHolder.this.uriTempFile == null) {
                        ClipPhotoHolder.this.sendClipDismissPhotoError("get image data is null！");
                        return;
                    }
                    try {
                        bArrCompressFromBitMapDoNotNeedCheckDegree = z4 ? ClipPhotoHolder.this.compressFromBitMapDoNotNeedCheckDegree(activity) : ClipPhotoHolder.this.compressFromBitMapCheckDegree(activity);
                    } catch (Exception e) {
                        Log.e(ClipPhotoHolder.TAG, "e: " + e.getLocalizedMessage());
                        ClipPhotoHolder.this.sendClipDismissPhotoError("clip error!");
                    }
                    if (bArrCompressFromBitMapDoNotNeedCheckDegree == null) {
                        ClipPhotoHolder.this.sendClipDismissPhotoError("clip error! bitmapBytes is null");
                        FileUtils.deleteFile(ClipPhotoHolder.this.cacheCropFile);
                    } else {
                        ClipPhotoHolder.this.sendSelectImageStr(Base64.encodeToString(bArrCompressFromBitMapDoNotNeedCheckDegree, 2));
                        FileUtils.deleteFile(ClipPhotoHolder.this.cacheCropFile);
                    }
                } catch (Throwable th2) {
                    FileUtils.deleteFile(ClipPhotoHolder.this.cacheCropFile);
                    throw th2;
                }
            }
        });
    }

    private void dealWithSelectPhotos(Activity activity, Intent intent) {
        ClipPhotoEventListener clipPhotoEventListener;
        if (intent == null) {
            Log.e(TAG, "user cancel select photo!");
            sendClipDismissPhotoError("user cancel select photo!");
            return;
        }
        if (!this.isNeedClip) {
            if (!this.isReturnOnlyUri || (clipPhotoEventListener = this.listener) == null) {
                sendOnlySelectPhoto(activity, intent);
                return;
            } else {
                clipPhotoEventListener.getSelectPhotoUri(intent.getData());
                return;
            }
        }
        File fileCreateImageFile = FileUtils.createImageFile(activity, true);
        this.cacheCropFile = fileCreateImageFile;
        if (fileCreateImageFile == null) {
            Log.e(TAG, "cacheCropFile is null!");
            sendOnlySelectPhoto(activity, intent);
            return;
        }
        Intent intent2 = new Intent("com.android.camera.action.CROP");
        intent2.addFlags(1);
        intent2.addFlags(2);
        intent2.putExtra("crop", "true");
        intent2.putExtra("scale ", true);
        intent2.putExtra("return-data", false);
        intent2.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent2.setDataAndType(intent.getData(), "image/*");
        if (Build.VERSION.SDK_INT >= 30) {
            Uri uri = FileUtils.uri;
            this.uriTempFile = uri;
            intent2.putExtra("output", uri);
        } else {
            Uri uriFromFile = Uri.fromFile(this.cacheCropFile);
            this.uriTempFile = uriFromFile;
            intent2.putExtra("output", uriFromFile);
        }
        try {
            activity.startActivityForResult(intent2, 3000);
        } catch (Exception e) {
            Log.e(TAG, "start clip error: " + e.getLocalizedMessage());
            sendOnlySelectPhoto(activity, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendClipDismissPhotoError(String str) {
        ClipPhotoEventListener clipPhotoEventListener = this.listener;
        if (clipPhotoEventListener != null) {
            clipPhotoEventListener.sendClipPhotoError(str);
        }
    }

    private void sendOnlySelectPhoto(Activity activity, Intent intent) {
        this.uriTempFile = intent.getData();
        dealWithAfterClipPhoto(activity, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSelectImageStr(String str) {
        ClipPhotoEventListener clipPhotoEventListener = this.listener;
        if (clipPhotoEventListener != null) {
            clipPhotoEventListener.sendBitmapWithBase64(str);
        }
    }

    public void onActivityResult(Activity activity, int i, int i4, Intent intent) {
        if (activity == null) {
            Log.e(TAG, "onActivityResult: activity is null");
            return;
        }
        if (i == 2000) {
            if (i4 == -1) {
                dealWithSelectPhotos(activity, intent);
            } else {
                Log.e(TAG, "select photo error code: " + i);
                sendClipDismissPhotoError("select photo error code: " + i4);
            }
        }
        if (i == 3000) {
            if (i4 == -1) {
                dealWithAfterClipPhoto(activity, true);
                return;
            }
            Log.e(TAG, "clip error code: " + i4);
            sendClipDismissPhotoError("clip error code: " + i4);
        }
    }

    public void release() {
        if (this.listener != null) {
            this.listener = null;
        }
    }

    public void setClipPhotoEventListener(ClipPhotoEventListener clipPhotoEventListener) {
        this.listener = clipPhotoEventListener;
    }

    public void setCompressImageSize(Point point) {
        this.minPhotoSize = point;
    }

    public void setCompressLevel(int i) {
        this.compressLevel = i;
    }

    public void setReturnOnlyUri(boolean z4) {
        this.isReturnOnlyUri = z4;
    }

    public void startSelectAlbum(Activity activity, boolean z4) {
        startSelectAlbum(activity, z4, 1024);
    }

    public void startSelectAlbum(Activity activity, boolean z4, int i) {
        if (activity == null) {
            Log.e(TAG, "start activity is null!");
            sendClipDismissPhotoError("activity is null");
            return;
        }
        this.compassImageSize = i;
        this.isNeedClip = z4;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.PICK");
        intent.setType("image/*");
        activity.startActivityForResult(intent, 2000);
    }
}
