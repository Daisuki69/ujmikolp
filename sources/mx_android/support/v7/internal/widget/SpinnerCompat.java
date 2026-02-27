package mx_android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;
import mx_android.support.v4.view.GravityCompat;
import mx_android.support.v4.view.ViewCompat;
import mx_android.support.v7.appcompat.R;
import mx_android.support.v7.internal.widget.AbsSpinnerCompat;
import mx_android.support.v7.internal.widget.AdapterViewCompat;
import mx_android.support.v7.widget.ListPopupWindow;

/* JADX INFO: loaded from: classes7.dex */
class SpinnerCompat extends AbsSpinnerCompat implements DialogInterface.OnClickListener {
    private static final int MAX_ITEMS_MEASURED = 15;
    public static final int MODE_DIALOG = 0;
    public static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "Spinner";
    private boolean mDisableChildrenWhenDisabled;
    int mDropDownWidth;
    private ListPopupWindow.ForwardingListener mForwardingListener;
    private int mGravity;
    private SpinnerPopup mPopup;
    private DropDownAdapter mTempAdapter;
    private Rect mTempRect;
    private final TintManager mTintManager;

    private interface SpinnerPopup {
        void dismiss();

        Drawable getBackground();

        CharSequence getHintText();

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i);

        void setPromptText(CharSequence charSequence);

        void setVerticalOffset(int i);

        void show();
    }

    SpinnerCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    SpinnerCompat(Context context, int i) {
        this(context, null, R.attr.spinnerStyle, i);
    }

    SpinnerCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    SpinnerCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    SpinnerCompat(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i);
        this.mTempRect = new Rect();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.Spinner, i, 0);
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.Spinner_android_background));
        i4 = i4 == -1 ? tintTypedArrayObtainStyledAttributes.getInt(R.styleable.Spinner_spinnerMode, 0) : i4;
        if (i4 == 0) {
            this.mPopup = new DialogPopup();
        } else if (i4 == 1) {
            final DropdownPopup dropdownPopup = new DropdownPopup(context, attributeSet, i);
            this.mDropDownWidth = tintTypedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.Spinner_android_dropDownWidth, -2);
            dropdownPopup.setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.Spinner_android_popupBackground));
            this.mPopup = dropdownPopup;
            this.mForwardingListener = new ListPopupWindow.ForwardingListener(this) { // from class: mx_android.support.v7.internal.widget.SpinnerCompat.1
                @Override // mx_android.support.v7.widget.ListPopupWindow.ForwardingListener
                public ListPopupWindow getPopup() {
                    return dropdownPopup;
                }

                @Override // mx_android.support.v7.widget.ListPopupWindow.ForwardingListener
                public boolean onForwardingStarted() {
                    if (SpinnerCompat.this.mPopup.isShowing()) {
                        return true;
                    }
                    SpinnerCompat.this.mPopup.show();
                    return true;
                }
            };
        }
        this.mGravity = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.Spinner_android_gravity, 17);
        this.mPopup.setPromptText(tintTypedArrayObtainStyledAttributes.getString(R.styleable.Spinner_prompt));
        this.mDisableChildrenWhenDisabled = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.Spinner_disableChildrenWhenDisabled, false);
        tintTypedArrayObtainStyledAttributes.recycle();
        DropDownAdapter dropDownAdapter = this.mTempAdapter;
        if (dropDownAdapter != null) {
            this.mPopup.setAdapter(dropDownAdapter);
            this.mTempAdapter = null;
        }
        this.mTintManager = tintTypedArrayObtainStyledAttributes.getTintManager();
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        SpinnerPopup spinnerPopup = this.mPopup;
        if (!(spinnerPopup instanceof DropdownPopup)) {
            Log.e(TAG, "setPopupBackgroundDrawable: incompatible spinner mode; ignoring...");
        } else {
            ((DropdownPopup) spinnerPopup).setBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(this.mTintManager.getDrawable(i));
    }

    public Drawable getPopupBackground() {
        return this.mPopup.getBackground();
    }

    public void setDropDownVerticalOffset(int i) {
        this.mPopup.setVerticalOffset(i);
    }

    public int getDropDownVerticalOffset() {
        return this.mPopup.getVerticalOffset();
    }

    public void setDropDownHorizontalOffset(int i) {
        this.mPopup.setHorizontalOffset(i);
    }

    public int getDropDownHorizontalOffset() {
        return this.mPopup.getHorizontalOffset();
    }

    public void setDropDownWidth(int i) {
        if (!(this.mPopup instanceof DropdownPopup)) {
            Log.e(TAG, "Cannot set dropdown width for MODE_DIALOG, ignoring");
        } else {
            this.mDropDownWidth = i;
        }
    }

    public int getDropDownWidth() {
        return this.mDropDownWidth;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (this.mDisableChildrenWhenDisabled) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setEnabled(z4);
            }
        }
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((i & 7) == 0) {
                i |= 8388611;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    @Override // mx_android.support.v7.internal.widget.AbsSpinnerCompat, mx_android.support.v7.internal.widget.AdapterViewCompat
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        super.setAdapter(spinnerAdapter);
        this.mRecycler.clear();
        if (getContext().getApplicationInfo().targetSdkVersion >= 21 && spinnerAdapter != null && spinnerAdapter.getViewTypeCount() != 1) {
            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
        }
        SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            spinnerPopup.setAdapter(new DropDownAdapter(spinnerAdapter));
        } else {
            this.mTempAdapter = new DropDownAdapter(spinnerAdapter);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        View viewMakeView;
        int baseline;
        if (getChildCount() > 0) {
            viewMakeView = getChildAt(0);
        } else if (this.mAdapter == null || this.mAdapter.getCount() <= 0) {
            viewMakeView = null;
        } else {
            viewMakeView = makeView(0, false);
            this.mRecycler.put(0, viewMakeView);
        }
        if (viewMakeView == null || (baseline = viewMakeView.getBaseline()) < 0) {
            return -1;
        }
        return viewMakeView.getTop() + baseline;
    }

    @Override // mx_android.support.v7.internal.widget.AdapterViewCompat, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup == null || !spinnerPopup.isShowing()) {
            return;
        }
        this.mPopup.dismiss();
    }

    @Override // mx_android.support.v7.internal.widget.AdapterViewCompat
    public void setOnItemClickListener(AdapterViewCompat.OnItemClickListener onItemClickListener) {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    void setOnItemClickListenerInt(AdapterViewCompat.OnItemClickListener onItemClickListener) {
        super.setOnItemClickListener(onItemClickListener);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ListPopupWindow.ForwardingListener forwardingListener = this.mForwardingListener;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // mx_android.support.v7.internal.widget.AbsSpinnerCompat, android.view.View
    protected void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.mPopup == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // mx_android.support.v7.internal.widget.AdapterViewCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        super.onLayout(z4, i, i4, i6, i10);
        this.mInLayout = true;
        layout(0, false);
        this.mInLayout = false;
    }

    @Override // mx_android.support.v7.internal.widget.AbsSpinnerCompat
    void layout(int i, boolean z4) {
        int i4;
        int i6 = this.mSpinnerPadding.left;
        int right = ((getRight() - getLeft()) - this.mSpinnerPadding.left) - this.mSpinnerPadding.right;
        if (this.mDataChanged) {
            handleDataChanged();
        }
        if (this.mItemCount == 0) {
            resetList();
            return;
        }
        if (this.mNextSelectedPosition >= 0) {
            setSelectedPositionInt(this.mNextSelectedPosition);
        }
        recycleAllViews();
        removeAllViewsInLayout();
        this.mFirstPosition = this.mSelectedPosition;
        if (this.mAdapter != null) {
            View viewMakeView = makeView(this.mSelectedPosition, true);
            int measuredWidth = viewMakeView.getMeasuredWidth();
            int absoluteGravity = GravityCompat.getAbsoluteGravity(this.mGravity, ViewCompat.getLayoutDirection(this)) & 7;
            if (absoluteGravity == 1) {
                i4 = i6 + (right / 2);
                measuredWidth /= 2;
            } else {
                if (absoluteGravity == 5) {
                    i4 = i6 + right;
                }
                viewMakeView.offsetLeftAndRight(i6);
            }
            i6 = i4 - measuredWidth;
            viewMakeView.offsetLeftAndRight(i6);
        }
        this.mRecycler.clear();
        invalidate();
        checkSelectionChanged();
        this.mDataChanged = false;
        this.mNeedSync = false;
        setNextSelectedPositionInt(this.mSelectedPosition);
    }

    private View makeView(int i, boolean z4) {
        View view;
        if (!this.mDataChanged && (view = this.mRecycler.get(i)) != null) {
            setUpChild(view, z4);
            return view;
        }
        View view2 = this.mAdapter.getView(i, null, this);
        setUpChild(view2, z4);
        return view2;
    }

    private void setUpChild(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        if (z4) {
            addViewInLayout(view, 0, layoutParams);
        }
        view.setSelected(hasFocus());
        if (this.mDisableChildrenWhenDisabled) {
            view.setEnabled(isEnabled());
        }
        view.measure(ViewGroup.getChildMeasureSpec(this.mWidthMeasureSpec, this.mSpinnerPadding.left + this.mSpinnerPadding.right, layoutParams.width), ViewGroup.getChildMeasureSpec(this.mHeightMeasureSpec, this.mSpinnerPadding.top + this.mSpinnerPadding.bottom, layoutParams.height));
        int measuredHeight = this.mSpinnerPadding.top + ((((getMeasuredHeight() - this.mSpinnerPadding.bottom) - this.mSpinnerPadding.top) - view.getMeasuredHeight()) / 2);
        view.layout(0, measuredHeight, view.getMeasuredWidth() + 0, view.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            zPerformClick = true;
            if (!this.mPopup.isShowing()) {
                this.mPopup.show();
            }
        }
        return zPerformClick;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        setSelection(i);
        dialogInterface.dismiss();
    }

    public void setPrompt(CharSequence charSequence) {
        this.mPopup.setPromptText(charSequence);
    }

    public void setPromptId(int i) {
        setPrompt(getContext().getText(i));
    }

    public CharSequence getPrompt() {
        return this.mPopup.getHintText();
    }

    int measureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.mTempRect);
        return iMax2 + this.mTempRect.left + this.mTempRect.right;
    }

    @Override // mx_android.support.v7.internal.widget.AbsSpinnerCompat, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SpinnerPopup spinnerPopup = this.mPopup;
        savedState.showDropdown = spinnerPopup != null && spinnerPopup.isShowing();
        return savedState;
    }

    @Override // mx_android.support.v7.internal.widget.AbsSpinnerCompat, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.showDropdown || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: mx_android.support.v7.internal.widget.SpinnerCompat.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!SpinnerCompat.this.mPopup.isShowing()) {
                    SpinnerCompat.this.mPopup.show();
                }
                ViewTreeObserver viewTreeObserver2 = SpinnerCompat.this.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    static class SavedState extends AbsSpinnerCompat.SavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: mx_android.support.v7.internal.widget.SpinnerCompat.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean showDropdown;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.showDropdown = parcel.readByte() != 0;
        }

        @Override // mx_android.support.v7.internal.widget.AbsSpinnerCompat.SavedState, android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.showDropdown ? (byte) 1 : (byte) 0);
        }
    }

    private static class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        public DropDownAdapter(SpinnerAdapter spinnerAdapter) {
            this.mAdapter = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.mListAdapter = (ListAdapter) spinnerAdapter;
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    private class DialogPopup implements SpinnerPopup, DialogInterface.OnClickListener {
        private ListAdapter mListAdapter;
        private AlertDialog mPopup;
        private CharSequence mPrompt;

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public Drawable getBackground() {
            return null;
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public int getVerticalOffset() {
            return 0;
        }

        private DialogPopup() {
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void dismiss() {
            AlertDialog alertDialog = this.mPopup;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.mPopup = null;
            }
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public boolean isShowing() {
            AlertDialog alertDialog = this.mPopup;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void setAdapter(ListAdapter listAdapter) {
            this.mListAdapter = listAdapter;
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void setPromptText(CharSequence charSequence) {
            this.mPrompt = charSequence;
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public CharSequence getHintText() {
            return this.mPrompt;
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void show() {
            if (this.mListAdapter == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(SpinnerCompat.this.getContext());
            CharSequence charSequence = this.mPrompt;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            AlertDialog alertDialogCreate = builder.setSingleChoiceItems(this.mListAdapter, SpinnerCompat.this.getSelectedItemPosition(), this).create();
            this.mPopup = alertDialogCreate;
            alertDialogCreate.show();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SpinnerCompat.this.setSelection(i);
            if (SpinnerCompat.this.mOnItemClickListener != null) {
                SpinnerCompat.this.performItemClick(null, i, this.mListAdapter.getItemId(i));
            }
            dismiss();
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e(SpinnerCompat.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void setVerticalOffset(int i) {
            Log.e(SpinnerCompat.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void setHorizontalOffset(int i) {
            Log.e(SpinnerCompat.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
    }

    private class DropdownPopup extends ListPopupWindow implements SpinnerPopup {
        private ListAdapter mAdapter;
        private CharSequence mHintText;

        public DropdownPopup(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            setAnchorView(SpinnerCompat.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: mx_android.support.v7.internal.widget.SpinnerCompat.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j) {
                    SpinnerCompat.this.setSelection(i4);
                    if (SpinnerCompat.this.mOnItemClickListener != null) {
                        SpinnerCompat.this.performItemClick(view, i4, DropdownPopup.this.mAdapter.getItemId(i4));
                    }
                    DropdownPopup.this.dismiss();
                }
            });
        }

        @Override // mx_android.support.v7.widget.ListPopupWindow, mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.mAdapter = listAdapter;
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public CharSequence getHintText() {
            return this.mHintText;
        }

        @Override // mx_android.support.v7.internal.widget.SpinnerCompat.SpinnerPopup
        public void setPromptText(CharSequence charSequence) {
            this.mHintText = charSequence;
        }

        void computeContentWidth() {
            Drawable background = getBackground();
            int i = 0;
            if (background != null) {
                background.getPadding(SpinnerCompat.this.mTempRect);
                i = ViewUtils.isLayoutRtl(SpinnerCompat.this) ? SpinnerCompat.this.mTempRect.right : -SpinnerCompat.this.mTempRect.left;
            } else {
                Rect rect = SpinnerCompat.this.mTempRect;
                SpinnerCompat.this.mTempRect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = SpinnerCompat.this.getPaddingLeft();
            int paddingRight = SpinnerCompat.this.getPaddingRight();
            int width = SpinnerCompat.this.getWidth();
            if (SpinnerCompat.this.mDropDownWidth == -2) {
                int iMeasureContentWidth = SpinnerCompat.this.measureContentWidth((SpinnerAdapter) this.mAdapter, getBackground());
                int i4 = (SpinnerCompat.this.getContext().getResources().getDisplayMetrics().widthPixels - SpinnerCompat.this.mTempRect.left) - SpinnerCompat.this.mTempRect.right;
                if (iMeasureContentWidth > i4) {
                    iMeasureContentWidth = i4;
                }
                setContentWidth(Math.max(iMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (SpinnerCompat.this.mDropDownWidth == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(SpinnerCompat.this.mDropDownWidth);
            }
            setHorizontalOffset(ViewUtils.isLayoutRtl(SpinnerCompat.this) ? i + ((width - paddingRight) - getWidth()) : i + paddingLeft);
        }

        public void show(int i, int i4) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            computeContentWidth();
            setInputMethodMode(2);
            super.show();
            getListView().setChoiceMode(1);
            setSelection(SpinnerCompat.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = SpinnerCompat.this.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: mx_android.support.v7.internal.widget.SpinnerCompat.DropdownPopup.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    DropdownPopup.this.computeContentWidth();
                    DropdownPopup.super.show();
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: mx_android.support.v7.internal.widget.SpinnerCompat.DropdownPopup.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = SpinnerCompat.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }
    }
}
