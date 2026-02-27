package androidx.media3.common.util;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Size {
    public static final Size UNKNOWN = new Size(-1, -1);
    public static final Size ZERO = new Size(0, 0);
    private final int height;
    private final int width;

    public Size(int i, int i4) {
        Assertions.checkArgument((i == -1 || i >= 0) && (i4 == -1 || i4 >= 0));
        this.width = i;
        this.height = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i = this.height;
        int i4 = this.width;
        return i ^ ((i4 >>> 16) | (i4 << 16));
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
