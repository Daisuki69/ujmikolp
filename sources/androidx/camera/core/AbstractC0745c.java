package androidx.camera.core;

/* JADX INFO: renamed from: androidx.camera.core.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0745c {
    public static boolean a(Camera camera, boolean z4, UseCase... useCaseArr) {
        return true;
    }

    public static boolean b(Camera camera, UseCase... useCaseArr) {
        return camera.isUseCasesCombinationSupported(true, useCaseArr);
    }

    public static boolean c(Camera camera, UseCase... useCaseArr) {
        return camera.isUseCasesCombinationSupported(false, useCaseArr);
    }
}
