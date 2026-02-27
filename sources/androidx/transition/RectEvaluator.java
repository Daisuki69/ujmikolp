package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    public RectEvaluator() {
    }

    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left + ((int) ((rect2.left - r0) * f));
        int i4 = rect.top + ((int) ((rect2.top - r1) * f));
        int i6 = rect.right + ((int) ((rect2.right - r2) * f));
        int i10 = rect.bottom + ((int) ((rect2.bottom - r6) * f));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i, i4, i6, i10);
        }
        rect3.set(i, i4, i6, i10);
        return this.mRect;
    }
}
