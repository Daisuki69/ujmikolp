package org.opencv.imgcodecs;

import org.opencv.core.Mat;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Imgcodecs {
    public static Mat a(String str) {
        return new Mat(imread_0(str, 1));
    }

    private static native long imread_0(String str, int i);
}
