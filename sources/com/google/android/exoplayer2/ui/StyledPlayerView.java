package com.google.android.exoplayer2.ui;

import A1.c;
import O1.S;
import Xh.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.InterfaceC1896b;
import n1.InterfaceC1911q;
import n1.y;
import o6.f;
import v1.d;
import w1.AbstractC2366d;
import w1.InterfaceC2363a;
import w1.ViewOnLayoutChangeListenerC2362A;
import w1.j;
import w1.s;
import w1.t;
import w1.z;
import x1.h;
import z1.AbstractC2550e;
import z1.InterfaceC2547b;

/* JADX INFO: loaded from: classes2.dex */
public class StyledPlayerView extends FrameLayout {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int PICTURE_TYPE_NOT_SET = -1;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;

    @Nullable
    private final FrameLayout adOverlayFrameLayout;

    @Nullable
    private final ImageView artworkView;

    @Nullable
    private final View bufferingView;
    private final ViewOnLayoutChangeListenerC2362A componentListener;

    @Nullable
    private final AspectRatioFrameLayout contentFrame;

    @Nullable
    private final t controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;

    @Nullable
    private s controllerVisibilityListener;

    @Nullable
    private CharSequence customErrorMessage;

    @Nullable
    private Drawable defaultArtwork;

    @Nullable
    private InterfaceC2547b errorMessageProvider;

    @Nullable
    private final TextView errorMessageView;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;

    @Nullable
    private final FrameLayout overlayFrameLayout;

    @Nullable
    private y player;
    private int showBuffering;

    @Nullable
    private final View shutterView;

    @Nullable
    private final SubtitleView subtitleView;

    @Nullable
    private final View surfaceView;
    private int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;
    private boolean useSensorRotation;

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyTextureViewRotation(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f3 = height / 2.0f;
            matrix.postRotate(i, f, f3);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f3);
        }
        textureView.setTransform(matrix);
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void configureEditModeLogo(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(2131230893));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color));
    }

    @RequiresApi(23)
    private static void configureEditModeLogoV23(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(2131230893, null));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        y yVar = this.player;
        return yVar != null && yVar.isPlayingAd() && this.player.getPlayWhenReady();
    }

    private void maybeShowController(boolean z4) {
        if (!(isPlayingAd() && this.controllerHideDuringAds) && useController()) {
            boolean z5 = this.controller.g() && this.controller.getShowTimeoutMs() <= 0;
            boolean zShouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z4 || z5 || zShouldShowControllerIndefinitely) {
                showController(zShouldShowControllerIndefinitely);
            }
        }
    }

    private boolean setArtworkFromMetadata(Metadata metadata) {
        byte[] bArr;
        int i;
        int i4 = 0;
        boolean drawableArtwork = false;
        int i6 = -1;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f9644a;
            if (i4 >= entryArr.length) {
                return drawableArtwork;
            }
            Metadata.Entry entry = entryArr[i4];
            if (entry instanceof ApicFrame) {
                ApicFrame apicFrame = (ApicFrame) entry;
                bArr = apicFrame.f9651d;
                i = apicFrame.c;
            } else if (entry instanceof PictureFrame) {
                PictureFrame pictureFrame = (PictureFrame) entry;
                bArr = pictureFrame.h;
                i = pictureFrame.f9645a;
            } else {
                continue;
                i4++;
            }
            if (i6 == -1 || i == 3) {
                drawableArtwork = setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i == 3) {
                    return drawableArtwork;
                }
                i6 = i;
            }
            i4++;
        }
    }

    private boolean setDrawableArtwork(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                onContentAspectRatioChanged(intrinsicWidth / intrinsicHeight, this.contentFrame, this.artworkView);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    private boolean shouldShowControllerIndefinitely() {
        y yVar = this.player;
        if (yVar == null) {
            return true;
        }
        int playbackState = yVar.getPlaybackState();
        if (!this.controllerAutoShow || this.player.getCurrentTimeline().n()) {
            return false;
        }
        if (playbackState != 1 && playbackState != 4) {
            y yVar2 = this.player;
            yVar2.getClass();
            if (yVar2.getPlayWhenReady()) {
                return false;
            }
        }
        return true;
    }

    public static void switchTargetView(y yVar, @Nullable StyledPlayerView styledPlayerView, @Nullable StyledPlayerView styledPlayerView2) {
        if (styledPlayerView == styledPlayerView2) {
            return;
        }
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(yVar);
        }
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean toggleControllerVisibility() {
        if (useController() && this.player != null) {
            if (!this.controller.g()) {
                maybeShowController(true);
                return true;
            }
            if (this.controllerHideOnTouch) {
                this.controller.f();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateBuffering() {
        /*
            r4 = this;
            android.view.View r0 = r4.bufferingView
            if (r0 == 0) goto L2b
            n1.y r0 = r4.player
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.getPlaybackState()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.showBuffering
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            n1.y r0 = r4.player
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.bufferingView
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.updateBuffering():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        t tVar = this.controller;
        if (tVar == null || !this.useController) {
            setContentDescription(null);
        } else if (tVar.g()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
            } else {
                y yVar = this.player;
                if (yVar != null) {
                    yVar.getPlayerError();
                }
                this.errorMessageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z4) {
        y yVar = this.player;
        if (yVar == null || yVar.getCurrentTrackGroups().f9655a == 0) {
            if (this.keepContentOnPlayerReset) {
                return;
            }
            hideArtwork();
            closeShutter();
            return;
        }
        if (z4 && !this.keepContentOnPlayerReset) {
            closeShutter();
        }
        d currentTrackSelections = yVar.getCurrentTrackSelections();
        for (int i = 0; i < currentTrackSelections.f20453a; i++) {
            if (yVar.getRendererType(i) == 2 && currentTrackSelections.f20454b[i] != null) {
                hideArtwork();
                return;
            }
        }
        closeShutter();
        if (useArtwork()) {
            Iterator it = yVar.getCurrentStaticMetadata().iterator();
            while (it.hasNext()) {
                if (setArtworkFromMetadata((Metadata) it.next())) {
                    return;
                }
            }
            if (setDrawableArtwork(this.defaultArtwork)) {
                return;
            }
        }
        hideArtwork();
    }

    private boolean useArtwork() {
        if (!this.useArtwork) {
            return false;
        }
        i.g(this.artworkView);
        return true;
    }

    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        i.g(this.controller);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        y yVar = this.player;
        if (yVar != null && yVar.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zIsDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (zIsDpadKey && useController() && !this.controller.g()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (zIsDpadKey && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.b(keyEvent);
    }

    public List<f> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.overlayFrameLayout;
        if (frameLayout != null) {
            arrayList.add(new f(frameLayout, 16));
        }
        t tVar = this.controller;
        if (tVar != null) {
            arrayList.add(new f(tVar, 16));
        }
        return S.k(arrayList);
    }

    @Deprecated
    public View[] getAdOverlayViews() {
        return new View[0];
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.adOverlayFrameLayout;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    @Nullable
    public y getPlayer() {
        return this.player;
    }

    public int getResizeMode() {
        i.g(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    public boolean getUseArtwork() {
        return this.useArtwork;
    }

    public boolean getUseController() {
        return this.useController;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public void hideController() {
        t tVar = this.controller;
        if (tVar != null) {
            tVar.f();
        }
    }

    public boolean isControllerFullyVisible() {
        t tVar = this.controller;
        return tVar != null && tVar.g();
    }

    public void onContentAspectRatioChanged(float f, @Nullable AspectRatioFrameLayout aspectRatioFrameLayout, @Nullable View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof h) {
                f = 0.0f;
            }
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof h) {
            ((h) view).onPause();
        }
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof h) {
            ((h) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isTouching = true;
            return true;
        }
        if (action != 1 || !this.isTouching) {
            return false;
        }
        this.isTouching = false;
        return performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return toggleControllerVisibility();
    }

    public void setAspectRatioListener(@Nullable InterfaceC2363a interfaceC2363a) {
        i.g(this.contentFrame);
        this.contentFrame.setAspectRatioListener(interfaceC2363a);
    }

    public void setControlDispatcher(InterfaceC1896b interfaceC1896b) {
        i.g(this.controller);
        this.controller.setControlDispatcher(interfaceC1896b);
    }

    public void setControllerAutoShow(boolean z4) {
        this.controllerAutoShow = z4;
    }

    public void setControllerHideDuringAds(boolean z4) {
        this.controllerHideDuringAds = z4;
    }

    public void setControllerHideOnTouch(boolean z4) {
        i.g(this.controller);
        this.controllerHideOnTouch = z4;
        updateContentDescription();
    }

    public void setControllerOnFullScreenModeChangedListener(@Nullable j jVar) {
        i.g(this.controller);
        this.controller.setOnFullScreenModeChangedListener(jVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        i.g(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.g()) {
            showController();
        }
    }

    public void setControllerVisibilityListener(@Nullable s sVar) {
        i.g(this.controller);
        s sVar2 = this.controllerVisibilityListener;
        if (sVar2 == sVar) {
            return;
        }
        if (sVar2 != null) {
            this.controller.f20606b.remove(sVar2);
        }
        this.controllerVisibilityListener = sVar;
        if (sVar != null) {
            t tVar = this.controller;
            tVar.getClass();
            tVar.f20606b.add(sVar);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        i.f(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setErrorMessageProvider(@Nullable InterfaceC2547b interfaceC2547b) {
        if (interfaceC2547b != null) {
            updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        i.g(this.controller);
        t tVar = this.controller;
        if (jArr == null) {
            tVar.f20619k0 = new long[0];
            tVar.f20621l0 = new boolean[0];
        } else {
            tVar.getClass();
            zArr.getClass();
            i.e(jArr.length == zArr.length);
            tVar.f20619k0 = jArr;
            tVar.f20621l0 = zArr;
        }
        tVar.r();
    }

    public void setKeepContentOnPlayerReset(boolean z4) {
        if (this.keepContentOnPlayerReset != z4) {
            this.keepContentOnPlayerReset = z4;
            updateForCurrentTrackSelections(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(@Nullable InterfaceC1911q interfaceC1911q) {
        i.g(this.controller);
        this.controller.setPlaybackPreparer(interfaceC1911q);
    }

    public void setPlayer(@Nullable y yVar) {
        i.f(Looper.myLooper() == Looper.getMainLooper());
        i.e(yVar == null || yVar.getApplicationLooper() == Looper.getMainLooper());
        y yVar2 = this.player;
        if (yVar2 == yVar) {
            return;
        }
        if (yVar2 != null) {
            yVar2.removeListener(this.componentListener);
            yVar2.getVideoComponent();
            yVar2.getTextComponent();
        }
        SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = yVar;
        if (useController()) {
            this.controller.setPlayer(yVar);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (yVar == null) {
            hideController();
            return;
        }
        yVar.getVideoComponent();
        yVar.getTextComponent();
        yVar.addListener(this.componentListener);
        maybeShowController(false);
    }

    public void setRepeatToggleModes(int i) {
        i.g(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        i.g(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean z4) {
        i.g(this.controller);
        this.controller.setShowFastForwardButton(z4);
    }

    public void setShowMultiWindowTimeBar(boolean z4) {
        i.g(this.controller);
        this.controller.setShowMultiWindowTimeBar(z4);
    }

    public void setShowNextButton(boolean z4) {
        i.g(this.controller);
        this.controller.setShowNextButton(z4);
    }

    public void setShowPreviousButton(boolean z4) {
        i.g(this.controller);
        this.controller.setShowPreviousButton(z4);
    }

    public void setShowRewindButton(boolean z4) {
        i.g(this.controller);
        this.controller.setShowRewindButton(z4);
    }

    public void setShowShuffleButton(boolean z4) {
        i.g(this.controller);
        this.controller.setShowShuffleButton(z4);
    }

    public void setShowSubtitleButton(boolean z4) {
        i.g(this.controller);
        this.controller.setShowSubtitleButton(z4);
    }

    public void setShowVrButton(boolean z4) {
        i.g(this.controller);
        this.controller.setShowVrButton(z4);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z4) {
        i.f((z4 && this.artworkView == null) ? false : true);
        if (this.useArtwork != z4) {
            this.useArtwork = z4;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setUseController(boolean z4) {
        i.f((z4 && this.controller == null) ? false : true);
        if (this.useController == z4) {
            return;
        }
        this.useController = z4;
        if (useController()) {
            this.controller.setPlayer(this.player);
        } else {
            t tVar = this.controller;
            if (tVar != null) {
                tVar.f();
                this.controller.setPlayer(null);
            }
        }
        updateContentDescription();
    }

    public void setUseSensorRotation(boolean z4) {
        if (this.useSensorRotation != z4) {
            this.useSensorRotation = z4;
            View view = this.surfaceView;
            if (view instanceof h) {
                ((h) view).setUseSensorRotation(z4);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void showController(boolean z4) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z4 ? 0 : this.controllerShowTimeoutMs);
            z zVar = this.controller.f20627p0;
            t tVar = zVar.f20656a;
            if (!tVar.h()) {
                tVar.setVisibility(0);
                tVar.i();
                View view = tVar.e;
                if (view != null) {
                    view.requestFocus();
                }
            }
            zVar.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i4;
        int i6;
        boolean z4;
        int i10;
        int i11;
        boolean z5;
        int color;
        boolean zHasValue;
        boolean z8;
        int resourceId;
        boolean z9;
        int i12;
        boolean z10;
        int i13;
        super(context, attributeSet, i);
        ViewOnLayoutChangeListenerC2362A viewOnLayoutChangeListenerC2362A = new ViewOnLayoutChangeListenerC2362A(this);
        this.componentListener = viewOnLayoutChangeListenerC2362A;
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            ImageView imageView = new ImageView(context);
            if (AbstractC2550e.f21351a >= 23) {
                configureEditModeLogoV23(getResources(), imageView);
            } else {
                configureEditModeLogo(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        this.useSensorRotation = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2366d.f20561d, 0, 0);
            try {
                zHasValue = typedArrayObtainStyledAttributes.hasValue(29);
                color = typedArrayObtainStyledAttributes.getColor(29, 0);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.exo_styled_player_view);
                z8 = typedArrayObtainStyledAttributes.getBoolean(34, true);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(8, 0);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(35, true);
                int i14 = typedArrayObtainStyledAttributes.getInt(30, 1);
                int i15 = typedArrayObtainStyledAttributes.getInt(17, 0);
                int i16 = typedArrayObtainStyledAttributes.getInt(27, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(11, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(3, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(24, 0);
                this.keepContentOnPlayerReset = typedArrayObtainStyledAttributes.getBoolean(12, this.keepContentOnPlayerReset);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(10, true);
                this.useSensorRotation = typedArrayObtainStyledAttributes.getBoolean(36, this.useSensorRotation);
                typedArrayObtainStyledAttributes.recycle();
                i11 = i15;
                i10 = i14;
                z9 = z11;
                z10 = z12;
                z5 = z13;
                i4 = i16;
                i12 = resourceId2;
                i6 = integer;
                z4 = z14;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i4 = 5000;
            i6 = 0;
            z4 = true;
            i10 = 1;
            i11 = 0;
            z5 = true;
            color = 0;
            zHasValue = false;
            z8 = true;
            resourceId = 0;
            z9 = true;
            i12 = R.layout.exo_styled_player_view;
            z10 = true;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i11);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.shutterView = viewFindViewById;
        if (viewFindViewById != null && zHasValue) {
            viewFindViewById.setBackgroundColor(color);
        }
        if (aspectRatioFrameLayout != null && i10 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i10 == 2) {
                this.surfaceView = new TextureView(context);
            } else if (i10 == 3) {
                h hVar = new h(context);
                hVar.setSingleTapListener(viewOnLayoutChangeListenerC2362A);
                hVar.setUseSensorRotation(this.useSensorRotation);
                this.surfaceView = hVar;
            } else if (i10 != 4) {
                this.surfaceView = new SurfaceView(context);
            } else {
                this.surfaceView = new c(context);
            }
            this.surfaceView.setLayoutParams(layoutParams);
            i13 = 0;
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
        } else {
            i13 = 0;
            this.surfaceView = null;
        }
        this.adOverlayFrameLayout = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.overlayFrameLayout = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.artworkView = imageView2;
        this.useArtwork = (!z8 || imageView2 == null) ? i13 : 1;
        if (resourceId != 0) {
            this.defaultArtwork = ContextCompat.getDrawable(getContext(), resourceId);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.bufferingView = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.showBuffering = i6;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        t tVar = (t) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (tVar != null) {
            this.controller = tVar;
        } else if (viewFindViewById3 != null) {
            t tVar2 = new t(context, attributeSet);
            this.controller = tVar2;
            tVar2.setId(R.id.exo_controller);
            tVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(tVar2, iIndexOfChild);
        } else {
            this.controller = null;
        }
        t tVar3 = this.controller;
        this.controllerShowTimeoutMs = tVar3 != null ? i4 : i13;
        this.controllerHideOnTouch = z10;
        this.controllerAutoShow = z5;
        this.controllerHideDuringAds = z4;
        this.useController = (!z9 || tVar3 == null) ? i13 : 1;
        if (tVar3 != null) {
            z zVar = tVar3.f20627p0;
            int i17 = zVar.f20674z;
            if (i17 != 3 && i17 != 2) {
                zVar.g();
                zVar.j(2);
            }
            this.controller.f20606b.add(viewOnLayoutChangeListenerC2362A);
        }
        updateContentDescription();
    }
}
