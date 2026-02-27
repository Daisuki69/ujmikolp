package com.tencent.youtu.ytposedetect.data;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes4.dex */
public class YTFaceDistanceDetectData {
    public float detectScore;
    public FrameData[] frameList;
    public Rect[] processRect;

    public class FrameData {
        public float areaRatio;
        public float[] faceAlign;
        public ImageData img;
        public float iou;
        public int rectH;
        public int rectW;
        public int rectX;
        public int rectY;
        public long timestamp;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f16038x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f16039y;

        public FrameData() {
        }
    }

    public class ImageData {
        public int height;
        public byte[] rgb;
        public int width;

        public ImageData() {
        }
    }
}
