package mx_android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import mx_android.support.v4.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes7.dex */
class MenuWrapperICS extends BaseMenuWrapper<SupportMenu> implements Menu {
    MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context, supportMenu);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).add(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i4, int i6, CharSequence charSequence) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).add(i, i4, i6, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i4, int i6, int i10) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).add(i, i4, i6, i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return getSubMenuWrapper(((SupportMenu) this.mWrappedObject).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return getSubMenuWrapper(((SupportMenu) this.mWrappedObject).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i4, int i6, CharSequence charSequence) {
        return getSubMenuWrapper(((SupportMenu) this.mWrappedObject).addSubMenu(i, i4, i6, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i4, int i6, int i10) {
        return getSubMenuWrapper(((SupportMenu) this.mWrappedObject).addSubMenu(i, i4, i6, i10));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i4, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = ((SupportMenu) this.mWrappedObject).addIntentOptions(i, i4, i6, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = getMenuItemWrapper(menuItemArr2[i11]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        internalRemoveItem(i);
        ((SupportMenu) this.mWrappedObject).removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        internalRemoveGroup(i);
        ((SupportMenu) this.mWrappedObject).removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        internalClear();
        ((SupportMenu) this.mWrappedObject).clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z4, boolean z5) {
        ((SupportMenu) this.mWrappedObject).setGroupCheckable(i, z4, z5);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z4) {
        ((SupportMenu) this.mWrappedObject).setGroupVisible(i, z4);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z4) {
        ((SupportMenu) this.mWrappedObject).setGroupEnabled(i, z4);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((SupportMenu) this.mWrappedObject).hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return ((SupportMenu) this.mWrappedObject).size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        ((SupportMenu) this.mWrappedObject).close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        return ((SupportMenu) this.mWrappedObject).performShortcut(i, keyEvent, i4);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((SupportMenu) this.mWrappedObject).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i4) {
        return ((SupportMenu) this.mWrappedObject).performIdentifierAction(i, i4);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        ((SupportMenu) this.mWrappedObject).setQwertyMode(z4);
    }
}
