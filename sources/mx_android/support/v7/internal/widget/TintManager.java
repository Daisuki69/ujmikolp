package mx_android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import mx_android.support.v4.content.ContextCompat;
import mx_android.support.v4.util.LruCache;
import mx_android.support.v7.appcompat.R;

/* JADX INFO: loaded from: classes7.dex */
public class TintManager {
    private static final boolean DEBUG = false;
    private static final String TAG = "TintManager";
    private ColorStateList mButtonStateList;
    private final Context mContext;
    private ColorStateList mDefaultColorStateList;
    private final Resources mResources;
    private ColorStateList mSwitchThumbStateList;
    private ColorStateList mSwitchTrackStateList;
    private final TypedValue mTypedValue = new TypedValue();
    static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final int[] TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_ic_ab_back_mtrl_am_alpha, R.drawable.abc_ic_go_search_api_mtrl_alpha, R.drawable.abc_ic_search_api_mtrl_alpha, R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_ic_clear_mtrl_alpha, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha, R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha, R.drawable.abc_ic_voice_search_api_mtrl_alpha, R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    private static final int[] TINT_COLOR_CONTROL_ACTIVATED = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha};
    private static final int[] TINT_COLOR_BACKGROUND_MULTIPLY = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST = {R.drawable.abc_edit_text_material, R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material, R.drawable.abc_spinner_mtrl_am_alpha, R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_spinner_textfield_background_material, R.drawable.abc_ratingbar_full_material};
    private static final int[] CONTAINERS_WITH_TINT_CHILDREN = {R.drawable.abc_cab_background_top_material};

    public static Drawable getDrawable(Context context, int i) {
        if (isInTintList(i)) {
            return new TintManager(context).getDrawable(i);
        }
        return ContextCompat.getDrawable(context, i);
    }

    public TintManager(Context context) {
        this.mContext = context;
        this.mResources = new TintResources(context.getResources(), this);
    }

    public Drawable getDrawable(int i) {
        TintDrawableWrapper tintDrawableWrapper;
        Drawable drawable = ContextCompat.getDrawable(this.mContext, i);
        if (drawable == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i)) {
            tintDrawableWrapper = new TintDrawableWrapper(drawableMutate, getDefaultColorStateList());
        } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            tintDrawableWrapper = new TintDrawableWrapper(drawableMutate, getSwitchTrackColorStateList());
        } else if (i == R.drawable.abc_switch_thumb_material) {
            tintDrawableWrapper = new TintDrawableWrapper(drawableMutate, getSwitchThumbColorStateList(), PorterDuff.Mode.MULTIPLY);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            tintDrawableWrapper = new TintDrawableWrapper(drawableMutate, getButtonColorStateList());
        } else {
            if (arrayContains(CONTAINERS_WITH_TINT_CHILDREN, i)) {
                return this.mResources.getDrawable(i);
            }
            tintDrawable(i, drawableMutate);
            return drawableMutate;
        }
        return tintDrawableWrapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void tintDrawable(int r6, android.graphics.drawable.Drawable r7) {
        /*
            r5 = this;
            int[] r0 = mx_android.support.v7.internal.widget.TintManager.TINT_COLOR_CONTROL_NORMAL
            boolean r0 = arrayContains(r0, r6)
            r1 = -1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L12
            int r2 = mx_android.support.v7.appcompat.R.attr.colorControlNormal
        Le:
            r0 = r2
            r6 = -1
        L10:
            r2 = 1
            goto L43
        L12:
            int[] r0 = mx_android.support.v7.internal.widget.TintManager.TINT_COLOR_CONTROL_ACTIVATED
            boolean r0 = arrayContains(r0, r6)
            if (r0 == 0) goto L1d
            int r2 = mx_android.support.v7.appcompat.R.attr.colorControlActivated
            goto Le
        L1d:
            int[] r0 = mx_android.support.v7.internal.widget.TintManager.TINT_COLOR_BACKGROUND_MULTIPLY
            boolean r0 = arrayContains(r0, r6)
            if (r0 == 0) goto L2f
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            r6 = -1
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            goto L10
        L2f:
            int r0 = mx_android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha
            if (r6 != r0) goto L41
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r6 = 1109603123(0x42233333, float:40.8)
            int r6 = java.lang.Math.round(r6)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            goto L10
        L41:
            r6 = -1
            r0 = 0
        L43:
            if (r2 == 0) goto L65
            if (r4 != 0) goto L49
            android.graphics.PorterDuff$Mode r4 = mx_android.support.v7.internal.widget.TintManager.DEFAULT_MODE
        L49:
            int r0 = r5.getThemeAttrColor(r0)
            mx_android.support.v7.internal.widget.TintManager$ColorFilterLruCache r2 = mx_android.support.v7.internal.widget.TintManager.COLOR_FILTER_CACHE
            android.graphics.PorterDuffColorFilter r3 = r2.get(r0, r4)
            if (r3 != 0) goto L5d
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            r3.<init>(r0, r4)
            r2.put(r0, r4, r3)
        L5d:
            r7.setColorFilter(r3)
            if (r6 == r1) goto L65
            r7.setAlpha(r6)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mx_android.support.v7.internal.widget.TintManager.tintDrawable(int, android.graphics.drawable.Drawable):void");
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    private static boolean isInTintList(int i) {
        return arrayContains(TINT_COLOR_BACKGROUND_MULTIPLY, i) || arrayContains(TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(TINT_COLOR_CONTROL_ACTIVATED, i) || arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i) || arrayContains(CONTAINERS_WITH_TINT_CHILDREN, i);
    }

    private ColorStateList getDefaultColorStateList() {
        if (this.mDefaultColorStateList == null) {
            int themeAttrColor = getThemeAttrColor(R.attr.colorControlNormal);
            int themeAttrColor2 = getThemeAttrColor(R.attr.colorControlActivated);
            this.mDefaultColorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_focused}, new int[]{android.R.attr.state_activated}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_checked}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{getDisabledThemeAttrColor(R.attr.colorControlNormal), themeAttrColor2, themeAttrColor2, themeAttrColor2, themeAttrColor2, themeAttrColor2, themeAttrColor});
        }
        return this.mDefaultColorStateList;
    }

    private ColorStateList getSwitchTrackColorStateList() {
        if (this.mSwitchTrackStateList == null) {
            this.mSwitchTrackStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{getThemeAttrColor(android.R.attr.colorForeground, 0.1f), getThemeAttrColor(R.attr.colorControlActivated, 0.3f), getThemeAttrColor(android.R.attr.colorForeground, 0.3f)});
        }
        return this.mSwitchTrackStateList;
    }

    private ColorStateList getSwitchThumbColorStateList() {
        if (this.mSwitchThumbStateList == null) {
            this.mSwitchThumbStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{getDisabledThemeAttrColor(R.attr.colorSwitchThumbNormal), getThemeAttrColor(R.attr.colorControlActivated), getThemeAttrColor(R.attr.colorSwitchThumbNormal)});
        }
        return this.mSwitchThumbStateList;
    }

    private ColorStateList getButtonColorStateList() {
        if (this.mButtonStateList == null) {
            this.mButtonStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[0]}, new int[]{getDisabledThemeAttrColor(R.attr.colorButtonNormal), getThemeAttrColor(R.attr.colorControlHighlight), getThemeAttrColor(R.attr.colorControlHighlight), getThemeAttrColor(R.attr.colorButtonNormal)});
        }
        return this.mButtonStateList;
    }

    int getThemeAttrColor(int i) {
        if (!this.mContext.getTheme().resolveAttribute(i, this.mTypedValue, true)) {
            return 0;
        }
        if (this.mTypedValue.type >= 16 && this.mTypedValue.type <= 31) {
            return this.mTypedValue.data;
        }
        if (this.mTypedValue.type == 3) {
            return this.mResources.getColor(this.mTypedValue.resourceId);
        }
        return 0;
    }

    int getThemeAttrColor(int i, float f) {
        return (getThemeAttrColor(i) & 16777215) | (Math.round(Color.alpha(r3) * f) << 24);
    }

    int getDisabledThemeAttrColor(int i) {
        this.mContext.getTheme().resolveAttribute(android.R.attr.disabledAlpha, this.mTypedValue, true);
        return getThemeAttrColor(i, this.mTypedValue.getFloat());
    }

    private static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        PorterDuffColorFilter get(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        PorterDuffColorFilter put(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }

        private static int generateCacheKey(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }
}
