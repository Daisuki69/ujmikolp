package mx_android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes7.dex */
public class PopupWindowCompat {
    static final PopupWindowImpl IMPL;

    interface PopupWindowImpl {
        void showAsDropDown(PopupWindow popupWindow, View view, int i, int i4, int i6);
    }

    static class BasePopupWindowImpl implements PopupWindowImpl {
        BasePopupWindowImpl() {
        }

        @Override // mx_android.support.v4.widget.PopupWindowCompat.PopupWindowImpl
        public void showAsDropDown(PopupWindow popupWindow, View view, int i, int i4, int i6) {
            popupWindow.showAsDropDown(view, i, i4);
        }
    }

    static class KitKatPopupWindowImpl extends BasePopupWindowImpl {
        KitKatPopupWindowImpl() {
        }

        @Override // mx_android.support.v4.widget.PopupWindowCompat.BasePopupWindowImpl, mx_android.support.v4.widget.PopupWindowCompat.PopupWindowImpl
        public void showAsDropDown(PopupWindow popupWindow, View view, int i, int i4, int i6) {
            PopupWindowCompatKitKat.showAsDropDown(popupWindow, view, i, i4, i6);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            IMPL = new KitKatPopupWindowImpl();
        } else {
            IMPL = new BasePopupWindowImpl();
        }
    }

    private PopupWindowCompat() {
    }

    public static void showAsDropDown(PopupWindow popupWindow, View view, int i, int i4, int i6) {
        IMPL.showAsDropDown(popupWindow, view, i, i4, i6);
    }
}
