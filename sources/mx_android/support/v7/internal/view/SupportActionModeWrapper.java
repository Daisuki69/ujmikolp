package mx_android.support.v7.internal.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import mx_android.support.v4.internal.view.SupportMenu;
import mx_android.support.v4.internal.view.SupportMenuItem;
import mx_android.support.v4.util.SimpleArrayMap;
import mx_android.support.v7.internal.view.menu.MenuWrapperFactory;
import mx_android.support.v7.view.ActionMode;

/* JADX INFO: loaded from: classes7.dex */
public class SupportActionModeWrapper extends ActionMode {
    final Context mContext;
    final mx_android.support.v7.view.ActionMode mWrappedObject;

    public SupportActionModeWrapper(Context context, mx_android.support.v7.view.ActionMode actionMode) {
        this.mContext = context;
        this.mWrappedObject = actionMode;
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.mWrappedObject.getTag();
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.mWrappedObject.setTag(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.mWrappedObject.setTitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.mWrappedObject.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.mWrappedObject.invalidate();
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.mWrappedObject.finish();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return MenuWrapperFactory.wrapSupportMenu(this.mContext, (SupportMenu) this.mWrappedObject.getMenu());
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.mWrappedObject.getTitle();
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.mWrappedObject.setTitle(i);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.mWrappedObject.getSubtitle();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.mWrappedObject.setSubtitle(i);
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.mWrappedObject.getCustomView();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.mWrappedObject.setCustomView(view);
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.mWrappedObject.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.mWrappedObject.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z4) {
        this.mWrappedObject.setTitleOptionalHint(z4);
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.mWrappedObject.isTitleOptional();
    }

    public static class CallbackWrapper implements ActionMode.Callback {
        final Context mContext;
        final ActionMode.Callback mWrappedCallback;
        final SimpleArrayMap<mx_android.support.v7.view.ActionMode, SupportActionModeWrapper> mActionModes = new SimpleArrayMap<>();
        final SimpleArrayMap<Menu, Menu> mMenus = new SimpleArrayMap<>();

        public CallbackWrapper(Context context, ActionMode.Callback callback) {
            this.mContext = context;
            this.mWrappedCallback = callback;
        }

        @Override // mx_android.support.v7.view.ActionMode.Callback
        public boolean onCreateActionMode(mx_android.support.v7.view.ActionMode actionMode, Menu menu) {
            return this.mWrappedCallback.onCreateActionMode(getActionModeWrapper(actionMode), getMenuWrapper(menu));
        }

        @Override // mx_android.support.v7.view.ActionMode.Callback
        public boolean onPrepareActionMode(mx_android.support.v7.view.ActionMode actionMode, Menu menu) {
            return this.mWrappedCallback.onPrepareActionMode(getActionModeWrapper(actionMode), getMenuWrapper(menu));
        }

        @Override // mx_android.support.v7.view.ActionMode.Callback
        public boolean onActionItemClicked(mx_android.support.v7.view.ActionMode actionMode, MenuItem menuItem) {
            return this.mWrappedCallback.onActionItemClicked(getActionModeWrapper(actionMode), MenuWrapperFactory.wrapSupportMenuItem(this.mContext, (SupportMenuItem) menuItem));
        }

        @Override // mx_android.support.v7.view.ActionMode.Callback
        public void onDestroyActionMode(mx_android.support.v7.view.ActionMode actionMode) {
            this.mWrappedCallback.onDestroyActionMode(getActionModeWrapper(actionMode));
        }

        private Menu getMenuWrapper(Menu menu) {
            Menu menu2 = this.mMenus.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu menuWrapSupportMenu = MenuWrapperFactory.wrapSupportMenu(this.mContext, (SupportMenu) menu);
            this.mMenus.put(menu, menuWrapSupportMenu);
            return menuWrapSupportMenu;
        }

        private android.view.ActionMode getActionModeWrapper(mx_android.support.v7.view.ActionMode actionMode) {
            SupportActionModeWrapper supportActionModeWrapper = this.mActionModes.get(actionMode);
            if (supportActionModeWrapper != null) {
                return supportActionModeWrapper;
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.mContext, actionMode);
            this.mActionModes.put(actionMode, supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }
    }
}
