package mx_android.support.v7.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import mx_android.support.v4.view.ViewCompat;
import mx_android.support.v4.view.ViewPropertyAnimatorCompat;
import mx_android.support.v4.view.ViewPropertyAnimatorListener;
import mx_android.support.v7.appcompat.R;
import mx_android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import mx_android.support.v7.widget.ActionMenuPresenter;
import mx_android.support.v7.widget.ActionMenuView;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbsActionBarView extends ViewGroup {
    private static final int FADE_DURATION = 200;
    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected boolean mSplitActionBar;
    protected ViewGroup mSplitView;
    protected boolean mSplitWhenNarrow;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;

    protected static int next(int i, int i4, boolean z4) {
        return z4 ? i - i4 : i + i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.mPopupContext = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    public void setSplitToolbar(boolean z4) {
        this.mSplitActionBar = z4;
    }

    public void setSplitWhenNarrow(boolean z4) {
        this.mSplitWhenNarrow = z4;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public void setSplitView(ViewGroup viewGroup) {
        this.mSplitView = viewGroup;
    }

    public int getAnimatedVisibility() {
        if (this.mVisibilityAnim != null) {
            return this.mVisAnimListener.mFinalVisibility;
        }
        return getVisibility();
    }

    public void animateToVisibility(int i) {
        ActionMenuView actionMenuView;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mVisibilityAnim;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                ViewCompat.setAlpha(this, 0.0f);
                if (this.mSplitView != null && (actionMenuView = this.mMenuView) != null) {
                    ViewCompat.setAlpha(actionMenuView, 0.0f);
                }
            }
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(this).alpha(1.0f);
            viewPropertyAnimatorCompatAlpha.setDuration(200L);
            viewPropertyAnimatorCompatAlpha.setInterpolator(sAlphaInterpolator);
            if (this.mSplitView != null && this.mMenuView != null) {
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha2 = ViewCompat.animate(this.mMenuView).alpha(1.0f);
                viewPropertyAnimatorCompatAlpha2.setDuration(200L);
                viewPropertyAnimatorCompatSet.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompatAlpha, i));
                viewPropertyAnimatorCompatSet.play(viewPropertyAnimatorCompatAlpha).play(viewPropertyAnimatorCompatAlpha2);
                viewPropertyAnimatorCompatSet.start();
                return;
            }
            viewPropertyAnimatorCompatAlpha.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompatAlpha, i));
            viewPropertyAnimatorCompatAlpha.start();
            return;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha3 = ViewCompat.animate(this).alpha(0.0f);
        viewPropertyAnimatorCompatAlpha3.setDuration(200L);
        viewPropertyAnimatorCompatAlpha3.setInterpolator(sAlphaInterpolator);
        if (this.mSplitView != null && this.mMenuView != null) {
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha4 = ViewCompat.animate(this.mMenuView).alpha(0.0f);
            viewPropertyAnimatorCompatAlpha4.setDuration(200L);
            viewPropertyAnimatorCompatSet2.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompatAlpha3, i));
            viewPropertyAnimatorCompatSet2.play(viewPropertyAnimatorCompatAlpha3).play(viewPropertyAnimatorCompatAlpha4);
            viewPropertyAnimatorCompatSet2.start();
            return;
        }
        viewPropertyAnimatorCompatAlpha3.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorCompatAlpha3, i));
        viewPropertyAnimatorCompatAlpha3.start();
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.showOverflowMenu();
        }
        return false;
    }

    public void postShowOverflowMenu() {
        post(new Runnable() { // from class: mx_android.support.v7.internal.widget.AbsActionBarView.1
            @Override // java.lang.Runnable
            public void run() {
                AbsActionBarView.this.showOverflowMenu();
            }
        });
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowPending();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowReserved();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    protected int measureChildView(View view, int i, int i4, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i4);
        return Math.max(0, (i - view.getMeasuredWidth()) - i6);
    }

    protected int positionChild(View view, int i, int i4, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i4 + ((i6 - measuredHeight) / 2);
        if (z4) {
            view.layout(i - measuredWidth, i10, i, measuredHeight + i10);
        } else {
            view.layout(i, i10, i + measuredWidth, measuredHeight + i10);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    protected class VisibilityAnimListener implements ViewPropertyAnimatorListener {
        private boolean mCanceled = false;
        int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i) {
            AbsActionBarView.this.mVisibilityAnim = viewPropertyAnimatorCompat;
            this.mFinalVisibility = i;
            return this;
        }

        @Override // mx_android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            AbsActionBarView.this.setVisibility(0);
            this.mCanceled = false;
        }

        @Override // mx_android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (this.mCanceled) {
                return;
            }
            AbsActionBarView.this.mVisibilityAnim = null;
            AbsActionBarView.this.setVisibility(this.mFinalVisibility);
            if (AbsActionBarView.this.mSplitView == null || AbsActionBarView.this.mMenuView == null) {
                return;
            }
            AbsActionBarView.this.mMenuView.setVisibility(this.mFinalVisibility);
        }

        @Override // mx_android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }
    }
}
