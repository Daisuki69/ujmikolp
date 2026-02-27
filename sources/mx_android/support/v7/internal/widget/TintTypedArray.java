package mx_android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes7.dex */
public class TintTypedArray {
    private final Context mContext;
    private TintManager mTintManager;
    private final TypedArray mWrapped;

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i, int i4) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i4));
    }

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.mContext = context;
        this.mWrapped = typedArray;
    }

    public Drawable getDrawable(int i) {
        int resourceId;
        if (this.mWrapped.hasValue(i) && (resourceId = this.mWrapped.getResourceId(i, 0)) != 0) {
            return getTintManager().getDrawable(resourceId);
        }
        return this.mWrapped.getDrawable(i);
    }

    public int length() {
        return this.mWrapped.length();
    }

    public int getIndexCount() {
        return this.mWrapped.getIndexCount();
    }

    public int getIndex(int i) {
        return this.mWrapped.getIndex(i);
    }

    public Resources getResources() {
        return this.mWrapped.getResources();
    }

    public CharSequence getText(int i) {
        return this.mWrapped.getText(i);
    }

    public String getString(int i) {
        return this.mWrapped.getString(i);
    }

    public String getNonResourceString(int i) {
        return this.mWrapped.getNonResourceString(i);
    }

    public boolean getBoolean(int i, boolean z4) {
        return this.mWrapped.getBoolean(i, z4);
    }

    public int getInt(int i, int i4) {
        return this.mWrapped.getInt(i, i4);
    }

    public float getFloat(int i, float f) {
        return this.mWrapped.getFloat(i, f);
    }

    public int getColor(int i, int i4) {
        return this.mWrapped.getColor(i, i4);
    }

    public ColorStateList getColorStateList(int i) {
        return this.mWrapped.getColorStateList(i);
    }

    public int getInteger(int i, int i4) {
        return this.mWrapped.getInteger(i, i4);
    }

    public float getDimension(int i, float f) {
        return this.mWrapped.getDimension(i, f);
    }

    public int getDimensionPixelOffset(int i, int i4) {
        return this.mWrapped.getDimensionPixelOffset(i, i4);
    }

    public int getDimensionPixelSize(int i, int i4) {
        return this.mWrapped.getDimensionPixelSize(i, i4);
    }

    public int getLayoutDimension(int i, String str) {
        return this.mWrapped.getLayoutDimension(i, str);
    }

    public int getLayoutDimension(int i, int i4) {
        return this.mWrapped.getLayoutDimension(i, i4);
    }

    public float getFraction(int i, int i4, int i6, float f) {
        return this.mWrapped.getFraction(i, i4, i6, f);
    }

    public int getResourceId(int i, int i4) {
        return this.mWrapped.getResourceId(i, i4);
    }

    public CharSequence[] getTextArray(int i) {
        return this.mWrapped.getTextArray(i);
    }

    public boolean getValue(int i, TypedValue typedValue) {
        return this.mWrapped.getValue(i, typedValue);
    }

    public int getType(int i) {
        return this.mWrapped.getType(i);
    }

    public boolean hasValue(int i) {
        return this.mWrapped.hasValue(i);
    }

    public TypedValue peekValue(int i) {
        return this.mWrapped.peekValue(i);
    }

    public String getPositionDescription() {
        return this.mWrapped.getPositionDescription();
    }

    public void recycle() {
        this.mWrapped.recycle();
    }

    public int getChangingConfigurations() {
        return this.mWrapped.getChangingConfigurations();
    }

    public TintManager getTintManager() {
        if (this.mTintManager == null) {
            this.mTintManager = new TintManager(this.mContext);
        }
        return this.mTintManager;
    }
}
