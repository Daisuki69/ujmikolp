package mx_android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.IntentSender;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.fChUQ4;
import mx_android.support.v4.media.MediaDescriptionCompat;
import mx_android.support.v4.media.MediaMetadataCompat;
import mx_android.support.v4.media.session.MediaControllerCompat;
import mx_android.support.v4.media.session.MediaSessionCompat;
import mx_android.support.v4.media.session.PlaybackStateCompat;
import mx_android.support.v7.media.MediaRouteSelector;
import mx_android.support.v7.media.MediaRouter;
import mx_android.support.v7.mediarouter.R;

/* JADX INFO: loaded from: classes7.dex */
public class MediaRouteControllerDialog extends Dialog {
    private static final String TAG = "MediaRouteControllerDialog";
    private ImageView mArtView;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private View mControlView;
    private MediaControllerCallback mControllerCallback;
    private boolean mCreated;
    private Drawable mCurrentIconDrawable;
    private MediaDescriptionCompat mDescription;
    private Button mDisconnectButton;
    private MediaControllerCompat mMediaController;
    private Drawable mMediaRouteConnectingDrawable;
    private Drawable mMediaRouteOnDrawable;
    private ImageButton mPlayPauseButton;
    private final MediaRouter.RouteInfo mRoute;
    private TextView mRouteNameView;
    private final MediaRouter mRouter;
    private ImageButton mSettingsButton;
    private Drawable mSettingsDrawable;
    private PlaybackStateCompat mState;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private TextView mTitleView;
    private View mTitlesWrapper;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            fChUQ4.onUserInteraction();
        }
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.dispatchTouchEvent(motionEvent);
    }

    public View onCreateMediaControlView(Bundle bundle) {
        return null;
    }

    public MediaRouteControllerDialog(Context context) {
        this(context, 0);
    }

    public MediaRouteControllerDialog(Context context, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context), i);
        Context context2 = getContext();
        this.mControllerCallback = new MediaControllerCallback();
        MediaRouter mediaRouter = MediaRouter.getInstance(context2);
        this.mRouter = mediaRouter;
        this.mCallback = new MediaRouterCallback();
        this.mRoute = mediaRouter.getSelectedRoute();
        setMediaSession(mediaRouter.getMediaSessionToken());
    }

    public MediaRouter.RouteInfo getRoute() {
        return this.mRoute;
    }

    public View getMediaControlView() {
        return this.mControlView;
    }

    private void setMediaSession(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.mControllerCallback);
            this.mMediaController = null;
        }
        if (token != null && this.mAttachedToWindow) {
            try {
                this.mMediaController = new MediaControllerCompat(getContext(), token);
            } catch (RemoteException e) {
                Log.e(TAG, "Error creating media controller in setMediaSession.", e);
            }
            MediaControllerCompat mediaControllerCompat2 = this.mMediaController;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.registerCallback(this.mControllerCallback);
            }
            MediaControllerCompat mediaControllerCompat3 = this.mMediaController;
            MediaMetadataCompat metadata = mediaControllerCompat3 == null ? null : mediaControllerCompat3.getMetadata();
            this.mDescription = metadata == null ? null : metadata.getDescription();
            MediaControllerCompat mediaControllerCompat4 = this.mMediaController;
            this.mState = mediaControllerCompat4 != null ? mediaControllerCompat4.getPlaybackState() : null;
            update();
        }
    }

    public MediaSessionCompat.Token getMediaSession() {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        if (mediaControllerCompat == null) {
            return null;
        }
        return mediaControllerCompat.getSessionToken();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        setContentView(R.layout.mr_media_route_controller_material_dialog_b);
        ClickListener clickListener = new ClickListener();
        Button button = (Button) findViewById(R.id.disconnect);
        this.mDisconnectButton = button;
        button.setOnClickListener(clickListener);
        Button button2 = (Button) findViewById(R.id.stop);
        this.mStopCastingButton = button2;
        button2.setOnClickListener(clickListener);
        ImageButton imageButton = (ImageButton) findViewById(R.id.settings);
        this.mSettingsButton = imageButton;
        imageButton.setOnClickListener(clickListener);
        this.mArtView = (ImageView) findViewById(R.id.art);
        this.mTitleView = (TextView) findViewById(R.id.title);
        this.mSubtitleView = (TextView) findViewById(R.id.subtitle);
        this.mTitlesWrapper = findViewById(R.id.text_wrapper);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.play_pause);
        this.mPlayPauseButton = imageButton2;
        imageButton2.setOnClickListener(clickListener);
        this.mRouteNameView = (TextView) findViewById(R.id.route_name);
        this.mCreated = true;
        if (update()) {
            this.mControlView = onCreateMediaControlView(bundle);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.media_route_control_frame);
            if (this.mControlView != null) {
                frameLayout.findViewById(R.id.default_control_frame).setVisibility(8);
                frameLayout.addView(this.mControlView);
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(MediaRouteSelector.EMPTY, this.mCallback, 2);
        setMediaSession(this.mRouter.getMediaSessionToken());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mRouter.removeCallback(this.mCallback);
        setMediaSession(null);
        this.mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            this.mRoute.requestUpdateVolume(i == 25 ? -1 : 1);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean update() {
        boolean z4;
        if (!this.mRoute.isSelected() || this.mRoute.isDefault()) {
            dismiss();
            return false;
        }
        if (!this.mCreated) {
            return false;
        }
        this.mRouteNameView.setText(this.mRoute.getName());
        if (this.mRoute.canDisconnect()) {
            this.mDisconnectButton.setVisibility(0);
        } else {
            this.mDisconnectButton.setVisibility(8);
        }
        if (this.mRoute.getSettingsIntent() != null) {
            this.mSettingsButton.setVisibility(0);
        } else {
            this.mSettingsButton.setVisibility(8);
        }
        if (this.mControlView == null) {
            MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
            if (mediaDescriptionCompat != null) {
                if (mediaDescriptionCompat.getIconBitmap() != null) {
                    this.mArtView.setImageBitmap(this.mDescription.getIconBitmap());
                    this.mArtView.setVisibility(0);
                } else if (this.mDescription.getIconUri() != null) {
                    this.mArtView.setImageURI(this.mDescription.getIconUri());
                    this.mArtView.setVisibility(0);
                } else {
                    this.mArtView.setImageDrawable(null);
                    this.mArtView.setVisibility(8);
                }
                CharSequence title = this.mDescription.getTitle();
                if (!TextUtils.isEmpty(title)) {
                    this.mTitleView.setText(title);
                    z4 = true;
                } else {
                    this.mTitleView.setText((CharSequence) null);
                    this.mTitleView.setVisibility(8);
                    z4 = false;
                }
                if (!TextUtils.isEmpty(this.mDescription.getSubtitle())) {
                    this.mSubtitleView.setText(this.mDescription.getSubtitle());
                    z4 = true;
                } else {
                    this.mSubtitleView.setText((CharSequence) null);
                    this.mSubtitleView.setVisibility(8);
                }
                if (!z4) {
                    this.mTitlesWrapper.setVisibility(8);
                } else {
                    this.mTitlesWrapper.setVisibility(0);
                }
            } else {
                this.mArtView.setVisibility(8);
                this.mTitlesWrapper.setVisibility(8);
            }
            PlaybackStateCompat playbackStateCompat = this.mState;
            if (playbackStateCompat != null) {
                boolean z5 = playbackStateCompat.getState() == 6 || this.mState.getState() == 3;
                boolean z8 = (this.mState.getActions() & 516) != 0;
                boolean z9 = (this.mState.getActions() & 514) != 0;
                if (z5 && z9) {
                    this.mPlayPauseButton.setVisibility(0);
                    this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(getContext(), R.attr.mediaRoutePauseDrawable));
                    this.mPlayPauseButton.setContentDescription(getContext().getResources().getText(R.string.mr_media_route_controller_pause));
                } else if (!z5 && z8) {
                    this.mPlayPauseButton.setVisibility(0);
                    this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(getContext(), R.attr.mediaRoutePlayDrawable));
                    this.mPlayPauseButton.setContentDescription(getContext().getResources().getText(R.string.mr_media_route_controller_play));
                } else {
                    this.mPlayPauseButton.setVisibility(8);
                }
            } else {
                this.mPlayPauseButton.setVisibility(8);
            }
        }
        return true;
    }

    private Drawable getIconDrawable() {
        if (this.mRoute.isConnecting()) {
            if (this.mMediaRouteConnectingDrawable == null) {
                this.mMediaRouteConnectingDrawable = MediaRouterThemeHelper.getThemeDrawable(getContext(), R.attr.mediaRouteConnectingDrawable);
            }
            return this.mMediaRouteConnectingDrawable;
        }
        if (this.mMediaRouteOnDrawable == null) {
            this.mMediaRouteOnDrawable = MediaRouterThemeHelper.getThemeDrawable(getContext(), R.attr.mediaRouteOnDrawable);
        }
        return this.mMediaRouteOnDrawable;
    }

    private final class MediaRouterCallback extends MediaRouter.Callback {
        private MediaRouterCallback() {
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouter.RouteInfo unused = MediaRouteControllerDialog.this.mRoute;
        }
    }

    private final class MediaControllerCallback extends MediaControllerCompat.Callback {
        private MediaControllerCallback() {
        }

        @Override // mx_android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            if (MediaRouteControllerDialog.this.mMediaController != null) {
                MediaRouteControllerDialog.this.mMediaController.unregisterCallback(MediaRouteControllerDialog.this.mControllerCallback);
                MediaRouteControllerDialog.this.mMediaController = null;
            }
        }

        @Override // mx_android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            MediaRouteControllerDialog.this.mState = playbackStateCompat;
            MediaRouteControllerDialog.this.update();
        }

        @Override // mx_android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaRouteControllerDialog.this.mDescription = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            MediaRouteControllerDialog.this.update();
        }
    }

    private final class ClickListener implements View.OnClickListener {
        private ClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentSender settingsIntent;
            int id = view.getId();
            if (id == R.id.stop || id == R.id.disconnect) {
                if (MediaRouteControllerDialog.this.mRoute.isSelected()) {
                    MediaRouteControllerDialog.this.mRouter.unselect(id == R.id.stop ? 2 : 1);
                }
                MediaRouteControllerDialog.this.dismiss();
                return;
            }
            if (id == R.id.play_pause) {
                if (MediaRouteControllerDialog.this.mMediaController == null || MediaRouteControllerDialog.this.mState == null) {
                    return;
                }
                if (MediaRouteControllerDialog.this.mState.getState() == 3) {
                    MediaRouteControllerDialog.this.mMediaController.getTransportControls().pause();
                    return;
                } else {
                    MediaRouteControllerDialog.this.mMediaController.getTransportControls().play();
                    return;
                }
            }
            if (id != R.id.settings || (settingsIntent = MediaRouteControllerDialog.this.mRoute.getSettingsIntent()) == null) {
                return;
            }
            try {
                settingsIntent.sendIntent(null, 0, null, null, null);
                MediaRouteControllerDialog.this.dismiss();
            } catch (Exception e) {
                Log.e(MediaRouteControllerDialog.TAG, "Error opening route settings.", e);
            }
        }
    }
}
