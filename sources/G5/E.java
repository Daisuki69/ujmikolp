package G5;

import android.text.InputFilter;
import android.text.Spanned;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1720b;

    public /* synthetic */ E(Object obj, int i) {
        this.f1719a = i;
        this.f1720b = obj;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i4, Spanned spanned, int i6, int i10) {
        switch (this.f1719a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) spanned);
                sb2.append((Object) charSequence);
                if (((zj.o) this.f1720b).e(sb2.toString())) {
                    return null;
                }
                return "";
            case 1:
                ((NewMayaCreditEnhancedActivationFragment) this.f1720b).H1();
                String strValueOf = String.valueOf(spanned);
                String strValueOf2 = String.valueOf(charSequence);
                String strConcat = strValueOf.concat(strValueOf2);
                if (!AbstractC1213b.U("^[0-9 \\s]{0,13}$", strConcat)) {
                    return "";
                }
                if ((strConcat.length() == 4 || strConcat.length() == 8) && !strValueOf2.equals("")) {
                    return strValueOf2.concat(Global.BLANK);
                }
                return null;
            default:
                ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) this.f1720b).G1();
                String strValueOf3 = String.valueOf(spanned);
                String strValueOf4 = String.valueOf(charSequence);
                String strConcat2 = strValueOf3.concat(strValueOf4);
                if (!AbstractC1213b.U("^[0-9 \\s]{0,13}$", strConcat2)) {
                    return "";
                }
                if ((strConcat2.length() == 4 || strConcat2.length() == 8) && !strValueOf4.equals("")) {
                    return strValueOf4.concat(Global.BLANK);
                }
                return null;
        }
    }
}
