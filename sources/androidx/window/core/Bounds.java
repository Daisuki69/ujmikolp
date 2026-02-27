package androidx.window.core;

import We.s;
import android.graphics.Rect;
import androidx.camera.core.impl.a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class Bounds {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public Bounds(int i, int i4, int i6, int i10) {
        this.left = i;
        this.top = i4;
        this.right = i6;
        this.bottom = i10;
        if (i > i6) {
            throw new IllegalArgumentException(a.c(i, i6, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i4 > i10) {
            throw new IllegalArgumentException(a.c(i4, i10, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Bounds.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        Bounds bounds = (Bounds) obj;
        return this.left == bounds.left && this.top == bounds.top && this.right == bounds.right && this.bottom == bounds.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public final boolean isEmpty() {
        return getHeight() == 0 || getWidth() == 0;
    }

    public final boolean isZero() {
        return getHeight() == 0 && getWidth() == 0;
    }

    public final Rect toRect() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Bounds { [");
        sb2.append(this.left);
        sb2.append(',');
        sb2.append(this.top);
        sb2.append(',');
        sb2.append(this.right);
        sb2.append(',');
        return s.o(sb2, "] }", this.bottom);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bounds(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        j.g(rect, "rect");
    }
}
