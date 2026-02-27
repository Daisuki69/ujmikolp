package mx_android.support.v7.internal.widget;

/* JADX INFO: loaded from: classes7.dex */
public class RtlSpacingHelper {
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mLeft = 0;
    private int mRight = 0;
    private int mStart = Integer.MIN_VALUE;
    private int mEnd = Integer.MIN_VALUE;
    private int mExplicitLeft = 0;
    private int mExplicitRight = 0;
    private boolean mIsRtl = false;
    private boolean mIsRelative = false;

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return this.mRight;
    }

    public int getStart() {
        return this.mIsRtl ? this.mRight : this.mLeft;
    }

    public int getEnd() {
        return this.mIsRtl ? this.mLeft : this.mRight;
    }

    public void setRelative(int i, int i4) {
        this.mStart = i;
        this.mEnd = i4;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (i4 != Integer.MIN_VALUE) {
                this.mLeft = i4;
            }
            if (i != Integer.MIN_VALUE) {
                this.mRight = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.mLeft = i;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.mRight = i4;
        }
    }

    public void setAbsolute(int i, int i4) {
        this.mIsRelative = false;
        if (i != Integer.MIN_VALUE) {
            this.mExplicitLeft = i;
            this.mLeft = i;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.mExplicitRight = i4;
            this.mRight = i4;
        }
    }

    public void setDirection(boolean z4) {
        if (z4 == this.mIsRtl) {
            return;
        }
        this.mIsRtl = z4;
        if (!this.mIsRelative) {
            this.mLeft = this.mExplicitLeft;
            this.mRight = this.mExplicitRight;
            return;
        }
        if (z4) {
            int i = this.mEnd;
            if (i == Integer.MIN_VALUE) {
                i = this.mExplicitLeft;
            }
            this.mLeft = i;
            int i4 = this.mStart;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.mExplicitRight;
            }
            this.mRight = i4;
            return;
        }
        int i6 = this.mStart;
        if (i6 == Integer.MIN_VALUE) {
            i6 = this.mExplicitLeft;
        }
        this.mLeft = i6;
        int i10 = this.mEnd;
        if (i10 == Integer.MIN_VALUE) {
            i10 = this.mExplicitRight;
        }
        this.mRight = i10;
    }
}
