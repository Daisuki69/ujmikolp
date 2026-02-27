package mx_android.support.v4.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public class GestureDetectorCompat {
    private final GestureDetectorCompatImpl mImpl;

    interface GestureDetectorCompatImpl {
        boolean isLongpressEnabled();

        boolean onTouchEvent(MotionEvent motionEvent);

        void setIsLongpressEnabled(boolean z4);

        void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    static class GestureDetectorCompatImplBase implements GestureDetectorCompatImpl {
        private static final int LONG_PRESS = 2;
        private static final int SHOW_PRESS = 1;
        private static final int TAP = 3;
        private boolean mAlwaysInBiggerTapRegion;
        private boolean mAlwaysInTapRegion;
        private MotionEvent mCurrentDownEvent;
        private boolean mDeferConfirmSingleTap;
        private GestureDetector.OnDoubleTapListener mDoubleTapListener;
        private int mDoubleTapSlopSquare;
        private float mDownFocusX;
        private float mDownFocusY;
        private final Handler mHandler;
        private boolean mInLongPress;
        private boolean mIsDoubleTapping;
        private boolean mIsLongpressEnabled;
        private float mLastFocusX;
        private float mLastFocusY;
        private final GestureDetector.OnGestureListener mListener;
        private int mMaximumFlingVelocity;
        private int mMinimumFlingVelocity;
        private MotionEvent mPreviousUpEvent;
        private boolean mStillDown;
        private int mTouchSlopSquare;
        private VelocityTracker mVelocityTracker;
        private static final int LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
        private static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
        private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();

        private class GestureHandler extends Handler {
            GestureHandler() {
            }

            GestureHandler(Handler handler) {
                super(handler.getLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    GestureDetectorCompatImplBase.this.mListener.onShowPress(GestureDetectorCompatImplBase.this.mCurrentDownEvent);
                    return;
                }
                if (i == 2) {
                    GestureDetectorCompatImplBase.this.dispatchLongPress();
                    return;
                }
                if (i == 3) {
                    if (GestureDetectorCompatImplBase.this.mDoubleTapListener != null) {
                        if (!GestureDetectorCompatImplBase.this.mStillDown) {
                            GestureDetectorCompatImplBase.this.mDoubleTapListener.onSingleTapConfirmed(GestureDetectorCompatImplBase.this.mCurrentDownEvent);
                            return;
                        } else {
                            GestureDetectorCompatImplBase.this.mDeferConfirmSingleTap = true;
                            return;
                        }
                    }
                    return;
                }
                throw new RuntimeException("Unknown message " + message);
            }
        }

        public GestureDetectorCompatImplBase(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.mHandler = new GestureHandler(handler);
            } else {
                this.mHandler = new GestureHandler();
            }
            this.mListener = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            init(context);
        }

        private void init(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.mListener == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.mIsLongpressEnabled = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
            this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
            this.mDoubleTapSlopSquare = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        @Override // mx_android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.mDoubleTapListener = onDoubleTapListener;
        }

        @Override // mx_android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setIsLongpressEnabled(boolean z4) {
            this.mIsLongpressEnabled = z4;
        }

        @Override // mx_android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean isLongpressEnabled() {
            return this.mIsLongpressEnabled;
        }

        @Override // mx_android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int i = action & 255;
            boolean z4 = i == 6;
            int actionIndex = z4 ? MotionEventCompat.getActionIndex(motionEvent) : -1;
            int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
            float x6 = 0.0f;
            float y7 = 0.0f;
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (actionIndex != i4) {
                    x6 += MotionEventCompat.getX(motionEvent, i4);
                    y7 += MotionEventCompat.getY(motionEvent, i4);
                }
            }
            float f = z4 ? pointerCount - 1 : pointerCount;
            float f3 = x6 / f;
            float f7 = y7 / f;
            if (i == 0) {
                if (this.mDoubleTapListener == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.mHandler.hasMessages(3);
                    if (zHasMessages) {
                        this.mHandler.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.mCurrentDownEvent;
                    if (motionEvent3 != null && (motionEvent2 = this.mPreviousUpEvent) != null && zHasMessages && isConsideredDoubleTap(motionEvent3, motionEvent2, motionEvent)) {
                        this.mIsDoubleTapping = true;
                        zOnDoubleTap = this.mDoubleTapListener.onDoubleTap(this.mCurrentDownEvent) | false | this.mDoubleTapListener.onDoubleTapEvent(motionEvent);
                    } else {
                        this.mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
                        zOnDoubleTap = false;
                    }
                }
                this.mLastFocusX = f3;
                this.mDownFocusX = f3;
                this.mLastFocusY = f7;
                this.mDownFocusY = f7;
                MotionEvent motionEvent4 = this.mCurrentDownEvent;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.mCurrentDownEvent = MotionEvent.obtain(motionEvent);
                this.mAlwaysInTapRegion = true;
                this.mAlwaysInBiggerTapRegion = true;
                this.mStillDown = true;
                this.mInLongPress = false;
                this.mDeferConfirmSingleTap = false;
                if (this.mIsLongpressEnabled) {
                    this.mHandler.removeMessages(2);
                    this.mHandler.sendEmptyMessageAtTime(2, this.mCurrentDownEvent.getDownTime() + ((long) TAP_TIMEOUT) + ((long) LONGPRESS_TIMEOUT));
                }
                this.mHandler.sendEmptyMessageAtTime(1, this.mCurrentDownEvent.getDownTime() + ((long) TAP_TIMEOUT));
                return zOnDoubleTap | this.mListener.onDown(motionEvent);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        cancel();
                        return false;
                    }
                    if (i == 5) {
                        this.mLastFocusX = f3;
                        this.mDownFocusX = f3;
                        this.mLastFocusY = f7;
                        this.mDownFocusY = f7;
                        cancelTaps();
                        return false;
                    }
                    if (i != 6) {
                        return false;
                    }
                    this.mLastFocusX = f3;
                    this.mDownFocusX = f3;
                    this.mLastFocusY = f7;
                    this.mDownFocusY = f7;
                    this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
                    int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                    int pointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex2);
                    float xVelocity = VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, pointerId);
                    float yVelocity = VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, pointerId);
                    for (int i6 = 0; i6 < pointerCount; i6++) {
                        if (i6 != actionIndex2) {
                            int pointerId2 = MotionEventCompat.getPointerId(motionEvent, i6);
                            if ((VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, pointerId2) * xVelocity) + (VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, pointerId2) * yVelocity) < 0.0f) {
                                this.mVelocityTracker.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                }
                if (this.mInLongPress) {
                    return false;
                }
                float f10 = this.mLastFocusX - f3;
                float f11 = this.mLastFocusY - f7;
                if (this.mIsDoubleTapping) {
                    return false | this.mDoubleTapListener.onDoubleTapEvent(motionEvent);
                }
                if (!this.mAlwaysInTapRegion) {
                    if (Math.abs(f10) < 1.0f && Math.abs(f11) < 1.0f) {
                        return false;
                    }
                    boolean zOnScroll = this.mListener.onScroll(this.mCurrentDownEvent, motionEvent, f10, f11);
                    this.mLastFocusX = f3;
                    this.mLastFocusY = f7;
                    return zOnScroll;
                }
                int i10 = (int) (f3 - this.mDownFocusX);
                int i11 = (int) (f7 - this.mDownFocusY);
                int i12 = (i10 * i10) + (i11 * i11);
                if (i12 > this.mTouchSlopSquare) {
                    zOnFling = this.mListener.onScroll(this.mCurrentDownEvent, motionEvent, f10, f11);
                    this.mLastFocusX = f3;
                    this.mLastFocusY = f7;
                    this.mAlwaysInTapRegion = false;
                    this.mHandler.removeMessages(3);
                    this.mHandler.removeMessages(1);
                    this.mHandler.removeMessages(2);
                } else {
                    zOnFling = false;
                }
                if (i12 > this.mTouchSlopSquare) {
                    this.mAlwaysInBiggerTapRegion = false;
                }
            } else {
                this.mStillDown = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.mIsDoubleTapping) {
                    zOnFling = this.mDoubleTapListener.onDoubleTapEvent(motionEvent) | false;
                } else {
                    if (this.mInLongPress) {
                        this.mHandler.removeMessages(3);
                        this.mInLongPress = false;
                    } else if (this.mAlwaysInTapRegion) {
                        boolean zOnSingleTapUp = this.mListener.onSingleTapUp(motionEvent);
                        if (this.mDeferConfirmSingleTap && (onDoubleTapListener = this.mDoubleTapListener) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.mVelocityTracker;
                        int pointerId3 = MotionEventCompat.getPointerId(motionEvent, 0);
                        velocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
                        float yVelocity2 = VelocityTrackerCompat.getYVelocity(velocityTracker, pointerId3);
                        float xVelocity2 = VelocityTrackerCompat.getXVelocity(velocityTracker, pointerId3);
                        if (Math.abs(yVelocity2) > this.mMinimumFlingVelocity || Math.abs(xVelocity2) > this.mMinimumFlingVelocity) {
                            zOnFling = this.mListener.onFling(this.mCurrentDownEvent, motionEvent, xVelocity2, yVelocity2);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.mPreviousUpEvent;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.mPreviousUpEvent = motionEventObtain;
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.mVelocityTracker = null;
                }
                this.mIsDoubleTapping = false;
                this.mDeferConfirmSingleTap = false;
                this.mHandler.removeMessages(1);
                this.mHandler.removeMessages(2);
            }
            return zOnFling;
        }

        private void cancel() {
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            this.mIsDoubleTapping = false;
            this.mStillDown = false;
            this.mAlwaysInTapRegion = false;
            this.mAlwaysInBiggerTapRegion = false;
            this.mDeferConfirmSingleTap = false;
            if (this.mInLongPress) {
                this.mInLongPress = false;
            }
        }

        private void cancelTaps() {
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.mIsDoubleTapping = false;
            this.mAlwaysInTapRegion = false;
            this.mAlwaysInBiggerTapRegion = false;
            this.mDeferConfirmSingleTap = false;
            if (this.mInLongPress) {
                this.mInLongPress = false;
            }
        }

        private boolean isConsideredDoubleTap(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.mAlwaysInBiggerTapRegion || motionEvent3.getEventTime() - motionEvent2.getEventTime() > DOUBLE_TAP_TIMEOUT) {
                return false;
            }
            int x6 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y7 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x6 * x6) + (y7 * y7) < this.mDoubleTapSlopSquare;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dispatchLongPress() {
            this.mHandler.removeMessages(3);
            this.mDeferConfirmSingleTap = false;
            this.mInLongPress = true;
            this.mListener.onLongPress(this.mCurrentDownEvent);
        }
    }

    static class GestureDetectorCompatImplJellybeanMr2 implements GestureDetectorCompatImpl {
        private final GestureDetector mDetector;

        public GestureDetectorCompatImplJellybeanMr2(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.mDetector = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // mx_android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean isLongpressEnabled() {
            return this.mDetector.isLongpressEnabled();
        }

        @Override // mx_android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.mDetector.onTouchEvent(motionEvent);
        }

        @Override // mx_android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setIsLongpressEnabled(boolean z4) {
            this.mDetector.setIsLongpressEnabled(z4);
        }

        @Override // mx_android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.mDetector.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.mImpl = new GestureDetectorCompatImplJellybeanMr2(context, onGestureListener, handler);
        } else {
            this.mImpl = new GestureDetectorCompatImplBase(context, onGestureListener, handler);
        }
    }

    public boolean isLongpressEnabled() {
        return this.mImpl.isLongpressEnabled();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mImpl.onTouchEvent(motionEvent);
    }

    public void setIsLongpressEnabled(boolean z4) {
        this.mImpl.setIsLongpressEnabled(z4);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mImpl.setOnDoubleTapListener(onDoubleTapListener);
    }
}
