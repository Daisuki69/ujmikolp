package ha;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.widget.TextView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: ha.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1556i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBaseFragment f17003b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17004d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ MayaInputLayout f;

    public /* synthetic */ C1556i(MayaBaseFragment mayaBaseFragment, Object obj, Object obj2, Object obj3, MayaInputLayout mayaInputLayout, int i) {
        this.f17002a = i;
        this.f17003b = mayaBaseFragment;
        this.c = obj;
        this.f17004d = obj2;
        this.e = obj3;
        this.f = mayaInputLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MayaInputLayout mayaInputLayout = this.f;
        Object obj = this.e;
        MayaBaseFragment mayaBaseFragment = this.f17003b;
        Object obj2 = this.f17004d;
        Object obj3 = this.c;
        switch (this.f17002a) {
            case 0:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) mayaBaseFragment;
                m mVar = mayaPayBillsBIRFragment.f13391L0;
                UIComponent uIComponent = (UIComponent) obj3;
                if (mVar != null) {
                    String strPlaceholder = uIComponent.placeholder();
                    kotlin.jvm.internal.j.f(strPlaceholder, numX49.tnTj78("bSHW"));
                    ((MayaPayBillsActivity) mVar).a2(strPlaceholder, (String) obj, (List) obj2);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new androidx.work.impl.b(10, mayaPayBillsBIRFragment, uIComponent, mayaInputLayout), 500L);
                break;
            default:
                List list = MayaUnderWritingRequirementsFragment.f14251d0;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = (MayaUnderWritingRequirementsFragment) mayaBaseFragment;
                mayaUnderWritingRequirementsFragment.getClass();
                ((TextView) obj2).setVisibility(0);
                ((MayaProfileInputLayout) obj3).setVisibility(8);
                mayaUnderWritingRequirementsFragment.f2(false);
                mayaUnderWritingRequirementsFragment.f14257c0.e((FieldType) obj);
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) mayaInputLayout;
                Editable text = mayaProfileInputLayout.getInputEditText().getText();
                if (text != null) {
                    text.clear();
                }
                com.paymaya.common.utility.C.Q(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout.getInputEditText());
                break;
        }
        return Unit.f18162a;
    }
}
