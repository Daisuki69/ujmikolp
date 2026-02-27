package sd;

import android.app.AlertDialog;
import android.database.Cursor;
import androidx.constraintlayout.widget.Group;
import bg.AbstractC0983W;
import cj.C1112C;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.data.database.repository.C1238b;
import com.paymaya.domain.model.AccountUsage;
import com.paymaya.domain.model.EDDUsage;
import com.paymaya.domain.store.C1255e;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDAccountUsageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.j;
import v0.C2333a;
import y5.AbstractC2509a;
import yc.C2525f;
import yd.InterfaceC2529b;
import zj.C2576A;

/* JADX INFO: renamed from: sd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2253b extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1255e f20036d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AccountUsage f20037g;

    public C2253b(C1255e c1255e) {
        this.f20036d = c1255e;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        List listUnmodifiableList;
        int i = 1;
        super.j();
        InterfaceC2529b interfaceC2529b = (InterfaceC2529b) this.c.get();
        C1238b c1238b = this.f20036d.f11436b;
        c1238b.getClass();
        Xe.d dVar = c1238b.f11304a.f2812a;
        String strTnTj78 = numX49.tnTj78("bFGc");
        Cursor cursorQuery = dVar.query(String.format(numX49.tnTj78("bFGD"), Arrays.copyOf(new Object[]{numX49.tnTj78("bFGm"), strTnTj78}, 2)));
        j.d(cursorQuery);
        if (cursorQuery.moveToFirst()) {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            int columnIndex = cursorQuery.getColumnIndex(strTnTj78);
            int columnIndex2 = cursorQuery.getColumnIndex(numX49.tnTj78("bFGh"));
            do {
                String string = cursorQuery.getString(columnIndex);
                j.f(string, numX49.tnTj78("bFGM"));
                arrayList.add(new AccountUsage(string, cursorQuery.getInt(columnIndex2) == 1));
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            j.d(listUnmodifiableList);
        } else {
            cursorQuery.close();
            listUnmodifiableList = C1112C.f9377a;
        }
        EDDAccountUsageFragment eDDAccountUsageFragment = (EDDAccountUsageFragment) interfaceC2529b;
        eDDAccountUsageFragment.getClass();
        j.g(listUnmodifiableList, numX49.tnTj78("bFGN"));
        com.paymaya.common.adapter.a aVar = new com.paymaya.common.adapter.a(eDDAccountUsageFragment.requireContext(), listUnmodifiableList, new C2333a(3));
        AlertDialog.Builder builder = new AlertDialog.Builder(eDDAccountUsageFragment.requireActivity());
        builder.setSingleChoiceItems(aVar, -1, new c9.c(i, eDDAccountUsageFragment, aVar));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.getListView().setChoiceMode(1);
        eDDAccountUsageFragment.f14515U = alertDialogCreate;
        EDDAccountUsageFragment eDDAccountUsageFragment2 = (EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get());
        eDDAccountUsageFragment2.getClass();
        C2525f c2525f = new C2525f(eDDAccountUsageFragment2, 5);
        TextInputEditText textInputEditText = eDDAccountUsageFragment2.mPrimaryUseEditText;
        if (textInputEditText == null) {
            j.n(numX49.tnTj78("bFGg"));
            throw null;
        }
        TextInputLayout textInputLayout = eDDAccountUsageFragment2.mPrimaryUseTextInputLayout;
        if (textInputLayout == null) {
            j.n(numX49.tnTj78("bFG0"));
            throw null;
        }
        AbstractC0983W.d(textInputEditText, textInputLayout, new Ta.a(0, eDDAccountUsageFragment2, EDDAccountUsageFragment.class, numX49.tnTj78("bFGa"), numX49.tnTj78("bFG6"), 0, 6), c2525f);
        TextInputEditText textInputEditText2 = eDDAccountUsageFragment2.mPrimaryUseOtherEditText;
        if (textInputEditText2 == null) {
            j.n(numX49.tnTj78("bFGp"));
            throw null;
        }
        AbstractC0983W.d(textInputEditText2, eDDAccountUsageFragment2.s1(), new Ta.a(0, eDDAccountUsageFragment2, EDDAccountUsageFragment.class, numX49.tnTj78("bFGG"), numX49.tnTj78("bFGX"), 0, 7), c2525f);
        TextInputEditText textInputEditText3 = eDDAccountUsageFragment2.mRemittanceEditText;
        if (textInputEditText3 == null) {
            j.n(numX49.tnTj78("bFGR"));
            throw null;
        }
        TextInputLayout textInputLayout2 = eDDAccountUsageFragment2.mRemittanceTextInputLayout;
        if (textInputLayout2 == null) {
            j.n(numX49.tnTj78("bFGT"));
            throw null;
        }
        AbstractC0983W.d(textInputEditText3, textInputLayout2, new Ta.a(0, eDDAccountUsageFragment2, EDDAccountUsageFragment.class, numX49.tnTj78("bFGy"), numX49.tnTj78("bFG3"), 0, 8), c2525f);
        TextInputEditText textInputEditText4 = eDDAccountUsageFragment2.mPurposeEditText;
        if (textInputEditText4 == null) {
            j.n(numX49.tnTj78("bFGY"));
            throw null;
        }
        TextInputLayout textInputLayout3 = eDDAccountUsageFragment2.mPurposeTextInputLayout;
        if (textInputLayout3 != null) {
            AbstractC0983W.d(textInputEditText4, textInputLayout3, new Ta.a(0, eDDAccountUsageFragment2, EDDAccountUsageFragment.class, numX49.tnTj78("bFG7"), numX49.tnTj78("bFGv"), 0, 9), c2525f);
        } else {
            j.n(numX49.tnTj78("bFGA"));
            throw null;
        }
    }

    public final EDDUsage k() {
        String name;
        boolean zL = l();
        String strTnTj78 = numX49.tnTj78("bFGf");
        if (zL) {
            TextInputEditText textInputEditText = ((EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get())).mPrimaryUseEditText;
            if (textInputEditText == null) {
                j.n(strTnTj78);
                throw null;
            }
            String strValueOf = String.valueOf(textInputEditText.getText());
            TextInputEditText textInputEditText2 = ((EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get())).mRemittanceEditText;
            if (textInputEditText2 == null) {
                j.n(numX49.tnTj78("bFGn"));
                throw null;
            }
            String string = C2576A.b0(String.valueOf(textInputEditText2.getText())).toString();
            TextInputEditText textInputEditText3 = ((EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get())).mPurposeEditText;
            if (textInputEditText3 != null) {
                return new EDDUsage(strValueOf, string, C2576A.b0(String.valueOf(textInputEditText3.getText())).toString());
            }
            j.n(numX49.tnTj78("bFG1"));
            throw null;
        }
        AccountUsage accountUsage = this.f20037g;
        if (!((accountUsage == null || (name = accountUsage.getName()) == null) ? false : C2576A.x(name, numX49.tnTj78("bFGx"), true))) {
            TextInputEditText textInputEditText4 = ((EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get())).mPrimaryUseEditText;
            if (textInputEditText4 != null) {
                return new EDDUsage(String.valueOf(textInputEditText4.getText()), null, null, 6, null);
            }
            j.n(strTnTj78);
            throw null;
        }
        TextInputEditText textInputEditText5 = ((EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get())).mPrimaryUseOtherEditText;
        if (textInputEditText5 == null) {
            j.n(numX49.tnTj78("bFG5"));
            throw null;
        }
        String string2 = C2576A.b0(String.valueOf(textInputEditText5.getText())).toString();
        if (string2 == null) {
            string2 = numX49.tnTj78("bFGs");
        }
        return new EDDUsage(string2, null, null, 6, null);
    }

    public final boolean l() {
        String name;
        AccountUsage accountUsage = this.f20037g;
        if (accountUsage != null ? accountUsage.getRequiresDetails() : false) {
            AccountUsage accountUsage2 = this.f20037g;
            if ((accountUsage2 == null || (name = accountUsage2.getName()) == null) ? false : C2576A.x(name, numX49.tnTj78("bFGJ"), true)) {
                return true;
            }
        }
        return false;
    }

    public final void m(AccountUsage accountUsage) {
        String name;
        this.f20037g = accountUsage;
        InterfaceC2529b interfaceC2529b = (InterfaceC2529b) this.c.get();
        String name2 = accountUsage.getName();
        EDDAccountUsageFragment eDDAccountUsageFragment = (EDDAccountUsageFragment) interfaceC2529b;
        eDDAccountUsageFragment.getClass();
        j.g(name2, numX49.tnTj78("bFGI"));
        TextInputEditText textInputEditText = eDDAccountUsageFragment.mPrimaryUseEditText;
        if (textInputEditText == null) {
            j.n(numX49.tnTj78("bFGl"));
            throw null;
        }
        textInputEditText.setText(name2);
        boolean zL = l();
        String strTnTj78 = numX49.tnTj78("bFGq");
        if (zL) {
            this.e = false;
            this.f = true;
            EDDAccountUsageFragment eDDAccountUsageFragment2 = (EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get());
            eDDAccountUsageFragment2.s1().setVisibility(8);
            Group group = eDDAccountUsageFragment2.mRemittanceGroup;
            if (group != null) {
                group.setVisibility(0);
                return;
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
        AccountUsage accountUsage2 = this.f20037g;
        if ((accountUsage2 == null || (name = accountUsage2.getName()) == null) ? false : C2576A.x(name, numX49.tnTj78("bFGz"), true)) {
            this.e = true;
            this.f = false;
            EDDAccountUsageFragment eDDAccountUsageFragment3 = (EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get());
            eDDAccountUsageFragment3.s1().setVisibility(0);
            Group group2 = eDDAccountUsageFragment3.mRemittanceGroup;
            if (group2 != null) {
                group2.setVisibility(8);
                return;
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
        this.e = false;
        this.f = false;
        EDDAccountUsageFragment eDDAccountUsageFragment4 = (EDDAccountUsageFragment) ((InterfaceC2529b) this.c.get());
        eDDAccountUsageFragment4.s1().setVisibility(8);
        Group group3 = eDDAccountUsageFragment4.mRemittanceGroup;
        if (group3 != null) {
            group3.setVisibility(8);
        } else {
            j.n(strTnTj78);
            throw null;
        }
    }
}
