package mx_android.support.v7.internal.view.menu;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public interface MenuView {

    public interface ItemView {
        MenuItemImpl getItemData();

        void initialize(MenuItemImpl menuItemImpl, int i);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z4);

        void setChecked(boolean z4);

        void setEnabled(boolean z4);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z4, char c);

        void setTitle(CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(MenuBuilder menuBuilder);
}
