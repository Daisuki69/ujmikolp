package org.opencv.core;

import lk.b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Core {
    public static String a() {
        return getBuildInformation_0();
    }

    public static void b(Mat mat, b bVar, b bVar2) {
        meanStdDev_1(mat.f18918a, bVar.f18918a, bVar2.f18918a);
    }

    private static native String getBuildInformation_0();

    private static native void meanStdDev_1(long j, long j6, long j7);
}
