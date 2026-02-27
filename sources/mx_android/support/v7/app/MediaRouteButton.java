package mx_android.support.v7.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import mx_android.support.v4.app.FragmentActivity;
import mx_android.support.v4.app.FragmentManager;
import mx_android.support.v4.graphics.drawable.DrawableCompat;
import mx_android.support.v7.media.MediaRouteSelector;
import mx_android.support.v7.media.MediaRouter;

/* JADX INFO: loaded from: classes7.dex */
public class MediaRouteButton extends View {
    private static final String CHOOSER_FRAGMENT_TAG = "mx_android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
    private static final String CONTROLLER_FRAGMENT_TAG = "mx_android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
    private static final String TAG = "MediaRouteButton";
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private boolean mCheatSheetEnabled;
    private MediaRouteDialogFactory mDialogFactory;
    private boolean mIsConnecting;
    private int mMinHeight;
    private int mMinWidth;
    private boolean mRemoteActive;
    private Drawable mRemoteIndicator;
    private final MediaRouter mRouter;
    private MediaRouteSelector mSelector;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mx_android.support.v7.mediarouter.R.attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context), attributeSet, i);
        this.mSelector = MediaRouteSelector.EMPTY;
        this.mDialogFactory = MediaRouteDialogFactory.getDefault();
        Context context2 = getContext();
        this.mRouter = MediaRouter.getInstance(context2);
        this.mCallback = new MediaRouterCallback();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, mx_android.support.v7.mediarouter.R.styleable.MediaRouteButton, i, 0);
        setRemoteIndicatorDrawable(typedArrayObtainStyledAttributes.getDrawable(mx_android.support.v7.mediarouter.R.styleable.MediaRouteButton_externalRouteEnabledDrawable));
        this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(mx_android.support.v7.mediarouter.R.styleable.MediaRouteButton_android_minWidth, 0);
        this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(mx_android.support.v7.mediarouter.R.styleable.MediaRouteButton_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        setLongClickable(true);
    }

    public MediaRouteSelector getRouteSelector() {
        return this.mSelector;
    }

    public void setRouteSelector(MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(mediaRouteSelector)) {
            return;
        }
        if (this.mAttachedToWindow) {
            if (!this.mSelector.isEmpty()) {
                this.mRouter.removeCallback(this.mCallback);
            }
            if (!mediaRouteSelector.isEmpty()) {
                this.mRouter.addCallback(mediaRouteSelector, this.mCallback);
            }
        }
        this.mSelector = mediaRouteSelector;
        refreshRoute();
    }

    public MediaRouteDialogFactory getDialogFactory() {
        return this.mDialogFactory;
    }

    public void setDialogFactory(MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.mDialogFactory = mediaRouteDialogFactory;
    }

    public boolean showDialog() {
        if (!this.mAttachedToWindow) {
            return false;
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        MediaRouter.RouteInfo selectedRoute = this.mRouter.getSelectedRoute();
        if (selectedRoute.isDefault() || !selectedRoute.matchesSelector(this.mSelector)) {
            if (fragmentManager.findFragmentByTag(CHOOSER_FRAGMENT_TAG) != null) {
                Log.w(TAG, "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            MediaRouteChooserDialogFragment mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment = this.mDialogFactory.onCreateChooserDialogFragment();
            mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment.setRouteSelector(this.mSelector);
            mediaRouteChooserDialogFragmentOnCreateChooserDialogFragment.show(fragmentManager, CHOOSER_FRAGMENT_TAG);
            return true;
        }
        if (fragmentManager.findFragmentByTag(CONTROLLER_FRAGMENT_TAG) != null) {
            Log.w(TAG, "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.mDialogFactory.onCreateControllerDialogFragment().show(fragmentManager, CONTROLLER_FRAGMENT_TAG);
        return true;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager();
        }
        return null;
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    void setCheatSheetEnabled(boolean z4) {
        this.mCheatSheetEnabled = z4;
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return showDialog() || zPerformClick;
    }

    @Override // android.view.View
    public boolean performLongClick() {
        if (super.performLongClick()) {
            return true;
        }
        if (!this.mCheatSheetEnabled) {
            return false;
        }
        CharSequence contentDescription = getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        Toast toastMakeText = Toast.makeText(context, contentDescription, 0);
        if (i < rect.height()) {
            toastMakeText.setGravity(8388661, (i4 - iArr[0]) - (width / 2), height);
        } else {
            toastMakeText.setGravity(81, 0, height);
        }
        toastMakeText.show();
        performHapticFeedback(0);
        return true;
    }

    @Override // android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.mIsConnecting) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        } else if (this.mRemoteActive) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setState(getDrawableState());
            invalidate();
        }
    }

    private void setRemoteIndicatorDrawable(Drawable drawable) {
        Drawable drawable2 = this.mRemoteIndicator;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.mRemoteIndicator);
        }
        this.mRemoteIndicator = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        refreshDrawableState();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mRemoteIndicator;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        if (getBackground() != null) {
            DrawableCompat.jumpToCurrentState(getBackground());
        }
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            DrawableCompat.jumpToCurrentState(drawable);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        if (!this.mSelector.isEmpty()) {
            this.mRouter.addCallback(this.mSelector, this.mCallback);
        }
        refreshRoute();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        if (!this.mSelector.isEmpty()) {
            this.mRouter.removeCallback(this.mCallback);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i4) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int i6 = this.mMinWidth;
        Drawable drawable = this.mRemoteIndicator;
        int iMax = Math.max(i6, drawable != null ? drawable.getIntrinsicWidth() : 0);
        int i10 = this.mMinHeight;
        Drawable drawable2 = this.mRemoteIndicator;
        int iMax2 = Math.max(i10, drawable2 != null ? drawable2.getIntrinsicHeight() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax + getPaddingLeft() + getPaddingRight());
        } else if (mode != 1073741824) {
            size = iMax + getPaddingLeft() + getPaddingRight();
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2 + getPaddingTop() + getPaddingBottom());
        } else if (mode2 != 1073741824) {
            size2 = iMax2 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mRemoteIndicator != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.mRemoteIndicator.getIntrinsicWidth();
            int intrinsicHeight = this.mRemoteIndicator.getIntrinsicHeight();
            int i = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i4 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.mRemoteIndicator.setBounds(i, i4, intrinsicWidth + i, intrinsicHeight + i4);
            this.mRemoteIndicator.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshRoute() {
        if (this.mAttachedToWindow) {
            MediaRouter.RouteInfo selectedRoute = this.mRouter.getSelectedRoute();
            boolean z4 = false;
            boolean z5 = !selectedRoute.isDefault() && selectedRoute.matchesSelector(this.mSelector);
            boolean z8 = z5 && selectedRoute.isConnecting();
            if (this.mRemoteActive != z5) {
                this.mRemoteActive = z5;
                z4 = true;
            }
            if (this.mIsConnecting != z8) {
                this.mIsConnecting = z8;
                z4 = true;
            }
            if (z4) {
                refreshDrawableState();
            }
            setEnabled(this.mRouter.isRouteAvailable(this.mSelector, 1));
        }
    }

    private final class MediaRouterCallback extends MediaRouter.Callback {
        private MediaRouterCallback() {
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onProviderAdded(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onProviderRemoved(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // mx_android.support.v7.media.MediaRouter.Callback
        public void onProviderChanged(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }
    }
}
