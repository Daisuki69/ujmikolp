package mx_android.support.v7.app;

/* JADX INFO: loaded from: classes7.dex */
public class MediaRouteDialogFactory {
    private static final MediaRouteDialogFactory sDefault = new MediaRouteDialogFactory();

    public static MediaRouteDialogFactory getDefault() {
        return sDefault;
    }

    public MediaRouteChooserDialogFragment onCreateChooserDialogFragment() {
        return new MediaRouteChooserDialogFragment();
    }

    public MediaRouteControllerDialogFragment onCreateControllerDialogFragment() {
        return new MediaRouteControllerDialogFragment();
    }
}
