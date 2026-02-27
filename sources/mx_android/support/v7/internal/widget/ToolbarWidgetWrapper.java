package mx_android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SpinnerAdapter;
import mx_android.support.v4.view.ViewCompat;
import mx_android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import mx_android.support.v7.appcompat.R;
import mx_android.support.v7.internal.app.WindowCallback;
import mx_android.support.v7.internal.view.menu.ActionMenuItem;
import mx_android.support.v7.internal.view.menu.MenuBuilder;
import mx_android.support.v7.internal.view.menu.MenuPresenter;
import mx_android.support.v7.internal.widget.AdapterViewCompat;
import mx_android.support.v7.widget.ActionMenuPresenter;
import mx_android.support.v7.widget.Toolbar;

/* JADX INFO: loaded from: classes7.dex */
public class ToolbarWidgetWrapper implements DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final String TAG = "ToolbarWidgetWrapper";
    private ActionMenuPresenter mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    private boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private SpinnerCompat mSpinner;
    private CharSequence mSubtitle;
    private View mTabView;
    private final TintManager mTintManager;
    private CharSequence mTitle;
    private boolean mTitleSet;
    private Toolbar mToolbar;
    private WindowCallback mWindowCallback;

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean canSplit() {
        return false;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean isSplit() {
        return false;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean z4) {
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setSplitView(ViewGroup viewGroup) {
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setSplitWhenNarrow(boolean z4) {
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z4) {
        this(toolbar, z4, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_mtrl_am_alpha);
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z4, int i, int i4) {
        this.mNavigationMode = 0;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = toolbar;
        this.mTitle = toolbar.getTitle();
        this.mSubtitle = toolbar.getSubtitle();
        this.mTitleSet = this.mTitle != null;
        this.mNavIcon = this.mToolbar.getNavigationIcon();
        if (z4) {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
            CharSequence text = tintTypedArrayObtainStyledAttributes.getText(R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = tintTypedArrayObtainStyledAttributes.getText(R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_logo);
            if (drawable != null) {
                setLogo(drawable);
            }
            Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_icon);
            if (drawable2 != null) {
                setIcon(drawable2);
            }
            Drawable drawable3 = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_homeAsUpIndicator);
            if (drawable3 != null) {
                setNavigationIcon(drawable3);
            }
            setDisplayOptions(tintTypedArrayObtainStyledAttributes.getInt(R.styleable.ActionBar_displayOptions, 0));
            int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(this.mToolbar.getContext()).inflate(resourceId, (ViewGroup) this.mToolbar, false));
                setDisplayOptions(this.mDisplayOpts | 16);
            }
            int layoutDimension = tintTypedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.mToolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.mToolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.mToolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.mToolbar;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.mToolbar;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                this.mToolbar.setPopupTheme(resourceId4);
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            this.mTintManager = tintTypedArrayObtainStyledAttributes.getTintManager();
        } else {
            this.mDisplayOpts = detectDisplayOptions();
            this.mTintManager = new TintManager(toolbar.getContext());
        }
        setDefaultNavigationContentDescription(i);
        this.mHomeDescription = this.mToolbar.getNavigationContentDescription();
        setDefaultNavigationIcon(this.mTintManager.getDrawable(i4));
        this.mToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: mx_android.support.v7.internal.widget.ToolbarWidgetWrapper.1
            final ActionMenuItem mNavItem;

            {
                this.mNavItem = new ActionMenuItem(ToolbarWidgetWrapper.this.mToolbar.getContext(), 0, android.R.id.home, 0, 0, ToolbarWidgetWrapper.this.mTitle);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ToolbarWidgetWrapper.this.mWindowCallback == null || !ToolbarWidgetWrapper.this.mMenuPrepared) {
                    return;
                }
                ToolbarWidgetWrapper.this.mWindowCallback.onMenuItemSelected(0, this.mNavItem);
            }
        });
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int i) {
        if (i == this.mDefaultNavigationContentDescription) {
            return;
        }
        this.mDefaultNavigationContentDescription = i;
        if (TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
            setNavigationContentDescription(this.mDefaultNavigationContentDescription);
        }
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.mDefaultNavigationIcon != drawable) {
            this.mDefaultNavigationIcon = drawable;
            updateNavigationIcon();
        }
    }

    private int detectDisplayOptions() {
        return this.mToolbar.getNavigationIcon() != null ? 15 : 11;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public ViewGroup getViewGroup() {
        return this.mToolbar;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public Context getContext() {
        return this.mToolbar.getContext();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setWindowCallback(WindowCallback windowCallback) {
        this.mWindowCallback = windowCallback;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence) {
        if (this.mTitleSet) {
            return;
        }
        setTitleInt(charSequence);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public CharSequence getTitle() {
        return this.mToolbar.getTitle();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setTitle(CharSequence charSequence) {
        this.mTitleSet = true;
        setTitleInt(charSequence);
    }

    private void setTitleInt(CharSequence charSequence) {
        this.mTitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setTitle(charSequence);
        }
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public CharSequence getSubtitle() {
        return this.mToolbar.getSubtitle();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setSubtitle(charSequence);
        }
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void initProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void initIndeterminateProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setSplitToolbar(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("Cannot split an android.widget.Toolbar");
        }
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean hasIcon() {
        return this.mIcon != null;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean hasLogo() {
        return this.mLogo != null;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setIcon(int i) {
        setIcon(i != 0 ? this.mTintManager.getDrawable(i) : null);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        updateToolbarLogo();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setLogo(int i) {
        setLogo(i != 0 ? this.mTintManager.getDrawable(i) : null);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setLogo(Drawable drawable) {
        this.mLogo = drawable;
        updateToolbarLogo();
    }

    private void updateToolbarLogo() {
        Drawable drawable;
        int i = this.mDisplayOpts;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.mLogo) == null) {
            drawable = this.mIcon;
        }
        this.mToolbar.setLogo(drawable);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        if (this.mActionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.mToolbar.getContext());
            this.mActionMenuPresenter = actionMenuPresenter;
            actionMenuPresenter.setId(R.id.action_menu_presenter);
        }
        this.mActionMenuPresenter.setCallback(callback);
        this.mToolbar.setMenu((MenuBuilder) menu, this.mActionMenuPresenter);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setDisplayOptions(int i) {
        View view;
        int i4 = this.mDisplayOpts ^ i;
        this.mDisplayOpts = i;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i & 4) != 0) {
                    updateNavigationIcon();
                    updateHomeAccessibility();
                } else {
                    this.mToolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                updateToolbarLogo();
            }
            if ((i4 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.mToolbar.setTitle(this.mTitle);
                    this.mToolbar.setSubtitle(this.mSubtitle);
                } else {
                    this.mToolbar.setTitle((CharSequence) null);
                    this.mToolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.mCustomView) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.mToolbar.addView(view);
            } else {
                this.mToolbar.removeView(view);
            }
        }
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.mTabView;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.mToolbar;
            if (parent == toolbar) {
                toolbar.removeView(this.mTabView);
            }
        }
        this.mTabView = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.mNavigationMode != 2) {
            return;
        }
        this.mToolbar.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.mTabView.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
        return this.mTabView != null;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public boolean isTitleTruncated() {
        return this.mToolbar.isTitleTruncated();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setCollapsible(boolean z4) {
        this.mToolbar.setCollapsible(z4);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setNavigationMode(int i) {
        View view;
        int i4 = this.mNavigationMode;
        if (i != i4) {
            if (i4 == 1) {
                SpinnerCompat spinnerCompat = this.mSpinner;
                if (spinnerCompat != null) {
                    ViewParent parent = spinnerCompat.getParent();
                    Toolbar toolbar = this.mToolbar;
                    if (parent == toolbar) {
                        toolbar.removeView(this.mSpinner);
                    }
                }
            } else if (i4 == 2 && (view = this.mTabView) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.mToolbar;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.mTabView);
                }
            }
            this.mNavigationMode = i;
            if (i != 0) {
                if (i == 1) {
                    ensureSpinner();
                    this.mToolbar.addView(this.mSpinner, 0);
                    return;
                }
                if (i == 2) {
                    View view2 = this.mTabView;
                    if (view2 != null) {
                        this.mToolbar.addView(view2, 0);
                        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.mTabView.getLayoutParams();
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        layoutParams.gravity = 8388691;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid navigation mode " + i);
            }
        }
    }

    private void ensureSpinner() {
        if (this.mSpinner == null) {
            this.mSpinner = new SpinnerCompat(getContext(), null, R.attr.actionDropDownStyle);
            this.mSpinner.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterViewCompat.OnItemSelectedListener onItemSelectedListener) {
        ensureSpinner();
        this.mSpinner.setAdapter(spinnerAdapter);
        this.mSpinner.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setDropdownSelectedPosition(int i) {
        SpinnerCompat spinnerCompat = this.mSpinner;
        if (spinnerCompat == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinnerCompat.setSelection(i);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
        SpinnerCompat spinnerCompat = this.mSpinner;
        if (spinnerCompat != null) {
            return spinnerCompat.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public int getDropdownItemCount() {
        SpinnerCompat spinnerCompat = this.mSpinner;
        if (spinnerCompat != null) {
            return spinnerCompat.getCount();
        }
        return 0;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setCustomView(View view) {
        View view2 = this.mCustomView;
        if (view2 != null && (this.mDisplayOpts & 16) != 0) {
            this.mToolbar.removeView(view2);
        }
        this.mCustomView = view;
        if (view == null || (this.mDisplayOpts & 16) == 0) {
            return;
        }
        this.mToolbar.addView(view);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public View getCustomView() {
        return this.mCustomView;
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void animateToVisibility(int i) {
        if (i == 8) {
            ViewCompat.animate(this.mToolbar).alpha(0.0f).setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: mx_android.support.v7.internal.widget.ToolbarWidgetWrapper.2
                private boolean mCanceled = false;

                @Override // mx_android.support.v4.view.ViewPropertyAnimatorListenerAdapter, mx_android.support.v4.view.ViewPropertyAnimatorListener
                public void onAnimationEnd(View view) {
                    if (this.mCanceled) {
                        return;
                    }
                    ToolbarWidgetWrapper.this.mToolbar.setVisibility(8);
                }

                @Override // mx_android.support.v4.view.ViewPropertyAnimatorListenerAdapter, mx_android.support.v4.view.ViewPropertyAnimatorListener
                public void onAnimationCancel(View view) {
                    this.mCanceled = true;
                }
            });
        } else if (i == 0) {
            ViewCompat.animate(this.mToolbar).alpha(1.0f).setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: mx_android.support.v7.internal.widget.ToolbarWidgetWrapper.3
                @Override // mx_android.support.v4.view.ViewPropertyAnimatorListenerAdapter, mx_android.support.v4.view.ViewPropertyAnimatorListener
                public void onAnimationStart(View view) {
                    ToolbarWidgetWrapper.this.mToolbar.setVisibility(0);
                }
            });
        }
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setNavigationIcon(Drawable drawable) {
        this.mNavIcon = drawable;
        updateNavigationIcon();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setNavigationIcon(int i) {
        setNavigationIcon(i != 0 ? this.mTintManager.getDrawable(i) : null);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setNavigationContentDescription(CharSequence charSequence) {
        this.mHomeDescription = charSequence;
        updateHomeAccessibility();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i == 0 ? null : getContext().getString(i));
    }

    private void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 4) != 0) {
            if (TextUtils.isEmpty(this.mHomeDescription)) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            } else {
                this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
            }
        }
    }

    private void updateNavigationIcon() {
        if ((this.mDisplayOpts & 4) != 0) {
            Toolbar toolbar = this.mToolbar;
            Drawable drawable = this.mNavIcon;
            if (drawable == null) {
                drawable = this.mDefaultNavigationIcon;
            }
            toolbar.setNavigationIcon(drawable);
        }
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.saveHierarchyState(sparseArray);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.restoreHierarchyState(sparseArray);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setBackgroundDrawable(Drawable drawable) {
        this.mToolbar.setBackgroundDrawable(drawable);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public int getHeight() {
        return this.mToolbar.getHeight();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setVisibility(int i) {
        this.mToolbar.setVisibility(i);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public int getVisibility() {
        return this.mToolbar.getVisibility();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mToolbar.setMenuCallbacks(callback, callback2);
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public Menu getMenu() {
        return this.mToolbar.getMenu();
    }

    @Override // mx_android.support.v7.internal.widget.DecorToolbar
    public int getPopupTheme() {
        return this.mToolbar.getPopupTheme();
    }
}
