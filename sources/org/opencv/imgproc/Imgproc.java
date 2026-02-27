package org.opencv.imgproc;

import org.opencv.core.Mat;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Imgproc {
    private static native void Laplacian_4(long j, long j6, int i);

    public static void a(Mat mat, Mat mat2) {
        Laplacian_4(mat.f18918a, mat2.f18918a, 6);
    }

    public static void b(Mat mat, Mat mat2) {
        cvtColor_1(mat.f18918a, mat2.f18918a, 6);
    }

    private static native void cvtColor_1(long j, long j6, int i);
}
