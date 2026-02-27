package rc;

import N5.S0;
import a7.C0654o;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.ContactReferenceDisclaimer;
import com.paymaya.domain.model.ContactReferenceDisclaimerItem;
import com.paymaya.domain.model.ContactReferenceLearnMore;
import com.paymaya.domain.model.ProfileCmsData;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import wc.InterfaceC2393d;

/* JADX INFO: renamed from: rc.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2198e implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f19893b;

    public /* synthetic */ C2198e(i iVar, int i) {
        this.f19892a = i;
        this.f19893b = iVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f19892a) {
            case 0:
                ProfileCmsData profileCmsData = (ProfileCmsData) obj;
                kotlin.jvm.internal.j.g(profileCmsData, numX49.tnTj78("bFoL"));
                this.f19893b.f19902l = profileCmsData.getUpdateProfileCmsContentData();
                InterfaceC2393d interfaceC2393d = (InterfaceC2393d) this.f19893b.c.get();
                UpdateProfileCmsContentData updateProfileCmsContentData = profileCmsData.getUpdateProfileCmsContentData();
                MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) interfaceC2393d;
                mayaUserContactReferenceFragment.getClass();
                kotlin.jvm.internal.j.g(updateProfileCmsContentData, numX49.tnTj78("bFor"));
                ContactReferenceLearnMore contactReferenceLearnMore = updateProfileCmsContentData.getContactReferenceLearnMore();
                String string = mayaUserContactReferenceFragment.getString(R.string.maya_user_contact_reference_subtitle);
                String strTnTj78 = numX49.tnTj78("bFoZ");
                kotlin.jvm.internal.j.f(string, strTnTj78);
                String string2 = mayaUserContactReferenceFragment.getString(R.string.maya_user_contact_reference_learn_more);
                kotlin.jvm.internal.j.f(string2, strTnTj78);
                SpannableString spannableString = new SpannableString(androidx.camera.core.impl.a.j(string, numX49.tnTj78("bFok"), string2));
                C0654o c0654o = new C0654o(1, contactReferenceLearnMore, mayaUserContactReferenceFragment);
                int length = string.length();
                spannableString.setSpan(c0654o, length, androidx.media3.datasource.cache.c.b(length, 1, string2), 33);
                ((S0) mayaUserContactReferenceFragment.G1()).m.setText(spannableString);
                ((S0) mayaUserContactReferenceFragment.G1()).m.setMovementMethod(LinkMovementMethod.getInstance());
                ContactReferenceDisclaimer contactReferenceDisclaimer = updateProfileCmsContentData.getContactReferenceDisclaimer();
                if (contactReferenceDisclaimer != null) {
                    S0 s02 = (S0) mayaUserContactReferenceFragment.G1();
                    String header = contactReferenceDisclaimer.getHeader();
                    String strTnTj782 = numX49.tnTj78("bFoB");
                    if (header == null) {
                        header = strTnTj782;
                    }
                    s02.f3919n.setText(header);
                    S0 s03 = (S0) mayaUserContactReferenceFragment.G1();
                    String info = contactReferenceDisclaimer.getInfo();
                    if (info != null) {
                        strTnTj782 = info;
                    }
                    s03.f3918l.setText(strTnTj782);
                    List<ContactReferenceDisclaimerItem> items = contactReferenceDisclaimer.getItems();
                    if (items != null) {
                        for (ContactReferenceDisclaimerItem contactReferenceDisclaimerItem : items) {
                            View viewInflate = LayoutInflater.from(mayaUserContactReferenceFragment.getContext()).inflate(R.layout.item_view_bullet_point, (ViewGroup) null, false);
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                            int i = R.id.tv_bullet;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_bullet)) != null) {
                                i = R.id.tv_points;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_points);
                                if (textView != null) {
                                    textView.setText(contactReferenceDisclaimerItem.getInfo());
                                    ((S0) mayaUserContactReferenceFragment.G1()).f3916g.addView(linearLayoutCompat);
                                }
                            }
                            throw new NullPointerException(numX49.tnTj78("bFou").concat(viewInflate.getResources().getResourceName(i)));
                        }
                    }
                }
                this.f19893b.l();
                return;
            default:
                ContactModel contactModel = (ContactModel) obj;
                kotlin.jvm.internal.j.g(contactModel, numX49.tnTj78("bFo2"));
                i.p(this.f19893b, contactModel);
                return;
        }
    }
}
