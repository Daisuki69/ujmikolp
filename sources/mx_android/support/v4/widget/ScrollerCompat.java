package mx_android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes7.dex */
public class ScrollerCompat {
    static final int CHASE_FRAME_TIME = 16;
    private static final String TAG = "ScrollerCompat";
    ScrollerCompatImpl mImpl;
    Object mScroller;

    interface ScrollerCompatImpl {
        void abortAnimation(Object obj);

        boolean computeScrollOffset(Object obj);

        Object createScroller(Context context, Interpolator interpolator);

        void fling(Object obj, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14);

        void fling(Object obj, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

        float getCurrVelocity(Object obj);

        int getCurrX(Object obj);

        int getCurrY(Object obj);

        int getFinalX(Object obj);

        int getFinalY(Object obj);

        boolean isFinished(Object obj);

        boolean isOverScrolled(Object obj);

        void notifyHorizontalEdgeReached(Object obj, int i, int i4, int i6);

        void notifyVerticalEdgeReached(Object obj, int i, int i4, int i6);

        void startScroll(Object obj, int i, int i4, int i6, int i10);

        void startScroll(Object obj, int i, int i4, int i6, int i10, int i11);
    }

    static class ScrollerCompatImplBase implements ScrollerCompatImpl {
        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public float getCurrVelocity(Object obj) {
            return 0.0f;
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public boolean isOverScrolled(Object obj) {
            return false;
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void notifyHorizontalEdgeReached(Object obj, int i, int i4, int i6) {
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void notifyVerticalEdgeReached(Object obj, int i, int i4, int i6) {
        }

        ScrollerCompatImplBase() {
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public Object createScroller(Context context, Interpolator interpolator) {
            return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public boolean isFinished(Object obj) {
            return ((Scroller) obj).isFinished();
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public int getCurrX(Object obj) {
            return ((Scroller) obj).getCurrX();
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public int getCurrY(Object obj) {
            return ((Scroller) obj).getCurrY();
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public boolean computeScrollOffset(Object obj) {
            return ((Scroller) obj).computeScrollOffset();
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void startScroll(Object obj, int i, int i4, int i6, int i10) {
            ((Scroller) obj).startScroll(i, i4, i6, i10);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void startScroll(Object obj, int i, int i4, int i6, int i10, int i11) {
            ((Scroller) obj).startScroll(i, i4, i6, i10, i11);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void fling(Object obj, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
            ((Scroller) obj).fling(i, i4, i6, i10, i11, i12, i13, i14);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void fling(Object obj, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            ((Scroller) obj).fling(i, i4, i6, i10, i11, i12, i13, i14);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void abortAnimation(Object obj) {
            ((Scroller) obj).abortAnimation();
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public int getFinalX(Object obj) {
            return ((Scroller) obj).getFinalX();
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public int getFinalY(Object obj) {
            return ((Scroller) obj).getFinalY();
        }
    }

    static class ScrollerCompatImplGingerbread implements ScrollerCompatImpl {
        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public float getCurrVelocity(Object obj) {
            return 0.0f;
        }

        ScrollerCompatImplGingerbread() {
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public Object createScroller(Context context, Interpolator interpolator) {
            return ScrollerCompatGingerbread.createScroller(context, interpolator);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public boolean isFinished(Object obj) {
            return ScrollerCompatGingerbread.isFinished(obj);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public int getCurrX(Object obj) {
            return ScrollerCompatGingerbread.getCurrX(obj);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public int getCurrY(Object obj) {
            return ScrollerCompatGingerbread.getCurrY(obj);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public boolean computeScrollOffset(Object obj) {
            return ScrollerCompatGingerbread.computeScrollOffset(obj);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void startScroll(Object obj, int i, int i4, int i6, int i10) {
            ScrollerCompatGingerbread.startScroll(obj, i, i4, i6, i10);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void startScroll(Object obj, int i, int i4, int i6, int i10, int i11) {
            ScrollerCompatGingerbread.startScroll(obj, i, i4, i6, i10, i11);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void fling(Object obj, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
            ScrollerCompatGingerbread.fling(obj, i, i4, i6, i10, i11, i12, i13, i14);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void fling(Object obj, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            ScrollerCompatGingerbread.fling(obj, i, i4, i6, i10, i11, i12, i13, i14, i15, i16);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void abortAnimation(Object obj) {
            ScrollerCompatGingerbread.abortAnimation(obj);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void notifyHorizontalEdgeReached(Object obj, int i, int i4, int i6) {
            ScrollerCompatGingerbread.notifyHorizontalEdgeReached(obj, i, i4, i6);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public void notifyVerticalEdgeReached(Object obj, int i, int i4, int i6) {
            ScrollerCompatGingerbread.notifyVerticalEdgeReached(obj, i, i4, i6);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public boolean isOverScrolled(Object obj) {
            return ScrollerCompatGingerbread.isOverScrolled(obj);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public int getFinalX(Object obj) {
            return ScrollerCompatGingerbread.getFinalX(obj);
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public int getFinalY(Object obj) {
            return ScrollerCompatGingerbread.getFinalY(obj);
        }
    }

    static class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread {
        ScrollerCompatImplIcs() {
        }

        @Override // mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImplGingerbread, mx_android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
        public float getCurrVelocity(Object obj) {
            return ScrollerCompatIcs.getCurrVelocity(obj);
        }
    }

    public static ScrollerCompat create(Context context) {
        return create(context, null);
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }

    ScrollerCompat(Context context, Interpolator interpolator) {
        this(Build.VERSION.SDK_INT, context, interpolator);
    }

    private ScrollerCompat(int i, Context context, Interpolator interpolator) {
        if (i >= 14) {
            this.mImpl = new ScrollerCompatImplIcs();
        } else if (i >= 9) {
            this.mImpl = new ScrollerCompatImplGingerbread();
        } else {
            this.mImpl = new ScrollerCompatImplBase();
        }
        this.mScroller = this.mImpl.createScroller(context, interpolator);
    }

    public boolean isFinished() {
        return this.mImpl.isFinished(this.mScroller);
    }

    public int getCurrX() {
        return this.mImpl.getCurrX(this.mScroller);
    }

    public int getCurrY() {
        return this.mImpl.getCurrY(this.mScroller);
    }

    public int getFinalX() {
        return this.mImpl.getFinalX(this.mScroller);
    }

    public int getFinalY() {
        return this.mImpl.getFinalY(this.mScroller);
    }

    public float getCurrVelocity() {
        return this.mImpl.getCurrVelocity(this.mScroller);
    }

    public boolean computeScrollOffset() {
        return this.mImpl.computeScrollOffset(this.mScroller);
    }

    public void startScroll(int i, int i4, int i6, int i10) {
        this.mImpl.startScroll(this.mScroller, i, i4, i6, i10);
    }

    public void startScroll(int i, int i4, int i6, int i10, int i11) {
        this.mImpl.startScroll(this.mScroller, i, i4, i6, i10, i11);
    }

    public void fling(int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
        this.mImpl.fling(this.mScroller, i, i4, i6, i10, i11, i12, i13, i14);
    }

    public void fling(int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.mImpl.fling(this.mScroller, i, i4, i6, i10, i11, i12, i13, i14, i15, i16);
    }

    public void abortAnimation() {
        this.mImpl.abortAnimation(this.mScroller);
    }

    public void notifyHorizontalEdgeReached(int i, int i4, int i6) {
        this.mImpl.notifyHorizontalEdgeReached(this.mScroller, i, i4, i6);
    }

    public void notifyVerticalEdgeReached(int i, int i4, int i6) {
        this.mImpl.notifyVerticalEdgeReached(this.mScroller, i, i4, i6);
    }

    public boolean isOverScrolled() {
        return this.mImpl.isOverScrolled(this.mScroller);
    }
}
