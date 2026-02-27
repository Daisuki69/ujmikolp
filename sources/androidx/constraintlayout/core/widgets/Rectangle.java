package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7754y;

    public boolean contains(int i, int i4) {
        int i6;
        int i10 = this.f7753x;
        return i >= i10 && i < i10 + this.width && i4 >= (i6 = this.f7754y) && i4 < i6 + this.height;
    }

    public int getCenterX() {
        return (this.f7753x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f7754y + this.height) / 2;
    }

    public void grow(int i, int i4) {
        this.f7753x -= i;
        this.f7754y -= i4;
        this.width = (i * 2) + this.width;
        this.height = (i4 * 2) + this.height;
    }

    public boolean intersects(Rectangle rectangle) {
        int i;
        int i4;
        int i6 = this.f7753x;
        int i10 = rectangle.f7753x;
        return i6 >= i10 && i6 < i10 + rectangle.width && (i = this.f7754y) >= (i4 = rectangle.f7754y) && i < i4 + rectangle.height;
    }

    public void setBounds(int i, int i4, int i6, int i10) {
        this.f7753x = i;
        this.f7754y = i4;
        this.width = i6;
        this.height = i10;
    }
}
