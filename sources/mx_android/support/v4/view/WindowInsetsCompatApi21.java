package mx_android.support.v4.view;

import android.graphics.Rect;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes7.dex */
class WindowInsetsCompatApi21 extends WindowInsetsCompat {
    private final WindowInsets mSource;

    WindowInsetsCompatApi21(WindowInsets windowInsets) {
        this.mSource = windowInsets;
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public int getSystemWindowInsetLeft() {
        return this.mSource.getSystemWindowInsetLeft();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public int getSystemWindowInsetTop() {
        return this.mSource.getSystemWindowInsetTop();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public int getSystemWindowInsetRight() {
        return this.mSource.getSystemWindowInsetRight();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public int getSystemWindowInsetBottom() {
        return this.mSource.getSystemWindowInsetBottom();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public boolean hasSystemWindowInsets() {
        return this.mSource.hasSystemWindowInsets();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public boolean hasInsets() {
        return this.mSource.hasInsets();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public boolean isConsumed() {
        return this.mSource.isConsumed();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public boolean isRound() {
        return this.mSource.isRound();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return new WindowInsetsCompatApi21(this.mSource.consumeSystemWindowInsets());
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public WindowInsetsCompat replaceSystemWindowInsets(int i, int i4, int i6, int i10) {
        return new WindowInsetsCompatApi21(this.mSource.replaceSystemWindowInsets(i, i4, i6, i10));
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public WindowInsetsCompat replaceSystemWindowInsets(Rect rect) {
        return new WindowInsetsCompatApi21(this.mSource.replaceSystemWindowInsets(rect));
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public int getStableInsetTop() {
        return this.mSource.getStableInsetTop();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public int getStableInsetLeft() {
        return this.mSource.getStableInsetLeft();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public int getStableInsetRight() {
        return this.mSource.getStableInsetRight();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public int getStableInsetBottom() {
        return this.mSource.getStableInsetBottom();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public boolean hasStableInsets() {
        return this.mSource.hasStableInsets();
    }

    @Override // mx_android.support.v4.view.WindowInsetsCompat
    public WindowInsetsCompat consumeStableInsets() {
        return new WindowInsetsCompatApi21(this.mSource.consumeStableInsets());
    }

    WindowInsets unwrap() {
        return this.mSource;
    }
}
