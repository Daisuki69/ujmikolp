package mx_android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import mx_android.support.v4.app.DialogFragment;
import mx_android.support.v7.media.MediaRouteSelector;

/* JADX INFO: loaded from: classes7.dex */
public class MediaRouteChooserDialogFragment extends DialogFragment {
    private final String ARGUMENT_SELECTOR = "selector";
    private MediaRouteSelector mSelector;

    public MediaRouteChooserDialogFragment() {
        setCancelable(true);
    }

    public MediaRouteSelector getRouteSelector() {
        ensureRouteSelector();
        return this.mSelector;
    }

    private void ensureRouteSelector() {
        if (this.mSelector == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mSelector = MediaRouteSelector.fromBundle(arguments.getBundle("selector"));
            }
            if (this.mSelector == null) {
                this.mSelector = MediaRouteSelector.EMPTY;
            }
        }
    }

    public void setRouteSelector(MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        ensureRouteSelector();
        if (this.mSelector.equals(mediaRouteSelector)) {
            return;
        }
        this.mSelector = mediaRouteSelector;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", mediaRouteSelector.asBundle());
        setArguments(arguments);
        MediaRouteChooserDialog mediaRouteChooserDialog = (MediaRouteChooserDialog) getDialog();
        if (mediaRouteChooserDialog != null) {
            mediaRouteChooserDialog.setRouteSelector(mediaRouteSelector);
        }
    }

    public MediaRouteChooserDialog onCreateChooserDialog(Context context, Bundle bundle) {
        return new MediaRouteChooserDialog(context);
    }

    @Override // mx_android.support.v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        MediaRouteChooserDialog mediaRouteChooserDialogOnCreateChooserDialog = onCreateChooserDialog(getActivity(), bundle);
        mediaRouteChooserDialogOnCreateChooserDialog.setRouteSelector(getRouteSelector());
        return mediaRouteChooserDialogOnCreateChooserDialog;
    }
}
