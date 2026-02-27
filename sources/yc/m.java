package yc;

import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21122a;

    public /* synthetic */ m(int i) {
        this.f21122a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strTnTj78 = numX49.tnTj78("bt9E");
        String strTnTj782 = numX49.tnTj78("bt9F");
        String strTnTj783 = numX49.tnTj78("bt9H");
        switch (this.f21122a) {
            case 0:
                kotlin.jvm.internal.j.g((Pair) obj, strTnTj78);
                return Boolean.valueOf(!kotlin.jvm.internal.j.b((UpdateProfileValidationResult) r7.f18161b, UpdateProfileValidationResult.Success.INSTANCE));
            case 1:
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) obj;
                kotlin.jvm.internal.j.g(mayaProfileInputLayout, strTnTj783);
                if (mayaProfileInputLayout.getVisibility() == 0 && mayaProfileInputLayout.isEnabled() && (mayaProfileInputLayout.getTag() instanceof UpdateProfileFieldType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) obj;
                kotlin.jvm.internal.j.g(mayaProfileInputLayout2, strTnTj783);
                Object tag = mayaProfileInputLayout2.getTag();
                kotlin.jvm.internal.j.e(tag, strTnTj782);
                return new Pair(mayaProfileInputLayout2, (UpdateProfileFieldType) tag);
            case 3:
                MayaDropDown mayaDropDown = (MayaDropDown) obj;
                List list = MayaUserProfileUpdateFragment.f14261f0;
                kotlin.jvm.internal.j.g(mayaDropDown, strTnTj783);
                if (mayaDropDown.getVisibility() == 0 && mayaDropDown.isEnabled() && (mayaDropDown.getTag() instanceof UpdateProfileFieldType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                MayaDropDown mayaDropDown2 = (MayaDropDown) obj;
                List list2 = MayaUserProfileUpdateFragment.f14261f0;
                kotlin.jvm.internal.j.g(mayaDropDown2, strTnTj783);
                Object tag2 = mayaDropDown2.getTag();
                kotlin.jvm.internal.j.e(tag2, strTnTj782);
                return new Pair(mayaDropDown2, (UpdateProfileFieldType) tag2);
            case 5:
                List list3 = MayaUserProfileUpdateFragment.f14261f0;
                kotlin.jvm.internal.j.g((Pair) obj, strTnTj78);
                return Boolean.valueOf(!kotlin.jvm.internal.j.b((UpdateProfileValidationResult) r7.f18161b, UpdateProfileValidationResult.Success.INSTANCE));
            case 6:
                MayaProfileInputLayout mayaProfileInputLayout3 = (MayaProfileInputLayout) obj;
                List list4 = MayaUserProfileUpdateFragment.f14261f0;
                kotlin.jvm.internal.j.g(mayaProfileInputLayout3, strTnTj783);
                if (mayaProfileInputLayout3.getVisibility() == 0 && mayaProfileInputLayout3.isEnabled() && (mayaProfileInputLayout3.getTag() instanceof UpdateProfileFieldType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                MayaProfileInputLayout mayaProfileInputLayout4 = (MayaProfileInputLayout) obj;
                List list5 = MayaUserProfileUpdateFragment.f14261f0;
                kotlin.jvm.internal.j.g(mayaProfileInputLayout4, strTnTj783);
                Object tag3 = mayaProfileInputLayout4.getTag();
                kotlin.jvm.internal.j.e(tag3, strTnTj782);
                return new Pair(mayaProfileInputLayout4, (UpdateProfileFieldType) tag3);
            case 8:
                List list6 = MayaUserProfileUpdateFragment.f14261f0;
                kotlin.jvm.internal.j.g((Pair) obj, strTnTj78);
                return Boolean.valueOf(!kotlin.jvm.internal.j.b((UpdateProfileValidationResult) r7.f18161b, UpdateProfileValidationResult.Success.INSTANCE));
            case 9:
                kotlin.jvm.internal.j.g((Pair) obj, strTnTj78);
                return Boolean.valueOf(!kotlin.jvm.internal.j.b((UpdateProfileValidationResult) r7.f18161b, UpdateProfileValidationResult.Success.INSTANCE));
            case 10:
                MayaProfileInputLayout mayaProfileInputLayout5 = (MayaProfileInputLayout) obj;
                kotlin.jvm.internal.j.g(mayaProfileInputLayout5, strTnTj783);
                if (mayaProfileInputLayout5.getVisibility() == 0 && mayaProfileInputLayout5.isEnabled() && (mayaProfileInputLayout5.getTag() instanceof UpdateProfileFieldType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                MayaProfileInputLayout mayaProfileInputLayout6 = (MayaProfileInputLayout) obj;
                kotlin.jvm.internal.j.g(mayaProfileInputLayout6, strTnTj783);
                Object tag4 = mayaProfileInputLayout6.getTag();
                kotlin.jvm.internal.j.e(tag4, strTnTj782);
                return new Pair(mayaProfileInputLayout6, (UpdateProfileFieldType) tag4);
            case 12:
                kotlin.jvm.internal.j.g((Pair) obj, strTnTj78);
                return Boolean.valueOf(!kotlin.jvm.internal.j.b((UpdateProfileValidationResult) r7.f18161b, UpdateProfileValidationResult.Success.INSTANCE));
            case 13:
                MayaDropDown mayaDropDown3 = (MayaDropDown) obj;
                kotlin.jvm.internal.j.g(mayaDropDown3, strTnTj783);
                if (mayaDropDown3.getVisibility() == 0 && mayaDropDown3.isEnabled() && (mayaDropDown3.getTag() instanceof UpdateProfileFieldType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                MayaDropDown mayaDropDown4 = (MayaDropDown) obj;
                kotlin.jvm.internal.j.g(mayaDropDown4, strTnTj783);
                Object tag5 = mayaDropDown4.getTag();
                kotlin.jvm.internal.j.e(tag5, strTnTj782);
                return new Pair(mayaDropDown4, (UpdateProfileFieldType) tag5);
            case 15:
                Sequence sequence = (Sequence) obj;
                kotlin.jvm.internal.j.g(sequence, strTnTj783);
                return sequence.iterator();
            case 16:
                Iterable iterable = (Iterable) obj;
                kotlin.jvm.internal.j.g(iterable, strTnTj783);
                return iterable.iterator();
            case 17:
                return obj;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
