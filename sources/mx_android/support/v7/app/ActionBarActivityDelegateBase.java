package mx_android.support.v7.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import mx_android.support.v4.app.NavUtils;
import mx_android.support.v4.view.OnApplyWindowInsetsListener;
import mx_android.support.v4.view.ViewCompat;
import mx_android.support.v4.view.ViewConfigurationCompat;
import mx_android.support.v4.view.WindowInsetsCompat;
import mx_android.support.v7.internal.app.ToolbarActionBar;
import mx_android.support.v7.internal.app.WindowCallback;
import mx_android.support.v7.internal.app.WindowDecorActionBar;
import mx_android.support.v7.internal.view.StandaloneActionMode;
import mx_android.support.v7.internal.view.menu.ListMenuPresenter;
import mx_android.support.v7.internal.view.menu.MenuBuilder;
import mx_android.support.v7.internal.view.menu.MenuPresenter;
import mx_android.support.v7.internal.view.menu.MenuView;
import mx_android.support.v7.internal.widget.ActionBarContextView;
import mx_android.support.v7.internal.widget.DecorContentParent;
import mx_android.support.v7.internal.widget.FitWindowsViewGroup;
import mx_android.support.v7.internal.widget.TintAutoCompleteTextView;
import mx_android.support.v7.internal.widget.TintButton;
import mx_android.support.v7.internal.widget.TintCheckBox;
import mx_android.support.v7.internal.widget.TintCheckedTextView;
import mx_android.support.v7.internal.widget.TintEditText;
import mx_android.support.v7.internal.widget.TintManager;
import mx_android.support.v7.internal.widget.TintMultiAutoCompleteTextView;
import mx_android.support.v7.internal.widget.TintRadioButton;
import mx_android.support.v7.internal.widget.TintRatingBar;
import mx_android.support.v7.internal.widget.TintSpinner;
import mx_android.support.v7.internal.widget.ViewStubCompat;
import mx_android.support.v7.internal.widget.ViewUtils;
import mx_android.support.v7.view.ActionMode;
import mx_android.support.v7.widget.Toolbar;

/* JADX INFO: loaded from: classes7.dex */
class ActionBarActivityDelegateBase extends ActionBarActivityDelegate implements MenuBuilder.Callback {
    private static final String TAG = "ActionBarActivityDelegateBase";
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private int mInvalidatePanelMenuFeatures;
    private boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    private ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private CharSequence mTitleToSet;
    private ViewGroup mWindowDecor;

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void onContentChanged() {
    }

    void onSubDecorInstalled() {
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    void setSupportProgress(int i) {
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    void setSupportProgressBarIndeterminate(boolean z4) {
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    void setSupportProgressBarIndeterminateVisibility(boolean z4) {
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    void setSupportProgressBarVisibility(boolean z4) {
    }

    ActionBarActivityDelegateBase(ActionBarActivity actionBarActivity) {
        super(actionBarActivity);
        this.mInvalidatePanelMenuRunnable = new Runnable() { // from class: mx_android.support.v7.app.ActionBarActivityDelegateBase.1
            @Override // java.lang.Runnable
            public void run() {
                if ((ActionBarActivityDelegateBase.this.mInvalidatePanelMenuFeatures & 1) != 0) {
                    ActionBarActivityDelegateBase.this.doInvalidatePanelMenu(0);
                }
                if ((ActionBarActivityDelegateBase.this.mInvalidatePanelMenuFeatures & 256) != 0) {
                    ActionBarActivityDelegateBase.this.doInvalidatePanelMenu(8);
                }
                ActionBarActivityDelegateBase.this.mInvalidatePanelMenuPosted = false;
                ActionBarActivityDelegateBase.this.mInvalidatePanelMenuFeatures = 0;
            }
        };
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mWindowDecor = (ViewGroup) this.mActivity.getWindow().getDecorView();
        if (NavUtils.getParentActivityName(this.mActivity) != null) {
            ActionBar actionBarPeekSupportActionBar = peekSupportActionBar();
            if (actionBarPeekSupportActionBar == null) {
                this.mEnableDefaultActionBarUp = true;
            } else {
                actionBarPeekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
            }
        }
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    void onPostCreate(Bundle bundle) {
        ensureSubDecor();
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public ActionBar createSupportActionBar() {
        ensureSubDecor();
        WindowDecorActionBar windowDecorActionBar = new WindowDecorActionBar(this.mActivity, this.mOverlayActionBar);
        windowDecorActionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
        return windowDecorActionBar;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    void setSupportActionBar(Toolbar toolbar) {
        if (getSupportActionBar() instanceof WindowDecorActionBar) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, this.mActivity.getTitle(), this.mActivity.getWindow(), this.mDefaultWindowCallback);
        setSupportActionBar(toolbarActionBar);
        setWindowCallback(toolbarActionBar.getWrappedWindowCallback());
        toolbarActionBar.invalidateOptionsMenu();
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void onConfigurationChanged(Configuration configuration) {
        ActionBar supportActionBar;
        if (this.mHasActionBar && this.mSubDecorInstalled && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void onPostResume() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void setContentView(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mActivity.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mActivity.onSupportContentChanged();
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void setContentView(int i) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mActivity.findViewById(R.id.content);
        viewGroup.removeAllViews();
        this.mActivity.getLayoutInflater().inflate(i, viewGroup);
        this.mActivity.onSupportContentChanged();
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mActivity.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mActivity.onSupportContentChanged();
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ((ViewGroup) this.mActivity.findViewById(R.id.content)).addView(view, layoutParams);
        this.mActivity.onSupportContentChanged();
    }

    final void ensureSubDecor() {
        DecorContentParent decorContentParent;
        Context contextThemeWrapper;
        if (this.mSubDecorInstalled) {
            return;
        }
        if (this.mHasActionBar) {
            TypedValue typedValue = new TypedValue();
            this.mActivity.getTheme().resolveAttribute(mx_android.support.v7.appcompat.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                contextThemeWrapper = new ContextThemeWrapper(this.mActivity, typedValue.resourceId);
            } else {
                contextThemeWrapper = this.mActivity;
            }
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(mx_android.support.v7.appcompat.R.layout.abc_screen_toolbar, (ViewGroup) null);
            this.mSubDecor = viewGroup;
            DecorContentParent decorContentParent2 = (DecorContentParent) viewGroup.findViewById(mx_android.support.v7.appcompat.R.id.decor_content_parent);
            this.mDecorContentParent = decorContentParent2;
            decorContentParent2.setWindowCallback(getWindowCallback());
            if (this.mOverlayActionBar) {
                this.mDecorContentParent.initFeature(9);
            }
            if (this.mFeatureProgress) {
                this.mDecorContentParent.initFeature(2);
            }
            if (this.mFeatureIndeterminateProgress) {
                this.mDecorContentParent.initFeature(5);
            }
        } else {
            if (this.mOverlayActionMode) {
                this.mSubDecor = (ViewGroup) LayoutInflater.from(this.mActivity).inflate(mx_android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            } else {
                this.mSubDecor = (ViewGroup) LayoutInflater.from(this.mActivity).inflate(mx_android.support.v7.appcompat.R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ViewCompat.setOnApplyWindowInsetsListener(this.mSubDecor, new OnApplyWindowInsetsListener() { // from class: mx_android.support.v7.app.ActionBarActivityDelegateBase.2
                    @Override // mx_android.support.v4.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                        int iUpdateStatusGuard = ActionBarActivityDelegateBase.this.updateStatusGuard(systemWindowInsetTop);
                        return systemWindowInsetTop != iUpdateStatusGuard ? windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), iUpdateStatusGuard, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()) : windowInsetsCompat;
                    }
                });
            } else {
                ((FitWindowsViewGroup) this.mSubDecor).setOnFitSystemWindowsListener(new FitWindowsViewGroup.OnFitSystemWindowsListener() { // from class: mx_android.support.v7.app.ActionBarActivityDelegateBase.3
                    @Override // mx_android.support.v7.internal.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
                    public void onFitSystemWindows(Rect rect) {
                        rect.top = ActionBarActivityDelegateBase.this.updateStatusGuard(rect.top);
                    }
                });
            }
        }
        ViewUtils.makeOptionalFitsSystemWindows(this.mSubDecor);
        ViewGroup viewGroup2 = (ViewGroup) this.mActivity.findViewById(R.id.content);
        ViewGroup viewGroup3 = (ViewGroup) this.mSubDecor.findViewById(mx_android.support.v7.appcompat.R.id.action_bar_activity_content);
        while (viewGroup2.getChildCount() > 0) {
            View childAt = viewGroup2.getChildAt(0);
            viewGroup2.removeViewAt(0);
            viewGroup3.addView(childAt);
        }
        this.mActivity.superSetContentView(this.mSubDecor);
        viewGroup2.setId(-1);
        viewGroup3.setId(R.id.content);
        if (viewGroup2 instanceof FrameLayout) {
            ((FrameLayout) viewGroup2).setForeground(null);
        }
        CharSequence charSequence = this.mTitleToSet;
        if (charSequence != null && (decorContentParent = this.mDecorContentParent) != null) {
            decorContentParent.setWindowTitle(charSequence);
            this.mTitleToSet = null;
        }
        applyFixedSizeWindow();
        onSubDecorInstalled();
        this.mSubDecorInstalled = true;
        PanelFeatureState panelState = getPanelState(0, false);
        if (isDestroyed()) {
            return;
        }
        if (panelState == null || panelState.menu == null) {
            invalidatePanelMenu(8);
        }
    }

    private void applyFixedSizeWindow() {
        TypedValue typedValue;
        TypedValue typedValue2;
        TypedValue typedValue3;
        int i;
        int i4;
        float fraction;
        float fraction2;
        TypedArray typedArrayObtainStyledAttributes = this.mActivity.obtainStyledAttributes(mx_android.support.v7.appcompat.R.styleable.Theme);
        TypedValue typedValue4 = null;
        if (typedArrayObtainStyledAttributes.hasValue(mx_android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMajor)) {
            typedValue = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(mx_android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMajor, typedValue);
        } else {
            typedValue = null;
        }
        if (typedArrayObtainStyledAttributes.hasValue(mx_android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMinor)) {
            typedValue2 = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(mx_android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMinor, typedValue2);
        } else {
            typedValue2 = null;
        }
        if (typedArrayObtainStyledAttributes.hasValue(mx_android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMajor)) {
            typedValue3 = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(mx_android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMajor, typedValue3);
        } else {
            typedValue3 = null;
        }
        if (typedArrayObtainStyledAttributes.hasValue(mx_android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMinor)) {
            typedValue4 = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(mx_android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMinor, typedValue4);
        }
        DisplayMetrics displayMetrics = this.mActivity.getResources().getDisplayMetrics();
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        if (z4) {
            typedValue = typedValue2;
        }
        if (typedValue == null || typedValue.type == 0) {
            i = -1;
        } else {
            if (typedValue.type == 5) {
                fraction2 = typedValue.getDimension(displayMetrics);
            } else {
                if (typedValue.type == 6) {
                    fraction2 = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                }
                i = -1;
            }
            i = (int) fraction2;
        }
        if (!z4) {
            typedValue3 = typedValue4;
        }
        if (typedValue3 == null || typedValue3.type == 0) {
            i4 = -1;
        } else {
            if (typedValue3.type == 5) {
                fraction = typedValue3.getDimension(displayMetrics);
            } else {
                if (typedValue3.type == 6) {
                    fraction = typedValue3.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels);
                }
                i4 = -1;
            }
            i4 = (int) fraction;
        }
        if (i != -1 || i4 != -1) {
            this.mActivity.getWindow().setLayout(i, i4);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public boolean supportRequestWindowFeature(int i) {
        if (i == 2) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureProgress = true;
            return true;
        }
        if (i != 5) {
            switch (i) {
                case 8:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mHasActionBar = true;
                    return true;
                case 9:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mOverlayActionBar = true;
                    return true;
                case 10:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mOverlayActionMode = true;
                    return true;
                default:
                    return this.mActivity.requestWindowFeature(i);
            }
        }
        throwFeatureRequestIfSubDecorInstalled();
        this.mFeatureIndeterminateProgress = true;
        return true;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void onTitleChanged(CharSequence charSequence) {
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (getSupportActionBar() != null) {
            getSupportActionBar().setWindowTitle(charSequence);
        } else {
            this.mTitleToSet = charSequence;
        }
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return getWindowCallback().onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return getWindowCallback().onPreparePanel(i, view, menu);
        }
        return false;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void onPanelClosed(int i, Menu menu) {
        if (i == 8) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (isDestroyed()) {
            return;
        }
        this.mActivity.superOnPanelClosed(i, menu);
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    boolean onMenuOpened(int i, Menu menu) {
        if (i == 8) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(true);
            }
            return true;
        }
        return this.mActivity.superOnMenuOpened(i, menu);
    }

    @Override // mx_android.support.v7.internal.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateFindMenuPanel;
        WindowCallback windowCallback = getWindowCallback();
        if (windowCallback == null || isDestroyed() || (panelFeatureStateFindMenuPanel = findMenuPanel(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return windowCallback.onMenuItemSelected(panelFeatureStateFindMenuPanel.featureId, menuItem);
    }

    @Override // mx_android.support.v7.internal.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        reopenMenu(menuBuilder, true);
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public ActionMode startSupportActionMode(ActionMode.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionModeCallbackWrapper actionModeCallbackWrapper = new ActionModeCallbackWrapper(callback);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            ActionMode actionModeStartActionMode = supportActionBar.startActionMode(actionModeCallbackWrapper);
            this.mActionMode = actionModeStartActionMode;
            if (actionModeStartActionMode != null) {
                this.mActivity.onSupportActionModeStarted(this.mActionMode);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapper);
        }
        return this.mActionMode;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public void supportInvalidateOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.invalidateOptionsMenu()) {
            invalidatePanelMenu(0);
        }
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    ActionMode startSupportActionModeFromWindow(ActionMode.Callback callback) {
        ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionModeCallbackWrapper actionModeCallbackWrapper = new ActionModeCallbackWrapper(callback);
        Context actionBarThemedContext = getActionBarThemedContext();
        if (this.mActionModeView == null) {
            if (this.mIsFloating) {
                this.mActionModeView = new ActionBarContextView(actionBarThemedContext);
                PopupWindow popupWindow = new PopupWindow(actionBarThemedContext, (AttributeSet) null, mx_android.support.v7.appcompat.R.attr.actionModePopupWindowStyle);
                this.mActionModePopup = popupWindow;
                popupWindow.setContentView(this.mActionModeView);
                this.mActionModePopup.setWidth(-1);
                TypedValue typedValue = new TypedValue();
                this.mActivity.getTheme().resolveAttribute(mx_android.support.v7.appcompat.R.attr.actionBarSize, typedValue, true);
                this.mActionModeView.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, this.mActivity.getResources().getDisplayMetrics()));
                this.mActionModePopup.setHeight(-2);
                this.mShowActionModePopup = new Runnable() { // from class: mx_android.support.v7.app.ActionBarActivityDelegateBase.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ActionBarActivityDelegateBase.this.mActionModePopup.showAtLocation(ActionBarActivityDelegateBase.this.mActionModeView, 55, 0, 0);
                    }
                };
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.mActivity.findViewById(mx_android.support.v7.appcompat.R.id.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.setLayoutInflater(LayoutInflater.from(actionBarThemedContext));
                    this.mActionModeView = (ActionBarContextView) viewStubCompat.inflate();
                }
            }
        }
        ActionBarContextView actionBarContextView = this.mActionModeView;
        if (actionBarContextView != null) {
            actionBarContextView.killMode();
            StandaloneActionMode standaloneActionMode = new StandaloneActionMode(actionBarThemedContext, this.mActionModeView, actionModeCallbackWrapper, this.mActionModePopup == null);
            if (callback.onCreateActionMode(standaloneActionMode, standaloneActionMode.getMenu())) {
                standaloneActionMode.invalidate();
                this.mActionModeView.initForMode(standaloneActionMode);
                this.mActionModeView.setVisibility(0);
                this.mActionMode = standaloneActionMode;
                if (this.mActionModePopup != null) {
                    this.mActivity.getWindow().getDecorView().post(this.mShowActionModePopup);
                }
                this.mActionModeView.sendAccessibilityEvent(32);
                if (this.mActionModeView.getParent() != null) {
                    ViewCompat.requestApplyInsets((View) this.mActionModeView.getParent());
                }
            } else {
                this.mActionMode = null;
            }
        }
        if (this.mActionMode != null && this.mActivity != null) {
            this.mActivity.onSupportActionModeStarted(this.mActionMode);
        }
        return this.mActionMode;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    public boolean onBackPressed() {
        ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        return supportActionBar != null && supportActionBar.collapseActionView();
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    int getHomeAsUpIndicatorAttrId() {
        return mx_android.support.v7.appcompat.R.attr.homeAsUpIndicator;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.mPreparedPanel;
        if (panelFeatureState != null && performPanelShortcut(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
            if (panelFeatureState2 != null) {
                panelFeatureState2.isHandled = true;
            }
            return true;
        }
        if (this.mPreparedPanel == null) {
            PanelFeatureState panelState = getPanelState(0, true);
            preparePanel(panelState, keyEvent);
            boolean zPerformPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
            panelState.isPrepared = false;
            if (zPerformPanelShortcut) {
                return true;
            }
        }
        return false;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
    }

    protected boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            PanelFeatureState panelState = getPanelState(0, false);
            if (panelState != null && panelState.isOpen) {
                closePanel(panelState, true);
                return true;
            }
        } else if (i == 82) {
            onKeyUpPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    protected boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 82) {
            onKeyDownPanel(0, keyEvent);
            return true;
        }
        if (Build.VERSION.SDK_INT < 11) {
            return onKeyShortcut(i, keyEvent);
        }
        return false;
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegate
    View createView(String str, Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                return new TintRatingBar(context, attributeSet);
            case "CheckedTextView":
                return new TintCheckedTextView(context, attributeSet);
            case "MultiAutoCompleteTextView":
                return new TintMultiAutoCompleteTextView(context, attributeSet);
            case "Spinner":
                return new TintSpinner(context, attributeSet);
            case "RadioButton":
                return new TintRadioButton(context, attributeSet);
            case "AutoCompleteTextView":
                return new TintAutoCompleteTextView(context, attributeSet);
            case "CheckBox":
                return new TintCheckBox(context, attributeSet);
            case "EditText":
                return new TintEditText(context, attributeSet);
            case "Button":
                return new TintButton(context, attributeSet);
            default:
                return null;
        }
    }

    private void openPanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.isOpen || isDestroyed()) {
            return;
        }
        if (panelFeatureState.featureId == 0) {
            ActionBarActivity actionBarActivity = this.mActivity;
            boolean z4 = (actionBarActivity.getResources().getConfiguration().screenLayout & 15) == 4;
            boolean z5 = actionBarActivity.getApplicationInfo().targetSdkVersion >= 11;
            if (z4 && z5) {
                return;
            }
        }
        WindowCallback windowCallback = getWindowCallback();
        if (windowCallback != null && !windowCallback.onMenuOpened(panelFeatureState.featureId, panelFeatureState.menu)) {
            closePanel(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mActivity.getSystemService("window");
        if (windowManager != null && preparePanel(panelFeatureState, keyEvent)) {
            if (panelFeatureState.decorView == null || panelFeatureState.refreshDecorView) {
                if (panelFeatureState.decorView == null) {
                    if (!initializePanelDecor(panelFeatureState) || panelFeatureState.decorView == null) {
                        return;
                    }
                } else if (panelFeatureState.refreshDecorView && panelFeatureState.decorView.getChildCount() > 0) {
                    panelFeatureState.decorView.removeAllViews();
                }
                if (!initializePanelContent(panelFeatureState) || !panelFeatureState.hasPanelItems()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = panelFeatureState.shownPanelView.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.decorView.setBackgroundResource(panelFeatureState.background);
                ViewParent parent = panelFeatureState.shownPanelView.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(panelFeatureState.shownPanelView);
                }
                panelFeatureState.decorView.addView(panelFeatureState.shownPanelView, layoutParams2);
                if (!panelFeatureState.shownPanelView.hasFocus()) {
                    panelFeatureState.shownPanelView.requestFocus();
                }
            } else {
                if (panelFeatureState.createdPanelView != null && (layoutParams = panelFeatureState.createdPanelView.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                panelFeatureState.isHandled = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f18448x, panelFeatureState.f18449y, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.gravity;
                layoutParams3.windowAnimations = panelFeatureState.windowAnimations;
                windowManager.addView(panelFeatureState.decorView, layoutParams3);
                panelFeatureState.isOpen = true;
            }
            i = -2;
            panelFeatureState.isHandled = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f18448x, panelFeatureState.f18449y, 1002, 8519680, -3);
            layoutParams32.gravity = panelFeatureState.gravity;
            layoutParams32.windowAnimations = panelFeatureState.windowAnimations;
            windowManager.addView(panelFeatureState.decorView, layoutParams32);
            panelFeatureState.isOpen = true;
        }
    }

    private boolean initializePanelDecor(PanelFeatureState panelFeatureState) {
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new ListMenuDecorView(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    private void reopenMenu(MenuBuilder menuBuilder, boolean z4) {
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(this.mActivity)) || this.mDecorContentParent.isOverflowMenuShowPending())) {
            WindowCallback windowCallback = getWindowCallback();
            if (!this.mDecorContentParent.isOverflowMenuShowing() || !z4) {
                if (windowCallback == null || isDestroyed()) {
                    return;
                }
                if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
                    this.mWindowDecor.removeCallbacks(this.mInvalidatePanelMenuRunnable);
                    this.mInvalidatePanelMenuRunnable.run();
                }
                PanelFeatureState panelState = getPanelState(0, true);
                if (panelState.menu == null || panelState.refreshMenuContent || !windowCallback.onPreparePanel(0, panelState.createdPanelView, panelState.menu)) {
                    return;
                }
                windowCallback.onMenuOpened(8, panelState.menu);
                this.mDecorContentParent.showOverflowMenu();
                return;
            }
            this.mDecorContentParent.hideOverflowMenu();
            if (isDestroyed()) {
                return;
            }
            windowCallback.onPanelClosed(8, getPanelState(0, true).menu);
            return;
        }
        PanelFeatureState panelState2 = getPanelState(0, true);
        panelState2.refreshDecorView = true;
        closePanel(panelState2, false);
        openPanel(panelState2, null);
    }

    private boolean initializePanelMenu(PanelFeatureState panelFeatureState) {
        ContextThemeWrapper contextThemeWrapper = this.mActivity;
        if ((panelFeatureState.featureId == 0 || panelFeatureState.featureId == 8) && this.mDecorContentParent != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = contextThemeWrapper.getTheme();
            theme.resolveAttribute(mx_android.support.v7.appcompat.R.attr.actionBarTheme, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = contextThemeWrapper.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(mx_android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(mx_android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = contextThemeWrapper.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(contextThemeWrapper, 0);
                contextThemeWrapper2.getTheme().setTo(themeNewTheme);
                contextThemeWrapper = contextThemeWrapper2;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(contextThemeWrapper);
        menuBuilder.setCallback(this);
        panelFeatureState.setMenu(menuBuilder);
        return true;
    }

    private boolean initializePanelContent(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.createdPanelView != null) {
            panelFeatureState.shownPanelView = panelFeatureState.createdPanelView;
            return true;
        }
        if (panelFeatureState.menu == null) {
            return false;
        }
        if (this.mPanelMenuPresenterCallback == null) {
            this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
        }
        panelFeatureState.shownPanelView = (View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
        return panelFeatureState.shownPanelView != null;
    }

    private boolean preparePanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (isDestroyed()) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            closePanel(panelFeatureState2, false);
        }
        WindowCallback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            panelFeatureState.createdPanelView = windowCallback.onCreatePanelView(panelFeatureState.featureId);
        }
        boolean z4 = panelFeatureState.featureId == 0 || panelFeatureState.featureId == 8;
        if (z4 && (decorContentParent3 = this.mDecorContentParent) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.createdPanelView == null) {
            if (panelFeatureState.menu == null || panelFeatureState.refreshMenuContent) {
                if (panelFeatureState.menu == null && (!initializePanelMenu(panelFeatureState) || panelFeatureState.menu == null)) {
                    return false;
                }
                if (z4 && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.stopDispatchingItemsChanged();
                if (!getWindowCallback().onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                    panelFeatureState.setMenu(null);
                    if (z4 && (decorContentParent = this.mDecorContentParent) != null) {
                        decorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    return false;
                }
                panelFeatureState.refreshMenuContent = false;
            }
            panelFeatureState.menu.stopDispatchingItemsChanged();
            if (panelFeatureState.frozenActionViewState != null) {
                panelFeatureState.menu.restoreActionViewStates(panelFeatureState.frozenActionViewState);
                panelFeatureState.frozenActionViewState = null;
            }
            if (!windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (z4 && (decorContentParent2 = this.mDecorContentParent) != null) {
                    decorContentParent2.setMenu(null, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.qwertyMode = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.menu.setQwertyMode(panelFeatureState.qwertyMode);
            panelFeatureState.menu.startDispatchingItemsChanged();
        }
        panelFeatureState.isPrepared = true;
        panelFeatureState.isHandled = false;
        this.mPreparedPanel = panelFeatureState;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCloseActionMenu(MenuBuilder menuBuilder) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        WindowCallback windowCallback = getWindowCallback();
        if (windowCallback != null && !isDestroyed()) {
            windowCallback.onPanelClosed(8, menuBuilder);
        }
        this.mClosingActionMenu = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closePanel(int i) {
        closePanel(getPanelState(i, true), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closePanel(PanelFeatureState panelFeatureState, boolean z4) {
        DecorContentParent decorContentParent;
        if (z4 && panelFeatureState.featureId == 0 && (decorContentParent = this.mDecorContentParent) != null && decorContentParent.isOverflowMenuShowing()) {
            checkCloseActionMenu(panelFeatureState.menu);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mActivity.getSystemService("window");
        if (windowManager != null && panelFeatureState.isOpen) {
            if (panelFeatureState.decorView != null) {
                windowManager.removeView(panelFeatureState.decorView);
            }
            if (z4) {
                callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
            }
        }
        panelFeatureState.isPrepared = false;
        panelFeatureState.isHandled = false;
        panelFeatureState.isOpen = false;
        panelFeatureState.shownPanelView = null;
        panelFeatureState.refreshDecorView = true;
        if (this.mPreparedPanel == panelFeatureState) {
            this.mPreparedPanel = null;
        }
    }

    private boolean onKeyDownPanel(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(i, true);
        if (panelState.isOpen) {
            return false;
        }
        return preparePanel(panelState, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onKeyUpPanel(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            mx_android.support.v7.view.ActionMode r0 = r3.mActionMode
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            mx_android.support.v7.app.ActionBarActivityDelegateBase$PanelFeatureState r1 = r3.getPanelState(r4, r0)
            r2 = 0
            if (r4 != 0) goto L45
            mx_android.support.v7.internal.widget.DecorContentParent r4 = r3.mDecorContentParent
            if (r4 == 0) goto L45
            boolean r4 = r4.canShowOverflowMenu()
            if (r4 == 0) goto L45
            mx_android.support.v7.app.ActionBarActivity r4 = r3.mActivity
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = mx_android.support.v4.view.ViewConfigurationCompat.hasPermanentMenuKey(r4)
            if (r4 != 0) goto L45
            mx_android.support.v7.internal.widget.DecorContentParent r4 = r3.mDecorContentParent
            boolean r4 = r4.isOverflowMenuShowing()
            if (r4 != 0) goto L3e
            boolean r4 = r3.isDestroyed()
            if (r4 != 0) goto L64
            boolean r4 = r3.preparePanel(r1, r5)
            if (r4 == 0) goto L64
            mx_android.support.v7.internal.widget.DecorContentParent r4 = r3.mDecorContentParent
            boolean r0 = r4.showOverflowMenu()
            goto L6c
        L3e:
            mx_android.support.v7.internal.widget.DecorContentParent r4 = r3.mDecorContentParent
            boolean r0 = r4.hideOverflowMenu()
            goto L6c
        L45:
            boolean r4 = r1.isOpen
            if (r4 != 0) goto L66
            boolean r4 = r1.isHandled
            if (r4 == 0) goto L4e
            goto L66
        L4e:
            boolean r4 = r1.isPrepared
            if (r4 == 0) goto L64
            boolean r4 = r1.refreshMenuContent
            if (r4 == 0) goto L5d
            r1.isPrepared = r2
            boolean r4 = r3.preparePanel(r1, r5)
            goto L5e
        L5d:
            r4 = 1
        L5e:
            if (r4 == 0) goto L64
            r3.openPanel(r1, r5)
            goto L6c
        L64:
            r0 = 0
            goto L6c
        L66:
            boolean r4 = r1.isOpen
            r3.closePanel(r1, r0)
            r0 = r4
        L6c:
            if (r0 == 0) goto L85
            mx_android.support.v7.app.ActionBarActivity r4 = r3.mActivity
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L7e
            r4.playSoundEffect(r2)
            goto L85
        L7e:
            java.lang.String r4 = "ActionBarActivityDelegateBase"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mx_android.support.v7.app.ActionBarActivityDelegateBase.onKeyUpPanel(int, android.view.KeyEvent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callOnPanelClosed(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.mPanels;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if (panelFeatureState == null || panelFeatureState.isOpen) {
            getWindowCallback().onPanelClosed(i, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PanelFeatureState findMenuPanel(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    private PanelFeatureState getPanelState(int i, boolean z4) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.mPanels = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    final boolean performPanelShortcut(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i4) {
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && panelFeatureState.menu != null) {
            zPerformShortcut = panelFeatureState.menu.performShortcut(i, keyEvent, i4);
        }
        if (zPerformShortcut && (i4 & 1) == 0 && this.mDecorContentParent == null) {
            closePanel(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private void invalidatePanelMenu(int i) {
        ViewGroup viewGroup;
        this.mInvalidatePanelMenuFeatures = (1 << i) | this.mInvalidatePanelMenuFeatures;
        if (this.mInvalidatePanelMenuPosted || (viewGroup = this.mWindowDecor) == null) {
            return;
        }
        ViewCompat.postOnAnimation(viewGroup, this.mInvalidatePanelMenuRunnable);
        this.mInvalidatePanelMenuPosted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doInvalidatePanelMenu(int i) {
        PanelFeatureState panelState;
        PanelFeatureState panelState2 = getPanelState(i, true);
        if (panelState2.menu != null) {
            Bundle bundle = new Bundle();
            panelState2.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState2.frozenActionViewState = bundle;
            }
            panelState2.menu.stopDispatchingItemsChanged();
            panelState2.menu.clear();
        }
        panelState2.refreshMenuContent = true;
        panelState2.refreshDecorView = true;
        if ((i != 8 && i != 0) || this.mDecorContentParent == null || (panelState = getPanelState(0, false)) == null) {
            return;
        }
        panelState.isPrepared = false;
        preparePanel(panelState, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int updateStatusGuard(int i) {
        boolean z4;
        boolean z5;
        ActionBarContextView actionBarContextView = this.mActionModeView;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mActionModeView.getLayoutParams();
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                Rect rect = this.mTempRect1;
                Rect rect2 = this.mTempRect2;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(this.mSubDecor, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.mStatusGuard;
                    if (view == null) {
                        View view2 = new View(this.mActivity);
                        this.mStatusGuard = view2;
                        view2.setBackgroundColor(this.mActivity.getResources().getColor(mx_android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
                        this.mSubDecor.addView(this.mStatusGuard, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.mStatusGuard.setLayoutParams(layoutParams);
                        }
                    }
                    z5 = true;
                } else {
                    z5 = false;
                }
                z = this.mStatusGuard != null;
                if (!this.mOverlayActionMode && z) {
                    i = 0;
                }
                boolean z8 = z;
                z = z5;
                z4 = z8;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                z = false;
            }
            if (z) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.mStatusGuard;
        if (view3 != null) {
            view3.setVisibility(z4 ? 0 : 8);
        }
        return i;
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("supportRequestWindowFeature() must be called before adding content");
        }
    }

    private class ActionModeCallbackWrapper implements ActionMode.Callback {
        private ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapper(ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        @Override // mx_android.support.v7.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        @Override // mx_android.support.v7.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }

        @Override // mx_android.support.v7.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        @Override // mx_android.support.v7.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            if (ActionBarActivityDelegateBase.this.mActionModePopup != null) {
                ActionBarActivityDelegateBase.this.mActivity.getWindow().getDecorView().removeCallbacks(ActionBarActivityDelegateBase.this.mShowActionModePopup);
                ActionBarActivityDelegateBase.this.mActionModePopup.dismiss();
            } else if (ActionBarActivityDelegateBase.this.mActionModeView != null) {
                ActionBarActivityDelegateBase.this.mActionModeView.setVisibility(8);
                if (ActionBarActivityDelegateBase.this.mActionModeView.getParent() != null) {
                    ViewCompat.requestApplyInsets((View) ActionBarActivityDelegateBase.this.mActionModeView.getParent());
                }
            }
            if (ActionBarActivityDelegateBase.this.mActionModeView != null) {
                ActionBarActivityDelegateBase.this.mActionModeView.removeAllViews();
            }
            if (ActionBarActivityDelegateBase.this.mActivity != null) {
                try {
                    ActionBarActivityDelegateBase.this.mActivity.onSupportActionModeFinished(ActionBarActivityDelegateBase.this.mActionMode);
                } catch (AbstractMethodError unused) {
                }
            }
            ActionBarActivityDelegateBase.this.mActionMode = null;
        }
    }

    private final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        private PanelMenuPresenterCallback() {
        }

        @Override // mx_android.support.v7.internal.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z4) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            boolean z5 = rootMenu != menuBuilder;
            ActionBarActivityDelegateBase actionBarActivityDelegateBase = ActionBarActivityDelegateBase.this;
            if (z5) {
                menuBuilder = rootMenu;
            }
            PanelFeatureState panelFeatureStateFindMenuPanel = actionBarActivityDelegateBase.findMenuPanel(menuBuilder);
            if (panelFeatureStateFindMenuPanel != null) {
                if (z5) {
                    ActionBarActivityDelegateBase.this.callOnPanelClosed(panelFeatureStateFindMenuPanel.featureId, panelFeatureStateFindMenuPanel, rootMenu);
                    ActionBarActivityDelegateBase.this.closePanel(panelFeatureStateFindMenuPanel, true);
                } else {
                    ActionBarActivityDelegateBase.this.mActivity.closeOptionsMenu();
                    ActionBarActivityDelegateBase.this.closePanel(panelFeatureStateFindMenuPanel, z4);
                }
            }
        }

        @Override // mx_android.support.v7.internal.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            WindowCallback windowCallback;
            if (menuBuilder != null || !ActionBarActivityDelegateBase.this.mHasActionBar || (windowCallback = ActionBarActivityDelegateBase.this.getWindowCallback()) == null || ActionBarActivityDelegateBase.this.isDestroyed()) {
                return true;
            }
            windowCallback.onMenuOpened(8, menuBuilder);
            return true;
        }
    }

    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        private ActionMenuPresenterCallback() {
        }

        @Override // mx_android.support.v7.internal.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            WindowCallback windowCallback = ActionBarActivityDelegateBase.this.getWindowCallback();
            if (windowCallback == null) {
                return true;
            }
            windowCallback.onMenuOpened(8, menuBuilder);
            return true;
        }

        @Override // mx_android.support.v7.internal.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z4) {
            ActionBarActivityDelegateBase.this.checkCloseActionMenu(menuBuilder);
        }
    }

    private static final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f18448x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f18449y;

        PanelFeatureState(int i) {
            this.featureId = i;
        }

        public boolean hasPanelItems() {
            if (this.shownPanelView == null) {
                return false;
            }
            return this.createdPanelView != null || this.listMenuPresenter.getAdapter().getCount() > 0;
        }

        public void clearMenuPresenters() {
            MenuBuilder menuBuilder = this.menu;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        void setStyle(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(mx_android.support.v7.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            themeNewTheme.resolveAttribute(mx_android.support.v7.appcompat.R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            } else {
                themeNewTheme.applyStyle(mx_android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(themeNewTheme);
            this.listPresenterContext = contextThemeWrapper;
            TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(mx_android.support.v7.appcompat.R.styleable.Theme);
            this.background = typedArrayObtainStyledAttributes.getResourceId(mx_android.support.v7.appcompat.R.styleable.Theme_panelBackground, 0);
            this.windowAnimations = typedArrayObtainStyledAttributes.getResourceId(mx_android.support.v7.appcompat.R.styleable.Theme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        void setMenu(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.menu;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(this.listMenuPresenter);
            }
            this.menu = menuBuilder;
            if (menuBuilder == null || (listMenuPresenter = this.listMenuPresenter) == null) {
                return;
            }
            menuBuilder.addMenuPresenter(listMenuPresenter);
        }

        MenuView getListMenuView(MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, mx_android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        Parcelable onSaveInstanceState() {
            SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new Bundle();
                this.menu.savePresenterStates(savedState.menuState);
            }
            return savedState;
        }

        void onRestoreInstanceState(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        void applyFrozenState() {
            Bundle bundle;
            MenuBuilder menuBuilder = this.menu;
            if (menuBuilder == null || (bundle = this.frozenMenuState) == null) {
                return;
            }
            menuBuilder.restorePresenterStates(bundle);
            this.frozenMenuState = null;
        }

        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: mx_android.support.v7.app.ActionBarActivityDelegateBase.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.readFromParcel(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private SavedState() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static SavedState readFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                boolean z4 = parcel.readInt() == 1;
                savedState.isOpen = z4;
                if (z4) {
                    savedState.menuState = parcel.readBundle();
                }
                return savedState;
            }
        }
    }

    private class ListMenuDecorView extends FrameLayout {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            Context context = getContext();
            hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
            return __replaced_14555_2_onInterceptTouchEvent(motionEvent);
        }

        public ListMenuDecorView(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return ActionBarActivityDelegateBase.this.dispatchKeyEvent(keyEvent);
        }

        public boolean __replaced_14555_2_onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                ActionBarActivityDelegateBase.this.closePanel(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(TintManager.getDrawable(getContext(), i));
        }

        private boolean isOutOfBounds(int i, int i4) {
            return i < -5 || i4 < -5 || i > getWidth() + 5 || i4 > getHeight() + 5;
        }
    }
}
