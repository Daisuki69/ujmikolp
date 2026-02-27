package w1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: w1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC2369g implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20567b;

    public /* synthetic */ ViewOnLayoutChangeListenerC2369g(Object obj, int i) {
        this.f20566a = i;
        this.f20567b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
        int height;
        int height2;
        switch (this.f20566a) {
            case 0:
                t tVar = (t) this.f20567b;
                tVar.getClass();
                int i15 = i10 - i4;
                int i16 = i14 - i12;
                if (i6 - i != i13 - i11 || i15 != i16) {
                    PopupWindow popupWindow = tVar.u0;
                    if (popupWindow.isShowing()) {
                        tVar.p();
                        int width = tVar.getWidth() - popupWindow.getWidth();
                        int i17 = tVar.w0;
                        popupWindow.update(view, width - i17, (-popupWindow.getHeight()) - i17, -1, -1);
                    }
                }
                break;
            default:
                z zVar = (z) this.f20567b;
                t tVar2 = zVar.f20656a;
                int width2 = (tVar2.getWidth() - tVar2.getPaddingLeft()) - tVar2.getPaddingRight();
                int height3 = (tVar2.getHeight() - tVar2.getPaddingBottom()) - tVar2.getPaddingTop();
                ViewGroup viewGroup = zVar.c;
                int iC = z.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, z.c(zVar.f20660k) + z.c(zVar.i));
                ViewGroup viewGroup2 = zVar.f20658d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z4 = width2 <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (zVar.f20653A != z4) {
                    zVar.f20653A = z4;
                    view.post(new u(zVar, 1));
                }
                boolean z5 = i6 - i != i13 - i11;
                if (!zVar.f20653A && z5) {
                    view.post(new u(zVar, 2));
                    break;
                }
                break;
        }
    }
}
