package eb;

import N5.C;
import S1.r;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.paymaya.domain.model.FieldType;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaAccountCreationFragment f16629b;

    public /* synthetic */ c(MayaAccountCreationFragment mayaAccountCreationFragment, int i) {
        this.f16628a = i;
        this.f16629b = mayaAccountCreationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MayaAccountCreationFragment mayaAccountCreationFragment = this.f16629b;
        String strTnTj78 = numX49.tnTj78("bi9bm");
        switch (this.f16628a) {
            case 0:
                String str = (String) obj;
                kotlin.jvm.internal.j.g(str, strTnTj78);
                if (str.length() < 2) {
                    C c = mayaAccountCreationFragment.f13677V;
                    kotlin.jvm.internal.j.d(c);
                    ((AppCompatCheckBox) c.f3564n).setVisibility(0);
                } else {
                    C c10 = mayaAccountCreationFragment.f13677V;
                    kotlin.jvm.internal.j.d(c10);
                    ((AppCompatCheckBox) c10.f3564n).setChecked(false);
                    C c11 = mayaAccountCreationFragment.f13677V;
                    kotlin.jvm.internal.j.d(c11);
                    ((AppCompatCheckBox) c11.f3564n).setVisibility(8);
                }
                return Unit.f18162a;
            default:
                Pair pair = (Pair) obj;
                kotlin.jvm.internal.j.g(pair, strTnTj78);
                Wa.a aVarI1 = mayaAccountCreationFragment.I1();
                FieldType fieldType = (FieldType) pair.f18161b;
                List list = MayaUserProfileUpdateFragment.f14261f0;
                Object obj2 = pair.f18160a;
                return new Pair(obj2, ((Xa.b) aVarI1).k(fieldType, r.i((MayaProfileInputLayout) obj2)));
        }
    }
}
