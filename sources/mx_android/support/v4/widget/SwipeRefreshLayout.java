package mx_android.support.v4.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import androidx.camera.video.AudioStats;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import mx_android.support.v4.view.MotionEventCompat;
import mx_android.support.v4.view.ViewCompat;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeRefreshLayout extends ViewGroup {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    private static final int CIRCLE_BG_LIGHT = -328966;
    private static final int CIRCLE_DIAMETER = 40;
    private static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = {R.attr.enabled};
    private static final String LOG_TAG = "SwipeRefreshLayout";
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private int mCircleHeight;
    private CircleImageView mCircleView;
    private int mCircleViewIndex;
    private int mCircleWidth;
    private int mCurrentTargetOffsetTop;
    private final DecelerateInterpolator mDecelerateInterpolator;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNotify;
    private boolean mOriginalOffsetCalculated;
    protected int mOriginalOffsetTop;
    private MaterialProgressDrawable mProgress;
    private Animation.AnimationListener mRefreshListener;
    private boolean mRefreshing;
    private boolean mReturningToStart;
    private boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    private float mSpinnerFinalOffset;
    private float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private int mTouchSlop;
    private boolean mUsingCustomStart;

    public interface OnRefreshListener {
        void onRefresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return __replaced_14555_1_onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorViewAlpha(int i) {
        this.mCircleView.getBackground().setAlpha(i);
        this.mProgress.setAlpha(i);
    }

    public void setProgressViewOffset(boolean z4, int i, int i4) {
        this.mScale = z4;
        this.mCircleView.setVisibility(8);
        this.mCurrentTargetOffsetTop = i;
        this.mOriginalOffsetTop = i;
        this.mSpinnerFinalOffset = i4;
        this.mUsingCustomStart = true;
        this.mCircleView.invalidate();
    }

    public void setProgressViewEndTarget(boolean z4, int i) {
        this.mSpinnerFinalOffset = i;
        this.mScale = z4;
        this.mCircleView.invalidate();
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i4 = (int) (displayMetrics.density * 56.0f);
                this.mCircleWidth = i4;
                this.mCircleHeight = i4;
            } else {
                int i6 = (int) (displayMetrics.density * 40.0f);
                this.mCircleWidth = i6;
                this.mCircleHeight = i6;
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.updateSizes(i);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mOriginalOffsetCalculated = false;
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new Animation.AnimationListener() { // from class: mx_android.support.v4.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.mRefreshing) {
                    SwipeRefreshLayout.this.mProgress.setAlpha(255);
                    SwipeRefreshLayout.this.mProgress.start();
                    if (SwipeRefreshLayout.this.mNotify && SwipeRefreshLayout.this.mListener != null) {
                        SwipeRefreshLayout.this.mListener.onRefresh();
                    }
                } else {
                    SwipeRefreshLayout.this.mProgress.stop();
                    SwipeRefreshLayout.this.mCircleView.setVisibility(8);
                    SwipeRefreshLayout.this.setColorViewAlpha(255);
                    if (SwipeRefreshLayout.this.mScale) {
                        SwipeRefreshLayout.this.setAnimationProgress(0.0f);
                    } else {
                        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                        swipeRefreshLayout.setTargetOffsetTopAndBottom(swipeRefreshLayout.mOriginalOffsetTop - SwipeRefreshLayout.this.mCurrentTargetOffsetTop, true);
                    }
                }
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                swipeRefreshLayout2.mCurrentTargetOffsetTop = swipeRefreshLayout2.mCircleView.getTop();
            }
        };
        this.mAnimateToCorrectPosition = new Animation() { // from class: mx_android.support.v4.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((SwipeRefreshLayout.this.mFrom + ((int) ((((int) (!SwipeRefreshLayout.this.mUsingCustomStart ? SwipeRefreshLayout.this.mSpinnerFinalOffset - Math.abs(SwipeRefreshLayout.this.mOriginalOffsetTop) : SwipeRefreshLayout.this.mSpinnerFinalOffset)) - SwipeRefreshLayout.this.mFrom) * f))) - SwipeRefreshLayout.this.mCircleView.getTop(), false);
                SwipeRefreshLayout.this.mProgress.setArrowScale(1.0f - f);
            }
        };
        this.mAnimateToStartPosition = new Animation() { // from class: mx_android.support.v4.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.moveToStart(f);
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleWidth = (int) (displayMetrics.density * 40.0f);
        this.mCircleHeight = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        float f = displayMetrics.density * 64.0f;
        this.mSpinnerFinalOffset = f;
        this.mTotalDragDistance = f;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i4) {
        int i6 = this.mCircleViewIndex;
        return i6 < 0 ? i4 : i4 == i + (-1) ? i6 : i4 >= i6 ? i4 + 1 : i4;
    }

    private void createProgressView() {
        this.mCircleView = new CircleImageView(getContext(), CIRCLE_BG_LIGHT, 20.0f);
        MaterialProgressDrawable materialProgressDrawable = new MaterialProgressDrawable(getContext(), this);
        this.mProgress = materialProgressDrawable;
        materialProgressDrawable.setBackgroundColor(CIRCLE_BG_LIGHT);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    public void setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.mListener = onRefreshListener;
    }

    private boolean isAlphaUsedForScale() {
        return Build.VERSION.SDK_INT < 11;
    }

    public void setRefreshing(boolean z4) {
        float f;
        if (z4 && this.mRefreshing != z4) {
            this.mRefreshing = z4;
            if (!this.mUsingCustomStart) {
                f = this.mSpinnerFinalOffset + this.mOriginalOffsetTop;
            } else {
                f = this.mSpinnerFinalOffset;
            }
            setTargetOffsetTopAndBottom(((int) f) - this.mCurrentTargetOffsetTop, true);
            this.mNotify = false;
            startScaleUpAnimation(this.mRefreshListener);
            return;
        }
        setRefreshing(z4, false);
    }

    private void startScaleUpAnimation(Animation.AnimationListener animationListener) {
        this.mCircleView.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.mProgress.setAlpha(255);
        }
        Animation animation = new Animation() { // from class: mx_android.support.v4.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.mScaleAnimation = animation;
        animation.setDuration(this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f) {
        if (isAlphaUsedForScale()) {
            setColorViewAlpha((int) (f * 255.0f));
        } else {
            ViewCompat.setScaleX(this.mCircleView, f);
            ViewCompat.setScaleY(this.mCircleView, f);
        }
    }

    private void setRefreshing(boolean z4, boolean z5) {
        if (this.mRefreshing != z4) {
            this.mNotify = z5;
            ensureTarget();
            this.mRefreshing = z4;
            if (z4) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            } else {
                startScaleDownAnimation(this.mRefreshListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        Animation animation = new Animation() { // from class: mx_android.support.v4.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.mScaleDownAnimation = animation;
        animation.setDuration(150L);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }

    private Animation startAlphaAnimation(final int i, final int i4) {
        if (this.mScale && isAlphaUsedForScale()) {
            return null;
        }
        Animation animation = new Animation() { // from class: mx_android.support.v4.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.mProgress.setAlpha((int) (i + ((i4 - r0) * f)));
            }
        };
        animation.setDuration(300L);
        this.mCircleView.setAnimationListener(null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(animation);
        return animation;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.mCircleView.setBackgroundColor(i);
        this.mProgress.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        ensureTarget();
        this.mProgress.setColorSchemeColors(iArr);
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    private void ensureTarget() {
        if (this.mTarget == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.mTotalDragDistance = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.mCircleView.getMeasuredWidth();
        int measuredHeight2 = this.mCircleView.getMeasuredHeight();
        int i11 = measuredWidth / 2;
        int i12 = measuredWidth2 / 2;
        int i13 = this.mCurrentTargetOffsetTop;
        this.mCircleView.layout(i11 - i12, i13, i11 + i12, measuredHeight2 + i13);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleHeight, 1073741824));
        if (!this.mUsingCustomStart && !this.mOriginalOffsetCalculated) {
            this.mOriginalOffsetCalculated = true;
            int i6 = -this.mCircleView.getMeasuredHeight();
            this.mOriginalOffsetTop = i6;
            this.mCurrentTargetOffsetTop = i6;
        }
        this.mCircleViewIndex = -1;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) == this.mCircleView) {
                this.mCircleViewIndex = i10;
                return;
            }
        }
    }

    public int getProgressCircleDiameter() {
        CircleImageView circleImageView = this.mCircleView;
        if (circleImageView != null) {
            return circleImageView.getMeasuredHeight();
        }
        return 0;
    }

    public boolean canChildScrollUp() {
        if (Build.VERSION.SDK_INT < 14) {
            View view = this.mTarget;
            if (!(view instanceof AbsListView)) {
                return view.getScrollY() > 0;
            }
            AbsListView absListView = (AbsListView) view;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
        return ViewCompat.canScrollVertically(this.mTarget, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean __replaced_14555_1_onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r6.ensureTarget()
            int r0 = mx_android.support.v4.view.MotionEventCompat.getActionMasked(r7)
            boolean r1 = r6.mReturningToStart
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r6.mReturningToStart = r2
        L10:
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L94
            boolean r1 = r6.mReturningToStart
            if (r1 != 0) goto L94
            boolean r1 = r6.canChildScrollUp()
            if (r1 != 0) goto L94
            boolean r1 = r6.mRefreshing
            if (r1 == 0) goto L26
            goto L94
        L26:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1
            if (r0 == 0) goto L72
            r4 = -1
            if (r0 == r3) goto L6d
            r5 = 2
            if (r0 == r5) goto L3c
            r1 = 3
            if (r0 == r1) goto L6d
            r1 = 6
            if (r0 == r1) goto L38
            goto L91
        L38:
            r6.onSecondaryPointerUp(r7)
            goto L91
        L3c:
            int r0 = r6.mActivePointerId
            if (r0 != r4) goto L48
            java.lang.String r7 = mx_android.support.v4.widget.SwipeRefreshLayout.LOG_TAG
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r7, r0)
            return r2
        L48:
            float r7 = r6.getMotionEventY(r7, r0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L51
            return r2
        L51:
            float r0 = r6.mInitialDownY
            float r7 = r7 - r0
            int r1 = r6.mTouchSlop
            float r2 = (float) r1
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L91
            boolean r7 = r6.mIsBeingDragged
            if (r7 != 0) goto L91
            float r7 = (float) r1
            float r0 = r0 + r7
            r6.mInitialMotionY = r0
            r6.mIsBeingDragged = r3
            mx_android.support.v4.widget.MaterialProgressDrawable r7 = r6.mProgress
            r0 = 76
            r7.setAlpha(r0)
            goto L91
        L6d:
            r6.mIsBeingDragged = r2
            r6.mActivePointerId = r4
            goto L91
        L72:
            int r0 = r6.mOriginalOffsetTop
            mx_android.support.v4.widget.CircleImageView r4 = r6.mCircleView
            int r4 = r4.getTop()
            int r0 = r0 - r4
            r6.setTargetOffsetTopAndBottom(r0, r3)
            int r0 = mx_android.support.v4.view.MotionEventCompat.getPointerId(r7, r2)
            r6.mActivePointerId = r0
            r6.mIsBeingDragged = r2
            float r7 = r6.getMotionEventY(r7, r0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L8f
            return r2
        L8f:
            r6.mInitialDownY = r7
        L91:
            boolean r7 = r6.mIsBeingDragged
            return r7
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mx_android.support.v4.widget.SwipeRefreshLayout.__replaced_14555_1_onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private float getMotionEventY(MotionEvent motionEvent, int i) {
        int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (iFindPointerIndex < 0) {
            return -1.0f;
        }
        return MotionEventCompat.getY(motionEvent, iFindPointerIndex);
    }

    private boolean isAnimationRunning(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp()) {
            return false;
        }
        if (actionMasked == 0) {
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            this.mIsBeingDragged = false;
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                    if (iFindPointerIndex < 0) {
                        Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y7 = (MotionEventCompat.getY(motionEvent, iFindPointerIndex) - this.mInitialMotionY) * 0.5f;
                    if (this.mIsBeingDragged) {
                        this.mProgress.showArrow(true);
                        float f = y7 / this.mTotalDragDistance;
                        if (f < 0.0f) {
                            return false;
                        }
                        float fMin = Math.min(1.0f, Math.abs(f));
                        double d10 = fMin;
                        Double.isNaN(d10);
                        float fMax = (((float) Math.max(d10 - 0.4d, AudioStats.AUDIO_AMPLITUDE_NONE)) * 5.0f) / 3.0f;
                        float fAbs = Math.abs(y7) - this.mTotalDragDistance;
                        float f3 = this.mUsingCustomStart ? this.mSpinnerFinalOffset - this.mOriginalOffsetTop : this.mSpinnerFinalOffset;
                        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
                        double dPow = Math.pow(dMax, 2.0d);
                        Double.isNaN(dMax);
                        float f7 = ((float) (dMax - dPow)) * 2.0f;
                        int i = this.mOriginalOffsetTop + ((int) ((f3 * fMin) + (f3 * f7 * 2.0f)));
                        if (this.mCircleView.getVisibility() != 0) {
                            this.mCircleView.setVisibility(0);
                        }
                        if (!this.mScale) {
                            ViewCompat.setScaleX(this.mCircleView, 1.0f);
                            ViewCompat.setScaleY(this.mCircleView, 1.0f);
                        }
                        float f10 = this.mTotalDragDistance;
                        if (y7 < f10) {
                            if (this.mScale) {
                                setAnimationProgress(y7 / f10);
                            }
                            if (this.mProgress.getAlpha() > 76 && !isAnimationRunning(this.mAlphaStartAnimation)) {
                                startProgressAlphaStartAnimation();
                            }
                            this.mProgress.setStartEndTrim(0.0f, Math.min(MAX_PROGRESS_ANGLE, fMax * MAX_PROGRESS_ANGLE));
                            this.mProgress.setArrowScale(Math.min(1.0f, fMax));
                        } else if (this.mProgress.getAlpha() < 255 && !isAnimationRunning(this.mAlphaMaxAnimation)) {
                            startProgressAlphaMaxAnimation();
                        }
                        this.mProgress.setProgressRotation((((fMax * 0.4f) - 0.25f) + (f7 * 2.0f)) * 0.5f);
                        setTargetOffsetTopAndBottom(i - this.mCurrentTargetOffsetTop, true);
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                    } else if (actionMasked == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            int i4 = this.mActivePointerId;
            if (i4 == -1) {
                if (actionMasked == 1) {
                    Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                }
                return false;
            }
            float y10 = (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, i4)) - this.mInitialMotionY) * 0.5f;
            this.mIsBeingDragged = false;
            if (y10 > this.mTotalDragDistance) {
                setRefreshing(true, true);
            } else {
                this.mRefreshing = false;
                this.mProgress.setStartEndTrim(0.0f, 0.0f);
                animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, this.mScale ? null : new Animation.AnimationListener() { // from class: mx_android.support.v4.widget.SwipeRefreshLayout.5
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        if (SwipeRefreshLayout.this.mScale) {
                            return;
                        }
                        SwipeRefreshLayout.this.startScaleDownAnimation(null);
                    }
                });
                this.mProgress.showArrow(false);
            }
            this.mActivePointerId = -1;
            return false;
        }
        return true;
    }

    private void animateOffsetToCorrectPosition(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200L);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i, animationListener);
            return;
        }
        this.mFrom = i;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200L);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveToStart(float f) {
        setTargetOffsetTopAndBottom((this.mFrom + ((int) ((this.mOriginalOffsetTop - r0) * f))) - this.mCircleView.getTop(), false);
    }

    private void startScaleDownReturnToStartAnimation(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        if (isAlphaUsedForScale()) {
            this.mStartingScale = this.mProgress.getAlpha();
        } else {
            this.mStartingScale = ViewCompat.getScaleX(this.mCircleView);
        }
        Animation animation = new Animation() { // from class: mx_android.support.v4.widget.SwipeRefreshLayout.8
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.mStartingScale + ((-SwipeRefreshLayout.this.mStartingScale) * f));
                SwipeRefreshLayout.this.moveToStart(f);
            }
        };
        this.mScaleDownToStartAnimation = animation;
        animation.setDuration(150L);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetOffsetTopAndBottom(int i, boolean z4) {
        this.mCircleView.bringToFront();
        this.mCircleView.offsetTopAndBottom(i);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
        if (!z4 || Build.VERSION.SDK_INT >= 11) {
            return;
        }
        invalidate();
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex == 0 ? 1 : 0);
        }
    }
}
