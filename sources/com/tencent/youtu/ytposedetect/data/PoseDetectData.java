package com.tencent.youtu.ytposedetect.data;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes4.dex */
public class PoseDetectData {
    public int faceDetectStatus;
    public int faceQualityStatus;
    public Rect faceRect;
    public float[] faceShape;
    public float[] faceVisible;
    public int frameH;
    public int frameW;
    public byte[] imgData;
    public boolean isFaceShaking;
    public float pitch;
    public int postType;
    public float roll;
    public float yaw;

    public PoseDetectData(float[] fArr, float[] fArr2, int i, byte[] bArr, float f, float f3, float f7, int i4, int i6, Rect rect, int i10, int i11, boolean z4) {
        this.faceShape = fArr;
        this.faceVisible = fArr2;
        this.postType = i;
        this.imgData = bArr;
        this.pitch = f;
        this.yaw = f3;
        this.roll = f7;
        this.faceDetectStatus = i4;
        this.faceQualityStatus = i6;
        this.faceRect = rect;
        this.frameW = i10;
        this.frameH = i11;
        this.isFaceShaking = z4;
    }
}
