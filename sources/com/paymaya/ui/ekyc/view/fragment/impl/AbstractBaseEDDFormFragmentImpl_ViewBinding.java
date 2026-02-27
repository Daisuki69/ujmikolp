package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.d;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import zd.C2559c;

/* JADX INFO: loaded from: classes4.dex */
public class AbstractBaseEDDFormFragmentImpl_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractBaseEDDFormFragmentImpl f14511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14512b;
    public View c;

    @UiThread
    public AbstractBaseEDDFormFragmentImpl_ViewBinding(AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl, View view) {
        this.f14511a = abstractBaseEDDFormFragmentImpl;
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.choose_one_edit_text_pma_fragment_edd_form, "field 'mEditTextChooseOne', method 'onChooseOneClick', and method 'onChooseOneFocused'");
        abstractBaseEDDFormFragmentImpl.mEditTextChooseOne = (EditText) Utils.castView(viewFindRequiredView, R.id.choose_one_edit_text_pma_fragment_edd_form, "field 'mEditTextChooseOne'", EditText.class);
        this.f14512b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new C2559c(abstractBaseEDDFormFragmentImpl, 0));
        viewFindRequiredView.setOnFocusChangeListener(new d(abstractBaseEDDFormFragmentImpl, 1));
        abstractBaseEDDFormFragmentImpl.mTextInputLayoutChooseOne = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.choose_one_text_input_layout_pma_fragment_edd_form, "field 'mTextInputLayoutChooseOne'", TextInputLayout.class);
        abstractBaseEDDFormFragmentImpl.mDynamicContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.dynamic_items_linear_layout_pma_fragment_edd_form, "field 'mDynamicContainer'", LinearLayout.class);
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.next_button_pma_fragment_pma_fragment_edd_form, "field 'mNextButton' and method 'onNextClick'");
        abstractBaseEDDFormFragmentImpl.mNextButton = (Button) Utils.castView(viewFindRequiredView2, R.id.next_button_pma_fragment_pma_fragment_edd_form, "field 'mNextButton'", Button.class);
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new C2559c(abstractBaseEDDFormFragmentImpl, 1));
        abstractBaseEDDFormFragmentImpl.mAddItemButton = Utils.findRequiredView(view, R.id.add_item_layout_pma_fragment_edd_form, "field 'mAddItemButton'");
        abstractBaseEDDFormFragmentImpl.mAddItemGroup = (Group) Utils.findRequiredViewAsType(view, R.id.add_item_group_pma_fragment_edd_form, "field 'mAddItemGroup'", Group.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl = this.f14511a;
        if (abstractBaseEDDFormFragmentImpl == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14511a = null;
        abstractBaseEDDFormFragmentImpl.mEditTextChooseOne = null;
        abstractBaseEDDFormFragmentImpl.mTextInputLayoutChooseOne = null;
        abstractBaseEDDFormFragmentImpl.mDynamicContainer = null;
        abstractBaseEDDFormFragmentImpl.mNextButton = null;
        abstractBaseEDDFormFragmentImpl.mAddItemButton = null;
        abstractBaseEDDFormFragmentImpl.mAddItemGroup = null;
        this.f14512b.setOnClickListener(null);
        this.f14512b.setOnFocusChangeListener(null);
        this.f14512b = null;
        this.c.setOnClickListener(null);
        this.c = null;
    }
}
