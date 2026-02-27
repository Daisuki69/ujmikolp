package mx_android.support.v7.app;

import android.os.Bundle;
import mx_android.support.v4.app.Fragment;
import mx_android.support.v7.media.MediaRouteSelector;
import mx_android.support.v7.media.MediaRouter;

/* JADX INFO: loaded from: classes7.dex */
public class MediaRouteDiscoveryFragment extends Fragment {
    private final String ARGUMENT_SELECTOR = "selector";
    private MediaRouter.Callback mCallback;
    private MediaRouter mRouter;
    private MediaRouteSelector mSelector;

    public int onPrepareCallbackFlags() {
        return 4;
    }

    public MediaRouter getMediaRouter() {
        ensureRouter();
        return this.mRouter;
    }

    private void ensureRouter() {
        if (this.mRouter == null) {
            this.mRouter = MediaRouter.getInstance(getActivity());
        }
    }

    public MediaRouteSelector getRouteSelector() {
        ensureRouteSelector();
        return this.mSelector;
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
        MediaRouter.Callback callback = this.mCallback;
        if (callback != null) {
            this.mRouter.removeCallback(callback);
            this.mRouter.addCallback(this.mSelector, this.mCallback, onPrepareCallbackFlags());
        }
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

    public MediaRouter.Callback onCreateCallback() {
        return new MediaRouter.Callback() { // from class: mx_android.support.v7.app.MediaRouteDiscoveryFragment.1
        };
    }

    @Override // mx_android.support.v4.app.Fragment
    public void onStart() {
        super.onStart();
        ensureRouteSelector();
        ensureRouter();
        MediaRouter.Callback callbackOnCreateCallback = onCreateCallback();
        this.mCallback = callbackOnCreateCallback;
        if (callbackOnCreateCallback != null) {
            this.mRouter.addCallback(this.mSelector, callbackOnCreateCallback, onPrepareCallbackFlags());
        }
    }

    @Override // mx_android.support.v4.app.Fragment
    public void onStop() {
        MediaRouter.Callback callback = this.mCallback;
        if (callback != null) {
            this.mRouter.removeCallback(callback);
            this.mCallback = null;
        }
        super.onStop();
    }
}
