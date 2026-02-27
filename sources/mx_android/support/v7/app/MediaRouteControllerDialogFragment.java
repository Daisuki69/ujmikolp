package mx_android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import mx_android.support.v4.app.DialogFragment;

/* JADX INFO: loaded from: classes7.dex */
public class MediaRouteControllerDialogFragment extends DialogFragment {
    public MediaRouteControllerDialogFragment() {
        setCancelable(true);
    }

    public MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle bundle) {
        return new MediaRouteControllerDialog(context);
    }

    @Override // mx_android.support.v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return onCreateControllerDialog(getActivity(), bundle);
    }
}
