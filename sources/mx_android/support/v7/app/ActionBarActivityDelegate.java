package mx_android.support.v7.app;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import mx_android.support.v4.app.ActionBarDrawerToggle;
import mx_android.support.v7.app.ActionBarDrawerToggle;
import mx_android.support.v7.appcompat.R;
import mx_android.support.v7.internal.app.WindowCallback;
import mx_android.support.v7.internal.view.SupportMenuInflater;
import mx_android.support.v7.internal.widget.TintTypedArray;
import mx_android.support.v7.view.ActionMode;
import mx_android.support.v7.widget.Toolbar;

/* JADX INFO: loaded from: classes7.dex */
abstract class ActionBarActivityDelegate {
    static final String METADATA_UI_OPTIONS = "mx_android.support.UI_OPTIONS";
    private static final String TAG = "ActionBarActivityDelegate";
    private ActionBar mActionBar;
    final ActionBarActivity mActivity;
    final WindowCallback mDefaultWindowCallback;
    boolean mHasActionBar;
    private boolean mIsDestroyed;
    boolean mIsFloating;
    private MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private WindowCallback mWindowCallback;

    abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    abstract ActionBar createSupportActionBar();

    abstract View createView(String str, Context context, AttributeSet attributeSet);

    abstract boolean dispatchKeyEvent(KeyEvent keyEvent);

    abstract int getHomeAsUpIndicatorAttrId();

    abstract boolean onBackPressed();

    abstract void onConfigurationChanged(Configuration configuration);

    abstract void onContentChanged();

    abstract boolean onCreatePanelMenu(int i, Menu menu);

    abstract boolean onKeyShortcut(int i, KeyEvent keyEvent);

    abstract boolean onMenuOpened(int i, Menu menu);

    abstract void onPanelClosed(int i, Menu menu);

    abstract void onPostCreate(Bundle bundle);

    abstract void onPostResume();

    abstract boolean onPreparePanel(int i, View view, Menu menu);

    abstract void onStop();

    abstract void onTitleChanged(CharSequence charSequence);

    abstract void setContentView(int i);

    abstract void setContentView(View view);

    abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    abstract void setSupportActionBar(Toolbar toolbar);

    abstract void setSupportProgress(int i);

    abstract void setSupportProgressBarIndeterminate(boolean z4);

    abstract void setSupportProgressBarIndeterminateVisibility(boolean z4);

    abstract void setSupportProgressBarVisibility(boolean z4);

    abstract ActionMode startSupportActionMode(ActionMode.Callback callback);

    abstract ActionMode startSupportActionModeFromWindow(ActionMode.Callback callback);

    abstract void supportInvalidateOptionsMenu();

    abstract boolean supportRequestWindowFeature(int i);

    static ActionBarActivityDelegate createDelegate(ActionBarActivity actionBarActivity) {
        if (Build.VERSION.SDK_INT >= 11) {
            return new ActionBarActivityDelegateHC(actionBarActivity);
        }
        return new ActionBarActivityDelegateBase(actionBarActivity);
    }

    ActionBarActivityDelegate(ActionBarActivity actionBarActivity) {
        WindowCallback windowCallback = new WindowCallback() { // from class: mx_android.support.v7.app.ActionBarActivityDelegate.1
            @Override // mx_android.support.v7.internal.app.WindowCallback
            public boolean onMenuItemSelected(int i, MenuItem menuItem) {
                return ActionBarActivityDelegate.this.mActivity.onMenuItemSelected(i, menuItem);
            }

            @Override // mx_android.support.v7.internal.app.WindowCallback
            public boolean onCreatePanelMenu(int i, Menu menu) {
                return ActionBarActivityDelegate.this.mActivity.superOnCreatePanelMenu(i, menu);
            }

            @Override // mx_android.support.v7.internal.app.WindowCallback
            public boolean onPreparePanel(int i, View view, Menu menu) {
                return ActionBarActivityDelegate.this.mActivity.superOnPreparePanel(i, view, menu);
            }

            @Override // mx_android.support.v7.internal.app.WindowCallback
            public void onPanelClosed(int i, Menu menu) {
                ActionBarActivityDelegate.this.mActivity.onPanelClosed(i, menu);
            }

            @Override // mx_android.support.v7.internal.app.WindowCallback
            public boolean onMenuOpened(int i, Menu menu) {
                return ActionBarActivityDelegate.this.mActivity.onMenuOpened(i, menu);
            }

            @Override // mx_android.support.v7.internal.app.WindowCallback
            public ActionMode startActionMode(ActionMode.Callback callback) {
                return ActionBarActivityDelegate.this.startSupportActionModeFromWindow(callback);
            }

            @Override // mx_android.support.v7.internal.app.WindowCallback
            public View onCreatePanelView(int i) {
                return ActionBarActivityDelegate.this.mActivity.onCreatePanelView(i);
            }
        };
        this.mDefaultWindowCallback = windowCallback;
        this.mActivity = actionBarActivity;
        this.mWindowCallback = windowCallback;
    }

    final ActionBar getSupportActionBar() {
        if (this.mHasActionBar && this.mActionBar == null) {
            this.mActionBar = createSupportActionBar();
        }
        return this.mActionBar;
    }

    final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }

    protected final void setSupportActionBar(ActionBar actionBar) {
        this.mActionBar = actionBar;
    }

    MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            this.mMenuInflater = new SupportMenuInflater(getActionBarThemedContext());
        }
        return this.mMenuInflater;
    }

    void onCreate(Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = this.mActivity.obtainStyledAttributes(R.styleable.Theme);
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.Theme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.Theme_windowActionBar, false)) {
            this.mHasActionBar = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.Theme_windowActionBarOverlay, false)) {
            this.mOverlayActionBar = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.Theme_windowActionModeOverlay, false)) {
            this.mOverlayActionMode = true;
        }
        this.mIsFloating = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Theme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    boolean onPrepareOptionsPanel(View view, Menu menu) {
        if (Build.VERSION.SDK_INT < 16) {
            return this.mActivity.onPrepareOptionsMenu(menu);
        }
        return this.mActivity.superOnPrepareOptionsPanel(view, menu);
    }

    final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }

    final ActionBarDrawerToggle.Delegate getV7DrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }

    final String getUiOptionsFromMetadata() {
        try {
            ActivityInfo activityInfo = this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
            if (activityInfo.metaData != null) {
                return activityInfo.metaData.getString(METADATA_UI_OPTIONS);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "getUiOptionsFromMetadata: Activity '" + this.mActivity.getClass().getSimpleName() + "' not in manifest");
            return null;
        }
    }

    protected final Context getActionBarThemedContext() {
        ActionBar supportActionBar = getSupportActionBar();
        Context themedContext = supportActionBar != null ? supportActionBar.getThemedContext() : null;
        return themedContext == null ? this.mActivity : themedContext;
    }

    private class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate, ActionBarDrawerToggle.Delegate {
        private ActionBarDrawableToggleImpl() {
        }

        @Override // mx_android.support.v7.app.ActionBarDrawerToggle.Delegate, mx_android.support.v4.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), null, new int[]{ActionBarActivityDelegate.this.getHomeAsUpIndicatorAttrId()});
            Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(0);
            tintTypedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // mx_android.support.v7.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return ActionBarActivityDelegate.this.getActionBarThemedContext();
        }

        @Override // mx_android.support.v7.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            ActionBar supportActionBar = ActionBarActivityDelegate.this.getSupportActionBar();
            return (supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // mx_android.support.v7.app.ActionBarDrawerToggle.Delegate, mx_android.support.v4.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            ActionBar supportActionBar = ActionBarActivityDelegate.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // mx_android.support.v7.app.ActionBarDrawerToggle.Delegate, mx_android.support.v4.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            ActionBar supportActionBar = ActionBarActivityDelegate.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i);
            }
        }
    }

    final void setWindowCallback(WindowCallback windowCallback) {
        if (windowCallback == null) {
            throw new IllegalArgumentException("callback can not be null");
        }
        this.mWindowCallback = windowCallback;
    }

    final WindowCallback getWindowCallback() {
        return this.mWindowCallback;
    }

    final void destroy() {
        this.mIsDestroyed = true;
    }

    final boolean isDestroyed() {
        return this.mIsDestroyed;
    }
}
