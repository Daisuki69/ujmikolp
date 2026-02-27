package com.paymaya.ui.ekyc.view.fragment.impl;

import E8.D;
import G5.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import cj.C1129o;
import cj.M;
import cj.t;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import rd.InterfaceC2200a;
import sd.AbstractC2252a;
import yd.InterfaceC2528a;
import zd.C2557a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBaseEDDFormFragmentImpl<V> extends BaseFragment implements InterfaceC2528a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public AlertDialog f14505S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f14507U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final HashMap[] f14510X;

    @BindView(R.id.add_item_layout_pma_fragment_edd_form)
    public View mAddItemButton;

    @BindView(R.id.add_item_group_pma_fragment_edd_form)
    public Group mAddItemGroup;

    @BindView(R.id.dynamic_items_linear_layout_pma_fragment_edd_form)
    public LinearLayout mDynamicContainer;

    @BindView(R.id.choose_one_edit_text_pma_fragment_edd_form)
    public EditText mEditTextChooseOne;

    @BindView(R.id.next_button_pma_fragment_pma_fragment_edd_form)
    public Button mNextButton;

    @BindView(R.id.choose_one_text_input_layout_pma_fragment_edd_form)
    public TextInputLayout mTextInputLayoutChooseOne;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f14506T = -1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ArrayList f14508V = new ArrayList();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C2557a f14509W = new C2557a(this);

    public AbstractBaseEDDFormFragmentImpl() {
        HashMap[] mapArr = new HashMap[2];
        for (int i = 0; i < 2; i++) {
            mapArr[i] = M.g(new Pair("", ""));
        }
        this.f14510X = mapArr;
        mapArr[0] = M.g(new Pair("choice", "Yes"));
        mapArr[1] = M.g(new Pair("choice", "N/A (Not Applicable)"));
    }

    @OnClick({R.id.choose_one_edit_text_pma_fragment_edd_form})
    public void onChooseOneClick() {
        AlertDialog alertDialog = this.f14505S;
        if (alertDialog != null) {
            alertDialog.show();
        }
    }

    @OnFocusChange({R.id.choose_one_edit_text_pma_fragment_edd_form})
    public void onChooseOneFocused(EditText editText, boolean z4) {
        AlertDialog alertDialog;
        j.g(editText, "editText");
        if (!z4 || (alertDialog = this.f14505S) == null) {
            return;
        }
        alertDialog.show();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_form, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ArrayList<Object> arrayList = this.f14508V;
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        for (Object obj : arrayList) {
            LinearLayout linearLayoutS1 = s1();
            j.e(obj, "null cannot be cast to non-null type android.view.View");
            linearLayoutS1.removeView((View) obj);
            arrayList2.add(Unit.f18162a);
        }
        super.onDestroyView();
    }

    @OnClick({R.id.next_button_pma_fragment_pma_fragment_edd_form})
    public void onNextClick() {
        this.f14507U = true;
        u1().a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        j.g(outState, "outState");
        outState.putInt("choice", this.f14506T);
        w1(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        ArrayList arrayList = new ArrayList();
        C1129o.y(this.f14510X, arrayList);
        SimpleAdapter simpleAdapter = new SimpleAdapter(context, arrayList, R.layout.pma_view_spinner_single_item, new String[]{"choice"}, new int[]{R.id.pma_view_spinner_single_item_text_view_item});
        Context context2 = getContext();
        this.f14505S = context2 != null ? new AlertDialog.Builder(context2).setAdapter(simpleAdapter, new D(this, 9)).create() : null;
        if (bundle == null) {
            v1();
            EditText editTextT1 = t1();
            TextInputLayout textInputLayout = this.mTextInputLayoutChooseOne;
            if (textInputLayout == null) {
                j.n("mTextInputLayoutChooseOne");
                throw null;
            }
            l lVar = new l(textInputLayout);
            lVar.f1751b = new C2557a(this);
            lVar.c = this.f14509W;
            editTextT1.addTextChangedListener(lVar);
            this.f14508V = new ArrayList();
            s1().removeAllViews();
            i(null, false);
            return;
        }
        this.f14506T = bundle.getInt("choice", -1);
        AbstractC2252a abstractC2252a = (AbstractC2252a) u1();
        int i = ((AbstractBaseEDDFormFragmentImpl) abstractC2252a.o()).f14506T;
        if (i == 0) {
            ((AbstractBaseEDDFormFragmentImpl) abstractC2252a.o()).x1();
            AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl = (AbstractBaseEDDFormFragmentImpl) abstractC2252a.o();
            Group group = abstractBaseEDDFormFragmentImpl.mAddItemGroup;
            if (group == null) {
                j.n("mAddItemGroup");
                throw null;
            }
            group.setVisibility(0);
            View view2 = abstractBaseEDDFormFragmentImpl.mAddItemButton;
            if (view2 == null) {
                j.n("mAddItemButton");
                throw null;
            }
            view2.setVisibility(0);
        } else if (i != 1) {
            ((AbstractBaseEDDFormFragmentImpl) abstractC2252a.o()).t1().setText("");
            ((AbstractBaseEDDFormFragmentImpl) abstractC2252a.o()).v1();
        } else {
            AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl2 = (AbstractBaseEDDFormFragmentImpl) abstractC2252a.o();
            abstractBaseEDDFormFragmentImpl2.f14506T = 1;
            abstractBaseEDDFormFragmentImpl2.t1().setText((CharSequence) abstractBaseEDDFormFragmentImpl2.f14510X[1].get("choice"));
            ((AbstractBaseEDDFormFragmentImpl) abstractC2252a.o()).v1();
        }
        if (bundle.get("items") != null && this.f14508V.isEmpty()) {
            Object obj = bundle.get("items");
            j.d(obj);
            List list = (List) obj;
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                i(list.get(i4), i4 != 0);
                i4++;
            }
            return;
        }
        ArrayList<Object> arrayList2 = this.f14508V;
        ArrayList arrayList3 = new ArrayList(t.l(arrayList2, 10));
        for (Object obj2 : arrayList2) {
            LinearLayout linearLayoutS1 = s1();
            j.e(obj2, "null cannot be cast to non-null type android.view.View");
            linearLayoutS1.addView((View) obj2);
            arrayList3.add(Unit.f18162a);
        }
    }

    public final boolean r1() {
        ArrayList arrayList = this.f14508V;
        if (!(arrayList != null) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Bd.j) it.next()).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final LinearLayout s1() {
        LinearLayout linearLayout = this.mDynamicContainer;
        if (linearLayout != null) {
            return linearLayout;
        }
        j.n("mDynamicContainer");
        throw null;
    }

    public final EditText t1() {
        EditText editText = this.mEditTextChooseOne;
        if (editText != null) {
            return editText;
        }
        j.n("mEditTextChooseOne");
        throw null;
    }

    public abstract InterfaceC2200a u1();

    public final void v1() {
        Group group = this.mAddItemGroup;
        if (group == null) {
            j.n("mAddItemGroup");
            throw null;
        }
        group.setVisibility(8);
        View view = this.mAddItemButton;
        if (view != null) {
            view.setVisibility(8);
        } else {
            j.n("mAddItemButton");
            throw null;
        }
    }

    public abstract void w1(Bundle bundle);

    public final void x1() {
        this.f14506T = 0;
        t1().setText((CharSequence) this.f14510X[0].get("choice"));
    }

    public final void y1() {
        TextInputLayout textInputLayout = this.mTextInputLayoutChooseOne;
        if (textInputLayout == null) {
            j.n("mTextInputLayoutChooseOne");
            throw null;
        }
        textInputLayout.setHintEnabled(false);
        TextInputLayout textInputLayout2 = this.mTextInputLayoutChooseOne;
        if (textInputLayout2 != null) {
            textInputLayout2.setError(getString(R.string.pma_error_missing_this_field_p));
        } else {
            j.n("mTextInputLayoutChooseOne");
            throw null;
        }
    }
}
