package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static SessionProcessor a(CameraConfig cameraConfig) {
        return (SessionProcessor) cameraConfig.retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR);
    }

    public static SessionProcessor b(CameraConfig cameraConfig, SessionProcessor sessionProcessor) {
        return (SessionProcessor) cameraConfig.retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
    }

    public static int c(CameraConfig cameraConfig) {
        return ((Integer) cameraConfig.retrieveOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue();
    }

    public static UseCaseConfigFactory d(CameraConfig cameraConfig) {
        return (UseCaseConfigFactory) cameraConfig.retrieveOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE);
    }

    public static boolean e(CameraConfig cameraConfig) {
        return ((Boolean) cameraConfig.retrieveOption(CameraConfig.OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, Boolean.FALSE)).booleanValue();
    }

    public static boolean f(CameraConfig cameraConfig) {
        return ((Boolean) cameraConfig.retrieveOption(CameraConfig.OPTION_POSTVIEW_SUPPORTED, Boolean.FALSE)).booleanValue();
    }
}
