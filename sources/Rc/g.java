package rc;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.Name;
import com.paymaya.domain.model.UserProfileContactReference;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import dOYHB6.tiZVw8.numX49;
import wc.InterfaceC2393d;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f19897b;

    public /* synthetic */ g(i iVar, int i) {
        this.f19896a = i;
        this.f19897b = iVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        String lastName;
        String middleName;
        String firstName;
        Boolean hasNoMiddleName;
        switch (this.f19896a) {
            case 0:
                MayaUpdateProfileData mayaUpdateProfileData = (MayaUpdateProfileData) obj;
                kotlin.jvm.internal.j.g(mayaUpdateProfileData, numX49.tnTj78("bFo6"));
                UserProfileContactReference profileContactReference = mayaUpdateProfileData.getProfileContactReference();
                if (profileContactReference != null) {
                    i iVar = this.f19897b;
                    iVar.getClass();
                    Name name = profileContactReference.getName();
                    if (name != null && (hasNoMiddleName = name.getHasNoMiddleName()) != null) {
                        ((MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get())).b2().setChecked(hasNoMiddleName.booleanValue());
                    }
                    Name name2 = profileContactReference.getName();
                    if (name2 != null && (firstName = name2.getFirstName()) != null) {
                        MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get());
                        mayaUserContactReferenceFragment.h2(mayaUserContactReferenceFragment.X1(), firstName);
                    }
                    Name name3 = profileContactReference.getName();
                    if (name3 != null && (middleName = name3.getMiddleName()) != null) {
                        MayaUserContactReferenceFragment mayaUserContactReferenceFragment2 = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get());
                        mayaUserContactReferenceFragment2.h2(mayaUserContactReferenceFragment2.a2(), middleName);
                    }
                    Name name4 = profileContactReference.getName();
                    if (name4 != null && (lastName = name4.getLastName()) != null) {
                        MayaUserContactReferenceFragment mayaUserContactReferenceFragment3 = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get());
                        mayaUserContactReferenceFragment3.h2(mayaUserContactReferenceFragment3.Y1(), lastName);
                    }
                    String relationship = profileContactReference.getRelationship();
                    if (relationship != null) {
                        iVar.s(relationship);
                    }
                    String mobileNumber = profileContactReference.getMobileNumber();
                    if (mobileNumber != null) {
                        MayaUserContactReferenceFragment mayaUserContactReferenceFragment4 = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get());
                        mayaUserContactReferenceFragment4.h2(mayaUserContactReferenceFragment4.c2(), z.t(mobileNumber, numX49.tnTj78("bFoX"), numX49.tnTj78("bFoa")));
                    }
                }
                ((MayaBaseFragment) ((InterfaceC2393d) this.f19897b.c.get())).w1();
                break;
            default:
                kotlin.jvm.internal.j.g((io.reactivex.rxjava3.disposables.b) obj, numX49.tnTj78("bFoN"));
                this.f19897b.e(new io.reactivex.rxjava3.disposables.b[0]);
                break;
        }
    }
}
